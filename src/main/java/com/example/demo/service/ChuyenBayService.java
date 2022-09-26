package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ChuyenBay;

@Service
public interface ChuyenBayService {

	 public List<ChuyenBay> listAllDAD();
}
