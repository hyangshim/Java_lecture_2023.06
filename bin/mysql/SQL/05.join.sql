##############################################
#
# 테이블 조인 (Table join)
###############################################

/*
*1. 테이블 생성
*/

# song table
CREATE TABLE if NOT EXISTS  song(
	sid int NOT NULL AUTO_INCREMENT,
	title varchar(32) NOT NULL,
	lyrics varchar(64),
	PRIMARY KEY (sid)
)AUTO_INCREMENT=101;

# girl_group table
CREATE TABLE if not exists girl_group(
	gid int NOT NULL AUTO_INCREMENT,
	name varchar(32) NOT NULL,
	debut date NOT NULL,
	hit_song_id int,
	PRIMARY KEY (gid)
) AUTO_INCREMENT=1001;

/*
 * 2. 데이터 입력
 */

# Song table
INSERT INTO song (title, lyrics) 
	VALUES ('Tell Me', 'tell me tell me tetetete tel me'),
	('Gee', 'GEE GEE GEE GEE GEE BABY BABY'),
	('미스터', '이름이 뭐야 미스터'), 
	('Abracadabra', '이러다 미쳐 내가 여리여리'),
	('8282', 'Give me a call Baby baby'), ('기대해', '기대해'),
	('I Dont care', '다른 여자들의 다리를'), 
	('Bad Girl Good Girl', '앞에선 한 마디 말도'), ('피노키오', '뉴예삐오'),
	('별빛달빛', '너는 내 별빛 내 마음의 별빛'), 
	('A', 'A 워오우 워오우워 우우우'),
	('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고'), ('LUV', '설레이나요 '),
	('짧은치마', '짧은 치마를 입고 내가 길을 걸으면'),
	('위아래', '위 아래 위위 아래'), ('Dumb Dumb', '너 땜에 하루종일');

# Girl group table
INSERT INTO girlGroup (name, debut, hit_Song_Id)
	VALUES ('원더걸스', '2007-02-10', 101),
	('소녀시대', '2007-08-02', 102), ('카라', '2009-07-30', 103),
	('브라운아이드걸스', '2008-01-17', 104), ('다비치', '2009-02-27', 105),
	('2NE1', '2009-07-08', 106), ('f(x)', '2011-04-20', 108),
	('시크릿', '2011-01-06', 109), ('레인보우', '2010-08-12', 110),
	('애프터 스쿨', '2009-11-25', 120), ('포미닛', '2009-08-28', 121);

/*
 * 3. Table join
 */
# Inner join
SELECT r.name,r.debut,l.title,l.lyrics FROM song AS l
	INNER JOIN girl_group AS r
	ON l.sid = r.hit_song_id;
	
	
# left join - song table에 있고 girl_group_table에 없는 모든 내용이 선택됨
SELECT r.name,r.debut,l.title,l.lyrics FROM song AS l
	LEFT  JOIN girl_group AS r
	ON l.sid = r.hit_song_id;

# Right join - song table에 없고 gril_group table에 있는 내용도 선택됨
SELECT r.name,r.debut,l.title,l.lyrics FROM song AS l
	Right  JOIN girl_group AS r
	ON l.sid = r.hit_song_id;
	
# Full outer join - mysql에서는 제공하지 않음
SELECT r.name,r.debut,l.title,l.lyrics FROM song AS l
	LEFT   JOIN girl_group AS r
	ON l.sid = r.hit_song_id
UNION 
SELECT r.name,r.debut,l.title,l.lyrics FROM song AS l
	Right  JOIN girl_group AS r
	ON l.sid = r.hit_song_id;
	
/*
 * 4. 연습문제
 */	
# 2007년도 데뷔한 걸그룹
SELECT * FROM girl_group 
	WHERE debut LIKE '2007%'
	
# 2009년도 데뷔한 걸그룹 힛트송은





# 데뷔일자가 빠른 5개 그룹의 힛트송은?
SELECT r.name,r.debut,l.title FROM song AS l
	INNER  JOIN girl_group AS r
	ON l.sid = r.hit_song_id
	ORDER BY debut
	LIMIT 5;

# 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?
SELECT continent, COUNT(*) noc,SUM(GNP) sumGnp,AVG(GNP) avgGnp
	FROM country
	GROUP BY continent;
	
	
#아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
(대륙명, 국가명, 도시명, 인구수)
SELECT l.Continent,r.Name,l.Name,r.Population FROM country l
	INNER JOIN city r
	ON l.Code =r.CountryCode
	WHERE continent ='Asia'
	ORDER BY r.population DESC 
	LIMIT 10;


# 전 세계에서 인구가 가장 많은 10개 도시에서 사용하는 공식언어는?
(도시명, 인구수, 언어명)
SELECT l.Name,l.Population,r.`Language` FROM city AS l
	JOIN countrylanguage AS r
	ON l.CountryCode=r.CountryCode
	WHERE r.IsOfficial = "T"
	ORDER BY l.Population DESC 
	LIMIT 10;	

	
	