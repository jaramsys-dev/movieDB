/**
 * Model Class for movie_master
 * Create by Janarthanam 29/06/2020
 **/

package com.spritle.moviesdbcore.model;

import lombok.Data;
import java.sql.Date;
import javax.persistence.*;

@Data
@Entity
@Table(name="MOVIE_MASTER")
public class MovieDataEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "title")
  private String title;

  @Column(name = "original_language")
  private String original_language;

  @Column(name = "genres")
  private String genres;

  @Column(name = "certification")
  private String certification;

  @Column(name = "budget")
  private String budget;

  @Column(name = "box_office")
  private String box_office;

  @Column(name = "overview")
  private String overview;

  @Column(name = "starring")
  private String starring;

  @Column(name = "directors")
  private String directors;

  @Column(name = "writers")
  private String writers;

  @Column(name = "music_directors")
  private String music_directors;

  @Column(name = "running_time")
  private String running_time;

  @Column(name = "production_companies")
  private String production_companies;

  @Column(name = "status")
  private String status;

  @Column(name = "vote_count")
  private Integer vote_count;

  @Column(name = "mdb_rating")
  private Long mdb_rating;

  @Column(name = "release_date")
  private Date release_date;

}
