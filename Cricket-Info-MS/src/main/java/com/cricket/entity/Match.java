package com.cricket.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Match_Table")
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchId;

	private String teamHeading;

	private String matchNumberVenue;

	private String battingTeam;

	private String battingTeamScore;

	private String bowlingTeam;

	private String bowlingTeamScore;

	private String liveText;

	private String matchLink;

	private String textComplete;

	@Enumerated(EnumType.STRING)
	private MatchStatus status;

	private Date date;

	// Creating this method because to set the match status
	public void setMatchStatus() {
		this.status = (textComplete.isBlank()) ? MatchStatus.LIVE : MatchStatus.COMPLETED;
	}

}
