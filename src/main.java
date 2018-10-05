public class main {
    public static void main(String[] args) {
        Quadratic_equation ptb2 = new Quadratic_equation(1,-8,16);
        System.out.println("Phương trình có dạng:");
        System.out.println(ptb2.getA()+"x^2 + " + ptb2.getB() + "x + " + ptb2.getC());
        System.out.println("Delta của phương trình là: " + ptb2.getDiscriminant());
        if(ptb2.getDiscriminant()<0){
            System.out.println("Phương trình vô nghiệm");
        }else if(ptb2.getDiscriminant() == 0){
            System.out.println("Phương trình có 2 nghiệm kép:");
            System.out.println("x1 = x2 = " + ptb2.getRoot1());
        }else if(ptb2.getDiscriminant() > 0){
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("Nghiệm thứ nhất x1 = " + ptb2.getRoot1());
            System.out.println("Nghiệm thứ nhất x2 = " + ptb2.getRoot2());
        }
    }
}
