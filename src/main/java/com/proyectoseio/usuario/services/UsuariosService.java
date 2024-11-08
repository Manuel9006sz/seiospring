/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoseio.usuario.services;

import com.proyectoseio.usuario.model.Usuarios;

/**
 *
 * @author Usuario
 */
public interface UsuariosService {
    Usuarios newUsuarios (Usuarios newUsuarios);
    Iterable<Usuarios> getAll();
    Usuarios modifyUsuarios (Usuarios usuarios);
    Boolean deleteUsuarios(Long iduser);
}
