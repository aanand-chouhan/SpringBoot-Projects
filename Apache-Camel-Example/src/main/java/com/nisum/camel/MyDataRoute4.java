package com.nisum.camel;

import java.util.StringTokenizer;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyDataRoute4 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:\\source").process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				Message input = exchange.getIn();
				String inputData = input.getBody(String.class);
				StringTokenizer str = new StringTokenizer(inputData, ",");
				String empId = str.nextToken();
				String empName = str.nextToken();
				String empSal = str.nextToken();
				String finalString = "{empId: " + empId + ",empName: " + empName + ",empSal: " + empSal + "}";
//				Message output = exchange.getOut();
				Message output = exchange.getMessage();
				output.setBody(finalString);
			}
		}).to("file:C:\\destination");
	}

}
