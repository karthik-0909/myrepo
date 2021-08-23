package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerDAOImpl implements PlayerDAO{

	@Override
	public List<Player> getALLPlayers() throws BusinessException {
		
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=MySqlDbConnection.getconnection()){
			String sql="select id,name,age,gender,city,sportsName,contact from player order by id";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			
			ResultSet resultSet=preparedstatement.executeQuery();
			while (resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				playerList.add(player);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured, Please contact support");
		}
		return playerList;
	}

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnection.getconnection()){
			String sql="insert into player(id,name,age,gender,city,sportsName,contact) values(?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getCity());
			preparedStatement.setString(5, player.getGender());
			preparedStatement.setString(6, player.getSportsName());
			preparedStatement.setLong(7, player.getContact());
			
			c=preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		
			} 
		return c;
	}

	@Override
	public int updatePlayer(int id, long contact) {
		int n=0;
		try(Connection connection=MySqlDbConnection.getconnection()){
			String sql="update player set contact=? where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			preparedStatement.setInt(2, id);
			
			n=preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return n;
	}

	@Override
	public int deletePlayer(int id) {
		int d=0;
		try(Connection connection=MySqlDbConnection.getconnection()){
			String sql="delete from player where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			d=preparedStatement.executeUpdate();			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return d;
	}

}
