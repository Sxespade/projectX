package com.dao;

import com.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vitalii on 17.09.2015.
 */
@Repository
public interface Nrepository extends JpaRepository<Task, Long> {


}
