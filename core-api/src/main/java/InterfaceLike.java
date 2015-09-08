/**
 * Created by ulia2612 on 08.09.15.
 */
public interface InterfaceLike {
    void addLike(Like like);
    int getCountLikeImage(int likeImage_id);
    boolean isLikeImage(int contact_id, int likeImage_id);

    int getCountLikePost(int likePost_id);
    boolean isLikePpost(int contact_id, int likePost_id);

    int getCountLikeComment(int likeComment_id);
    boolean isLikeComment(int contact_id, int likeComment_id);
}
