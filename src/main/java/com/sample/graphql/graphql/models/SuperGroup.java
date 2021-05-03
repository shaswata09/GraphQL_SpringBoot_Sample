package com.sample.graphql.graphql.models;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@Slf4j
public class SuperGroup {
    private String name;
    private Orientation orientation;
    private List<SuperCharacter> members;

    public void addCharacter(SuperCharacter superCharacter) {
        if (null == members)
            members = new ArrayList<SuperCharacter>();
        if (null != superCharacter)
            members.add(superCharacter);
    }

    public void removeCharacter(SuperCharacter superCharacter) {
        this.members = this.members.stream()
                .filter(c -> !c.getName().equalsIgnoreCase(superCharacter.getName()))
                .collect(Collectors.toList());
    }
}
