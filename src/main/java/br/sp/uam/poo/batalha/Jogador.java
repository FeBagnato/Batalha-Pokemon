package br.sp.uam.poo.batalha;

public class Jogador {
   private String nome;
   Monstros pokemonAtual;
   Monstros[] pokemonsEscolhidos = new Monstros[3];
   boolean vencedor = false;
   
   public void setNome(String novoNome){
      this.nome = novoNome;
   }
   public String getNome(){
      return this.nome;
   }
}
