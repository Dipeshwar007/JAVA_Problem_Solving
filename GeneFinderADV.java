// This code also include the length of the gene and also check the length of the gene is divisible by 3 or not.

class GeneFinderADV {
    // findGeneSimple method is modified to return the length of the gene and also check the length of the gene is divisible by 3 or not.
    public String findGeneSimple(String dna){
        String result = "";
        
        // Start of the gene is found and stored in startIndex variable.
        int startIndex = dna.indexOf("ATG");
        // If start of the gene is not found then it will return "Start Of Gene Missing".
        if(startIndex == -1){
            return "Start Of Gene Missing";
        }
        
        // End of the gene is found and stored in stopIndex variable.
        int stopIndex = dna.indexOf("TAA",startIndex+3);
        // If end of the gene is not found then it will return "Ending Of Gene Missing".
        if(stopIndex == -1){
            return "Ending Of Gene Missing";
        }
        
        // The gene is stored in result variable.
        result = dna.substring(startIndex,stopIndex+3);
        // The length of the gene is stored in validDnaLength variable.
        int validDnaLength = result.length();
        
        //  If the length of the gene is divisible by 3 then it will return "Valid DNA" else it will return "Invalid DNA".
        if(validDnaLength % 3 == 0){
            return "Valid DNA";
        }else{
            return "Invalid DNA";
        }
    }
    public static void main(String[] args) {
        // Object of GeneFinderADV class is created.
        GeneFinder gefi = new GeneFinder();
        
        // findGeneSimple method is called with different DNA sequences.
        String data1 = gefi.findGeneSimple("ASTRGATGABCDEFTRAHTAALKAHS");
        System.out.println(data1+"\n");
        
        // findGeneSimple method is called with different DNA sequences.
        String data2 = gefi.findGeneSimple("ATGJASHAUISBTAAS");
        System.out.println(data2+"\n");
        
        // findGeneSimple method is called with different DNA sequences.
        String data3 = gefi.findGeneSimple("ATGASJFBJKASFKSAFDNKASF");
        System.out.println(data3+"\n");
        
        // findGeneSimple method is called with different DNA sequences.
        String data4 = gefi.findGeneSimple("JASHAUISBTAAS");
        System.out.println(data4);
    }
}
