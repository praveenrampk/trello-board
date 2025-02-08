package com.praveen.trello.user;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.praveen.trello.user.interfaces.UserView;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    UserView findByName(String name);

    @Query("SELECT u FROM User u WHERE u.name LIKE :prefix%")
    List<UserView> findByNameStartsWith(@Param("prefix") String prefix);

}
