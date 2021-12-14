package com.ntt.bootcamp.hibernate.bbdd.dao.impl;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ntt.bootcamp.hibernate.bbdd.Player;
import com.ntt.bootcamp.hibernate.bbdd.dao.PlayerDao;

@Repository
public class PlayerDaoImpl implements PlayerDao {

	/**
	 * Manejador de entidades
	 */
	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void insert(Player player) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(player);
		currentSession.close();
		
	}

	@Override
	public Player searchById(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.find(Player.class, id);
	}

}
