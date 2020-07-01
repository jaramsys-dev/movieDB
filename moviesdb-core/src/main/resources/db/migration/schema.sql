/**
  * Database Schema
  * SQL script
  * Create by Janarthanam 29/06/2020
 **/

DROP TABLE IF EXISTS MOVIE_MASTER;

//Master table to store movie details
CREATE TABLE MOVIE_MASTER (
                         id BIGINT AUTO_INCREMENT,
                         title VARCHAR(100) NOT NULL,
                         original_language VARCHAR(20) NOT NULL,
                         genres VARCHAR(100) NOT NULL,
                         certification VARCHAR(100) NOT NULL,
                         budget VARCHAR(100) NOT NULL,
                         box_office VARCHAR(100) NOT NULL,
                         overview VARCHAR NOT NULL,
                         starring VARCHAR NOT NULL,
                         directors VARCHAR NOT NULL,
                         writers VARCHAR NOT NULL,
                         music_directors VARCHAR NOT NULL,
                         running_time VARCHAR(100) NOT NULL,
                         production_companies VARCHAR(100) NOT NULL,
                         status VARCHAR(100) NOT NULL,
                         vote_count INTEGER NOT NULL,
                         mdb_rating DOUBLE NOT NULL,
                         release_date DATE NOT NULL,
                         PRIMARY KEY (id)
);