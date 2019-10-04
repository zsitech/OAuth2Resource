package com.cloud.oauth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.http.HttpMethod;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
	
	@Override   
	public void configure(HttpSecurity http) throws Exception{     
		http     
			.authorizeRequests()
	        .antMatchers("/actuator/*").permitAll()	// 放开健康检查的节点权限
	        .and()
			.authorizeRequests()      		
			.antMatchers(HttpMethod.POST, "/protect2").hasRole("ADMIN") 
			.anyRequest()      
			.authenticated();   
		
		
	} 
	

}
