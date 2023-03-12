package app;

public class Vetor01 {
    public static void main(String[] args) {
        String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto",
        "Setembro","Outubro","Novembro","Dezembro"};
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<mes.length;i++) {
            System.out.println("O mês de " + mes[i] + " têm " + dias[i]);
        }
    }
}
