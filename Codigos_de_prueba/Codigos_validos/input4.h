#define TEXTO "Iteración:"
int numero;
int total;
int Cuadrado (int n){
	return n*n;
}
int TestDoWhile (int x){
	int i;
	i=1;
	total=0;

	do
		writeln( TEXTO, i );
		total=total+Cuadrado( i );
		i=i+1;
	until ( i>x );
	return total;
}
