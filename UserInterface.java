import java.util.Scanner;

public class UserInterface
{
    public int ShowMainMenu()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add New Contact \n2.Edit Contact \n3.Delete Contact");

        System.out.println("Enter Your Choice :");
        int choice = sc.nextInt();

        return choice;
    }
}
