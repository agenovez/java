public class Test 
{
    public static void main(String[] args)
    {
      var PVP= 50;
var descuento = 0;
var precioFinal = 0;
var codPromocion = "100MAX";
//pasamos a mayúsculas para evitar diferencias al comparar por haber usado minúsculas:
codPromocion = codPromocion.toUpperCase();  
switch(codPromocion) {
case "PLUSORO":
  descuento = 25;
  break; 
case "PLATINO33" :
  descuento = 20;
  break;
case "100MAX" :
  descuento = 15;
  break; 
case "SUPERSILVER" :
  descuento = 10;
  break;
case "TOTALBRONCE" :
  descuento = 5;
  break;
default: 
 System.out.println("No ha introducido código promocional, o es erróneo");
}
precioFinal = PVP - descuento;
System.out.println("Precio= " + precioFinal + " €");
    }
}
