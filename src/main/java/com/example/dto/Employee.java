package com.example.dto;

import java.io.Serializable;

import lombok.Builder;

@Builder
public class Employee implements Serializable{
	private Integer id;
	private String name;
	private String address;
}
