package com.apps.lostcard.Repository;

import com.apps.lostcard.Model.Staff;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface StaffRepository extends CrudRepository<Staff, Integer>{
    List<Staff> findByStOffice(int stOffice);
    Optional<Staff> findByStFullName(String stFullName);

}