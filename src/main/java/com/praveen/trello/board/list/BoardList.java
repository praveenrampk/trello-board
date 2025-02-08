package com.praveen.trello.board.list;

import com.praveen.trello.board.Board;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "board_lists")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @NotBlank(message = "List name is required")
    @Column(name = "list_name", nullable = false)
    private String listName;

    @Column(name = "current_position", nullable = false)
    private int currentPosition;
}
