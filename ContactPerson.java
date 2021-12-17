import java.util.Map;

public class ContactPerson
{

    enum Gender{
        MALE, FEMALE, OTHERS;
    }

    String firstName, lastName, address, city, state;
    long zip, mobNo;

    Map<Gender,String> contInfo;

    @Override
    public String toString() {
        return "ContactPerson{" +
                "firstName='" + firstName + '\n' +
                ", lastName='" + lastName + '\n' +
                ", address='" + address + '\n' +
                ", city='" + city + '\n' +
                ", state='" + state + '\n' +
                ", zip=" + zip + '\n' +
                ", mobNo=" + mobNo + '\n' +
                ", Gender=" + contInfo + '\n' +
                '}';
    }
}
