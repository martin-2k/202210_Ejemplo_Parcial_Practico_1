package co.edu.uniandes.dse.parcialejemplo.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MedicoEntity extends BaseEntity{
    
    private String nombre;
    private String apellido;
    private String registroMedico;
    private String especialidad;

}
