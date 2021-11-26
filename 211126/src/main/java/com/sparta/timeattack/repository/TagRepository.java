package com.sparta.timeattack.repository;

import com.sparta.timeattack.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Board, Long> {
}
