import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;  
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;


public class main {
 
	private JFrame frame;
	private JTextField a;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JLabel lblNewLabel_7;
	private JTextField textField_6;
	private JLabel lblNewLabel_8;
	private JTextField textField_7;
	private JLabel lblNewLabel_9;
	private JTextField textField_8;
	private JLabel lblNewLabel_10;
	private JTextField textField_9;
	private JLabel lblNewLabel_11;
	private JTextField textField_10;
	private JLabel lblNewLabel_12;
	private JTextField textField_11;
	private JLabel lblNewLabel_13;
	private JTextField textField_12;
	private JLabel lblNewLabel_14;
	private JTextField textField_13;
	private JLabel lblNewLabel_15;
	private JTextField textField_14;
	private JLabel lblNewLabel_16;
	private JTextField textField_15;
	private JLabel lblNewLabel_17;
	private JTextField textField_16;
	private JLabel lblNewLabel_18;
	private JTextField textField_17;
	private JLabel lblNewLabel_19;
	private JTextField textField_18;
	private JLabel lblNewLabel_20;
	private JTextField textField_19;
	private JLabel lblNewLabel_21;
	private JTextField textField_20;
	private JLabel lblNewLabel_22;
	private JTextField textField_21;
	private JLabel lblNewLabel_23;
	private JTextField textField_22;
	private JLabel lblNewLabel_24;
	private JTextField textField_23;
	private JLabel lblNewLabel_25;
	private JTextField textField_24;
	private JLabel lblNewLabel_26;
	private JTextField textField_25;
	private JLabel lblNewLabel_27;
	private JTextField textField_26;
	private JLabel lblNewLabel_28;
	private JTextField textField_27;
	private JLabel lblNewLabel_29;
	private JTextField textField_28;
	private JLabel lblNewLabel_30;
	private JTextField textField_29;
	private JLabel lblNewLabel_31;
	private JTextField textField_30;
	private JLabel lblNewLabel_32;
	private JTextField textField_31;
	private JLabel lblNewLabel_33;
	private JTextField textField_32;
	private JLabel lblNewLabel_34;
	private JTextField textField_33;
	private JLabel lblNewLabel_35;
	private JTextField textField_34;
	private JLabel lblNewLabel_36;
	private JTextField textField_35;
	private JLabel lblNewLabel_37;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
		// table number one rady
		 Map<String, Float> type_room = new Hashtable<>(); 
		 type_room.put("room with no windows or exterior doors",(float)  0.5); 
		 type_room.put("room with no windows or exterior doors on one side only", (float) 1.0); 
		 type_room.put("room with no windows or exterior doors on two side ", (float)1.5); 
		 type_room.put("room with no windows or exterior doors on three sides",(float) 2.0);
		 type_room.put("entrance halls",(float) 2.5);	 
		 type_room.put("Factories machine shops",(float) 1.25);	 
		 type_room.put("recreation rooms assembly room gymanasium",(float) 1.5);	
		 type_room.put("homes apartents offices",(float) 1.5);
		 type_room.put("classrooms dining room lounges hospital rooms kitchens laundries ballrooms bathrooms",(float) 2.0);	
		 type_room.put("stores public buidings",(float) 2.5);	
		 type_room.put("toilets auditorium",(float) 3.0);	
		 
		 //table number 2
		 Map<String, Integer> MC_table2 = new Hashtable<>();
		 MC_table2.put("maximum occupany per 100m^2", 0);
		 MC_table2.put("L/s/person", 1);
		 MC_table2.put("L/s/m^2", 2);
		 
		 
		 Map<String, Integer> MR_table2 = new Hashtable<>(); 
		 MR_table2.put("office space", 0);
		 MR_table2.put("reception areas", 1);
		 MR_table2.put("telecomm centers", 2);
		 MR_table2.put("conference roomse", 3);
		 MR_table2.put("corridors", 4);
		 MR_table2.put("public restrooms", 5);
		 MR_table2.put("locker and dressing rooms", 6);
		 MR_table2.put("smoking lounge", 7);
		 MR_table2.put("elevators", 8);
		 MR_table2.put("commercial laundry", 9);
		 MR_table2.put("commercial dry cleaner", 10);
		 MR_table2.put("coin-operated laundries", 11);
		 MR_table2.put("coin-operated dry cleaner", 12);
		 MR_table2.put("dining rooms", 13);
		 MR_table2.put("cafeteria", 14);
		 MR_table2.put("bars", 15);
		 MR_table2.put("kitchens", 16);
		 MR_table2.put("enclosed parking garage", 17);
		 MR_table2.put("auto repair", 18);
		 MR_table2.put("factories", 19);
		 MR_table2.put("basement and street stores", 20);
		 MR_table2.put("upper floors", 21);
		 MR_table2.put("storage rooms", 22);
		 MR_table2.put("dressing roos", 23);
		 MR_table2.put("malls", 24);
		 MR_table2.put("warehouses", 25);
		 MR_table2.put("smoking lounge", 26);
		 MR_table2.put("barbers", 27);
		 MR_table2.put("beauty saloons", 28);
		 MR_table2.put("reducing saloons", 29);
		 MR_table2.put("florist", 30);
		 MR_table2.put("supermarkets", 31);
		 MR_table2.put("hardware drugs fabrics", 32);
		 MR_table2.put("pet shops", 33);
		 MR_table2.put("furmiture", 34);
		 MR_table2.put("spectator areas", 35);
		
