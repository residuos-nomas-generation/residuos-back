package com.generation.backendproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.backendproject.model.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {

}


// ********************************************************************** */
// Codigo antiguo

// import com.generation.backendproject.model.Region;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface RegionRepository extends JpaRepository<Region, Long> {

// }
