
package standardfilemanager;

public class KeyPosition {
    private String llave;
    private long pos;

    public KeyPosition(String llave, long pos) {
        this.llave = llave;
        this.pos = pos;
    } // Fin Constructor Key Position

    public String getLlave() {
        return llave;
    } // Fin Get Llave

    public void setLlave(String llave) {
        this.llave = llave;
    } // Fin Set Llave

    public long getPos() {
        return pos;
    } // Fin Get Pos

    public void setPos(long pos) {
        this.pos = pos;
    } // Fin Set Pos

    @Override
    public String toString() {
        return "[Llave: " + llave + "; RRN: " + pos + ']';
    } // Fin toString
    
} // Fin Key Position
