import java.util.Scanner;
public class terminalProject{
    static boolean mainMenu = true;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int storedUserType = -1; // Default value to fix java.lang error
        int userInput = -1; // ^
        System.out.println("Which are you? (1-3)" + '\n' + "1: Under 18" + '\n' + "2: Over 18, not a credit card owner" + '\n' + "3: Over 18 and credit card owner");
        storedUserType = in.nextInt();
        while (checkRange(1, 3, storedUserType) == false){
            storedUserType = in.nextInt();
        }
        while (mainMenu == true){
        	System.out.println();
            System.out.println("Welcome to M1 Finance's credit literacy program. Below are options you can explore for your selected group!");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            if (storedUserType == 1){
                System.out.println("You are under 18: Please select what you would like to explore!");
                System.out.println(" "); //added a blank space line
                mainMenu = false;
                System.out.println("1: 10 ways teens can prepare for financial independance" + '\n' + "2: 8 Tips to help you build credit " + '\n' + "3: Learning how to manage money" + '\n');
                userInput = in.nextInt();
                while (checkRange(1, 3, userInput) == false){
                    userInput = in.nextInt();
                }
                if (userInput == 1){
                    System.out.println("~~~~~10 Ways Teens can Prepare for Financial Independence~~~~~" + '\n'
                    + "1. Get good grades in school" + '\n'
                    + "2. Get a job and save the money you earn" + '\n'
                    + "3. Develop a budget and track your expenses, including savings, which should be treated as an expense." + '\n'
                    + "4. Save money to attend a college you can afford, and make sure to apply for scholarships and avoid debt." + '\n'
                    + "5. Make safe investments in the stock market." + '\n'
                    + "6. Open a retirement account." + '\n'
                    + "7. Save money by reducing expenses. (Get a cheaper phone plan or eat out less)" + '\n'
                    + "8. Start a business." + '\n'
                    + "9. Track your net worth" + '\n'
                    + "10. Save as much as you can for about 10 years, so you can retire early.");
                    System.out.println("Source: https://millennialmoney.com/teens-financial-independence/");
                    returnMenu();
                }
                else if (userInput == 2){
                    System.out.println(" "); //the importance on learning the difference between debit and credit and how to better manage money
                    System.out.println("~~~~~8 Tips to Help Develop Early Credit~~~~~" + '\n'
                    + "1. Learn early- Research shows that children develop behaviors around money as early as 3 years old" + '\n'
                    + "2. Learn the difference between a debit card and a credit card" + '\n'
                    + "3. Have incentives to save your money" + '\n'
                    + "4. Learn to save early for a secured credit card when they turn 18" + '\n'
                    + "5. Have your parents Co-sign your first loan or lease" + '\n'
                    + "6. Have your parents add you as an authorized user to your credit card to help them build a credit history" + '\n'
                    + "7. Report all possible forms of credit to your parents" + '\n'
                    + "8. Get encouraged to open a student credit card if you go to college");
                    System.out.println("Source: https://www.cnbc.com/select/steps-to-help-your-children-build-good-credit/");
                    returnMenu();
                }
                else if (userInput == 3){
                	 System.out.println("~~~~~Learning how to Manage Money~~~~~");
                    System.out.println("This site explains how to manage your money; an important skill to have since teens are just entering the real world.");
                    System.out.println("Budgeting for teens is important, as it helps you learn how to manage your spending and develop good habits with your money." + '\n'
                    				+ "Thus, you should learn the basics of budgeting as early as 13 or when you start earning money of your own." + '\n' 
                    				+ "A fundamental part of budgeting is to learn the difference between needs and wants and" + '\n'
                    				+ "Budgeting apps or prepaid credit cards can make it easier to grasp the essentials.");
                    System.out.println("Source: https://www.thebalancemoney.com/how-to-teach-your-teen-about-budgeting-4160105");
                    returnMenu();
                 }   
            }
            						  //-------------------------------------------------------------------------------------------------------------------
            if (storedUserType == 2){
                System.out.println("You are over 18 and do not have a credit card yet. Please select what you would like to explore!");
                mainMenu = false;
                System.out.println("1: Basic key financial tips " + '\n' + "2: How to get a credit card and how to manage it");
                userInput = in.nextInt();
                while (checkRange(1, 2, userInput) == false){
                    userInput = in.nextInt();
                }
                if (userInput == 1){
                    System.out.println("~~~~~8 Essential Finance Tips for Young Adults~~~~~ " + '\n' 
                    + "The sooner you start learning to manage your money, the better your chance of financial success will be throughout your life." + '\n'
                    + "If you are just starting out, there are eight steps you can take now to protect your financial health, start saving, and build wealth throughout your life-");
                    System.out.println("1.Pay with cash, not only credit." +'\n'
                    + "2. Educate yourself on personal finance, and beware of bad advice." +'\n'
                    + "3. Learn to budget, know where your money goes" + '\n'
                    + "4. Start an emergency fund." + '\n'
                    + "5. Start saving for retirement early." + '\n'
                    + "6. Stay on top of your taxes." + '\n'
                    + "7. Guard your health." +'\n'
                    + "8. Protect your wealth.");
                    System.out.println("Source: https://www.investopedia.com/articles/younginvestors/08/eight-tips.asp");
                    returnMenu();
                }
                else if (userInput == 2){
                    System.out.println("How  to get a credit card for the first time and how to manage it. Also has some decent starter cards with the information you need to choose a card (APR, Fees, Rewards.)" + '\n'
                    + "Here’s what you need to know about how to get a credit card for the first time:" + '\n'
                    + "1. Become an authorized user" + '\n'
                    + "2. Get a starter credit card" + '\n'
                    + "3. Identify important cardholder benefits" + '\n'
                    + '\n'
                    + "How to use a credit card wisely-" + '\n'
                    + "Once you have a credit card, you’ll want to start forming good credit habits." + '\n'
                    + "1. Don’t charge anything you can’t afford" + '\n'
                    + "2. Don’t carry a balance without a plan" + '\n'
                    + "3. ​​Track your spending all month long" + '\n'
                    + '\n'
                    + "On what basis should yu choose your credit card-" + '\n'
                    + "Find one that offers favorable terms and gets you the most you can get with your credit situation, these can help you compare and measure your starting credit cards-" + '\n'
                    + "1. Rewards rate" + '\n'
                    + "2. Welcome offer" + '\n'
                    + "3. Annual fee" + '\n'
                    + "4. Regular APR" + '\n'
                    + "5. Balance transfer intro APR");
                    System.out.println("Source: https://www.bankrate.com/finance/credit-cards/first-credit-card/#best-cards");
                    returnMenu();
                }
            }
            if (storedUserType == 3){
                System.out.println("You are already a credit card owner and over the age of 18. Please select what you would like to explore!");
                mainMenu = false;
                System.out.println("1: How to build a good credit score " + '\n' + "2: Main causes of a bad credit score and how to fix it" + '\n' + "3: How to use a credit card safely");
                userInput = in.nextInt();
                while (checkRange(1, 3, userInput) == false){
                    userInput = in.nextInt();
                }
                if (userInput == 1){
                    System.out.println("Making payments on time and keeping your balances low are the two most important factors when it comes to building credit" + '\n'
                    + "Credit cards aren’t the only option for building credit. If you have a personal loan, student loan,auto loan,or mortgage you want to make sure you are managing these responsibly." + '\n'
                    + "Pay your loans on time,every time" + '\n'
                    + "Don’t get close to your credit limit" + '\n'
                    + "A long credit history will help your score" + '\n'
                    + "Making payments on time and keeping your balances low are the two most important factors when it comes to building credit" + '\n'
                    + "Credit cards aren’t the only option for building credit. If you have a personal loan, student loan,auto loan,or mortgage you want to make sure you are managing these responsibly." + '\n'
                    + "1. Pay your loans on time,every time" + '\n'
                    + "2. Don’t get close to your credit limit" + '\n'
                    + "3. A long credit history will help your score" + '\n'
                    + "4. Only apply for credit that you need" + '\n'
                    + "5. Fact check your credit reports");
                    System.out.println("Source: https://www.cnbc.com/select/how-to-build-credit-and-achieve-a-good-credit-score/");
                    returnMenu();
                }
                else if (userInput == 2){
                    System.out.println("Causes of bad credit score and how to fix" + '\n'
                    + "1. Late payments" + '\n'
                    + "2. Collection accounts" + '\n'
                    + "3. Bankruptcy filing" + '\n'
                    + "4. Charge-off" + '\n'
                    + "5. Defaulting on loans" + '\n'
                    + "How to fix it:" + '\n'
                    + "1. Pay your loans on time,every time" + '\n'
                    + "2. Don’t get close to your credit limit" + '\n'
                    + "3. A long credit history will help your score" + '\n'
                    + "4. Only apply for credit that you need" + '\n'
                    + "5. Fact check your credit reports");
                    System.out.println("Sources: https://corporatefinanceinstitute.com/resources/commercial-lending/bad-credit-causes/" + '\n' + "https://www.experian.com/blogs/ask-experian/credit-education/improving-credit/how-to-fix-a-bad-credit-score/");
                    returnMenu();
                }
                else if (userInput == 3){
                    System.out.println("Credit Scores Evaluation & using credit card safely" + '\n'

                    + "Payment history (35%): Whether you’ve paid past credit accounts on time"  + '\n'
                    + "Amounts owed (30%): The total amount of credit and loans you’re using compared to your total credit limit, also known as your utilization rate"  + '\n'
                    + "Length of credit history (15%): The length of time you’ve had credit"  + '\n'
                    + "New credit (10%): How often you apply for and open new accounts"  + '\n'
                    + "Credit mix (10%): The variety of credit products you have, including credit cards, installment loans, finance company accounts, mortgage loans and so on"  + '\n'
                    + '\n'
                    + "Using credit cards safely"  + '\n'
                    + "1. Use your credit card on trusted websites only"  + '\n'
                    + "2. Use your computer to make online purchases. (using public computers puts you at risk of getting your information stolen)"  + '\n'
                    + "3. Protect your computer against viruses(keeping your information safe is important)"  + '\n'
                    + "4. Always get a credit card receipt(even online).(Use the billing statement to compare and verify that the totals match)"  + '\n'
                    + "5. Make sure to report lost or stolen cards immediately."  + '\n'
                    + "6. Keep your passwords secret and hard to guess(protecting your information)"  + '\n'
                    + "7. Store your pin safely and secure your card.");
                    System.out.println("Source: https://financer.com/us/how-to/use-your-card-safely/");
                    returnMenu();
                }
            }
        }
    }

    // Method that asks user if they would like to return to main menu
    public static void returnMenu(){
        boolean correctCheck = false;
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Return to main menu? (1 for YES)");
        while (!correctCheck){
            int userInput= in.nextInt();
            if (userInput == 1){
                System.out.println(">Returning to main menu...");  //added three dots for fun
                correctCheck = true;
                mainMenu = true;
            }
            else{
                System.out.println("Input out of range, try again...");
                correctCheck = false;
            }
        }
    }

    // Method that will check the range of the userInput and return true if it matches the allowed range, and false if not
    public static boolean checkRange(int lb, int ub, int userInput){
        boolean correctCheck = false;
        while (!correctCheck){
            if (userInput < lb || userInput > ub){
                System.out.println("Input out of range, try again...");
                correctCheck = false;
                break;
            }
            else{
                correctCheck = true;
                break;
            }
        }
        return correctCheck;
    }
}