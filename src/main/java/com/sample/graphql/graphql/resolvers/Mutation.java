package com.sample.graphql.graphql.resolvers;

import com.sample.graphql.graphql.models.SuperCharacter;
import com.sample.graphql.graphql.repos.SuperCharacterRepo;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mutation implements GraphQLMutationResolver {
    private SuperCharacterRepo characterRepo;

    public Mutation(SuperCharacterRepo superCharacterRepo) {
        this.characterRepo = superCharacterRepo;
    }

    public SuperCharacter addCharacter(String name, Integer age) {
        return this.characterRepo.addCharacter(name, age);
    }
}
