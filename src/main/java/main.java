import java.util.Scanner;

public class main {
    static int totalValue = 0;
    static int x = 0;
    static int y = 9;
    public static void main(String[] args) {
        userAddNumber();
        calculateOk();
    }


    private static void userAddNumber() {
        int[] numbers = new int[9];
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