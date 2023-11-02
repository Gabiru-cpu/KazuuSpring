package comm.sevenJava.domain.interfaces;

import comm.sevenJava.domain.dtos.SignUpDTO;
import comm.sevenJava.domain.models.User;

public interface IUserService {
    User getUser(Integer userId);
    // User getCurrentUser();
    User SignUp(SignUpDTO signUpDTO);

}
