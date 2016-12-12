package rx;

import io.netty.buffer.ByteBuf;
import io.reactivex.netty.protocol.http.server.HttpServer;
import io.reactivex.netty.protocol.http.server.HttpServerBuilder;

/**
 * Created by vshakhov on 2016-12-12.
 */
public class HelloWorldServer {
    public static void main(final String[] args) {
        HttpServer<ByteBuf, ByteBuf> server;
        server = new HttpServerBuilder<ByteBuf, ByteBuf>(10000,
                (req, resp) -> {
                    resp.writeString("Some"); return resp.close();  }
        ).build();
        server.startAndWait();
    }
}
