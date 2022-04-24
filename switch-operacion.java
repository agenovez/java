public class Test 
{
    public static void main(String[] args)
    {
     var operacion = "+";
var a = 1;
var b = 2;
var resultado = 0;
switch(operacion) {
   case "+": 
      resultado = a + b;
      break;
   case "-": 
      resultado = a - b;
      break;
   case "*": 
      resultado  = a * b;
      break;
   case "/": 
      resultado = a / b;
      break;
   default: 
      System.out.println("Operación no válida");       
}
System.out.printf("Resultado: %d\n", resultado);
}

}
