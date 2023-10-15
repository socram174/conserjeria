package cl.ucn.disc.as.services;

import cl.ucn.disc.as.model.exceptions.IllegalDomainException;
import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.Persona;
import io.ebean.Database;
import io.ebean.PersistenceIOException;
import io.ebean.annotation.NotNull;
import lombok.extern.slf4j.Slf4j;
/**
 * Sistema implementation
 *
 * @autho arquitectrura de software
 */
@Slf4j
public class SistemaImpl implements Sistema {
    /**
     *  the database
     */
    private final Database database;

    public SistemaImpl(Database database){
        this.database = database;
    }
    /**
     * Agrega un edificio al sistema
     *
     * @param edificio a agregar
     */
    @Override
    public Edificio add(@NotNull Edificio edificio) {
        try {
            this.database.save(edificio);
        }catch (PersistenceIOException ex){
            log.error("error",ex);
            throw new IllegalDomainException("Error al agrega un edificio");
        }

        //WARN:Need to retrieve the id?
        return edificio;

    }

    @Override
    public Persona add(@NotNull Persona persona) {
        try {
            this.database.save(persona);
        }catch (PersistenceIOException ex){
            log.error("error",ex);
            throw new IllegalDomainException("Error al agrega un edificio");
        }

        //WARN:Need to retrieve the id?
        return persona;

    }

    @Override
    public Departamento addDepartamento(@NotNull Departamento departamento, Edificio edificio) {
        try {
            this.database.save(departamento);
            this.database.save(edificio);
        }catch (PersistenceIOException ex){
            log.error("error",ex);
            throw new IllegalDomainException("Error al agrega un edificio");
        }

        //WARN:Need to retrieve the id?
        return departamento;

    }

}