import java.util.*;

public class smiplypath {
    public static void main(String[] args) {
        String path = "/../";

        String ans = clearingpath(path);
        System.out.println(ans);

    }

    private static String clearingpath(String path) {
        Stack<Character> stack = new Stack<>();
        StringBuilder s = new StringBuilder();
        // StringBuilder<Character>path1=new StringBuilder();
        for (int i = 0; i < path.length() ; i++) {
            char ch = path.charAt(i);
            if(i==path.length()-1 && ch=='/'){
                break;
            }
            if (ch == '/') {
                if (!stack.isEmpty() && stack.peek() == '/') {
                    // s.deleteCharAt(s.length() - 1);
                    stack.pop();
                } else {
                    stack.add(ch);
                    s.append(ch);

                }

            }
            if (ch != '/' && ch != '.') {
                s.append(ch);
                stack.add(ch);
            }
            if (ch == '.') {
                if (!stack.isEmpty() && stack.peek() == '.') {
                    System.out.println(s);
                    s.deleteCharAt(s.length() - 1);
                    s.deleteCharAt(s.length() - 1);
                    System.out.println(s);
                    stack.pop();
                    stack.pop();
                    for (int j = s.length() - 1; j > 0; j--) {
                        char c = s.charAt(j);
                        if (c == '/') {
                            break;
                        }else{
                            s.deleteCharAt(j);
                            stack.pop();
                        }
                     System.out.println(s);

                    }
                } else {
                    stack.add(ch);
                    s.append(ch);

                }

            }

        }
        return s.toString();
    }
}
