package exersize3;

public class Talräkning {
    public static void main(String[] args) {
        // Skriv ut alla ta ifrån 1-100

        System.out.println("Skriver ut alla ta ifrån 1-100");
        int number = 1;

        while (number <=100){
            System.out.print(number + " ");
            number = number + 1;
            //number++; skulle funka med

        }
        //Skriv ut alla jämna tal från 1- 100
        int even = 2;
        while (even <=100) {
            System.out.println(even + " ");
            even = even + 2;
        }

        /*Skriv ut alla fibonnanci-tal ifrån 1 -100.
        Fibionnacci-tal är de två senaste talen adderat och börjar med 1. 1 som första två tal.
        exempel: 1, 1, 2, 3, 5, 8, 13, 21...
         */
        int first = 1;
        System.out.println(first + " ");
        int second = 1;

        while(second<=100){
            System.out.println(second + " ");
            int third = first + second;
            first = second;
            second = third;
        }






    }
}
