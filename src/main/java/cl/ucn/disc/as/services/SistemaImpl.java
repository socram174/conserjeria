package cl.ucn.disc.as.services;

import cl.ucn.disc.as.exceptions.SistemaException;
import cl.ucn.disc.as.model.Edificio;
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
    public Edificio agregar(@NotNull Edificio edificio) {
        try {
            this.database.save(edificio);
        }catch (PersistenceIOException ex){
            log.error("error",ex);
            throw new SistemaException("Error al agrega un edificio",ex);
        }

        //WARN:Need to retrieve the id?
        return edificio;

    }
}