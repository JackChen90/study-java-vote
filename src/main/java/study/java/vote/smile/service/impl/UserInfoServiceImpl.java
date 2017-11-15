package study.java.vote.smile.service.impl;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import study.java.vote.smile.dao.UserInfoMapper;
import study.java.vote.smile.dto.UserInfoDTO;
import study.java.vote.smile.model.UserInfo;
import study.java.vote.smile.service.IUserInfoService;

import java.util.List;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description UserInfoServiceImpl
 */
//@Component("smile_userInfoService")
@Service
public class UserInfoServiceImpl implements IUserInfoService {

	Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public void saveUserInfo(UserInfoDTO userInfoDTO) {
		logger.info("=== saveUserInfo ===, userInfoDTO: {}", userInfoDTO);
		UserInfo userInfo = userInfoDTO.toEntity();
		userInfoMapper.saveUserInfo(userInfo);
	}

	@Override
	public List<UserInfo> queryUsers( Integer pageNum, Integer pageSize) {
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<UserInfo> users = userInfoMapper.queryAllUsers();
		return users;
	}
}
