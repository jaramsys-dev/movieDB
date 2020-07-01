/**
  * flyway - database version v1
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
INSERT into MOVIE_MASTER values (
                                    1,
                                    'Inception',
                                    'English',
                                    'Action,Adventure,SciFi',
                                    'PG13',
                                    '160000000 USD',
                                    '830000000 USD',
                                    'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.',
                                    'Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page',
                                    'Steven Spielberg',
                                    'Zak Penn,Ernest Cline',
                                    'Alan Silvestri',
                                    '140 minutes',
                                    'Warner Bros. Pictures,Amblin Partners,Amblin Entertainment',
                                    'Released',
                                    2300,
                                    7.5,
                                    '2018-03-29' );

INSERT into MOVIE_MASTER values (
                                    2,
                                    'Ready Player One',
                                    'English',
                                    'Action,Adventure,SciFi',
                                    'PG13',
                                    '175000000 USD',
                                    '583000000 USD',
                                    'When the creator of a virtual reality called the OASIS dies, he makes a posthumous challenge to all OASIS users to find his Easter Egg, which will give the finder his fortune and control of his world.',
                                    'Tye Sheridan,Olivia Cooke,Ben Mendelsohn',
                                    'Christopher Nolan',
                                    'Christopher Nolan',
                                    'Hans Zimmer',
                                    '148 minutes',
                                    'Legendary Pictures,Syncopy',
                                    'Released',
                                    1600,
                                    8.8,
                                    '2010-07-16' );

INSERT into MOVIE_MASTER values (
                                    3,
                                    'Asuran',
                                    'Tamil',
                                    'Action,Drama',
                                    'UA',
                                    '320000000 INR',
                                    '1000000000 INR',
                                    'The teenage son of a farmer from an underprivileged caste kills a rich, upper caste landlord. Will the farmer, a loving father and a pacifist by heart, be able to save his hot-blooded son is the rest of the story',
                                    'Dhanush,Manju Warrier,Prakash Raj',
                                    'Vetrimaaran',
                                    'M.S.Manimaran,Poomani',
                                    'Hans Zimmer',
                                    '139 minutes',
                                    'V Creations',
                                    'Released',
                                    6500,
                                    8.6,
                                    '2019-10-03' );

INSERT into MOVIE_MASTER values (
                                    4,
                                    'The Avengers',
                                    'English',
                                    'Action,Adventure,SciFi',
                                    'PG13',
                                    '160000000 USD',
                                    '830000000 USD',
                                    'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.',
                                    'Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page',
                                    'Steven Spielberg',
                                    'Zak Penn,Ernest Cline',
                                    'Alan Silvestri',
                                    '140 minutes',
                                    'Warner Bros. Pictures,Amblin Partners,Amblin Entertainment',
                                    'Released',
                                    2300,
                                    7.5,
                                    '2018-03-29' );

INSERT into MOVIE_MASTER values (
                                    5,
                                    'Captain Marvel',
                                    'English',
                                    'Action,Adventure,SciFi',
                                    'PG13',
                                    '175000000 USD',
                                    '583000000 USD',
                                    'When the creator of a virtual reality called the OASIS dies, he makes a posthumous challenge to all OASIS users to find his Easter Egg, which will give the finder his fortune and control of his world.',
                                    'Tye Sheridan,Olivia Cooke,Ben Mendelsohn',
                                    'Christopher Nolan',
                                    'Christopher Nolan',
                                    'Hans Zimmer',
                                    '148 minutes',
                                    'Legendary Pictures,Syncopy',
                                    'Released',
                                    1600,
                                    8.8,
                                    '2010-07-16' );

INSERT into MOVIE_MASTER values (
                                    6,
                                    'Vada Chennai',
                                    'Tamil',
                                    'Action,Drama',
                                    'UA',
                                    '320000000 INR',
                                    '1000000000 INR',
                                    'The teenage son of a farmer from an underprivileged caste kills a rich, upper caste landlord. Will the farmer, a loving father and a pacifist by heart, be able to save his hot-blooded son is the rest of the story',
                                    'Dhanush,Manju Warrier,Prakash Raj',
                                    'Vetrimaaran',
                                    'M.S.Manimaran,Poomani',
                                    'Hans Zimmer',
                                    '139 minutes',
                                    'V Creations',
                                    'Released',
                                    6500,
                                    8.6,
                                    '2019-10-03' );