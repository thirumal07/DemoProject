package com.adv.oopsconcepts.fourthpackage;

public class SampleCollege {

	private int collegeCode;

	private String collegeName;

	private int collegeFoundedYear;

	private String founderName;

	private String clgPrincipalName;

	private int noOfBuses;

	public SampleCollege() {
		this("A1");
		System.out.println("This is a Default Constructor ... ");
	}
    
	public SampleCollege(String collegeName) {
		this("Sivakumar", 4993);
		this.collegeName = collegeName;
		System.out.println("college name is : " +collegeName);
	}

	public SampleCollege(int code, String clgName) {
		this.collegeCode = code;
		this.collegeName = clgName;
	}

	public SampleCollege(String princiName, int noOfBuses) {
		this("BBB College","Albert",54);
		this.clgPrincipalName = princiName;
		this.noOfBuses = noOfBuses;
		System.out.println("Pricipal : " +clgPrincipalName+ ",  Total Buses :"+noOfBuses);
		
	}

	public SampleCollege(String founderName, String princiName) {
		this.founderName = founderName;
		this.clgPrincipalName = princiName;
	}

	public SampleCollege(int collegeCode, int noOfBuses) {
		this.collegeCode = collegeCode;
		this.noOfBuses = noOfBuses;
	}

	public SampleCollege(int collegeFoundedYear, int noOfBuses, String founderName) {
		this.collegeFoundedYear = collegeFoundedYear;
		this.founderName = founderName;
		this.noOfBuses = noOfBuses;
	}

	public SampleCollege(int collegeCode, String collegeName, int collegeFoundedYear) {
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.collegeFoundedYear = collegeFoundedYear;
	}

	public SampleCollege(String clgName, int year, String clgPrinciName) {
		this.collegeName = clgName;
		this.collegeFoundedYear = year;
		this.clgPrincipalName = clgPrinciName;
	}

	public SampleCollege(String collegeName, String founderName, int noOfBuses) {
		this.collegeName = collegeName;
		this.founderName = founderName;
		this.noOfBuses = noOfBuses;
		System.out.println("Name : " +collegeName+ ", Founder Name : "+founderName+ ", No Of Buses :"+noOfBuses);
	}

	public SampleCollege(String collegeName, String founderName, String clgPrincipalName) {
		this.collegeName = collegeName;
		this.founderName = founderName;
		this.clgPrincipalName = clgPrincipalName;
	}

	public SampleCollege(int collegeFoundedYear, String founderName, String clgPrincipalName) {
		this.collegeFoundedYear = collegeFoundedYear;
		this.founderName = founderName;
		this.clgPrincipalName = clgPrincipalName;
	}

	public SampleCollege(int collegeCode, String collegeName, int collegeFoundedYear, String founderName,
			String clgPrincipalName) {
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.collegeFoundedYear = collegeFoundedYear;
		this.founderName = founderName;
		this.clgPrincipalName = clgPrincipalName;
	}

	public SampleCollege(String collegeName, int collegeFoundedYear, String founderName, String clgPrincipalName) {
		this.collegeName = collegeName;
		this.collegeFoundedYear = collegeFoundedYear;
		this.founderName = founderName;
		this.clgPrincipalName = clgPrincipalName;
	}

	public SampleCollege(int collegeCode, String collegeName, int collegeFoundedYear, String founderName,
			String clgPrincipalName, int noOfBuses) {
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.collegeFoundedYear = collegeFoundedYear;
		this.founderName = founderName;
		this.clgPrincipalName = clgPrincipalName;
		this.noOfBuses = noOfBuses;
	}

	public int getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getCollegeFoundedYeat() {
		return collegeFoundedYear;
	}

	public void setCollegeFoundedYear(int foundedYear) {
		this.collegeFoundedYear = foundedYear;
	}

	public String getFounderName() {
		return founderName;
	}

	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}

	public String getClgPrincipalName() {
		return clgPrincipalName;
	}

	public void setClgPrincipalName(String clgPriciName) {
		this.clgPrincipalName = clgPriciName;
	}

	public int getNoOfBuses() {
		return noOfBuses;
	}

	public void setNoOfBuses(int noOfBuses) {
		this.noOfBuses = noOfBuses;
	}

}
