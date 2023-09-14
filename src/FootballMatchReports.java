public class FootballMatchReports {    
    
    public static String onField(int shirtNum) {
        String expresion = "";
        
        switch(shirtNum){
            case 1:
                expresion = "goalie";
                break;
            case 2: 
                expresion = "left back";
                break;
            case 3:
                expresion = "center back";
                break;
            case 4:
                expresion = "center back";
                break;
            case 5:
                expresion = "right back";
                break;
            case 6:
                expresion = "midfielder";
                break;
            case 7:
                expresion = "midfielder";
                break;
            case 8:
                expresion = "midfielder";
                break;
            case 9:
                expresion = "left wing";
                break;
            case 10:
                expresion = "striker";
                break;
            case 11:
                expresion = "right wing";
                break;
            default:
                throw new IllegalArgumentException("Throw IllegalArgumentException");
        }
        return expresion; 
    }
    public static void main(String[] args) {
        FootballMatchReports fmr = new FootballMatchReports(); 
        
        int num = 3;
        
        String position = fmr.onField(num);
        
        System.out.println("las posición es: " + position);
    }
}
