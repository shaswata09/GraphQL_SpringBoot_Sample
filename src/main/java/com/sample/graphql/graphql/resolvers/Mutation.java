package com.sample.graphql.graphql.resolvers;

import com.sample.graphql.graphql.models.Orientation;
import com.sample.graphql.graphql.models.SuperCharacter;
import com.sample.graphql.graphql.models.SuperGroup;
import com.sample.graphql.graphql.repos.SuperCharacterRepo;
import com.sample.graphql.graphql.repos.SuperGroupRepo;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mutation implements GraphQLMutationResolver {
    private SuperCharacterRepo characterRepo;
    private SuperGroupRepo groupRepo;

    public Mutation(SuperCharacterRepo superCharacterRepo, SuperGroupRepo superGroupRepo) {
        this.characterRepo = superCharacterRepo;
        this.groupRepo = superGroupRepo;
    }

    public SuperCharacter addCharacter(String name, Integer age, String groupName) {
        return this.characterRepo.addCharacter(name, age, groupName);
    }

    public SuperCharacter deleteCharacter(String id) {
        return this.characterRepo.deleteCharacter(id);
    }

    public SuperGroup addGroup(String name, Orientation orientation) {
        return this.groupRepo.addGroup(name, orientation);
    }
}
