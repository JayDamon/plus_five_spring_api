package plusfive.spring_api.repository;

import org.springframework.data.repository.CrudRepository;
import plusfive.spring_api.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
