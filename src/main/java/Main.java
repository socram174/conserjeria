import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.services.Sistema;
import cl.ucn.disc.as.services.SistemaImpl;
//import cl.ucn.disc.as.ui.ApiRestServer;
//import cl.ucn.disc.as.ui.WebController;
import io.ebean.DB;
import io.ebean.Database;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public final class Main {

    public static void main(String[] args) {

        log.debug("Starting Main...");

        //ApiRestServer.start(7070, new WebController());

        log.debug("Done...");

//        Database db = DB.getDefault();
//        Sistema sistema = new SistemaImpl(db);
//
//
//        Edificio edificio = Edificio.builder()
//                .nombre("EDIFICIO")
//                .direccion("DIR1")
//                .build();
//
//        Edificio createdEdificio = sistema.add(edificio);
//
//        Departamento departamento = Departamento.builder()
//                .numero(2)
//                .piso(2)
//                .build();
//
//        Departamento departamento2 = Departamento.builder()
//                .numero(4)
//                .piso(4)
//                .build();
//
//        Departamento dpto = sistema.addDepartamento(departamento, edificio);
//        log.debug("Departamento Created ${}", dpto);
//        sistema.addDepartamento(departamento2, createdEdificio.getId());
    }
}