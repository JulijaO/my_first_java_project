import java.util.Date;

/**
 * Created by ulia2612 on 06.09.15.
 */
public class Message {
    private int message_id;
    private String content;
    private Contact addresser;
    private Contact recipient;
    private Date dateTime;

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Contact getAddresser() {
        return addresser;
    }

    public void setAddresser(Contact addresser) {
        this.addresser = addresser;
    }

    public Contact getRecipient() {
        return recipient;
    }

    public void setRecipient(Contact recipient) {
        this.recipient = recipient;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
