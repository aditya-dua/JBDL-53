package org.gfg.jbdl53.l16_SB_With_Redis_Cache_MySQL_DB.repo;

import org.gfg.jbdl53.l16_SB_With_Redis_Cache_MySQL_DB.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
