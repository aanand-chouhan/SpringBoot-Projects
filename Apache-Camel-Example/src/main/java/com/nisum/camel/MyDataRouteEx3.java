package com.nisum.camel;

import java.util.StringTokenizer;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class MyDataRouteEx3 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:C:\\source")
			.process(new Processor() {
				
				@Override
				public void process(Exchange exchange) throws Exception {
					Message input = exchange.getMessage();
					
					String data = input.getBody(String.class);
					
					StringTokenizer str = new StringTokenizer(data, ",");
					String empId = str.nextToken();
					String empName = str.nextToken();
					String empSal = str.nextToken();
					
					String finalOutput = "{empId: "+empId+",empName: "+empName+", empSal: "+empSal+"}";
					Message output = exchange.getMessage();
					output.setBody(finalOutput);
				}
			}).to("file:/C:/destination");
		
	}

}
