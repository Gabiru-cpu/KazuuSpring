package comm.sevenJava.domain.dtos;

import lombok.Data;

@Data
public class SignUpDTO {
    private String login;
    private String senha;
    private String nome;
    private String email;
}