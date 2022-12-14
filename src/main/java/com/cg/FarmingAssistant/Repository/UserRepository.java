package com.cg.FarmingAssistant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.FarmingAssistant.Entity.User;
@Repository

public interface UserRepository extends JpaRepository<User, java.lang.String> {

}
