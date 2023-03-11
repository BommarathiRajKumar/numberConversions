class NumberConversions{
    static void decToBin(int dec){
        //Decimal to Binary.
        String bin="";
        while(dec>0){
            bin=dec%2+bin;
            dec/=2;
        }
        System.out.print(bin);
        
    }
    static void decToOct(int dec){
        //Decimal to Octal.
        String oct="";
        while(dec>0){
            oct=dec%8+oct;
            dec/=8;
        }
        System.out.print(oct);
    }
    static void decToHex(int dec){
        //Decimal to Hexa.
        String hex="";
        while(dec>0){
            int r = dec%16;
            dec/=16;
            if(r>=0 && r<=9){
                hex=r+hex;
            }else{
                hex=(char)(r+55)+hex;
            }
        }
        System.out.print(hex);
    }
    
    static void binToDec(int bin){
        //Binary to Decimal.
        int dec=0;
        int pow=0;
        while(bin>0){
            if(bin%10==1){
                dec+=(int)Math.pow(2,pow);
            }
            bin/=10;
            pow++;
        }
        System.out.print(dec);
    }
    static void octToDec(int oct){
        //Octal to Decimal.
        int dec=0;
        int pow=0;
        while(oct>0){
            dec=dec+(oct%10*(int)Math.pow(8,pow));
            oct/=10;
            pow++;
        }
        System.out.print(dec);  
    }
    static void hexToDec(String hex){
        //Hexa to Decimal.
        int dec=0;
        int len = hex.length()-1;
        int pow=0;
        for(int i=len; i>=0; i--){
            if(hex.charAt(len)>='0' && hex.charAt(len)<='9'){
                dec=dec+(hex.charAt(len)-48)*(int)Math.pow(16,pow);
            }else{
                dec=dec+(hex.charAt(len)-55)*(int)Math.pow(16,pow);
            }
            pow++;
        }
        System.out.print(dec);
    }
    static void binToOct(int bin){
        //Binary to Octal.
        int dec=0;
        int pow=0;
        while(bin>0){
            if(bin%10==1){
                dec+=(int)Math.pow(2,pow);
            }
            bin/=10;
            pow++;
        }
        String oct="";
        while(dec>0){
            oct=dec%8+oct;
            dec/=8;
        }
        System.out.print(oct);
    }
    static void binToHex(int bin){
        //Binary to Hexa.
        int dec=0;
        int pow=0;
        while(bin>0){
            if(bin%10==1){
                dec=dec+(int)Math.pow(2,pow);
            }
            bin/=10;
            pow++;
        }
        String hex="";
        while(dec>0){
            int r = dec%16;
            dec/=16;
            if(r>=0 && r<=9){
                hex=dec%16+hex;
            }else{
                hex=(char)(r+55)+hex;
            }
        }
        System.out.print(hex);
    }
    static void octToBin(int oct){
        //Octal to Binary.
        int dec=0;
        int pow=0;
        while(oct>0){
            dec=dec+(oct%10*(int)Math.pow(8,pow));
            oct/=10;
            pow++;
        }
        String bin="";
        while(dec>0){
            bin=dec%2+bin;
            dec/=2;
            
        }
        System.out.print(bin);
    }
    static void octToHex(int oct){
        //Octal to Hexa.
        int dec=0;
        int pow=0;
        while(oct>0){
            dec=dec+(oct%10*(int)Math.pow(8,pow));
            oct/=10;
            pow++;
        }
        String hex="";
        while(dec>0){
            int r = dec%16;
            dec/=16;
            if(r>=0 && r<=9){
                hex=r+hex;
            }else{
                hex=(char)(r+55)+hex;
            }
        }
        System.out.print(hex);
    }
    static void hexToBin(String hex){
        //Hexa to Binary.
        int dec=0;
        int len = hex.length()-1;
        int pow=0;
        for(int i=len; i>=0; i--){
            if(hex.charAt(len)>='0' && hex.charAt(len)<='9'){
                dec=dec+(hex.charAt(len)-48)*(int)Math.pow(16,pow);
            }else{
                dec=dec+(hex.charAt(len)-55)*(int)Math.pow(16,pow);
            }
            pow++;
        }
        String bin="";
        while(dec>0){
            bin=dec%2+bin;
            dec/=2;
        }
        System.out.print(bin);
    }
    static void hexToOct(String hex){
        //Hexa to Octal.
        int dec=0;
        int len = hex.length()-1;
        int pow=0;
        for(int i=len; i>=0; i--){
            if(hex.charAt(len)>='0' && hex.charAt(len)<='9'){
                dec=dec+(hex.charAt(len)-48)*(int)Math.pow(16,pow);
            }else{
                dec=dec+(hex.charAt(len)-55)*(int)Math.pow(16,pow);
            }
            pow++;
        }
        String oct="";
        while(dec>0){
            oct=dec%8+oct;
            dec/=8;
        }
        System.out.print(oct);
    }
    public static void main(String[] args){
        //decToBin(10);
        //decToOct(86);
        //decToHex(10);

        //binToDec(1010);
        //octToDec(12);
        //hexToDec("A");

        //binToOct(1010);
        //binToHex(1010);

        //octToBin(10);
        //octToHex(12);
        
        //hexToBin("A");
        //hexToOct("A");
    }
}