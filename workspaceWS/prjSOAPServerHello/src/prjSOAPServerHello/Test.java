package prjSOAPServerHello;

import prjSOAPServer.HelloWSGwen;
import prjSOAPServer.ServiceHelloService;

public class Test {

	public static void main(String[] args) {
		HelloWSGwen conn = new ServiceHelloService().getHelloWSGwenPort();
		System.out.println(conn.hellov2("Toto"));
	}

}
