package pages;

import org.openqa.selenium.By;

public class Elementos {

	// Enter vehicle data
	By make = By.cssSelector("#make > option:nth-child(3)");

	public By getMake() {
		return make;
	}

	public By getOption() {
		return option;
	}

	public By getEnginePerformance() {
		return enginePerformance;
	}

	public By getDateofManufacture() {
		return dateofManufacture;
	}

	public By getNumberOfSeats() {
		return numberOfSeats;
	}

	public By getFuel() {
		return fuel;
	}

	public By getPayload() {
		return payload;
	}

	public By getTotalWeight() {
		return totalWeight;
	}

	public By getListPrice() {
		return listPrice;
	}

	public By getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public By getAnnualMileage() {
		return annualMileage;
	}

	public By getBotaoNext1() {
		return botaoNext1;
	}

	public By getFirstName() {
		return firstName;
	}

	public By getLastname() {
		return lastname;
	}

	public By getDateOfBirth() {
		return dateOfBirth;
	}

	public By getGenderM() {
		return genderM;
	}

	public By getGenderF() {
		return genderF;
	}

	public By getStreetAddress() {
		return streetAddress;
	}

	public By getCountry() {
		return Country;
	}

	public By getZipCode() {
		return zipCode;
	}

	public By getCity() {
		return city;
	}

	public By getOccupation() {
		return occupation;
	}

	public By getHobbies() {
		return hobbies;
	}

	public By getWebsite() {
		return website;
	}

	public By getPicture() {
		return picture;
	}

	public By getBotaoNext2() {
		return botaoNext2;
	}

	public By getStartDate() {
		return startDate;
	}

	public By getInsurancesum() {
		return insurancesum;
	}

	public By getMeritrating() {
		return meritrating;
	}

	public By getDamageInsurance() {
		return damageInsurance;
	}

	public By getEuroProtection() {
		return EuroProtection;
	}

	public By getCourtesycaryes() {
		return courtesycaryes;
	}

	public By getCourtesycarno() {
		return courtesycarno;
	}

	public By getBotaoNext3() {
		return botaoNext3;
	}

	public By getSelecSilver() {
		return selecSilver;
	}

	public By getBotaoNext() {
		return botaoNext;
	}

	public By getEmail() {
		return email;
	}

	public By getPhone() {
		return phone;
	}

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getComments() {
		return comments;
	}

	public By getOk() {
		return ok;
	}

	public By getSendEmail() {
		return sendEmail;
	}

	public By getModel() {
		return model;
	}

	public By getCylindercapacity() {
		return cylindercapacity;
	}

	public By getNumberOfSeatsmotorcycle() {
		return numberOfSeatsmotorcycle;
	}

	public By getSelecPlatinum() {
		return selecPlatinum;
	}

	public By getRighthanddDriveNo() {
		return righthandDriveNo;
	}

	By option = By.cssSelector("#make > option:nth-child(3)");

	// vehicle data
	By enginePerformance = By.id("engineperformance");
	By dateofManufacture = By.id("dateofmanufacture");
	By numberOfSeats = By.id("numberofseats");
	By fuel = By.cssSelector("#fuel > option:nth-child(3)");
	By listPrice = By.id("listprice");
	By licensePlateNumber = By.id("licenseplatenumber");
	By annualMileage = By.id("annualmileage");
	By botaoNext1 = By.id("nextenterinsurantdata");

	// truck data
	By payload = By.id("payload");
	By totalWeight = By.id("totalweight");

	// Motorcycle
	By model = By.cssSelector("#model > option:nth-child(2)");
	By cylindercapacity = By.id("cylindercapacity");
	By numberOfSeatsmotorcycle = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");

	// camper
	By righthandDriveNo = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(5) > p > label:nth-child(2) > span");

	// Enter insurance data
	By firstName = By.id("firstname");
	By lastname = By.id("lastname");
	By dateOfBirth = By.id("birthdate");
	By genderM = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	By genderF = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span");
	By streetAddress = By.id("streetaddress");
	By Country = By.cssSelector("#country > option:nth-child(32)");
	By zipCode = By.id("zipcode");
	By city = By.id("city");
	By occupation = By.cssSelector("#occupation > option:nth-child(2)");
	By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]");
	By website = By.id("website");
	By picture = By.id("open");
	By botaoNext2 = By.cssSelector("#nextenterproductdata");

	// enter product data
	By startDate = By.id("startdate");
	By insurancesum = By.cssSelector("#insurancesum > option:nth-child(2)");
	By meritrating = By.cssSelector("#meritrating > option:nth-child(5)");
	By damageInsurance = By.cssSelector("#damageinsurance > option:nth-child(4)");
	By EuroProtection = By.cssSelector(
			"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1)");
	By courtesycaryes = By.cssSelector("#courtesycar > option:nth-child(3)");
	By courtesycarno = By.cssSelector("#courtesycar > option:nth-child(2)");
	By botaoNext3 = By.cssSelector("#nextselectpriceoption");

	// select price options
	By selecSilver = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1)");
	By selecPlatinum = By.cssSelector("#selectplatinum");
	By botaoNext = By.cssSelector("#nextsendquote");

	// send quote
	By email = By.id("email");
	By phone = By.id("phone");
	By username = By.id("username");
	By password = By.cssSelector("#password");
	By confirmPassword = By.id("confirmpassword");
	By comments = By.id("Comments");
	By ok = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");
	By sendEmail = By.id("sendemail");

}
