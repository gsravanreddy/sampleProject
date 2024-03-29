package com.sample.app.demo.file.watcher;

import java.util.EventListener;

public interface FileListener extends EventListener {

	public void onCreated(FileEvent event);
	
	public void onModified(FileEvent event);
	
	public void onDeleted(FileEvent event);
		
}
