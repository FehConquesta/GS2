package br.com.baychronic.gs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe para executar o projeto e acessar as informações
 * pelo localhost:8080
 *
 * @author luiz.biazzola
 */
@SpringBootApplication
public class GsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsApplication.class, args);
	}

}
