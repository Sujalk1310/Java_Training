class dataTypeConv {
    public static void main(String[] args) {
        System.out.println("Byte to Short");
        byte a = 20; // Automatic or Widening
        // Byte -> Short -> Int -> Long -> Float -> Double
        System.out.println("Type : "+((Object)a).getClass().getSimpleName()+" "+a);
        short b = a;
        System.out.println("Type : "+((Object)b).getClass().getSimpleName()+" "+b);
        System.out.println("Integer to Short");
        int c = 20;
        System.out.println("Type : "+((Object)c).getClass().getSimpleName()+" "+c);
        short d = (short)c; // Explicit or Narrowing
        // Double -> Float -> Long -> Int -> Short -> Byte
        System.out.println("Type = "+((Object)d).getClass().getSimpleName()+" "+d);
        System.out.println("Long to Float");
        long f = 255;
        System.out.println("Type : "+((Object)f).getClass().getSimpleName()+" "+f);
        float g = f;
        System.out.println("Type : "+((Object)g).getClass().getSimpleName()+" "+g);
        System.out.println("Float to Integer");
        float j = 32;
        System.out.println("Type : "+((Object)j).getClass().getSimpleName()+" "+j);
        int k = (int)j;
        System.out.println("Type : "+((Object)k).getClass().getSimpleName()+" "+k);
    }
}
