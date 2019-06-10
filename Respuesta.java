public class Respuesta{
    
    public static void parentesisR(char str[], int pos, int n, int open, int close) 
    { 
        if(close == n)  
        { 
            for(int i=0;i<str.length;i++) 
                System.out.print(str[i]); 
            System.out.println(); 
            return; 
        } 
        else
        { 
            if(open > close) { 
                str[pos] = '}'; 
                parentesisR(str, pos+1, n, open, close+1); 
            } 
            if(open < n) { 
                str[pos] = '{'; 
                parentesisR(str, pos+1, n, open+1, close); 
            } 
        } 
    } 
     
    public static void parentesis(int n)
    { 
        char str[] = new char[2 * n]; 
        
        if(n > 0) 
        parentesisR(str, 0, n, 0, 0); 
        return; 
    } 
    
    
    public static void main(String args[]) {
       parentesis(2);
    }
}
