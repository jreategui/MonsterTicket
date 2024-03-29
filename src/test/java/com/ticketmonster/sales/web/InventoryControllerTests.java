package com.ticketmonster.sales.web;

import static org.junit.Assert.*;
import java.util.Map;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import com.ticketmonster.sales.service.SimpleProductManager;

public class InventoryControllerTests {

	@Test
	public void testHandleRequestView() throws Exception {
		InventoryController controller = new InventoryController();
		controller.setProductManager(new SimpleProductManager());
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		@SuppressWarnings("unchecked")
		Map<String, Object> modelMap = (Map<String, Object>) modelAndView
				.getModel().get("model");
		String nowValue = (String) modelMap.get("now");
		assertNotNull(nowValue);
	}
}
