public class Test{

    public static void main(String args[]){

        Vertex v1 = new Vertex(2, 2);
        Vertex v2 = new Vertex(4, 4);
        Vertex vv = new Vertex(0, 0);
        //Vertex v3 = new Vertex(v1.x+v2.x, v1.y+v2.y);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println("v1.x = "+v1.x);
        //System.out.println(v3);
        System.out.println(v1.Length());

        //v1.skalarMod(2);
        System.out.println(v1.Length());
        Vertex v3 = v1.add(v2);
        System.out.println(v3);
        //v1.skalarMod(0.5);
        System.out.println(v1.equals(v2));
        Vertex v4 = v1.sub(v2);
        System.out.println(v4);

        System.out.println(v1.distance(v2));

    }
}