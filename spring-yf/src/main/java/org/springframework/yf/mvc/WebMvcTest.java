package org.springframework.yf.mvc;

import org.springframework.JavaConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebMvcTest implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		 AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		 context.register(JavaConfig.class);
		 // 注册dispatcherServlet

		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic dispatcherServlet1 = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
		dispatcherServlet1.setLoadOnStartup(1);
		dispatcherServlet1.addMapping("/yf/*");

	}
}
