class shape
{
    void draw()
    {
        System.out.println("This is Base class");
    }
}

class square extends shape
{
    void draw(){
        System.out.println("Drawing a square");
    }
}

class demo
{
    public static void main(String[] args){
        shape r=new square();
        r.draw();
    }
}