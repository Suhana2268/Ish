package com.hsbc.cricket.player.model;

public class Player {
	
	private int playerId;
	private String name;
	private String category;
	private int ranking;
	/**
	 * 
	 */
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param playerId
	 * @param name
	 * @param category
	 * @param ranking
	 */
	public Player(int playerId, String name, String category, int ranking) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.category = category;
		this.ranking = ranking;
	}

	/**
	 * @return the playerId
	 */
	public int getPlayerId() {
		return playerId;
	}

	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}

	/**
	 * @param ranking the ranking to set
	 */
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", category=" + category + ", ranking=" + ranking
				+ "]";
	}
	
}
