import java.util.Date;

/**
 * Created by ulia2612 on 07.09.15.
 */
public interface InterfacePost {
    // управление стеной =)
    void addPost(Post post, Date date); //добавление записи себе на стену
    void editPost (Post post); // редактирование своей записи
    void deletePost (Post post); // удаление своей записи
    int getPostCount(Post post); // кол-во записей на стене
    void addMessagePostFriend (Contact contact,  Post post); // сообщение друга на стене
    void repost(Post post, Contact contact); // репост записи со стены другого контакта
}
