import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zg.git.mapper.IUserMapper;
import com.zg.git.service.IUserService;
import com.zg.git.service.impl.UserServiceImpl;

public class DomainMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
				 "classpath:spring.xml","classpath:dubbo-customer.xml"
		});
		context.start();
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		System.out.println(bean.getRedisPort());
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
