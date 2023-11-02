package comm.sevenJava.domain.services;

import comm.sevenJava.data.repositories.UserRepository;
import comm.sevenJava.domain.dtos.SignUpDTO;
import comm.sevenJava.domain.interfaces.IUserService;
import comm.sevenJava.domain.models.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    public UserService(UserRepository _userRepository) {
        userRepository = _userRepository;
    }

    public User getUser(Integer userId) {
        Optional<User> fndUser = userRepository.findById(userId);

        if (!fndUser.isPresent()) throw new IllegalArgumentException("User not found");

        return fndUser.get();
    }

    public User SignUp(SignUpDTO signUpDTO) {

        User user = new User();
        user.setNome(signUpDTO.getNome());
        user.setLogin(signUpDTO.getLogin());
        user.setEmail(signUpDTO.getEmail());
        user.setSenha(signUpDTO.getSenha());

        User newUser = userRepository.save(user);

        return newUser;
    }

}