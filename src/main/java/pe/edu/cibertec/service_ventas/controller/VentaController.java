package pe.edu.cibertec.service_ventas.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.service_ventas.remoteservice.ServiceClienteClient;
import pe.edu.cibertec.service_ventas.remoteservice.ServiceInventarioClient;

@RequiredArgsConstructor
@RestController
public class VentaController {

    private final ServiceClienteClient serviceClienteClient;
    private final ServiceInventarioClient serviceInventarioClient;

    @GetMapping("/venta")
    public String listarVentas() {
        return "Lista de ventas";
    }

    @GetMapping("/venta-cliente")
    public String listarVentasClientes() {
        return serviceClienteClient.obtenerClientes();
    }

    @GetMapping("/venta-producto")
    public String listarVentasProductos() {
        return serviceInventarioClient.obtenerProductosStock();
    }

}
