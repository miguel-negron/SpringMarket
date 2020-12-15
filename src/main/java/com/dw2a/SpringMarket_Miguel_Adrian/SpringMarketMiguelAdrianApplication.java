package com.dw2a.SpringMarket_Miguel_Adrian;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Producto;
import com.dw2a.SpringMarket_Miguel_Adrian.servicios.ProductoService;

@SpringBootApplication
public class SpringMarketMiguelAdrianApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMarketMiguelAdrianApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataProductos(ProductoService ps) {
		return (args) -> {

			for (int i = 1; i < 10; i++) {
				Producto p = new Producto("nombre producto" + i, "descripcion producto" + i, Double.valueOf(i), (Integer) i);
				ps.crearProducto(p);

			}

		};
	}
}
