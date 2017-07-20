/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Samuel
 */

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import java.io.*; 
import satcar6.entity.Cliente;
import satcar6.entity.ReparacionEntity;


    
    public class CrearPDF {
    // Fonts definitions (Definición de fuentes).
    private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
         
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font smallFont = new Font(Font.FontFamily.TIMES_ROMAN, 6, Font.NORMAL);    
    private static final Font smallBold = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
    private static final String iTextExampleImage = "F:\\Workspace\\NetBeansProjects\\OrdenesTrabajo\\src\\Imagenes\\LOGO CENTRO FORMACION pequeño .png";
     
    
    
             
    
    /**
     * We create a PDF document with iText using different elements to learn 
     * to use this library.
     * Creamos un documento PDF con iText usando diferentes elementos para aprender 
     * a usar esta librería.
     * @param pdfNewFile  <code>String</code> 
     *      pdf File we are going to write. 
     *      Fichero pdf en el que vamos a escribir. 
     */
//    public void createPDF(File pdfNewFile, ReparacionEntity reparacion) throws Exception {
    public void createPDF(File pdfNewFile) throws Exception {
        // We create the document and set the file name.        
        // Creamos el documento e indicamos el nombre del fichero.
        try {
//            ClienteController cc = new ClienteController();
//            Cliente cliente = cc.buscarPorId(reparacion.getCliente());
            Document document = new Document();
            try {
 
                PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));
 
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("No such file was found to generate the PDF "
                        + "(No se encontró el fichero para generar el pdf)" + fileNotFoundException);
            }
            document.open();
            // We add metadata to PDF
            // Añadimos los metadatos del PDF
            document.addTitle("Table export to PDF (Exportamos la tabla a PDF)");
            document.addSubject("Using iText (usando iText)");
            document.addKeywords("Java, PDF, iText");
            document.addAuthor("Código Xules");
            document.addCreator("Código Xules");
             
            // First page
            // Primera página 
            Chunk chunk = new Chunk("ÓRDEN DE TRABAJO", categoryFont);
            Chunk c2 = new Chunk("\n\n\nCentro de Formación SATCAR6\n"
                    + "Calle Artes Gráficas n1 Nave 12 A\n"
                    + "Pinto (28320), Madrid",smallFont);
            
            Chunk c3 = new Chunk("Datos del Cliente",smallBold);
//            Chunk c4 = new Chunk("Nombre: "+cliente.getRazonSocial(),smallBold);
//            Chunk c5 = new Chunk("Población: "+cliente.getPoblacion(),smallBold);
//            Chunk c6 = new Chunk("Provincia: "+cliente.getProvincia(),smallBold);
//            Chunk c7 = new Chunk("Código Postal: "+cliente.getCp(),smallBold);
//            Chunk c8 = new Chunk("Num Teléfono: Pepito"+cliente.getTlf1(),smallBold);
            Chunk c4 = new Chunk("Nombre: Jesus Eduardo Garcia Toril",smallBold);
            Chunk c5 = new Chunk("Población: Pinto",smallBold);
            Chunk c6 = new Chunk("Provincia: Madrid",smallBold);
            Chunk c7 = new Chunk("Código Postal: 28320",smallBold);
            Chunk c8 = new Chunk("Num Teléfono: 659408182",smallBold);
            
            Paragraph parrafo = new Paragraph(chunk);
            Paragraph p2 = new Paragraph(c2);
            Paragraph p3 = new Paragraph(c3);
            Phrase ph1 = new Phrase(c4);
            Phrase ph2 = new Phrase(c5);
            Phrase ph3 = new Phrase(c6);
            Phrase ph4 = new Phrase(c7);
            Phrase ph5 = new Phrase(c8);
            
            
            
            // Let's create de first Chapter (Creemos el primer capítulo)
           
            // We add an image (Añadimos una imagen)
            Image image;
            try {
                parrafo.setAlignment(Element.ALIGN_CENTER);
                image = Image.getInstance(iTextExampleImage);  
                image.setAbsolutePosition(0, 750);
                p2.setAlignment(Element.ALIGN_LEFT);
                document.add(parrafo);
                document.add(image);
                document.add(p2);
                document.add(p3);
                document.add(ph1);
                document.add(ph2);
                document.add(ph3);
                document.add(ph4);
                document.add(ph5);
                
                
                
                
            } catch (BadElementException ex) {
                System.out.println("Image BadElementException" +  ex);
            } catch (IOException ex) {
                System.out.println("Image IOException " +  ex);
            }
             
            // Second page - some elements
            // Segunda página - Algunos elementos
            
            // List by iText (listas por iText)
            String text = "test 1 2 3 ";
            for (int i = 0; i < 5; i++) {
                text = text + text;
            }
            List list = new List(List.UNORDERED);
            ListItem item = new ListItem(text);
            item.setAlignment(Element.ALIGN_JUSTIFIED);
            list.add(item);
            text = "a b c align ";
            for (int i = 0; i < 5; i++) {
                text = text + text;
            }
            item = new ListItem(text);
            item.setAlignment(Element.ALIGN_JUSTIFIED);
            list.add(item);
            text = "supercalifragilisticexpialidocious ";
            for (int i = 0; i < 3; i++) {
                text = text + text;
            }
            item = new ListItem(text);
            item.setAlignment(Element.ALIGN_JUSTIFIED);
            list.add(item);
             
            // How to use PdfPTable
            // Utilización de PdfPTable
             
            // We use various elements to add title and subtitle
            // Usamos varios elementos para añadir título y subtítulo
            Anchor anchor = new Anchor("Table export to PDF (Exportamos la tabla a PDF)", categoryFont);
            anchor.setName("Table export to PDF (Exportamos la tabla a PDF)");            
            Chapter chapTitle = new Chapter(new Paragraph(anchor), 1);
            Paragraph paragraph = new Paragraph("Do it by Xules (Realizado por Xules)", subcategoryFont);
            Section paragraphMore = chapTitle.addSection(paragraph);
            paragraphMore.add(new Paragraph("This is a simple example (Este es un ejemplo sencillo)"));
            Integer numColumns = 6;
            Integer numRows = 120;
            // We create the table (Creamos la tabla).
            PdfPTable table = new PdfPTable(numColumns); 
            // Now we fill the PDF table 
            // Ahora llenamos la tabla del PDF
            PdfPCell columnHeader;
            // Fill table rows (rellenamos las filas de la tabla).                
            for (int column = 0; column < numColumns; column++) {
                columnHeader = new PdfPCell(new Phrase("COL " + column));
                columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(columnHeader);
            }
            table.setHeaderRows(1);
            // Fill table rows (rellenamos las filas de la tabla).                
            for (int row = 0; row < numRows; row++) {
                for (int column = 0; column < numColumns; column++) {
                    table.addCell("Row " + row + " - Col" + column);
                }
            }
            // We add the table (Añadimos la tabla)
            paragraphMore.add(table);
            // We add the paragraph with the table (Añadimos el elemento con la tabla).
            document.add(chapTitle);
            document.close();
            System.out.println("Your PDF file has been generated!(¡Se ha generado tu hoja PDF!");
        } catch (DocumentException documentException) {
            System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
        }
    }
    
}
