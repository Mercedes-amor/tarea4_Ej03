package mag.ej04;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ej04Application {

	public static void main(String[] args) {
		SpringApplication.run(Ej04Application.class, args);
		System.out.println("Hola mundo, ejercicio 04");
	}

	// @Bean
	// public CommandLineRunner metodo() {
	// 	return args -> {
	// 		System.out.println("Aplicación arrancada");
	// 	};
	// }

}
