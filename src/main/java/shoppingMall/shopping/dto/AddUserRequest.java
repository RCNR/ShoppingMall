package shoppingMall.shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shoppingMall.shopping.domain.User;

@NoArgsConstructor // 기본
@AllArgsConstructor // 모든 필드값 파라미터로
@Getter
public class AddUserRequest {

    private String name;
    private String email;
    private String address;
    private String phone;

    public User buildUser() {
        return User.builder()
                .name(name)
                .email(email)
                .address(address)
                .phone(phone)
                .build();
    }
}
