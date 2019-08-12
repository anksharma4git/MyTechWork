package com.mmt.holiday.assist.services.impl;

import com.mmt.holiday.assist.ssh.tunnel.HolOperations;
import com.mmt.holiday.assist.ssh.tunnel.SshTunnel;

public class TentakelWorker implements Runnable {

	private String serverIp;
	private Object dataObject;
	private HolOperations operation;
	private StringBuffer finalText=new StringBuffer();

	public TentakelWorker(String serverIp, Object dataObject, HolOperations operation,StringBuffer finalText) {

		this.serverIp = serverIp;
		this.dataObject = dataObject;
		this.operation = operation;
		this.finalText=finalText;
	}

	@Override
	public void run() {
		SshTunnel.performOperationOnServer(serverIp, dataObject, operation,finalText);

	}

}
