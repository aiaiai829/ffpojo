package com.zandero.ffpojo.file.writer;

import java.io.IOException;
import java.util.Collection;

import com.zandero.ffpojo.exception.FFPojoException;
import com.zandero.ffpojo.file.reader.FlatFileReader;

public interface FlatFileWriter {
	
	public void close() throws IOException;
	public boolean isClosed();
	
	public void writeRecord(Object record) throws IOException, FFPojoException;	
	public void writeRecordArray(Object[] recordArray) throws IOException, FFPojoException;
	public void writeRecordList(Collection<?> recordCollection) throws IOException, FFPojoException;
	public void writeFromFlatFileReader(FlatFileReader flatFileReader) throws IOException, FFPojoException;
	
	public long getRecordsWritten();
	
}
