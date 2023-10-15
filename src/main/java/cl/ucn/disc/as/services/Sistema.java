package cl.ucn.disc.as.services;

import cl.ucn.disc.as.model.Edificio;

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
    Edificio agregar(Edificio edificio);
}