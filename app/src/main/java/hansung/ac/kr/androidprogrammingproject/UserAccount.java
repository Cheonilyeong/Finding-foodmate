package hansung.ac.kr.androidprogrammingproject;

public class UserAccount {

    private String idToken;     // firebase의 토큰 (Uid)
    private String email;
    private String password;

    public UserAccount() { }

    public String getIdToken() { return idToken;}
    public void setIdToken(String idToken) { this.idToken = idToken;}
    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email;}
    public String getPassword(){ return password;}
    public void setPassword(String password) { this.password = password;}
}
