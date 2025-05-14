public class Main {
    public static void main(String[] args) {
        Charger oldCharger = new Charger();
        UsbCharger usbCharger = new ChargerAdapter(oldCharger);

        usbCharger.chargeWithUsb();
    }
}