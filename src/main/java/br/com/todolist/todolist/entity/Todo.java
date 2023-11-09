package br.com.todolist.todolist.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "todo")
@Table(name = "todos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descricao;
    private boolean realizado;
    private int prioridade;

}
