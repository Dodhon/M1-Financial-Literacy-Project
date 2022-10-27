import java.util.Scanner;

public class terminalProject{

    public static void main(String[] args){
        boolean mainMenu = true;
        int userInput = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("Which are you? (1-3)" + '\n' + "1: Under 18" + '\n' + "2: Over 18, not a credit card owner" + '\n' + "3: Over 18 and credit card owner");
        int storedUserType = in.nextInt();
        while (mainMenu == true){
            System.out.println("Welcome to M1 Finance's credit literacy program. Below are options you can explore for your selected group!");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            if (storedUserType == 1){
                System.out.println("You are under 18: Please select what you would like to explore!");
                mainMenu = false;
                System.out.println("1: Being smart with money and building good spending habits" + '\n' + "2: Important of learning the difference between credit and debit " + '\n' + "3: Learning how to manage money" + '\n');
                userInput = in.nextInt();
                if (userInput == 1){
                    System.out.println("https://millennialmoney.com/teens-financial-independence/");
                    System.out.println("This site goes through key points on being smart with money and building habits that will transfer over to your future. ");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
                else if (userInput == 2){
                    System.out.println("https://www.cnbc.com/select/steps-to-help-your-children-build-good-credit/");
                    System.out.println("Since you can get a credit card under 18 as an authorized user on an adults account, this site focuses on the importance on learning the difference between debit and credit and how  to better manage money. ");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
                else if (userInput == 3){
                    System.out.println("https://www.thebalancemoney.com/how-to-teach-your-teen-about-budgeting-4160105");
                    System.out.println("This site explains how to manage your money; an important skill to have since teens are just entering the real world. This will teach them how to budget their money.");
                    System.out.println("Return to main menu? (1 for YES)");
                        userInput= in.nextInt();
                        if (userInput == 1){
                            System.out.println("Returning to main menu");
                            mainMenu = true;
                        }
                 }   
            }
            if (storedUserType == 2){
                System.out.println("You are over 18 and do not have a credit card yet. Please select what you would like to explore!");
                mainMenu = false;
                System.out.println("1: Basic key financial tips " + '\n' + "2: How to get a credit card and how to manage it");
                userInput = in.nextInt();
                if (userInput == 1){
                    System.out.println("https://www.investopedia.com/articles/younginvestors/08/eight-tips.asp ");
                    System.out.println("This site explains basic key financial tips for young adults. ");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
                else if (userInput == 2){
                    System.out.println("https://www.bankrate.com/finance/credit-cards/first-credit-card/#best-cards");
                    System.out.println("This site explains how to get a credit card for the first time and how to manage it. Also has some decent starter cards with the information you need to choose a card (APR, Fees, Rewards.)");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
            }
            if (storedUserType == 3){
                System.out.println("You are already a credit card owner and over the age of 18. Please select what you would like to explore!");
                mainMenu = false;
                System.out.println("1: How to build a good credit score " + '\n' + "2: Main causes of a bad credit score" + '\n' + "3: How to fix a bad credit score" + '\n' + "4: How to maintain a good credit score" + '\n' + "5: How to use your credit card safely");
                userInput = in.nextInt();
                if (userInput == 1){
                    System.out.println("https://www.cnbc.com/select/how-to-build-credit-and-achieve-a-good-credit-score/");
                    System.out.println("This site gives information on how to build a good credit score");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
                else if (userInput == 2){
                    System.out.println("https://corporatefinanceinstitute.com/resources/commercial-lending/bad-credit-causes/");
                    System.out.println("This site explains the main reasons for a bad credit score");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
                else if (userInput == 3){
                    System.out.println("https://www.experian.com/blogs/ask-experian/credit-education/improving-credit/how-to-fix-a-bad-credit-score/");
                    System.out.println("This site explains tips on how to build a good credit score");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
                else if (userInput == 4){
                    System.out.println("https://www.consumerfinance.gov/ask-cfpb/how-do-i-get-and-keep-a-good-credit-score-en-318/");
                    System.out.println("This site explains how to maintain a good credit score");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
                else if (userInput == 5){
                    System.out.println("https://financer.com/us/how-to/use-your-card-safely/");
                    System.out.println("This site explains how to safely use your credit card");
                    System.out.println("Return to main menu? (1 for YES)");
                    userInput= in.nextInt();
                    if (userInput == 1){
                        System.out.println("Returning to main menu");
                        mainMenu = true;
                    }
                }
            }
        }
    }


}