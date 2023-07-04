SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS girl_group;
DROP TABLE IF EXISTS song;




/* Create Tables */

CREATE TABLE girl_group
(
	gid int NOT NULL AUTO_INCREMENT,
	name varchar(32) NOT NULL,
	debut date NOT NULL,
	hit_song_id int,
	PRIMARY KEY (gid)
);


CREATE TABLE song
(
	sid int NOT NULL AUTO_INCREMENT,
	title varchar(32) NOT NULL,
	lyrics varchar(64),
	PRIMARY KEY (sid)
);



