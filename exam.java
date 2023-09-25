class exam{
    public static void main(String []args){
        for(int i = 1;i<51;i++){
            if(i % 3 == 0 && i%5 == 0){
                System.out.println("Hello world");
            }
            else if(i % 5== 0){
                System.out.println("world");
            }
            else if(i % 3 == 0){
                System.out.println("Hello");
            }
            else{
                System.out.println(i);
            }
        }
    }
}