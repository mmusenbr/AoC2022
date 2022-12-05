package com.musenbrock.aoc.twenty22.rockpaperscissors;

public record Game(RockPaperScissors opponentsHand, RockPaperScissors ownHand, GameResult gameResult, int points) {
}
