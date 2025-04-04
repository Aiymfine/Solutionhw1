class ProxyImage implements Image{
    String filename;
    RealImage realImage;

    public ProxyImage(String filename){
        this.filename=filename;
    }
    public void displayThumbnails(){
        System.out.println("displaying thumbnail for " + filename);
    }
    public void displayFullImage(){
        if(realImage==null){
            realImage=new RealImage(filename);
        } realImage.displayFullImage();
    }
}