/*
 *      Copyright 2010 Battams, Derek
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
package com.google.code.sagetvaddons.sagealert.server.events;

import gkusnick.sagetv.api.MediaFileAPI.MediaFile;

import com.google.code.sagetvaddons.sagealert.server.CoreEventsManager;
import com.google.code.sagetvaddons.sagealert.shared.SageAlertEventMetadata;

/**
 * @author dbattams
 *
 */
public final class MediaFileDeletedLowSpaceEvent extends MediaFileDeletedEvent {

	/**
	 * @param mf
	 */
	public MediaFileDeletedLowSpaceEvent(MediaFile mf, SageAlertEventMetadata data) {
		super(mf, data);
	}

	/* (non-Javadoc)
	 * @see com.google.code.sagetvaddons.sagealert.shared.SageAlertEvent#getSource()
	 */
	public String getSource() {
		return CoreEventsManager.MEDIA_DELETED_LOW_SPACE;
	}
}
