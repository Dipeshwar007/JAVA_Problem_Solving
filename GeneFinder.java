class GeneFinder {
    public String findGeneSimple(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return "Start Of Gene Missing";
        }
        int stopIndex = dna.indexOf("TAA",startIndex+3);
        if(stopIndex == -1){
            return "Ending Of Gene Missing";
        }
        result = dna.substring(startIndex,stopIndex+3);
        
        return result;
    }
    public static void main(String[] args) {
        GeneFinder gefi = new GeneFinder();
        String data1 = gefi.findGeneSimple("ASTRGATGABCDEFTRAHTAALKAHS");
        System.out.println(data1);
        
        
        String data2 = gefi.findGeneSimple("ATGJASHAUISBTAAS");
        System.out.println(data2);
        
        String data3 = gefi.findGeneSimple("ATGASJFBJKASFKSAFDNKASF");
        System.out.println(data3);
        
        
        String data4 = gefi.findGeneSimple("JASHAUISBTAAS");
        System.out.println(data4);
    }
}
