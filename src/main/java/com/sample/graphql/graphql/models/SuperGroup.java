package com.sample.graphql.graphql.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SuperGroup {
    private String name;
    private Orientation orientation;
    private List<SuperCharacter> members;
}
