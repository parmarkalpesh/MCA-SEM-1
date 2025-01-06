set serveroutput on
declare

begin
	for i in 1..100000 loop
	dbms_output.put_line('Value Of i = '||i);
	end loop;
end;
/