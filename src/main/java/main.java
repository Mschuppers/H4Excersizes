import java.util.Scanner;

public class main {
    private static int totalValue = 0;
    private static Scanner sc = new Scanner(System.in);
    private static int n;
    private static int failCount = 0;

    enum type {
        WARM,
        COLD,
        UNKNOWN
    }

    public static void main(String[] args) {
        //excersize1();
        //excersize2();
        excersize3();
    }


    private static void excersize1() {
        userAddNumber();
        calculateOk();
    }

    private static void userAddNumber() {
        int[] numbers = new int[9];
        int y = 9;
        int x = 0;
        System.out.println("Enter Accountnumber");
        Scanner sc = new Scanner(System.in);  // Create a Scanner object


        while (x < 9) { // max 9 positions
            numbers[x] = sc.nextInt();
            System.out.println("het huidige array getal is " + numbers[x]);
            x++;
        }

        for (x = 0; x < 9; x++) {
            totalValue = totalValue + numbers[x] * y;
            System.out.println(totalValue);
            y--;
        }
        System.out.println("Het totaal is " + totalValue);
    }

    private static void calculateOk() {
        if (totalValue % 11 == 0) {
            System.out.println("Is ok");
        } else {
            throw new IllegalArgumentException("Value can be divided by 11");
        }


    }


    private static void excersize2() {

        System.out.println("Enter season of choice");
        Scanner sc = new Scanner(System.in);
        String seasonSubmited = sc.next();


        switch (seasonSubmited) {
            case "Zomer":
                System.out.println(type.WARM);
                break;
            case "Lente":
                System.out.println(type.WARM);
                break;
            case "Winter":
                System.out.println(type.COLD);
                break;
            case "Herfst":
                System.out.println(type.COLD);
                break;
            default:
                System.out.println(type.UNKNOWN);

        }


    }

    private static void excersize3() {

        System.out.print("Enter an uneven number ");
        generateHourglass();
    }

    private static void generateHourglass() {

        try {
////            Comment from here, code below is from Pepijn for study reasons
//            n = sc.nextInt();
//            if (n % 2 != 0) {
//                for (int i = 0; i < n; i++) {             //size hourglass
//                    if (i == 0 || i == n - 1) {         //if first or last row
//                        for (int j = 0; j < n; j++) {     //prints "*" 9 times
//                            System.out.print("*");
//                        }
//                        System.out.println();
//                    } else {          //if middle of hourglass
//                        for (int j = 0; j < n; j++) {
//                            if (j == i || j==(n-(i+1))) {   //identify spaces
//                                System.out.print("*");
//                            } else {
//                                System.out.print(" ");
//                            }
//                        }
//                        System.out.println();
//
//                    }
//                }
//
//            } else {
//
//                throw new Exception("Invalid input");
//
//            }
////            //Comment till here

            //Comment from here
            //Request user input
            //Request user input
            n = sc.nextInt();
            //check if input is uneven
            if (n % 2 != 0) {
                //if uneven number is entered, modulo is not 0 execute the top half

                int x = n * 2 - 1;
                //Generate spaces for the shape structure
                for (int i = 0; i < n; i++) {
                    for (int j = i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    //Print amount of * to create shape, removing * each line
                    for (int k = 0; k < x; k++) {
                        System.out.print("*");
                    }
                    x -= 2;
                    System.out.println("");
                }
                //Lower half
                x = 3; //not 1 here, formTop() has the last line with 1* so we start with 3* here.
                for (int i = 1; i < n; i++) { //i starts at 1 because the first line was already drawn in the upper half
                    for (int j = i; j < n - 1; j++) {
                        System.out.print(" ");
                    }
                    //Create the lower shape, adding each line
                    for (int k = 0; k < x; k++) {
                        System.out.print("*");
                    }
                    x += 2;
                    System.out.println();
                }


            } else {
                throw new Exception("Invalid entry by user");
            }
            //Comment till here


        } catch (Exception e) {

            //Use switch statement to identify the amount of fails and post the appropriate message
            switch (failCount) {
                case 0:
                    failCount++;
                    System.out.println("Let's try that again. An uneven number please..");
                    System.out.println("Attempts made: " + failCount + "/3");
                    generateHourglass();
                    break;
                case 1:
                    failCount++;
                    System.out.println("An uneven number, like 1,3,5,7,9,11,13 etc.");
                    System.out.println("Attempts made: " + failCount + "/3");
                    generateHourglass();
                    break;
                case 2:
                    System.out.println("Attempts made: "+failCount+"/3");
                    System.out.println("Really? Are you testing this or...?");
                    System.out.println("If so, congratulations, you failed succesfully");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Congratulations, you unlocked the default response, please log your actions");
                    System.out.println("I'd like to know how you managed that.");

            }
        }
    }
}

