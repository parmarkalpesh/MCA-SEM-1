set serveroutput on
create or replace procedure proadd(x in number,y in number,ans out number)
is
begin
	ans:=x+y;
end proadd;
/