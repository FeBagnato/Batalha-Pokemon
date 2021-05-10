public class Elemento{
   private String nomeElemento;
   private String fraqueza;
   private String efetivo;

   public Elemento(String pokeNomeElemento){
      this.nomeElemento = pokeNomeElemento;

      if(pokeNomeElemento.equals("sombrio")){
         this.efetivo = "fantasma";
         this.fraqueza = "dragao";
      }
      else if(pokeNomeElemento.equals("fantasma")){
         this.efetivo = "psiquico";
         this.fraqueza = "sombrio";
      }
      else if(pokeNomeElemento.equals("psiquico")){
         this.efetivo = "venenoso";
         this.fraqueza = "fantasma";
      }
      else if(pokeNomeElemento.equals("venenoso")){
         this.efetivo = "fada";
         this.fraqueza = "psiquico";
      }
      else if(pokeNomeElemento.equals("fada")){
         this.efetivo = "dragao";
         this.fraqueza = "venenoso";
      }
      else if(pokeNomeElemento.equals("dragao")){
         this.efetivo = "sombrio";
         this.fraqueza = "fada";
      }
   }

   public String getFracoContra(){
      return this.fraqueza;
   }

   public String getElemento(){
      return this.nomeElemento;
   }
}
