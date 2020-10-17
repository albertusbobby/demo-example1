package com.example.demoexample1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="user_app")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserApp implements Serializable {

    @Id
    private Long id;
    private String name;
    private String description;

}
