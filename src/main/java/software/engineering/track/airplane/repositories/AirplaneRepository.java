package software.engineering.track.airplane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import software.engineering.track.airplane.models.Airplane;

@RepositoryRestResource(path = "airplane")
public interface AirplaneRepository extends JpaRepository<Airplane, Long> {
    Iterable<Airplane> findAllByName(String name);
    Iterable<Airplane> findAllByRead(boolean read);
}