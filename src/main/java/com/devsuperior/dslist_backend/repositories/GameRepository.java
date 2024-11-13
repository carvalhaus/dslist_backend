package com.devsuperior.dslist_backend.repositories;

import com.devsuperior.dslist_backend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
