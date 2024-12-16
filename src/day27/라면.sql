/* 
	[ sql 과제2 ] 회원들만 구매할 수 있는 '라면' 쇼핑물, 데이터 베이스 구축하기
		- 요구사항
			1. 회원은 회원가입을 진행한다. ( 임의 )
            2. 로그인된 상황에서 카테고리를 선택한다.
            3. 지정된 카테고리에서 제품을 선택한다.
            4. 지정한 제품을 장바구니에 담는다.
            -- > 여러번 장바구니에 담았을 때
            5. 만약에 장바구니에 담긴 ' 불닭볶음면 ' 2개 , 짜파게티 1개를 주문 했다.
            6. 하나의 주문 번호를 발급 받았고 주문 내역에서 지정한 주문상세를 클릭시 주문한 상세 내역(정보) 나왔다.
            
		- 조건
			1. 서로 다른 테이블간의 pk 와 fk를 적용하여 관계형 테이블 만드시오.
            2. 적절한 필드명과 타입을 사용하시오.
            3. 적절한 제약조건을 사용하시오.
*/

drop database if exists shoppingmall;
create database shoppingmall;
use shoppingmall;


create table user(
	userid int unsigned not null,
	id	varchar(20) not null unique,
    pwd varchar(10) not null,
    address varchar(20) not null,
    phonenumber varchar(13) not null unique,
    primary key(userid)
);

create table category(
	categorynumber int unsigned not null,
    categoryname varchar(10) not null unique,
    loginid int unsigned not null,
    primary key(categorynumber),
    foreign key(loginid) references user(userid)
);

create table product(
	productid int unsigned not null,
    productname varchar(10),
    price int,
    categorynum int unsigned not null,
    primary key(productid),
    foreign key(categorynum) references category(categorynumber)
);

create table cart(
	cartnumber int unsigned not null,
    productname int unsigned not null,
    numberof int,
    primary key(cartnumber),
    foreign key(productname) references product(productid)
);

create table billS(
	billsid int unsigned not null,
    userid int unsigned not null,
    date datetime,
    sangsaenaeyok int unsigned not null,
    primary key(billsid),
    foreign key(userid) references user(userid),
    foreign key(sangsaenaeyok) references cart(cartnumber)
);