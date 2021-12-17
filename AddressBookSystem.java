import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem
{
    ContactPersonRepo contactPersonRepo = new ContactPersonRepo();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        int choice, exit = 5;

        do {
            choice = userInterface.ShowMainMenu();
            addressBookSystem.handlerUserSelection(choice);
        } while (choice != exit);


    }

    public void handlerUserSelection(int choice)
    {
        UserInterface userInterface = new UserInterface();
        switch (choice)
        {
            case 1:
                    addContactPerson();
                break;
            case 2:
                List lstContactRepo = contactPersonRepo.printAllData();
                userInterface.printAllData(lstContactRepo);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                    System.out.println("Wrong Choice ..!");
                break;
        }
    }

    public void addContactPerson()
    {
        ContactPerson contactPerson = new ContactPerson();

        System.out.println("Enter The First Name :");
        contactPerson.firstName = scanner.nextLine();

        System.out.println("Enter The Last Name :");
        contactPerson.lastName = scanner.nextLine();

        System.out.println("Enter The Address :");
        contactPerson.address = scanner.nextLine();

        System.out.println("Enter The City :");
        contactPerson.city = scanner.nextLine();

        System.out.println("Enter The State :");
        contactPerson.state = scanner.nextLine();

        System.out.println("Enter The Zip :");
        contactPerson.zip = scanner.nextLong();

        System.out.println("Enter The Mobile Number :");
        contactPerson.mobNo = scanner.nextLong();

        System.out.println("1.MALE \n2.FEMALE \n3.OTHERS");
        System.out.println("Select your Choice :");
        int option = scanner.nextInt();

        contactPerson.contInfo = new HashMap<>();

        switch (option)
        {
            case 1:
                    contactPerson.contInfo.put(ContactPerson.Gender.MALE,"MALE");
                    break;
            case 2:
                    contactPerson.contInfo.put(ContactPerson.Gender.FEMALE,"FEMALE");
                    break;
            case 3:
                    contactPerson.contInfo.put(ContactPerson.Gender.OTHERS,"OTHERS");
                    break;
            default:
                    System.out.println("Wrong Choice..!");
                    break;
        }

        contactPersonRepo.addContactPerson(contactPerson);
    }
}


