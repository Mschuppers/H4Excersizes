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
        excersize3()
    }

    private static void excersize2() {
        System.out.println("Enter season of choice");
        Scanner sc = new Scanner(System.in);

        String seasonSubmited = sc.next();;
        switch(seasonSubmited) {
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

        public void excersize3(){

        }


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

    public static void calculateOk() {
        if (totalValue % 11 == 0) {
            System.out.println("Is ok");
        } else {
            throw new IllegalArgumentException("Value can be divided by 11");
        }


    }
}