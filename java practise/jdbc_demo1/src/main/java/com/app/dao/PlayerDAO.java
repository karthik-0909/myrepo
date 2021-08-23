package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerDAO {
	
	
	public List<Player> getALLPlayers() throws BusinessException;
	public int createPlayer(Player player) throws BusinessException;
	
	public int updatePlayer(int id,long contact);
	public int deletePlayer(int id);

}
