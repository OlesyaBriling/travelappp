package com.server.travelapp.routes.Comments;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String text;
}
