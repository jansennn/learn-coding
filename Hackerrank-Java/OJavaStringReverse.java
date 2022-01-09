import java.util.*;

class OJavaStringReverse{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        boolean cek = true;
        Stack<Character> st = new Stack<Character>();
        Queue<Character> q = new LinkedList<Character>();
        for(int i = 0;i<str.length();i++){
            st.push(str.charAt(i));
            q.add(str.charAt(i));
        }
        for(int i = 0;i<str.length();i++){
            if(st.pop() != q.poll()){
                cek = false;
                break;
            }
        }
        if (cek == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}