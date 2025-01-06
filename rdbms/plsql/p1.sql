SET SERVEROUTPUT ON;
DECLARE
    a NUMBER := 15;
    b NUMBER := 25;
    c NUMBER := 10;
    max_value NUMBER;
BEGIN
    -- Determine the maximum of the three numbers
    IF (a > b AND a > c) THEN
        max_value := a;
    ELSIF (b > c) THEN
        max_value := b;
    ELSE
        max_value := c;
    END IF;

    -- Display the maximum value
    DBMS_OUTPUT.PUT_LINE('The maximum of ' || a || ', ' || b || ', ' || c || ' is: ' || max_value);
END;
/
