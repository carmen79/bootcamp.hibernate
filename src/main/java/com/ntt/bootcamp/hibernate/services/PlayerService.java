package com.ntt.bootcamp.hibernate.services;

import com.ntt.bootcamp.hibernate.bbdd.Player;

public interface PlayerService {
	public void insertNewPlayer(Player player);
	public Player searchPlayerById(Long id);
}
