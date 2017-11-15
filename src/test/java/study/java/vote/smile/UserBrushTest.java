package study.java.vote.smile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import study.java.vote.Application;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description UserBrushTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserBrushTest {

	@Autowired
	private UserBrush userBrush;

	@Test
	public void userBrushTest(){
		userBrush.queryAllUser();
	}
}
