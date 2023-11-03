package comm.sevenJava.domain.dto;

import lombok.Data;

@Data
public class SignUpDTO {
    private String login;
    private String senha;
    private String nomeCompleto;
    private String email;
}
