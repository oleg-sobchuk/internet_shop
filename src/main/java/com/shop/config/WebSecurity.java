package com.shop.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                    .password("password")
                        .roles("USER");

        auth.inMemoryAuthentication()
                .withUser("admin")
                    .password("password")
                        .roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
            csrf().disable()
            .authorizeRequests()
                    //.antMatchers("/","/hello").permitAll()
                    .antMatchers("/admin/**").hasRole("ADMIN")
                    .antMatchers("/*").authenticated()
                    //.anyRequest().authenticated()
                .and()
                    .formLogin()
                .and()
                    .exceptionHandling().accessDeniedPage("/accessDenied");
    }
}
