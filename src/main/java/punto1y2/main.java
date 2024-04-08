package punto1y2;


public class main {
    public static void main(String[] args) {
        AprendiendoLambdas a = new AprendiendoLambdas();

        /* este metodo por la interface punto1y2.B que tiene un argumento tipo String llama a
        "public void unMetodo(punto1y2.B b)" el cual vuelve a llamar a este metodo con b="UnString", como
        se integra el parametro b en la lambda  se obtiene como
        salida -> abcdUnString */
        a.unMetodo((String b) -> {
            System.out.println("abcd  punto1y2.B" + b);
        });



       /* este metodo por la interface punto1y2.A que no recibe argumento llama a
        "public void unMetodo(punto1y2.A a)" el cual vuelve a llamar a lambda el cual como
        salida -> "abcd" */
        a.unMetodo(() -> System.out.println("abcd  punto1y2.A"));



       /*Este metodo por la interface punto1y2.B que tiene un argumento tipo String llama a
        "public void unMetodo(punto1y2.B b)" el cual vuelve a llamar a este metodo con b="UnString"
         pero como esta vez la lambda no integra a variable solo como
         salida -> "abcd" */
        a.unMetodo((String variable) -> {
            System.out.println("abcd");
        });



       /*Este metodo por la interface punto1y2.C que recibe una variable y retorna un booleano llama al metodo
       "public void unMetodo(punto1y2.C c)" el cual imprime un boleano de la lambda que implemente punto1y2.C que en este caso
       la lambda imprime abcd y retorna true el cual se imprime
        como salida -> abcd
                       true*/
        a.unMetodo((String variable) -> {
            System.out.println("abcd");
            return true;
        });


        /*Este metodo por la interface punto1y2.D que recibe un parametro c de tipo  generico como T
        y retorna un tipo generico como R llama al metodo "public void unMetodo(punto1y2.D<Long, Long> d)"
        el cual llama a la lambda que implementa punto1y2.D el cual imprime "abcd" y retorna 10L pero ese resultado
        no se imprime por lo tanto como salida -> abcd*/
        a.unMetodo((Long variable) -> {
            System.out.println("abcd  punto1y2.D");
            return 10L;
        });
        ///////////////////////////////Punto 2/////////////////////////////////////////
        AprendiendoLambdas aprendiendoLambdas = new AprendiendoLambdas();
        aprendiendoLambdas.unMetodo((String c) -> c.length() % 2 == 0);
        aprendiendoLambdas.unMetodo((String palabra) -> Character.isLowerCase(palabra.charAt(0)));


    }
}
