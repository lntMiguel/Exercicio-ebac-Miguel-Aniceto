package br.com.miguel.ebac.memelandia_users.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import brave.Tracer;
import brave.propagation.TraceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    private final Tracer tracer;

    public FeignConfig(Tracer tracer) {
        this.tracer = tracer;
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                TraceContext traceContext = tracer.currentSpan() != null ? tracer.currentSpan().context() : null;

                if (traceContext != null) {
                    // Adiciona os cabeçalhos automaticamente
                    template.header("X-B3-TraceId", traceContext.traceIdString());
                    template.header("X-B3-SpanId", traceContext.spanIdString());
                    template.header("X-B3-Sampled", "1"); // Pode configurar "0" caso não deseje amostrar
                }
            }
        };
    }

}
