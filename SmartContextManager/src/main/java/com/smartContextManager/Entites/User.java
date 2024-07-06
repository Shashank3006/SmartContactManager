package com.smartContextManager.Entites;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {
    @Id
    private String UserId;
    @Column(nullable = false)
    private String name;
    private String email;
    private String abouts;
    private String mobile;
    private String password;
    @Column(length = 10000,name = "profile_immage")
    private String images;
    private boolean enable =false;
    private boolean emailVerified;
    private boolean mobileVerified;
    private Provider provider=Provider.SELF;
  //private String providerID;
  @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
  private List<Contact> contactlist=new ArrayList<>();
  
}
