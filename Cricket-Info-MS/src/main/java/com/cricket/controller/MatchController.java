package com.cricket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.entity.Match;
import com.cricket.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	private MatchService matchService;

	@GetMapping("/liveMatches")
	public ResponseEntity<List<Match>> getLiveMatches() {
		return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
	}

	@GetMapping("/allMatches")
	public ResponseEntity<List<Match>> getAllMatches() {
		return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	}

	@GetMapping("/2023CWC-pointsTable")
	public ResponseEntity<?> get2023WorldCupPointsTable() {
		return new ResponseEntity<>(this.matchService.getPointsTable(), HttpStatus.OK);
	}
}
