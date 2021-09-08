package com.sendyit.experiments;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: hello.proto")
public final class HelloGrpcGrpc {

  private HelloGrpcGrpc() {}

  public static final String SERVICE_NAME = "hello.HelloGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sendyit.experiments.HelloRequest,
      com.sendyit.experiments.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.sendyit.experiments.HelloRequest.class,
      responseType = com.sendyit.experiments.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sendyit.experiments.HelloRequest,
      com.sendyit.experiments.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.sendyit.experiments.HelloRequest, com.sendyit.experiments.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = HelloGrpcGrpc.getSayHelloMethod) == null) {
      synchronized (HelloGrpcGrpc.class) {
        if ((getSayHelloMethod = HelloGrpcGrpc.getSayHelloMethod) == null) {
          HelloGrpcGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.sendyit.experiments.HelloRequest, com.sendyit.experiments.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sendyit.experiments.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sendyit.experiments.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloGrpcMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloGrpcStub>() {
        @java.lang.Override
        public HelloGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloGrpcStub(channel, callOptions);
        }
      };
    return HelloGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloGrpcBlockingStub>() {
        @java.lang.Override
        public HelloGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloGrpcBlockingStub(channel, callOptions);
        }
      };
    return HelloGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloGrpcFutureStub>() {
        @java.lang.Override
        public HelloGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloGrpcFutureStub(channel, callOptions);
        }
      };
    return HelloGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.sendyit.experiments.HelloRequest request,
        io.grpc.stub.StreamObserver<com.sendyit.experiments.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sendyit.experiments.HelloRequest,
                com.sendyit.experiments.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloGrpcStub extends io.grpc.stub.AbstractAsyncStub<HelloGrpcStub> {
    private HelloGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloGrpcStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.sendyit.experiments.HelloRequest request,
        io.grpc.stub.StreamObserver<com.sendyit.experiments.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloGrpcBlockingStub> {
    private HelloGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sendyit.experiments.HelloReply sayHello(com.sendyit.experiments.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<HelloGrpcFutureStub> {
    private HelloGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sendyit.experiments.HelloReply> sayHello(
        com.sendyit.experiments.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.sendyit.experiments.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.sendyit.experiments.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sendyit.experiments.HelloGrpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloGrpc");
    }
  }

  private static final class HelloGrpcFileDescriptorSupplier
      extends HelloGrpcBaseDescriptorSupplier {
    HelloGrpcFileDescriptorSupplier() {}
  }

  private static final class HelloGrpcMethodDescriptorSupplier
      extends HelloGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloGrpcFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
