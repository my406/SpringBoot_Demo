package com.eastcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.eastcom.outside.bean.OutSideBean;
import com.eastcom.outside.config.OutsideConfiguration;

/**
 * @author:yaobiao
 * @date:2019年3月19日下午1:20:13
 */
@ComponentScan
@EnableAutoConfiguration
//@EnableConfigurationProperties
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getBean(OutSideBean.class));
		System.out.println(context.getBean(OutsideConfiguration.class));
		System.out.println(context.getBeansOfType(Runnable.class));
	}
}

