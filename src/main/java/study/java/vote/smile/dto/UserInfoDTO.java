package study.java.vote.smile.dto;

import study.java.vote.smile.model.UserInfo;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description UserInfoDTO
 */
public class UserInfoDTO {
	private Integer InfoId;
	private String USER_GUID;
	private String USER_NAME;
	private String USER_DEPART;
	private String USER_TITLE;
	private Integer HEART_COUNT;
	private Integer GET_INTEGRAL;
	private String IN_TIME;
	private String MESSAGE;
	private String SMILE_3;
	private Integer COMMENT_COUNT;
	private Integer HeartCount;
	private Integer ISEGIS;
	private String VideoPath;


	public UserInfo toEntity(){
		UserInfo userInfo = new UserInfo();

		userInfo.setUserGuid(USER_GUID);
		userInfo.setUserName(USER_NAME);
		userInfo.setUserDepart(USER_DEPART);
		userInfo.setUserTitle(USER_TITLE);
		userInfo.setHeartCount(HEART_COUNT);
		userInfo.setGetIntegral(GET_INTEGRAL);
		userInfo.setInTime(IN_TIME);
		userInfo.setMessage(MESSAGE);
		userInfo.setSmile3(SMILE_3);
		userInfo.setCommentCount(COMMENT_COUNT);
		userInfo.setHeartCount(HeartCount);
		userInfo.setIsegis(ISEGIS);
		userInfo.setVideopath(VideoPath);

		return userInfo;
	}

	@Override
	public String toString() {
		return "UserInfoDTO{" +
				"InfoId=" + InfoId +
				", USER_GUID='" + USER_GUID + '\'' +
				", USER_NAME='" + USER_NAME + '\'' +
				", USER_DEPART='" + USER_DEPART + '\'' +
				", USER_TITLE='" + USER_TITLE + '\'' +
				", HEART_COUNT=" + HEART_COUNT +
				", GET_INTEGRAL=" + GET_INTEGRAL +
				", IN_TIME='" + IN_TIME + '\'' +
				", MESSAGE='" + MESSAGE + '\'' +
				", SMILE_3='" + SMILE_3 + '\'' +
				", COMMENT_COUNT=" + COMMENT_COUNT +
				", HeartCount=" + HeartCount +
				", ISEGIS=" + ISEGIS +
				", VideoPath=" + VideoPath +
				'}';
	}

	public Integer getInfoId() {
		return InfoId;
	}

	public void setInfoId(Integer infoId) {
		InfoId = infoId;
	}

	public String getUSER_GUID() {
		return USER_GUID;
	}

	public void setUSER_GUID(String USER_GUID) {
		this.USER_GUID = USER_GUID;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String USER_NAME) {
		this.USER_NAME = USER_NAME;
	}

	public String getUSER_DEPART() {
		return USER_DEPART;
	}

	public void setUSER_DEPART(String USER_DEPART) {
		this.USER_DEPART = USER_DEPART;
	}

	public String getUSER_TITLE() {
		return USER_TITLE;
	}

	public void setUSER_TITLE(String USER_TITLE) {
		this.USER_TITLE = USER_TITLE;
	}

	public Integer getHEART_COUNT() {
		return HEART_COUNT;
	}

	public void setHEART_COUNT(Integer HEART_COUNT) {
		this.HEART_COUNT = HEART_COUNT;
	}

	public Integer getGET_INTEGRAL() {
		return GET_INTEGRAL;
	}

	public void setGET_INTEGRAL(Integer GET_INTEGRAL) {
		this.GET_INTEGRAL = GET_INTEGRAL;
	}

	public String getIN_TIME() {
		return IN_TIME;
	}

	public void setIN_TIME(String IN_TIME) {
		this.IN_TIME = IN_TIME;
	}

	public String getMESSAGE() {
		return MESSAGE;
	}

	public void setMESSAGE(String MESSAGE) {
		this.MESSAGE = MESSAGE;
	}

	public String getSMILE_3() {
		return SMILE_3;
	}

	public void setSMILE_3(String SMILE_3) {
		this.SMILE_3 = SMILE_3;
	}

	public Integer getCOMMENT_COUNT() {
		return COMMENT_COUNT;
	}

	public void setCOMMENT_COUNT(Integer COMMENT_COUNT) {
		this.COMMENT_COUNT = COMMENT_COUNT;
	}

	public Integer getHeartCount() {
		return HeartCount;
	}

	public void setHeartCount(Integer heartCount) {
		HeartCount = heartCount;
	}

	public Integer getISEGIS() {
		return ISEGIS;
	}

	public void setISEGIS(Integer ISEGIS) {
		this.ISEGIS = ISEGIS;
	}

	public String getVideoPath() {
		return VideoPath;
	}

	public void setVideoPath(String videoPath) {
		VideoPath = videoPath;
	}
}
