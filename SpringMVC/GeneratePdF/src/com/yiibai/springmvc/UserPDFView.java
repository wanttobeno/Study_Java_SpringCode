package com.yiibai.springmvc;


import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class UserPDFView extends AbstractPdfView {


    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document,
                                    PdfWriter pdfWriter, HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {

        Map<String,String> userData =(Map<String,String>) model.get("userData");

        //PdfPTable table = new PdfPTable(2);
        Table table = new Table(2);
        table.addCell("No.");
        table.addCell("User Name");
        // 使用iTextAsian.jar中的字体
        BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
        Font fontChinese = new Font(bfChinese, 12, Font.NORMAL);
        for(Map.Entry<String,String> entry:userData.entrySet()) {
            table.addCell(entry.getKey());
            //table.addCell(entry.getValue());
            table.addCell(new Paragraph(entry.getValue(),fontChinese));
        }
        document.add(table);
    }
}
