public class NestedDoWHileLoop{
    public static void main(String[] args){
        int i=0;int j=0;
        outerDo:
        do{
            j=0;
            do{
                if(j==5){
                    break outerDo;
                }
                System.out.println(i+j);
                j++;
            }while(j<10);
            i++;
        }while(i<10);

    }
}