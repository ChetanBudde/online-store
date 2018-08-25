package com.retail;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.h2.server.web.WebServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { AppConfig.class, PersistenceJPAConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}

	@Override
	public void onStartup(ServletContext servletContext) 
	  throws ServletException {
	  super.onStartup(servletContext);
	  ServletRegistration.Dynamic servlet = servletContext.addServlet("h2-console", new WebServlet());
	  servlet.setLoadOnStartup(2);
	  servlet.addMapping("/console/*");
	}
}
