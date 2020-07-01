/**
 * Controller Class for moviesDB
 * Create by Janarthanam 29/06/2020
 **/

package com.spritle.moviesdb.controller;


import java.util.Map;
import java.util.List;
import java.util.HashMap;
import javax.validation.Valid;


import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import com.spritle.moviesdbcore.model.MovieDataEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.PageRequest;
import com.spritle.moviesdbstore.repository.MoviesDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.spritle.moviesdb.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1")
public class MoviesDBController {

  @Autowired
  private MoviesDBRepository moviesDBRepository;

  // API to get all movies details
  @GetMapping("/list")
  public List<MovieDataEntity> getAllMovies() {
    return moviesDBRepository.findAll();
  }


  //api to get movie details by id
  @GetMapping("/movie/{id}")
  public ResponseEntity<MovieDataEntity> getMovieById(@PathVariable(value = "id") Long movieId) throws ResourceNotFoundException {
    MovieDataEntity movieDataEntity = moviesDBRepository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("Movie details Not Found. Invalid movie id:" + movieId));
    return ResponseEntity.ok().body(movieDataEntity);
  }


  // API to add movie details
  @PostMapping("/create")
  public MovieDataEntity createMovie(@Valid @RequestBody MovieDataEntity movieDataEntity) {
    return moviesDBRepository.save(movieDataEntity);
  }


  // API to edit movie detail by id
  @PutMapping("/rating/{id}")
  public ResponseEntity<MovieDataEntity> updateMovieRating(@PathVariable(value = "id") Long movieId,
                                                     @Valid @RequestBody Long mdbRating) throws ResourceNotFoundException {
    MovieDataEntity movieDataEntity = moviesDBRepository.findById(movieId)
            .orElseThrow(() -> new ResourceNotFoundException("Movie not found for this id :: " + movieId));

    movieDataEntity.setMdb_rating(mdbRating);
    final MovieDataEntity updatedMovie = moviesDBRepository.save(movieDataEntity);
    return ResponseEntity.ok(updatedMovie);
  }


  // API to delete movie by id
  @DeleteMapping("/movie/{id}")
  public Map<String, Boolean> deleteMovie(@PathVariable(value = "id") Long movieId)
          throws ResourceNotFoundException {
    MovieDataEntity movieDataEntity = moviesDBRepository.findById(movieId)
            .orElseThrow(() -> new ResourceNotFoundException("Movie not found for this id :: " + movieId));

    moviesDBRepository.delete(movieDataEntity);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  }


  // API to get list of movies for pagination
  @GetMapping("/movie/{pageNumber}/{pageSize}")
  public List<MovieDataEntity> getAllMovies(@PathVariable(value = "pageNumber") Integer pageNumber, @PathVariable(value = "pageSize") Integer pageSize) throws ResourceNotFoundException {

    List<MovieDataEntity> movieDataList = null;
    Pageable paging = PageRequest.of(pageNumber, pageSize);

    Page<MovieDataEntity> pageMovieList = moviesDBRepository.findAll(paging);
    movieDataList = pageMovieList.getContent();
    if (movieDataList == null || movieDataList.isEmpty())
      throw new ResourceNotFoundException("End of the Page/Invalid Page Number");
    return movieDataList;
  }

}
