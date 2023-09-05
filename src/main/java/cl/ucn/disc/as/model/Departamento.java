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
public class Departamento extends BaseModel {

    /**
     * The numero.
     */
    @NotNull
    private int numero;

    /**
     * The piso.
     */
    @NotNull
    private int piso;

    /**
     * The Edificio.
     */
    @NotNull
    private String edificio;

    /**
     * The Dueño.
     */
    @NotNull
    private Persona dueño;


}