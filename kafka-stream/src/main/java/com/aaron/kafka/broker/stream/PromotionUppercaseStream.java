package com.aaron.kafka.broker.stream;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PromotionUppercaseStream {

    @Bean
    public KStream<String, String> kstreamPromotionUppercase(StreamsBuilder builder) {
        KStream<String, String> sourceStream = builder.stream("t.commodity.promotion",
                Consumed.with(Serdes.String(), Serdes.String()));

        KStream<String, String> uppercaseStream = sourceStream.mapValues(s -> s.toUpperCase());
        uppercaseStream.to("t.commodity.promotion-uppercase");

        return sourceStream;
    }
}
