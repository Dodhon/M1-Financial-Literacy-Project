import java.util.Scanner;

public class terminalProject{

    public static void main(String[] args){
        boolean mainMenu = true;
        int userInput = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("Which are you? (1-3)" + '\n' + "1: Under 18" + '\n' + "2: Over 18, not a credit card owner" + '\n' + "3: Over 18 and credit card owner");
        int storedUserType = in.nextInt();
        if (storedUserType == 1){
            System.out.println("You are under 18");
        }
        else if (storedUserType == 2){
            System.out.println("you should get a credit card");
        }
        else if (storedUserType == 3){
            System.out.println("awwefw");
        }
        while (mainMenu == true){
            System.out.println("You are in the main menu: ");
            if (storedUserType == 1){
                System.out.println("Here are some resources to make you knowledgeable on credit cards: " + '\n' + "https://wallethub.com/credit-cards/teenagers/");
                mainMenu = false;
                System.out.println("Would you like some more information? (1 for YES, 2 for NO)");
                userInput = in.nextInt();
                if (userInput == 1){
                    System.out.println("More info provided:");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                    else{
                        System.out.println("Staying on this page");
                    }
                }
                else if (userInput == 2){
                    System.out.println("Returning to main menu:");
                    mainMenu = true;
                }
            }
            if (storedUserType == 2){
                System.out.println("Here are some resources on how to obtain your first credit card:" + '\n' + "https://www.bankrate.com/finance/credit-cards/first-credit-card/");
                mainMenu = false;
                System.out.println("Would you like some more information? (1 for YES, 2 for NO)");
                userInput = in.nextInt();
                if (userInput == 1){
                    System.out.println("More info provided:");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                    else{
                        System.out.println("Staying on this page");
                    }
                }
                else if (userInput == 2){
                    System.out.println("Returning to main menu:");
                    mainMenu = true;
                }
            }
            if (storedUserType == 3){
                System.out.println("You are already a credit card owner, here are some tips on increasing credit score: " + '\n' + "https://www.nerdwallet.com/article/finance/raise-credit-score-fast");
                mainMenu = false;
                System.out.println("Would you like some more information? (1 for YES, 2 for NO)");
                userInput = in.nextInt();
                if (userInput == 1){
                    System.out.println("More info provided:");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                    else{
                        System.out.println("Staying on this page");
                    }
                }
                else if (userInput == 2){
                    System.out.println("Returning to main menu:");
                    mainMenu = true;
                }
            }
        }
    }
}