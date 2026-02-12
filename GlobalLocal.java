package variables;

public class GlobalLocal {

    static int z=100;
    public static void main(String[] args) 
    {
            int z=500;
            System.out.println(z);     //500
            System.out.println(GlobalLocal.z);//100
            
    }

}
