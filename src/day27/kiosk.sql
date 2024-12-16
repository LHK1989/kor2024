drop database if exists kiosk;
create database kiosk;

use kiosk;

create table category(
	categoryname text
);

create table menu(
	name text,
    price int
);

create table 주문(
	수량 tinyint
);

create table 대기표(
	날짜 datetime,
    주문번호 tinyint
);