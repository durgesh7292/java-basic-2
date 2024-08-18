public class removedublicate {
    public static void removeDublicates(String str,int idx,StringBuilder newstr,boolean[] bs){
        if(idx==str.length()){
            System.out.println(newstr);
            return ;
        }
        char currChar=str.charAt(idx);
        if(bs [currChar-'a']==true){
            removeDublicates(str, idx+1, newstr, bs);

        }else{
            bs[currChar-'a']=true;
            removeDublicates(str, idx, newstr.append(currChar), bs);
        }
    }
    public static void main(String[] args) {
        String str="mooo";
        removeDublicates(str,0,new StringBuilder("") ,new boolean[26]);
    }
    
}
