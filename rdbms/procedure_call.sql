set serveroutput on
declare
	n1 number :=&n1;
	n2 number :=&n2;
	total number;
begin
	proadd(n1,n2,total);
	dbms_output.put_line('sum of x + y =' ||total);
end;
/