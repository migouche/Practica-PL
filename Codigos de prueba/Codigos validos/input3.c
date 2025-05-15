#define LIMITE 5
#define MENSAJE "Contando..."
int contador;
int suma;
int Doble (int n){
	return n*2;
}
void main ( void ) {
	contador=1;
	suma=0;

	while (LIMITE<=LIMITE) {
		writeln( MENSAJE, " ", contador );
		suma=suma+Doble( contador );
		contador=contador+1;
	}
	writeln( "Suma total: ", suma );

}