package br.com.senac.apiteste;

import br.com.senac.apiteste.controller.CalculadoraController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTesteApplication.class, args);
	}

//	public static void main(String[] args) {
//		CalculadoraController controller = new CalculadoraController();
//
//		System.out.println("Resultado: " + controller.soma(1, 2));
//	}

}
