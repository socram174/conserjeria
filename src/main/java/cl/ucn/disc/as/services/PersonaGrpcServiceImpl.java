package cl.ucn.disc.as.services;

import cl.ucn.disc.as.conserjeria.grpc.PersonaGrpc;
import cl.ucn.disc.as.conserjeria.grpc.PersonaGrpcRequest;
import cl.ucn.disc.as.conserjeria.grpc.PersonaGrpcResponse;
import cl.ucn.disc.as.conserjeria.grpc.PersonaGrpcServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;


/**
 * THe gRPC service class
 *
 * @author Marcos Silva - arquitectura de software
 * */
@Slf4j
public final class PersonaGrpcServiceImpl extends PersonaGrpcServiceGrpc.PersonaGrpcServiceImplBase {

    /**
     * @param request
     * @param responseObserver
     * */
    @Override
    public void retrieve(PersonaGrpcRequest request, StreamObserver<PersonaGrpcResponse> responseObserver){
        log.debug("Retrieving PersonaGrpc with rut ={}", request.getRut());

        PersonaGrpc personaGrpc = PersonaGrpc.newBuilder()
                .setRut("19283745-6")
                .setNombre("Marcos")
                .setApellidos("Silva")
                .setEmail("marcos.silva@alumnos.ucn.cl")
                .setTelefono("+56 9 34532112")
                .build();
        responseObserver.onNext(PersonaGrpcResponse.newBuilder().setPersona(personaGrpc).build());

        responseObserver.onCompleted();
    }
}
