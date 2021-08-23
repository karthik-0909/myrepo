package com.app.search.service.impl;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.search.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService{
	private PlayerSearchDAO playerSearchDAO=new PlayerSearchDAOImpl();

	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		if(id<100 || id>1000) {
			throw new BusinessException("Inavalid Player Id "+id);
		}else {
			//to DAO layer
			player=playerSearchDAO.getPlayerById(id);
			
		}
		
		return player;
	}

	public Player getPlayerByContact(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException {
		List<Player> playerList=null;
		if(teamName.matches("[a-zA-Z]{2,10}")) {
			//code to DAO
			playerList=playerSearchDAO.getPlayerByTeamName(teamName);
			
		}else {
			throw new BusinessException("Invalid TeamName:"+teamName);
		}
		return playerList;
	}

	public List<Player> getPlayerBySportsName(String sportsname) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
