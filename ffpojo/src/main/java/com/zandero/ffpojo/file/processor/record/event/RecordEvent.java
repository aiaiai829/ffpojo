package com.zandero.ffpojo.file.processor.record.event;

public interface RecordEvent {

	public Object getRecord();
	public String getRecordText();
	public long getRecordIndex();
	
}
