package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ChuyenBay;

import com.example.demo.service.ChuyenBayService;

@RestController
@RequestMapping("/hangkhong")
public class HangKhongController {
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/DAD-all")
	public List<ChuyenBay> getAllDAD(){
		List<ChuyenBay> listChuyenBay = chuyenBayService.listAllDAD();
		System.out.println(listChuyenBay);
		return listChuyenBay ;
	}
}
