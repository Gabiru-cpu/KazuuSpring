package comm.sevenJava.application.controllers;

import comm.sevenJava.domain.dtos.SignUpDTO;
import comm.sevenJava.domain.interfaces.IUserService;
import comm.sevenJava.domain.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private IUserService userService;

    public UserController(IUserService _userService) {
        userService = _userService;
    }

    @GetMapping("/get-user")
    public ResponseEntity<Object> getUser(@RequestParam("userId") Integer userId) {
        try {
            User user = userService.getUser(userId);

            return ResponseEntity.ok(user);
        } catch(Exception ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    @PostMapping("/sign-up")
    public ResponseEntity<Object> signUp(@RequestBody SignUpDTO signUpDTO) {
        try {
            User user = userService.SignUp(signUpDTO);

            return ResponseEntity.ok(user);

        } catch(Exception ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

}
