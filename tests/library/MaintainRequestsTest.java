package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MaintainRequestsTest {

	private RequestDatabase reqDB;
	private ItemDatabase itemDB;
	private List<Request> requestList;
	private UserDatabase userDB;
	private AdminAccount acc;

	@Before
	public void setUp() throws Exception {
		acc = new AdminAccount();
		
		reqDB = MaintainRequests.getInstance();
		reqDB.load(pathNames.reqPath);

		userDB = new MaintainUserProxy();
		itemDB = new MaintainItemsProxy();
		
		requestList = new ArrayList<>();
		requestList.add(new Request());
		requestList.add(new Request());

	}

	//1
	@Test
	public void testConfirmReq() throws Exception {
		userDB = new MaintainUserProxy();
		userDB.load(pathNames.path);
		User user;
		user = userDB.getRegisteredUserByEmail("student1@gmail.com");
		
		Request request = new Request(user, "title", "edition", "book", "0", false);
		reqDB.confirmReq(request);
		assertTrue(reqDB.getRequests().contains(request));
		reqDB.update();
	}

	//2
	@Test
	public void testNotifyPriority() {
		Request request = new Request();
		request.setPriority("2");
		assertEquals("2", reqDB.notifyPriority(request));
	}

	//3
	@Test
	public void testRemoveReq() throws Exception {
		userDB = new MaintainUserProxy();
		userDB.load(pathNames.path);
		User user;
		user = userDB.getRegisteredUserByEmail("student1@gmail.com");
		
		Request request = new Request(user, "title", "edition", "book", "0", false);
		requestList.add(request);
		reqDB.removeReq(request);
		assertFalse(reqDB.getRequests().contains(request));
	}

	//4
	@Test
	public void testGetReqCT() {
		List<Request> reqCT = reqDB.getReqCT();
		assertNotNull(reqCT);
	}

	//5
	@Test
	public void testSetReqCT() throws Exception {
		List<Request> newReqCT = new ArrayList<>();
		reqDB.setReqCT(newReqCT);
		assertEquals(newReqCT, reqDB.getReqCT());
	}

	//6
	@Test
	public void testGetReqSI() {
		List<Request> reqSI = reqDB.getReqSI();
		assertNotNull(reqSI);
	}

	//7
	@Test
	public void testSetReqSI() {
		List<Request> newReqSI = new ArrayList<>();
		reqDB.setReqSI(newReqSI);
		assertEquals(newReqSI, reqDB.getReqSI());
	}

	//8
	@Test
	public void testGetRequests() {
		List<Request> allReqs = reqDB.getRequests();
		assertNotNull(allReqs);
	}

	//9
	@Test
	public void testSetRequests() {
		List<Request> newReqs = new ArrayList<>();
		reqDB.setRequests(newReqs);
		assertEquals(newReqs, reqDB.getRequests());
	}
	
	//10
	@Test
	public void testRequest_Accept() throws Exception {
		userDB = new MaintainUserProxy();
		userDB.load(pathNames.path);
		User user;
		user = userDB.getRegisteredUserByEmail("student1@gmail.com");
		
		Request r = new Request(user, "title", "edition", "book", "0", false);
		acc.request_Accept(r);
		assertTrue(r.isCompletion());

	}

	//11
	@Test
	public void testRequest_Deny() throws Exception {
		userDB = new MaintainUserProxy();
		userDB.load(pathNames.path);
		User user;
		user = userDB.getRegisteredUserByEmail("student1@gmail.com");
		
		Request r = new Request(user, "title", "edition", "book", "0", false);
		acc.request_Deny(r);

		boolean isCorrect = true;
		if (itemDB.getItems().contains(r)) {
			isCorrect = false;
		}
		assertTrue(isCorrect);
	}


}
