import java.util.Map;

public class ContactPerson
{

    enum Gender{
        MALE, FEMALE, OTHERS;
    }

    String firstName, lastName, address, city, state;
    long zip, mobNo;

    Map<Gender,String> contInfo;
}
