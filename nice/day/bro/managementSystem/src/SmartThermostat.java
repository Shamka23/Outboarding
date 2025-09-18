public class SmartThermostat extends IoTDevice{
    private double temperature;

    public SmartThermostat(int id, String name, double temperature) {
        super(id, name);
        this.temperature = temperature;
    }

    @Override
    public void performAction() {
        System.out.println("Нынешняя температура равна " + temperature);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
