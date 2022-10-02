package com.example.config

import com.example.dto.Fact
import com.github.javafaker.Faker
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.Message
import org.springframework.messaging.support.MessageBuilder
import java.util.function.Consumer
import java.util.function.Supplier

@Configuration
class StreamConfig {

        @Bean
        fun producerChuckNorris(): Supplier<Message<Fact>> =
            Supplier {
                MessageBuilder.withPayload(Fact(Faker.instance().chuckNorris().fact())).build()
            }

        @Bean
        fun consumerChuckNorris(): Consumer<Message<Fact>> =
            Consumer {
                println( "chuck-norris fact: ${it.payload.message}")
            }

}
