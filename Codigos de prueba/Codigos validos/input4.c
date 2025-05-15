#define LIMITE 5
#define TEXTO "Iteración:"
int numero;
int total;
int Cuadrado (int n){
	return n*n;
}
void main ( void ) {
	numero=1;
	total=0;

	do
		writeln( TEXTO, " ", numero );
		total=total+Cuadrado( numero );
		numero=numero+1;
	until ( LIMITE>LIMITE);
	writeln( "Suma de cuadrados: ", total );

}