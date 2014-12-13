package org.ygs.dimokratia.repository.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dmk_user")
public class User {

    @Id
    public String username;

    public String name;



}
