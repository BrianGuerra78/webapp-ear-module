package org.bguerra.webapp.ear.war.ejb.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.bguerra.webapp.ear.war.ejb.entities.Usuario;

import java.util.List;

@RequestScoped
public class UsuarioRepositoryImpl implements UsuariosRepository {
    @Inject
    private EntityManager em;

    @Override
    public List<Usuario> listar() {
        return em.createQuery("from Usuario", Usuario.class).getResultList();
    }
}
