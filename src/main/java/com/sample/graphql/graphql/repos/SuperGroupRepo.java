package com.sample.graphql.graphql.repos;

import com.sample.graphql.graphql.models.Orientation;
import com.sample.graphql.graphql.models.SuperGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class SuperGroupRepo {
    private List<SuperGroup> theGroup = new ArrayList<SuperGroup>();

    public SuperGroupRepo() {
        seedGroups();
    }

    public void seedGroups() {
        SuperGroup G1 = SuperGroup.builder()
                .name("Bad Dudes")
                .orientation(Orientation.VILLAIN)
                .build();
        this.theGroup.add(G1);
    }

    public List<SuperGroup> getGroups() {
        return this.theGroup;
    }

    public SuperGroup addGroup(String name, Orientation orientation) {
        SuperGroup newGroup = SuperGroup.builder()
                .name(name)
                .orientation(orientation)
                .build();
        this.theGroup.add(newGroup);
        return newGroup;
    }

    public SuperGroup getGroupByName(String name) {
        List<SuperGroup> matched = this.theGroup.stream()
                .filter(g -> g.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        return matched.size()>0 ? matched.get(0) : null;
    }
}
