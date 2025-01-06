-- Find square and cube
declare
    s number(5); 
    c number(5); 
    num number(5);
begin
    num := &num; 
    s := power(num, 2);
	c:= power(num, 3); 
    dbms_output.put_line('Square Value: ' || s || ', Cube is: ' || c);
exception
    when others then
        dbms_output.put_line('Error occurred: ' || SQLERRM); 
end;
/
