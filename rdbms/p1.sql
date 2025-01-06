set serveroutput on
declare
	r number(5);
	a number(14,2);
begin
	r := 10;
	a := 3.14159*POWER(r,2);
	insert into area(radius,area)values(r,a);
	commit;
	
	dbms_output.put_line('Data Inserted: Radius ='||r||',	Area ='||a);
end;
/