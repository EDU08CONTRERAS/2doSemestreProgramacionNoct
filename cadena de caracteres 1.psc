Algoritmo contar_cuantas_vocales_tiene_una_palabra
	Definir nvocales como entero
	definir i como entero 
	definir palabra como  cadena 
	nvacales=0
	Escribir "escriba la palabra "
	Leer palabra
	palabra(nvocales )= i
	Para i<-0 Hasta Longitud(palabra) Con Paso 1 Hacer
		Si palabra[i]="A" o palabra[i]="a" o palabra[i]="E" o palabra[i]="I"o palabra[i]="i" o  palabra[i]="O" O  palabra[i]="o" o palabra[i]="U"o  palabra[i]="u"
			Entonces
			nvocales=nvocales+1
			
		Fin Si
	Fin Para
	Escribir "la palabra escrita contiene una cantidad de vocales de " nvocales
	
FinAlgoritmo
