#Entornos de desarrollo
##1.2 Ejercicio Maven
###Proyecto Java

- Debes crear un proyecto Maven en Eclipse con una clase que genere direcciones IP llamada GeneradorIp.

Crea una clase llamada GeneradorIp que tenga los siguientes métodos:

public int generarNumero(int min, int max):

- devuelve un número entre min y max

public String generarIp():

- devuelve una dirección IP utilizando el método anterior

##Test proyecto

Crea una clase de testeo JUnit 5 llamada GeneradorIpTest. Añade los siguientes dos métodos de testeo:


###testGenerarNumero:

- debe confirmar que genera un número entre 0 y 254. Debes ejecutar el test 1000 veces.

###testGeneraIp:
- debes comprobar que no empieza ni termina con 0.
