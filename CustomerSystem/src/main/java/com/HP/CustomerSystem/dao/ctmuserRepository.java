package com.HP.CustomerSystem.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.HP.CustomerSystem.model.ctmuser;

@Repository
public interface ctmuserRepository extends CrudRepository<ctmuser, String> {
	@Query("Select c from CTMUSER c where c.USERNAME=username and c.PASSWORD=password")
	List<ctmuser> findAllByColumn(@Param("username") String username, @Param("password") String password);

}
