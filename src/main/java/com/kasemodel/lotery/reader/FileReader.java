package com.kasemodel.lotery.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class FileReader {

	private static FileReader instance;

	private FileReader() {
	}

	public static FileReader getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new FileReader();
				}
			}
		}
		return instance;
	}

	public XSSFWorkbook readFile(final String filePath) throws FileNotFoundException, IOException {
		if (StringUtils.isEmpty(filePath)) {
			throw new IllegalArgumentException("The filePath argumento can not be NULL.");
		}
		return new XSSFWorkbook(new FileInputStream(filePath));
	}

}
