class AuthProxy{
    boolean authenticated;
    public AuthProxy(boolean authenticated){
        this.authenticated=authenticated;
    }
    public void uploadImage(String filename){
        if(authenticated){
            System.out.println("uploading image: " + filename);
        }
        else{
            System.out.println("access denied! log in first... ");
        }
    }
}