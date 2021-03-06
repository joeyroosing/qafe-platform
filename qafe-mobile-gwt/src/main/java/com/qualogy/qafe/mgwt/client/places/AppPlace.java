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
package com.qualogy.qafe.mgwt.client.places;

import com.google.gwt.place.shared.PlaceTokenizer;

public class AppPlace extends AbstractPlace {

	public static class AppPlaceTokenizer implements PlaceTokenizer<AppPlace> {

		@Override
		public AppPlace getPlace(String token) {
			return new AppPlace(token);
		}

		@Override
		public String getToken(AppPlace place) {
			return place.getContext();
		}
	}
	
	public AppPlace(String context) {
		super(context);
	}
}
