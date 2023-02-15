class RBI{
    int getRate(){
        return 0;
    }
}

class SBI extends RBI {
    int getRate(){return 7;}  
}
    
class ICICI extends RBI{
    int getRate(){return 8;}
}

class AXIS extends RBI{
    int getRate(){return 9;}
}
    
class Call{
    public static void main (String args[]){
        RBI S;
        S = new SBI();
        System.out.println("SBI Rate of intrest "+S.getRate());
        S = new ICICI();
        System.out.println("ICICI Rate of intrest "+S.getRate());
        S = new AXIS();  
        System.out.println("AXIS Rate of intrest "+S.getRate());
    }
}
