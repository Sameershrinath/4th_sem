public class StringBufferex {
    public static void main (String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        sb.append(" world");
        System.out.println(sb);

        sb.replace(6,11,"Sam");
        System.out.println(sb);

        sb.delete(6,10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println("Reverse using For loop ");

        String named="Sameer";
        String reversed="";
        
        for(int i=named.length()-1; i>=0;i--){
            reversed+=named.charAt(i);
        }
        System.out.println(reversed);

    }
    
}
