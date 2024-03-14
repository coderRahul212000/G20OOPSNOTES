public class AccessCodes {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.username = "Rahul";
        // account.password = "Alain"  ;
        account.setPassword("ijdsbvdsbvdsbvdsbvk");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
        // System.out.println(password);
    }
    

}
