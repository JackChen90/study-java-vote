package study.java.vote.smile.service;

import study.java.vote.smile.dto.UserInfoDTO;
import study.java.vote.smile.model.UserInfo;

import java.util.List;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description IUserInfoService
 */
public interface IUserInfoService {

	void saveUserInfo(UserInfoDTO userInfoDTO);

	List<UserInfo> queryUsers( Integer pageNum, Integer pageSize);
}
