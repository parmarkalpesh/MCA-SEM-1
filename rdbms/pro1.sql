-- calcuate area of circle(pir2)
set serveroutput on
Declare
	pi constant number(4,2) :=3.14;
	r number(3,1):=&r;
	ans number(7,3);
begin
	ans := pi*r*r;
	dbms_output.put_line('Answer is : ' ||ans);
end;
/