/**
 * Created by ulia2612 on 07.09.15.
 */
public class Place {
    private String place_id;
    private String title;
    private String description;
    private double longitude;
    private double latitude;

    public Place(String place_id, String title, String description, double longitude, double latitude) {
        this.place_id = place_id;
        this.title = title;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
