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

import gkusnick.sagetv.api.MediaFileAPI;

import com.google.code.sagetvaddons.sagealert.shared.SageAlertEvent;

/**
 * @author dbattams
 *
 */
abstract public class MediaFileDeletedEvent implements SageAlertEvent {

	private MediaFileAPI.MediaFile mf;
	
	public MediaFileDeletedEvent(MediaFileAPI.MediaFile mf) {
		this.mf = mf;
	}
	
	protected MediaFileAPI.MediaFile getMedia() { return mf; }

	public String getTitle() {
		StringBuilder title = new StringBuilder(mf.GetMediaTitle());
		if(mf.IsTVFile()) {
			String subtitle = mf.GetMediaFileAiring().GetShow().GetShowEpisode();
			if(subtitle != null && subtitle.length() > 0)
				title.append(": " + subtitle);
			title.append("/" + mf.GetMediaFileAiring().GetShow().GetShowExternalID());
		}
		title.append("/" + mf.GetMediaFileID());
		return title.toString();
	}
}