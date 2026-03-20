import java.util.Scanner;
public class Studentinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter Section: ");
        String section = sc.nextLine();
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        System.out.println("Display Name: " + name);
        System.out.println("Display Roll No: " + rollNo);
        System.out.println("Display Section: " + section);
    }
}