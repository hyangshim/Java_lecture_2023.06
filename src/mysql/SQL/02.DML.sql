##############################################
#
# 데이터 조작 언어(DML: Data Manipulation Language)
###############################################
/*   2.Update

	 Update 테이블명
	 SET 필드명 =값[,필드명 =값,필드명 =값,.....]
	 WHERE 조건;
*/
UPDATE city SET `Name` ='수원 ' ,population =1200000
	WHERE id =2340;
	
-- 3. INSERT(삽입)
-- INSERT INTO 테이블명[(필드명)]
--  VALUES (필드값)[,(필드값),....]

-- 강원도 속초 추가 (방법 3가지)
INSERT INTO city(`name`,countrycode,district)
	VALUES ('속초','kor','kang-won');

INSERT INTO city(`name`,countrycode,district,population)
	VALUES ('속초','kor','kang-won',100000);
	
INSERT INTO city    #auto 속성을 갖더라도 임의의 값 부여 가능
	VALUES (DEFAULT ,'속초','kor','kang-won',100000);	
	
--	여려건의 데이터 입력
-- 경기도에 화성시와 의정부시를 추가
INSERT INTO city VALUES 
	(DEFAULT,'화성','kor','kyonggi','500000'),
	(DEFAULT,'의정부','kor','kyonggi','200000');

--	대량 데이터 삽입
-- 국내 도시만으로 된 새로운 데이터 만드는 경우
CREATE TABLE if NOT EXISTS koreancity LIKE city;
DESC koreancity;

-- 데이블 koreancity으로 빼기
INSERT INTO koreancity
	SELECT * FROM city WHERE countrycode='kor';
	
--  DELETE FROM table Where
DELETE FROM city WHERE id=4080;
DELETE FROM city WHERE id between 4082 AND 5000;
	
	
	
	
	