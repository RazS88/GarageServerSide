package com.garage.Repository;

import com.garage.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Created by raz samari on 03.11.2019.
 */
@Repository
public interface QuestionDao extends JpaRepository<Question,Long> {
}
