import java.util.Date;
import java.util.List;

/**
 * Created by ulia2612 on 07.09.15.
 */
public class RealizationPost implements InterfacePost {

    @Override
    public void addPost(Post post, Date date) {

    }

    @Override
    public void editPost(Post post) {

    }

    @Override
    public void deletePost(int post_id) {

    }

    @Override
    public int getPostCount(int post_id) {
        return 0;
    }

    @Override
    public void addMessagePostFriend(int contact_id, String contant, String subjectPost, Date date) {

    }

    @Override
    public void repost(int post_id, int contact_id) {

    }

    @Override
    public List<Post> getAllPost() {
        return null;
    }
}
