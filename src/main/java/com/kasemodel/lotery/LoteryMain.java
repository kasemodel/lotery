package com.kasemodel.lotery;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kasemodel.lotery.reader.FileReader;

public class LoteryMain {

	public static void main(String[] args) {
		
		String filePath = args[0]; 
		
		try {
			XSSFWorkbook workbook = FileReader.getInstance().readFile(filePath);
		} catch (FileNotFoundException e) {
			System.out.println(String.format("Arquivo %s n�o encontrado", filePath));
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(String.format("N�o foi poss�vel ler o arquivo %.", filePath));
			e.printStackTrace();
		}
		
		
	}

}
