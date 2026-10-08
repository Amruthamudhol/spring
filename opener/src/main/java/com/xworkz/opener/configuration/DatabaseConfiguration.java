package com.xworkz.opener.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DatabaseConfiguration {

        public void DataBaseConfiguration() {
            System.out.println("created DataBaseConfiguration");
        }


        @Bean
        public DataSource dataSource() {

            DriverManagerDataSource dataSource = new DriverManagerDataSource();

            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/opener");
            dataSource.setUsername("root");
            dataSource.setPassword("4AI22CS005");

            return dataSource;
        }

        @Bean
        public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {

            System.out.println("running entityManagerFactory()");
            System.out.println("internally creating EntityManagerFactory of JPA");

            LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

            entityManagerFactoryBean.setDataSource(dataSource);

            // Entity package
            entityManagerFactoryBean.setPackagesToScan("com.xworkz.opener.entity");

            // Hibernate
            entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());


            return entityManagerFactoryBean;
        }

        @Bean
        public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {

            System.out.println("running transactionManager()");
            JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
            jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
            return jpaTransactionManager;
        }
    }

