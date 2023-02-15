//single inheritance with super
class Room {
    int length, width;
    Room(int x, int y) {
        length=x;
        width=y;
    }
    int area() {
        return(length*width);
    }
} //base class closed

class Bedroom extends Room { //inheriting base class
    int height;
    Bedroom(int x, int y, int z) {
        super(x,y); //pass values to superclass or base class
        height=z;
    }      
    int volume() {
        return(length*width*height);
    }
}// derived class closed

class Singleinheritance {
    public static void main(String args[]) {
        Bedroom R=new Bedroom(14,12,10);
        int arearoom=R.area();           			
        System.out.println("area of room="+arearoom);  //superclass method
        System.out.println("volume of bedroom="+R.volume());  //subclass method
    }
}


