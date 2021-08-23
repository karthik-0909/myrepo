package com.app;

import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.TeamDAO;
import com.app.dao.impl.PlayerDAOImpl;
import com.app.dao.impl.TeamDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.model.Team;

public class PlayerMain {

	public static void main(String[] args) {
		PlayerDAO playerDAO=new PlayerDAOImpl();
		try {
		List<Player> playerList;
			playerList = playerDAO.getALLPlayers();
			for(Player player:playerList) 
				System.out.println(player);
			} catch (BusinessException e) {
				System.out.println(e.getMessage());
			
		}		
//	Player player=new Player(101,"Ms Dhoni",35,"Ranchi","M","Cricket",6666666666L);
//		
//	try {
//		if(playerDAO.createPlayer(player)==1) {
//			System.out.println("player created successfully");
//			System.out.println(player);
//		}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		int id=101;
//		long contact=7777777777L;
//		if(playerDAO.updatePlayer(id,contact)==1) {
//			System.out.println("player updated successfully");
//		}
//		else
//			System.out.println("player not found");	
//		
//		if(playerDAO.deletePlayer(id)==1) {
//			System.out.println("PLayer deleted successfully");
//		}
//		else
//			System.out.println("player not found");
		
//		TeamDAO teamDAO=new TeamDAOImpl();
//		
//		Team t1=new Team("KKR");
//		try {
//			t1=teamDAO.createTeam(t1);
//			if(t1.getId()!=0) {
//				System.out.println("team created succeessfully with below details");
//				System.out.println(t1);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e);
//		}
//		
//		try {
//			List<Team> teamList=teamDAO.getAllTeams();
//			if(teamList!= null && teamList.size()>0) {
//				System.out.println("\n\nTotal We have "+teamList.size()+" no of teams in the Team tabel");
//				for(Team team:teamList)
//					System.out.println(team);
//			}
//			
//		} catch (BusinessException e) {
//			System.out.println(e);
//		}
		
		
		

	}
}
