Declare
	pi constant number :=3.14;
	r number(3,1):=&r;
	a number(7,2);
begin
	a:=pi*r*r;
	insert into area values(r,a);
	dbms_output.put_line('Answer is : '||a);
end;
/