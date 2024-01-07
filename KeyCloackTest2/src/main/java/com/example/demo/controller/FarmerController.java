package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FarmerInfo;
import com.example.demo.repo.FarmerInfoRepo;
import com.example.demo.util.AppConstants;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
public class FarmerController {

	@Autowired
	// just for key cloack making these quick thing
	FarmerInfoRepo farmerService;

	@GetMapping("/getfarmerCountByUserCode")
	// @Operation(summary = "userCode ke hisab se sabji ka count nikale ")
	public ResponseEntity<?> getfarmerCountByUserCode(@RequestParam("userCode") String userCode) {

		Long count = farmerService.countByUserCode(userCode);

		return new ResponseEntity(AppConstants.SUCCESSSTATUS, HttpStatus.OK);
	}

	@GetMapping("/getAllKisanByUserCode")
//	@Operation(summary = "userCode ke hisab se sare farmer ")
	public ResponseEntity<?> getfarmerByUserCode(@RequestParam("userCode") String userCode) {

		List<FarmerInfo> farmerInfoDTOs = farmerService.findAll();

		return new ResponseEntity(farmerInfoDTOs, HttpStatus.OK);

	}
}
