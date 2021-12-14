package com.ntt.bootcamp.hibernate.bbdd.dao;

import com.ntt.bootcamp.hibernate.bbdd.Player;

public interface PlayerDao {

	/**
	 * Método que inserta un nuevo jugador
	 * @param player Jugador a guardar
	 */
	public void insert(Player player);
	
	/**
	 * Método que busca un jugador por ID
	 * @param id El ID del jugador
	 * @return El player encontrador
	 */
	public Player searchById(Long id);
}
