import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.services.PersonaGrpcServiceImpl;
import cl.ucn.disc.as.services.Sistema;
import cl.ucn.disc.as.services.SistemaImpl;
//import cl.ucn.disc.as.ui.ApiRestServer;
//import cl.ucn.disc.as.ui.WebController;
import cl.ucn.disc.as.ui.ApiRestServer;
import cl.ucn.disc.as.ui.WebController;
import io.ebean.DB;
import io.ebean.Database;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;


@Slf4j
public final class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        log.debug("Starting Main...");

        ApiRestServer.start(7070, new WebController());

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

        // Start the gRPC server
        log.debug("Starting the gRPC server...");
        Server server = ServerBuilder
                .forPort(50123)
                .addService(new PersonaGrpcServiceImpl())
                .build();
        server.start();

        // shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(server::shutdown));

        // wait for the stop
        server.awaitTermination();

        log.debug("Done. :)");
    }
}