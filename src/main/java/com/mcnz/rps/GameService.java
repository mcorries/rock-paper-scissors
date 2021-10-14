package com.mcnz.rps;

public class GameService {
	

	public GameSummary playRoshambo(String clientGesture) {
		
		String result = "error";
		if (clientGesture.equals("scissors")) {
			result = "win";
		}
		if (clientGesture.equals("paper")) {
			result = "tie";
		}
		if (clientGesture.equals("rock")) {
			result = "lose";
		}
		GameSummary gameSummary = new GameSummary(clientGesture, "paper", result);
		return gameSummary;
	}

}  
  
