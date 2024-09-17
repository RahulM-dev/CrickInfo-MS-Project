package com.cricket.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cricket.entity.Match;

@EnableJpaRepositories
public interface MatchRepository extends JpaRepository<Match, Integer> {

	Optional<Match> findByTeamHeading(String teamHeading);

}
