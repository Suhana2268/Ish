package com.hsbc.cricket.player.repository;

import java.util.List;

import com.hsbc.cricket.player.exception.PlayerFoundException;
import com.hsbc.cricket.player.exception.TeamNotFoundException;
import com.hsbc.cricket.player.model.Player;

public interface IPlayerRepository {
	
	boolean addPlayer(Player p) throws PlayerFoundException;
	List<Player> formTeam() throws TeamNotFoundException;

}
