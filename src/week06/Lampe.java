public class Lampe {
    private boolean isOn;
    private static int antalLamper = 0;

    public Lampe(boolean isOn) {
        this.isOn = isOn;
        antalLamper = getAntalLamper() +1;
    }

    public Lampe() {
        this(false);
    }

    public void trykPåKontakt() {
        isOn = !isOn;
    }

    public static int getAntalLamper() {
        return antalLamper;
    }

    @Override
    public String toString() {
        return isOn ? "Lampen er tændt" : "Lampen er slukket";
    }
}

class Værelse {
    public static void main(String[] args) {
        Lampe skrivebordslampe = new Lampe(true);
        Lampe sengelampe = new Lampe();

        System.out.println(skrivebordslampe);
        System.out.println(sengelampe);

        sengelampe.trykPåKontakt();
        System.out.println(sengelampe);

        System.out.println("Antal lamper: " + Lampe.getAntalLamper());
    }
}
