package practice_basic_day01;

public class Q02_Println_vs_print {
    /*
    println() ve print() arasinda tek fark var;
    println satir atliyor,
    print ise imlecin ayni satirda kalmasini sagliyor.

     */
    public static void main(String[] args) {
        System.out.println("*****println*****");
        System.out.println("Welcome");
        System.out.println("to");
        System.out.println("Java");
        System.out.println("Class");

        System.out.println("*****print*****");
        System.out.print("Welcome");
        System.out.print(" to");
        System.out.print(" Java");
        System.out.print(" Class");


   /*
   konsolda
   1
   2
   3
   4
   5
   yazdiriniz
   sonrasinda da  yanyana 12345 yazdiriniz
    */
        System.out.println("*****println*****");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        System.out.println("*****print*****");
        System.out.print("12345");

    }
}
