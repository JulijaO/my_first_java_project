package home.socialnetwork;

import home.socialnetwork.model.Hobby;
import home.socialnetwork.model.Place;

import java.util.List;

/**
 * Created by ulia2612 on 08.09.15.
 */
public interface InterfaceHobby {
    void addPlace (Hobby hobby);
    void deleteContact (int hobby_id);
    void editContact (Hobby hobby);
    List<Place> getAllHobby();
}
