package com.ensakh.sitegestion.repository;

import com.ensakh.sitegestion.entity.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository extends JpaRepository<Element,Long> {

}
