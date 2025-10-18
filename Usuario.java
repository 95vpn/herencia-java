public class Usuario {
    private String password;

    public void setPassword(String pass)
    {
        if (pass.length() >= 8)
        {
            this.password = pass;
        }
    }
}
