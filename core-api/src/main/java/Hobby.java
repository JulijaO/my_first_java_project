/**
 * Created by ulia2612 on 06.09.15.
 */
public class Hobby {
    private String description;
    private String title;
    private String hobby_id;

    public Hobby(String description, String title, String hobby_id) {
        this.description = description;
        this.title = title;
        this.hobby_id = hobby_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHobby_id() {
        return hobby_id;
    }

    public void setHobby_id(String hobby_id) {
        this.hobby_id = hobby_id;
    }
}
