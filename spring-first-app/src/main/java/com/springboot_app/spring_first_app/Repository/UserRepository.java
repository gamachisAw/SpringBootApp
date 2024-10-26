package com.springboot_app.spring_first_app.Repository;

import com.springboot_app.spring_first_app.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UserRepository extends JpaRepository<User, Long> {
    }


