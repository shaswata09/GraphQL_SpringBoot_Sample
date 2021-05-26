package com.sample.graphql.graphql.resolvers;

import com.sample.graphql.graphql.models.SuperCharacter;
import com.sample.graphql.graphql.models.SuperGroup;
import com.sample.graphql.graphql.repos.SuperCharacterRepo;
import com.sample.graphql.graphql.repos.SuperGroupRepo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Query implements GraphQLQueryResolver {

    private SuperCharacterRepo superCharacterRepo;
    private SuperGroupRepo superGroupRepo;

    public Query(SuperCharacterRepo repo, SuperGroupRepo groupRepo) {
        this.superCharacterRepo = repo;
        this.superGroupRepo = groupRepo;
    }

    public List<SuperCharacter> characters() {
        return this.superCharacterRepo.getCharacters();
    }

    public SuperCharacter characterById(String id) {
        return superCharacterRepo.getCharacterById(id);
    }

    public List<SuperGroup> groups() {
        return this.superGroupRepo.getGroups();
    }

    public SuperGroup groupByName(String name) {
        return this.superGroupRepo.getGroupByName(name);
    }

}
