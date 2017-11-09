package hu.giro.zk.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ViewResolver;
import org.zkoss.zk.au.http.DHtmlUpdateServlet;
import org.zkoss.zk.ui.http.DHtmlLayoutServlet;
import org.zkoss.zkspringmvc.ZKUrlBasedViewResolver;
import org.zkoss.zkspringmvc.ZKView;
import org.zkoss.zkspringmvc.config.ZKWebMvcConfigurerAdapter;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ZkConfig extends ZKWebMvcConfigurerAdapter {

    @Bean
    public ServletRegistrationBean dHtmlLayoutServlet(){
        Map<String,String> params = new HashMap<>();
        params.put("update-uri","/zkau");
        DHtmlLayoutServlet dHtmlLayoutServlet = new DHtmlLayoutServlet();
        ServletRegistrationBean reg = new ServletRegistrationBean(dHtmlLayoutServlet,"*.zul");//*.zul
        reg.addUrlMappings("*.zhtml");
        reg.setLoadOnStartup(1);
        reg.setInitParameters(params);
        return reg;
    }

    @Bean
    public ServletRegistrationBean dHtmlUpdateServlet(){
        Map<String,String> params = new HashMap<>();
        params.put("update-uri","/zkau/*");
        ServletRegistrationBean reg = new ServletRegistrationBean(new DHtmlUpdateServlet(),"/zkau/*");
        reg.setLoadOnStartup(2);
        reg.setInitParameters(params);
        return reg;
    }

    @Bean
    public ViewResolver viewResolver(){
        ZKUrlBasedViewResolver zkUrlBasedViewResolver = new ZKUrlBasedViewResolver();
        zkUrlBasedViewResolver.setPrefix("/");
        zkUrlBasedViewResolver.setSuffix("");
        zkUrlBasedViewResolver.setViewClass(ZKView.class);
        zkUrlBasedViewResolver.setExposeContextBeansAsAttributes(true);
        return zkUrlBasedViewResolver;
    }

//    @Bean
//    public ServletRegistrationBean springmvc(){
//        ServletRegistrationBean reg = new ServletRegistrationBean(new DispatcherServlet());
//        reg.addInitParameter("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
//        reg.addInitParameter("contextConfigLocation", "hu.giro.zk.config.ZkConfig");
//        reg.setLoadOnStartup(1);
//        return reg;
//    }

}
