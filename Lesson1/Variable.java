public class Variable {

    public static void main (String[] args){

        byte ram = 4;
        short windows = 8;
        int bitnessOfTheOS = 64;
        long productCode = 190700000000100L;
        float cpuFrequency = 1.5f;
        double performanceIndex = 4.8;
        char copyright = 169;
        boolean notebook = true;

        System.out.println("Brief information about computer of JavaSash:");
        System.out.println("Notebook: " + notebook);
        System.out.println("RAM memory: " + ram + " Gb");
        System.out.println("Version of Windows: " + windows);
        System.out.println("Type of System: " + bitnessOfTheOS + "-bit operating system");
        System.out.println("Product code: " + productCode);
        System.out.println("Processor: " + cpuFrequency + " GHz");
        System.out.println("Performance index of Windows: " + performanceIndex);
        System.out.println(copyright + " Microsoft Corporation");

    }
}
