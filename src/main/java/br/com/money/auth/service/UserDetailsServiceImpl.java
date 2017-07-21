package br.com.money.auth.service;

import br.com.money.auth.usuario.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Created by odilon-jr on 17/07/17.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @PersistenceContext
    private EntityManager em;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        StringBuilder jpql = new StringBuilder("SELECT u FROM Usuario u");
        jpql.append(" WHERE u.login = :login");

        TypedQuery<Usuario> query = em.createQuery(jpql.toString(), Usuario.class);

        query.setParameter("login", login);

        try {
            return query.getSingleResult();
        }catch (NoResultException ex){
            throw  new UsernameNotFoundException(String.format("O usuario %s não foi encontrado", login));
        }
    }
}
