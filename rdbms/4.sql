CREATE OR REPLACE PROCEDURE Convert_To_Celsius (
    Fahrenheit IN NUMBER
) AS
    Celsius NUMBER;
BEGIN
	
    Celsius := (Fahrenheit - 32) * 5 / 9;
	 Convert_To_Celsius(98.6);
    -- Display the result
    DBMS_OUTPUT.PUT_LINE('Temperature in Celsius: ' || Celsius);
END;
/
