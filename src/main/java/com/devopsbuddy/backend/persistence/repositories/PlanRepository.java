package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lede on 8/4/16.
 */

@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer>{
}
