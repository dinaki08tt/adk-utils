/**
 * 
 */
package org.adk.beanio;

import java.io.File;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.StreamBuilder;

/**
 * @author adk
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StreamBuilder builder = new StreamBuilder("s1")
				.format("fixedlength")
				.parser(new FixedLengthParserBuilder())
				.addRecord(Officer.class);
        StreamFactory factory = StreamFactory.newInstance();
        factory.define(builder);

		Officer officer = new Officer("Su","2", 34, 6990099);
//      Marshaller marshaller = factory.createMarshaller("s1").marshal(officer);
//		marshaller.debug(System.out);
		
		BeanWriter out = factory.createWriter("s1", new File("./temp/newFile.txt"));

		out.write(officer);
		out.flush();
		out.close();
		
	}

}
