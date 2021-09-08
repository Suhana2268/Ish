package com.hsbc.cricket.player.userInterface;

import java.util.Scanner;

import com.hsbc.cricket.player.exception.PlayerFoundException;
import com.hsbc.cricket.player.exception.TeamNotFoundException;
import com.hsbc.cricket.player.factory.PlayerFactory;
import com.hsbc.cricket.player.model.Player;
import com.hsbc.cricket.player.repository.IPlayerRepository;

public class UserModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String status="y";

		while(status.equals("y")) {	
			System.out.println("*****************Main Menu***************");
			System.out.println("press 1 to Add player");
			System.out.println("press 2 to Form team");
		
			System.out.println("Please Enter your choice");
			
			int choice=sc.nextInt();
			
			
			
			IPlayerRepository ip = PlayerFactory.createRepoObject();
			
			switch(choice) {
			case 1: 

				System.out.println("Enter player Id");
				int playerId = sc.nextInt();
				System.out.println("Enter player name");
				String playerName = sc.next();
				System.out.println("Enter player category");
				String category = sc.next();
				System.out.println("Enter player ranking");
				int ranking = sc.nextInt();
				Player p = new Player(playerId, playerName, category, ranking);
				try {
					System.out.println(ip.addPlayer(p));
				} catch (PlayerFoundException e1) {
					
					e1.printStackTrace();
				}
				break;
			case 2: 
				try {
					System.out.println("Hello view");
					System.out.println(ip.formTeam());
				} catch (TeamNotFoundException e) {
					e.printStackTrace();
				}
				break;
			
			
				default: System.out.println("wrong choice");
			}
			System.out.println("Do you want to continue press y/n");
			status=sc.next();
		}

	}

}
