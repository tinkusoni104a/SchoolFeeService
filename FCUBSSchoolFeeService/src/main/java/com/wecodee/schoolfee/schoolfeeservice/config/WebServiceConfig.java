package com.wecodee.schoolfee.schoolfeeservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import com.wecodee.schoolfee.schoolfeeservice.constant.SchoolFeeServiceConstant;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {


	private static final Logger logger 
    = LoggerFactory.getLogger(WsConfigurerAdapter.class);

	@Value("${webservice.xsd.path}")
	private String xsdPath;

	@Autowired
	ResourceLoader resourceLoader;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(
			ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/SchoolFeeService/*");
	}

	@Bean(name = "SchoolFeeService")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schoolFeeServiceSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("SchoolFeeServicePort");
		wsdl11Definition.setLocationUri("/SchoolFeeService");
		wsdl11Definition.setTargetNamespace(SchoolFeeServiceConstant.NAMESPACE_URI);
		wsdl11Definition.setSchema(schoolFeeServiceSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema SchoolFeeServiceSchema() {
		System.out.println("xsdPath : " + xsdPath);
		logger.info(xsdPath);
		try {
			@SuppressWarnings("resource")
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
			// Resource resource = applicationContext.getResource("file:c:\\testing.txt");
			Resource resource = applicationContext.getResource("file:" + xsdPath + "/SchoolFeeService.xsd");
			return new SimpleXsdSchema(resource);
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(e.toString());
			return null;
		}

		/*
		 * xsdPath+"SchoolFeeService.xsd"
		 * ClassLoader.getSystemResource(xsdPath+"SchoolFeeService.xsd");
		 * 
		 * //return new SimpleXsdSchema(new ClassPathResource(xsdPath)); return new
		 * SimpleXsdSchema(xsdPath);
		 */
	}

}