package com.example.demo.config;

import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.graphql.ExecutionGraphQlService;
import org.springframework.graphql.data.method.annotation.support.AnnotatedControllerConfigurer;
import org.springframework.graphql.execution.DefaultExecutionGraphQlService;
import org.springframework.graphql.execution.GraphQlSource;
import org.springframework.graphql.server.GraphQlRSocketHandler;
import org.springframework.http.codec.json.Jackson2JsonEncoder;

import java.util.List;

@Configuration
public class RSocketGraphQlConfig {

//    @Bean
//    public GraphQlRSocketHandler graphQlRSocketHandler(ExecutionGraphQlService graphQlService) {
//        return new GraphQlRSocketHandler(graphQlService, List.of(), new Jackson2JsonEncoder());
//    }
//
//    @Bean
//    ExecutionGraphQlService graphQlService(GraphQlSource graphQlSource) {
//        return new DefaultExecutionGraphQlService(graphQlSource);
//    }
//
//    @Bean
//    GraphQlSource graphQlSource(AnnotatedControllerConfigurer annotatedDataFetcherConfigurer) {
//        return GraphQlSource.builder()
//                .schemaResources(new ClassPathResource("graphql/test-schema.graphqls"))
//                .configureRuntimeWiring(annotatedDataFetcherConfigurer)
//                .build();
//    }
//
//    @Bean
//    AnnotatedControllerConfigurer annotatedDataFetcherConfigurer() {
//        return new AnnotatedControllerConfigurer();
//    }
}
