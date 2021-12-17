import java.util.List;
import java.util.Scanner;

public class UserInterface
{
    public int ShowMainMenu()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Add New Contact \n2.Print Contact \n3.Edit Contact \n4.Delete Contact \n5.Exit");

        System.out.println("Enter Your Choice :");
        int choice = scanner.nextInt();

        return choice;
    }

    public void printAllData(List lstContactRepo)
    {
        for (int i = 0; i < lstContactRepo.size(); i++)
        {
            System.out.println(lstContactRepo.get(i));
        }
    }
}
