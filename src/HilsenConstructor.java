public class HilsenConstructor {
    private String navn;

    public HilsenConstructor(String navn) {
        this.navn = navn;
    }

    public void hej() {
        System.out.println("Hej, jeg hedder " + this.navn + "!");
    }

    public static String hejReturn(String name) {
        return "Hej med dig " + name + "!";
    }

    public static void main(String[] args) {
        String hilsen = hejReturn("Kendall");
        System.out.println(hilsen);

        HilsenConstructor hilsenObjekt = new HilsenConstructor("Kylie");
        hilsenObjekt.hej();
    }
}