		 // page number 3
		 MR_table2.put("game roome", 36);
		 MR_table2.put("lce arenas", 37);
		 MR_table2.put("swimming pools", 38);
		 MR_table2.put("gymnanum floors", 39);
		 MR_table2.put("ballrooms and discos", 40);
		 MR_table2.put("bowling alleys", 41);
		 MR_table2.put("ticket booths", 42);
		 MR_table2.put("lobbies", 43);
		 MR_table2.put("auditorium", 44);
		 MR_table2.put("stages studios", 45);
		 MR_table2.put("waiting rooms", 46);
		 MR_table2.put("platforms", 47);
		 MR_table2.put("vehicles", 48);
		 MR_table2.put("meat processing", 49);
		 MR_table2.put("photo studios", 50);
		 MR_table2.put("darkrooms", 51);
		 MR_table2.put("pharmacy", 52);
		 MR_table2.put("bank vaults", 53);
		 MR_table2.put("printing duplicating rooms", 54);
		// MR_table2.put("correctional facilities", 55);
		 MR_table2.put("cells", 55);
		 MR_table2.put("dinig halls", 56);
		 MR_table2.put("guard stations", 57);
		 MR_table2.put("classrooms", 58);
		 MR_table2.put("laboratones", 59);
		 MR_table2.put("training shops", 60);
		 MR_table2.put("music rooms", 61);
		 MR_table2.put("libraries", 62);
		 MR_table2.put("locker rooms",63);
		 MR_table2.put("comdors", 64);
		 MR_table2.put("audioeium", 65);
		 MR_table2.put("smoking areas", 66);
		 MR_table2.put("parient rooms", 67);
		 MR_table2.put("medical procedurs areas", 68);
		 MR_table2.put("operating and delivery  room", 69);
		 MR_table2.put("recovery and icu", 70);
		 MR_table2.put("autopsy rooms", 71);
		 MR_table2.put("physical therapy",72);
		 MR_table2.put("living areas and rooms", 73);
		 MR_table2.put("kitchens", 74);
		 //----
		 //page number 4
		 MR_table2.put("bath toilers", 75);
		 MR_table2.put("bedrooms", 76);
		 MR_table2.put("living room", 77);
		 MR_table2.put("bathes", 78);
		 MR_table2.put("lobbies", 79);
		 MR_table2.put("conference rooms", 80);
		 MR_table2.put("assembly rooms", 81);
		 MR_table2.put("dormitory sleeeping areas", 82);
		 MR_table2.put("gambling casinos", 83);
		 
		 
		 double array_tabe2[][]= {
				 {7 , 10 , 7},
				 {60 , 8.0 , 5},
				 {60 , 10 , 0},
				 {50, 10 , 0 },
				 //---
				 {0 , 0 , 0.25 },
				 {100 , 13 , 0 },
				 {50 , 15 , 0 },
				 {70 , 8.0 , 0},
				 {0 , 7.5 , 5},
				 //------
				 {10 , 13 , 0},
			     {30 , 15 , 0},
				 {20 , 8 , 0},
				 {20 , 8 , 0},
				 //---
				 {70 , 10 , 0},
				 {100 , 10 , 0},
				 {100 , 15 , 0},
				 {20 , 8 , 0},
				 //---
				 {0 , 5 , 7.50},
				 {0 , 0 , 7.50},
				 {0 , 0 , 0.80},
				 //---
				 {30 , 7 , 1.50},
				 {20 , 7 , 1},
				 {15 , 7 , 0.75},
				 {20 , 3.5 , 1},
				 {0 , 7 , 1.50 },
				 {5 , 7 , 1},
				 {70 , 30 , 0},
				 //-----
				 {25 , 8 , 0},
				 {25 , 13 , 0},
				 {20 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {0 , 0 , 5},
				 {0 , 0 , 1.50},
				 {100 , 10 , 0},
				 ///page number 3
				 {70 , 10 , 0},
				 {0 , 0 , 2.50},
				 {0 , 0 , 2.5},
				 {30 , 10 , 0},
				 {100 , 10 , 0},
				 {70 , 10 , 0},
				 {60 , 10 , 0},
				 {150 , 10 , 0},
				 {150 , 8 , 0},
				 {70 , 8 , 0},
				 {100 , 8 , 0},
				 {100 , 8 , 0},
				 {150 , 8 , 0},
				 {10 , 8 , 0},
				 {10 , 8 , 0},
				 {10 , 0 , 2.50},
				 {20 , 8 , 0},
				 {5 , 8 , 0},
				 {0 , 0 , 2.50},
				 {20 , 10 , 0},
				 {100 , 8 , 0},
				 {40 , 8 , 0},
				 {50 , 7 , 0},
				 {30 , 10 , 0},
				 {30 , 9 , 0},
				 {50 , 9 , 0},
				 {20 , 2.5 , 0},
				 {0 , 0 , 2.50},
				 {0 , 0 , 0.50},
				 {150 , 8 , 0},
				 {70 , 30 , 0},
				 {10 , 13 , 0},
				 {20 , 10 , 0},
				 {20 , 15 , 0},
				 {20 , 8 , 0},
				 {20 , 30 , 2.50},
				 {20 , 8 , 0},
				 {0 , 7.5 , 5},
				 {0 , 12 , 50},
				 //page number 4
				 {0 , 10 , 0},
				 {0 , 0 , 10},
				 {0 , 0 , 7.5},
				 {0 , 0 , 20},
				 {30 , 5 , 0},
				 {50 , 10 , 0},
				 {120 , 10 , 0},
				 {20 , 8 , 0},
				 {120 , 15 , 0},
				 
		 };
		// System.out.println(array_tabe2[MR_table2.get("gambling casinos")][MC_table2.get("L/s/person")]);
			
		 // table number 3 
		  Map<String,Double> map = new HashMap<String,Double>();
		  
		 Hash<String,String,Map<String,Double>> HR_element = new Hash<String,String,Map<String,Double>>();  
		   map = new HashMap<String,Double>();
		   map.put("construction materials",0.12);
		   HR_element.put("walls" ,"horizonta",map); 
			
		   map = new HashMap<String,Double>();
		   map.put("metals",0.31);
		   HR_element.put("walls" ,"horizonta",map); 
		
		   map = new HashMap<String,Double>();
		   map.put("construction materials",0.10);
		   HR_element.put("callngs and floors ","upward",map); 
		   
		   map = new HashMap<String,Double>();
		   map.put("metals",0.21);
		   HR_element.put("callngs and floors","upward",map); 
		   map = new HashMap<String,Double>();
		   map.put("construction materials",0.15);
		  HR_element.put("callngs and floors","downward",map); 
		 
		 
		// System.out.println( HR_element.get("walls", "horizonta").get("metals"));
	
	 
		 
			
		 //table number 4
		 Hash<String,String,Integer> HR_wind_speed = new Hash<String,String,Integer>();
	 
		 HR_wind_speed.put("walls","construction materials",0); 
		 HR_wind_speed.put("walls","metals",1); 
		 HR_wind_speed.put("ceilings and floors","construction materials",2); 
		 HR_wind_speed.put("ceilings and floors","metals",3); 
		 HR_wind_speed.put("exposed floors","construction materials",4); 
		 
		 Map<String, Integer> HC_wind_speed = new Hashtable<>(); 
	  
		 HC_wind_speed.put("less then 0.5 m/s",0); 
		 HC_wind_speed.put("0.5-5.0 m/s",1);
		 HC_wind_speed.put("more then 0.5 m/s",2); 
		  
		 double array_table4[][]= {
				 {0.08,0.06,0.03},
				 {0.10,0.07,0.03},
				 {0.09,0.05,0.02},
				 {0.09,0,0},
				 
		 };
		 
		//  System.out.println(array_table4[HR_wind_speed.get("walls", "metals")][HC_wind_speed.get("more then 0.5 m/s")]);

// 	 table number 5
		 Map<String, Integer> HR_material = new Hashtable<>(); 
		 HR_material.put("marble",0); 
		 HR_material.put("hard stone",1); 
		 HR_material.put("firm stone",2); 
		 HR_material.put("semi firm ston",3); 
		 HR_material.put("soft ston",4); 
		 HR_material.put("granit",5); 
		 HR_material.put("baslt and stqnes",6); 
		 HR_material.put("lime stone",7); 
		 HR_material.put("sand",8); 
		 HR_material.put("soil",9); 
		// HR_material.put("building brick",0); 
		 HR_material.put("cement brick ,solid",10); 
		 HR_material.put("cement brick , with air gaps",11); 
		 HR_material.put("common brick (low density)",12); 
		 HR_material.put("face brick (high density)",13); 
		 HR_material.put("glass brick",14); 
		 HR_material.put("fire-clay brick",15); 
		 HR_material.put("clay",16); 
		 HR_material.put("light concrete",17); 
		 HR_material.put("foam concrete",18); 
		 HR_material.put("mortar",20); 
		 //---- 
		 HR_material.put("terrazzo tiles",21); 
		 HR_material.put("ceramic tiles",22); 
		 HR_material.put("pvc tiles",23); 
		 HR_material.put("rubber tiles",24); 
		 HR_material.put("rubber flooring",25); 
		 HR_material.put("plastic tiles",26); 
		 HR_material.put("cement palaster",27);
		 HR_material.put("gypasum plaster",28); 
		 HR_material.put("oak",29); 
		 HR_material.put("pine",30); 
		 HR_material.put("beech",31); 
		 HR_material.put("mahogay",32); 
		 HR_material.put("teak",32); 
		 HR_material.put("red wood",33); 
		 HR_material.put("hard fiber boards",34); 
		 HR_material.put("soft fiber boards",35); 
		 HR_material.put("plywood boards",36); 
		 HR_material.put("chip biards",37); 
		 HR_material.put("parquet",38); 
		 HR_material.put("gypsum boards",39); 
		 HR_material.put("cork boards",40); 
		 HR_material.put("reguular",41); 
		 HR_material.put("thermal resisting",42); 
		 //---
		 HR_material.put("aluminuum",45); 
		 HR_material.put("copper",46); 
		 HR_material.put("brass",47); 
		 HR_material.put("cast iron",48); 
		 HR_material.put("mild steel",48); 
		 HR_material.put("stainless steel",49); 
		 HR_material.put("polystyrene boards",50); 
		 HR_material.put("polyurethane boards",51); 
		 HR_material.put("rock wool",52); 
		 HR_material.put("glass wool",53); 
		 HR_material.put("cork boards",54); 
		 HR_material.put("cork particles",54); 
		 HR_material.put("asphalt mix",55); 
		 HR_material.put("asphalt",56); 
		 HR_material.put("rool roofing",57);  
		 
	 
		 
		 Map<String, Integer> HC_material = new Hashtable<>(); 
		 HC_material.put("densilty kg /m^2",0); 
		 HC_material.put("thermal conductivity w / mc",1); 
		  
		 
		 double array_table5[][]= {
				 {2600 ,2.90 },
				 { 2500, 2.20},
				 { 2250, 1.70},
				 { 2000, 1.40},
				 { 1,750 , 1.05},
				 { 2800, 3.75},
				 {2800 ,3.50 },
				 { 2500, 1.3},
				 { 1800, 0.70},
				 {1900 , 1.20},
				 { 1600, 1.00},
				 { 1400, 0.72 },
				 { 1200, 1.27},
				 { 1000, 0.65},
				 { 2000, 1.00},			 
				 { 2300, 1.75}, 
				 {1600 , 0.68}, 
				 //----
				 { 1800,1 },
				 { 2000, 1.40},
				 { 2100, 1.10},
				 { 2000, 1.20},
				 { 1500, 0.23},
				 { 0, 0.4},
				 { 0, 3.5},
				 { 2000,1.20 },
				 { 720,0.8 },
				 { 800,0.21 },
				 { 600, 0.14},
				 {800 , 0.17},
				 { 700, 0.16},
				 { 700, 0.17},
				 { 0, 0.11},
				 { 1000,0.14 },
				 { 300, 0.06},
				 {545 , 0.12},
				 { 800, 0.15},
				 {0,0.23},
				 {0,0.17},
				 {800 , 0.95},
				 {2500 ,1.05 },
				 { 2250, 1.10},
				 //---
				 { 2300,200 },
				 { 8900, 250},
				 {8400 , 130},
				 {7000 , 40},
				 {7000 , 45},
				 { 7800, 15},
				 {30 ,0.030 },
				 { 30,0.030 },
				 {140 ,0.040 },
				 { 180,0.042 },
				 {160 ,0.045 },
				 { 80,0.042 },
				 { 2300, 1.10},
				 { 2100,0.80 },
				 { 1100, 0.18},
		 };
		 // table number 6
		 Map<String , Integer> HC_table6 = new Hashtable<>(); 
		 HC_table6.put("total heat dissipation adult male", 0);
		 HC_table6.put("total adjusted heat dissipation", 1);
		 HC_table6.put("sensile heat, w", 2);
		 HC_table6.put("leatent heat, w", 3);
		 
		 Hash<String,String,Integer> HR_table6 = new Hash<String,String,Integer>();
		 HR_table6.put("seated at rest","matinee",0);
		 HR_table6.put("seated at rest","evening",1);
		 HR_table6.put("seated, very light work","offices, hotel, aparrtments, restautant",2);
		 HR_table6.put("moderately active office work","offices, hotel, aparrtments",3);
		 HR_table6.put("standing light work ,walking","department store, retail, store, supermakets",4);
		 HR_table6.put("walking, scated","drug store",5);
		 HR_table6.put("standing walking slowly","bank",6);
		 HR_table6.put("sedentary work","restaurant",7);
		 HR_table6.put("light bench work","dactory",8);
		 HR_table6.put("moderate work","small parts assembly",9);
		 HR_table6.put("moderate dancing","dance halls",10);
		 HR_table6.put("walking at 1.5 ml/s","factory",11);
		 HR_table6.put("bowling","bowling alley",12);
		 HR_table6.put("helvy work","factory",13);   
		 
		
		
		// System.out.println( HR_table6.get("helvy work","factory"));
		 double table6[][]= {
				 {111.5 , 94 , 64 , 30},
				 {111.5 , 100 , 70 , 30},
				 {128.5 , 114 , 70 , 44},
				 {135.5 , 128.5 , 71.5 , 57},
				 {157 , 143 , 71.5 , 71.5},
				 {157 , 143 ,  71.5 ,  71.5},
				 {157 , 143 ,  71.5 ,  71.5},
				 {168.5 , 157 , 78.5 , 78.5},
				 {238 , 214 , 78 , 136},
				 {286 , 285 , 107 , 178},
				 {428.5 , 414 , 166 , 248},
				 {428.5 , 414 , 166 , 248},
				 };
		 
		
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
// 		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
// 		frame.setVisible(true);
// 		frame.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		 
		Dimension size =  Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds( 0, 0, size.width, size.height );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		a = new JTextField();
		a.setBounds(10, 36, 140, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Type of room building");
		lblNewLabel.setBounds(10, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(10, 79, 20, -4);
		frame.getContentPane().add(label);
		
		lblNewLabel_1 = new JLabel("Inside volume");
		lblNewLabel_1.setBounds(10, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 92, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("munber of pepole space");
		lblNewLabel_2.setBounds(10, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 148, 140, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Type of activity");
		lblNewLabel_3.setBounds(10, 179, 140, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 204, 140, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Type of application");
		lblNewLabel_4.setBounds(10, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 260, 140, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_5 = new JLabel("IElement");
		lblNewLabel_5.setBounds(10, 291, 140, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 316, 140, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_6 = new JLabel("IHeat direction");
		lblNewLabel_6.setBounds(10, 347, 140, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 372, 140, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_7 = new JLabel("IMaterial type");
		lblNewLabel_7.setBounds(10, 403, 140, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 428, 140, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Element");
		lblNewLabel_8.setBounds(10, 459, 140, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(10, 484, 140, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Material");
		lblNewLabel_9.setBounds(10, 515, 140, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(10, 540, 140, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Speed");
		lblNewLabel_10.setBounds(10, 571, 140, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(10, 596, 140, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		lblNewLabel_11 = new JLabel("X : thichness");
		lblNewLabel_11.setBounds(10, 627, 140, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 652, 140, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		lblNewLabel_12 = new JLabel("material number");
		lblNewLabel_12.setBounds(200, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		textField_11 = new JTextField();
		textField_11.setBounds(200, 36, 220, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		lblNewLabel_13 = new JLabel("construction material");
		lblNewLabel_13.setBounds(200, 67, 220, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(200, 92, 220, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		lblNewLabel_14 = new JLabel("T0=      Ti=");
		lblNewLabel_14.setBounds(200, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(200, 148, 220, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		lblNewLabel_15 = new JLabel("Awall");
		lblNewLabel_15.setBounds(200, 179, 220, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		textField_14 = new JTextField();
		textField_14.setBounds(200, 204, 220, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		lblNewLabel_16 = new JLabel("X=    ,Y=    .of area fraction");
		lblNewLabel_16.setBounds(200, 235, 220, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		textField_15 = new JTextField();
		textField_15.setBounds(200, 260, 220, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		lblNewLabel_17 = new JLabel("Awin:=       ,Adoor=      ");
		lblNewLabel_17.setBounds(200, 291, 220, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		textField_16 = new JTextField();
		textField_16.setBounds(200, 316, 220, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		lblNewLabel_18 = new JLabel("Aceliling");
		lblNewLabel_18.setBounds(200, 347, 140, 14);
		frame.getContentPane().add(lblNewLabel_18);
		
		textField_17 = new JTextField();
		textField_17.setBounds(200, 372, 220, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		lblNewLabel_19 = new JLabel("window material type and peand frame");
		lblNewLabel_19.setBounds(200, 403, 220, 14);
		frame.getContentPane().add(lblNewLabel_19);
		
		textField_18 = new JTextField();
		textField_18.setBounds(200, 428, 220, 20);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		lblNewLabel_20 = new JLabel("single or double glass");
		lblNewLabel_20.setBounds(200, 459, 140, 14);
		frame.getContentPane().add(lblNewLabel_20);
		
		textField_19 = new JTextField();
		textField_19.setBounds(200, 484, 220, 20);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		lblNewLabel_21 = new JLabel("door-type");
		lblNewLabel_21.setBounds(200, 515, 140, 14);
		frame.getContentPane().add(lblNewLabel_21);
		
		textField_20 = new JTextField();
		textField_20.setBounds(200, 540, 220, 20);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		lblNewLabel_22 = new JLabel("with out storm.door of with wttood with metul");
		lblNewLabel_22.setBounds(200, 571, 264, 14);
		frame.getContentPane().add(lblNewLabel_22);
		
		textField_21 = new JTextField();
		textField_21.setBounds(200, 596, 220, 20);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		lblNewLabel_23 = new JLabel("gap thichness");
		lblNewLabel_23.setBounds(200, 627, 140, 14);
		frame.getContentPane().add(lblNewLabel_23);
		
		textField_22 = new JTextField();
		textField_22.setBounds(200, 652, 220, 20);
		frame.getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		lblNewLabel_24 = new JLabel("gap material");
		lblNewLabel_24.setBounds(500, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel_24);
		
		textField_23 = new JTextField();
		textField_23.setBounds(500, 36, 140, 20);
		frame.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		lblNewLabel_25 = new JLabel("peat flow pirection");
		lblNewLabel_25.setBounds(500, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_25);
		
		textField_24 = new JTextField();
		textField_24.setBounds(500, 92, 140, 20);
		frame.getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		lblNewLabel_26 = new JLabel("wall depth below, rude");
		lblNewLabel_26.setBounds(500, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_26);
		
		textField_25 = new JTextField();
		textField_25.setBounds(500, 148, 140, 20);
		frame.getContentPane().add(textField_25);
		textField_25.setColumns(10);
		
		lblNewLabel_27 = new JLabel("Xin");
		lblNewLabel_27.setBounds(500, 179, 140, 14);
		frame.getContentPane().add(lblNewLabel_27);
		
		textField_26 = new JTextField();
		textField_26.setBounds(500, 204, 140, 20);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		lblNewLabel_28 = new JLabel("Kine");
		lblNewLabel_28.setBounds(500, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_28);
		
		textField_27 = new JTextField();
		textField_27.setBounds(500, 260, 140, 20);
		frame.getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		lblNewLabel_29 = new JLabel("Abelow");
		lblNewLabel_29.setBounds(500, 291, 140, 14);
		frame.getContentPane().add(lblNewLabel_29);
		
		textField_28 = new JTextField();
		textField_28.setBounds(500, 316, 140, 20);
		frame.getContentPane().add(textField_28);
		textField_28.setColumns(10);
		
		lblNewLabel_30 = new JLabel("unconditioned");
		lblNewLabel_30.setBounds(500, 347, 140, 14);
		frame.getContentPane().add(lblNewLabel_30);
		
		textField_29 = new JTextField();
		textField_29.setBounds(500, 372, 140, 20);
		frame.getContentPane().add(textField_29);
		textField_29.setColumns(10);
		
		lblNewLabel_31 = new JLabel("an heated");
		lblNewLabel_31.setBounds(500, 403, 140, 14);
		frame.getContentPane().add(lblNewLabel_31);
		
		textField_30 = new JTextField();
		textField_30.setBounds(500, 428, 140, 20);
		frame.getContentPane().add(textField_30);
		textField_30.setColumns(10);
		
		lblNewLabel_32 = new JLabel("an usual");
		lblNewLabel_32.setBounds(500, 459, 140, 14);
		frame.getContentPane().add(lblNewLabel_32);
		
		textField_31 = new JTextField();
		textField_31.setBounds(500, 484, 140, 20);
		frame.getContentPane().add(textField_31);
		textField_31.setColumns(10);
		
		lblNewLabel_33 = new JLabel("Uceilin");
		lblNewLabel_33.setBounds(500, 515, 140, 14);
		frame.getContentPane().add(lblNewLabel_33);
		
		textField_32 = new JTextField();
		textField_32.setBounds(500, 540, 140, 20);
		frame.getContentPane().add(textField_32);
		textField_32.setColumns(10);
		
		lblNewLabel_34 = new JLabel("Vreot");
		lblNewLabel_34.setBounds(500, 571, 140, 14);
		frame.getContentPane().add(lblNewLabel_34);
		
		textField_33 = new JTextField();
		textField_33.setBounds(500, 596, 140, 20);
		frame.getContentPane().add(textField_33);
		textField_33.setColumns(10);
		
		lblNewLabel_35 = new JLabel("Ar=    , Ac=");
		lblNewLabel_35.setBounds(500, 627, 140, 14);
		frame.getContentPane().add(lblNewLabel_35);
		
		textField_34 = new JTextField();
		textField_34.setBounds(500, 652, 140, 20);
		frame.getContentPane().add(textField_34);
		textField_34.setColumns(10);
		
		lblNewLabel_36 = new JLabel("Wi=");
		lblNewLabel_36.setBounds(650, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel_36);
		
		textField_35 = new JTextField();
		textField_35.setBounds(650, 36, 140, 20);
		frame.getContentPane().add(textField_35);
		textField_35.setColumns(10);
		
		lblNewLabel_37 = new JLabel("W0");
		lblNewLabel_37.setBounds(650, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_37);
		
		textField_36 = new JTextField();
		textField_36.setBounds(650, 92, 140, 20);
		frame.getContentPane().add(textField_36);
		textField_36.setColumns(10);
		
		JLabel lblNewLabel_38 = new JLabel("Vint");
		lblNewLabel_38.setBounds(900, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel_38);
		
		textField_37 = new JTextField();
		textField_37.setBounds(900, 36, 140, 20);
		frame.getContentPane().add(textField_37);
		textField_37.setColumns(10);
		
		JLabel lblNewLabel_39 = new JLabel("Vvent ");
		lblNewLabel_39.setBounds(900, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("Qsensible of people");
		lblNewLabel_40.setBounds(900, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_40);
		
		textField_38 = new JTextField();
		textField_38.setBounds(900, 92, 140, 20);
		frame.getContentPane().add(textField_38);
		textField_38.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("Qlatent");
		lblNewLabel_41.setBounds(900, 179, 140, 14);
		frame.getContentPane().add(lblNewLabel_41);
		
		textField_39 = new JTextField();
		textField_39.setBounds(900, 148, 140, 20);
		frame.getContentPane().add(textField_39);
		textField_39.setColumns(10);
		
		JLabel lblNewLabel_42 = new JLabel("Ktotal wall");
		lblNewLabel_42.setBounds(900, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_42);
		
		textField_40 = new JTextField();
		textField_40.setBounds(900, 204, 140, 20);
		frame.getContentPane().add(textField_40);
		textField_40.setColumns(10);
		
		textField_41 = new JTextField();
		textField_41.setBounds(900, 260, 140, 20);
		frame.getContentPane().add(textField_41);
		textField_41.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(900, 303, 20, 2);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_43 = new JLabel("Qwall");
		lblNewLabel_43.setBounds(900, 291, 140, 14);
		frame.getContentPane().add(lblNewLabel_43);
		
		textField_42 = new JTextField();
		textField_42.setBounds(900, 316, 140, 20);
		frame.getContentPane().add(textField_42);
		textField_42.setColumns(10);
		
		JLabel lblNewLabel_44 = new JLabel("Qwin");
		lblNewLabel_44.setBounds(900, 347, 140, 14);
		frame.getContentPane().add(lblNewLabel_44);
		
		textField_43 = new JTextField();
		textField_43.setBounds(900, 372, 140, 20);
		frame.getContentPane().add(textField_43);
		textField_43.setColumns(10);
		
		JLabel lblNewLabel_45 = new JLabel("Qceitin");
		lblNewLabel_45.setBounds(900, 403, 140, 14);
		frame.getContentPane().add(lblNewLabel_45);
		
		textField_44 = new JTextField();
		textField_44.setBounds(900, 428, 140, 20);
		frame.getContentPane().add(textField_44);
		textField_44.setColumns(10);
		
		JLabel lblNewLabel_46 = new JLabel("Qfloor");
		lblNewLabel_46.setBounds(900, 459, 140, 14);
		frame.getContentPane().add(lblNewLabel_46);
		
		textField_45 = new JTextField();
		textField_45.setBounds(900, 484, 140, 20);
		frame.getContentPane().add(textField_45);
		textField_45.setColumns(10);
		
		JLabel lblNewLabel_47 = new JLabel("Qbelor");
		lblNewLabel_47.setBounds(900, 515, 140, 14);
		frame.getContentPane().add(lblNewLabel_47);
		
		textField_46 = new JTextField();
		textField_46.setBounds(900, 540, 140, 20);
		frame.getContentPane().add(textField_46);
		textField_46.setColumns(10);
		
		JLabel lblNewLabel_48 = new JLabel("Qtotal");
		lblNewLabel_48.setBounds(900, 627, 140, 14);
		frame.getContentPane().add(lblNewLabel_48);
		
		textField_47 = new JTextField();
		textField_47.setBounds(900, 596, 140, 20);
		frame.getContentPane().add(textField_47);
		textField_47.setColumns(10);
		
		JLabel lblNewLabel_49 = new JLabel("Qdoor");
		lblNewLabel_49.setBounds(900, 571, 140, 14);
		frame.getContentPane().add(lblNewLabel_49);
		
		textField_48 = new JTextField();
		textField_48.setBounds(900, 652, 140, 20);
		frame.getContentPane().add(textField_48);
		textField_48.setColumns(10);
		
		JLabel lblNewLabel_50 = new JLabel("Rcap");
		lblNewLabel_50.setBounds(1150, 11, 48, 14);
		frame.getContentPane().add(lblNewLabel_50);
		
		textField_49 = new JTextField();
		textField_49.setBounds(1150, 36, 140, 20);
		frame.getContentPane().add(textField_49);
		textField_49.setColumns(10);
		
		JLabel lblNewLabel_51 = new JLabel("Tunconditioned");
		lblNewLabel_51.setBounds(1150, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_51);
		
		textField_50 = new JTextField();
		textField_50.setBounds(1150, 92, 140, 20);
		frame.getContentPane().add(textField_50);
		textField_50.setColumns(10);
		
		JLabel lblNewLabel_52 = new JLabel("tanneated");
		lblNewLabel_52.setBounds(1150, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_52);
		
		textField_51 = new JTextField();
		textField_51.setBounds(1150, 148, 140, 20);
		frame.getContentPane().add(textField_51);
		textField_51.setColumns(10);
		
		JLabel lblNewLabel_53 = new JLabel("Tauusaal");
		lblNewLabel_53.setBounds(1150, 179, 140, 14);
		frame.getContentPane().add(lblNewLabel_53);
		
		textField_52 = new JTextField();
		textField_52.setBounds(1150, 204, 140, 20);
		frame.getContentPane().add(textField_52);
		textField_52.setColumns(10);
		
		JLabel lblNewLabel_54 = new JLabel("QAttics");
		lblNewLabel_54.setBounds(1150, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_54);
		
		textField_53 = new JTextField();
		textField_53.setBounds(1150, 260, 140, 20);
		frame.getContentPane().add(textField_53);
		textField_53.setColumns(10);
		
		JLabel lblNewLabel_55 = new JLabel("Qsensibel hentinn");
		lblNewLabel_55.setBounds(1150, 291, 140, 14);
		frame.getContentPane().add(lblNewLabel_55);
		
		textField_54 = new JTextField();
		textField_54.setBounds(1150, 316, 140, 20);
		frame.getContentPane().add(textField_54);
		textField_54.setColumns(10);
		
		JLabel lblNewLabel_56 = new JLabel("Qlatent heatin");
		lblNewLabel_56.setBounds(1150, 347, 140, 14);
		frame.getContentPane().add(lblNewLabel_56);
		
		textField_55 = new JTextField();
		textField_55.setBounds(1150, 372, 140, 20);
		frame.getContentPane().add(textField_55);
		textField_55.setColumns(10);
		
		JLabel lblNewLabel_57 = new JLabel("civc");
		lblNewLabel_57.setBounds(1150, 403, 140, 14);
		frame.getContentPane().add(lblNewLabel_57);
		
		textField_56 = new JTextField();
		textField_56.setBounds(1150, 428, 140, 20);
		frame.getContentPane().add(textField_56);
		textField_56.setColumns(10);
		 
		 
		//System.out.print("");
	}
}
