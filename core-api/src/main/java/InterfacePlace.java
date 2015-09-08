import java.util.List;

/**
 * Created by ulia2612 on 08.09.15.
 */
public interface InterfacePlace {
    void addPlace (Place place);
    void deleteContact (int place_id);
    void editContact (Place place);
    List<Place> getAllPlace();
}
