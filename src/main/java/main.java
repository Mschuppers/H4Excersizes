import java.util.Scanner;

public class main {
    static int totalValue = 0;
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int failCount = 0;

    enum type {
        WARM,
        COLD,
        UNKNOWN
    }

    public static void main(String[] args) {
        //excersize1();
        //excersize2();
        System.out.print("Enter an uneven number ");
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

    public static void excersize3() {
        formTop();


    }

    public static void formTop() {


        try {
            n = sc.nextInt();
            if (n % 2 != 0) {
                int x = n * 2 - 1;
                for (int i = 0; i < n; i++) {
                    for (int j = i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < x; k++) {
                        System.out.print("*");

                    }

                    x -= 2;
                    System.out.println("");

                }
                formBottom();
            } else {
                throw new Exception("Used an even number");

            }
        } catch (Exception e) {
            System.out.println("Invalid input, no characters, only even numbers allowed");
            failCount++;

            switch (failCount) {
                case 1:
                    System.out.println("Let's try that again. An uneven number please..");
                    System.out.println("Attempts made: " + failCount + "/3");
                    formTop();
                    break;
                case 2:
                    System.out.println("An uneven number, like 1,3,5,7,9,11,13 etc.");
                    System.out.println("Attempts made: " + failCount + "/3");
                    formTop();
                    break;
                case 3:
                    System.out.println("Really? Are you testing this or...?");
                    System.out.println("If so, congratulations, you stopped the application");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Congratulations, you unlocked the default response, please log your actions");

            }

        }
    }

    public static void formBottom() {

        int x = 3; // <-- not 1 here, the first line has 3 asterisks
        for (int i = 1; i < n; i++) { // <-- i starts at 1 because the first line was already drawn in the upper half
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            x += 2;
            System.out.println();
        }
    }

}


