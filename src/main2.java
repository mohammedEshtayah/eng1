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
		 H_9_2.put("NNE  NNW",0); 
		 H_9_2.put("NE  NW",0); 
		 H_9_2.put("ENE  WNW",0); 
		 H_9_2.put("E  W",0);
		 H_9_2.put("ESE  WSW",0);
		 H_9_2.put("SE  SW",0); 
		 H_9_2.put("SSW  SSW",0); 
		 H_9_2.put("S",0);
		 H_9_2.put("Horizontal Roofs",0); 
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
		
		JButton btnNewButton = new JButton("Calculation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1 -----------------------------------------------------
				
				// ضل علي امرر Uceiling 
				double Uceiling=0 , aceiling=0 , C_Tb_cor_c=0 ,  C_Tb=0  , LM=0  , k=0  ,Ti=0 ,T0=0;
				double qcooling_ceiling=0;
				int No_R,solar_time=0;

				
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
				//3 -----------------------------------------------------
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
		
		
		
	}
}
