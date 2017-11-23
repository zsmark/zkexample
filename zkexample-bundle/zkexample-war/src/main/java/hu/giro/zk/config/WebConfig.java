package hu.giro.zk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().defaultsDisabled()
                .addHeaderWriter(new StaticHeadersWriter("Cache-Control","no-cache,max-age=0, must-revalidate"))
                .addHeaderWriter(new StaticHeadersWriter("Expires","0")).and().csrf().disable().httpBasic().disable();
    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("ram").password("ram123").roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("ravan").password("ravan123").roles("USER");
//        auth.inMemoryAuthentication().withUser("kans").password("kans123").roles("USER");
//    }
}
