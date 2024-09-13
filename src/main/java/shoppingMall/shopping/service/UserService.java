package shoppingMall.shopping.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shoppingMall.shopping.domain.User;
import shoppingMall.shopping.dto.AddUserRequest;
import shoppingMall.shopping.dto.UpdateUserRequest;
import shoppingMall.shopping.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    // 회원가입
    public User saveUser(AddUserRequest request) {
        return userRepository.save(request.buildUser());
    }

    // 전체 회원 조회
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // 회원 조회
    public User findByName(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElseThrow(() -> new IllegalArgumentException(userId + "를 가진 회원은 없습니다."));
    }

    // 회원 삭제
    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    // 회원 업데이트(수정)
    public User update(Long userId, UpdateUserRequest request) {
        User updateUser = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException(userId + "를 가진 회원은 없습니다. 따라서 삭제할 수 없습니다."));

        updateUser.update(request.getName(), request.getEmail(), request.getAddress(), request.getPhone());
        return updateUser;
    }
}
