import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set


    open val deviceType = "unknown"

    open fun turnOn(): Boolean {
        if(deviceStatus == "online" || deviceStatus == "off"){
            deviceStatus = "on"
            return true
        }else{
            println("you $name is already on.")
            return false
        }
    }

    open fun turnOff(): Boolean {
        if(deviceStatus == "on"){
            deviceStatus = "off"
            return true
        }else {
            println("your $name is already off.")
            return false
        }
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        if(deviceStatus == "on"){
            speakerVolume++
            println("Speaker volume increased to $speakerVolume.")
        }else{
            println("device is off")
        }
    }

    fun decreaseSpeakerVolume() {
        if(deviceStatus == "on"){
            speakerVolume--
            println("Speaker volume decreased to $speakerVolume.")
        }else{
            println("device is off")
        }
    }

    fun nextChannel() {
        if(deviceStatus == "on"){
            channelNumber++
            println("Channel number increased to $channelNumber.")
        }else{
            println("device is off")
        }
    }

    fun previousChannel() {
        if(deviceStatus == "on"){
            channelNumber--
            println("Channel number increased to $channelNumber.")
        }else{
            println("device is off")
        }
    }

    override fun turnOn(): Boolean {

        if(super.turnOn()){
            println(
                "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                        "set to $channelNumber."
            )
            return true
        }else
            return false
    }

    override fun turnOff(): Boolean {
        if(super.turnOff()){
            println("$name turned off")
            return true
        }else
            return false

    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        if(deviceStatus == "on"){
            brightnessLevel++
            println("Brightness increased to $brightnessLevel.")
        }else{
            println("device is off")
        }
    }

    fun decreaseBrightness() {
        if(deviceStatus == "on"){
            brightnessLevel--
            println("Brightness decreased to $brightnessLevel.")
        }else{
            println("device is off")
        }

    }

    override fun turnOn(): Boolean {
        if(super.turnOn()){
            brightnessLevel = 2
            println("$name turned on. The brightness level is $brightnessLevel.")
            return true
        }else
            return false
    }

    override fun turnOff(): Boolean {
        if(super.turnOff()){
            brightnessLevel = 0
            println("Smart Light turned off")
            return true
        }else{
            return false
        }

    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        if(smartTvDevice.turnOn()){
            deviceTurnOnCount++
        }
    }

    fun turnOffTv() {
        if(smartTvDevice.turnOff()){
            deviceTurnOnCount--
        }
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun decreaseTvVolume() {
        smartTvDevice.decreaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun changeTvChannelToPrevious() {
        smartTvDevice.previousChannel()
    }

    fun turnOnLight() {
        if(smartLightDevice.turnOn()){
            deviceTurnOnCount++
        }
    }

    fun turnOffLight() {
        if(smartLightDevice.turnOff()){
            deviceTurnOnCount--
        }
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun decreaseLightBrightness() {
        smartLightDevice.decreaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    var smartTvDevice = SmartTvDevice("Android TV", "Entertainment")
    smartTvDevice.turnOn()
    smartTvDevice.increaseSpeakerVolume()
    smartTvDevice.decreaseSpeakerVolume()
    smartTvDevice.nextChannel()
    smartTvDevice.previousChannel()

    var smartLightDevice = SmartLightDevice("Google Light", "Utility")
    smartLightDevice.turnOn()
    smartLightDevice.increaseBrightness()
    smartLightDevice.decreaseBrightness()
}
