package com.xup.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xup.example.dao")
@SpringBootApplication
public class ReplicaExampleMain {

    public static void main(String[] args) {
        SpringApplication.run(ReplicaExampleMain.class);
    }
}
