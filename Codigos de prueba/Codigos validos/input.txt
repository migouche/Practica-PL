program Test3;

const
    PI = 3.14159;
    FACTOR = 2;

var
    a, b, c: INTEGER;
    r, area: REAL;

procedure ShowValues(x: INTEGER; y: INTEGER);
var
    d, e, f, g: INTEGER;
    r2, r3, r4, r5 : REAL;
begin
    writeln('First value: ', x);
    writeln('Second value: ', y);
end;

function Multiply(n1: INTEGER; n2: INTEGER): INTEGER;
var
    n2: INTEGER;
begin
    Multiply := n1 * n2;
end;

function CircleArea(radius: REAL): REAL;
begin
    CircleArea := PI * radius * radius;
end;

begin
    a := 5;
    b := 10;
    c := Multiply(a, b);

    ShowValues(a, c);

    r := 7.5;
    area := CircleArea(r);

    writeln('Radius: ', r);
    writeln('Area of circle: ', area);
    writeln('Constant factor: ', FACTOR);
end.
