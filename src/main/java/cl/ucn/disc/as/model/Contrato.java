package cl.ucn.disc.as.model;

import cl.ucn.disc.as.model.exceptions.IllegalDomainException;
import cl.ucn.disc.as.utils.ValidationUtils;
import io.ebean.annotation.NotNull;
import lombok.*;

import javax.persistence.Entity;

/**
 * The Persona class.
 *
 * @author Marcos Silva.
 */
@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Contrato{

    /**
     * The RUT.
     */

    @NotNull
    @Getter
    @Setter
    private Departamento departamento;


    @NotNull
    @Getter
    @Setter
    private Persona persona;



    @NotNull
    @Getter
    @Setter
    private String fechaPago;


    /**
     *
     *
     * **/
    public static class ContratoBuilder {

        /**
         * @return the persona
         * **/
        public Contrato build(){


            //TODO: agregar resto de validaciones

            return new Contrato(this.departamento,this.persona,this.fechaPago);
        }
    }

}
