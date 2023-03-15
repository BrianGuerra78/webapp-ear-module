package org.bguerra.webapp.ear.war.ejb.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.bguerra.webapp.ear.war.ejb.entities.Usuario;
import org.bguerra.webapp.ear.war.ejb.repositories.UsuariosRepository;

import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    private UsuariosRepository repository;

    @Override
    public List<Usuario> listar() {
        return repository.listar();
    }
}
