package com.w2a.rough;

import com.w2a.base.page;
import com.w2a.pages.actions.StaysPage;

public class StaysTest {

	public static void main(String[] args) {
		
		
		page.initConfiguration();
		page.topNav.gotoStays();
		StaysPage stay= new StaysPage();
		stay.staysPage("Dallas, TX, United States of America (DFW-Dallas-Fort Worth Intl.)", "Dec 30 - Jan 4","2 travelers, 1 room");
        // page.quitBrowser();
	}

}
