package org.springframework.yf;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.User;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;


@Component
@Order(1)
public class User2 {

	protected final Log logger = LogFactory.getLog(getClass());

	@Resource
	private User user;

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public User getUser() {
		String sql = "SELECT * FROM ds_user WHERE id = ?";
		Map<String, Object> stringObjectMap = jdbcTemplate.queryForObject(sql, new ColumnMapRowMapper(), 1);
		logger.info("user2#getUser执行了{}"+stringObjectMap);
		return user;
	}


}
