import java.util.Scanner;

public class terminalProject{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = in.nextInt();
        if (age > 0 && age < 18){
            System.out.println ("Please look up" + "https://www.moneycrashers.com/best-financial-decisions-young-people/");
        }
        else if (age == 18){
            System.out.println("Please look up" + "https://www.getcopper.com/post/5-financial-actions-to-take-once-you-turn-18");
        }
        else {
            System.out.println("Please look up" + "https://www.cnbc.com/select/guide/credit-scores-for-beginners/#why-you-need-a-good-credit-score");
        }
    }
}