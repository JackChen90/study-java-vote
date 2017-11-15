package study.java.vote.smile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import study.java.vote.smile.model.UserInfo;
import study.java.vote.smile.service.IUserInfoService;
import study.java.vote.util.HttpClient;

import java.util.List;
import java.util.Random;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description SmileBrush
 */
@Component
public class SmileBrush {

	Logger logger = LoggerFactory.getLogger(SmileBrush.class);

	@Autowired
	private IUserInfoService userInfoService;

	private static final String URL = "http://zd.cmccdevice.com/smile.api/api/services/AddSmileHeart";

	static final String outUid1 = "dc45614e-b2ba-f343-a532-29a1a4a5250f";
	static final String outUid2 = "d5798a57-a0df-e947-a7a8-b5664b865b4c";
	static final String outUid3 = "fa40a0d4-4a32-4b43-9652-55b7c720106b";
//	static final String outUid3 = "66f4fbfb-76b4-9244-a525-856bc49f1803";

	public void brushSmile() throws InterruptedException {
		List<UserInfo> users = userInfoService.queryUsers(100, 10);
		StringBuffer parameterBuffer1 = new StringBuffer();
		parameterBuffer1.append("OUT_GUID=")
				.append(outUid1).append("&IN_GUID=");
		String paramStr1 = parameterBuffer1.toString();
		StringBuffer parameterBuffer2 = new StringBuffer();
		parameterBuffer2.append("OUT_GUID=")
				.append(outUid2).append("&IN_GUID=");
		String paramStr2 = parameterBuffer2.toString();
		StringBuffer parameterBuffer3 = new StringBuffer();
		parameterBuffer3.append("OUT_GUID=")
				.append(outUid3).append("&IN_GUID=");
		String paramStr3 = parameterBuffer3.toString();

		String result;
		Random random = new Random();
		random.nextInt(200);
		for (int i = 0; i < users.size(); i++) {
			String inUid = users.get(i).getUserGuid();
			if (!outUid1.equals(inUid) && !outUid2.equals(inUid) && !outUid3.equals(inUid)) {
//				result = HttpClient.sendPost(URL, paramStr1 + inUid);
//				logger.info("=== smile brush ===, {}", result + paramStr1 + inUid);
//
//				result = HttpClient.sendPost(URL, paramStr2 + inUid);
//				logger.info("=== smile brush ===, {}", result + paramStr2 + inUid);

				result = HttpClient.sendPost(URL, paramStr3 + inUid);
				logger.info("=== smile brush ===, {}", result + paramStr3 + inUid);

			}

			Thread.currentThread().sleep(1000L + random.nextInt(200));
		}
	}

	public static void main(String[] args) {

		//用户uerid
		String inUid = "d5798a57-a0df-e947-a7a8-b5664b865b4c";
		//参数
		StringBuffer parameterBuffer = new StringBuffer();
		parameterBuffer.append("OUT_GUID=d5798a57-a0df-e947-a7a8-b5664b865b4c&IN_GUID=")
				.append(inUid);
		HttpClient.sendPost("http://zd.cmccdevice.com/smile.api/api/services/AddSmileHeart", parameterBuffer.toString());
	}
}
