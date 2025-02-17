public class Continue {
    public static void main(String[] args) {
        for (int i=0 ; i<20;i++){
            if(i==10){
                continue;
            }
            System.out.println(i);
            if (i==16){
                break;
            }
        }
    }
    
}
