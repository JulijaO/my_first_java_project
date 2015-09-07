import java.util.Set;

/**
 * Created by ulia2612 on 07.09.15.
 */
public interface InterfaceCoreApi {
    //создание нового контакта, дружба контактов, удаление друзей и т.д.
    void createContact(Contact contact);
    void addFriendship(Contact contact);
    void deleteFriendship(Contact contact);
    Set<Contact> getFriendList(Contact contact);

}
