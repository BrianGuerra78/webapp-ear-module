package org.bguerra.webapp.ear.war.ejb.services;

import jakarta.ejb.Local;
import org.bguerra.webapp.ear.war.ejb.entities.Usuario;

import java.util.List;

@Local
public interface UsuarioService {

    List<Usuario> listar();
}
