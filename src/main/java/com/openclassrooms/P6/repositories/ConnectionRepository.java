package com.openclassrooms.P6.repositories;

import com.openclassrooms.P6.models.Connection;
import com.openclassrooms.P6.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, Integer> {

    void deleteByUserId(User userId);
}
