#define PI 3.14
#define SALUDO "Hola"
int x,y;
float r;
int cont;
void MostrarMensaje (int m){
	writeln( SALUDO );
	writeln( "Mensaje con número:", m );
}
int Sumar (int a, int b){
	return a+b;
}
void main ( void ) {
	x=10;
	y=5;
	r=PI*x;

	if (!( a>b )) {
		writeln( "a no es mayor que b" );
	} else{
		writeln( "a es mayor que b" );
	}

	for( cont=1; cont<5+1; cont=cont+1){
		writeln( "Valor de cont: ", cont );
	}
	MostrarMensaje( x );
	y=Sumar( x, y );

}