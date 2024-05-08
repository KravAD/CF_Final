# CF_Final
link --> https://github.com/KravAD/CF_Final.git.

Ejercicio 1 
1) b.
2) b.
3) b.
4) b.
5) b.

Ejercicio 2
2) Ambos son estructuras de datos que sirven para operaciones como la búsqueda de datos pero se diferencia en que las tablas Hash dan un rápido acceso a los datos pero pierde en garantizar el orden de los datos. En cambio los árboles son más lentos que las tablas Hash pero garantizan ese orden de los datos.
3) Ambas son estructuras de orden de complejidad computacional constante 0(1) y ponen los datos como una secuencia pero se diferencian en la manera de gestionarlos. La cola sigue la idea de eliminar el último dato en añadirse, por el otro lado, la cola elimina el primer dato que se haya añadidio.
4) Este método mira los elementos de una lista de números y compara el primero con el siguiente de cada iteración.
0 iteracion: 50, 20, 84, 13, 22, 16, 89, 85
1 iteracion: 20, 50, 84, 13, 22, 16, 89, 85
2 iteracion: 20, 50, 84, 13, 22, 16, 89, 85 (no hay cambios)
2 iteracion: 13, 20, 50, 84, 22, 16, 89, 85
3 iteracion: 13, 20, 50, 84, 22, 16, 89, 85
4 iteracion: 13, 20, 22, 50, 84, 16, 89, 85
5 iteracion: 13, 16, 20, 22, 50, 84, 89, 85
6 iteracion: 13, 16, 20, 22, 50, 84, 89, 85 (no hay cambios)
7 iteracion: 13, 16, 20, 22, 50, 84, 85, 89

Ejercicio 3
a) El código no compila debido al error StackOverflowError, por que el método recursive entra en un bucle infinito cuando el valor del int b es negativo. La solución puede ser que b sea >= 0.
b) El cálculo es el de una potencia ya que si la base es 0 el resultado es 0 y si el exponente es 0 el resultado es 1. La recursividad es de tipo lineal.

Ejercicio 4. ¿ Qué t ipo de recursividad se está empleando? ¿ Qué comple jidad computacional tiene el algoritmo?
El método está usuando recursividad lineal y tiene una complejidad computacional de 0(n) donde n es el número de digitos del número que se utiliza.

Ejercicio 5
2-d) No se deben modificar los atributos de timeline y tweets de la clase UserAccount por que la clase Retweet es una sublcase de Tweet. En cuanto a la modificacion de tweet(Tweet tweet1), no debe hacerse por el mismo motivo ya que Retweet es un tweet.
