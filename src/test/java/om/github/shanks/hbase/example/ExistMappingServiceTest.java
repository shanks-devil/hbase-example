package om.github.shanks.hbase.example;

import java.util.List;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.shanks.hbase.example.model.UserAccessModel;
import com.github.shanks.hbase.example.service.UserAccessService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class ExistMappingServiceTest {
	
	@Autowired
	private UserAccessService userAccessService;
	
	@Test
	public void insert() {
		UserAccessModel model = new UserAccessModel();
		model.setIp("127.0.0.1");
		model.setOnLineTime(DateTime.now());
		model.setOffLineTime(DateTime.now());
		model.setProt("80");
		model.setUrl("https://github.com/");
		model.setUserId("docker@aaa.com");
		userAccessService.insert(model);
	}
	
	@Test
	public void find() {
		String userId = "git@aaa.com";
		String url = "https://github.com/";
		UserAccessModel model = userAccessService.find(userId, url);
		System.out.println(model);
	}
	
	@Test
	public void selectByUser() {
		String userId = "git@aaa.com";
		List<UserAccessModel> list = userAccessService.selectByUser(userId);
		System.out.println(list);
	}
	
	@Test
	public void selectByUrl() {
		String url = "https://hub.docker.com/";
		List<UserAccessModel> list = userAccessService.selectByUrl(url);
		System.out.println(list);
	}
	
}
