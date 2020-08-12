class Factory
{
   public static void main(String[] args)             
   { 
       Shape s = null;
       int noC=0,noR=0,noT=0;
       for(int i=1;i<=10;i++)
       {
           s = ShapesFactory.produceShape();
           if(s instanceof Circle) noC++;
           else if(s instanceof Rectangle) noR++;
           else noT++;
           System.out.println(s.area()); 
       }
       System.out.println("Circles    "+noC);
       System.out.println("Rectangles "+noR);
       System.out.println("Triangles  "+noT); 
   }  
}
     
