public class caja <T>{
    private T contenido;
    public void guardar (T contenido){
        this.contenido = contenido;

    }
   public  T obtener (){
        return  contenido;
   }
}
