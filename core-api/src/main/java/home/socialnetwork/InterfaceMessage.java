package home.socialnetwork;

import home.socialnetwork.model.Message;

import java.util.List;

/**
 * Created by ulia2612 on 07.09.15.
 */
public interface InterfaceMessage {
    // управление сообщениями между пользователями
    void addMessage (Message message);
    void editMessage (Message message);
    void deleteMessage (int message_id);
    int getMessageCount (int message_id);
    List<Message> getAllMessage();
}
