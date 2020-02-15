package com.openclassrooms.P6.repositories;

import com.openclassrooms.P6.models.BankAccountDetail;
import com.openclassrooms.P6.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountDetailRepository extends JpaRepository<BankAccountDetail, Integer> {

    List<BankAccountDetail> findAllByUserId(User userId);
}
