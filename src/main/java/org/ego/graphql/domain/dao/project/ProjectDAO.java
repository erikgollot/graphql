package org.ego.graphql.domain.dao.project;

import org.ego.graphql.domain.model.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectDAO extends JpaRepository<Project,Long> {
}
