package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import javax.persistence.Entity;


/**
 * The Edificio class.
 *
 * @author Marcos Silva
 */
@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Edificio extends BaseModel {

    /**
     * The Nombre.
     */
    @NotNull
    private String nombre;

    /**
     * The Dirección.
     */
    @NotNull
    private String direccion;

    /**
     * The Pisos.
     */
    @NotNull
    private int pisos;


}
