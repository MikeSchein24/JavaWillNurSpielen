public class GeometricObject{
    Vertex pos;
    double width;
    double height;

    public GeometricObject(Vertex pos, double width, double heigth){
        this.pos = pos;
        this.width = width;
        this.height = heigth;

        if(width<0){
            this.width=-width;
        }
        if(heigth<0){
            this.height=-heigth;
        }
        if(pos.x<0){
            this.pos.x=-pos.x;
        }
        if(pos.y<0){
            this.pos.y=-pos.y;
        }

    }

    public GeometricObject(double x, double y, double width, double height){
        this(new Vertex(x, y), width, height);
    }

    public GeometricObject(double width, double height){
        this(0, 0, width, height);
    }

    public GeometricObject(Vertex pos){
        this(pos, 0, 0);
    }

    public GeometricObject(){
        this(0, 0);
    }

    public double getWidth(){return width;}
    public double getHeigth(){return height;}
    public Vertex getPos(){return pos;}

    public String toString(){
        return "width = "+width+" height = "+height+" pos = "+pos;
    }

    public double circumference(){
        return 2*(width+height);
    }

    public double area(){
        return width*height;
    }

}