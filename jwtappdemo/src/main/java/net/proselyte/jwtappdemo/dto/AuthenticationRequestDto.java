package net.proselyte.jwtappdemo.dto;

import lombok.Data;

/**
 * DTO class for authentication (login) request.
 *
 * @author Maria Forkaliuk
 * @version 1.0
 */

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}
