package com.ascodev.newshubbackend.repository;

import com.ascodev.newshubbackend.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

}
