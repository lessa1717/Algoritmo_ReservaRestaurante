import java.lang.reflect.Array;
import java.util.Scanner;

public  class Algoritmo_ReservaRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeEmpresa,diaDaSemana;

        int horaEscolhida;

        System.out.println("Por favor digite o nome da sua empresa: ");
        nomeEmpresa = sc.next();

        System.out.println("Por favor digite o dia da semana que você quer reservar: ");
        diaDaSemana = sc.next();

        System.out.println("Por favor digite o horário que você quer reservar: ");
        horaEscolhida = sc.nextInt();

        if (diaDaSemana == "segunda" || diaDaSemana == "terca" || diaDaSemana == "quarta" ||
                diaDaSemana == "quinta" || diaDaSemana == "sexta" && horaEscolhida >=7 || horaEscolhida<=23 ){
            System.out.println("Restaurante reservado para "+nomeEmpresa+":"+diaDaSemana+" ás :"+horaEscolhida);
        } else if (diaDaSemana == "sabado" ||
                diaDaSemana == "domingo" && horaEscolhida>=7 || horaEscolhida<=15){
            System.out.println("Restaurante reservado para "+nomeEmpresa+":"+diaDaSemana+" ás :"+horaEscolhida);
        }else{
            System.out.println("Os dados inseridos estao inválidos ou o restaurante está indisponível");
        }










    }
}