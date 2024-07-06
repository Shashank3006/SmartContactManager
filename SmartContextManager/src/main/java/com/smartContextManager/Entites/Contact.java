package com.smartContextManager.Entites;

import java.util.*;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contact {
    @Id
    private String name;

    private String email;

    private String PhoneNumber;

    private String addresh;

    private String picture;
    private boolean favorite=false;

    private List<String> links=new ArrayList<>();
    @ManyToOne
    private User user;



}
