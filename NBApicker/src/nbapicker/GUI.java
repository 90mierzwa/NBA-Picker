package nbapicker;


import javax.swing.JFrame;  // default java application to help with architecture of animation
import javax.swing.JPanel;  // default java application that provides container for components
import java.awt.GridLayout;  // default java application that places components into grid cells 
import javax.swing.JButton;  // default java application that allows for the use of push buttons on calculator 
import javax.swing.JTextField;  // default java application that allows me to enter text for aspects of calculator animation
import java.awt.event.ActionEvent;  // default java application that passes events to ActionListener object
import java.awt.event.ActionListener; // default java application that defines what should be done when user performs certain operation 

import static nbapicker.teams.chooseTeam;

public class GUI extends JPanel implements ActionListener 
{
    protected JTextField text;
    protected JButton atlHawks, bosCeltics, brklndNets, charHornets, chicBulls, clcCavaliers, dalMavericks, denNuggets, detPistons, goldstWarriors;
    protected JButton houRockets, indPacers, laClippers, laLakers, memGrizzlies, miaHeat, milBucks, minTimberwolves, noPelicans, nyKnicks;
    protected JButton okcThunder, orlMagic, phil76ers, phnxSuns, prtTrailblazers, sacKings, sanSpurs, torRaptors, utahJazz, washWizards;
    protected String output;
    protected String post;
    
    public GUI()  // Constructor class
    { 
        output = "";
        text = new JTextField(50); //create text field for calculator animation        
        text.setText(output);
        text.addActionListener(this);
        text.setEditable(false);
        setLayout(new GridLayout(15, 2));  // positioning of push buttons 
        
        // assigns number and teams to each button
        atlHawks = new JButton("1 - Atlanta Hawks");                    bosCeltics = new JButton("2 - Boston Celtics"); 
        brklndNets = new JButton("3 - Brooklyn Nets");                  charHornets = new JButton("4 - Charlotte Hornets"); 
        chicBulls = new JButton("5 - Chicago Bulls");                   clcCavaliers = new JButton("6 - Cleveland Cavaliers"); 
        dalMavericks = new JButton("7 - Dallas Mavericks");             denNuggets = new JButton("8 - Denver Nuggets"); 
        detPistons = new JButton("9 - Detroit Pistons");                goldstWarriors = new JButton("10 - Golden State Warriors"); 
        houRockets = new JButton("11 - Houston Rockets");               indPacers = new JButton("12 - Indiana Pacers"); 
        laClippers = new JButton("13 - Los Angeles Clippers");          laLakers = new JButton("14 - Los Angeles Lakers"); 
        memGrizzlies = new JButton("15 - Memphis Grizzlies");           miaHeat = new JButton("16 - Miami Heat"); 
        milBucks = new JButton("17 - Milwaukee Bucks");                 minTimberwolves = new JButton("18 - Minnesota Timberwolves"); 
        noPelicans = new JButton("19 - New Orleans Pelicans");          nyKnicks = new JButton("20 - New York Knicks"); 
        okcThunder = new JButton("21 - Oklahoma City Thunder");         orlMagic = new JButton("22 - Orlando Magic"); 
        phil76ers = new JButton("23 - Philadelphia 76ers");             phnxSuns = new JButton("24 - Phoenix Suns"); 
        prtTrailblazers = new JButton("25 - Portland Trailblazers");    sacKings = new JButton("26 - Sacramento Kings"); 
        sanSpurs = new JButton("27 - San Antonio Spurs");               torRaptors = new JButton("28 - Toronto Raptors"); 
        utahJazz = new JButton("29 - Utah Jazz");                       washWizards = new JButton("30 - Washington Wizards"); 
        
        // records actios for each button pressed
        atlHawks.addActionListener(this);                               brklndNets.addActionListener(this);
        chicBulls.addActionListener(this);                              dalMavericks.addActionListener(this);
        detPistons.addActionListener(this);                             houRockets.addActionListener(this);
        laClippers.addActionListener(this);                             memGrizzlies.addActionListener(this);
        milBucks.addActionListener(this);                               noPelicans.addActionListener(this);
        okcThunder.addActionListener(this);                             phil76ers.addActionListener(this);
        prtTrailblazers.addActionListener(this);                        sanSpurs.addActionListener(this);
        utahJazz.addActionListener(this);                               bosCeltics.addActionListener(this);
        charHornets.addActionListener(this);                            clcCavaliers.addActionListener(this);
        denNuggets.addActionListener(this);                             goldstWarriors.addActionListener(this);
        indPacers.addActionListener(this);                              laLakers.addActionListener(this);
        miaHeat.addActionListener(this);                                minTimberwolves.addActionListener(this);
        nyKnicks.addActionListener(this);                               orlMagic.addActionListener(this);
        phnxSuns.addActionListener(this);                               sacKings.addActionListener(this);
        torRaptors.addActionListener(this);                             washWizards.addActionListener(this); 
        
        add(atlHawks);                                                  add(chicBulls);
        add(detPistons);                                                add(laClippers);
        add(milBucks);                                                  add(okcThunder);        
        add(prtTrailblazers);                                           add(utahJazz);
        add(charHornets);                                               add(denNuggets);
        add(indPacers);                                                 add(miaHeat);
        add(nyKnicks);                                                  add(phnxSuns);
        add(torRaptors);                                                add(brklndNets);
        add(dalMavericks);                                              add(houRockets);
        add(memGrizzlies);                                              add(noPelicans);
        add(phil76ers);                                                 add(sanSpurs);
        add(bosCeltics);                                                add(clcCavaliers);
        add(goldstWarriors);                                            add(laLakers);
        add(minTimberwolves);                                           add(orlMagic);
        add(sacKings);                                                  add(washWizards);
        add(text);      
        
    }
    
