public class HilsenInstans {
    public void hej(String name) {
           System.out.println("Hej " + name + "!");
       }
   
       public static String hejReturn(String name) {
           return "Hej med dig " + name + "!";
       }
   
       public static void main(String[] args) {
           String hilsen = hejReturn("Kim");
           System.out.println(hilsen);
   
           HilsenInstans hilsenObjekt = new HilsenInstans();
           hilsenObjekt.hej("Khloe");
       }
   }