package com.hsbc.cricket.player.factory;

import com.hsbc.cricket.player.repository.IPlayerRepository;
import com.hsbc.cricket.player.repository.PlayerRepositoryImpl;

public class PlayerFactory {
	
	private PlayerFactory() {
		
	}

	public static IPlayerRepository createRepoObject(){
		return new PlayerRepositoryImpl();
	}
}
