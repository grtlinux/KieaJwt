package org.tain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tain.working.Working;

@SpringBootApplication
public class KieaJwt00Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KieaJwt00Application.class, args);
	}

	@Autowired(required=true)
	private Working working;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("---> KieaJwt00Application.run()");
		
		this.working.doing();
		
		System.exit(0);
	}

}
