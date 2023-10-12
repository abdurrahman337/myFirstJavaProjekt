package Excersice2;

public class excersize {
    public static void main(String[] args) {
        //Jämför 2 tal. Om den första är större än andra skriv ut Först tal större
        //samt "Andra talen är stört" om det är tvärt om

        int tal1 = 5;
        int tal2 = 7;

        if(tal1 > tal2)
            System.out.println("tal1 är störreden tal2");
        else if (tal1 ==tal2) {
            System.out.println("Tal1 och tal2 har samma värde");

        } else {
            System.out.println("Tal2 är störreden tal1");
        }
        /*
        Jämför två tal. om det första är jämt delbart men den andra
        skriv ut " jämt delbart" annars skriv ut "inte jämt delbart
         */
        if(tal1 % tal2 == 0) {
            System.out.println("Jämt delbard");
        }else{
            System.out.println("inte Jämt bart");
        }
    }
}
