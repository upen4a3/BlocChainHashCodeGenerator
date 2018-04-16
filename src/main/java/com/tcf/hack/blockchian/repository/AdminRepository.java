package com.tcf.hack.blockchian.repository;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tcf.hack.blockchian.domain.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>
{

	
	@Query("SELECT a FROM Admin a WHERE a.flag = :flag")
    List <Admin> findOneWithFlag(@Param("flag")boolean flag);
	@Modifying
	@Query("update Admin a set a.flag = ?1 where a.cust_id = ?2")
	int setFlag(boolean flag, Long cust_id);
}
