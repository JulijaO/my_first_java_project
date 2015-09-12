package service;

import home.socialnetwork.InterfaceMessage;
import home.socialnetwork.model.Message;

import java.util.List;

/**
 * Created by ulia2612 on 07.09.15.
 */
public class RealizationMessage implements InterfaceMessage {

    @Override
    public void addMessage(Message message) {

    }

    @Override
    public void editMessage(Message message) {

    }

    @Override
    public void deleteMessage(int message_id) {

    }

    @Override
    public int getMessageCount(int message_id) {
        return 0;
    }

    @Override
    public List<Message> getAllMessage() {
        return null;
    }
}
