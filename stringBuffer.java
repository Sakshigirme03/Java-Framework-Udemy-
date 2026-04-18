public class stringBuffer{
    public static void main(String[]args){
        StringBuffer sb= new StringBuffer("Sakshi");
        System.out.println("Length :"+sb.length());
        System.out.println(sb);
        sb.append(" Girme");
        System.out.println(sb);
        System.out.println("Length :"+sb.length());
        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}