package com.sendyit.experiments;

import io.quarkus.grpc.runtime.MutinyService;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: hello.proto")
public interface HelloGrpc extends MutinyService {

    
    io.smallrye.mutiny.Uni<com.sendyit.experiments.HelloReply> sayHello(com.sendyit.experiments.HelloRequest request);
    
    
    

}