#define PI 3.14159
#define FACTOR 2
void ShowValues (int x, int y){
	int d,e,f,g;
	float r2,r3,r4,r5;
	writeln( "First value: ", x );
	writeln( "Second value: ", y );
}
int Multiply (int n1, int n2){
	int n2;
	return n1*n2;
}
float CircleArea (float radius){
	return PI*radius;
}
void main ( void ) {
	a=5;
	b=10;
	c=Multiply( a, b );
	ShowValues( a, c );
	r=7.5;
	area=CircleArea( r );
	writeln( "Radius: ", r );
	writeln( "Area of circle: ", area );
	writeln( "Constant factor: ", FACTOR );

}