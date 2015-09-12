package home.socialnetwork.model;

/**
 * Created by ulia2612 on 08.09.15.
 */
public class Like {
    private int likePost_id;
    private int likeImage_id;
    private int likeComment_id;

    public int getLikePost_id() {
        return likePost_id;
    }

    public void setLikePost_id(int likePost_id) {
        this.likePost_id = likePost_id;
    }

    public int getLikeImage_id() {
        return likeImage_id;
    }

    public void setLikeImage_id(int likeImage_id) {
        this.likeImage_id = likeImage_id;
    }

    public int getLikeComment_id() {
        return likeComment_id;
    }

    public void setLikeComment_id(int likeComment_id) {
        this.likeComment_id = likeComment_id;
    }
}
