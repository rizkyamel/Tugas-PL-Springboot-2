package com.kuliah.latihanspringboot.model;

import lombok.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    private UUID id_user;

    //GENERAL INFORMATIONS
    private String fname;
    private String lname;
    private String email;

    //AUTHENTICATION INFORMATION
    private String username;
    private String password;
}
