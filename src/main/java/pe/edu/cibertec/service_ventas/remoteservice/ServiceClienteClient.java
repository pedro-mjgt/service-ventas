package pe.edu.cibertec.service_ventas.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-clientes")
public interface ServiceClienteClient {

    @GetMapping("/cliente")
    String obtenerClientes();

}
