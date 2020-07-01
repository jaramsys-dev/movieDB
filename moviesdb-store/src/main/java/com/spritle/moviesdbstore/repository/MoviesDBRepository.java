/**
 * Repository Interface for moviesDB
 * Create by Janarthanam 29/06/2020
 **/
package com.spritle.moviesdbstore.repository;

import org.springframework.stereotype.Repository;
import com.spritle.moviesdbcore.model.MovieDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MoviesDBRepository extends JpaRepository<MovieDataEntity,Long> {

}
