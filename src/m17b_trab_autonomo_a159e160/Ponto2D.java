package m17b_trab_autonomo_a159e160;

/**
 * Classe Ponto2D
 * @version 2.0, 18.fev.2021
 * @author Miguel.B
 */

public class Ponto2D {
       /** Eixo x */
    private int x;
       /** Eixo y */
    private int y;
     /** nome do autor do livro<br>
    *  Caso hajam vários autores fica indicado apenas um.
    */
     /** construtor com valor inicial de 0  */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    /** Construtor sem parâmetros Ponto2D que inicializa os atributos
    * com valores predefinidos conhecidos 
    *  @param x eixo x
    *  @param y eixo y                */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /** Metodo Ponto2D
     * @param a ponto a
     *  @return retorna distancia entre o ponto */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    /** @param x Setter do eixo x, retorna o valor do x */
    public void setX(int x) {
        this.x = x;
    }
    /** @param y Setter do eixo y, retorna o valor do y */
    public void setY(int y) {
        this.y = y;
    }
    /** @return Getter do eixo x, retorna o valor do x */
    public int getX() {
        return x;
    }
    /** @return Getter do eixo y, retorna o valor do x */
    public int getY() {
        return y;
    }
    /** Metodo toString() retorna o 'x' e o 'y' com identificaçoes  */
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
