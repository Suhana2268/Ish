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
			if(player.getCategory().equalsIgnoreCase("Batsman") && batsMan <= 3) {
				team.add(player);
				batsMan++;
				
			}
			if(player.getCategory().equalsIgnoreCase("Bowler") && bowler <= 3) {
				team.add(player);
				bowler++;
				
			}
			if(player.getCategory().equalsIgnoreCase("Wicketkeeper") && wickKeeper <= 1) {
				team.add(player);
				wickKeeper++;
				
			}
		}
		while(team.size() != 11) {
			for(Player player: players) {
				if(!(team.contains(player))) {
					team.add(player);
			}
		}
		}
		if(team.size() == 11) {
			System.out.println(team);
			return team;
		}
		else {
			throw new TeamNotFoundException();
		}
	}
	
	

}
