package org.springframework.yf;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.User;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
@Order(1)
public class User2 {

	protected final Log logger = LogFactory.getLog(getClass());

	@Resource
	private User user;

	public User getUser() {
		logger.info("user2#getUser执行了");
		return user;
	}


}
