package study.java.vote.smile.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import study.java.vote.smile.model.UserInfo;

import java.util.List;

//@Component("smile_userInfoMapper")
@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int saveUserInfo(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    List<UserInfo> queryAllUsers();
}