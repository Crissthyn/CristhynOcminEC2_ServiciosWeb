package cristhyn.pizza.idat.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


		if ("cris".equals(username)) {
			return new User("cris", "678", new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("Usuario "+ username+"  no existe ");
		}
	}

}
