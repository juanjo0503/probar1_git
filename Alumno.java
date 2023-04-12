class Alumno
{
   //atirbutos
   private int nm;
   private String nombre;
   //constructor
   public Alumno(int nm, String nombre) {
      this.nm=nm;
      this.nombre=nombre;
   }
   //metodos
   public int getNm() {
      return nm;
   }
   public String getNombre() {
      return nombre;
   }
   //toString
   public String toString() {
      return "Alumno[nm="+nm+", nombre="+nombre+"]";
   }   
}