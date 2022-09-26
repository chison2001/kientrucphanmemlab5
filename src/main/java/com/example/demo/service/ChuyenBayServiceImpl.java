package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.repository.ChuyenBayRepository;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	@Override
	public List<ChuyenBay> listAllDAD() {
		List<ChuyenBay> listChuyenBay = chuyenBayRepository.listAllDAD();
		return listChuyenBay;
	}

}
