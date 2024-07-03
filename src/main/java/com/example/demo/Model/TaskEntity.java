package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@jakarta.persistence.Entity
@Table(name="TASK-db")

public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date createdDate;
    private String title;
    private String subtitle;
    private String description;
    private Date dueDate;
    private String ps_link;
    private String submission_link;
    private String room_name;
    private boolean create_room;
    private String type;
    private String recruitment;
    private boolean visible;

}
