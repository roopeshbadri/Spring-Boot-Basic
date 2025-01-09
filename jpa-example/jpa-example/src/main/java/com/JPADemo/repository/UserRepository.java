package com.JPADemo.repository;

import com.JPADemo.model.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord,String> {
}
