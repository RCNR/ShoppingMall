package shoppingMall.shopping.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shoppingMall.shopping.domain.Cart;
import shoppingMall.shopping.domain.Item;
import shoppingMall.shopping.domain.User;
import shoppingMall.shopping.repository.CartRepository;
import shoppingMall.shopping.repository.ItemRepository;
import shoppingMall.shopping.repository.UserRepository;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CartService {

    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;
    private final UserRepository userRepository;

    public Cart findCart(Long userId, Long itemId) {

        /**
         * 엔티티 조회 - 유저, 아이템
         */
        // 유저
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("없는 유저입니다."));

        // 아이템
        Item item = itemRepository.findById(itemId).orElseThrow(() -> new RuntimeException("없는 아이템입니다."));

        // 유저 장바구니 찾기 - 없으면 생성
        Cart userCart = cartRepository.findById(userId).orElseGet(() -> {
            // 없을시 새로 생성
            Cart newCart = new Cart();
            newCart.setId(userId);
            return newCart;
        });
        return userCart;
    }

}
