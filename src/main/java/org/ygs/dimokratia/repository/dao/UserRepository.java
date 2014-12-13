package org.ygs.dimokratia.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ygs.dimokratia.repository.domain.User;

@Repository
public interface UserRepository  extends JpaRepository<User,String>{

}
