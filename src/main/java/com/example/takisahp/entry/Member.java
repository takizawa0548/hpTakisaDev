package com.example.takisahp.entry;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="member")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    private Integer id;
    //名前
    private String name;
    //性別
    private String sex;
    //誕生日
    private String birthdate;
    //電話番号
    private String phonenumber;
    //Eメール
    private String email;
    //国籍
    private String nationality;

}
