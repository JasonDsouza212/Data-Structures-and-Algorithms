public class stringRec {
    public static void main(String[] args) {
//        e(" ","jasonmazan");
//        System.out.println(e("jasonanvithamazanreema"));
        System.out.println(en("jappleson","ple"));
    }
    static void e(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        char ch=b.charAt(0);
        if(ch=='a'){
            e(a,b.substring(1));
        }else{
            e(a+ch,b.substring(1));
        }
    }
    static String e(String b){
        if(b.isEmpty()){
           return  "";
        }
        char ch=b.charAt(0);
        if(ch=='a'){
           return e(b.substring(1));
        }else{
            return ch + e(b.substring(1));
        }
    }
    static String en(String b,String starts){
        if(b.isEmpty()){
            return  "";
        }
        char ch=b.charAt(0);
        if(b.startsWith(starts)){
            return en(b.substring(starts.length()),starts);
        }else{
            return ch + en(b.substring(1),starts);
        }
    }
}
