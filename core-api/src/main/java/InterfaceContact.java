import java.util.List;

/**
 * Created by ulia2612 on 07.09.15.
 */
public interface InterfaceContact {
    void addContact (Contact contact);
    void deleteContact (int contact_id);
    void editContact (Contact contact);
    List<Contact> getAllContact();
}
