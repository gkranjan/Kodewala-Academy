package com.ploymorphism.fileExportSystem;

public class PDFExporter extends FileExporter {
	@Override
	public void export(String data)
	{
		System.out.println("Exported PDF: "+data);
	}

}
