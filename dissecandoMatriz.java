import java.util.Scanner;
public class dissecandoMatriz {
    public static void main(String [] Args){
        int matriz [][] = {{4,5,9,7},{45,51,54,6},{21,45,12,4},{89,85,6,4}};
      
        System.out.println("MENU DE OPÇÕES");
        System.out.println("==============");
        System.out.println("[1] Mostrar Matriz");
        System.out.println("[2] Diagonal Principal");
        System.out.println("[3] Triângulo Superior");
        System.out.println("[4] Triângulo Inferior");
        System.out.println("[5] Sair");



        Scanner s = new Scanner (System.in);
        int caso;
        caso = s.nextInt();
      

        switch (caso){
            case 1:
                System.out.println("Mostrar Matriz");

                for (int i = 0; i < matriz.length; i++){
                    for(int j = 0; j <matriz[i].length; j++){
                        System.out.printf("%5d",matriz[i][j]); //usa printf para formatar o espaço entre os valores da matriz, ele completa com espaços à esquerda.
                    }
                System.out.println();
                }

                break;


            case 2:
                System.out.println("Diagonal Principal");

                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        if (i==j) {  //diagonal principal é quando a linha for igual a coluna
                            System.out.printf("%5d",matriz[i][j]);
                        }
                    }
                }

                break;


            case 3:
                System.out.println("Triangulo Superior");

                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        if (j >= i){  //sempre que a coluna (j) for maior ou igual à linha (i), a posição está na diagonal ou acima dela, ou seja, está no triângulo superior!
                            System.out.printf("%5d", matriz[i][j]);
                        }
                    }
                }

                break;


            case 4:
                System.out.println("Triangulo Inferior");

                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        if (i >= j){  //sempre que a linha (i) for maior ou igual à coluna (j), a posição está na diagonal ou acima dela, ou seja, está no triângulo inferior!
                            System.out.printf("%3d", matriz[i][j]);
                        }
                    }
                }

                break;


            case 5:
                System.out.println("Sair");
                break;


            default:
                System.out.println("Escolha inválida");
        }

      s.close();
    }
    
 }

