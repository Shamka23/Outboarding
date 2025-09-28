package management.system;

public class IoTDevice {
    private int id;
    private String name;

    public IoTDevice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void performAction() {
        System.out.println("Performing action for device: " + name);
    }

    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight(1, "Свет", true);
        SmartThermostat smartThermostat = new SmartThermostat(2, "Градусник", 36.6);

        smartLight.performAction();
        smartThermostat.performAction();

        smartThermostat.setTemperature(150.6);

        smartThermostat.performAction();
    }
}
