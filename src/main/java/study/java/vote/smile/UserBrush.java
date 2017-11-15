package study.java.vote.smile;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import study.java.vote.smile.dto.UserInfoDTO;
import study.java.vote.smile.dto.UserListResponse;
import study.java.vote.smile.service.IUserInfoService;
import study.java.vote.util.HttpClient;

import java.util.List;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description UserBrush
 */
@Component
public class UserBrush {

	@Autowired
//	@Qualifier("smile_userInfoService")
	private IUserInfoService userInfoService;


	public void queryAllUser() {
		Integer displayLength = 10000;
		StringBuilder params = new StringBuilder();
		params.append("UserGuid=d5798a57-a0df-e947-a7a8-b5664b865b4c&DepartName=&UserName=&iDisplayStart=1&iDisplayLength=")
				.append(displayLength);

		String url = "http://zd.cmccdevice.com/smile.api/api/services/GetPagedUserMessageBySearch";
		String result = HttpClient.sendPost(url, params.toString());

		UserListResponse response = new Gson().fromJson(result, UserListResponse.class);

		List<UserInfoDTO> users = response.getResult().getDataList();

		for (int i = 0; i < users.size(); i++) {
			userInfoService.saveUserInfo(users.get(i));
		}
	}
}
