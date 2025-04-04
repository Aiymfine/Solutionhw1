public class ProxyPatternDemo{
    public static void main(String[] args) {
        Image im=new ProxyImage("property.jpg");
        im.displayThumbnails();
        im.displayFullImage();

        AuthProxy agent1=new AuthProxy(true);
        agent1.uploadImage("apartment");
        AuthProxy agent2=new AuthProxy(false);
        agent2.uploadImage("villa");
    }
}