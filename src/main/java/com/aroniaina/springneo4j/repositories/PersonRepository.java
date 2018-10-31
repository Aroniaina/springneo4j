package com.aroniaina.springneo4j.repositories;

import com.aroniaina.springneo4j.domain.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a.safidy
 */
public interface PersonRepository extends Neo4jRepository<Person, Long> {

	Person findByName(String name);

}
