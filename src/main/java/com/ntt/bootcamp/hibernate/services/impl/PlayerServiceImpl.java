package com.ntt.bootcamp.hibernate.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntt.bootcamp.hibernate.bbdd.Player;
import com.ntt.bootcamp.hibernate.bbdd.dao.PlayerDao;
import com.ntt.bootcamp.hibernate.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
	@Override
	public void insertNewPlayer(Player player) {
		playerDao.insert(player);
	}

	@Override
	public Player searchPlayerById(Long id) {
		return playerDao.searchById(id);
	}

}
