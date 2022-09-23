package com.apps.lostcard.Repository;

import com.apps.lostcard.Model.RecoveryForm;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FormRepository extends CrudRepository<RecoveryForm, Long>{
        List<RecoveryForm> findByStudentId(String studentId);

}
