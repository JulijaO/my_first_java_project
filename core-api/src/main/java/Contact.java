import java.util.Set;

/**
 * Created by ulia2612 on 06.09.15.
 */
public class Contact {
    private String contact_id;
    private String firstname;
    private String lastname;
    private String numberPhone;
    private String email;
    private String address;
    private Set<Hobby> hobby;
    private Set<Place> places;

    public Contact(String contact_id, String firstname, String lastname, String numberPhone, String email, String address, Set<Hobby> hobby, Set<Place> places) {
        this.contact_id = contact_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.numberPhone = numberPhone;
        this.email = email;
        this.address = address;
        this.hobby = hobby;
        this.places = places;
    }

    public String getContact_id() {
        return contact_id;
    }

    public void setContact_id(String contact_id) {
        this.contact_id = contact_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Hobby> getHobby() {
        return hobby;
    }

    public void setHobby(Set<Hobby> hobby) {
        this.hobby = hobby;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }
}
