package ch.bbw.km.hotelbooking.repository;

import ch.bbw.km.hotelbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User getUserByEmail(String email);

    Iterable<User> findByLastname(String lastname);
}
