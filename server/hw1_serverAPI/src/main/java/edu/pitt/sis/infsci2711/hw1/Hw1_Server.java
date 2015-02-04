package edu.pitt.sis.infsci2711.hw1;


import edu.pitt.sis.infsci2711.multidbs.utils.JerseyJettyServer;

public class Hw1_Server {
	
	
	
	public static void main(final String[] args) throws Exception {
	    JerseyJettyServer server = new JerseyJettyServer(7654, "edu.pitt.sis.infsci2711.hw1.rest");
		
		server.start();
	}

}
