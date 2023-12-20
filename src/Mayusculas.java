import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class Mayusculas extends DocumentFilter {

    // Utilizo este método para asignar el filtro a un JTextComponent
    public static void setUpperCaseFilter(javax.swing.text.JTextComponent component) {
        Document doc = component.getDocument();
        if (doc instanceof javax.swing.text.AbstractDocument) {
            javax.swing.text.AbstractDocument abstractDoc = (javax.swing.text.AbstractDocument) doc;
            abstractDoc.setDocumentFilter(new Mayusculas());
        }
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
            throws BadLocationException {
        fb.insertString(offset, string.toUpperCase(), attr);
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
            throws BadLocationException {
        fb.replace(offset, length, text.toUpperCase(), attrs);
    }
}
