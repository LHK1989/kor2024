#1. DB 생성
create database mydb1126;
#2. DB(사용) 활성화, 여러개 db가 존재하므로 사용db 선택
use mydb1126;
# 3. 테이블 생성, create table 테이블명( 필드명 타입 제약조건, 필드명2 타입 제약조건, 필드명3 타입 제약조건 )
create table board(
	num int unsigned auto_increment,
    # 게시물 번호, num 필드명으로, int타입선정, 부호없음, 레코드 삽입시 자동번호 할당
	content longtext,
    # 게시물 내용, content 필드명으로, longtext 타입 선정 , 공백없음
    writer varchar(20) not null,
    # 게시물 작성자, writer 필드명으로, varchar(20) 가변길이 타입 선정, 공백 없음
    pwd int not null,
    primary key(num)
    # 식별(pk)키는 중복값이 없고 고유한 값의 특성, 예) 주민등록번호, 사번, 학번, isbn(도서번호), 제품번호
    # 어떠한 형태물(객체) 식별 할때 절대 중복이 없는 고유한 성질
	# pk( 식별키 ) < ---- > fk (참조/외래 키 : pk필드를 참조하는 필드)
);

# 4. 게시물 쓰기
insert into board( content, writer, pwd ) values('안녕하세요 첫번째 글', '유재석', 1234);
# jdbc : insert into board( content, writer, pwd) value( ? , ? , ? );

# 5 . 게시물 전체 출력
select * from board;	

# 6. 특정 게시물 삭제
# 게시물 번호가 1이면 레코드/행/가로 단위 삭제 
delete from board where num = 1; # 게시물 번호가 1이면 삭제
# jdbc : delete from board where num = ? ; # ? 는 매개변수가 들어갈 자리

# 7. 특정 게시물 수정
# 게시물 번호가 1번이면 게시물 내용을 '수정내용입니다.' 수정한다
update board set content = '수정내용입니다.' where num = 1;
# jdbc : update board set content = ? where num = ? ;

