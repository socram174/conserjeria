package cl.ucn.disc.as.services;

import cl.ucn.disc.as.model.exceptions.IllegalDomainException;
import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.Persona;
import cl.ucn.disc.as.model.Contrato;
import cl.ucn.disc.as.model.Pago;
import io.ebean.Database;
import io.ebean.PersistenceIOException;
import org.jetbrains.annotations.NotNull;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.List;
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

    @Override
    public Departamento addDepartamento(@NotNull Departamento departamento, Long idEdificio) {
        try {
            this.database.save(departamento);
        }catch (PersistenceIOException ex){
            log.error("error",ex);
            throw new IllegalDomainException("Error al agrega un edificio");
        }

        //WARN:Need to retrieve the id?
        return departamento;

    }

    @Override
    public Contrato realizarContrato(Persona owner, Departamento departamento, String fechaPago) {
        try {
            Contrato contrato = Contrato.builder()
                    .departamento(departamento)
                    .persona(owner)
                    .fechaPago(fechaPago)
                    .build();
            database.save(contrato);
            return contrato;
        }catch (PersistenceIOException ex){
            log.error("error",ex);
            throw new IllegalDomainException("Error al agrega un edificio");
        }//WARN:Need to retrieve the id

    }

    @Override
    public String realizarContrato(Long idOwner,Long idDepartamento,String fechaPago) {
        try {
            //Departamento departamento = findDepartamentoById(idDepartamento);
            //Persona duenio = findPersonaById(idDuenio);
            //return this.realizarContrato(duenio, departamento, fechaPago);

            return "asdfadf";
        }catch (PersistenceIOException ex){
            log.error("error",ex);
            throw new IllegalDomainException("Error al agrega un edificio");
        }//WARN:Need to retrieve the id

    }

    @Override
    public List<Contrato> getContratos() {
        return database.find(Contrato.class).findList();
    }

    @Override
    public List<Persona> getPersonas() {
        //TODO: Implement offset and max rows
        return database.find(Persona.class).findList();
    }

    @Override
    public List<Pago> getPagos() {
        return database.find(Pago.class).findList();
    }

}