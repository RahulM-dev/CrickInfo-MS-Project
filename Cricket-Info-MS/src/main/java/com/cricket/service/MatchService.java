package com.cricket.service;

import java.util.List;

import com.cricket.entity.Match;

public interface MatchService {

	List<Match> getLiveMatchScores();

	List<List<String>> getPointsTable();

	List<Match> getAllMatches();
}
