create or replace function get_binary(num in number) return varchar2 is binary_value varchar2(50);
begin
	binary_value := to_char(num,'FM9999999999999999999999999999999999999999999999999999', 'NLS_NUMERIC_CHARACTERS=01');
	return binary_value;
end;
/

declare
	num number :=13;
	binary_value varchar(50);
begin
	binary_value := get_binary(num);
	dbms_output.put_line('Binary Value : ' || binary_value);
end;
/