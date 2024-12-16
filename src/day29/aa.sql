#1. 데이터 베이스 생성 > 데이터 베이스 자료들의 모임
create database mydb1122;
show databases;

use mydb1122;

create table board(
	bno int unsigned auto_increment,
    -- bno 게시물 번호 - > 숫자 -> 숫자 중에 적절한 타입 - > int
    -- unsigned -> 부호가 없다 - > int ( +- 21 억 ) - > 총 42억 정도
    -- auto_increment - > 레코드 행 표 에값 삽입시 자동으로 번호가 순차적으로 할당 해주는 키워드
	bcontent longtext not null,
    -- longtext - > 게시물의 내용이 많은 내용들이 들어가면 좋을 것 같아서 4g 선택
    -- not null - > 게시물 등록시 게시물 내용은 꼭 공백이 아니면 좋을 것 같아서
    bwriter varchar(100) not null,
    -- varchar - > 작성자는 적절하게 100글자 정도 까지 입력받을 수 있게 선택
    bpwd int not null,
    -- 비밀번호 1234
    primary key( bno)
	-- primary key 이란 ? 식별 키 , 여러개 필드중에서 식별 가능한 필드, 중복x
    -- 게시물 번호를 pk로 사용하는이유? 게시물내용/작성자/비밀번호는 충분히 중복 데이터가 존재할 경우가 크다
    -- 관례적(무조건x, 일반적o)으로 테이블마다 1개 이상의 pk(기본키)필수
    -- ( 주민등록번호o-사람이름x)/ ( 학번 o / 학생이름 x ) / ( 제품번호o/제품명x)/(icbno/도서명x) 
);

# 5. dml : 데이터 조작 어
# https://school.programmers.co.kr/learn/challenges?tab=sql_practice_kit
# (1) select
# select * from 테이블명;
# select 필드명1, 필드명2 from 테이블명;
select * from board;				-- 지정한 테이블의 모든 * 필드의 레코드 조회
select bontent, bwriter from board;	-- 지정한 테이블의 'bcontent'와 'bwriter' 필드들의 레코드 조회
select bcontent, bwriter from board;
# (2) insert
# insert into 테이블명 values ( 값1 , 값2, 값3 )
# insert into 테이블명 ( [값]필드명,[값]필드명,[값]필드명 ) values ( 값,값,값 );
insert into board values( 1, '안녕하세요','유재석',1234);
#insert into board values( '그래안녕', '강호동' , 4567 );  # 오류 발생
insert into board ( bcontent, bwriter, bpwd ) values ( '그래 안녕' , '강호동' ,4567 );

# (3) update : 특정 레코드의 필드값 수정 sql
#update 테이블명 set 수정할필드명 = 새로운값 where 조건필드 = 조건값
update board set bwriter = '하하' where bno = 1;
#update board set bwriter = '하하';  # 레코드 조건이 없으면 전체 수정

# (4) delete : 특정 레코드 삭제 sql
# 1. elete from 테이블명; -- 레코드 전체 삭제
#		delete from 테이블명;
# 2. delete from 테이블명 where 조건필드 = 조건값
#		delete from 테이블명 where 조건필드 = 조건값
delete from board where bno = 1 ; 	-- 만약에 게시물 번호가 1이면 레코드 삭제

# 살숩
/*
[문제1 ] : products 테이블에 새로운 제품을 추가하세요. 제품의 정보는 다음과 같습니다 . 테이블이 존재한다는 가정하에,
	필드명 : 값
    product_id: 201
    product_name: ' wireless mouse '
    category: ' electronics '
    price : 29.99
    stock_quantity: 150
*/
/*
	 1 insert into products( product_id, product_name, category, price, stock_quamtity ) values ( 201, 'wireless mouse', 'electronics', 29.99, 150 );
     2 select first_name,email from empoyees;
     3 select product_name,price from products where price = 1000;
     4 update products set email = 'john.doe@company.com' where price = 24.99;
     5 update products set price = 24.99 where product_id = 201;
     6 delete from employees where employee_id = 101;
     7 delete from products where product_id = 201;
     
*/





    