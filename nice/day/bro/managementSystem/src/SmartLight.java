public class SmartLight extends IoTDevice{
    private boolean isOn;

    public SmartLight(int id, String name, boolean isOn) {
        super(id, name);
        this.isOn = isOn;
    }

    @Override
    public void performAction() {
        if (isOn){
            System.out.println("Умный свет включен");
        } else {
            System.out.println("Умный свет выключен");
        }
    }
}
