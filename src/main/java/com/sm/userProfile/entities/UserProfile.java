package com.sm.userProfile.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_profile_Id;
    private String username;
    private String password;
    private String email;

    private String firstname;
    private String lastname;
    private Date date_of_birth;
    private String time_of_birth;
    private String gender;
    private String contact_no;

    private String religion;
    private String caste;
    private String community;
    private String zodiac_sign;
    private String gotra;
    private String devak;
    private String blood_group;
    private int height;
    private String complexion;
    private boolean mangal;

    private boolean NRI;
    private boolean PWD;
    private boolean spectacles;
    private String education;
    private String occupation;
    private Long income;
    private String hobbies;
    private String current_address;
    private String permanent_address;

    //family details
    private String father;
    private String mother;
    private String sister;
    private String brother;
    private String parents_occupation;
    private String family_wealth;
    private String maternal_uncle;
    private String paternal_uncle;
    private String relatives; //TODO check max allowed size










}
