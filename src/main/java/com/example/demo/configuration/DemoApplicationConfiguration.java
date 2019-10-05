package com.example.demo.configuration;

import com.example.demo.validator.facade.ValidationFacadeFactory;
import com.example.demo.validator.resolution.factory.ValidationViolationResolverFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoApplicationConfiguration {

    @Bean
    public ServiceLocatorFactoryBean validationFacadeLocatorFactoryBean() {
        final ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(ValidationFacadeFactory.class);
        return serviceLocatorFactoryBean;
    }

    @Bean
    public ServiceLocatorFactoryBean resolverLocatorFactoryBean() {
        final ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(ValidationViolationResolverFactory.class);
        return serviceLocatorFactoryBean;
    }

}
