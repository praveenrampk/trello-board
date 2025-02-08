package com.praveen.trello.comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praveen.trello.comment.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
