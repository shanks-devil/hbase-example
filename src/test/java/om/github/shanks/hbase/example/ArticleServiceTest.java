package om.github.shanks.hbase.example;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.shanks.hbase.example.model.ArticleModel;
import com.github.shanks.hbase.example.service.ArticleService;

public class ArticleServiceTest extends BaseTest {
	
	@Autowired
	private ArticleService articleService;
	
	@Test
	public void insert() {
		ArticleModel model = new ArticleModel();
		model.setArticleId("2");
		model.setOwner("java");
		model.setVote("100");
		articleService.insert(model);
	}
	
	@Test
	public void find() {
		ArticleModel model = articleService.find("1");
		System.out.println(model);
	}
	
	@Test
	public void select() {
		ArticleModel model = new ArticleModel();
		model.setOwner("hbase");
		model.setVote("77");
		List<ArticleModel> list = articleService.select(model);
		System.out.println(list);
	}
	
}
