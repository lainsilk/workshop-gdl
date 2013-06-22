package com.recluit.labb.action;

import com.recluit.labb.restclient.HelloClient;



public class RFCAction {
	
	private String option;
	private String RFCsend;
    private String result;
	
	public String execute()throws Exception{
	
		System.out.println(option);
		
	switch (option){
	
			case "4":	HelloClient conectt = new HelloClient();
						setResult(conectt.getMessage(option,RFCsend));
						return "display";
			
	}
	return option;

	
	
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getRFCsend() {
		return RFCsend;
	}

	public void setRFCsend(String rFCsend) {
		RFCsend = rFCsend;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
