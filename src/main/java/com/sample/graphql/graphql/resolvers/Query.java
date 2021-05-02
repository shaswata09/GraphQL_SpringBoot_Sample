package com.sample.graphql.graphql.resolvers;

import com.sample.graphql.graphql.models.SuperCharacter;
import com.sample.graphql.graphql.repos.SuperCharacterRepo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Query implements GraphQLQueryResolver {

    private SuperCharacterRepo superCharacterRepo;

    public Query(SuperCharacterRepo repo) {
        this.superCharacterRepo = repo;
    }

    public List<SuperCharacter> characters() {
        return this.superCharacterRepo.getCharacters();
    }
}
