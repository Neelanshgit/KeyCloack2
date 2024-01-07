package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmer_info_with_veg")
public class FarmerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "farmer_id")
	private int farmerId;

	@Column(name = "user_code")
	private String userCode;

	@Column(name = "farmer_name")
	private String farmerName;

	@Column(name = "farmer_phone_no")
	private String phoneNumber;
	@Column(name = "alternate_Number")
	private String alternateNumber;

	@Column(name = "selling_area")
	private String area;

	@Column(name = "current_vegetable")
	private String vegCurntCarrying;

	@Column(name = "quantity_of_vegetable")
	private String vegetableQuantity;

	@Column(name = "mandi_distance")
	private String distanceFromMandi;

	@Column(name = "name_of_transport")
	private String transportName;

	@Column(name = "counts_of_visits")
	private String farmerVisitingCount;

	@Column(name = "type_of_visits")
	private String typeOfVisit;

	@Column(name = "area_of_selling")
	private String sellingArea;

	@Column(name = "mandi_name")
	private String nameOfMandi;

	@Column(name = "vegetable_variety")
	private String varietyOfVegetables;

	@Column(name = "given_commision_by_farmer")
	private String amountOfCommision;

	@Column(name = "type_one_question")
	private String quest1;

	@Column(name = "type_two_question")
	private String quest2;

	@Column(name = "type_three_question")
	private String quest3;

	@Column(name = "type_four_question")
	private String quest4;

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getAlternateNumber() {
		return alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getVegCurntCarrying() {
		return vegCurntCarrying;
	}

	public void setVegCurntCarrying(String vegCurntCarrying) {
		this.vegCurntCarrying = vegCurntCarrying;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getVegetableQuantity() {
		return vegetableQuantity;
	}

	public void setVegetableQuantity(String vegetableQuantity) {
		this.vegetableQuantity = vegetableQuantity;
	}

	public String getTransportName() {
		return transportName;
	}

	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	public String getDistanceFromMandi() {
		return distanceFromMandi;
	}

	public void setDistanceFromMandi(String distanceFromMandi) {
		this.distanceFromMandi = distanceFromMandi;
	}

	public String getFarmerVisitingCount() {
		return farmerVisitingCount;
	}

	public void setFarmerVisitingCount(String farmerVisitingCount) {
		this.farmerVisitingCount = farmerVisitingCount;
	}

	public String getSellingArea() {
		return sellingArea;
	}

	public void setSellingArea(String sellingArea) {
		this.sellingArea = sellingArea;
	}

	public String getNameOfMandi() {
		return nameOfMandi;
	}

	public void setNameOfMandi(String nameOfMandi) {
		this.nameOfMandi = nameOfMandi;
	}

	public String getTypeOfVisit() {
		return typeOfVisit;
	}

	public void setTypeOfVisit(String typeOfVisit) {
		this.typeOfVisit = typeOfVisit;
	}

	public String getVarietyOfVegetables() {
		return varietyOfVegetables;
	}

	public void setVarietyOfVegetables(String varietyOfVegetables) {
		this.varietyOfVegetables = varietyOfVegetables;
	}

	public String getAmountOfCommision() {
		return amountOfCommision;
	}

	public void setAmountOfCommision(String amountOfCommision) {
		this.amountOfCommision = amountOfCommision;
	}

	public String getQuest1() {
		return quest1;
	}

	public void setQuest1(String quest1) {
		this.quest1 = quest1;
	}

	public String getQuest2() {
		return quest2;
	}

	public void setQuest2(String quest2) {
		this.quest2 = quest2;
	}

	public String getQuest3() {
		return quest3;
	}

	public void setQuest3(String quest3) {
		this.quest3 = quest3;
	}

	public String getQuest4() {
		return quest4;
	}

	public void setQuest4(String quest4) {
		this.quest4 = quest4;
	}

	public FarmerInfo(int farmerId, String userCode, String farmerName, String phoneNumber, String alternateNumber,
			String area, String vegCurntCarrying, String vegetableQuantity, String distanceFromMandi,
			String transportName, String farmerVisitingCount, String typeOfVisit, String sellingArea,
			String nameOfMandi, String varietyOfVegetables, String amountOfCommision, String quest1, String quest2,
			String quest3, String quest4) {
		super();
		this.farmerId = farmerId;
		this.userCode = userCode;
		this.farmerName = farmerName;
		this.phoneNumber = phoneNumber;
		this.alternateNumber = alternateNumber;
		this.area = area;
		this.vegCurntCarrying = vegCurntCarrying;
		this.vegetableQuantity = vegetableQuantity;
		this.distanceFromMandi = distanceFromMandi;
		this.transportName = transportName;
		this.farmerVisitingCount = farmerVisitingCount;
		this.typeOfVisit = typeOfVisit;
		this.sellingArea = sellingArea;
		this.nameOfMandi = nameOfMandi;
		this.varietyOfVegetables = varietyOfVegetables;
		this.amountOfCommision = amountOfCommision;
		this.quest1 = quest1;
		this.quest2 = quest2;
		this.quest3 = quest3;
		this.quest4 = quest4;
	}

	@Override
	public String toString() {
		return "FarmerInfo [farmerId=" + farmerId + ", userCode=" + userCode + ", farmerName=" + farmerName
				+ ", phoneNumber=" + phoneNumber + ", alternateNumber=" + alternateNumber + ", area=" + area
				+ ", vegCurntCarrying=" + vegCurntCarrying + ", vegetableQuantity=" + vegetableQuantity
				+ ", distanceFromMandi=" + distanceFromMandi + ", transportName=" + transportName
				+ ", farmerVisitingCount=" + farmerVisitingCount + ", typeOfVisit=" + typeOfVisit + ", sellingArea="
				+ sellingArea + ", nameOfMandi=" + nameOfMandi + ", varietyOfVegetables=" + varietyOfVegetables
				+ ", amountOfCommision=" + amountOfCommision + ", quest1=" + quest1 + ", quest2=" + quest2 + ", quest3="
				+ quest3 + ", quest4=" + quest4 + "]";
	}

	public FarmerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}