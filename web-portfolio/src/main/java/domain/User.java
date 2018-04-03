package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	@Id
	@GeneratedValue
	private long id;
	
	@Size(min = 3, max = 20)
	@Column(unique = true, nullable = false, length = 20)
	private String userId;

	@Size(min = 4, max = 12)
	@Column(nullable = false, length = 20)
	@JsonIgnore
	private String password;

	@Size(min = 3, max = 20)
	@Column(nullable = false, length = 20)
	private String name;
	
	public User() {
	}

	public User(String userId, String password, String name) {
		this.userId = userId;
		this.password = password;
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public User setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public User setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	private boolean matchUserId(String userId) {
		return this.userId.equals(userId);
	}

	private boolean matchPassword(String password) {
		return this.password.equals(password);
	}

//	@JsonIgnore
//	public boolean isGuestUser() {
//		return false;
//	}

//	private static class GuestUser extends User {
//		@Override
//		public boolean isGuestUser() {
//			return true;
//		}
//	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + "]";
	}
}
