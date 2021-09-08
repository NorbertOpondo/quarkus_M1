package com.sendyit.experiments;

import java.util.function.BiFunction;

import io.quarkus.grpc.runtime.MutinyClient;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: hello.proto")
public class HelloGrpcClient implements HelloGrpc, MutinyClient<MutinyHelloGrpcGrpc.MutinyHelloGrpcStub> {

    private final MutinyHelloGrpcGrpc.MutinyHelloGrpcStub stub;

    public HelloGrpcClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyHelloGrpcGrpc.MutinyHelloGrpcStub, MutinyHelloGrpcGrpc.MutinyHelloGrpcStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyHelloGrpcGrpc.newMutinyStub(channel));
    }

    @Override
    public MutinyHelloGrpcGrpc.MutinyHelloGrpcStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.sendyit.experiments.HelloReply> sayHello(com.sendyit.experiments.HelloRequest request) {
       return stub.sayHello(request);
    }

}