package com.emlakcepte.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmlakcepteEmailQueue {
    private String queueName="emlakcepte.notification.email";

    //@Value("${rabbitmq.exchange}")
    private String exchange="emlakcepte.notification.email";


    @Bean
    public Queue emailQueue() {
        return new Queue(queueName, false);
    }
    @Bean
    public DirectExchange emailExchange(){
        return new DirectExchange(exchange);
    }

    @Bean
    public Binding emailbinding(Queue queue, DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("");
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
}

