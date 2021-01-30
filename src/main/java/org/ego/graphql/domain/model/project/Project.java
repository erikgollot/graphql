package org.ego.graphql.domain.model.project;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(32)")
    private String name;
    @OneToMany
    private Set<Risk> risks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Risk> getRisks() {
        return risks;
    }

    public void setRisks(Set<Risk> risks) {
        this.risks = risks;
    }
}
