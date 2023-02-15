import java.lang.*;

class Bank {
    int getInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getInterest() {
        return 8;
    }
}
 
class AXIS extends Bank {
    int getInterest() {
        return 3;
    }
}

class ICICI extends Bank {
    int getInterest() {
        return 11;
    }
}

class Call {
    public static void main(String[] args) {
        Bank B;
        B = new Bank();
        System.out.println(B.getInterest());
        B = new SBI();
        System.out.println(B.getInterest());
        B = new AXIS();
        System.out.println(B.getInterest());
        B = new ICICI();
        System.out.println(B.getInterest());
    }
}