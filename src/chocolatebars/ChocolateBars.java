
package chocolatebars;

import javax.swing.JOptionPane;
public class ChocolateBars {

     public static final int CHOCO = 230;
    public static void main(String[] args) {
       
    int answer = JOptionPane.showConfirmDialog(null, "Are you male?",
            "Gender check", JOptionPane.YES_NO_OPTION);
    if 
       (answer == JOptionPane.YES_OPTION)
    { System.out.println("M");
        String weight = JOptionPane.showInputDialog("Enter your weight in pounds");
        double weightNum = Integer.parseInt(weight);
        
        String height = JOptionPane.showInputDialog("Enter the height in inches");
        double heightNum = Integer.parseInt(height);
        
        String age = JOptionPane.showInputDialog("Enter your age in years");
        int ageNum = Integer.parseInt(age);
        double BMRmen, chocolatemen;
        BMRmen = (66 + (4.3 * weightNum) + (4.7 * heightNum) - (4.7 * ageNum));
        
        chocolatemen = (BMRmen / CHOCO);
        
        JOptionPane.showMessageDialog(null, "If you are a man, you should consume no more than "
              + (int)chocolatemen + " chocolate bars to maintain your weight");
        System.out.println("If you are a man, you should consume no more than " + 
               (int)chocolatemen + " chocolate bars to maintain your weight");
    }
    else
    {   System.out.println("W");
        String weight = JOptionPane.showInputDialog("Enter your weight in pounds");
        double weightNum = Integer.parseInt(weight);
        
        String height = JOptionPane.showInputDialog("Enter the height in inches");
        double heightNum = Integer.parseInt(height);
        
        String age = JOptionPane.showInputDialog("Enter your age in years");
        int ageNum = Integer.parseInt(age);
        
        double BMRwomen, chocolatewomen;
        BMRwomen =(655 + (4.3 * weightNum) + (4.7 * heightNum) - (4.7 * ageNum));
        
        chocolatewomen = (BMRwomen / CHOCO);
        JOptionPane.showMessageDialog(null, "If you are a woman, you should consume no more than " + 
                (int)chocolatewomen + " chocolate bars to maintain your weight");
        System.out.println("If you are a woman, you should consume no more than "
              +(int)chocolatewomen + " chocolate bars to maintain your weight");
        
        System.exit(0);
    }
        
    }
    
}
