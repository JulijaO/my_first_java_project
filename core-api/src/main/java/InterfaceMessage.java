/**
 * Created by ulia2612 on 07.09.15.
 */
public interface InterfaceMessage {
    // управление сообщениями между пользователями
    void addMessage (Message message);
    void editMessage (Message message);
    void deleteMessage (Message message);
    int getMessageCount (Message message);
}
