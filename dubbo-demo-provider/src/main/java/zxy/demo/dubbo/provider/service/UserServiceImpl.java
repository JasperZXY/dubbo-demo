package zxy.demo.dubbo.provider.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import zxy.demo.dubbo.api.domain.User;
import zxy.demo.dubbo.api.service.UserService;

public class UserServiceImpl implements UserService {

	/**
	 * 这里通过模拟查询数据库返回用户信息
	 */
	@Override
	public List<User> queryAll() {
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < 3; i++) {
			Random random = new Random();
			User user = new User();
			user.setAge(random.nextInt(10) + 18);
			user.setId(Long.valueOf(i + 1));
			user.setPassword("123456");
			user.setUsername("name_" + i);
			list.add(user);
		}
		return list;
	}

}
