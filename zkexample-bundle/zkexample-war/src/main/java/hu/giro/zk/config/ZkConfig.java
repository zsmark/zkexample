package hu.giro.zk.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ZkConfig /*extends ZKWebMvcConfigurerAdapter */ {

//    @Bean
//    public ServletRegistrationBean dHtmlLayoutServlet(){
//        Map<String,String> params = new HashMap<>();
//        params.put("update-uri","/zkau");
//        DHtmlLayoutServlet dHtmlLayoutServlet = new DHtmlLayoutServlet();
//        ServletRegistrationBean reg = new ServletRegistrationBean(dHtmlLayoutServlet,"*.zul");//*.zul
//        reg.addUrlMappings("*.zhtml");
//        reg.setLoadOnStartup(1);
//        reg.setInitParameters(params);
//        return reg;
//    }
//
//    @Bean
//    public ServletRegistrationBean dHtmlUpdateServlet(){
//        Map<String,String> params = new HashMap<>();
//        params.put("update-uri","/zkau/*");
//        ServletRegistrationBean reg = new ServletRegistrationBean(new DHtmlUpdateServlet(),"/zkau/*");
//        reg.setLoadOnStartup(2);
//        reg.setInitParameters(params);
//        return reg;
//    }
//
//    @Bean
//    public ViewResolver viewResolver(){
//        ZKUrlBasedViewResolver zkUrlBasedViewResolver = new ZKUrlBasedViewResolver();
//        zkUrlBasedViewResolver.setPrefix("/");
//        zkUrlBasedViewResolver.setSuffix("");
//        zkUrlBasedViewResolver.setViewClass(ZKView.class);
//        zkUrlBasedViewResolver.setApplicationContext(applicationContext);
//        zkUrlBasedViewResolver.setExposeContextBeansAsAttributes(true);
//        return zkUrlBasedViewResolver;
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/");
//        viewResolver.setSuffix(".zul");
//        viewResolver.setExposeContextBeansAsAttributes(true);
//        return viewResolver;
//    }

//    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
//            "classpath:/META-INF/resources/", "classpath:/resources/",
//            "classpath:/static/", "classpath:/public/" };
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        if (!registry.hasMappingForPattern("/webjars/**")) {
//            registry.addResourceHandler("/webjars/**").addResourceLocations(
//                    "classpath:/META-INF/resources/webjars/");
//        }
//        if (!registry.hasMappingForPattern("/**")) {
//            registry.addResourceHandler("/**").addResourceLocations(
//                    RESOURCE_LOCATIONS);
//        }
//    }
//    @Bean
//    public ServletRegistrationBean springmvc(){
//        ServletRegistrationBean reg = new ServletRegistrationBean(new DispatcherServlet());
//        reg.addInitParameter("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
//        reg.addInitParameter("contextConfigLocation", "hu.giro.zk.config.ZkConfig");
//        reg.setLoadOnStartup(1);
//        return reg;
//    }

}
