import java.util.Date;

/**
 * Created by ulia2612 on 06.09.15.
 */
public class Post {
    private String post_id;
    private String contact_id;
    private String content;
    private String subjectPost;
    private Date dateTime;

    public Post(String post_id, String contact_id, String content, String subjectPost, Date dateTime) {
        this.post_id = post_id;
        this.contact_id = contact_id;
        this.content = content;
        this.subjectPost = subjectPost;
        this.dateTime = dateTime;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getContact_id() {
        return contact_id;
    }

    public void setContact_id(String contact_id) {
        this.contact_id = contact_id;
    }

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
