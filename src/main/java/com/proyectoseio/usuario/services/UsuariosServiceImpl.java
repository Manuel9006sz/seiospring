/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoseio.usuario.services;

import com.proyectoseio.usuario.model.Usuarios;
import com.proyectoseio.usuario.repository.UsuariosRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class UsuariosServiceImpl implements UsuariosService{
    
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuarios newUsuarios(Usuarios newUsuarios) {
        return usuariosRepository.save(newUsuarios);
    }

    @Override
    public Iterable<Usuarios> getAll() {
        return this.usuariosRepository.findAll();
    }

    @Override
    public Usuarios modifyUsuarios(Usuarios usuarios) {
        
        Optional<Usuarios> usuariosEncontrados= this.usuariosRepository.findById(usuarios.getIduser());
        if(usuariosEncontrados.get()!= null){
            usuariosEncontrados.get().setNomuser(usuarios.getNomuser());
            usuariosEncontrados.get().setApellido(usuarios.getApellido());
            usuariosEncontrados.get().setEmail(usuarios.getEmail());
            return this.newUsuarios(usuariosEncontrados.get());
        }
        
        return null;
    }

    @Override
    public Boolean deleteUsuarios(Long iduser) {
        this.usuariosRepository.deleteById(iduser);
        return true;
    }
    
}
