public class dog extends animal {
    int run = 500;
    double jump = 0.5;
    int swim = 10;

    @Override
    void run (int length){
        if((length >= 0) && (length <= run){
            System.out.println("run: true");
        }
    }

    @Override
    void swim(int length){
        if((length >= 0) && (length <= swim){
            System.out.println("run: true");
        }
    }

    @Override
    void jump(int height){
        if((height >= 0) && (height <= jump){
            System.out.println("run: true");
        }

    }

}
