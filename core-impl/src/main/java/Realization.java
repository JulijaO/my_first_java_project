import java.time.LocalDate;
import java.util.Set;

/**
 * Created by ulia2612 on 07.09.15.
 */
public class Realization implements InterfaceCoreApi {

    @Override
    public void createContact(String firstname, String lastname, String email, String password, LocalDate birthday) {

    }

    @Override
    public void addFriendship(int contact_id, int friend_id) {

    }

    @Override
    public void deleteFriendship(int contact_id, int friend_id) {

    }

    @Override
    public Set<Contact> getFriendList(int contact_id) {
        return null;
    }
}
