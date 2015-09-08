/**
 * Created by ulia2612 on 08.09.15.
 */
public class RealizationLike implements InterfaceLike{
    @Override
    public void addLike(Like like) {

    }

    @Override
    public int getCountLikeImage(int likeImage_id) {
        return 0;
    }

    @Override
    public boolean isLikeImage(int contact_id, int likeImage_id) {
        return false;
    }

    @Override
    public int getCountLikePost(int likePost_id) {
        return 0;
    }

    @Override
    public boolean isLikePpost(int contact_id, int likePost_id) {
        return false;
    }

    @Override
    public int getCountLikeComment(int likeComment_id) {
        return 0;
    }

    @Override
    public boolean isLikeComment(int contact_id, int likeComment_id) {
        return false;
    }
}
