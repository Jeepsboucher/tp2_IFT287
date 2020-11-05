package JardinCollectif.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
  @Id
  public long memberId;

  public boolean isAdmin;

  public String firstName;

  public String lastName;

  public String password;

  public Member(long memberId, boolean isAdmin, String firstName, String lastName, String password) {
    this.memberId = memberId;
    this.isAdmin = isAdmin;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
  }
}