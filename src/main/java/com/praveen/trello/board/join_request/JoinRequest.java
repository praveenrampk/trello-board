package com.praveen.trello.board.join_request;

import com.praveen.trello.board.Board;
import com.praveen.trello.board.join_request.constants.JoinRequestStatus;
import com.praveen.trello.board.member.Member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "join_requests")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private JoinRequestStatus status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "requested_at", nullable = false, updatable = false)
    private Date requestedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "approved_at")
    private Date approvedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "denied_at")
    private Date deniedAt;
}
