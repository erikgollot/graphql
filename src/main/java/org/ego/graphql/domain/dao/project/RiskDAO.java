package org.ego.graphql.domain.dao.project;

import org.ego.graphql.domain.model.project.Risk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskDAO extends JpaRepository<Risk,Long> {
}
