package shoppingMall.shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateUserRequest {

    private String name;
    private String email;
    private String address;
    private String phone;
}
