package org.tain.working;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tain.working.jwt.JwtWorking;

@Component
public class Working {

	@Autowired(required=false)
	private JwtWorking jwtWorking;
	
	public void doing() {
		this.jwtWorking.doing();
	}
}
