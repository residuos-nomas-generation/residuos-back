package com.generation.backendproject;

import com.generation.backendproject.model.RolUsuario;
import com.generation.backendproject.repository.RolUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackEndProjectApplication {

	@Autowired
	private RolUsuarioRepository rolUsuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackEndProjectApplication.class, args);
	}

	// ********************************************************************** */
	// Codigo antiguo (REVISAR EL HILO DE ROLUSUARIO Y USUARIO CON DTO Y REGISTRO)

	// @Bean
	// public CommandLineRunner initData(RolUsuarioRepository rolUsuarioRepository)
	// {
	// return args -> {
	// // Verificar si los roles predeterminados existen en la base de datos
	// if (!rolUsuarioRepository.existsByDescripcionRol("usuario")) {
	// RolUsuario usuarioRole = new RolUsuario("usuario");
	// rolUsuarioRepository.save(usuarioRole);
	// }
	// if (!rolUsuarioRepository.existsByDescripcionRol("empresa")) {
	// RolUsuario empresaRole = new RolUsuario("empresa");
	// rolUsuarioRepository.save(empresaRole);
	// }
	// if (!rolUsuarioRepository.existsByDescripcionRol("admin")) {
	// RolUsuario adminRole = new RolUsuario("admin");
	// rolUsuarioRepository.save(adminRole);
	// }
	// };
	// }

}
