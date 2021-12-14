package com.ntt.bootcamp.hibernate.bbdd.dao;

import com.ntt.bootcamp.hibernate.bbdd.Client;

public interface ClientDao {
	/**
	 * Método que inserta un nuevo cliente
	 * @param client cliente a guardar
	 */
	public void insert(Client client);
	
	/**
	 * Método que busca un cliente por ID
	 * @param id El ID del cliente
	 * @return El cliente encontrado
	 */
	public Client searchById(Long id);
	
	/**
	 * Método que actualiza cliente que le pases por parámetro por 
	 * @param client cliente a actualizar
	 
	 */
	public void update(Client client);
	
	/**
	 * Método que elimina un cliente 
	 * @param client cliente a  eliminar
	 
	 */
	public void delete(Client client);
	
	
}
