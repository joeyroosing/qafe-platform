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
package com.qualogy.qafe.mgwt.client.ui.component;

import com.qualogy.qafe.mgwt.client.ui.events.HasDataChangeHandlers;

public interface HasData extends HasDataChangeHandlers {

	public void setDataName(String dataName);
	public String getDataName();
	public void setData(Object data);
	public Object getData();
	public Object getDataModel();
	public Object getModel();
}
