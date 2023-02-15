//Same package same class
package pack1;

public class rectangle2
{
    int length,breadth,area;
    public void get(int x , int y) {
        length = x;
        breadth = y;
    }
    public int arearec() {
        area = length * breadth;
        return(area);
    }
}
