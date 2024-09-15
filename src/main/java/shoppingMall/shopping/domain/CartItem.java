package shoppingMall.shopping.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    private int cartPrice;

    private int count;

    public static CartItem createCartItem(Item item, int cartPrice, int count) {
        CartItem cartItem = new CartItem();
        cartItem.setItem(item);
        cartItem.setCartPrice(cartPrice);
        cartItem.setCount(count);

        return cartItem;
    }
}
