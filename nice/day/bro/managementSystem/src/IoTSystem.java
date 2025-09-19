public class IoTSystem {
    public static void main(String[] args) {
        IoTDevice[] array = {
                new SmartLight(1, "Свет", true),
                new SmartThermostat(2, "Градусник", 36.6)
        };

        cycleFor(array);
        SmartThermostat smartThermostat = (SmartThermostat) array[1];
        smartThermostat.setTemperature(150);
        cycleFor(array);
    }
    private static void cycleFor(IoTDevice[] array){
        for (IoTDevice ioTDevice : array) {
            ioTDevice.performAction();
        }
    }
}
