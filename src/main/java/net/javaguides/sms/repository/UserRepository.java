package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

