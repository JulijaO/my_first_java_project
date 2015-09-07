import java.util.Date;

/**
 * Created by ulia2612 on 06.09.15.
 */
public class Message {
    private String content;
    private Contact addresser;
    private Contact recipient;
    private Date dateTime;

    public Message(String content, Contact addresser, Contact recipient, Date dateTime) {
        this.content = content;
        this.addresser = addresser;
        this.recipient = recipient;
        this.dateTime = dateTime;
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
