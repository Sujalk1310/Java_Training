interface Bank {
    int getrateofinterest();
}

class SBI implements Bank {
    public int getrateofinterest() {
        return 7;
    }
}

class AXIS implements Bank {
    public int getrateofinterest() {
        return 11;
    }
}

class PNB implements Bank {
    public int getrateofinterest() {
        return 9;
    }
}

class interfaces {
    public static void main(String[] args) {
        Bank B;
        B = new SBI();
        System.out.println("SBI's Rate of Interest : "+B.getrateofinterest());
        B = new AXIS();
        System.out.println("AXIS's Rate of Interest : "+B.getrateofinterest());
        B = new PNB();
        System.out.println("PNB's Rate of Interest : "+B.getrateofinterest());
    }
}