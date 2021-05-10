public class Monstros{
   Golpes golpe;
   private String nome;
   private Elemento elemento;
   private int vida;
   private int forca;
   private int defesa;
   private int velocidade;

   public Monstros(String pokeNome){
      this.nome = pokeNome;

      if(pokeNome.equals("Aegislash")){
         this.elemento = new Elemento("fantasma");
         this.golpe = new Golpes(pokeNome);
         this.vida = 510;
         this.forca = 20;
         this.defesa = 87;
         this.velocidade = 27;
      }
      else if(pokeNome.equals("Darkrai")){
         this.elemento = new Elemento("sombrio");
         this.golpe = new Golpes(pokeNome);
         this.vida = 690;
         this.forca = 10;
         this.defesa = 46;
         this.velocidade = 24;
      }
      else if(pokeNome.equals("Cresselia")){
         this.elemento = new Elemento("psiquico");
         this.golpe = new Golpes(pokeNome);
         this.vida = 564;
         this.forca = 23;
         this.defesa = 47;
         this.velocidade = 28;
      }
      else if(pokeNome.equals("Poipole")){
         this.elemento = new Elemento("venenoso");
         this.golpe = new Golpes(pokeNome);
         this.vida = 561;
         this.forca = 63;
         this.defesa = 46;
         this.velocidade = 26;
      }
      else if(pokeNome.equals("Garchomp")){
         this.elemento = new Elemento("dragao");
         this.golpe = new Golpes(pokeNome);
         this.vida = 642;
         this.forca = 16;
         this.defesa = 35;
         this.velocidade = 28;
      }
      else if(pokeNome.equals("Alcremie")){
         this.elemento = new Elemento("fada");
         this.golpe = new Golpes(pokeNome);
         this.vida = 640;
         this.forca = 36;
         this.defesa = 50;
         this.velocidade = 24;
      }
   }

   public String getNome(){
      return this.nome;
   }

   public int getVida(){
      return this.vida;
   }

   public void dano(int dano){
      this.vida -= dano;
   }

   public int getForca(){
      return this.forca;
   }

   public int getDefesa(){
      return this.defesa;
   }

   public int getVelocidade(){
      return this.velocidade;
   }


   public String getNomeGolpe1(){
      return this.golpe.getNomeGolpe1();
   }
   public String getNomeGolpe2(){
      return this.golpe.getNomeGolpe2();
   }

   public int getForcaGolpe1(){
      return this.golpe.getForcaGolpe1();
   }
   public int getForcaGolpe2(){
      return this.golpe.getForcaGolpe2();
   }


   public String getFracoContra(){
      return this.elemento.getFracoContra();
   }
   public String getElemento(){
      return this.elemento.getElemento();
   }
}
