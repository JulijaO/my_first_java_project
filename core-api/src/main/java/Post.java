import java.util.Date;

/**
 * Created by ulia2612 on 06.09.15.
 */
public class Post {
    private int post_id;
    private int contact_id;
    private String content;
    private String subjectPost;
    private Date dateTime;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubjectPost() {
        return subjectPost;
    }

    public void setSubjectPost(String subjectPost) {
        this.subjectPost = subjectPost;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
