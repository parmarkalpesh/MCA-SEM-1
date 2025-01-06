set serveroutput on;
declare
	id number := 2;
	name varchar2(100);
begin
	select emp_name into name from emp where emp_id = id;
	dbms_output.put_line('Employee name is : ' || name );
end;
/