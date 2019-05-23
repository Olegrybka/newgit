public class cat extends animal {
    int run = 200;
    int jump = 2;

    @Override
    void run (int length){
        if((length >= 0) && (length <= run){
            System.out.println("run: true");
        }
    }

    @Override
    void swim(int length){
        System.out.println("run: false");
    }

    @Override
    void jump(int height){
        if(( height >= 0) && (height <= jump){
            System.out.println("run: true");
        }

    }
}


