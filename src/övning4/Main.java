package övning4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Skriv ut alla tal ifrån 1-100

       /* System.out.println("Numbers 1-100:");

        for(int i=0;i<100;i++) {
            System.out.print((i+1) + " ");
        }*/
        //Skriv ut alla jämna tal ifrån 1-100

        System.out.println("Even numbers 1-100:");

        for(int i = 0; i<100;i+=2) {
            System.out.print((i+2) + " ");
        }//

        Scanner sc= new Scanner(System.in);
        System.out.print("Add three numbers : ");
        int numberOne= sc.nextInt();
        int numberTwo= sc.nextInt();
        int numberThree= sc.nextInt();

        int totofNum = numberOne + numberTwo+ numberThree;
        int averageValue = totofNum / 3;
        //System.out






    }



}

