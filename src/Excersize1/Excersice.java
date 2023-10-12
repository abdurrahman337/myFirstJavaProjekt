package Excersize1;

public class Excersice {
    public static void main(String[] args) {
        /* skapa ett program som använder tre ta
        program beräknar och skriver ut summan samt medelvärdet av de tre talen

         */
      int tal1=4;
      int tal2=6;
      int tal3= 4;


      int summa= tal1 + tal2 +tal3;
      int median = summa/3;
        System.out.println("The sum is : " + summa);
        System.out.println("The mean is: "  + median);





        /*Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel
        Rektangels sidor ska läsas in
         */

        int height = 3;
        int length = 5;

        int area = height * length;
        int circ = height*2 + length*2;

        System.out.println();

        System.out.println(area);
        System.out.println(circ);



    }
}
