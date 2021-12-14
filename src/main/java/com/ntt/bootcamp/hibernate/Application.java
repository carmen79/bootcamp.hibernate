package com.ntt.bootcamp.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ntt.bootcamp.hibernate.bbdd.Client;
import com.ntt.bootcamp.hibernate.bbdd.Player;
import com.ntt.bootcamp.hibernate.services.ClientService;
import com.ntt.bootcamp.hibernate.services.PlayerService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private ClientService clientService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Estamos haciendo una prueba");
		Player player1 = new Player();
		player1.setId(1);
		player1.setName("Luka");
		player1.setLastName("Doncic");
		player1.setNumber("33");
		player1.setTeam("Dallas Mavericks");
		
		playerService.insertNewPlayer(player1);

		Player playerFromDataBase = playerService.searchPlayerById(1L);
		System.out.println("Player from Data Base:" + playerFromDataBase.getName());
		
		System.out.println("Prueba del Servicio de Clientes");
		Client client = new Client();
		client.setId(5L);
		client.setDni("12345678N");
		client.setName("Karl");
		client.setLastName("John");
		client.setSurname("Sagan");
		
		clientService.insertNewClient(client);

		Client clientFromDataBase = clientService.searchClientById(5L);
		System.out.println("Client from Data Base:" + clientFromDataBase.getName());
	}

}
