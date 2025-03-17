//8. Write a Java program to practice using String Buffer class and its methods.



public class Lab8 {


        public static void main(String[] args) {
            // Creating a StringBuffer
            StringBuffer sb = new StringBuffer("Hello");
    
            // Append text
            sb.append(" Java");
            System.out.println("After append: " + sb);
    
            // Insert text
            sb.insert(6, "World ");
            System.out.println("After insert: " + sb);
    
            // Replace text
            sb.replace(6, 11, "Amazing");
            System.out.println("After replace: " + sb);
    
            // Delete characters
            sb.delete(6, 13);
            System.out.println("After delete: " + sb);
    
            // Reverse the string
            sb.reverse();
            System.out.println("After reverse: " + sb);
        }
    
    
    
}
