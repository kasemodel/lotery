package com.kasemodel.lotery.vo;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {

	private Integer number;

	private LocalDate date;

	private Byte ball1;

	private Byte ball2;

	private Byte ball3;

	private Byte ball4;

	private Byte ball5;
	
	private Byte ball6;

}
