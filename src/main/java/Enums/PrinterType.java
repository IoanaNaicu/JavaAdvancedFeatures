package Enums;


public enum PrinterType {
    DOT_MATRIX("Imprimanta matriciala", 9),
    INK_JET("Imprimanta cu cerneala", 8),
    LASER("Imprimanta laser",5),
    _3D("Imprimanta 3D",100);

    private final String description;
    private final int printCapacity;

    PrinterType(String description, int printCapacity){
        this.description = description;
        this.printCapacity = printCapacity;
    }

    public String getDescription() {
        return description;
    }

    public int getPrintCapacity() {
        return printCapacity;
    }

    public static PrinterType matchPrinterType(String printerDescription){
        for(PrinterType printerType : PrinterType.values()){
            if(printerDescription.equals(printerType.getDescription())){
                return printerType;
            }
        }
        //return null;
        throw new UnknownPrinter(String.format("Nu exista: '%s", printerDescription));
    }

    public static class UnknownPrinter extends RuntimeException{
        UnknownPrinter(String message){
            super(message);
        }
    }

    /**
     * tries to match printer type --should be static
     * @param printDescription
     * @return
     */
    public PrinterType mapPrinterType(String printDescription){
        return matchPrinterType(printDescription);

    }
}
