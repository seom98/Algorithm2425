interface Main {
    static void main(String[]z){
        int m=0,M=1,t=m+(int)(Math.random()*((M-m)+1));
        System.out.print(t%2<1?"Yonsei":"Korea");
    }
}