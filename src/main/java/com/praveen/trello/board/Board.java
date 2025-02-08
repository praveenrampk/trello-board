package com.praveen.trello.board;

import com.praveen.trello.board.constants.BoardVisibility;
import com.praveen.trello.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "boards")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Board name is required")
    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "visibility", nullable = false)
    private BoardVisibility visibility;

    @ManyToOne
    @JoinColumn(name = "creator_id", nullable = false)
    private User boardCreator;
}
