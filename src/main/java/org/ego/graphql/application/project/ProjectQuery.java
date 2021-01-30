package org.ego.graphql.application.project;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.ego.graphql.domain.dao.project.ProjectDAO;
import org.ego.graphql.domain.model.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class ProjectQuery implements GraphQLQueryResolver {
    @Autowired
    private ProjectDAO projectDAO;

    public List<Project> getAllProjects() {
        return projectDAO.findAll();
    }
}
