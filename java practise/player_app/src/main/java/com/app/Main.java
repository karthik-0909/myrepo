package com.app;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.search.service.PlayerSearchService;
import com.app.search.service.impl.PlayerSearchServiceImpl;

public class Main {
	
	private static Logger log=Logger.getLogger(Main.class);

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		log.info("Welcome to Player App");
		log.info("-----------------------------");
		
		int ch=0;
		do {
		log.info("\nWhat you wish to do today?");
		log.info("1)Create A New Player");
		log.info("2)Update A Player");
		log.info("3)Delete A Player");
		log.info("4)List All Players");
		log.info("5)Search Players With Various Filters");
		log.info("6)Exit");
		
		try {
		ch=Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {}
		switch (ch) {
		case 1:log.info("under constrion");
			break;
		case 2:log.info("under constrion");
			break;
		case 3:log.info("under constrion");
			break;
		case 4:log.info("under constrion");
			break;
		case 5:int option=0;
		PlayerSearchService playerSearchService=new PlayerSearchServiceImpl();
		do {
			log.info("\nWelcome to Player Search Menu...   Search Players With Various Filters From Below Menu option");
			log.info("1.Search By Player Id");
			log.info("2.Search By Player Name");
			log.info("3.Search By Player Age");
			log.info("4.Search By Player Gender");
			log.info("5.Search By Player City");
			log.info("6.Search By Player TeamName");
			log.info("7.Search By Player SportsName");
			log.info("8.Search By Player Contact");
			log.info("9.Go Back TO Main Menu");
			log.info("Plese Enter A Choice(1-9)");
			
			try {
				option=Integer.parseInt(scanner.nextLine());
			}catch(NumberFormatException e) {
				log.warn(e.getMessage());
				continue;
			}
			
			switch(option) {
			
			case 1:log.info("Enter Player Id to get Player Details");
			try {
				int id=Integer.parseInt(scanner.nextLine());
				Player player=playerSearchService.getPlayerById(id);
				if(player!=null) {
					log.info("PLayer with Id "+id+" found successfully...  Below is the details");
					log.info(player);
				}
			}catch(NumberFormatException e) {
				log.warn("Player Id should be digit only... Try again");
			} catch (BusinessException e) {
				log.warn(e.getMessage());
			}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:log.info("Enter TeamName to get the Players for that Team");
				String teamName=scanner.nextLine();
				try {
					List<Player> playerList=playerSearchService.getPlayerByTeamName(teamName);
					if(playerList!=null && playerList.size()>0) {
						log.info("Total there are "+playerList.size()+" number of Player in the team"+teamName.toUpperCase());
						for(Player player:playerList) 
							log.info(player);
					}
				} catch (BusinessException e) {
					log.warn(e.getMessage());
				}
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			default:log.warn("Invalid choice... Choice should only between Number 1-9 only, Please retry ");
				break;
			}
		}while(option!=9);
			break;
		case 6:log.info("Thank U For Using Player App");
			break;
		default:log.warn("Invalid choice... Choice should only between Number 1-6 only");
			break;
		}
		}while(ch!=6);

	}

}
