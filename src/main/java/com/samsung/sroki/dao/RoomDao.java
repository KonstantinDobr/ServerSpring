package com.samsung.sroki.dao;

import com.samsung.sroki.domain.Room;
import com.samsung.sroki.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomDao extends JpaRepository<Room, Long> {
}
