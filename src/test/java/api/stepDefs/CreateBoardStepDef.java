package api.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateBoardStepDef extends TestBaseApi {

    Response response;
    JsonPath jsonPath;

    @Given("send post request for create {string} board")
    public void send_post_request_for_create_board(String boardName) {

        //String url="https://api.trello.com/1/boards";
        setUp();
        spec.pathParams("parametre1",1,"parametre2","boards");

        HashMap<String,String>requestBody=new HashMap<>();

        requestBody.put("name",boardName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        System.out.println(requestBody);

        //contentType bazen accept olabiliyor
        response=given().contentType("application/json").spec(spec).body(requestBody).
                when().post("/{parametre1}/{parametre2}");

        response.prettyPrint();
        //621e8055920c1e54fd55806c=id

    }

    @Then("assert status code {int}")
    public void assertStatusCode(int statusCode) {

        Assert.assertEquals(statusCode,response.getStatusCode());
    }

    @Then("assert board name is {string}")
    public void assert_board_name_is(String boardName) {

        jsonPath=response.jsonPath();
        Assert.assertEquals(boardName,jsonPath.getString("name"));

    }


}
