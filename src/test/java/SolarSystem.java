public class SolarSystem {
    public static void main(String[] args) {
        BasicStructure BB=new BasicStructure();
        BB.Planets="2";
        BB.Moon="2";
        BB.Stars="10";
        BB.Sun="1";
        System.out.println("Solar system is ready");

        FeatureSun Xros= new FeatureSun();
        Xros.temp="21312kj";
        Xros.color="green";
        Xros.radius="2312321miles";

        Planet2 Dros=new Planet2();
        Dros.radius="1212312miles";
        Dros.color="black";
    }
}
