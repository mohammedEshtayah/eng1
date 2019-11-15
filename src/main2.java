import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main2 {

	private JFrame frame;
	private JTextField Solar_time;
	private JTextField Aceiling;
	private JTextField Ti_T0;
	private JTextField Qcooling_ceiling;
	private JTextField Qcooling_wall;
	private JTextField AGlass;
	private JTextField Qtrans_throng_glass; 
	private JTextField Normail_Thickness2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main2 window = new main2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main2() {
		initialize(); 
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BoundsPopupMenuListener listener =     new BoundsPopupMenuListener(true, false);
		frame = new JFrame();
		Dimension size =  Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds( 0, 0, size.width, size.height );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 
		Hash<String,String,Integer> R_9_1 = new Hash<String,String,Integer>();
		 
		 R_9_1.put("without suspended","steel sheet with 25.4mm(or 50.8mm) insulation",0); 
		 R_9_1.put("without suspended","25-mm wood with 25.4 mm insulation",1); 
		 R_9_1.put( "without suspended","101.6 mm L.W concrete",2); 
		 R_9_1.put( "without suspended","50.8 mm H.W concrete 25.4 mm insultion",3); 
		 R_9_1.put( "without suspended","25.4 mm wood with 50.8 insultion",4); 
		 R_9_1.put("without suspended", "152.4 mm L.W concrete",5); 
		 R_9_1.put("without suspended","63.5 mm wood with 25.4 mm insulation",6); 
		 R_9_1.put("without suspended", "203.4 mm L.W concrete",7); 
		 R_9_1.put("without suspended","101.6 mm H.W concrete with 25.4mm(or 50.8mm) insulation",8); 
		 R_9_1.put( "without suspended","63.5 mm wood with 50.8 insultion",9); 
		 R_9_1.put( "without suspended","Roof terrace system",10); 
		 R_9_1.put("without suspended","152.4 mm H.W concrete with 25.4mm(or 50.8mm) insulation",11); 
		 R_9_1.put("without suspended", "101.6.5 mm wood with 25.4mm (or 50.8mm)  insultion",12); 

		 R_9_1.put("with suspended","steel sheet with 25.4mm(or 50.8mm) insulation",13); 
		 R_9_1.put("with suspended","25-mm wood with 25.4 mm insulation",4); 
		 R_9_1.put( "with suspended","101.6 mm L.W concrete",15); 
		 R_9_1.put( "with suspended","50.8 mm H.W concrete 25.4 mm insultion",16); 
		 R_9_1.put( "with suspended","25.4 mm wood with 50.8 insultion",17); 
		 R_9_1.put("with suspended", "152.4 mm L.W concrete",18); 
		 R_9_1.put("with suspended","63.5 mm wood with 25.4 mm insulation",19); 
		 R_9_1.put("with suspended", "203.4 mm L.W concrete",20); 
		 R_9_1.put("with suspended","101.6 mm H.W concrete with 25.4mm(or 50.8mm) insulation",21); 
		 R_9_1.put( "with suspended","63.5 mm wood with 50.8 insultion",22); 
		 R_9_1.put( "with suspended","Roof terrace system",23); 
		 R_9_1.put("with suspended","152.4 mm H.W concrete with 25.4mm(or 50.8mm) insulation",24); 
		 R_9_1.put("with suspended", "101.6.5 mm wood with 25.4mm (or 50.8mm)  insultion",25); 
		 double Table_9_1[][]= {
		  {0, 0 , -1 , -2 , -2 , -3 , -2 , 3 , 11 , 19 , 27 , 34 , 40 , 43 , 44 , 43 , 39 , 33 , 25 , 17 , 10 , 7 , 5 , 3 , 1 },
		  {0, 3 , 2 , 0 , -1 , -2 , -2 , -1 , 2 , 8 , 15 , 22 , 29 , 35 , 39 , 41 , 41 , 39 , 35 , 29 , 21 , 15 , 11 , 8 , 5 },
		  {0, 5 , 3 , 1 , 0 , -1 , -2 , -2 , 1 , 5 , 11 , 18 , 25 , 31 , 36 , 39 , 40 , 40 , 37 , 32 , 25 , 19 , 14 , 10 , 7 },
		  {0, 7 , 5 , 3 ,2 , 0 , -1 , 0 ,2 , 6 , 11 , 17 , 23 , 28 , 33 , 36 , 37 , 37 , 34 , 30 , 25 , 20 , 16 , 12 , 10  },
		  {0, 2 , 0 , -2 ,-3 , -4 , -4 , -4 , -2 , 3 , 9 , 15 , 22 , 27 , 32 , 35 , 36 , 35 , 32 , 27 , 20 , 14 , 10 , 6  ,3 },
		  {0, 12 , 10 , 7 , 5  , 3 , 2 , 1 , 0 , 2 , 4 , 8 , 13 , 18 , 24 , 29 , 33 , 35 , 36 , 35 , 32 , 28 , 24 , 19 , 16   },
		  {0, 16 , 13 , 11 , 9  , 7 , 6 , 4 , 3 , 4 , 5 , 8 , 11 , 15 , 19 , 23 , 27 , 29 , 31 , 31 , 30 , 27 , 25 , 22 , 19   },
		  {0, 20 , 17 , 14 ,12  , 10 , 8 , 6 , 5 , 4 , 4 , 5 , 7 , 11 , 14 , 18 , 22 , 25 , 28 , 30 , 30 , 29 , 27 , 25  ,22 },
		  {0, 14 , 12 , 10 , 8 , 7 , 5 , 4 , 4 , 6 , 8 , 11 , 15 , 18 , 22 , 25 , 28 , 29 ,30 ,29 , 27 , 24 , 21 , 19 , 16 },
		  {0, 18 , 15 , 13 , 11 ,9 , 8 , 6 , 5 , 5 , 5 , 7 , 10 , 13 , 17 , 21 , 24 , 27 , 28 , 29 , 29 , 27 , 25 , 23 , 20 },
		  {0, 19 , 17 , 15 ,14 , 12 , 11 , 9 , 8 , 7 , 8 , 8 , 10 , 12 , 15 , 18 , 20 , 22 , 24 , 25 , 26 , 25 , 24 , 22 ,21 },
		  {0, 18 , 16 , 14 , 12 ,11 , 10 , 9 , 8 , 8 , 9 , 10 , 12 , 15 , 17 , 20 , 22 , 24 , 25 , 25 , 25 , 24 , 22 , 20 , 19   },
		  {0, 21 , 20 , 18 , 17 , 15 , 14 , 13 , 11 , 10 , 9 , 9 ,9 , 10 , 12 , 14 , 16 , 18 , 20 , 22 , 23 , 24 , 24 , 23 , 22  },
		  //--------------------------------
		  {0, 1 , 0 , -1 ,-2 , -3 , -3 , 0 , 5 , 13 , 20 , 28 , 35 , 40 , 43 , 43 , 41 , 37 , 31 , 32 , 15 , 10 , 7 , 5  ,3 },
		  {0, 11 , 8 , 6 , 5 , 3 , 2 , 1 , 2 , 4 , 7 , 12 , 17 , 22 , 27 , 31 , 33 , 35 , 34 , 32 , 28 , 24 , 20 , 17  , 14 },
		  {0, 10 , 8 , 6 , 4 , 2 , 1 , 0 , 0 , 2 , 6 , 10 , 16 , 21 , 27 , 31 , 34 , 36 , 36 , 34 , 30 , 26 , 21 , 17  , 13 },
		  {0, 16 , 14 , 13 ,11 , 10 , 8 , 7 , 7 , 8 , 9 , 11 , 14 , 17 , 19 , 22 , 24 , 25 , 26 , 26 , 25 , 23 , 21 , 20  , 18 },
		  {0, 14 , 11 , 9 , 7 , 5 , 4 , 3 , 3 , 4 , 6 , 10 , 14 , 18 , 23 , 27 , 30 , 31 , 32 , 31 , 29 , 26 , 22 , 19 , 16 },
		  {0, 18 , 15 , 13 ,11 , 9 , 7 , 6 , 4 , 4 , 4 , 6 , 9 , 12 , 16 , 20 , 24 , 27 , 20 , 30 , 30 , 38 , 26 , 23  , 20 },
		  {0, 19 , 18 , 16 , 14 , 13 , 12 , 10 , 9 , 8 , 8 , 9 , 10 , 12 , 14 , 17 , 19 , 21 , 23 , 24 , 25 , 24 , 23 , 22  , 21 },
		  {0, 22 , 20 , 18 , 16 , 15 , 13 , 11 , 10 , 9 , 8 , 8 , 8 , 9 , 11 , 14 , 16 , 19 , 21 , 23 , 25 , 25 , 25 , 24  ,23 },
		  {0, 17 , 16 , 15 ,14 , 13 , 13 , 12 , 11 , 11 , 11 , 12 , 13 , 15 , 16 , 18 , 19 , 20 , 21 , 21 , 21 , 21 , 20 , 19 , 18  },
		  {0, 19 , 18 , 17 ,16 , 14 , 13 , 12 , 11 , 10 , 10 , 10 , 11 , 12 , 14 , 16 , 18 , 19 , 21 , 22 , 23 , 23 , 22 , 22  ,21 },
		  {0, 17 , 16 , 16 , 15 , 15 , 14 , 13 , 13 , 13 , 12 , 12 , 13 , 13 , 14 , 15 , 16 , 16 , 17 , 18 , 18 , 19 , 18 , 18 , 18  },
		  {0, 16 , 16  , 15 , 15 ,14 , 13 , 13 , 12 , 12 , 12 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 18 , 19 , 19 , 19 , 18 , 18 , 18 },
          };
		 // table 9-2 ------------------------
		 Hash<String,String,Integer> R_9_2 = new Hash<String,String,Integer>();
		 R_9_2.put( "16","December",0);
		 R_9_2.put( "16","Jan./Nov",1);
		 R_9_2.put( "16","Feb./Oct",2);
		 R_9_2.put( "16","mar./Sept",3);
		 R_9_2.put( "16","Apr./Aug",4);
		 R_9_2.put( "16","May/July",5);
		 R_9_2.put( "16","June",6);
         //------------------------------
		 R_9_2.put( "24","December",7);
		 R_9_2.put( "24","Jan./Nov",8);
		 R_9_2.put( "24","Feb./Oct",9);
		 R_9_2.put( "24","mar./Sept",10);
		 R_9_2.put( "24","Apr./Aug",11);
		 R_9_2.put( "24","May/July",12);
		 R_9_2.put( "24","June",13);
		 //-----------------------------
		 R_9_2.put( "32","December",14);
		 R_9_2.put( "32","Jan./Nov",15);
		 R_9_2.put( "32","Feb./Oct",16);
		 R_9_2.put( "32","mar./Sept",17);
		 R_9_2.put( "32","Apr./Aug",18);
		 R_9_2.put( "32","May/July",19);
		 R_9_2.put( "32","June",20);
		 //------------------------------
		 R_9_2.put( "40","December",21);
		 R_9_2.put( "40","Jan./Nov",22);
		 R_9_2.put( "40","Feb./Oct",23);
		 R_9_2.put( "40","mar./Sept",24);
		 R_9_2.put( "40","Apr./Aug",25);
		 R_9_2.put( "40","May/July",26);
		 R_9_2.put( "40","June",27);
		 //------------------------------
		 R_9_2.put( "48","December",28);
		 R_9_2.put( "48","Jan./Nov",29);
		 R_9_2.put( "48","Feb./Oct",30);
		 R_9_2.put( "48","mar./Sept",31);
		 R_9_2.put( "48","Apr./Aug",32);
		 R_9_2.put( "48","May/July",33);
		 R_9_2.put( "48","June",34);
		 
		 Map<String,Integer> H_9_2 = new HashMap<String,Integer>();
		 H_9_2.put("N",0); 
		 H_9_2.put("NNE  NNW",1); 
		 H_9_2.put("NE  NW",2); 
		 H_9_2.put("ENE  WNW",3); 
		 H_9_2.put("E  W",4);
		 H_9_2.put("ESE  WSW",5);
		 H_9_2.put("SE  SW",6); 
		 H_9_2.put("SSW  SSW",7); 
		 H_9_2.put("S",8);
		 H_9_2.put("Horizontal Roofs",9); 
		 double Table_9_2[][]= {
				 { -2.2 , -3.3 , -4.4 , -4.4 , -2.2 , -0.5 , 2.2 , 5.0 , 7.2 , -5.0},
				 { -2.2 , -3.3 , -3.8 , -3.8 , -2.2 , -0.5 , 2.2 , 4.4 , 6.6 , -3.8},
				 { -1.6 , -2.7 , -2.7 , -2.2 , -1.1 ,  0.0 , 1.1 , 2.7 , 3.8 , -2.2},
				 { -1.6 , -1.6 , -1.1 , -1.1 , -0.5 , -0.5 , 0.0 , 0.0 , 0.0 , -0.5},
				 { -0.5 ,  0.0 ,  -0.5 , -0.5 , -0.5 , -1.6 ,-1.6 ,-2.7 , 3.3 , 0.0},
				 {  2.2 ,  1.6 ,  1.6 , 0.0 , -0.5 , -2.2 ,-2.7 , -3.8 ,-3.8 , 0.0},
				 {  3.3 , 2.2 , 2.2 , 0.5 , -0.5 , -2.2 , -3.3 , -4,4 , 3.8 , 0.0},
				 //-------------------------------------------------------------
				 { -2.7 , -3.8 , -5.5 , -6.1 , -4.4 , -2.7 , -1.1 , 5.0 , 6.6 , -9.4},
				 { -2.2 , -3.3 , -4.4 , -5.0 , -3.3 , -1.6 , -1.6 , 5.0 , 7.2 , -6.1},
				 { -2.2 , -2.7 , -3.3 , -3.3 , -1.6 ,  -0.5 , 1.6 , 3.8 , 5.5 , -3.8},
				 { -1.6 , -1.2 , -1.6 , -1.6 , -0.5 , -0.5 , 0.5 , 1.1 , 2.2 , -1.6},
				 { -1.1 ,  -0.5 ,  0.0 , -0.5 , -0.5 , -1.1 ,-0.5 ,-1.1 , 1.6 , 0.0},
				 {  0.5 ,  1.1 ,  1.1 , 0.0 , 0.0 , -1.6 ,-1.6 , -2.7 ,-3.3 , 0.5},
				 {  1.6 , 1.6 , 1.6 , 0.5 , 0.0 , -1.6 , -2.2 , -3,3 , 3.3 , 0.5},
				 //-------------------------------------------------------------
				 { -2.7 , -3.8 , -5.5 , -6.1 , -4.4 , -2.7 , -1.1 , 5.0 , 6.6 , -9.4},
				 { -2.2 , -3.8 , -5.0 , -6.1 , -4.4 , -2.2 ,  1.1 , 5.0 , 6.6 , -8.3},
				 { -2.2 , -3.3 , -3.8 , -4.4 , -2.2 ,  -1.1 , 2.2 , 4.4 , 6.1 , -5.5},
				 { -1.6 , -2.2 , -2.2 , -2.2 , -1.1 , -0.5 , 1.6 ,  2.7 , 3.8 , -2.7},
				 { -1.1 , -1.1 , -0.5 , -1.1 ,  0.0 , -0.5 , 0.0  , 5.0 , 0.5 , -0.5},
				 {  0.5 ,  0.5 ,  0.5 ,   0.0 , 0.0 , -0.5 , -0.5 ,-1.6 , -1.6 , 0.5},
				 {  0.5 , 1.1 , 1.1 , 0.5 , 0.0 , -1.1 , -1.1 , -2,2 , -2.2 , 1.1},
				 //-------------------------------------------------------------
				 { -3.3 , -4.4 , -5.5 , -7.2 , -5.5 , -3.8 , 0.0 , 3.8 , 5.5 , -11.6},
				 { -2.7 , -3.8 , -5.5 , -6.6 , -5.0 , -3.3 ,  0.5 , 4.4 , 6.1 , -10.5},
				 { -2.7 , -3.8 , -4.4 , -5.0 , -3.3 ,  -1.6 , 1.6 , 4.4 , 6.6 , -7.7},
				 { -2.2 , -2.7 , -2.7 , -3.3 , -1.6 , 0.5 , 2.2 ,  3.8 , 5.5 , -4.4},
				 { -1.1 , -1.6 , -0.6 , -1.1 , 0.0 , 0.0  , 1.1 , 1.6 , 2.2  , 1.6},
				 {  0.0 ,  0.0 ,  0.0 ,   0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.5 , 0.5},
				 {  0.5 , 0.5 , 0.5 , 0.5 , 0.0 , 0.5 , 0.0 , 0,0 , -0.5 , 1.1},
				 //-------------------------------------------------------------
				 { -3.3 , -4.4 , -6.1 , -7.7 , -7.2 , -5.5 , -1.6 , 1.1 , 3.3 , -13.8},
				 { -3.3 , -4.4 , -6.1 , -7.2 , -6.1 , -4.4 , -0.5 , 2.7 , 4.4 , -13.3},
				 { -2.7 , -3.8 , -5.5 , -6.1 , -4.4 , -2.7 ,  0.5 , 4.4 , 6.1 , -10.0},
				 { -2.2 , -3.3 , -3.3 , -3.8 , -2.2 , -0.5 ,  2.2 , 4.4 , 6.1 , -6.1},
				 { -1.6 , -1.6 , -1.6 , -1.6 , -0.5 , 0.0 , 2.2 ,  3.3 , 3.8 , -2.7},
				 {  0.0 , -0.5 ,  0.0 ,  0.0 , 0.5 , 0.5 , 1.6 , 1.6 , 2.2 , 0.0},
				 {  0.5 , 0.5 , 1.1 , 0.5 , 1.1 , 0.5 , 1.1 , 1,1 , 1.6 , 1.1},
		 };
		 // table 9-4 ------------------------
		 
		 Hash<String,String,Integer> R_9_4 = new Hash<String,String,Integer>();
		 R_9_4.put( "Group A","N",0);
		 R_9_4.put( "Group A","NE",1);
		 R_9_4.put( "Group A","E",2);
		 R_9_4.put( "Group A","SE",3);
		 R_9_4.put( "Group A","S",4);
		 R_9_4.put( "Group A","SW",5);
		 R_9_4.put( "Group A","W",6);
		 R_9_4.put( "Group A","NW",7);
		 //-------------------------
		 R_9_4.put( "Group B","N",8);
		 R_9_4.put( "Group B","NE",9);
		 R_9_4.put( "Group B","E",10);
		 R_9_4.put( "Group B","SE",11);
		 R_9_4.put( "Group B","S",12);
		 R_9_4.put( "Group B","SW",13);
		 R_9_4.put( "Group B","W",14);
		 R_9_4.put( "Group B","NW",15);
		 //----------------------------
		 R_9_4.put( "Group C","N",16);
		 R_9_4.put( "Group C","NE",17);
		 R_9_4.put( "Group C","E",18);
		 R_9_4.put( "Group C","SE",19);
		 R_9_4.put( "Group C","S",20);
		 R_9_4.put( "Group C","SW",21);
		 R_9_4.put( "Group C","W",22);
		 R_9_4.put( "Group C","NW",23);
		 //------------------------
		 R_9_4.put( "Group D","N",16);
		 R_9_4.put( "Group D","NE",17);
		 R_9_4.put( "Group D","E",18);
		 R_9_4.put( "Group D","SE",19);
		 R_9_4.put( "Group D","S",20);
		 R_9_4.put( "Group D","SW",21);
		 R_9_4.put( "Group D","W",22);
		 R_9_4.put( "Group D","NW",23);
		//------------------------
		 R_9_4.put( "Group E","N",16);
		 R_9_4.put( "Group E","NE",17);
		 R_9_4.put( "Group E","E",18);
		 R_9_4.put( "Group E","SE",19);
		 R_9_4.put( "Group E","S",20);
		 R_9_4.put( "Group E","SW",21);
		 R_9_4.put( "Group E","W",22);
		 R_9_4.put( "Group E","NW",23);
		//------------------------
		 R_9_4.put( "Group F","N",16);
		 R_9_4.put( "Group F","NE",17);
		 R_9_4.put( "Group F","E",18);
		 R_9_4.put( "Group F","SE",19);
		 R_9_4.put( "Group F","S",20);
		 R_9_4.put( "Group F","SW",21);
		 R_9_4.put( "Group F","W",22);
		 R_9_4.put( "Group F","NW",23);
		//------------------------
		 R_9_4.put( "Group G","N",16);
		 R_9_4.put( "Group G","NE",17);
		 R_9_4.put( "Group G","E",18);
		 R_9_4.put( "Group G","SE",19);
		 R_9_4.put( "Group G","S",20);
		 R_9_4.put( "Group G","SW",21);
		 R_9_4.put( "Group G","W",22);
		 R_9_4.put( "Group G","NW",23);
		 double Table_9_4[][]= {
				 {0 ,8 ,8 ,8 ,7 ,7 ,7 ,7 ,6 ,6 ,6 ,6 ,6 ,6 ,6 ,6 ,6 ,6 ,6 ,7 ,7 ,7 ,7 ,8 ,8 },
				 {0 ,11 ,11 ,10 ,10 ,10 ,9 ,9 ,9 ,8 ,8 ,8 ,9 ,9 ,9 ,9 ,10 ,10 ,10 ,11 ,11 ,11 ,11 ,11 ,11 },
				 {0 ,14 ,13 ,13 ,13 ,12 ,12 ,11 ,11 ,10 ,10 ,10 ,11 ,11 ,12 ,12 ,13 ,13 ,13 ,14 ,14 ,14 ,14 ,14 ,14 },
				 {0 ,13 ,13 ,13 ,12 ,12 ,11 ,11 ,10 ,10 ,10 ,10 ,10 ,10 ,11 ,11 ,12 ,12 ,13 ,13 ,13 ,13 ,13 ,13 ,13 },
				 {0 ,11 ,11 ,11 ,11 ,10 ,10 ,9 ,9 ,9 ,8 ,8 ,8 ,8 ,8 ,8 ,8 ,9 ,9 ,10 ,10 ,11 ,11 ,11 ,11 },
				 {0 ,14 ,14 ,14 ,14 ,13 ,13 ,12 ,12 ,11 ,11 ,10 ,10 ,10 ,9 ,9 ,10 ,10 ,10 ,11 ,12 ,13 ,13 ,14 ,14 },
				 {0 ,15 ,15 ,15 ,14 ,14 ,14 ,13 ,13 ,12 ,12 ,11 ,11 ,10 ,10 ,10 ,10 ,10 ,11 ,11 ,12 ,13 ,14 ,14 ,15 },
				 {0 ,12 ,12 ,11 ,11 ,11 ,11 ,10 ,10 ,10 ,9 ,9 ,8 ,8 ,8 ,8 ,8 ,8 ,8 ,9 ,9 ,10 ,11 ,11 ,11 },
				 //----------
				 {0 ,8 ,8 ,8 ,7 ,7 ,6 ,6 ,6 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,6 ,6 ,7 ,7 ,8 ,8 ,8 ,8 ,8 },
				 {0 ,11 ,10 ,10 ,9 ,9 ,8 ,7 ,7 ,7 ,7 ,8 ,8 ,9 ,9 ,10 ,10 ,11 ,11 ,11 ,12 ,12 ,12 ,11 ,11 },
				 {0 ,13 ,13 ,12 ,11 ,10 ,10 ,9 ,8 ,8 ,9 ,9 ,10 ,12 ,13 ,13 ,14 ,14 ,15 ,15 ,15 ,15 ,15 ,14 ,14 },
				 {0 ,13 ,12 ,12 ,11 ,10 ,10 ,9 ,8 ,8 ,8 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,14 ,14 ,14 ,14 ,14 ,14 ,14 },
				 {0 ,12 ,11 ,11 ,10 ,9 ,9 ,8 ,7 ,7 ,6 ,6 ,6 ,6 ,7 ,8 ,9 ,10 ,11 ,11 ,12 ,12 ,12 ,12 ,12 },
				 {0 ,15 ,15 ,14 ,13 ,13 ,12 ,11 ,10 ,9 ,9 ,8 ,8 ,7 ,7 ,8 ,9 ,10 ,11 ,13 ,14 ,15 ,15 ,16 ,16 },
				 {0 ,16 ,16 ,15 ,14 ,14 ,13 ,12 ,11 ,10 ,9 ,9 ,8 ,8 ,8 ,8 ,8 ,9 ,11 ,12 ,14 ,15 ,16 ,16 ,17 },
				 {0 ,13 ,12 ,12 ,11 ,11 ,10 ,9 ,9 ,8 ,7 ,7 ,7 ,6 ,6 ,7 ,7 ,8 ,8 ,9 ,11 ,12 ,13 ,13 ,13 },
				 //-------------------
				 {0 ,9 ,8 ,7 ,7 ,6 ,5 ,5 ,4 ,4 ,4 ,4 ,4 ,5 ,5 ,6 ,6 ,7 ,8 ,9 ,9 ,9 ,10 ,9 ,9 },
				 {0 ,10 ,10 ,9 ,8 ,7 ,6 ,6 ,6 ,6 ,7 ,8 ,10 ,10 ,11 ,12 ,12 ,12 ,13 ,13 ,13 ,13 ,12 ,12 ,11 },
				 {0 ,13 ,12 ,11 ,10 ,9 ,8 ,7 ,7 ,8 ,9 ,11 ,13 ,14 ,15 ,16 ,16 ,17 ,17 ,16 ,16 ,16 ,15 ,14 ,13 },
				 {0 ,13 ,12 ,11 ,10 ,9 ,8 ,7 ,6 ,7 ,7 ,9 ,10 ,12 ,14 ,15 ,16 ,16 ,16 ,16 ,16 ,16 ,15 ,14 ,13 },
				 {0 ,12 ,11 ,10 ,9 ,8 ,7 ,6 ,6 ,5 ,5 ,5 ,5 ,6 ,8 ,9 ,11 ,12 ,13 ,14 ,14 ,14 ,14 ,13 ,12 },
				 {0 ,16 ,15 ,14 ,12 ,11 ,10 ,9 ,8 ,7 ,7 ,6 ,6 ,6 ,7 ,8 ,10 ,12 ,14 ,16 ,18 ,18 ,18 ,13 ,17 },
				 {0 ,17 ,16 ,15 ,14 ,12 ,11 ,10 ,9 ,8 ,7 ,7 ,7 ,7 ,7 ,8 ,9 ,11 ,13 ,16 ,18 ,19 ,20 ,19 ,18 },
				 {0 ,14 ,13 ,12 ,11 ,10 ,9 ,8 ,7 ,6 ,6 ,5 ,5 ,6 ,6 ,6 ,7 ,9 ,10 ,12 ,14 ,15 ,15 ,15 ,15 },
				 //-----------------------
				 {0 ,8 ,7 ,7 ,6 ,5 ,4 ,3 ,3 ,3 ,3 ,4 ,4 ,5 ,6 ,6 ,7 ,8 ,9 ,10 ,11 ,11 ,10 ,10 ,9 },
				 {0 ,9 ,8 ,7 ,6 ,5 ,5 ,4 ,4 ,6 ,8 ,10 ,11 ,12 ,13 ,13 ,13 ,14 ,14 ,14 ,13 ,13 ,12 ,11 ,10 },
				 {0 ,11 ,10 ,8 ,7 ,6 ,5 ,5 ,5 ,7 ,10 ,13 ,15 ,17 ,18 ,18 ,18 ,18 ,18 ,17 ,17 ,16 ,15 ,13 ,12 },
				 {0 ,11 ,10 ,9 ,7 ,6 ,5 ,5 ,5 ,5 ,7 ,10 ,12 ,14 ,16 ,17 ,18 ,18 ,18 ,17 ,17 ,16 ,15 ,14 ,12 },
				 {0 ,11 ,10 ,9 ,7 ,6 ,5 ,4 ,4 ,3 ,3 ,4 ,5 ,7 ,9 ,11 ,13 ,15 ,16 ,16 ,16 ,15 ,14 ,13 ,12 },
				 {0 ,15 ,14 ,12 ,10 ,9 ,8 ,6 ,5 ,5 ,4 ,4 ,5 ,5 ,7 ,9 ,12 ,15 ,18 ,20 ,21 ,21 ,20 ,19 ,17 },
				 {0 ,17 ,15 ,13 ,12 ,10 ,9 ,7 ,6 ,5 ,5 ,5 ,5 ,6 ,6 ,8 ,10 ,13 ,17 ,20 ,22 ,23 ,22 ,21 ,19 },
				 {0 ,14 ,12 ,11 ,9 ,8 ,7 ,6 ,5 ,4 ,4 ,4 ,4 ,5 ,6 ,7 ,8 ,10 ,12 ,15 ,17 ,18 ,17 ,16 ,15 },
				 //-------------------
				 {0 ,7 ,6 ,5 ,4 ,3 ,2 ,2 ,2 ,3 ,3 ,4 ,5 ,6 ,7 ,8 ,10 ,10 ,11 ,12 ,12 ,11 ,10 ,9 ,8 },
				 {0 ,7 ,6 ,5 ,4 ,3 ,2 ,3 ,5 ,8 ,11 ,13 ,14 ,14 ,14 ,14 ,14 ,15 ,14 ,14 ,13 ,12 ,11 ,9 ,8 },
				 {0 ,8 ,7 ,6 ,5 ,4 ,3 ,3 ,6 ,10 ,15 ,18 ,20 ,21 ,21 ,20 ,19 ,18 ,18 ,17 ,15 ,14 ,12 ,11 ,9 },
				 {0 ,8 ,7 ,6 ,5 ,4 ,3 ,3 ,4 ,7 ,10 ,14 ,17 ,19 ,20 ,20 ,20 ,19 ,18 ,17 ,16 ,14 ,13 ,11 ,10 },
				 {0 ,8 ,7 ,6 ,5 ,4 ,3 ,2 ,2 ,2 ,3 ,5 ,7 ,10 ,14 ,16 ,18 ,19 ,18 ,17 ,16 ,14 ,13 ,11,10 },
				 {0 ,12 ,10 ,8 ,7 ,6 ,4 ,4 ,3 ,3 ,3 ,4 ,5 ,7 ,10 ,14 ,18 ,21 ,24 ,25 ,24 ,22 ,19 ,17 ,14 },
				 {0 ,14 ,12 ,10 ,8 ,6 ,5 ,4 ,3 ,3 ,4 ,4 ,5 ,6 ,8 ,11 ,15 ,20 ,24 ,27 ,27 ,25 ,22 ,19 ,16 },
				 {0 ,11 ,9 ,8 ,6 ,5 ,4 ,3 ,3 ,3 ,3 ,4 ,5 ,6 ,7 ,9 ,11 ,14 ,18 ,21 ,21 ,20 ,18 ,15 ,13 },
				 //-----------------------
				 {0 ,5 ,4 ,3 ,2 ,1 ,1 ,1 ,2 ,3 ,4 ,5 ,6 ,8 ,9 ,11 ,12 ,12 ,13 ,13 ,13 ,11 ,9 ,7 ,6 },
				 {0 ,5 ,4 ,3 ,2 ,2 ,2 ,3 ,8 ,13 ,16 ,17 ,16 ,16 ,15 ,15 ,15 ,15 ,14 ,13 ,12 ,10 ,9 ,7 ,6 },
				 {0 ,5 ,4 ,3 ,2 ,2 ,1 ,4 ,9 ,15 ,21 ,24 ,25 ,23 ,22 ,20 ,19 ,18 ,17 ,15 ,13 ,11 ,10 ,8 ,7 },
				 {0 ,5 ,4 ,3 ,2 ,2 ,1 ,2 ,6 ,10 ,15 ,20 ,23 ,24 ,23 ,22 ,20 ,19 ,17 ,16 ,14 ,12 ,10 ,8 ,7 },
				 {0 ,5 ,4 ,3 ,2 ,2 ,1 ,1 ,1 ,2 ,4 ,7 ,11 ,15 ,19 ,21 ,22 ,21 ,19 ,17 ,15 ,12 ,10 ,8 ,7 },
				 {0 ,8 ,6 ,5 ,4 ,3 ,2 ,1 ,1 ,2 ,3 ,4 ,6 ,10 ,14 ,20 ,24 ,28 ,30 ,29 ,25 ,30 ,16 ,11 ,10 },
				 {0 ,9 ,7 ,5 ,4 ,3 ,2 ,2 ,2 ,2 ,3 ,4 ,6 ,8 ,11 ,16 ,22 ,27 ,32 ,33 ,30 ,24 ,19 ,15 ,12 },
				 {0 ,8 ,6 ,4 ,3 ,2 ,2 ,1 ,1 ,2 ,3 ,4 ,6 ,7 ,9 ,12 ,15 ,19 ,24 ,26 ,24 ,20 ,16 ,12 ,10 },
				 //-------------------------
				 {0 ,2 ,1 ,0 ,0 ,0 ,1 ,4 ,5 ,5 ,7 ,8 ,10 ,12 ,13 ,13 ,14 ,14 ,15 ,12 ,8 ,6 ,5 ,4 ,3 },
				 {0 ,2 ,1 ,1 ,0 ,0 ,5 ,15 ,20 ,22 ,20 ,16 ,15 ,15 ,15 ,15 ,15 ,14 ,12 ,10 ,8 ,6 ,5 ,4 ,3 },
				 {0 ,2 ,1 ,1 ,0 ,0 ,6 ,17 ,26 ,30 ,31 ,28 ,22 ,19 ,17 ,17 ,16 ,15 ,13 ,11 ,8 ,6 ,5 ,4 ,3 },
				 {0 ,2 ,1 ,1 ,0 ,0 ,3 ,10 ,18 ,24 ,27 ,28 ,27 ,23 ,20 ,18 ,16 ,15 ,13 ,11 ,8 ,6 ,5 ,4 ,3, },
				 {0 ,2 ,1 ,1 ,0 ,0 ,0 ,1 ,3 ,7 ,12 ,17 ,22 ,25 ,26 ,24 ,21 ,17 ,14 ,11 ,8 ,6 ,5 ,4 ,3 },
				 {0 ,3 ,2 ,2 ,1 ,0 ,0 ,1 ,3 ,4 ,6 ,9 ,14 ,21 ,28 ,33 ,35 ,34 ,29 ,20 ,13 ,10 ,7 ,6 ,4 },
				 {0 ,4 ,3 ,2 ,1 ,1 ,1 ,1 ,3 ,5 ,6 ,8 ,10 ,15 ,23 ,31 ,37 ,40 ,37 ,21 ,16 ,11 ,8 ,6 ,5 },
				 {0 ,3 ,2 ,1 ,1 ,0 ,0 ,1 ,3 ,4 ,6 ,8 ,10 ,12 ,15 ,20 ,26 ,31 ,31 ,23 ,14 ,10 ,7 ,5 ,4 },
				  
				 
				 };
		 // table 9-7 --------------------------------
//		 ,"Feb.","Mar.","Apr.","Jun.","Jul.","Sep.","Oct.","Nov.","Dec."
		 Map<String,Integer> C_9_7=new  HashMap<String,Integer>(); 
		 C_9_7.put("Jan.",0);
		 C_9_7.put("Feb.",1);
		 C_9_7.put("Mar.",2);
		 C_9_7.put("Apr.",3);
		 C_9_7.put("Maj.",4);
		 C_9_7.put("Jun.",5);
		 C_9_7.put("Jul.",6);
		 C_9_7.put("Aug.",7);
		 C_9_7.put("Sep.",8);
		 C_9_7.put("Oct.",9);
		 C_9_7.put("Nov.",10);
		 C_9_7.put("Dec.",11);
		 double Table_9_7[][]= {
				 {76 ,85 ,101 ,114 ,120 ,139 ,126 ,217 ,104 ,88 ,76 ,69},
				 {76 ,85 ,117 ,252 ,250 ,285 ,250 ,249 ,110 ,88 ,76 ,69},
				 {91 ,205 ,338 ,461 ,536 ,555 ,527 ,445 ,325 ,199 ,91 ,69},
				 {331 ,470 ,577 ,631 ,656 ,656 ,643 ,615 ,546 ,451 ,325 ,265 },
				 {552 ,647 ,716 ,716 ,694 ,675 ,678 ,691 ,678 ,615 ,546 ,551 },
				 {722 ,764 ,748 ,691 ,628 ,596 ,612 ,663 ,716 ,738 ,710 ,688 },
				 {786 ,782 ,716 ,590 ,489 ,439 ,473 ,571 ,688 ,754 ,733 ,776},
				 {789 ,732 ,615 ,445 ,213 ,262 ,303 ,429 ,596 ,710 ,776 ,795 },
				 {776 ,697 ,555 ,363 ,233 ,189 ,227 ,250 ,540 ,678 ,767 ,795},
				 {555 ,685 ,795 ,855 ,874 ,871 ,861 ,836 ,770 ,672 ,552 ,498 },
		 };
		 //table 9-8 ------------------------- 
		 Map<String,Integer> map = new HashMap<String,Integer>();
		  
		 Hash<String,String,Map<String,Integer>> R_9_8 = new Hash<String,String,Map<String,Integer>>();
		 
		 map = new HashMap<String,Integer>();
		 map.put("3",0);
		 map.put("6",1);
		 map.put("10",2);
		 map.put("12",3); 
		 R_9_8.put("Single Glass","Clear",map);
		 map = new HashMap<String,Integer>();
		 map.put("3",4);
		 map.put("6",5);
		 map.put("10",6);
		 map.put("12",7);
		 R_9_8.put("Single Glass","Haet absorbing",map);
		 map = new HashMap<String,Integer>();
		 map.put("3",8);
		 R_9_8.put( "Double Glass","Regular",map);
		 map = new HashMap<String,Integer>();
		 map.put("6",9);
		 R_9_8.put( "Double Glass","palte",map);
		 map = new HashMap<String,Integer>();
		 map.put("6",10);
		 R_9_8.put( "Double Glass","Reflective",map);
		 map = new HashMap<String,Integer>();
		 map.put("3",11);
		 map.put("6",12);
		 R_9_8.put( "Insulating Glass","Clear",map);
		 map = new HashMap<String,Integer>();
		 map.put("6",13);
		 R_9_8.put( "Insulating Glass","Haet absorbing",map);
 
		 Map<String,Integer> H_9_8 = new HashMap<String,Integer>();
		 H_9_8.put("h=22.7",0);
		 H_9_8.put("h=17.0",1);
		 double Table_9_8[][]= {
				 {1.00 ,1.00},
				 {0.94 ,0.95 },
				 {0.90 ,0.92 },
				 {0.87 ,0.88 },
				 {0.83 ,0.85 },
				 {0.68 ,0.73 },
				 {0.60 ,0.64 },
				 {0.53 ,0.58 },
				 {0.90 ,0 },
				 {0.83 ,0 },
				 {0.40 ,0 },
				 {0.88 ,0.88 },
				 {0.81 ,0.82 },
				 {0.55 ,0.58 },
				 };
		 
		 
		 //table 9-9 ----------------------------------------
		 Hash<String,String,Integer> C_9_9 = new Hash<String,String,Integer>();
		 C_9_9.put( "Venetian Blinds","Medium",0);
		 C_9_9.put( "Venetian Blinds","Light",1);
		 C_9_9.put( "Roller Shade","Dark",2);
		 C_9_9.put( "Roller Shade","White",3);
		 C_9_9.put( "Roller Shade","Light",4);
		 double Table_9_9[][]={
			 {0 ,0 ,0 ,0 ,0},
			 {0 ,0 ,0 ,0 ,0},
			 {0.64 ,0.55 ,0.59 ,0.25 ,0.39},
			 {0 ,0 ,0 ,0 ,0},
			 {0 ,0 ,0 ,0 ,0},
			 {0.57 ,0.53 ,0.45 ,0.30 ,0.36},
			 {0 ,0 ,0 ,0 ,0},
			 {0.54 ,0.52 ,0.42 ,0.82 ,0.32},
			 {0.42 ,0.40 ,0.36 ,0.28 ,0.31},
			 {0.30 ,0.25 ,0.23 ,0 ,0},
			 {0.57 ,0.51 ,0.60 ,0.25 ,0},
			 {0.57 ,0.51 ,0.60 ,0.25 ,0}, 
			 {0.20 ,0 ,0 ,0 ,0},
			 {0.57 ,0.51 ,0.60 ,0.25 ,0.37},
			 {0.39 ,0.39 ,0.36 ,0.22 ,0.30}, 
			 {0.20 ,0.19 ,0.18 ,0 ,0},
			 };
		  
		 //table 9-10 ----------------------------------------
		 double Table_9_10[][]={
				 {0.17 ,0.24 ,0.11 ,0.09 ,0.08 ,0.33 ,0.24 ,0.48 ,0. ,0.56 ,0.61 ,0.71 ,0.76 ,0.82 ,0.82 ,0.79 ,0.75},
				 {0.23 ,0.20 ,0.18 ,0.16 ,0.14 ,0.34 ,0.14 ,0.46 ,0.53 ,0.59 ,0.65 ,0.70 ,0.73 ,0.75 ,0.76 ,0.74 ,0.75},
				 {0.25 ,0.23 ,0.21 ,0.20 ,0.19 ,0.38 ,0.45 ,0.49 ,0.55 ,0.60 ,0.65 ,0.69 ,0.72 ,0.72 ,0.72 ,0.70 ,0.70},
				 //---------
				 {0.06 ,0.05 ,0.04 ,0.03 ,0.03 ,0.26 ,0.43 ,0.47 ,0.44 ,0.41 ,0.40 ,0.39 ,0.39 ,0.38 ,0.36 ,0.33 ,0.30 },
				 {0.09 ,0.08 ,0.07 ,0.06 ,0.06 ,0.24 ,0.38 ,0.42 ,0.39 ,0.37 ,0.37 ,0.36 ,0.36 ,0.36 ,0.34 ,0.33 ,0.30 },
				 {0.11 ,0.10 ,0.09 ,0.09 ,0.08 ,0.26 ,0.39 ,0.42 ,0.39 ,0.36 ,0.35 ,0.34 ,0.34 ,0.33 ,0.32 ,0.31 ,0.28 },
				 //------------------
				 {0.04 ,0.04 ,0.03 ,0.02 ,0.02 ,0.23 ,0.41 ,0.51 ,0.51 ,0.45 ,0.39 ,0.36 ,0.33 ,0.31 ,0.28 ,0.26 ,0.23},
				 {0.07 ,0.06 ,0.06 ,0.05 ,0.04 ,0.21 ,0.36 ,0.44 ,0.45 ,0.40 ,0.36 ,0.33 ,0.31 ,0.30 ,0.28 ,0.26 ,0.24},
				 {0.09 ,0.08 ,0.08 ,0.07 ,0.07 ,0.23 ,0.37 ,0.44 ,0.44 ,0.39 ,0.34 ,0.31 ,0.29 ,0.27 ,0.26 ,0.24 ,0.22},
				 //------------------
				 {0.04 ,0.03 ,0.03 ,0.02 ,0.02 ,0.19 ,0.37 ,0.51 ,0.57 ,0.57 ,0.50 ,0.42 ,0.37 ,0.32 ,0.29 ,0.25 ,0.22},
				 {0.07 ,0.06 ,0.06 ,0.05 ,0.05 ,0.18 ,0.33 ,0.44 ,0.50 ,0.51 ,0.46 ,0.39 ,0.35 ,0.31 ,0.29 ,0.26 ,0.23},
				 {0.09 ,0.09 ,0.08 ,0.08 ,0.07 ,0.20 ,0.34 ,0.45 ,0.49 ,0.49 ,0.43 ,0.39 ,0.32 ,0.29 ,0.26 ,0.24 ,0.22 },
				 //------------------
				 {0.04 ,0.03 ,0.03 ,0.02 ,0.02 ,0.19 ,0.37 ,0.51 ,0.57 ,0.57 ,0.50 ,0.42 ,0.37 ,0.32 ,0.29 ,0.25 ,0.22},
				 {0.07 ,0.06 ,0.06 ,0.05 ,0.05 ,0.18 ,0.33 ,0.44 ,0.50 ,0.51 ,0.46 ,0.39 ,0.35 ,0.31 ,0.29 ,0.26 ,0.23},
				 {0.09 ,0.09 ,0.08 ,0.08 ,0.07 ,0.20 ,0.34 ,0.45 ,0.49 ,0.49 ,0.43 ,0.39 ,0.32 ,0.29 ,0.26 ,0.24 ,0.22},
				 //------------------
				 {0.05 ,0.04 ,0.03 ,0.03 ,0.02 ,0.17 ,0.34 ,0.49 ,0.58 ,0.61 ,0.57 ,0.48 ,0.41 ,0.36 ,0.32 ,0.28 ,0.24 },
				 {0.08 ,0.07 ,0.06 ,0.05 ,0.05 ,0.16 ,0.31 ,0.43 ,0.51 ,0.54 ,0.51 ,0.44 ,0.39 ,0.35 ,0.32 ,0.29 ,0.26},
				 {0.10 ,0.09 ,0.09 ,0.08 ,0.08 ,0.19 ,0.32 ,0.43 ,0.50 ,0.52 ,0.49 ,0.41 ,0.36 ,0.32 ,0.29 ,0.26 ,0.24},
				 //------------------
				 {0.05 ,0.04 ,0.04 ,0.03 ,0.03 ,0.13 ,0.28 ,0.43 ,0.55 ,0.62 ,0.63 ,0.57 ,0.48 ,0.42 ,0.37 ,0.33 ,0.28},
				 {0.09 ,0.08 ,0.07 ,0.06 ,0.05 ,0.14 ,0.26 ,0.38 ,0.48 ,0.54 ,0.56 ,0.51 ,0.45 ,0.40 ,0.36 ,0.33 ,0.29},
				 {0.11 ,0.10 ,0.10 ,0.09 ,0.08 ,0.17 ,0.28 ,0.40 ,0.49 ,0.53 ,0.53 ,0.48 ,0.41 ,0.36 ,0.33 ,0.30 ,0.27},
				 //------------------
				 {0.07 ,0.05 ,0.04 ,0.04 ,0.03 ,0.06 ,0.15 ,0.29 ,0.43 ,0.55 ,0.63 ,0.64 ,0.60 ,0.25 ,0.45 ,0.40 ,0.35},
				 {0.11 ,0.09 ,0.08 ,0.07 ,0.06 ,0.08 ,0.16 ,0.26 ,0.28 ,0.58 ,0.55 ,0.57 ,0.54 ,0.48 ,0.43 ,0.39 ,0.35},
				 {0.12 ,0.11 ,0.11 ,0.10 ,0.09 ,0.12 ,0.19 ,0.29 ,0.40 ,0.49 ,0.54 ,0.55 ,0.51 ,0.44 ,0.39 ,0.35 ,0.31},
				 //------------------
				 {0.08 ,0.07 ,0.05 ,0.04 ,0.04 ,0.06 ,0.09 ,0.14 ,0.22 ,0.34 ,0.48 ,0.59 ,0.65 ,0.65 ,0.59 ,0.50 ,0.43},
				 {0.12 ,0.11 ,0.09 ,0.08 ,0.07 ,0.08 ,0.11 ,0.14 ,0.21 ,0.31 ,0.42 ,0.52 ,0.57 ,0.58 ,0.53 ,0.47 ,0.41},
				 {0.13 ,0.12 ,0.12 ,0.11 ,0.10 ,0.11 ,0.14 ,0.17 ,0.24 ,0.33 ,0.43 ,0.51 ,0.56 ,0.55 ,0.50 ,0.43 ,0.37},
				 //------------------
				 {0.10 ,0.08 ,0.07 ,0.06 ,0.05 ,0.06 ,0.09 ,0.11 ,0.15 ,0.19 ,0.27 ,0.39 ,0.52 ,0.62 ,0.67 ,0.65 ,0.58},
				 {0.14 ,0.12 ,0.11 ,0.09 ,0.08 ,0.09 ,0.11 ,0.13 ,0.15 ,0.18 ,0.25 ,0.35 ,0.46 ,0.55 ,0.59 ,0.59 ,0.53},
				 {0.15 ,0.14 ,0.13 ,0.12 ,0.11 ,0.12 ,0.14 ,0.16 ,0.18 ,0.21 ,0.27 ,0.37 ,0.46 ,0.53 ,0.57 ,0.55 ,0.49},
				 //------------------
				 {0.12 ,0.10 ,0.08 ,0.06 ,0.05 ,0.06 ,0.08 ,0.10 ,0.12 ,0.14 ,0.16 ,0.24 ,0.36 ,0.49 ,0.60 ,0.66 ,0.66},
				 {0.15 ,0.14 ,0.12 ,0.10 ,0.09 ,0.09 ,0.10 ,0.12 ,0.13 ,0.15 ,0.17 ,0.23 ,0.33 ,0.44 ,0.53 ,0.58 ,0.59},
				 {0.15 ,0.14 ,0.13 ,0.12 ,0.11 ,0.12 ,0.13 ,0.14 ,0.16 ,0.17 ,0.19 ,0.25 ,0.34 ,0.44 ,0.52 ,0.56 ,0.56},
				 //------------------
				 {0.12 ,0.10 ,0.08 ,0.07 ,0.05 ,0.06 ,0.07 ,0.09 ,0.10 ,0.12 ,0.13 ,0.17 ,0.26 ,0.40 ,0.52 ,0.62 ,0.66},
				 {0.15 ,0.13 ,0.12 ,0.10 ,0.09 ,0.09 ,0.10 ,0.11 ,0.12 ,0.13 ,0.14 ,0.17 ,0.24 ,0.35 ,0.46 ,0.54 ,0.58},
				 {0.15 ,0.14 ,0.13 ,0.12 ,0.11 ,0.11 ,0.12 ,0.13 ,0.14 ,0.15 ,0.16 ,0.19 ,0.26 ,0.36 ,0.46 ,0.53 ,0.56},
				 //------------------
				 {0.12 ,0.10 ,0.08 ,0.06 ,0.05 ,0.06 ,0.07 ,0.08 ,0.10 ,0.11 ,0.12 ,0.14 ,0.20 ,0.32 ,0.45 ,0.57 ,0.64},
				 {0.15 ,0.13 ,0.11 ,0.10 ,0.09 ,0.09 ,0.09 ,0.10 ,0.11 ,0.12 ,0.13 ,0.14 ,0.19 ,0.29 ,0.40 ,0.40 ,0.54},
				 {0.14 ,0.13 ,0.12 ,0.11 ,0.10 ,0.11 ,0.12 ,0.13 ,0.14 ,0.14 ,0.15 ,0.16 ,0.21 ,0.30 ,0.40 ,0.49 ,0.54 },
				 //------------------
				 {0.12 ,0.10 ,0.08 ,0.06 ,0.05 ,0.06 ,0.07 ,0.09 ,0.10 ,0.12 ,0.13 ,0.15 ,0.17 ,0.26 ,0.40 ,0.53 ,0.63},
				 {0.15 ,0.13 ,0.11 ,0.10 ,0.09 ,0.09 ,0.10 ,0.11 ,0.12 ,0.11 ,0.14 ,0.15 ,0.17 ,0.24 ,0.35 ,0.47 ,0.55},
				 {0.14 ,0.13 ,0.12 ,0.11 ,0.10 ,0.11 ,0.12 ,0.13 ,0.14 ,0.15 ,0.16 ,0.17 ,0.18 ,0.25 ,0.36 ,0.46 ,0.53},
				 //------------------
				 {0.11 ,0.09 ,0.08 ,0.06 ,0.05 ,0.06 ,0.08 ,0.10 ,0.12 ,0.14 ,0.16 ,0.17 ,0.19 ,0.23 ,0.33 ,0.47 ,0.59 },
				 {0.14 ,0.12 ,0.11 ,0.09 ,0.08 ,0.09 ,0.10 ,0.11 ,0.13 ,0.14 ,0.16 ,0.17 ,0.18 ,0.21 ,0.30 ,0.42 ,0.51 },
				 {0.14 ,0.12 ,0.11 ,0.10 ,0.10 ,0.10 ,0.12 ,0.13 ,0.15 ,0.16 ,0.18 ,0.18 ,0.19 ,0.22 ,0.30 ,0.41 ,0.50 },
				 //------------------
				 {0.12 ,0.09 ,0.08 ,0.06 ,0.05 ,0.07 ,0.11 ,0.14 ,0.18 ,0.22 ,0.25 ,0.27 ,0.29 ,0.30 ,0.33 ,0.44 ,0.57},
				 {0.15 ,0.13 ,0.11 ,0.10 ,0.09 ,0.10 ,0.12 ,0.15 ,0.18 ,0.21 ,0.23 ,0.26 ,0.27 ,0.28 ,0.31 ,0.39 ,0.51},
				 {0.14 ,0.13 ,0.12 ,0.11 ,0.10 ,0.12 ,0.15 ,0.17 ,0.20 ,0.23 ,0.25 ,0.26 ,0.28 ,0.28 ,0.31 ,0.38 ,0.49},
				 //------------------
				 {0.11 ,0.09 ,0.07 ,0.06 ,0.05 ,0.07 ,0.14 ,0.24 ,0.16 ,0.48 ,0.58 ,0.66 ,0.72 ,0.74 ,0.73 ,0.67 ,0.59},
				 {0.16 ,0.14 ,0.12 ,0.11 ,0.11 ,0.11 ,0.16 ,0.24 ,0.23 ,0.43 ,0.52 ,0.59 ,0.64 ,0.67 ,0.66 ,0.62 ,0.56},
				 {0.17 ,0.16 ,0.15 ,0.14 ,0.13 ,0.15 ,0.20 ,0.28 ,0.26 ,0.46 ,0.52 ,0.59 ,0.62 ,0.64 ,0.62 ,0.58 ,0.51},
				 
				 };
		 //table 9-11 ----------------------------------------
		 double Table_9_11[][]={
				 {0 ,0 ,0 ,0 ,0},
				 };
		 
		JLabel lblNewLabel = new JLabel("Solar time");
		lblNewLabel.setBounds(10, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel);
		
		Solar_time = new JTextField();
		Solar_time.setBounds(10, 36, 140, 20);
		frame.getContentPane().add(Solar_time);
		Solar_time.setColumns(10);
		
		JLabel lblRootDescript = new JLabel("Root Descript");
		lblRootDescript.setBounds(10, 73, 140, 14);
		frame.getContentPane().add(lblRootDescript);
		
		JComboBox without_with = new JComboBox(new String[] {"without suspended","with suspended" });
		without_with.addPopupMenuListener( listener );
		without_with.setPrototypeDisplayValue("ItemWWW");
		without_with.setBounds(10, 132, 140, 22);
		frame.getContentPane().add(without_with);
		       
		
		JComboBox Root_Descript = new JComboBox(new String[] {
				"steel sheet with 25.4mm(or 50.8mm) insulation",
				"25-mm wood with 25.4 mm insulation",
				"50.8 mm H.W concrete 25.4 mm insultion",
				"25.4 mm wood with 50.8 insultion",
				"152.4 mm L.W concrete",
				"63.5 mm wood with 25.4 mm insulation" ,
				"203.4 mm L.W concrete", 
				"101.6 mm H.W concrete with 25.4mm(or 50.8mm) insulation" ,
				"63.5 mm wood with 50.8 insultion" ,
				"Roof terrace system" ,
				"152.4 mm H.W concrete with 25.4mm(or 50.8mm) insulation" ,
				"101.6.5 mm wood with 25.4mm (or 50.8mm)  insultion"
				});
		Root_Descript.addPopupMenuListener( listener );
		Root_Descript.setPrototypeDisplayValue("ItemWWW");
		Root_Descript.setBounds(10, 98, 140, 22);
		frame.getContentPane().add(Root_Descript);
		
		JLabel lblLat = new JLabel("Lat");
		lblLat.setBounds(10, 165, 140, 14);
		frame.getContentPane().add(lblLat);
		
		JComboBox Lat = new JComboBox(new String []{"16","24","32","40","48"});
		Lat.setBounds(10, 181, 140, 22);
		frame.getContentPane().add(Lat);
		
		JLabel lblMonth = new JLabel("month");
		lblMonth.setBounds(10, 214, 140, 14);
		frame.getContentPane().add(lblMonth);
		 
		JComboBox month = new JComboBox(new String []{
		  "December",
		  "Jan./Nov",
		  "Feb./Oct",
		  "mar./Sept",
		  "Apr./Aug",
		  "May/July",
		  "June"		
				
				});
		month.setBounds(10, 236, 140, 22);
		frame.getContentPane().add(month);
		
		JComboBox SNWE = new JComboBox(new String []{
				"N",
				"NNE  NNW",
				"NE  NW",
				"ENE  WNW",
				"E  W",
				"ESE  WSW",
				"SE  SW",
				"SSW  SSW",
				"S",
				"Horizontal Roofs"			
				
				});
		SNWE.setBounds(10, 269, 140, 22);
		frame.getContentPane().add(SNWE);
		
		Aceiling = new JTextField();
		Aceiling.setBounds(10, 333, 140, 20);
		frame.getContentPane().add(Aceiling);
		Aceiling.setColumns(10);
		
		JLabel lblAceiling = new JLabel("Aceiling");
		lblAceiling.setBounds(10, 307, 140, 14);
		frame.getContentPane().add(lblAceiling);
		
		JComboBox color = new JComboBox( new String [] {
				"dark color", "ligth color"
		});
		color.setBounds(10, 364, 140, 22);
		frame.getContentPane().add(color);
		
		
		JLabel lblTiT = new JLabel("Ti  , T0");
		lblTiT.setBounds(10, 404, 140, 14);
		frame.getContentPane().add(lblTiT);
		
		Ti_T0 = new JTextField();
		Ti_T0.setBounds(10, 435, 140, 20);
		frame.getContentPane().add(Ti_T0);
		Ti_T0.setColumns(10);
		
		JLabel aaa = new JLabel("Qcooling_ceiling");
		aaa.setBounds(817, 11, 140, 14);
		frame.getContentPane().add(aaa);
		
		Qcooling_ceiling = new JTextField();
		Qcooling_ceiling.setBounds(817, 36, 140, 20);
		frame.getContentPane().add(Qcooling_ceiling);
		Qcooling_ceiling.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Qcooling-wall");
		lblNewLabel_1.setBounds(817, 73, 140, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		Qcooling_wall = new JTextField();
		Qcooling_wall.setBounds(817, 99, 140, 20);
		frame.getContentPane().add(Qcooling_wall);
		Qcooling_wall.setColumns(10);
		
		JComboBox color_wall = new JComboBox(new String[] {"ligth wall color","medaim wall color","dark wall color"});
		color_wall.setBounds(220, 7, 140, 22);
		frame.getContentPane().add(color_wall);
		
		JComboBox North_Latitude_Wall = new JComboBox(new String [] {"N","NE","E","SE","S","SW","W","NW"});
		North_Latitude_Wall.setBounds(220, 69, 140, 22);
		frame.getContentPane().add(North_Latitude_Wall);
		
		JComboBox Wall_Group = new JComboBox(new String[] {"Group A","Group B","Group C","Group D","Group E","Group F","Group G"});
		Wall_Group.setBounds(220, 132, 140, 22);
		frame.getContentPane().add(Wall_Group);
		
		JLabel lblNorthLatitudeWall = new JLabel("North Latitude Wall Facting");
		lblNorthLatitudeWall.setBounds(220, 39, 157, 14);
		frame.getContentPane().add(lblNorthLatitudeWall);
		
		JLabel lblNewLabel_2 = new JLabel("Wall Group");
		lblNewLabel_2.setBounds(220, 102, 140, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AGlass");
		lblNewLabel_3.setBounds(220, 185, 140, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		AGlass = new JTextField();
		AGlass.setBounds(220, 211, 140, 20);
		frame.getContentPane().add(AGlass);
		AGlass.setColumns(10);
		
		JLabel lblQtransThrongGlass = new JLabel("Q.trans throng glass");
		lblQtransThrongGlass.setBounds(817, 136, 140, 14);
		frame.getContentPane().add(lblQtransThrongGlass);
		
		Qtrans_throng_glass = new JTextField();
		Qtrans_throng_glass.setBounds(817, 162, 140, 20);
		frame.getContentPane().add(Qtrans_throng_glass);
		Qtrans_throng_glass.setColumns(10);
		
		JLabel lblGlassDirection = new JLabel("Glass direction");
		lblGlassDirection.setBounds(220, 242, 140, 14);
		frame.getContentPane().add(lblGlassDirection);
		
		JComboBox Glass_direction = new JComboBox(new String[] {"Jan.","Feb.","Mar.","Apr.","Maj","Jun.","Jul.","Aug.","Sep.","Oct.","Nov.","Dec."});
		Glass_direction.setBounds(220, 269, 140, 22);
		frame.getContentPane().add(Glass_direction);
		

		JComboBox  Galss = new JComboBox(new String[] {"Single Glass","Double Glass","Insulating Glass"});
		 Galss.setBounds(220, 396, 140, 22);
		frame.getContentPane().add( Galss);
				
		JComboBox Type_Galss = new JComboBox(new String [] {
				"Clear" ,"Haet absorbing","Regular","palte","Reflective"});
		Type_Galss.setBounds(220, 364, 140, 22);
		frame.getContentPane().add(Type_Galss);
		
		JLabel lblTypeGalss = new JLabel("Type Galss");
		lblTypeGalss.setBounds(220, 339, 140, 14);
		frame.getContentPane().add(lblTypeGalss);
		
		JComboBox Glass_with = new JComboBox(new String [] {"Glass with no Shading","Glass with Shading"});
		Glass_with.setBounds(220, 303, 140, 22);
		frame.getContentPane().add(Glass_with);
		
		JLabel lblNormailThickness = new JLabel("Normail Thickness");
		lblNormailThickness.setBounds(220, 438, 140, 14);
		frame.getContentPane().add(lblNormailThickness);
		
		JComboBox Normail_Thickness = new JComboBox(new String [] {"3","6","10","12"});
		Normail_Thickness.setBounds(220, 470, 140, 22);
		frame.getContentPane().add(Normail_Thickness);
		
		JComboBox Shading_Conefficient = new JComboBox(new String [] {"h=22.7","h=17.0"});
		Shading_Conefficient.setBounds(220, 528, 140, 22);
		frame.getContentPane().add(Shading_Conefficient);
		
		JLabel lblShadingConefficient = new JLabel("Shading Conefficient");
		lblShadingConefficient.setBounds(220, 503, 140, 14);
		frame.getContentPane().add(lblShadingConefficient);
		
		JLabel lblTypeGlass = new JLabel("Type Glass");
		lblTypeGlass.setBounds(435, 11, 140, 14);
		frame.getContentPane().add(lblTypeGlass);
		
		JComboBox Type_Glass2 = new JComboBox(new String[] {
				"Clear, regular",
				"Claar, plate",
				"Clear pattern",
				"Heat Abosrbing",
				"Pattern or Tinted(gray sheet)",
				"Heat Abosrbing plate",
				"Pattern or Tinted, gray sheet",
				"Heat Abosrbing plate or Pattern Heat Abosrbing",
				"Heat Abosrbing or Pattern",
				"Reflective Coated Glass",
				"Regular",
				"Plate",
				"Reflective",
				"Clear",
				"Heat Abosrbing",
                "Reflective Coated"
				
				});
		Type_Glass2.setBounds(435, 35, 140, 22);
		frame.getContentPane().add(Type_Glass2);
		
		Normail_Thickness2 = new JTextField();
		Normail_Thickness2.setBounds(435, 99, 140, 20);
		frame.getContentPane().add(Normail_Thickness2);
		Normail_Thickness2.setColumns(10);
		
		JLabel label = new JLabel("Normail Thickness");
		label.setBounds(435, 73, 140, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_4 = new JLabel("type of Shading");
		lblNewLabel_4.setBounds(435, 136, 140, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox type_shading = new JComboBox(new String[] {"Venetian Blinds","Roller Shade"});
		type_shading.setBounds(435, 161, 140, 22);
		frame.getContentPane().add(type_shading);
		
		JComboBox MLDW = new JComboBox(new String[] {"Medium","Light","Dark","White"});
		MLDW.setBounds(435, 210, 140, 22);
		frame.getContentPane().add(MLDW);
		
		
		JButton btnNewButton = new JButton("Calculation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1 -----------------------------------------------------
				
				// ضل علي امرر Uceiling 
				double Uceiling=0 , aceiling=0 , C_Tb_cor_c=0 ,  C_Tb=0  , LM=0  , k=0  ,Ti=0 ,T0=0;
				double qcooling_ceiling=0;
				int No_C,No_R,solar_time=0;

				
				 No_R= R_9_2.get(String.valueOf( without_with.getSelectedItem()),String.valueOf( Root_Descript.getSelectedItem()));
				C_Tb=Table_9_1[No_R][Integer.valueOf(Solar_time.getText())];
				
				 No_R= R_9_2.get(String.valueOf( Lat.getSelectedItem()),String.valueOf( month.getSelectedItem()));
			    LM=Table_9_2[No_R][H_9_2.get(SNWE.getSelectedItem())];
			    
			    aceiling=Double.valueOf( Aceiling.getText());
			    if (color.getSelectedItem().equals("dark color"))
			    	k=1;
			    else
			    	k=0.5;
			    
			   
			    String  DT[]=Ti_T0.getText().split("[, ]+");
			    Ti=Double.valueOf(DT[0]);
			    T0=Double.valueOf(DT[1]);
			    
			    C_Tb_cor_c= (C_Tb+LM)*k+(25.5 - Ti) + (T0-29.4);
				qcooling_ceiling=Uceiling*aceiling*C_Tb_cor_c;
				Qcooling_ceiling.setText(String.valueOf(qcooling_ceiling)  );
				//2 -----------------------------------------------------
				double qcooling_wall=0 , Uwan=0 , Awan=0 , C_Tb_cor_W=0 ,  C_Tb_W=0  ,    k2=0  ;
			 	 
				C_Tb_W=R_9_4.get(String.valueOf(Wall_Group.getSelectedItem()),String.valueOf( North_Latitude_Wall.getSelectedItem()));
				 
				
				if (color_wall.getSelectedItem().equals("ligth wall color") || color_wall.getSelectedItem().equals("dark wall color") )
			    	k2=0.65;
			    else if (color_wall.getSelectedItem().equals("medaim wall color"))
			    	k2=0.83;
			  
				C_Tb_cor_W=(C_Tb_W+LM)*k2+(25.5 - Ti) + (T0-29.4);
				qcooling_wall=Uwan*Awan*C_Tb_cor_W;
				Qcooling_wall.setText(String.valueOf(qcooling_wall)  );
				//3 -----------------------------------------------------
				double qtrans_throng_glass=0 , aglass=0 , SHG=0 , SC=0 ,  CH=0 ,Normail ;
				Normail=Double.valueOf( Normail_Thickness2.getText());
				
				No_C=C_9_7.get( String.valueOf(Glass_direction.getSelectedItem()));
				No_R=H_9_2.get( String.valueOf(SNWE.getSelectedItem()));
				SHG=Table_9_7[No_R][No_C ];
				 
                if (Glass_with.getSelectedItem().equals("Glass with no Shading" )) {
                	No_C=H_9_8.get( Shading_Conefficient.getSelectedItem());
                	No_R=R_9_8.get(String.valueOf( Galss.getSelectedItem() ),String.valueOf( Type_Galss.getSelectedItem())).get(Normail_Thickness.getSelectedItem());
                	SC=Table_9_8[No_R][No_C];
                }else {
                  
            		   				 
                	if(Type_Glass2.getSelectedItem().equals("Clear, regular") &&
                			Galss.getSelectedItem().equals("Single Glass")&& 2.5<=Normail && 6.0>Normail ) No_R=0;
                	
                	else if(Type_Glass2.getSelectedItem().equals("Claar, plate")
                			&& Galss.getSelectedItem().equals("Single Glass")&& 6.0<=Normail && 12.0>Normail)No_R=1;
                	
                   	else if(Type_Glass2.getSelectedItem().equals("Heat Abosrbing")
                   			&& Galss.getSelectedItem().equals("Single Glass")&& 3.0==Normail)No_R=3;
                	
                    else if(Type_Glass2.getSelectedItem().equals("Pattern or Tinted(gray sheet)")
                    		&& Galss.getSelectedItem().equals("Single Glass")&& 5.0<=Normail && 5.5>Normail)No_R=4;
                	
                    else if(Type_Glass2.getSelectedItem().equals("Heat Abosrbing plate")
                    		&& Galss.getSelectedItem().equals("Single Glass")&& 5.0<=Normail && 6.0>Normail)No_R=5;
                	
                    else if(Type_Glass2.getSelectedItem().equals("Pattern or Tinted, gray sheet")
                    		&& Galss.getSelectedItem().equals("Single Glass")&& 3.0<Normail && 5.5>Normail)No_R=6;
                	
                   	else if(Type_Glass2.getSelectedItem().equals("Heat Abosrbing plate or Pattern Heat Abosrbing")
                   			&& Galss.getSelectedItem().equals("Single Glass")&& 10==Normail)No_R=7;
                	
                    else if(Type_Glass2.getSelectedItem().equals("Heat Abosrbing or Pattern")
                    		&& Galss.getSelectedItem().equals("Single Glass"))No_R=8;
                	
                    else if(Type_Glass2.getSelectedItem().equals("Reflective Coated Glass")
                    		&& Galss.getSelectedItem().equals("Single Glass"))No_R=9;
                	
                  	else if(Type_Glass2.getSelectedItem().equals("Regular")
                  			&& Galss.getSelectedItem().equals("Double Glass")&& 3==Normail)No_R=10;
                	
                  	else if(Type_Glass2.getSelectedItem().equals("Plate")
                  			&& Galss.getSelectedItem().equals("Double Glass")&& 6==Normail)No_R=11;
                	
                    else if(Type_Glass2.getSelectedItem().equals("Reflective")&& 
                    		Galss.getSelectedItem().equals("Double Glass")&& 6==Normail)No_R=12;
                    else if(Type_Glass2.getSelectedItem().equals("Clear")
                    		&& Galss.getSelectedItem().equals("Insulating Glass")&& 2.5<=Normail&& 6.0>Normail)No_R=13;
                    else if(Type_Glass2.getSelectedItem().equals("Heat Abosrbing")
                    		&& Galss.getSelectedItem().equals("Insulating Glass")&& 5.0<=Normail&& 6.0>Normail)No_R=14;
                    else if(Type_Glass2.getSelectedItem().equals("Reflective Coated")
                    		&& Galss.getSelectedItem().equals("Insulating Glass"))No_R=15;
                		
                	No_C= C_9_9.get(String.valueOf( type_shading.getSelectedItem()), String.valueOf(MLDW.getSelectedItem()));
                	SC=Table_9_9[No_R][No_C];
                	 
                	}
				
				aglass=Double.valueOf( AGlass.getText());
				qtrans_throng_glass=aglass* SHG * SC * CH;
				Qtrans_throng_glass.setText(String.valueOf(qtrans_throng_glass)  );
				//4 -----------------------------------------------------
				//5 -----------------------------------------------------
				//6 -----------------------------------------------------
				//7 -----------------------------------------------------
				//8 -----------------------------------------------------
				//9 ----------------------------------------------------- 
			}
		
		});
		btnNewButton.setBounds(615, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
	
		
		
		
		
		
		
	
		
		 
		
		
		
		
	
		
		
		
	}
}
