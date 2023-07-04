##############################################
#
# 날짜/시간 조작
###############################################

/*
*1. 테이블 생성
*/
-- 행 생성됨
CREATE TABLE if NOT EXISTS datetable (
	id INT PRIMARY KEY AUTO_INCREMENT,
	`date` DATE DEFAULT (CURRENT_DATE),
	`datatime` DATETIME DEFAULT CURRENT_TIMESTAMP
);
DESC dateTable;




/*
*2. 데이터 입력
*/


INSERT INTO datetable VALUES (DEFAULT ,DEFAULT ,DEFAULT );
SELECT * FROM datetable;

INSERT INTO datetable(id) VALUES (DEFAULT);


/*
*3. 데이터 조회 
*/
# 2023-07-04 형식
SELECT `date`, DATE_FORMAT(`datetime`, '%Y-%m-%d') FROM datetable;

# 11:25:00 AM 형식
SELECT DATE_FORMAT(`datetime`, '%h:%i:%s %p') FROM datetable;
SELECT DATE_FORMAT(`datetime`, '%r') FROM datetable;

# 23-07-04 11:25 형식
SELECT DATE_FORMAT(`datetime`, '%y-%m-%d %H:%i') AS modTime
	FROM datetable;


--  날짜 조회
SELECT NOW(),CURDATE(),CURTIME()

-- 날짜 더하기 /빼기

-- 오늘날짜부터 40일 더하기
SELECT DATE_ADD(NOW(),INTERVAL 40 DAY)

--이번달부터 3달전 빼기
SELECT DATE_SUB(NOW(),INTERVAL 3 MONTH)

-- D-day 계산
SELECT TO_DAYS('2023-12-25') - TO_DAYS(NOW())

--요일 :1 - 일요일
SELECT DAYOFWEEK(`datetime`) FROM datetable;

