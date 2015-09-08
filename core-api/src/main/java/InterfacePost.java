import java.util.Date;
import java.util.List;

/**
 * Created by ulia2612 on 07.09.15.
 */
public interface InterfacePost {
    // управление стеной =)
    void addPost(Post post, Date date); //добавление записи себе на стену
    void editPost (Post post); // редактирование своей записи
    void deletePost (int post_id); // удаление своей записи
    int getPostCount(int post_id); // кол-во записей на стене
    void addMessagePostFriend (int contact_id, String contant, String subjectPost, Date date); // сообщение друга на стене
    void repost(int post_id, int contact_id); // репост записи со стены другого контакта
    List<Post> getAllPost();
}
