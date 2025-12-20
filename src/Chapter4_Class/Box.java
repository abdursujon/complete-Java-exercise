package Chapter4_Class;

public class Box {
        double width;
        double height;
        double depth;

        // Constructor
        Box(){
            width = 10;
            height = 10;
            depth =10;
        }

        // Constructor with parameter
        Box(double w, double h, double d){
            this.width = w;
            this.height = h;
            this.depth = d;
        }


        // display volume of box
        void volume() {
            System.out.print("Volumn is ");
            System.out.println(width * height * depth);
        }

        String boxColor(){
            return "Box is blue";
        }

        public int age(int age){
            return age;
        }
}


