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
package com.qualogy.qafe.mgwt.client.ui.renderer;

import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import com.qualogy.qafe.mgwt.client.activities.AbstractActivity;
import com.qualogy.qafe.mgwt.client.ui.component.QStack;
import com.qualogy.qafe.mgwt.client.vo.ui.ComponentGVO;
import com.qualogy.qafe.mgwt.client.vo.ui.StackGVO;

public class StackRenderer extends AbstractComponentRenderer {

	public UIObject render(ComponentGVO component, String owner, String uuid, String parent, String context, AbstractActivity activity) {
		UIObject widget = null;
		if (component instanceof StackGVO){
			StackGVO StackGVO = (StackGVO)component;
			QStack stack = new QStack();
			init(StackGVO, stack, owner, uuid, parent, context, activity);
			widget = stack;
		}
		registerComponent(component, widget, owner, parent, context);
		return widget;
	}
	
	@Override
	protected void init(ComponentGVO component, UIObject widget, String owner, String uuid, String parent, String context, AbstractActivity activity) {
		super.init(component, widget, owner, uuid, parent, context, activity);
		StackGVO StackGVO = (StackGVO)component;
		QStack stack = (QStack)widget;
		renderChild(StackGVO, stack, uuid, parent, context, activity);
	}
	
	private void renderChild(StackGVO component, QStack widget, String uuid, String parent, String context, AbstractActivity activity) {
		ComponentGVO childGVO = component.getComponent();
		UIObject childWidget = renderChildComponent(childGVO, component.getId(), uuid, parent, context, activity);
		if (childWidget instanceof Widget) {
			widget.setWidget((Widget)childWidget);
		}
	}
}
