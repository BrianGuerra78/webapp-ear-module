package org.bguerra.webapp.ear.war.ejb.repositories;

import org.bguerra.webapp.ear.war.ejb.entities.Usuario;

import java.util.List;

public interface UsuariosRepository {
    List<Usuario> listar();
}
