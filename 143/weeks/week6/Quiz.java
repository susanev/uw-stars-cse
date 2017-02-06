
public class Quiz {
	public static void main (String[] args) {
	Blue var1 = new Blue();
	Green var2 = new Green();
	Object var3 = new White();
	Red var4 = new Green();
	Blue var5 = new Red();
	Blue var6 = new White();

	var2.method2();


	}
}

class Green extends Red {
    public void method1() {
        System.out.println("Green 1");
    }

    public void method3() {
        System.out.println("Green 3");
    }
}

class White extends Red {
    public void method2() {
        System.out.println("White 2");
    }

    public void method3() {
        System.out.println("White 3");
    }
}

class Blue {
    public void method1() {
        System.out.println("Blue 1");
        method2();
    }

    public void method2() {
        System.out.println("Blue 2");
    }
}

class Red extends Blue {
    public void method2() {
        System.out.println("Red 2");
        super.method2();
    }
}

