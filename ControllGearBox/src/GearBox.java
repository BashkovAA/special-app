public class GearBox {
    /**
     * 0 - neatral
     * -1 - rear
     * 1-6 -
     */
    private int minGear = 1;
    private int maxGear = 6;
    private int gear = 0;

    public void shigtUp() {
        gear = gear < maxGear? gear + 1 : gear;
    }
    public void shiftDown() {
        gear = gear > minGear? gear - 1 : gear;
    }
    public void switchGear() {
        gear = (gear > 1)? gear : -1;
    }
    public void switchNeatral() {
        gear = 0;
    }
    public int getCurrentGear() {
        return gear;
    }
}
