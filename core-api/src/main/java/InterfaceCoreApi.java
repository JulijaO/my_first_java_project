/**
 * Created by ulia2612 on 07.09.15.
 */
public interface InterfaceCoreApi {

    void addContact (Contact contact);
    void editContact (Contact contact);

    void addMessage (Message message);
    void editMessage (Message message);
    void deleteMessage (Message message);
    void getMessageCout (Message message);

    void addPost(Post post);
    void editPost (Post post);
    void deletePost (Post post);
    void getPostCout(Message message);

    void addMarket (Market.Сategory category, Market market);
    void editMarket (Market.Сategory category, Market market);
    void deleteMarket (Market.Сategory category, Market market);


}
