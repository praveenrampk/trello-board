package com.praveen.trello.board.member;

import com.praveen.trello.board.Board;
import com.praveen.trello.board.member.constants.BoardMemberRole;
import com.praveen.trello.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "board_members")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private BoardMemberRole role;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "joined_at", nullable = false, updatable = false)
    private Date joinedAt;
}
