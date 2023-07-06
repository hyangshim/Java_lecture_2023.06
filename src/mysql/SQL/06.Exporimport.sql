##############################################
#
# 테이블 Export/import
###############################################

/*
*1. secure_frile_priv 확인
*/

// 쌤계 복붙하기
SELECT * FROM song INTO OUTFILE 
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n';
	
/*
*3. import (File -->Table)
*/
# 데이터 로드
TRUNCATE song;
LOAD DATA INFILE 
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
	INTO TABLE song 
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n';

# 데이터 확인 alter
SELECT * FROM song;
