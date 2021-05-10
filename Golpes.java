public class Golpes{
   private String[] nomeGolpe = new String[2];
   private int[] forcaGolpe = new int[2];
   private Elemento elementoGolpe;

   public Golpes(String pokeNome){
      if(pokeNome.equals("Aegislash")){
         this.elementoGolpe = new Elemento("fantasma");
         this.nomeGolpe[0] = "Bola Sombria";
         this.nomeGolpe[1] = "Canhao de Flash";
         this.forcaGolpe[0] = 150;
         this.forcaGolpe[1] = 80;
      }
      else if(pokeNome.equals("Darkrai")){
         this.elementoGolpe = new Elemento("sombrio");
         this.nomeGolpe[0] = "Pulso Sombrio";
         this.nomeGolpe[1] = "Rugido";
         this.forcaGolpe[0] = 77;
         this.forcaGolpe[1] = 160;
      }
      else if(pokeNome.equals("Cresselia")){
         this.elementoGolpe = new Elemento("psiquico");
         this.nomeGolpe[0] = "Confusao";
         this.nomeGolpe[1] = "Explosao Lunar";
         this.forcaGolpe[0] = 114;
         this.forcaGolpe[1] = 87;
      }
      else if(pokeNome.equals("Poipole")){
         this.elementoGolpe = new Elemento("venenoso");
         this.nomeGolpe[0] = "venoshock";
         this.nomeGolpe[1] = "Caude de Ferro";
         this.forcaGolpe[0] = 190;
         this.forcaGolpe[1] = 27;
      }
      else if(pokeNome.equals("Garchomp")){
         this.elementoGolpe = new Elemento("dragao");
         this.nomeGolpe[0] = "Bafo de Dragao";
         this.nomeGolpe[1] = "Mordida";
         this.forcaGolpe[0] = 176;
         this.forcaGolpe[1] = 11;
      }
      else if(pokeNome.equals("Alcremie")){
         this.elementoGolpe = new Elemento("fada");
         this.nomeGolpe[0] = "Beijo Doce";
         this.nomeGolpe[1] = "Choque Psiquico";
         this.forcaGolpe[0] = 151;
         this.forcaGolpe[1] = 36;
      }
   }

   public String getNomeGolpe1(){
      return this.nomeGolpe[0];
   }
   public String getNomeGolpe2(){
      return this.nomeGolpe[1];
   }

   public int getForcaGolpe1(){
      return this.forcaGolpe[0];
   }
   public int getForcaGolpe2(){
      return this.forcaGolpe[1];
   }
}
