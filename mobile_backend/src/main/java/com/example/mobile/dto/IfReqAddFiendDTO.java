package com.example.mobile.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class IfReqAddFiendDTO {
	private int userId;
	private String name;
	private String avatar;
	private long time;
}
