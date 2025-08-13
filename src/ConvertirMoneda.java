import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMonedas consulta, Scanner lectura) {

        double cantidad;
        double cantidadConvertida;

        Monedas  monedas= consulta.buscarMonedas(monedaBase,monedaTarget);
        System.out.println("La tasa de conversión para hoy \n1 "+monedaBase+"="+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad de "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+"="+cantidadConvertida + " "+monedas.target_code());
        }
public static void ConvertirOtraMoneda(ConsultarMonedas consulta, Scanner lectura) {
    System.out.println("Ingrese el código de la moneda base");
    String monedaBase = lectura.nextLine().toUpperCase();
    System.out.println("Ingrese la moneda a convertir");
    String monedaTarget = lectura.nextLine().toUpperCase();
    convertir(monedaBase,monedaTarget,consulta,lectura);
    }
}
