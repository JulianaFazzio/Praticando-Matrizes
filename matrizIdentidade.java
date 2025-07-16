import java.util.Scanner;

public class matrizIdentidade {
    public static void main (String [] Args){
        int tamanho;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz:");  //colocar tamanho na matriz
        tamanho = s.nextInt();
        s.close(); //fechando o scanner como boa prática


        int [][] matrizIdentidade = new int [tamanho][tamanho]; //criando a matriz com o tamanho digitado
        for (int i = 0; i < matrizIdentidade.length; i++){  //colocando valores na matriz
            for (int j = 0; j < matrizIdentidade[i].length;j++){
                if (j==i) {   // se linha e coluna forem iguais, quer dizer que é a diagonal então colocar 1
                    matrizIdentidade[i][j] = 1;
                }
            else{
                matrizIdentidade[i][j] = 0; // os outros lugares da matriz é 0
            }
            }
        }


        for (int i = 0; i < matrizIdentidade.length; i++){   // para percorrer a matriz a mostrar na tela os valores
            for(int j = 0; j < matrizIdentidade[i].length; j++){
                System.out.print(matrizIdentidade[i][j]+ " ");
            }
            System.out.println();  // para pular linha após cada linha da matriz, para a formatação ficar correta
        }
    }
}
