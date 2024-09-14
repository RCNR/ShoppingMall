package shoppingMall.shopping.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import shoppingMall.shopping.domain.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
