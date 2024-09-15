package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import library.MaintainRequestsProxy;
import library.pathNames;

public class MaintainRequestsProxyTest {

	private RequestDatabase proxy;
	private Request request;

	@Before
	public void setUp() throws Exception {

		proxy = new MaintainRequestsProxy();
		proxy.load(pathNames.reqPath);
	}

	//1 
	@Test
	public void testSendRequestAccept() throws Exception {
		AdminAccount admin = new AdminAccount();
		UserDatabase prox = new MaintainUserProxy();
		prox.load(pathNames.path);
		User u;
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
		String name = "book name";
		String edition = "edition 1";
		String itemType = "course teaching";
		String priority = "1";
		boolean completion = false;
		Request request = new Request(u, name, edition, itemType, priority, completion);
		
		proxy.sendRequestAccept(admin, request);
	}

	//2
	@Test
	public void testSendRequestDeny() {
		AdminAccount admin = new AdminAccount();
		Request request = new Request();
		proxy.sendRequestDeny(admin, request);
	}

	//3
	@Test
	public void testConfirmReq() {
		Request request = new Request();
		proxy.confirmReq(request);
		assertTrue(proxy.getRequests().contains(request));
	}

	//4
	@Test
	public void testRemoveReq() {
		Request request = new Request();
		proxy.confirmReq(request);
		proxy.removeReq(request);
		assertFalse(proxy.getRequests().contains(request));
	}

	//5
	@Test
	public void testGetRequests() {
		List<Request> requestList = new ArrayList<>();
		Request request1 = new Request();
		Request request2 = new Request();
		requestList.add(request1);
		requestList.add(request2);
		proxy.setRequests(requestList);
		assertEquals(requestList, proxy.getRequests());

	}

	//6
	@Test
	public void testSetRequests() throws Exception {
		List<Request> requestList = new ArrayList<>();
		Request request1 = new Request();
		Request request2 = new Request();
		requestList.add(request1);
		requestList.add(request2);
		proxy.setRequests(requestList);
		assertEquals(requestList, proxy.getRequests());
	}
	
	//7
	@Test
    public void testSetAndGetReqSI() {
        List<Request> sampleRequests = new ArrayList<Request>();
		proxy.setReqSI(sampleRequests);
        List<Request> retrievedRequests = proxy.getReqSI();
        assertEquals(sampleRequests, retrievedRequests);
    }
	
	//8
	@Test
	public void testSetAndGetReqCT() {
		List<Request> sampleRequests = new ArrayList<Request>();
		proxy.setReqCT(sampleRequests);
		List<Request> retrievedRequests = proxy.getReqCT();
		assertEquals(sampleRequests, retrievedRequests);
	}
	
	//9
	@Test
	public void testSendRequestDeny_2() {
		AdminAccount admin = new AdminAccount();
		Request request2 = new Request();
		proxy.sendRequestDeny(admin, request2);
	}
	
	//10
	@Test
	public void testSendRequestDeny_3() {
		AdminAccount admin = new AdminAccount();
		Request request3 = new Request();
		proxy.sendRequestDeny(admin, request3);
	}
}



