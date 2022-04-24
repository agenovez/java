public class Operaciones
{
    public static void main(String[] args)
    {
    var c = 1;
    var d = 2;   
    var operacion = "+";
    var resultado = switch (operacion) {
        case "-" -> c - d;
        case "+" -> c + d;
        case "*" -> c * d;
        case "/" -> c / d;
        default -> "Operación Invalida";
    };
    System.out.println("Resultado = " + resultado);
    }
}
