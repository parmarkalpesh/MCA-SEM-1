set serveroutput on
create or replace procedure proins(xproid in number,xpronm in varchar2,xqty in number, xcost in number)
is
begin
	insert into product values(xproid,xpronm,xqty,xcost);
	dbms_output.put_line('record inserted..');
end proins;
/