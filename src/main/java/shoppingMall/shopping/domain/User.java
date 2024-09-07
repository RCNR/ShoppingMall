package shoppingMall.shopping.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String email;

    @Column(unique = true) // 전화번호 중복X
    private String phone;

    private LocalDateTime createDate; // 가입날짜

    @OneToMany(mappedBy = "user")
    private List<Orders> orders = new ArrayList<>();


}
