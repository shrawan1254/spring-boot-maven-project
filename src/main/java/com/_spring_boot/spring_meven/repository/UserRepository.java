package com._spring_boot.spring_meven.repository;

import com._spring_boot.spring_meven.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
