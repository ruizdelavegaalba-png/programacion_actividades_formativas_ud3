import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ejercicio9();
    }

        public static void ArrayListas() {
            ArrayList<String> miLista = new ArrayList<>();//crear
            miLista.add("hola");
            miLista.add("soy");
            miLista.add("Alba");
            miLista.set(0, "Buenas");//sustituir
            boolean resultado = miLista.contains("hola");//muestra lo que tengo en la lista
            miLista.remove("hola");//borro la palabra
            miLista.clear();//borro lista
            System.out.println(miLista.get(0));
        }
    public static void HashSet(){
        HashSet<Integer> miset = new HashSet<>(); //Lista nº enteros donde no puede haber repetidos
        miset.add(1);
        miset.add(2);
        miset.add(3);
        miset.add(2);
        System.out.println(miset.size());//para ver tamaño
        System.out.println(miset.remove(1));//elimina el elemento
        System.out.println();//(miset.clear);//borro lista
    }
    public static void HashMap(){
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("papa", 0.5);
        productos.put("manzana", 1.5);
        productos.put("cebolla", 0.4);
        productos.put("papa", 0.5);
        productos.put("manzana", 0.5);//se vuelve a escribir para cambiar su valor
        System.out.println(productos);
        System.out.println(productos.size());// tamaño
        System.out.println(productos.get("papa")); // valor lista
        System.out.println(productos.containsKey("manzana"));// si esta en la lista
        System.out.println(productos.containsValue("papa"));// para comprobar si alguien se llama con el nombre que le de
        productos.remove("papa");//borrar
    }
    public static void exportar(){
        // definir equals y hashCode
        HashSet<Personas> miLista = new HashSet<Personas>();
        Personas miPersona = new Personas("alba", 2);
        Personas miPersona2 = new Personas("pepe", 5);
        System.out.println(miPersona.equals(miPersona2));
    }

    public static void ejercicio1(){
        //Crear un ArrayList de cadenas de texto, añadir 5 nombres cualesquiera e imprimir
        // el primer nombre, el último nombre y el tamaño de la lista
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Alba");
        nombres.add("Pepe");
        nombres.add("Maria");
        nombres.add("Ana");
        nombres.add("Ana mari");
        System.out.println(nombres.get(0));//imprimir donde esta (primero)
        System.out.println(nombres.get(4));//imprimir donde esta (ultimo)
        System.out.println(nombres.size());
    }
    public static void ejercicio2(){
        // Crear un ArrayList de números decimales, añadir 5 números cualesquiera y calcular la media.
        // Si la media es mayor o igual que 5, imprimir “Aprobado”. De lo contrario, imprimir “Suspenso
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(1.3);
        notas.add(2.4);
        notas.add(3.5);
        notas.add(4.6);
        notas.add(5.7);
        double media = (notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3) + notas.get(4)) / 5;
        System.out.println(media);
        if ( media >= 5 ){
            System.out.println("Aprobado");
        }else {
            System.out.println("Suspenso");
        }

    }
    public static void ejercicio3(){
        //Crear un ArrayList de cadenas de texto, añadir 5 nombres de colores,
        // pedir al usuario un color (con Scanner) e imprimir si el color está en la lista o no
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Negro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un color:");
        String color = sc.nextLine();
        if (colores.contains(color)){ // mira lo que hay dentro de la lista
            System.out.println("El color  esta en la lista");
        }else  {
            System.out.println("El color no esta en la lista");
        }
    }
    public static void ejercicio4(){
        //Crear un HashSet de cadenas de texto, añadir 5 DNIs incluyendo alguno repetido,
        // e imprimir el tamaño de la lista y si contiene algún DNI concreto (el que quieras)
        HashSet<String> dni = new HashSet<>();
        dni.add("23456J");
        dni.add("57847L");
        dni.add("23456M");
        dni.add("23456D");
        dni.add("23456D");
        System.out.println(dni.size());
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un DNI:");
        String DNI = sc.nextLine();
        if(dni.contains(DNI)){
            System.out.println("El DNI esta en la lista");
        } else {
            System.out.println("El DNI no esta en la lista");
        }
    }
    public static void ejercicio5(){
        //Crear un HashSet de cadenas de texto, añadir 5 nombres diferentes, y pedir al usuario un nombre (con Scanner).
        // Si el nombre ya existe, imprimir “Ya existe”. De lo contrario, añadir el nombre e imprimir la lista completa.
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Manoli");
        nombres.add("Manolo");
        nombres.add("Manolito");
        nombres.add("Manito");
        nombres.add("Manolón");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        String nombre = sc.nextLine();
        if(nombres.contains(nombre)){
            System.out.println("El nombre existe");
        }else {
            nombres.add(nombre);
            System.out.println("Lista completa: " + nombres);
        }
    }
    public static void ejercicio6(){
        //Crear dos HashSet de números enteros,
        // añadir varios números a ambas listas e imprimir cuál es más larga.
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        HashSet<Integer> numeros2 = new HashSet<>();
        numeros2.add(3);
        numeros2.add(4);
        numeros2.add(5);
        if (numeros.size() > numeros2.size()){
            System.out.println("La lista uno es mas larga");
        } else if (numeros2.size() > numeros.size()){
            System.out.println("La lista dos es mas larga");
        }else{
            System.out.println("las listas tienen el mismo tamaño");
        }
    }
    public static void ejercicio7(){
        //Crear un HashMap de cadenas de texto y números enteros, que representan nombre y edad. Añadir 5 personas,
        // pedir al usuario un nombre, y, si está en la lista, imprimir su edad y si es mayor de edad o no.
        HashMap<String, Integer> personas = new HashMap<>();
        personas.put("alba", 1);
        personas.put("pepe", 20);
        personas.put("maria", 3);
        personas.put("ana", 4);
        personas.put("ana mari", 5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        String nombre= sc.nextLine();
        if(personas.containsKey(nombre)){
            int edad = personas.get(nombre);
            System.out.println("Tu edad es: " + edad);

            if(edad >= 18){
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }
        } else {
            System.out.println("La persona no está en la lista");
        }
    }
    public static void ejercicio8() {
        //Crear un HashMap de cadenas de texto y números decimales, que representan nombre y nota media. Añadir 5 personas,
        // pedir al usuario un nombre, y, si está en la lista, imprimir su nota media y si ha aprobado o no.
        HashMap<String, Double> personas = new HashMap<>();
        personas.put("alba", 10.0);
        personas.put("pepe", 2.0);
        personas.put("maria", 3.0);
        personas.put("ana", 4.0);
        personas.put("ana mari", 5.0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        String nombre = sc.nextLine();
        if (personas.containsKey(nombre)) {
            double notaMedia = personas.get(nombre);
            System.out.println("Tu nota media es: " + notaMedia);

            if (notaMedia >= 5) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Suspenso");
            }
        } else {
            System.out.println("La persona no está en la lista");
        }
    }
    public static void ejercicio9(){
        //Crear un HashMap de cadenas de texto y cadenas de texto, que representan nombre de usuario y contraseña. Añadir 5 personas, pedir al usuario un nombre y una contraseña, y, si está en la lista y la contraseña coincide,
        // imprimir “Login correcto”. De lo contrario, imprimir “Usuario y/o contraseña incorrectos”.
        HashMap<String, String> personas = new HashMap<>();
        personas.put("alba", "weewwq");
        personas.put("pepe", "wqwqr");
        personas.put("maria", "wqwqf");
        personas.put("ana", "wqwq");
        personas.put("ana mari", "wqwqm");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce una contrasenya");
        String contrasenya = sc.nextLine();
        if (personas.containsKey(nombre) && personas.get(nombre).equals(contrasenya)){
            System.out.println("Login correcto");
        } else{
            System.out.println("contrasenya incorrecta");
        }
    }

}