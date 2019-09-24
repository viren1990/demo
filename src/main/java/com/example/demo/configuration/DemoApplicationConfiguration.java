package com.example.demo.configuration;

import com.example.demo.validator.factory.ValidatorFactory;
import com.example.demo.validator.resolution.factory.ValidationViolationResolverFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoApplicationConfiguration {

    @Bean(name = "validatorLocatorFactoryBean")
    public ServiceLocatorFactoryBean validatorLocatorFactoryBean() {
        final ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(ValidatorFactory.class);
        return serviceLocatorFactoryBean;
    }

    @Bean(name = "resolverLocatorFactoryBean" ,autowireCandidate = true)
    public ServiceLocatorFactoryBean resolverLocatorFactoryBean() {
        final ServiceLocatorFactoryBean serviceLocatorFactoryBean1 = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean1.setServiceLocatorInterface(ValidationViolationResolverFactory.class);
        return serviceLocatorFactoryBean1;
    }

}
