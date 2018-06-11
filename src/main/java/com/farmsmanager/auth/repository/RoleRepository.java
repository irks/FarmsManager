package com.farmsmanager.auth.repository;


import com.farmsmanager.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

