import java.time.LocalDate;
import java.util.Set;

/**
 * Created by ulia2612 on 07.09.15.
 */
public interface InterfaceCoreApi {
    //создание нового контакта, дружба контактов, удаление друзей и т.д.
    void createContact(String firstname, String lastname, String email, String password, LocalDate birthday);
    void addFriendship(int contact_id, int friend_id);
    void deleteFriendship(int contact_id, int friend_id);
    Set<Contact> getFriendList(int contact_id);

}
