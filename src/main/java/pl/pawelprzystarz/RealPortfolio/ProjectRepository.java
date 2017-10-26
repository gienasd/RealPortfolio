package pl.pawelprzystarz.RealPortfolio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pawelprzystarz.RealPortfolio.models.Project;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
    List<Project> findAll();
}
