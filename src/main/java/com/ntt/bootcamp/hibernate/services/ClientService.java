package com.ntt.bootcamp.hibernate.services;

import com.ntt.bootcamp.hibernate.bbdd.Client;

public interface ClientService {
	public void insertNewClient(Client client);
	public Client searchClientById(Long id);
	public void updateClient (Client client);
	public void deleteClient (Client client);
	
}
