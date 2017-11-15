package study.java.vote.smile.model;

public class UserInfo {
    private Integer id;

    private String userGuid;

    private String userName;

    private String userTitle;

    private Integer heartCount;

    private Integer getIntegral;

    private String inTime;

    private String message;

    private String smile3;

    private Integer commentCount;

    private Integer isegis;

    private String videopath;

    private String userDepart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid == null ? null : userGuid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle == null ? null : userTitle.trim();
    }

    public Integer getHeartCount() {
        return heartCount;
    }

    public void setHeartCount(Integer heartCount) {
        this.heartCount = heartCount;
    }

    public Integer getGetIntegral() {
        return getIntegral;
    }

    public void setGetIntegral(Integer getIntegral) {
        this.getIntegral = getIntegral;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime == null ? null : inTime.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getSmile3() {
        return smile3;
    }

    public void setSmile3(String smile3) {
        this.smile3 = smile3 == null ? null : smile3.trim();
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getIsegis() {
        return isegis;
    }

    public void setIsegis(Integer isegis) {
        this.isegis = isegis;
    }

    public String getVideopath() {
        return videopath;
    }

    public void setVideopath(String videopath) {
        this.videopath = videopath == null ? null : videopath.trim();
    }

    public String getUserDepart() {
        return userDepart;
    }

    public void setUserDepart(String userDepart) {
        this.userDepart = userDepart == null ? null : userDepart.trim();
    }
}