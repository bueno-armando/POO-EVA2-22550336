package eva2_4_formato_apa;

/**
 *
 * @author Armando Bueno
 */
public class Libro extends Documento{
    private int edition;
    private String editor;

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }  
}
