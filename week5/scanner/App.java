import java.util.Scanner;
public class Order {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        myOrder();
    }

    static void myOrder(){
        System.out.println("Welcome to Lazada!");

        System.out.print("Full name: ");
        String fullName = scan.nextLine();
        System.out.print("Contact number: ");
        String number = scan.nextLine();

        System.out.print("Enter your first item: ");
        String item1 = scan.nextLine();
        System.out.print("Enter price:" );
        double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter your second item: ");
        String item2 = scan.nextLine();
        System.out.print("Enter price:" );
        double price2 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter your third item: ");
        String item3 = scan.nextLine();
        System.out.print("Enter price:" );
        double price3 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter your fourth item: ");
        String item4 = scan.nextLine();
        System.out.print("Enter price:" );
        double price4 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter your fifth item: ");
        String item5 = scan.nextLine();
        System.out.print("Enter price:" );
        double price5 = scan.nextDouble();

        double totalAmount = price1 + price2 + price3 + price4 + price5;

        System.out.print("Hello, " + fullName + "!" + " We will contact your number " + number + " if our rider is on the way. Thank you! ");
       
        System.out.println("Your order is: " + item1 + ", " + item2 + ", " + item3 + ", " + item4 + " and " + item5);

        System.out.println("Your total amount is: " + totalAmount);
    }
}