        public void createGUI()
    {
        JFrame frame = new JFrame("NBA Picker");  // Creates and titles the pop up frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //immediately stops program when the window is exited out of        
        GUI newContentPane = new GUI();
        newContentPane.setOpaque(true); // panes are not transparent
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);  // makes window visible
    }
       
    /* public PostFixEvaluator(String PEstring) 
    {
        PFinput = PEstring;
        PFoutput = "";
    }
        
    public String PostFixEvaluator()      //sends strings to ParsePost and returns a post fix expression
    {
        while(true)
        {
            if(PFinput == null)  //checks if there is any string input
                return "";
            String[] input = PFinput.split("\\s+");  //splits the input string into an array of strings
            if(input[0] == null && input[1] == null)  // checks to make sure there is some sort of input
                break;           
            ParsePost aParser = new ParsePost(input);  //calculates expression using ParsePost 
            PFoutput = aParser.doParse();
            System.out.println("Evaluates to " + PFoutput);
            return PFoutput;
        }       
        return null;
    }
    
    public class InfixConverter  // takes infix expression as input and sends it to InToPost
{
    protected String IFinput;  //initializing variables
    protected String IFoutput;
    
    public InfixConverter(String IFstring)  //constructor
    {
        IFinput = IFstring;
        IFoutput = "";
    }
    
    public String infix()  // splits IF input into different strings to send to InToPost 
    {
        while(true)
        {
            
            String[] input = IFinput.split("\\s+");  // splits IFinput string            
            if(input[0].equals("") && input[1].equals(""))  // make sure there is some sort of input
                break;            
            InToPost theTrans = new InToPost(input);  //convers infix to postfix by using InToPost class            
            IFoutput= theTrans.doTrans();
            System.out.println("Postfix is " + IFoutput + "\n");
            return IFoutput;
        }
        return null;  //returns null if there is nothing in input string
    }   
}
        */
    
    
        @Override
        
        public void actionPerformed(ActionEvent a) 
        
        {
            
        if(a.getSource() == atlHawks)
        {
            output = output + "Atlanta Hawks"; // displays a 0 in output display box if '0' button is pushed 
        }
            
        else if (a.getSource() == bosCeltics)
        {
            output = output + "Boston Celtics";  // displays a 1 in output display box if '1' button is pushed       
        }
        
        else if (a.getSource() == brklndNets)
        {
            output = output + "Brooklyn Nets";  // displays a 2 in output display box if '2' button is pushed'  
        }
        
        else if (a.getSource() == charHornets)
        {
            output = output + "Charlotte Hornets"; // displays a 3 in output display box if '3' button is pushed         
        }
        
        else if (a.getSource() == chicBulls)
        {
            output = output + "Chicago Bulls"; // displays a 4 in output display box if '4' button is pushed        
        }
        
        else if (a.getSource() == clcCavaliers)
        {
            output = output + "Cleveland Cavaliers"; // displays a 5 in output display box if '5' button is pushed         
        }
        
        else if (a.getSource() == dalMavericks)
        {
            output = output + "Dallas Mavericks"; // displays a 6 in output display box if '6' button is pushed         
        }
        
        else if (a.getSource() == denNuggets)
        {
            output = output + "Denver Nuggets";  // displays a 7 in output display box if '7' button is pushed         
        }
        
        else if (a.getSource() == detPistons)
        {
            output = output + "Detroit Pistons";   // displays a 8 in output display box if '8' button is pushed         
        }
        
        else if (a.getSource() == goldstWarriors)
            
        {
            output = output + "Golden State Warriors";  // displays a 9 in output display box if '9' button is pushed       
        }
        
        else if (a.getSource() == houRockets)
        {
            output = output + "Houston Rockets";
        }
        
        else if (a.getSource() == indPacers)
        {
            output = output + "Indiana Pacers";
        }
        else if (a.getSource() == laClippers)
        {
            output = output + "Los Angeles Clippers";   // displays a decimal point in output display box if '.' button is pushed        
        }
        
        else if (a.getSource() == laLakers)
        {
            output = output + "Los Angeles Lakers";   // displays an asterisk (multiplication sign) in output display box if *' button is pushed       
        }
        
        else if (a.getSource() == memGrizzlies)
        {
            output = output + "Memphis Grizzlies";  // displays a division sign in output display box if '/' button is pushed         
        }
        
        else if (a.getSource() == miaHeat)
        {
            output = output + "Miami Heat";  // displays a percentage(modulus) sign in output display box if '%' button is pushed       
        }
        
        else if (a.getSource() == milBucks)
        {
            output = output + "Milwaukee Bucks";  // displays a exponent in output display box if '^' button is pushed
        }
        
        else if (a.getSource() == minTimberwolves)
        {
            output = output + "Minnesota Timberwolves";  // displays a left parentheses in output display box if '(' button is pushed
        }
        
        else if (a.getSource() == noPelicans)
        {
            output = output + "New Orleans Pelicans";   // displays a right parentheses in output display box if ')' button is pushed
        }
        
        else if (a.getSource() == nyKnicks)
        {
            output=  "New York Knicks"; // makes output display box empty if 'CLEAR' button is pushed
        }
        
        else if (a.getSource() == okcThunder)
        {
            output = output + "Oklahoma City Thunder"; // displays a 4 in output display box if '4' button is pushed        
        }
        
        else if (a.getSource() == orlMagic)
        {
            output = output + "Orlando Magic"; // displays a 5 in output display box if '5' button is pushed         
        }
        
        else if (a.getSource() == phil76ers)
        {
            output = output + "Philadelphia 76ers"; // displays a 6 in output display box if '6' button is pushed         
        }
        
        else if (a.getSource() == phnxSuns)
        {
            output = output + "Phoenix Suns";  // displays a 7 in output display box if '7' button is pushed         
        }
        
        else if (a.getSource() == prtTrailblazers)
        {
            output = output + "Portland Trailblazers";   // displays a 8 in output display box if '8' button is pushed         
        }
        
        else if (a.getSource() == sacKings)            
        {
            output = output + "Sacramento Kings";  // displays a 9 in output display box if '9' button is pushed       
        }
        
        else if (a.getSource() == sanSpurs)
        {
            output = output + "San Antonio Spurs";
        }
        
        else if (a.getSource() == torRaptors)
        {
            output = output + "Toronto Raptors";
        }
        else if (a.getSource() == utahJazz)
        {
            output = output + "Utah Jazz";   // displays a decimal point in output display box if '.' button is pushed        
        }
        
        else if (a.getSource() == washWizards)
        {
            output = output + "Washington Wizards";   // displays an asterisk (multiplication sign) in output display box if *' button is pushed       
        }
        
        
        
        
        
       
            
        
        
          /*javax.swing.SwingUtilities.invokeLater(new Runnable() {            
            public void run() {
                calcGui.createGUI(); 
            }
            GUI calcGui = new GUI ();
        });         
        */
    }
    
}
