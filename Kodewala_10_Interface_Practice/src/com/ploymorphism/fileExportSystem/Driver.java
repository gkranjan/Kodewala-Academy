package com.ploymorphism.fileExportSystem;

public class Driver {

	public static void main(String[] args) {

		FileExporter exporter;
		String data="Monthly sales Report";
		
		exporter = new PDFExporter();
		exporter.export(data);
		
		exporter = new ExcelExporter();
		exporter.export(data);
		
		exporter = new CSVExporter();
		exporter.export(data);
	}

}
