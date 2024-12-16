/* 여러줄 주석 
	[ sql 작성 또는 실행 하는 방법
    1. sql 문법을 작성한다. show databases
    2. sql 문장이 끝나면 ; 으로 마친다
    3. 실행할 명령어 줄에 마우스커서 두고 ctrl enter
		ctrl shift enter 는 전체 실행 
    4. 실행 결과는 하단에 result grid 창에서 확인 가능
*/
# 한줄 주석
-- 한줄 주석
# [1] db server 내 모든 테이블 확인 
show databases;
# [2] db serever local path 확인
show variables like 'datadir';
# [3] db server 데이터베이스 생성
create database myDBtest1;