package com.manthan.resume.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import com.manthan.resume.bean.ResumeBean;

public class ResumeReader {
	public ResumeBean resumeReader(File file, String keyword) throws IOException {
		if(file.getName().endsWith(".pdf")) {
			ResumeBean resumeBean = new ResumeBean();
			PDDocument document = PDDocument.load(file);

			// Instantiate PDFTextStripper class
			PDFTextStripper pdfStripper = new PDFTextStripper();

			// Retrieving text from PDF document
			String text = pdfStripper.getText(document);

			String newText=text.replaceAll("\n", " ").replaceAll("\r", " ").toLowerCase();

			if(newText.contains(keyword)) {
				resumeBean=new ResumeBean();
				String email=null;
				String[] arr=newText.split(" ");
				for(String s:arr) {
					Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
					Matcher matcher = pattern.matcher(s);

					while(matcher.find()) {
						email= matcher.group();
					}

					resumeBean.setName(file.getName());
					resumeBean.setFileName(file.getName());
					resumeBean.setEmail(email);
				}
			}
			document.close();
			return resumeBean;
		}



		else if(file.getName().endsWith(".docx")||file.getName().endsWith(".doc")) {
			ResumeBean resume = new ResumeBean();

			try {
				FileInputStream fis = new FileInputStream(file.getAbsolutePath());
				XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
				XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
				String text=extractor.getText();
				System.out.println(text);
				String newText=text.replaceAll("\n", " ").replaceAll("\r", " ").toLowerCase();
				System.out.println(newText);
				if(newText.contains(keyword)) {
					String[] arr=newText.split(" ");
					String email=null;
					for(String s:arr) {
						Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
						Matcher matcher = pattern.matcher(s);

						while(matcher.find()) {
							email= matcher.group();
						}

					}resume.setName(file.getName());
					resume.setFileName(file.getName());
					resume.setEmail(email);
				}

			} catch(Exception ex) {
				ex.printStackTrace();
			}
			return resume;
		}
		else {
			return null;
		}




	}
}
