package com.ntt.bootcamp.hibernate.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntt.bootcamp.hibernate.bbdd.Client;
import com.ntt.bootcamp.hibernate.bbdd.dao.ClientDao;
import com.ntt.bootcamp.hibernate.bbdd.dao.PlayerDao;
import com.ntt.bootcamp.hibernate.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;
	
	@Override
	public void insertNewClient(Client client) {
		
		clientDao.insert(client);
	}

	@Override
	public Client searchClientById(Long id) {
		
		return clientDao.searchById(id);
	}

	@Override
	public void updateClient(Client client) {
		
		clientDao.update(client);
	}

	@Override
	public void deleteClient(Client client) {
		
		clientDao.delete(client);
	}

}
