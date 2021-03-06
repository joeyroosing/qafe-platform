/**
 * Copyright 2008-2014 Qualogy Solutions B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qualogy.qafe.mgwt.client.activities.tabbar;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.qualogy.qafe.mgwt.client.DetailActivity;
import com.qualogy.qafe.mgwt.client.main.ClientFactory;

/**
 * @author Daniel Kurka
 * 
 */
public class TabBarActivity extends DetailActivity {

	private final ClientFactory clientFactory;

	/**
	 * 
	 */
	public TabBarActivity(ClientFactory clientFactory) {
		super(clientFactory.getTabBarView(), "nav");
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		super.start(panel, eventBus);
		TabBarView view = clientFactory.getTabBarView();

		view.getBackbuttonText().setText("UI");
		view.getMainButtonText().setText("Nav");
		view.getHeader().setText("TabBar");

		panel.setWidget(view);
	}

}
