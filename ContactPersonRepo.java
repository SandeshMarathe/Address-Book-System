import java.util.ArrayList;
import java.util.List;

public class ContactPersonRepo
{
    List lstContactRepo = new ArrayList();

    void addContactPerson(ContactPerson cp)
    {
        lstContactRepo.add(cp);
    }

    List printAllData()
    {
        return lstContactRepo;
    }
}
