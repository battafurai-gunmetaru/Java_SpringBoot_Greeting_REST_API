package com.example.restgreeting.repositories;


import com.example.restgreeting.models.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This repository is used for abstracting the storage, retrieval ond miscellaneous behavior for
 * Greeting Objects.
 */
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
