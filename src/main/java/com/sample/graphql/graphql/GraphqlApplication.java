package com.sample.graphql.graphql;

import com.sample.graphql.graphql.repos.SuperCharacterRepo;
import com.sample.graphql.graphql.repos.SuperGroupRepo;
import com.sample.graphql.graphql.resolvers.Mutation;
import com.sample.graphql.graphql.resolvers.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlApplication {

    @Autowired
    SuperCharacterRepo superCharacterRepo;

    @Autowired
    SuperGroupRepo superGroupRepo;

    public static void main(String[] args) {
        SpringApplication.run(GraphqlApplication.class, args);
    }

    @Bean
    public Query query() {
        return new Query(superCharacterRepo, superGroupRepo);
    }

    @Bean
    public Mutation mutation() {
        return new Mutation(superCharacterRepo, superGroupRepo);
    }

}
