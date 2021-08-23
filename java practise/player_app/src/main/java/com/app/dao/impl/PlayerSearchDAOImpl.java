package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.model.Team;

public class PlayerSearchDAOImpl implements PlayerSearchDAO{
	private static Logger log=Logger.getLogger(PlayerSearchDAOImpl.class);

	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		try(Connection connection=MySqlDbConnection.getconnection()){
			String sql="select p.id,name,age,city,gender,sportsName,teamName,contact from Player p JOIN team t on p.teamid=t.id where p.id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				player =new Player();
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsname"));
				player.setContact(resultSet.getLong("contact"));
				Team team=new Team();
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeamName(team);
			}else {
			throw new BusinessException("Entered Player Id "+id+" doesnt exist");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Error contact System Admin");
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
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=MySqlDbConnection.getconnection()){
			String sql="select p.id,name,age,city,gender,sportsName,teamName,contact from Player p JOIN team t on p.teamid=t.id where t.teamName=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player =new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setSportsName(resultSet.getString("sportsname"));
				player.setContact(resultSet.getLong("contact"));
				Team team=new Team();
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeamName(team);
				playerList.add(player);
			}
			if(playerList.size()==0) {
			throw new BusinessException("No players for the team "+ teamName);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Error contact System Admin");
		}
		return playerList;
	}

	public List<Player> getPlayerBySportsName(String sportsname) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
