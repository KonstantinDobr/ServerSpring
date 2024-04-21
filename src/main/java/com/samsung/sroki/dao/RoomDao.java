package com.samsung.sroki.dao;

import com.samsung.sroki.domain.Room;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomDao extends JpaRepository<Room, Long> {
    Room findByLogin(String login);
}
