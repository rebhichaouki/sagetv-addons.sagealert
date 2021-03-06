/*
 *      Copyright 2009-2010 Battams, Derek
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
package com.google.code.sagetvaddons.sagealert.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async version of the SettingsService interface
 * @author dbattams
 * @version $Id$
 */
public interface SettingsServiceAsync {
	/**
	 * Retrieve a setting from the data store
	 * @param var The setting to be retrieved
	 * @param defaultVal The value to return if the setting is not in the data store
	 * @param cb The async callback
	 */
	public void getSetting(String var, String defaultVal, AsyncCallback<String> cb);
	
	/**
	 * Add a key/value pair to the data store
	 * @param var The setting name
	 * @param val The setting value
	 * @param cb The async callback
	 */
	public void setSetting(String var, String val, AsyncCallback<Void> cb);
	
	/**
	 * Save the SmtpServer settings object to the data store
	 * @param settings The settings object to be saved
	 * @param cb The async callback
	 */
	public void saveSmtpSettings(SmtpSettings settings, AsyncCallback<Void> cb);

	/**
	 * Get the SmtpServer settings object from the data store
	 * @param cb The async callback
	 */
	public void getSmtpSettings(AsyncCallback<SmtpSettings> cb);
	
	/**
	 * Test the given SmtpSettings
	 * @param addr The recipient address of the test email message
	 * @param settings The settings to test
	 * @param cb The async callback
	 */
	public void testSmtpSettings(String addr, SmtpSettings settings, AsyncCallback<Void> cb);
	
	/**
	 * Check the license for this installation
	 * @param cb The async callback
	 */
	public void isLicensed(AsyncCallback<Boolean> cb);
	
	/**
	 * Remove settings from the data store that start with the given prefix
	 * @param prefix The prefix to search for
	 * @param cb The async callback
	 */
	public void clearSettingsStartingWith(String prefix, AsyncCallback<Void> cb);
	
	public void clearSettingsEndingWith(String suffix, AsyncCallback<Void> cb);
	
	public void resetAllAlertMessages(AsyncCallback<Void> cb);
}
