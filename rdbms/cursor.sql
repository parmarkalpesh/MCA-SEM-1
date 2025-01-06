set serveroutput on
declare
	e_id employee4194.id%type;
	e_name employee4194.name%type;
	e_city employee4194.city%type;

	cursor c1 IS select id,name,city from employee4194 where city = 'rajkot';
begin

	open c1;
	loop
		fetch c1 into e_id,e_name,e_city;
		exit when c1%notfound;
		dbms_output.put_line( e_id ||' ' || e_name||' ' || e_city);
	end loop;
	close c1;
end;
/