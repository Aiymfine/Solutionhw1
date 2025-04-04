class RealImage implements Image{
     String filename;

    public RealImage(String filename){
        this.filename= filename;
        loadHighResImage();
    }

     void loadHighResImage(){
        System.out.println("loading high resolution image: " + filename);
     }
     public void displayThumbnails(){
        System.out.println("thumbnail displayed for: " + filename);
     }
     public void displayFullImage(){
        System.out.println("displaying full image: " + filename);
     }
    
    }