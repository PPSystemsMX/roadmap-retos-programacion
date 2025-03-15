public class PPSystamsMX {
    
    public static void main(String[] args) {

        /*
         * Los difernetes operadores en Java son:
         * Operadores aritméticos
         * Operadores de asignación
         * Operadores de comparación
         * Operadores lógicos
         * Operadores bit a bit
         */

        /*
         * Operador de asignación "="
         * Se utiliza para asignar el valor especificado a la derecha del "=" a la variable de la izquierda del "="
         */
        
         int num1 = 7;
         int num2 = 3;

        /*
         * Operadores aritmeticos
         * Suma "+"
         * Resta "-"
         * Multiplicación "*"
         * División "/" 
         * Mudulo "%"
         * Incremento "++"
         * Decremento "--"
         */
        
        //Para sumar usar "+"
        int suma = num1 + num2;
        System.out.println("La suma de 7 + 3 es: " + suma);

        //Para restar usar "-"
        int resta = num1 - num2;
        System.out.println("La resta de 7 - 3 es: " + resta);

        //Para multiplicar usar "*"
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicación de 7 * 3 es: " + multiplicacion);

        //Para dividir usar "/"
        float division = num1 / num2;
        System.out.println("La división de 7 / 3 es: " + division);

        //Para obtener el mudulo (sobrante) de una division usar "%"
        num1 = 12;
        num2 = 5;
        int modulo = 12 % 5;
        System.out.println("El modulo de 12 % 5 es: " + modulo);

        //Para incrementar en 1 el valor actual usar "++"
        num1 = 0;
        System.out.println("El valor actual de num1 es: " + num1);
        num1 ++;
        System.out.println("El nuevo valor de num1 usando el operador ++ es: " + num1);
        
        //Para decrementar en 1 el valor actual usar "--"
        num1 = 0;
        System.out.println("El valor actual de num1 es: " + num1);
        num1 --;
        System.out.println("El nuevo valor de num1 usando el operador -- es: " + num1);


        //Operadores de bits
        /*
         * Operador AND se usa "&", se va multiplicando bit a bit 
         * si ambos coinciden en 1, entonces se queda en 1
         * si alguno de los 2 es 0, entonces se queda en 0
         */
        num1 = 5; //En binario 5 es 0101
        num2 = 7; //En binario 7 es 0111
        int resultado = num1 & num2; //Resultado es 5, en binario es 0101
        System.out.println("Operador AND, 5 & 7 es: " + resultado);

        /*
         * Operador OR se usa "|", se va multiplicando bit a bit 
         * si por lo menos alguno de ellos es 1, entonces se queda 1
         * si ambos son 0, entonces se queda en 0
         */
        num1 = 5; //En binario 5 es 0101
        num2 = 3; //En binario 7 es 0011
        resultado = num1 | num2; //Resultado es 7, en binario es 0111
        System.out.println("Operador OR, 5 & 3 es: " + resultado);

        /*
         * Operador XOR se usa "^", se va multiplicando bit a bit 
         * si por lo menos alguno de ellos es 1, entonces se queda 1
         * si ambos coinciden en 1 o en 0, entonces se queda en 0
         */
        num1 = 5; //En binario 5 es 0101
        num2 = 3; //En binario 7 es 0011
        resultado = num1 ^ num2; //Resultado es , en binario es 0110
        System.out.println("Operador XOR, 5 ^ 3 es: " + resultado);

        /*
         * Operador Bitwise NOT se usa "~", se
         * invierte los bits, 0 a 1 y 1 a 0
         */
        num1 = ~5; //En binario 5 es 0101, EL resultado es , en binario es 1010
        System.out.println("Operador NOT, ~5 es: " + num1);

        /*
         * Operador desplazamiento a la izquierda se usa "<<", 
         * se aplica al número (en binario) de la izquierda 
         * un desplazamiento del numero de posiciones por la especificado
         * a la derecha del operador "<<", los bits (0) se ponen a la derecha del 
         * numero binario
         */
        num1 = 5; //En binario 5 es 0101
        num2 = num1 << 2; //EL resultado es 20, en binario es 010100
        System.out.println("Operador desplazamiento a la izquierda, 5 << 2 es: " + num2); 

        /*
         * Operador desplazamiento a la derecha con signo se usa ">>", 
         * se aplica al número (en binario) de la izquierda 
         * un desplazamiento del numero de posiciones especificado
         * a la derecha del operador ">>", los bits se ponen a la izquierda del 
         * numero binario y se va eliminando el mismo numero de bits por la derecha
         * Nota: Es importante destacar que los espacios se rellenan con 0 si a es un número positivo. 
         * Si es negativo, los espacios se sustituyen por 1.
         */
        num1 = 11; //En binario 11 es 1011
        num2 = num1 >> 1; //EL resultado es 5, en binario es 0101
        System.out.println("Operador desplazamiento a la derecha con signo, 11 >> 1 es: " + num2); 


        /*
         * Operador desplazamiento a la derecha sin signo se usa ">>>", 
         * se aplica al número (en binario) de la izquierda 
         * un desplazamiento del numero de posiciones especificado
         * a la derecha del operador ">>", los bits (0) se ponen a la izquierda del 
         * numero binario y se va eliminando el mismo numero de bits por la derecha
         */
        num1 = 11; //En binario 11 es 1011
        num2 = num1 >> 2; //EL resultado es 2, en binario es 0010
        System.out.println("Operador desplazamiento a la derecha sin signo, 11 >> 2 es: " + num2); 


        //Operadores de asignación
        //Sumar y asignar
        num1 = 0;
        System.out.println("El valor actual de num1 es: " + num1);
        num1 += 3;
        System.out.println("El nuevo valor de num1 usando el operador += 3 es: " + num1);

        //Restar y asignar
        num1 = 0;
        System.out.println("El valor actual de num1 es: " + num1);
        num1 -= 3;
        System.out.println("El nuevo valor de num1 usando el operador -= 3 es: " + num1);

        //Multiplicar y asignar
        num1 = 5;
        System.out.println("El valor actual de num1 es: " + num1);
        num1 *= 3;
        System.out.println("El nuevo valor de num1 usando el operador *= 3 es: " + num1);

        //Division y asignar
        float num3 = 5;
        System.out.println("El valor actual de num1 es: " + num3);
        num3 /= 3;
        System.out.println("El nuevo valor de num1 usando el operador /= 3 es: " + num3);

        //Modulo y asignar
        num3 = 5;
        System.out.println("El valor actual de num1 es: " + num3);
        num3 %= 3;
        System.out.println("El nuevo valor de num1 usando el operador %= 3 es: " + num3);


        //Operadores de comparación
        //Operador de igualdad se usa "=="
        num1 = 11; 
        num2 = 5;
        System.out.println("Operador de igualdad, 11 == 5, la respuesta es: " + (num1 == num2));

        //Operador de desigualdad se usa "!="
        num1 = 11; 
        num2 = 5;
        System.out.println("Operador de desigualdad, 11 != 5, la respuesta es: " + (num1 != num2));

        //Operador de mayor que se usa ">"
        num1 = 11; 
        num2 = 5;
        System.out.println("Operador de mayor que, 11 > 5, la respuesta es: " + (num1 > num2));

        //Operador de mayor o igual que se usa ">="
        num1 = 11; 
        num2 = 5;
        System.out.println("Operador de mayor o igual que, 11 >= 5, la respuesta es: " + (num1 >= num2));

        //Operador de menor que se usa "<"
        num1 = 11; 
        num2 = 5;
        System.out.println("Operador de menor que, 11 < 5, la respuesta es: " + (num1 < num2));

        //Operador de menor o igual que se usa "<="
        num1 = 11; 
        num2 = 5;
        System.out.println("Operador de menor o igual que, 11 <= 5, la respuesta es: " + (num1 <= num2));


        //Operadores lógicos 
        /*
         * Operador logico AND se usa "&&"
         * Si ambas condiciones son verdaderos, 
         * el resultado es verdadero, de lo contrario 
         * el resultado es falso
         */

        num1 = 11; 
        num2 = -5;
        System.out.println("Operador lógico AND && evaluamos 11 > 0 && -5 < 0, la respuesta es: " + (num1>0 && num2<0));

        /*
         * Operador logico OR se usa "||"
         * Si por lo menos alguna de las condiciones es verdadero
         * el resultado es verdadero, si una o ambas condiciones
         * son falsas, el resultado es falso
         */
        num1 = 11; 
        num2 = 5;
        System.out.println("Operador lógico OR || evaluamos 11 > 12 || 5 < 0, la respuesta es: " + (num1>12 || num2<0));

        /*
         * Operador logico NOT se usa "!"
         * invierte el resultado, los falsos a verdaderos
         * y los verdaderos a falsos
         */
        boolean miBoolean = true;
        System.out.println("El valor de la variable miBoolean es: " + (miBoolean));
        System.out.println("El resultado de usar el operador Operador lógico NOT !miBoolean es: " + (!miBoolean));


        //Estructuras de control
        //If
        int edad = 15;
        System.out.println("Edad actual: " + edad);
        if (edad<18){
            System.out.println("Disculpa, eres menor de edad, acceso denegado.");
        }
        
        //If - else
        num1 = 10;
        System.out.println("Valor actual de num1: " + num1);
        if (num1<100){
            System.out.println("Mi número es menor que 100");
        }
        else {
            System.out.println("Mi número es mayor o igual a 100");
        }

        //If - else if
        num1 = 21;
        System.out.println("Valor actual de num1: " + num1);
        if (num1%5 == 0){
            System.out.println("El " + num1 + " es multiplo de 5");
        }
        else if (num1%2 == 0){
            System.out.println("El " + num1 + " es multiplo de 2");
        }
        else {
            System.out.println("El " + num1 + " no es multipo de 2, ni de 5");
        }

        //Operador ternario
        num1 = 8;
        num2 = 12;
        int menor = num1<num2 ? num1 : num2;
        System.out.println("El número menor entre " + num1 + " y " + num2 + " es: "  + menor);

        //While - evalua y si se cumple entre al bucle, si no cumple, nunca entra
        num1 = 1;
        while (num1 < 5){
            System.out.println("La variable num1 es " + num1 + " , es menor que 5, por lo tento el bucle sigue.");
            num1 ++;
        }
        System.out.println("El bucle se detuvo porque num1 es " + num1 + ", y ya no es menor que 5");

        //Do while - ejecuta una vez el bucle, y despues evalua para definir si se vuelve a ejecutar
        num1 = 5;
        do {
            System.out.println("num1 es:" + num1 + ", se imprime mientras no sea menor que 0");
            num1 --;
        }while (num1 >= 0 );

        //For - se ejecuta el bucle un numero determinado de veces
        for (int num4 = 0; num4 <= 5 ; num4 ++){
            System.out.println("num4 es: " + num4);
        }

        //For-each - se utiliza exclusivamente para recorrer los elementos de una matriz (u otros conjuntos de datos):
        String[] Mistring = {"Hot Wheels","MatchBox","M2","Kaido","Tomica"};
        System.out.println("Imprimir marcas, hasta encontrar M2");
        for (String marca : Mistring){
            System.out.println(marca);
            if (marca == "M2"){
                break;
            }
        }

        //Switch
        String MiMarca = "Kaido";
        switch (MiMarca){
            case "M2": 
                System.out.println("La marca M2 es....");
                break;
            case "Hot Wheels":
                System.out.println("La marca Hot Wheels es...");
                break;
            default:
                System.out.println("No cuento con información de la marca " + MiMarca + ", una disculpa.");
        }

        //Break - se utiliza para salir del bloque de codigo o un bucle, revisar los ejemplos del switch y del for-each

        //Continue - interrumpe una iteración en el bucle, y continúa con la siguiente iteración en el bucle.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue; //el número 4 no se va a imprimir
            }
            System.out.println(i);
          }

        //
        /*
         * DIFICULTAD EXTRA (opcional):
         * Crea un programa que imprima por consola todos los números comprendidos
         * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
         */
        System.out.println("Ejercicio DIFICULTAD EXTRA");
         for (int i=10; i<=55; i++){
            if (i%3 != 0) {
                if (i != 16){
                    if (i%2 == 0){
                        System.out.println(i);
                    }
                }
            }
         }
    }
}
