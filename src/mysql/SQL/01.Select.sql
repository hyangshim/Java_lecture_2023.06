##############################################
#
# 데이터 조작 언어(DML: Data Manipulation Language)
###############################################
/*
*1. Select
*/
USE world;                        #사용할 데이터 베이스 선
SHOW TABLES;                      #현 데이터베이스 조회
DESC city;                        # city 데이블 구조 보기

/*
SELECT 필드명
	FROM
	JOIN
	WHERE
	GROUP
	HAVING
	ORDER BY
	LIMIT숫자 OFFSET 숫자;
*/

SELECT * FROM city;
SELECT `name`,population FROM city;            # 필드명을 보존하고 싶을때 `back quoto`사용

--1.1 조회 조건 : Where
SELECT `name`,District,population FROM city WHERE countrycode="KOR";
SELECT * FROM city WHERE countrycode="KOR" AND population > 1000000;
SELECT DISTINCT district FROM city WHERE countrycode='kor';   # 고유한 값 - distinct


# 수도권 도시 (서월,인천,경기)
SELECT * FROM city 
	WHERE district='Seoul' OR district='Incheon' OR district='Kyonggi';
SELECT * FROM city 
	WHERE district IN ('Seoul', 'Incheon', 'Kyonggi');
	
# 국내 100만 이상 홀수인 도시 (얼마 사이 between)
SELECT * FROM city 
	WHERE countrycode='KOR' AND 
	population > 1000000 AND population % 2 = 1;
	
# 충청 으로 시작할 하는 도시 like ~%
SELECT * FROM city
	WHERE district like'chungchong%' ;

	
-- 1.2 순서 (Order)
-- 전세게 인구수가 800만이상인 도시를 내림 차순으로 조회
-- ORDER BY ~ DESC
SELECT * FROM city 
	WHERE population >=800000
	ORDER BY population DESC;
	
-- 국내 100만이상 도시를 오름차순으로 조회
SELECT * FROM city 
	WHERE countrycode='kor' and population >=1000000
	ORDER BY population;
	
	
-- 국내 50만 이상인 도시를 광역시를 오름차순,인구수 내림차순으로 조회
SELECT * FROM city 
	WHERE countrycode='kor' and population >=500000
	ORDER BY district ASC,population DESC;   
	
	
--1.3 갯수
-- 전세게 인구수 TOP 10 도시 (limit)
SELECT * FROM city 
	ORDER BY population DESC
	LIMIT 10;

--국내 인구수 TOP 10 도시
SELECT * FROM city 
	WHERE countrycode='kor'
	ORDER BY population DESC
	LIMIT 5;
	
	
--국내 인구수 ToP 11 ~ 20 도시 (OFFSET건너뛰기)
SELECT * FROM city 
	WHERE countrycode='kor'
	ORDER BY population DESC
	LIMIT 10 OFFSET 10;        # 앞에서 10개를 건너뛰고 10개 보여줌
	
	
-- 1.4 함수
SELECT NOW();    # 지금현재 시간

-- 국내 도시의 갯수(COUNT) - 레코드의 갯수
SELECT COUNT(*) FROM city WHERE countrycode='kor';

-- 국내 도시중 인구수 최대와 최소 도시 
SELECT max(population),MIN(population) FROM city 
	WHERE countrycode='kor';
	
-- 국내 도시의 인구수 평균(AVG)
SELECT ROUND(AVG(population)) FROM city 
	WHERE countrycode='kor';
	
-- 컬럼명 바꾸기 (AS)
SELECT round(AVG(population)) AS avgPopulation FROM city 
	WHERE countrycode='kor';	

-- 1.5그룹핑(Grouping)

--국내 광역시도별 도시의 갯수를 내림차순으로 조회
SELECT district,COUNT(*) FROM city 
	WHERE countrycode='kor'GROUP BY district
	ORDER BY COUNT(*) DESC;
	
	
-- 도시의 갯수가 많은 나라 Top 
SELECT countrycode,COUNT(*) FROM city
	GROUP BY countrycode
	ORDER BY COUNT(*) DESC LIMIT 10 ;
	
-- 도시의 평균 인구가 높은 나라 Top 10
SELECT countrycode,round(AVG(population)) AS avgPopulation FROM city
	GROUP BY countrycode
	ORDER BY AVG(population)  DESC LIMIT 10 ;
	
-- 경기도의 도시 이름
SELECT GROUP_CONCAT(`name`) FROM city
	WHERE district ='kyonggi'; 
#Songnam,Puchon,Suwon,Anyang,Koyang,Ansan,Kwangmyong,Pyongtaek,Uijongbu,Yong-in,Kunpo,Namyangju,Paju,Ichon,Kuri,Shihung,Hanam,Uiwang
	
-- 국내 광역시도 이름
SELECT GROUP_CONCAT(`district`) FROM city
	WHERE countrycode='kor';
#Seoul,Pusan,Inchon,Taegu,Taejon,Kwangju,Kyongsangnam,Kyonggi,Kyonggi,Kyonggi,Kyonggi,Chollabuk,Chungchongbuk,Kyonggi,Kyonggi,Kyongsangbuk,Kyongsangnam,Kyongsangnam,Kyonggi,Chungchongnam,Kyongsangnam,Chollabuk,Kyonggi,Kyongsangbuk,Kyonggi,Kyongsangbuk,Chollabuk,Cheju,Kyongsangnam,Chollanam,Chollanam,Kyonggi,Kang-won,Kyonggi,Kang-won,Kyonggi,Kang-won,Chungchongbuk,Kyongsangbuk,Chollanam,Kyongsangbuk,Kyonggi,Kyongsangnam,Kyonggi,Chungchongnam,Kyongsangnam,Kyongsangbuk,Chungchongnam,Kyonggi,Chollabuk,Chungchongbuk,Chungchongnam,Kyonggi,Kyongsangnam,Chungchongnam,Kyongsangbuk,Kyongsangnam,Kyongsangbuk

-- 1.5 그룹 조건 

--국내 도시의 갯수가 5개 이상인 도의 평균 인구수
SELECT district, round(AVG(population)) AS avgPopulation FROM city
	WHERE countrycode ='kor'
	GROUP BY district 
	HAVING COUNT(*) >=5;
	
	
-- 국내 도시의 갯수가 5개 이상인 도의 평균인구수의 top 5
SELECT district, round(AVG(population)) AS avgPopulation FROM city
	WHERE countrycode ='kor'
	GROUP BY district 
	HAVING COUNT(*) >=5
	ORDER BY AVG(population) desc
	LIMIT 5;
	
-- 도시의 갯수가 100개 이상인 국가의 도시인구 평균을 내림차순으로 정렬
SELECT countrycode, COUNT(*), round(AVG(population)) AS avgPopulation FROM city
	GROUP BY countrycode
	HAVING COUNT(*) >=100 
	ORDER BY AVG(population) DESC;
	
	

	
	
	



