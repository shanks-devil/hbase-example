package om.github.shanks.hbase.example;

import java.util.List;
import java.util.UUID;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.shanks.hbase.example.model.ExampleModel;
import com.github.shanks.hbase.example.service.ExampleService;

public class ExampleServiceTest extends BaseTest {

	@Autowired
	private ExampleService servicel;
	
	@Test
	public void insert() {
		ExampleModel model = new ExampleModel();
		model.setUuid(UUID.randomUUID().toString());
		model.setAdministrator(true);
		model.setCreateTime(DateTime.now());
		model.setName("phoenix");
		model.setNote("desc");
		model.setNumber(100);
		servicel.insert(model);
	}
	
	@Test
	public void find() {
		String uuid = "87ce763b-159f-4b0f-8e3a-32c343bd626f";
		ExampleModel model = servicel.find(uuid);
		Assert.assertEquals(model.getName(), "test");
		System.out.println(model.getCreateTime());
	}
	
	@Test
	public void select() {
		ExampleModel model = new ExampleModel();
		//model.setName("test");
		model.setAdministrator(false);
		List<ExampleModel> list = servicel.select(model);
		Assert.assertTrue(list.isEmpty());
	}
}
