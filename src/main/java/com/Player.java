package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	private int playerId;
	private String playerName;
	private int playerAge;
	private String playerCountry;
	private String playerTeam;
	private int playerSalary;
	private int playerJerseyNumber;
	private String playerRole;
	
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	public String getPlayerCountry() {
		return playerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}
	public String getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	public int getPlayerSalary() {
		return playerSalary;
	}
	public void setPlayerSalary(int playerSalary) {
		this.playerSalary = playerSalary;
	}
	public int getPlayerJerseyNumber() {
		return playerJerseyNumber;
	}
	public void setPlayerJerseyNumber(int playerJerseyNumber) {
		this.playerJerseyNumber = playerJerseyNumber;
	}
	public String getPlayerRole() {
		return playerRole;
	}
	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", playerCountry=" + playerCountry + ", playerTeam=" + playerTeam + ", playerSalary=" + playerSalary
				+ ", playerJerseyNumber=" + playerJerseyNumber + ", playerRole=" + playerRole + ", getPlayerId()="
				+ getPlayerId() + ", getPlayerName()=" + getPlayerName() + ", getPlayerAge()=" + getPlayerAge()
				+ ", getPlayerCountry()=" + getPlayerCountry() + ", getPlayerTeam()=" + getPlayerTeam()
				+ ", getPlayerSalary()=" + getPlayerSalary() + ", getPlayerJerseyNumber()=" + getPlayerJerseyNumber()
				+ ", getPlayerRole()=" + getPlayerRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


}
