package cl.ucn.disc.as.services;

import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.Persona;
import cl.ucn.disc.as.model.Contrato;
import cl.ucn.disc.as.model.Pago;

import java.util.List;

/**
 * System operations
 *
 * @author Arquitectura de software
 */

public interface Sistema {
    /**
     * Agrega un edificio al sistema
     * @param edificio a agregar
     */
    Edificio add(Edificio edificio);

    Persona add(Persona persona);

    Departamento addDepartamento(Departamento departamento, Edificio edificio);
    Departamento addDepartamento(Departamento departamento, Long idEdificio);


    Contrato realizarContrato(Persona owner, Departamento departamento, String fechaPago);
    Contrato realizarContrato(Long idOwner,Long idDepartamento,String fechaPago);


    List<Contrato> getContratos();
    List<Persona> getPersonas();
    List<Pago> getPagos();

}