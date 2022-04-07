package com.el.StudyManager.repository;

import com.el.StudyManager.dto.CountType;
import com.el.StudyManager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {


    @Query(value="Select * from task order by due_date desc",nativeQuery = true)
    public List<Task> getAllTaskDueDateDesc();


    @Query(value="Select new com.el.StudyManager.dto.CountType(COUNT(*), type) from Task GROUP BY type")
    public List<CountType> getPercentageGroupByType();

}