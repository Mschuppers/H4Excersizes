import java.util.Scanner;

public class main {
    static int totalValue = 0;

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
        drawHourglass();

    }

    public static void drawHourglass() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();

        int x = n;

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");

            }
            System.out.println("");
            x-=2;

        }

        x = 3; // <-- not 1 here, the first line has 3 asterisks
        for (int i = 1; i < n; i++) { // <-- i starts at 1 because the first line was already drawn in the upper half
            for (int j = i; j < n; j++) {
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
