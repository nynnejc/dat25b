public class Hilsen {
    private String name;

    public Hilsen(String name) {
        this.name = name;
    }

    public static void hej(String name) {
        System.out.println("Hej " + name + "!");
    }

    public static String hejReturn(String name) {
        return "Hej med dig " + name + "!";
    }

    public String hej() {
        return "Hej " + this.name + "!";
    }

    public static void main(String[] args) {
        hej("Poul");
        hej("Bo");

        String navn = "Anne";
        hej(navn);

        // Udkommenterede kald
        // hej("Poul");
        // hej("Bo");
        // hej("Anne");

        String hilsen = hejReturn("Signe");
        System.out.println(hilsen);
        
        Hilsen hilsenObjekt = new Hilsen("Jens");
        System.out.println(hilsenObjekt.hej());
    }
}
