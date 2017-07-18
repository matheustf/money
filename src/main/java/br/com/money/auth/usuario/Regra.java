package br.com.money.auth.usuario;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Id;

/**
 * Created by odilon-jr on 17/07/17.
 */
public class Regra implements GrantedAuthority {

    @Id
    private String name;


    @Override
    public String getAuthority() {
        return name;
    }
}
