package shoppingMall.shopping.domain;

import jakarta.persistence.*;
import lombok.Builder;
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
    private String address;

    @Column(unique = true) // 전화번호 중복X
    private String phone;

    private LocalDateTime createDate; // 가입날짜

    @Builder
    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
