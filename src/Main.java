
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[][] matriz = new String[5][5];

//        linha 0 todas as colunas
        matriz[0][0] = "A";
        matriz[0][1] = "B";
        matriz[0][2] = "C";
        matriz[0][3] = "D";
        matriz[0][4] = "E";

//        Linha 1 todas as colunas
        matriz[1][0] = "F";
        matriz[1][1] = "G";
        matriz[1][2] = "H";
        matriz[1][3] = "I";
        matriz[1][4] = "J";

        matriz[2][0] = "K";
        matriz[2][1] = "L";
        matriz[2][2] = "M";
        matriz[2][3] = "N";
        matriz[2][4] = "O";

        matriz[3][0] = "P";
        matriz[3][1] = "Q";
        matriz[3][2] = "R";
        matriz[3][3] = "S";
        matriz[3][4] = "T";

        matriz[4][0] = "U";
        matriz[4][1] = "V";
        matriz[4][2] = "W";
        matriz[4][3] = "X";
        matriz[4][4] = "Y";


        System.out.println("   0 1 2 3 4");
        System.out.println("   ---------");
        for (int linha = 0; linha < matriz.length; linha++){
            if (linha == 0){
                System.out.print(linha + "| ");
            }
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
            if (linha != 4)
            System.out.print( linha + 1 + "| ");
        }

        System.out.println("_|_|_");
        System.out.println("_|_|_");
        System.out.println(" | | ");


        String[][] tabuleiro = new String[3][3];

        Scanner scan = new Scanner(System.in);

        int contador = 0;
        String primeiro, segundo = null;
        boolean repita = true;
        do {
            System.out.println("Quem joga primeiro? X ou O");
            primeiro = scan.next();
            if (primeiro.equals("X")){
                segundo = "O";
                repita = false;
                break;
            }
            if (primeiro.equals("O")){
                segundo = "X";
                repita = false;
                break;
            }

        }
        while (repita);

        while (contador < 9) {

            System.out.println("Insira a linha: ");
            int linha = scan.nextInt();
            System.out.println("Insira a coluna: ");
            int coluna = scan.nextInt();

            if (tabuleiro[linha][coluna] == null){
                if (contador % 2 == 0){
                    tabuleiro[linha][coluna] = primeiro;
                }else {
                    tabuleiro[linha][coluna] = segundo;
                }
            }

            for (int i = 0; i < tabuleiro.length; i++){
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }
            contador++;
        }
    }
}
