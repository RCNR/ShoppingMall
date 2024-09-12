package shoppingMall.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingMall.shopping.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
