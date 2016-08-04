package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lede on 8/4/16.
 */

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
}
