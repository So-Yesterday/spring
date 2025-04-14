package org.springframework.yf.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {

	protected final Log logger = LogFactory.getLog(getClass());

	@Before("execution(* org.springframework.yf.User2.getUser())")
	public void before() {
		logger.info("aspect-before执行");
	}
}
