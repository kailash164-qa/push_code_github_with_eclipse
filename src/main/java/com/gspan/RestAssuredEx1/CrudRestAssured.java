/*
 * package com.gspan.RestAssuredEx1;
 * 
 * import static io.restassured.RestAssured.*; import static
 * org.testng.Assert.assertEquals;
 * 
 * import org.apache.http.client.methods.RequestBuilder; import
 * org.testng.annotations.BeforeClass; import org.testng.annotations.Test;
 * 
 * import io.restassured.RestAssured; import
 * io.restassured.builder.RequestSpecBuilder; import
 * io.restassured.builder.ResponseBuilder; import
 * io.restassured.builder.ResponseSpecBuilder; import
 * io.restassured.filter.log.LogDetail; import io.restassured.http.ContentType;
 * import io.restassured.path.json.JsonPath; import
 * io.restassured.response.Response; import
 * io.restassured.response.ValidatableResponse; import
 * io.restassured.specification.RequestSpecification; import
 * io.restassured.specification.ResponseSpecification;
 * 
 * public class CrudRestAssured { RequestSpecification requestSpecification;
 * ResponseSpecification responseSpecification; RequestSpecBuilder builder;
 * 
 * // public static final String baseURI ="https://reqres.in/";
 * 
 * 
 * public void beforeClass() {
 * 
 * // reqs = with().baseUri("https://reqres.in/").header("Content-type", //
 * "application/json");
 * 
 * // for request builder
 * 
 * builder = new RequestSpecBuilder()
 * .setBaseUri("https://gmail.googleapis.com/") .addHeader("Authorization",
 * "Bearer ya29.a0AeXRPp5B9yYiy4M4mAMJuoFwSrFcEowlALqNB1O05QCVZJkKPvWkRWWRfQGgSrSCNFbsaz280eIpciZBMWyaXxOpDP8JV-dZbq6ca5fiOo98O8_vVnA6RfRHVwc6E3t0CBZc1yST2C1q88l-MVduRLJTBOFRQN6QD7XQ_JXlnW00IisaCgYKARsSARASFQHGX2MizCSLqLAEbaVC3p3KYOKhDg0182"
 * )
 * 
 * .setContentType(ContentType.JSON) .log(LogDetail.ALL); //RestAssured.
 * requestSpecification = builder.build();
 * 
 * // for response builder ResponseSpecBuilder responseBuilder = new
 * ResponseSpecBuilder().expectStatusCode(200)
 * .expectContentType(ContentType.JSON).log(LogDetail.ALL); //RestAssured.
 * responseSpecification = responseBuilder.build(); // responseSpecification =
 * //
 * RestAssured.expect().statusCode(200).contentType(ContentType.JSON).log().all(
 * ); }
 * 
 * @Test public void validating_status_code_for_GET_request() {
 * 
 * // get("api/users?page=2");
 * 
 * given() .spec(requestSpecification) .pathParam("userId",
 * "kailash.bangad13@gmail.com")
 * 
 * .basePath("gmail/v1") .when() .get("/users/{userId}/profile")
 * .then().spec(responseSpecification);
 * 
 * 
 * }
 * 
 * @Test(enabled = false) public void
 * validating_resonseContent_for_GET_request() {
 * 
 * Response response =
 * get("api/users?page=2").then().spec(responseSpecification).extract().response
 * ();
 * 
 * System.out.println("2nd Testcase Respons :" + response.asPrettyString());
 * 
 * // assertThat(response.path("data[0].email").toString(),"");
 * 
 * }
 * 
 * @Test(enabled = false) public void createUser() {
 * 
 * 
 * 
 * String jsonString = "{\r\n" + "    \"name\": \"morpheus\",\r\n" +
 * "    \"job\": \"leader\"\r\n" + "}";
 * 
 * given().contentType(ContentType.JSON).body(jsonString).when().post(
 * "api/users").then().statusCode(201);
 * 
 * }
 * 
 * @Test(enabled = false) public void modifyUser() {
 * 
 * String jsonString = "{\r\n" + "    \"name\": \"morpheus\",\r\n" +
 * "    \"job\": \"zion resident\"\r\n" + "}";
 * 
 * given().contentType(ContentType.JSON).body(jsonString).when().put(
 * "api/users/2").then().statusCode(200);
 * 
 * }
 * 
 * @Test(enabled = false) public void GetAllUser() {
 * 
 * ValidatableResponse statusCode =
 * given().contentType(ContentType.JSON).when().get("api/users?page=2").then()
 * .statusCode(200).log().all();
 * 
 * }
 * 
 * @Test(enabled = false) public void DeleteUser() {
 * 
 * given().contentType(ContentType.JSON).when().delete("api/users/2").then().
 * statusCode(204);
 * 
 * }
 * 
 * }
 */