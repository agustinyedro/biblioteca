package biblioteca.Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class TableGradientCell extends DefaultTableCellRenderer {

    public TableGradientCell() {
        this(Color.decode("#5F0A87"), Color.decode("#A4508B"));
    }

    public TableGradientCell(Color color1, Color color2) {
        this.color1 = color1;
        this.color2 = color2;
        setOpaque(false);
    }

    private Color color1;
    private Color color2;
    private int x;
    private int width;
    private boolean isSelected;
    private int row;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Rectangle cellRec = table.getCellRect(row, column, true);
        x = -cellRec.x;
        width = table.getWidth() - cellRec.x;
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.isSelected = isSelected;
        this.row = row;
        
        if (column == 2 && value instanceof Image) {
        Image image = (Image) value;
        ImageIcon icon = new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH)); // Ajusta el tamaño de la imagen
        setIcon(icon);
        setText(""); // Limpiar el texto en la celda
    } else {
        // Si no estamos en la columna 2 o el valor no es una imagen, asegúrate de no mostrar el icono
        setIcon(null);
        setText(value == null ? "" : value.toString());
            setForeground(new Color(20,16,38));
    }

        return com;
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        if (isSelected) {
            g2.setPaint(new GradientPaint(x, 0, color1, width, 0, color2));
            g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        } else if (row % 2 == 0) {
            g2.setPaint(new GradientPaint(x, 0, Color.decode("#FFA69E"), width, 0, Color.decode("#861657")));
            g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        }
        g2.dispose();
        super.paintComponent(g);
    }
}
