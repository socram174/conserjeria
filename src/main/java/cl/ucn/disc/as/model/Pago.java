package cl.ucn.disc.as.model;

import cl.ucn.disc.as.model.exceptions.IllegalDomainException;
import cl.ucn.disc.as.utils.ValidationUtils;
import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

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
public class Pago{

    /**
     * The RUT.
     */
    @NotNull
    private String fechaPago;

    /**
     * The Nombre.
     */
    @NotNull
    private Integer monto;

    /**
     *
     *
     * **/
    public static class PagoBuilder {

        /**
         * @return the persona
         * **/
        public Pago build(){


            //TODO: agregar resto de validaciones

            return new Pago(this.fechaPago,this.monto);
        }
    }

}
