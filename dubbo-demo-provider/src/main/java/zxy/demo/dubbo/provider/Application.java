package zxy.demo.dubbo.provider;

import java.util.concurrent.CountDownLatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		(new ClassPathXmlApplicationContext(new String[] { "spring/provider.xml" })).start();

		// 保持main方法不退出
		CountDownLatch latch = new CountDownLatch(1);
		latch.await();
	}

}