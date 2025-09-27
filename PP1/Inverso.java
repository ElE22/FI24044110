public class Inverso {
    public static void main(String[] args){

        if(args.length == 0 || !args[0].matches("\\d{2,}")  ){
            System.out.println("Debe ingresar un numero natural de 2 digitos como argumento.");
            return;
        }

        int numero = Integer.parseInt(args[0]);
        int inverso = invertirNum(numero, 0);
        System.out.println(numero + " >>> " + inverso);
    }

    public static int invertirNum(int numero, int inversoAcumulado){
        if (numero == 0) {
            return inversoAcumulado;
        }
        int residuo = numero % 10;     
        int cociente = numero / 10;   
        return invertirNum(cociente, inversoAcumulado * 10 + residuo);
    }
}