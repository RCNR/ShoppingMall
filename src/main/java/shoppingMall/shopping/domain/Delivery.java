package shoppingMall.shopping.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deliver_id")
    private Long id;

    private String status;
    private String city;
    private String street;
    private String address;

}
