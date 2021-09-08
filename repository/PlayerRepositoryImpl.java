package com.hsbc.cricket.player.repository;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.cricket.player.exception.PlayerFoundException;
import com.hsbc.cricket.player.exception.TeamNotFoundException;
import com.hsbc.cricket.player.model.Player;

public class PlayerRepositoryImpl implements IPlayerRepository{
	
	List<Player> players = new ArrayList<Player>();

	public boolean addPlayer(Player p) throws PlayerFoundException {
		
		int size = 0;
		boolean status = false;
		for(Player player: players) {
			if(player.getPlayerId() != p.getPlayerId()) {
				size++;
			}
		}
		if(size == players.size()) {
			players.add(p);
			status = true;
		}
		else {
			throw new PlayerFoundException();
		}
		return status;
	}

	public List<Player> formTeam() throws TeamNotFoundException {
		// TODO Auto-generated method stub
		List<Player> team = new ArrayList<Player>();
		System.out.println("helloo form team");
		
		int bowler = 0, batsMan = 0, allRounder = 0, wickKeeper = 0;
		
		for(Player player: players) {
			System.out.println("Hello form team 1");
			if(player.getCategory().equalsIgnoreCase("Batsman") && batsMan <= 3) {
				batsMan++;
				team.add(player);
			}
			if(player.getCategory().equalsIgnoreCase("Bowler") && bowler <= 3) {
				bowler++;
				team.add(player);
			}
			if(player.getCategory().equalsIgnoreCase("Wicketkeeper") && wickKeeper <= 1) {
				wickKeeper++;
				team.add(player);
			}
		}
		while(team.size() < 12) {
			System.out.println("Hello form t3");
			for(Player player: players) {
				for(Player teamPlayer: team) {
				if(player.getPlayerId()!= teamPlayer.getPlayerId()) {
					team.add(player);
				}
			}
		}
		}
		if(team.size() == 11) {
			return team;
		}
		else {
			throw new TeamNotFoundException();
		}
	}
	
	

}
