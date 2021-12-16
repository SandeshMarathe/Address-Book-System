import java.util.Scanner;

public class AddressBookSystem
{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        UserInterface ui = new UserInterface();
        int choice = ui.ShowMainMenu();

        AddressBookSystem abs = new AddressBookSystem();
        abs.handlerUserSelection(choice);

    }

    public void handlerUserSelection(int choice)
    {
        switch (choice)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                    System.out.println("Wrong Choice ..!");
                break;
        }
    }
}
