-- write a program calculate the square and cube of given number
set serveroutput on
declare
	n number := &n;
	ans number;
begin
	ans := n*n;
	dbms_output.put_line('Sqare is : ' ||ans);
	ans := n*n*n;
	dbms_output.put_line('Cube is : ' ||ans);
end;
/
