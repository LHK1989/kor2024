create database mydb1125;
show databases;
use mydb1125;

drop table if exists board;				# 만일 지정한 테이블이 존재하면 테이블 삭제	
create table board(
	num int unsigned auto_increment,	# 게시물의 번호, int 이용한 정수를 저장할 수 있다, unsigned(부호없음) +-21억 -> 0 ~42억
										# auto_increment : 레코드 추가/ 삽입 할 경우 필드의 자동 번호를 부여 한다.
	content longtext,					# 게시물의 내용, longtext 이용한 최대 4g까지 저장할 수 있다.
    writer varchar(100) not null,		# 게시물의 작성자, varchar(100) 이용한 최대 100글자 까지 저장할 수 있다.
    pwd int,							# 게시물의 비밀번호, int 이용한 정수를 저장할 수 있다.
    # 게시물의 식별자(pk) 선정				# 게시물의 번호를 식별자(pk) 선정
    primary key(num)
);
show tables;

# [ 게시물 등록 샘플 SQL ]
# insert : insert into 테이블명 ( 필드명1, 필드명2, 필드명3 ) values ( 값1, 값2, 값3 )
insert into board( content, writer, pwd ) values ( '안녕하세요' , '유재석', 1234 ); #sql 작성
# insert into 

select * from board;

delete from board where num = 1;
