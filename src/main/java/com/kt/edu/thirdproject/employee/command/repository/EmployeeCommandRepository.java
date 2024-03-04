package com.kt.edu.thirdproject.employee.command.repository;

import com.kt.edu.thirdproject.employee.command.domain.EmployeeEntity;
import com.kt.edu.thirdproject.employee.command.repository.sql.QueryEmployeeSqls;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCommandRepository extends CrudRepository<EmployeeEntity, Long> {

    @Query(QueryEmployeeSqls.RETV_NEXT_VAL)
    Long retvNextVal();

    @Query(QueryEmployeeSqls.RETV_NEXT_VAL_H2)
    Long retvNextVal_H2();
    
}
