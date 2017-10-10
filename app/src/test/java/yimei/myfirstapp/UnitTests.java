package yimei.myfirstapp;

//import com.amazonaws.mobileconnectors.apigateway.ApiClientFactory;
//import com.myApi.clientsdk.MyApiClient;
//import com.myApi.clientsdk.model.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTests {
//    @Test
//    public void testCreateHangout() throws Exception {
//        ApiClientFactory factory = new ApiClientFactory();
//        MyApiClient client = factory.build(MyApiClient.class);
//        BigDecimal id = BigDecimal.valueOf(25);
//        String hangoutName = "Twenty-five";
//
//        CreateHangout createHangout = new CreateHangout();
//        createHangout.setId(id);
//        createHangout.setHangoutName(hangoutName);
//
//        Success response = client.hangoutCreatePost(createHangout);
//        System.out.println(response.getOutput());
//
//        assertEquals(4, 2 + 2);
//    }
//
//    @Test
//    public void testGetHangout() throws Exception {
//        ApiClientFactory factory = new ApiClientFactory();
//        MyApiClient client = factory.build(MyApiClient.class);
//        BigDecimal id = BigDecimal.valueOf(2);
//
//        HangoutRequest request;
//        request = new HangoutRequest();
//        request.setId(id);
//
//        String response = client.hangoutGetGet(request);
//        final JSONObject objItem = new JSONObject(response).getJSONObject("Item");
//        int expectedId = 2;
//        String expectedHangoutName = "Boba!";
//        System.out.println(response);
//        assertEquals(expectedId, objItem.getInt("HangoutId"));
//        assertEquals(expectedHangoutName, objItem.getString("HangoutName"));
//    }
//
//    @Test
//    public void testGetAllHangout() throws Exception {
//        ApiClientFactory factory = new ApiClientFactory();
//        MyApiClient client = factory.build(MyApiClient.class);
//        BigDecimal id = BigDecimal.valueOf(2);
//
//        HangoutRequest request;
//        request = new HangoutRequest();
//        request.setId(id);
//
//        String response = client.hangoutGetallGet();
//        final JSONObject obj = new JSONObject(response);
//        final Object objectCount = obj.get("Count");
//        int expectedId = 2;
//        String expectedHangoutName = "Boba!";
//        System.out.println(response);
//        /*assertEquals(expectedId, objItem.getInt("HangoutId"));
//        assertEquals(expectedHangoutName, objItem.getString("HangoutName"));*/
//    }
//
//    @Test
//    public void testDeleteHangout() throws Exception {
//        ApiClientFactory factory = new ApiClientFactory();
//        MyApiClient client = factory.build(MyApiClient.class);
//        BigDecimal id = BigDecimal.valueOf(2000);
//        String hangoutName = "Lets get this started.";
//
//        CreateHangout request;
//        request = new CreateHangout();
//        request.setId(id);
//
//
//        Success response = client.hangoutDeletePost(request);
//
//        System.out.println("Yay");
//        assertEquals(4, 2 + 2);
//    }
}