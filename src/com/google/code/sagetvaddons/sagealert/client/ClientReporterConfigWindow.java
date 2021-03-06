/*
 *      Copyright 2010-2011 Battams, Derek
 *       
 *       Licensed under the Apache License, Version 2.0 (the "License");
 *       you may not use this file except in compliance with the License.
 *       You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *       Unless required by applicable law or agreed to in writing, software
 *       distributed under the License is distributed on an "AS IS" BASIS,
 *       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *       See the License for the specific language governing permissions and
 *       limitations under the License.
 */
package com.google.code.sagetvaddons.sagealert.client;

import com.extjs.gxt.ui.client.widget.Window;
import com.google.code.sagetvaddons.sagealert.client.ClientListenerSubscriptionForm.MediaType;
import com.google.code.sagetvaddons.sagealert.shared.Client;
import com.google.code.sagetvaddons.sagealert.shared.Client.EventType;

/**
 * @author dbattams
 *
 */
final class ClientReporterConfigWindow extends Window {

	private ClientListenerSubscriptionForm frm;
	
	ClientReporterConfigWindow(Client clnt, EventType type, MediaType mediaType) {
		setModal(true);
		setWidth(645);
		setAutoHeight(true);
		frm = new ClientListenerSubscriptionForm(clnt, type, mediaType);
		add(frm);
	}
	
	public boolean isBuilt() {
		return frm.isBuilt();
	}
}
