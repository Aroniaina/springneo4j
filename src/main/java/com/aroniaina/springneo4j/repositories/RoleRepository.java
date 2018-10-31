package com.aroniaina.springneo4j.repositories;

import com.aroniaina.springneo4j.domain.Role;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 *
 * @author a.safidy
 */
public interface RoleRepository extends Neo4jRepository<Role, Long> {

}
