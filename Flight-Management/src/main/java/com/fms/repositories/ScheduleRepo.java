package com.fms.repositories;
import java.math.BigInteger;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.Schedule;


@Repository
public interface ScheduleRepo extends CrudRepository<Schedule,String> {


	
}

