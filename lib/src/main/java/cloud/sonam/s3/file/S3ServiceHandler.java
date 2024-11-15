package cloud.sonam.s3.file;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;
import java.util.OptionalLong;

/**
 * This interface is for handling calls to S3Service.
 */
public interface S3ServiceHandler {
    Mono<ServerResponse> upload(Flux<ByteBuffer> byteBufferFlux, final String uploadType, final String fileName, final String format, final OptionalLong fileContentLength, final String folder);
    Mono<ServerResponse> getPresignUrl(Mono<String> fileKeyMono);
}
