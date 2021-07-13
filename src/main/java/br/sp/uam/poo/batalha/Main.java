package br.sp.uam.poo.batalha;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      Jogador player1 = new Jogador();
      Jogador player2 = new Jogador();

      int usrEscolha = 0;

      System.out.print("Digite o nome do jogador 1: ");
      player1.setNome(entrada.nextLine());

      for(int i = 0; i < 3; i++){
         System.out.print("Pokemons: ");
         System.out.println("| Aegislash | Darkrai | Cresselia | Poipole | Garchomp | Alcremie |");
         System.out.print("Tipos:    ");
         System.out.println("| fantasma  | sombrio | psiquico  | venenoso | dragao  | fada  |");
         System.out.print("Escolha o " + (i+1)  + " pokemon: ");

         player1.pokemonsEscolhidos[i] = new Monstros(entrada.nextLine().toLowerCase());
         if(!(player1.pokemonsEscolhidos[i].isValid())){
            System.out.println("Esse pokemon nao existe! Tente novamente");
            i -= 1;
         }
         System.out.println('\n');
      }

      for(int i = 0; i < 30; i++){
         System.out.println('\n');
      }

      System.out.print("Digite o nome do jogador 2: ");
      player2.setNome(entrada.nextLine());

      for(int i = 0; i < 3; i++){
         System.out.print("Pokemons: ");
         System.out.println("| Aegislash | Darkrai | Cresselia | Poipole | Garchomp | Alcremie |");
         System.out.print("Tipos:    ");
         System.out.println("| fantasma  | sombrio | psiquico  | venenoso | dragao  | fada  |");
         System.out.print("Escolha o " + (i+1)  + " pokemon: ");

         player2.pokemonsEscolhidos[i] = new Monstros(entrada.nextLine().toLowerCase());
         if(!(player2.pokemonsEscolhidos[i].isValid())){
            System.out.println("Esse pokemon nao existe! Tente novamente");
            i -= 1;
         }
         System.out.println('\n');
      }

      for(int i = 0; i < 30; i++){
         System.out.println('\n');
      }

      player1.pokemonAtual = player1.pokemonsEscolhidos[0];
      player2.pokemonAtual = player2.pokemonsEscolhidos[0];
      while(player1.vencedor == false && player2.vencedor == false){
         int danoPlayer1 = 0, danoPlayer2 = 0;

         System.out.println("[1] Atacar\n[2] Trocar Pokemon");
         System.out.print(player1.getNome() +", escolha uma acao: ");
         usrEscolha = Integer.parseInt(entrada.nextLine());

         if(usrEscolha == 1){
            System.out.println("Escolha um golpe");
            System.out.println("[0] " + player1.pokemonAtual.golpe.getNomeGolpe1());
            System.out.println("[1] " + player1.pokemonAtual.golpe.getNomeGolpe2());
            System.out.print("> ");
            usrEscolha = Integer.parseInt(entrada.nextLine());

            if(usrEscolha == 0)
               danoPlayer1 = player1.pokemonAtual.golpe.getForcaGolpe1() +
                  player1.pokemonAtual.getForca();
            else if(usrEscolha == 1)
               danoPlayer1 = player1.pokemonAtual.golpe.getForcaGolpe2() +
                  player1.pokemonAtual.getForca();

            if(player2.pokemonAtual.getFracoContra().equals(player1.pokemonAtual.getElemento())){
               System.out.println("Super Efetivo!");
               danoPlayer1 *= 2;
            }

            danoPlayer1 -= player2.pokemonAtual.getDefesa();
            if(danoPlayer1 < 0)
               danoPlayer1 = 0;
            System.out.println("Dano: " + danoPlayer1);
         }
         else if(usrEscolha == 2){
            System.out.println("Escolha um pokemon");
            System.out.println("|Atual -> " + player1.pokemonAtual.getNome() + "|");
            for(int i = 0; i < 3; i++){
               System.out.println("[" + i + "] " + player1.pokemonsEscolhidos[i].getNome());
            }

            System.out.print("> ");
            usrEscolha = Integer.parseInt(entrada.nextLine());
            player1.pokemonAtual = player1.pokemonsEscolhidos[usrEscolha];
         }

         System.out.println("\n\n\n");

         System.out.println("[1] Atacar\n[2] Trocar Pokemon");
         System.out.print(player2.getNome() + ", escolha uma acao: ");
         usrEscolha = Integer.parseInt(entrada.nextLine());

         if(usrEscolha == 1){
            System.out.println("Escolha um golpe");
            System.out.println("[0] " + player2.pokemonAtual.golpe.getNomeGolpe1());
            System.out.println("[1] " + player2.pokemonAtual.golpe.getNomeGolpe2());
            System.out.print("> ");
            usrEscolha = Integer.parseInt(entrada.nextLine());

            if(usrEscolha == 0)
               danoPlayer2 = player2.pokemonAtual.golpe.getForcaGolpe1() +
                  player2.pokemonAtual.getForca();
            else if(usrEscolha == 1)
               danoPlayer2 = player2.pokemonAtual.golpe.getForcaGolpe2() +
                  player2.pokemonAtual.getForca();

            if(player1.pokemonAtual.getFracoContra().equals(player2.pokemonAtual.getElemento())){
               System.out.println("Super Efetivo!");
               danoPlayer2 *= 2;
            }

            danoPlayer2 -= player2.pokemonAtual.getDefesa();
            if(danoPlayer2 < 0)
               danoPlayer2 = 0;
            System.out.println("Dano: " + danoPlayer2);
         }
         else if(usrEscolha == 2){
            System.out.println("Escolha um pokemon");
            System.out.println("|Atual -> " + player2.pokemonAtual.getNome() + "|");
            for(int i = 0; i < 3; i++){
               System.out.println("[" + i + "] " + player2.pokemonsEscolhidos[i].getNome());
            }

            System.out.print("> ");
            usrEscolha = Integer.parseInt(entrada.nextLine());
            player2.pokemonAtual = player2.pokemonsEscolhidos[usrEscolha];
         }

         System.out.println("\n\n\n");

         if(danoPlayer2 > player1.pokemonAtual.getVida())
            player1.pokemonAtual.dano(999);
         else
            player1.pokemonAtual.dano(danoPlayer2);
         if(danoPlayer1 > player2.pokemonAtual.getVida())
            player2.pokemonAtual.dano(999);
         else
            player2.pokemonAtual.dano(danoPlayer1);

         if(player1.pokemonAtual.getVida() <= 0){
            System.out.println("O pokemon " + player1.pokemonAtual.getNome() +
               " foi nocauteado");
            int countNocauteados = 0;
            for(int i = 0; i < 3; i++){
               if(player1.pokemonsEscolhidos[i].getVida() <= 0){
                  player1.pokemonsEscolhidos[i] = new Monstros(" ");
                  countNocauteados++;
               }
               if(player1.pokemonsEscolhidos[i].getVida() > 0)
                  player1.pokemonAtual = player1.pokemonsEscolhidos[i];
            }
            if(countNocauteados == 3)
               player2.vencedor = true;
            else
            System.out.println("Ele(a) sera substituido por " +
               player1.pokemonAtual.getNome());
         }

         if(player2.pokemonAtual.getVida() <= 0){
            System.out.println("O pokemon " + player2.pokemonAtual.getNome() +
               " foi nocauteado");
            int countNocauteados = 0;
            for(int i = 0; i < 3; i++){
               if(player2.pokemonsEscolhidos[i].getVida() <= 0){
                  player2.pokemonsEscolhidos[i] = new Monstros(" ");
                  countNocauteados++;
               }
               if(player2.pokemonsEscolhidos[i].getVida() > 0)
                  player2.pokemonAtual = player2.pokemonsEscolhidos[i];
            }
            if(countNocauteados == 3)
               player1.vencedor = true;
            else
            System.out.println("Ele(a) sera substituido por " +
               player2.pokemonAtual.getNome());
         }

         System.out.println("########################");
         System.out.println(player1.getNome() + "       " + player2.getNome());
         System.out.print(player1.pokemonAtual.getNome() + "    ");
         System.out.print(player2.pokemonAtual.getNome());
         System.out.print('\n');
         System.out.print(player1.pokemonAtual.getVida() + "       ");
         System.out.print(player2.pokemonAtual.getVida());
         System.out.print('\n');
         System.out.println("########################");
      }
      if(player1.vencedor)
         System.out.println("O vencedor foi " + player1.getNome());
      else if(player2.vencedor)
         System.out.println("O vencedor foi " + player2.getNome());
   }
}
