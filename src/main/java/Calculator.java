class Calculator{
    private boolean notOperation = false;
    public Calculator(){
        display();
    }


    private void display(){
        System.out.print("Result: hello world ");
    }

    public static void main(String []args){
        new Calculator();
    }
}
