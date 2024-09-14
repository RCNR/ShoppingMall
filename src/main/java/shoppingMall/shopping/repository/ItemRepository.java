package shoppingMall.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingMall.shopping.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
