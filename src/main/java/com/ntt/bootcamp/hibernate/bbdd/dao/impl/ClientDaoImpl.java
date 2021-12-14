package com.ntt.bootcamp.hibernate.bbdd.dao.impl;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ntt.bootcamp.hibernate.bbdd.Client;
import com.ntt.bootcamp.hibernate.bbdd.dao.ClientDao;


@Repository
public class ClientDaoImpl implements ClientDao {
	
	/**
	 * Manejador de entidades
	 */
	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void insert(Client client) {
	
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(client);
		currentSession.close();
		
	}

	@Override
	public Client searchById(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.find(Client.class, id);
		
	}

	@Override
	@Transactional
	public void update(Client client) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.update(client);
		currentSession.close();
		
	}

	@Override
	@Transactional
	public void delete(Client client) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.delete(client);
		currentSession.close();
		

	}

}
