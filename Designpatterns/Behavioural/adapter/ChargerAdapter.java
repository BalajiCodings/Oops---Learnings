class ChargerAdapter implements UsbCharger {
    private Charger oldCharger;

    public ChargerAdapter(Charger oldCharger) {
        this.oldCharger = oldCharger;
    }

    public void chargeWithUsb() {
        System.out.println("Adapter converts usb to pin...");
        oldCharger.chargeWithPin();
    }
}