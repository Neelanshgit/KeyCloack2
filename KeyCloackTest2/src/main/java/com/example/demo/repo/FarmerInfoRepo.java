package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FarmerInfo;

public interface FarmerInfoRepo extends JpaRepository<com.example.demo.entity.FarmerInfo, Integer> {

	com.example.demo.entity.FarmerInfo findByPhoneNumber(String phoneNumber);

	com.example.demo.entity.FarmerInfo findByFarmerId(int farmerId);

	FarmerInfo findByFarmerName(String farmerName);

	Long countByUserCode(String userCode);

	List<com.example.demo.entity.FarmerInfo> findByUserCode(String userCode);

	List<FarmerInfo> findAllFarmerInfoByUserCode(String usercode);
}
