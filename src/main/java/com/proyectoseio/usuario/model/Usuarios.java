
package com.proyectoseio.usuario.model;

//clase para elaborar la entidad de la aplicacion

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;



@Entity 
@Data
public class Usuarios {
    @Id
    @Column (name= "Id usuario")
    private Long iduser;
    
    @Column (name= "Nombres",nullable=false, length = 18)
    private String nomuser;
    
    @Column (nullable=false, length = 15)
    private String apellido;
    
    @Column (unique=true, nullable=false, length = 25)
    private String email;
    
}
