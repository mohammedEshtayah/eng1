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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class main {
 
	private JFrame frame;
	private JTextField Type_of_room_building;
	private JLabel lblNewLabel_1;
	private JTextField Inside_volume;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField Type_of_activity;
	private JLabel lblNewLabel_4;
	private JTextField Type_of_application;
	private JLabel lblNewLabel_5;
	private JTextField IElement;
	private JLabel lblNewLabel_6;
	private JTextField IHeat_direction;
	private JLabel lblNewLabel_7;
	private JTextField IMaterial_type;
	private JLabel lblNewLabel_8;
	private JTextField Element;
	private JLabel lblNewLabel_9;
	private JTextField Material_type;
	private JLabel lblNewLabel_10;
	private JTextField Speed;
	private JLabel lblNewLabel_11;
	private JTextField X_thichness;
	private JLabel materia;
	private JTextField material_number;
	private JLabel lblNewLabel_13;
	private JTextField textField_12;
	private JLabel lblNewLabel_14;
	private JTextField Dt;
	private JLabel lblNewLabel_15;
	private JTextField Awall;
	private JLabel lblNewLabel_16;
	private JTextField xy;
	private JLabel lblNewLabel_17;
	private JTextField Awin_Adoor;
	private JLabel lblNewLabel_18;
	private JTextField textField_17;
	private JLabel lblNewLabel_19;
	private JTextField window_material_type_and_peand_frame;
	private JLabel lblNewLabel_20;
	private JTextField single;
	private JLabel lblNewLabel_21;
	private JTextField door_type;
	private JLabel lblNewLabel_22;
	private JTextField textField_21;
	private JLabel lblNewLabel_23;
	private JTextField gap_thichness;
	private JLabel lblNewLabel_24;
	private JTextField gap_material;
	private JLabel lblNewLabel_25;
	private JTextField Heat_flow_direction;
	private JLabel lblNewLabel_26;
	private JTextField Depth_Below;
	private JLabel lblNewLabel_27;
	private JTextField Xin_Kin;
	private JLabel lblNewLabel_28;
	private JTextField Afloor;
	private JLabel lblNewLabel_29;
	private JTextField Abelow;
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
	private JTextField vint;
	private JTextField Vvent;
	private JTextField Qsensible;
	private JTextField Qleatent;
	private JTextField Rtotal;
	private JTextField Qwall;
	private JTextField Qwin;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField Qbelwor;
	private JTextField Qdoor;
	private JTextField Qtotal;
	private JTextField textField_49;
	private JTextField Tuncond_itioned;
	private JTextField tanneated;
	private JTextField Tauusaal;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField application;
	private JLabel lblNumberOfPersons;
	private JTextField number_of_persons;
	private JLabel lblNewLabel_12;
	private JTextField Material;
	private JTextField Depth_below_grade;

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
		
		
	 
		 
			
		
		 
		//  System.out.println(array_table4[HR_wind_speed.get("walls", "metals")][HC_wind_speed.get("more then 0.5 m/s")]);

// 	 table number 5
		
		 
		
		 
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
		 
		 //table number 2 ----------------------------------------
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
		 //----------------------------------------

		 // table number 5-2
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
	//---------------------------------------------------------------------------
		  //table number 5-3
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
		 //------------------------------ 5-1
			 Hash<Integer,String,Integer> HR_material = new Hash<Integer,String,Integer>(); 
			 
			 HR_material.put(1,"marble",0); 
			  
			 HR_material.put(1,"hard stone",1); 
			 
			 HR_material.put(1,"firm stone",2); 
			 
			 HR_material.put(1,"semi firm ston",3);
			  
			 HR_material.put(1,"soft ston",4); 
			  
			 HR_material.put(1,"granit",5); 
			 
			  
			 HR_material.put(1,"baslt and stqnes",6); 
			  
			 HR_material.put(1,"lime stone",7); 
			 
		 
			 HR_material.put(1,"sand",8); 
			 
			 // HR_material.put("building brick",0);
			 
			 HR_material.put(2,"soil",9); 
			 //-----3
			  
			 HR_material.put(3,"cement brick ,solid",10); 
			  
			 HR_material.put(3,"cement brick , with air gaps",11); 
			  
			 HR_material.put(3,"common brick (low density)",12); 
			  
			 HR_material.put(3,"face brick (high density)",13); 
			  
			 HR_material.put(3,"glass brick",14); 
			 
			 HR_material.put(3,"fire-clay brick",15); 
			  
			 HR_material.put(3,"clay",16); 
			 //---4
			  
			 HR_material.put(4,"light concrete",17); 
			  
			 HR_material.put(4,"foam concrete",18);
			  
			 HR_material.put(4,"mortar",20); 
			 //---- 
			  
			 HR_material.put(5,"terrazzo tiles",21); 
			  
			 HR_material.put(5, "ceramic tiles",22); 
			  
			 HR_material.put(5, "pvc tiles",23); 
			  
			 HR_material.put(5, "rubber tiles",24); 
			  
			 HR_material.put(5, "rubber flooring",25); 
			  
			 HR_material.put(5,"plastic tiles",26); 
			  
			 HR_material.put(6,"cement palaster",27);
			  
			 HR_material.put(6, "gypasum plaster",28); 
			  
			 HR_material.put(7, "oak",29); 
			  
			 HR_material.put(7, "pine",30); 
			   
			 HR_material.put(7,"beech",31); 
			  
			 HR_material.put(7, "mahogay",32); 
			  
			 HR_material.put(7, "teak",32); 
			  
			 HR_material.put(7, "red wood",33); 
			  
			 HR_material.put(8,"hard fiber boards",34); 
			  
			 HR_material.put(8, "soft fiber boards",35); 
			  
			 HR_material.put(8, "plywood boards",36); 
			   
			 HR_material.put(8,"chip biards" ,37); 
			  
			 HR_material.put(8, "parquet",38); 
			  
			 HR_material.put(9,"gypsum boards",39); 
			  
			 HR_material.put(9, "cork boards",40); 
			 
			 HR_material.put(10,"reguular",41); 
			  
			 HR_material.put(10,"thermal resisting",42); 
			 //---
			  
			 HR_material.put(11,"aluminuum" ,45); 
			  
			 HR_material.put(11, "copper" ,46); 
			  
			 HR_material.put(11, "brass",47); 
			  
			 HR_material.put(11, "cast iron",48); 
			  
			 HR_material.put(11, "mild steel",48); 
			  
			 HR_material.put(11,"stainless steel",49); 
			  
			 HR_material.put(12,"polystyrene boards" ,50); 
			  
			 HR_material.put(12, "polyurethane boards",51); 
			  
			 HR_material.put(12,"rock wool" ,52); 
			  
			 HR_material.put(12, "glass wool",53); 
			  
			 HR_material.put(12, "cork boards",54); 
			  
			 HR_material.put(12, "cork particles",54); 
			  
			 HR_material.put(13, "asphalt mix",55); 
			  
			 HR_material.put(13,"asphalt",56); 
			  
			 HR_material.put(13,"rool roofing",57);  
			 
		 
			 
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
			// 5-10 ----------------------------------------
			 Map<String , Integer> map1 = new Hashtable<String , Integer>();;
			 Map<String, Integer> HC_air_gas = new Hashtable<>(); 
			 HC_air_gas.put("horizontal or upward", 0);
			 HC_air_gas.put("downward", 1);
			
			 Hash<String,String,Integer> HR_air_gas = new Hash<String,String,Integer>(); 
			 HR_air_gas.put("5 mum","construction material",0);
			 HR_air_gas.put("5 mum","metals",1);
			 HR_air_gas.put("20 mun or mum","construction material",2); 
			 HR_air_gas.put("20 mun or mum","metals",3);
			  
		 
			 
			 
			 double air_gas[][]= {
					 { 0.11, 0.11  },
					 { 0.18, 0.18  },
					 { 0.18, 0.20  },
					 { 0.53, 1.06 },
					  
					 }; 
			
					//  System.out.println( air_gas[HR_air_gas.get("5 mum","metals")][HC_air_gas.get("downward")]);
			
			 //----------------------------------------------------
			 Map<String, Integer> HR_material_type = new Hashtable<>(); 
			 HR_material_type.put("wood",0);
			 HR_material_type.put("alumiunm",1);
			 HR_material_type.put("steel",2);
			 HR_material_type.put("pvc",3);
			 Map<String, Map<String , Integer>> HC_material_type = new Hashtable<>(); 
			 Map<String , Integer> map2 = new Hashtable<String , Integer>();;
			 map2.put("0.5", 0);
			 map2.put("0.5-5.0", 1);
			 map2.put("5.0", 2);
			 HC_material_type.put("single_glass",map2);
			 
			 map2 = new Hashtable<String , Integer>();;
			 map2.put("0.5", 3);
			 map2.put("0.5-5.0", 4);
			 map2.put("5.0", 5);
			 HC_material_type.put("gap",map2);
			 
			 double material_type[][]= {
					 { 3.8, 4.3 , 5   , 2.3, 2.5 , 2.7 },
					 { 5.0, 5.6 , 6.7 , 3, 3.2 , 3.5 },
					 { 5.0, 5.6 , 6.7 , 3, 3.2 , 3.5 },
					 { 3.8, 4.3 , 5   , 2.3, 2.5 , 2.7 }, 
					 }; 
			 
			// System.out.println( material_type[HR_material_type.get("wood")][HC_material_type.get("gap").get("0.5")]);
			 //----------------------------------------------------------------------
			 Map<String,  Integer> HR_Dsss_type = new Hashtable<>(); 
			 HR_Dsss_type.put("25 min-vood", 0);
			 HR_Dsss_type.put("35 min-vood", 1);
			 HR_Dsss_type.put("40 min-vood", 2);
			 HR_Dsss_type.put("45 min-vood", 3);
			 HR_Dsss_type.put("45 min-vood", 4);
			 HR_Dsss_type.put("alrimirum", 5);
			 HR_Dsss_type.put("steel", 6);
			 HR_Dsss_type.put("fiher core",7 );
			 HR_Dsss_type.put("palytyetyeme core",8 );
			 HR_Dsss_type.put("palytyetyeme core",9 ); 
			 
			 Map<String,  Integer> HC_Dsss_type = new Hashtable<>(); 
			 HC_Dsss_type.put("without storm door", 0);
			 HC_Dsss_type.put("with wood storm door", 1);
			 HC_Dsss_type.put("with metal storm door",2);
			 double Dsss_type[][]= {
					 {3.6 , 1.7 ,2.2},
					 { 3.1, 1.6 ,1.9 },
					 { 2.8, 1.5 , 1.8},
					 { 2.7, 1.5 , 1.8},
					 { 2.4 , 1.4 , 1.7},
					 { 7.0, 0 ,0 },
					 { 5.8,0 ,0 },
					 { 3.3, 0, 0},
					 { 2.7, 0,0 },
					 { 2.3, 0,0 },
					 };
			// System.out.println(Dsss_type[HR_Dsss_type.get("40 min-vood")][HC_Dsss_type.get("without storm door")]);
			 //-------------------------------------------------------
			 Map<String, Integer > HR_depth_below_grade = new Hashtable<>(); 
			 HR_depth_below_grade.put("0.0-0.3",0);
			 HR_depth_below_grade.put("0.3-0.6",1);
			 HR_depth_below_grade.put("0.6-0.9",2);
			 HR_depth_below_grade.put("0.9-1.2",3);
			 HR_depth_below_grade.put("1.2-1.5",4);
			 HR_depth_below_grade.put("2.5-1.8",5); 
			 HR_depth_below_grade.put("1.8-2.1",6);
			 Hash<String,Double,  Integer> HC_depth_below_grade = new Hash<String ,Double,  Integer> (); 
			 HC_depth_below_grade.put("uninsulated",0.0,0);
			 HC_depth_below_grade.put("insulated",0.715,0);
			 HC_depth_below_grade.put("insulated",1.430,0);
			 HC_depth_below_grade.put("insulated",2.145,0);
			 

			 double depth_below_grade[][]= {
					 {2.328, 0.863, 0.528  , 0.380},
					 {1.261, 0.659, 0.449 , 0.335},
					 {0.880, 0.534, 0.386 , 0.301},
					 {0.676, 0.449, 0.341, 0.373},
					 {0.545, 0.392, 0.301 , 0.250},
					 {0.449 ,0.341, 0.273 , 0.227},
					 {0.392, 0.307, 0.250 , 0.210},
					 };
			  //System.out.println(depth_below_grade[HR_depth_below_grade.get("0.9-1.2" )][HC_depth_below_grade.get("uninsulated")]);
		//------------------------------------------
			 Map<String, Integer> HR_depth_below = new Hashtable<>(); 
			 HR_depth_below.put("1.22",0);
			 HR_depth_below.put("1.52",1);
			 HR_depth_below.put("1.83",2);
			 HR_depth_below.put("2.13",3);
			 Map<String, Integer> HC_depth_below = new Hashtable<>(); 
			 HC_depth_below.put("6.1",0);
			 HC_depth_below.put("7.3",1);
			 HC_depth_below.put("8.5",2);
			 HC_depth_below.put("9.8",3); 
			 
			 double depth_below[][]= {
					 {0.198 ,0.182 , 0.153 ,0.136},
					 {0.182 ,0.165 , 0.148 ,0.131},
					 {0.170 ,0.152 , 0.142 ,0.125},
					 {0.165 ,0.148 , 0.131 ,0.119}, 
		
					 };
		Type_of_room_building = new JTextField();
		Type_of_room_building.setBounds(10, 36, 140, 20);
		frame.getContentPane().add(Type_of_room_building);
		Type_of_room_building.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Type of room building");
		lblNewLabel.setBounds(10, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(10, 79, 20, -4);
		frame.getContentPane().add(label);
		
		lblNewLabel_1 = new JLabel("Inside volume");
		lblNewLabel_1.setBounds(10, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		Inside_volume = new JTextField();
		Inside_volume.setBounds(10, 92, 140, 20);
		frame.getContentPane().add(Inside_volume);
		Inside_volume.setColumns(10);
		
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
		
		Type_of_activity = new JTextField();
		Type_of_activity.setBounds(10, 204, 140, 20);
		frame.getContentPane().add(Type_of_activity);
		Type_of_activity.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Type of application");
		lblNewLabel_4.setBounds(10, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		Type_of_application = new JTextField();
		Type_of_application.setBounds(10, 260, 140, 20);
		frame.getContentPane().add(Type_of_application);
		Type_of_application.setColumns(10);
		
		lblNewLabel_5 = new JLabel("IElement");
		lblNewLabel_5.setBounds(10, 291, 140, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		IElement = new JTextField();
		IElement.setBounds(10, 316, 140, 20);
		frame.getContentPane().add(IElement);
		IElement.setColumns(10);
		
		lblNewLabel_6 = new JLabel("IHeat direction");
		lblNewLabel_6.setBounds(10, 347, 140, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		IHeat_direction = new JTextField();
		IHeat_direction.setBounds(10, 372, 140, 20);
		frame.getContentPane().add(IHeat_direction);
		IHeat_direction.setColumns(10);
		
		lblNewLabel_7 = new JLabel("IMaterial type");
		lblNewLabel_7.setBounds(10, 403, 140, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		IMaterial_type = new JTextField();
		IMaterial_type.setBounds(10, 428, 140, 20);
		frame.getContentPane().add(IMaterial_type);
		IMaterial_type.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Element");
		lblNewLabel_8.setBounds(10, 459, 140, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		Element = new JTextField();
		Element.setBounds(10, 484, 140, 20);
		frame.getContentPane().add(Element);
		Element.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Material type");
		lblNewLabel_9.setBounds(10, 515, 140, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		Material_type = new JTextField();
		Material_type.setBounds(10, 540, 140, 20);
		frame.getContentPane().add(Material_type);
		Material_type.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Speed");
		lblNewLabel_10.setBounds(10, 571, 140, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		Speed = new JTextField();
		Speed.setBounds(10, 596, 140, 20);
		frame.getContentPane().add(Speed);
		Speed.setColumns(10);
		
		lblNewLabel_11 = new JLabel("X : thichness");
		lblNewLabel_11.setBounds(10, 627, 140, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		X_thichness = new JTextField();
		X_thichness.setBounds(10, 652, 140, 20);
		frame.getContentPane().add(X_thichness);
		X_thichness.setColumns(10);
		
		materia = new JLabel("material number");
		materia.setBounds(200, 11, 140, 14);
		frame.getContentPane().add(materia);
		
		material_number = new JTextField();
		material_number.setBounds(200, 36, 220, 20);
		frame.getContentPane().add(material_number);
		material_number.setColumns(10);
		
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
		
		Dt = new JTextField();
		Dt.setBounds(200, 148, 220, 20);
		frame.getContentPane().add(Dt);
		Dt.setColumns(10);
		
		lblNewLabel_15 = new JLabel("Awall");
		lblNewLabel_15.setBounds(200, 179, 220, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		Awall = new JTextField();
		Awall.setBounds(200, 204, 220, 20);
		frame.getContentPane().add(Awall);
		Awall.setColumns(10);
		
		lblNewLabel_16 = new JLabel("X=    ,Y=    .of area fraction");
		lblNewLabel_16.setBounds(200, 235, 220, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		xy = new JTextField();
		xy.setBounds(200, 260, 220, 20);
		frame.getContentPane().add(xy);
		xy.setColumns(10);
		
		lblNewLabel_17 = new JLabel("Awin:=       ,Adoor=      ");
		lblNewLabel_17.setBounds(200, 291, 220, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		Awin_Adoor = new JTextField();
		Awin_Adoor.setBounds(200, 316, 220, 20);
		frame.getContentPane().add(Awin_Adoor);
		Awin_Adoor.setColumns(10);
		
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
		
		window_material_type_and_peand_frame = new JTextField();
		window_material_type_and_peand_frame.setBounds(200, 428, 220, 20);
		frame.getContentPane().add(window_material_type_and_peand_frame);
		window_material_type_and_peand_frame.setColumns(10);
		
		lblNewLabel_20 = new JLabel("single or double glass");
		lblNewLabel_20.setBounds(200, 459, 140, 14);
		frame.getContentPane().add(lblNewLabel_20);
		
		single = new JTextField();
		single.setBounds(200, 484, 220, 20);
		frame.getContentPane().add(single);
		single.setColumns(10);
		
		lblNewLabel_21 = new JLabel("door-type");
		lblNewLabel_21.setBounds(200, 515, 140, 14);
		frame.getContentPane().add(lblNewLabel_21);
		
		door_type = new JTextField();
		door_type.setBounds(200, 540, 220, 20);
		frame.getContentPane().add(door_type);
		door_type.setColumns(10);
		
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
		
		gap_thichness = new JTextField();
		gap_thichness.setBounds(200, 652, 220, 20);
		frame.getContentPane().add(gap_thichness);
		gap_thichness.setColumns(10);
		
		lblNewLabel_24 = new JLabel("gap material");
		lblNewLabel_24.setBounds(500, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel_24);
		
		gap_material = new JTextField();
		gap_material.setBounds(500, 36, 140, 20);
		frame.getContentPane().add(gap_material);
		gap_material.setColumns(10);
		
		lblNewLabel_25 = new JLabel("Heat flow direction");
		lblNewLabel_25.setBounds(500, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_25);
		
		Heat_flow_direction = new JTextField();
		Heat_flow_direction.setBounds(500, 92, 140, 20);
		frame.getContentPane().add(Heat_flow_direction);
		Heat_flow_direction.setColumns(10);
		
		lblNewLabel_26 = new JLabel("wall depth below, rude");
		lblNewLabel_26.setBounds(500, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_26);
		
		Depth_Below = new JTextField();
		Depth_Below.setBounds(500, 148, 140, 20);
		frame.getContentPane().add(Depth_Below);
		Depth_Below.setColumns(10);
		
		lblNewLabel_27 = new JLabel("Xin,   Kin");
		lblNewLabel_27.setBounds(500, 179, 140, 14);
		frame.getContentPane().add(lblNewLabel_27);
		
		Xin_Kin = new JTextField();
		Xin_Kin.setBounds(500, 204, 140, 20);
		frame.getContentPane().add(Xin_Kin);
		Xin_Kin.setColumns(10);
		
		lblNewLabel_28 = new JLabel("Afloor");
		lblNewLabel_28.setBounds(500, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_28);
		
		Afloor = new JTextField();
		Afloor.setBounds(500, 260, 140, 20);
		frame.getContentPane().add(Afloor);
		Afloor.setColumns(10);
		
		lblNewLabel_29 = new JLabel("Abelow");
		lblNewLabel_29.setBounds(500, 291, 140, 14);
		frame.getContentPane().add(lblNewLabel_29);
		
		Abelow = new JTextField();
		Abelow.setBounds(500, 316, 140, 20);
		frame.getContentPane().add(Abelow);
		Abelow.setColumns(10);
		
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
		lblNewLabel_36.setBounds(700, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel_36);
		
		textField_35 = new JTextField();
		textField_35.setBounds(700, 36, 163, 20);
		frame.getContentPane().add(textField_35);
		textField_35.setColumns(10);
		
		lblNewLabel_37 = new JLabel("W0");
		lblNewLabel_37.setBounds(700, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_37);
		
		textField_36 = new JTextField();
		textField_36.setBounds(700, 92, 163, 20);
		frame.getContentPane().add(textField_36);
		textField_36.setColumns(10);
		
		JLabel lblNewLabel_38 = new JLabel("Vint");
		lblNewLabel_38.setBounds(960, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel_38);
		
		vint = new JTextField();
		vint.setBounds(960, 36, 140, 20);
		frame.getContentPane().add(vint);
		vint.setColumns(10);
		
		JLabel lblNewLabel_39 = new JLabel("Vvent ");
		lblNewLabel_39.setBounds(960, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("Qsensible of people");
		lblNewLabel_40.setBounds(960, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_40);
		
		Vvent = new JTextField();
		Vvent.setBounds(960, 92, 140, 20);
		frame.getContentPane().add(Vvent);
		Vvent.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("Qletent");
		lblNewLabel_41.setBounds(960, 179, 140, 14);
		frame.getContentPane().add(lblNewLabel_41);
		
		Qsensible = new JTextField();
		Qsensible.setBounds(960, 148, 140, 20);
		frame.getContentPane().add(Qsensible);
		Qsensible.setColumns(10);
		
		JLabel lblNewLabel_42 = new JLabel("Rtotal wall");
		lblNewLabel_42.setBounds(960, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_42);
		
		Qleatent = new JTextField();
		Qleatent.setBounds(960, 204, 140, 20);
		frame.getContentPane().add(Qleatent);
		Qleatent.setColumns(10);
		
		Rtotal = new JTextField();
		Rtotal.setBounds(960, 260, 140, 20);
		frame.getContentPane().add(Rtotal);
		Rtotal.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(900, 303, 20, 2);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_43 = new JLabel("Qwall");
		lblNewLabel_43.setBounds(960, 291, 140, 14);
		frame.getContentPane().add(lblNewLabel_43);
		
		Qwall = new JTextField();
		Qwall.setBounds(960, 316, 140, 20);
		frame.getContentPane().add(Qwall);
		Qwall.setColumns(10);
		
		JLabel lblNewLabel_44 = new JLabel("Qwin");
		lblNewLabel_44.setBounds(960, 347, 140, 14);
		frame.getContentPane().add(lblNewLabel_44);
		
		Qwin = new JTextField();
		Qwin.setBounds(960, 372, 140, 20);
		frame.getContentPane().add(Qwin);
		Qwin.setColumns(10);
		
		JLabel lblNewLabel_45 = new JLabel("Qceitin");
		lblNewLabel_45.setBounds(960, 403, 140, 14);
		frame.getContentPane().add(lblNewLabel_45);
		
		textField_44 = new JTextField();
		textField_44.setBounds(960, 428, 140, 20);
		frame.getContentPane().add(textField_44);
		textField_44.setColumns(10);
		
		JLabel lblNewLabel_46 = new JLabel("Qfloor");
		lblNewLabel_46.setBounds(960, 459, 140, 14);
		frame.getContentPane().add(lblNewLabel_46);
		
		textField_45 = new JTextField();
		textField_45.setBounds(960, 484, 140, 20);
		frame.getContentPane().add(textField_45);
		textField_45.setColumns(10);
		
		JLabel lblNewLabel_47 = new JLabel("Qbelwor");
		lblNewLabel_47.setBounds(960, 515, 140, 14);
		frame.getContentPane().add(lblNewLabel_47);
		
		Qbelwor = new JTextField();
		Qbelwor.setBounds(960, 540, 140, 20);
		frame.getContentPane().add(Qbelwor);
		Qbelwor.setColumns(10);
		
		JLabel lblNewLabel_48 = new JLabel("Qtotal");
		lblNewLabel_48.setBounds(960, 627, 140, 14);
		frame.getContentPane().add(lblNewLabel_48);
		
		Qdoor = new JTextField();
		Qdoor.setBounds(960, 596, 140, 20);
		frame.getContentPane().add(Qdoor);
		Qdoor.setColumns(10);
		
		JLabel lblNewLabel_49 = new JLabel("Qdoor");
		lblNewLabel_49.setBounds(960, 571, 140, 14);
		frame.getContentPane().add(lblNewLabel_49);
		
		Qtotal = new JTextField();
		Qtotal.setBounds(960, 652, 140, 20);
		frame.getContentPane().add(Qtotal);
		Qtotal.setColumns(10);
		
		JLabel lblNewLabel_50 = new JLabel("Rcap");
		lblNewLabel_50.setBounds(1180, 11, 48, 14);
		frame.getContentPane().add(lblNewLabel_50);
		
		textField_49 = new JTextField();
		textField_49.setBounds(1180, 36, 140, 20);
		frame.getContentPane().add(textField_49);
		textField_49.setColumns(10);
		
		JLabel lblNewLabel_51 = new JLabel("Tunconditioned");
		lblNewLabel_51.setBounds(1180, 67, 140, 14);
		frame.getContentPane().add(lblNewLabel_51);
		
		Tuncond_itioned = new JTextField();
		Tuncond_itioned.setBounds(1180, 92, 140, 20);
		frame.getContentPane().add(Tuncond_itioned);
		Tuncond_itioned.setColumns(10);
		
		JLabel lblNewLabel_52 = new JLabel("tanneated");
		lblNewLabel_52.setBounds(1180, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_52);
		
		tanneated = new JTextField();
		tanneated.setBounds(1180, 148, 140, 20);
		frame.getContentPane().add(tanneated);
		tanneated.setColumns(10);
		
		JLabel lblNewLabel_53 = new JLabel("Tauusaal");
		lblNewLabel_53.setBounds(1180, 179, 140, 14);
		frame.getContentPane().add(lblNewLabel_53);
		
		Tauusaal = new JTextField();
		Tauusaal.setBounds(1180, 204, 140, 20);
		frame.getContentPane().add(Tauusaal);
		Tauusaal.setColumns(10);
		
		JLabel lblNewLabel_54 = new JLabel("QAttics");
		lblNewLabel_54.setBounds(1180, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_54);
		
		textField_53 = new JTextField();
		textField_53.setBounds(1180, 260, 140, 20);
		frame.getContentPane().add(textField_53);
		textField_53.setColumns(10);
		
		JLabel lblNewLabel_55 = new JLabel("Qsensibel hentinn");
		lblNewLabel_55.setBounds(1180, 291, 140, 14);
		frame.getContentPane().add(lblNewLabel_55);
		
		textField_54 = new JTextField();
		textField_54.setBounds(1180, 316, 140, 20);
		frame.getContentPane().add(textField_54);
		textField_54.setColumns(10);
		
		JLabel lblNewLabel_56 = new JLabel("Qlatent heatin");
		lblNewLabel_56.setBounds(1180, 347, 140, 14);
		frame.getContentPane().add(lblNewLabel_56);
		
		textField_55 = new JTextField();
		textField_55.setBounds(1180, 372, 140, 20);
		frame.getContentPane().add(textField_55);
		textField_55.setColumns(10);
		
		JLabel lblNewLabel_57 = new JLabel("civc");
		lblNewLabel_57.setBounds(1180, 403, 140, 14);
		frame.getContentPane().add(lblNewLabel_57);
		
		textField_56 = new JTextField();
		textField_56.setBounds(1180, 428, 140, 20);
		frame.getContentPane().add(textField_56);
		textField_56.setColumns(10);
		
		JLabel lblNewLabel_58 = new JLabel("application");
		lblNewLabel_58.setBounds(700, 123, 140, 14);
		frame.getContentPane().add(lblNewLabel_58);
		
		application = new JTextField();
		application.setBounds(700, 148, 163, 20);
		frame.getContentPane().add(application);
		application.setColumns(10);
		
		lblNumberOfPersons = new JLabel("number of persons");
		lblNumberOfPersons.setBounds(700, 179, 140, 14);
		frame.getContentPane().add(lblNumberOfPersons);
		
		number_of_persons = new JTextField();
		number_of_persons.setBounds(700, 204, 163, 20);
		frame.getContentPane().add(number_of_persons);
		number_of_persons.setColumns(10);
		
		lblNewLabel_12 = new JLabel("Material");
		lblNewLabel_12.setBounds(700, 235, 140, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		Material = new JTextField();
		Material.setBounds(700, 260, 163, 20);
		frame.getContentPane().add(Material);
		Material.setColumns(10);
		
		JLabel lblNarrowestWidthOf = new JLabel("Narrowest width of the house, m");
		lblNarrowestWidthOf.setBounds(700, 375, 184, 14);
		frame.getContentPane().add(lblNarrowestWidthOf);
		
		JTextField Narrwest = new JTextField();
		Narrwest.setBounds(700, 400, 163, 20);
		frame.getContentPane().add(Narrwest);
		Narrwest.setColumns(10);
		
		JLabel lblDepthBelowGrade = new JLabel("Depth below grade, m");
		lblDepthBelowGrade.setBounds(700, 431, 163, 14);
		frame.getContentPane().add(lblDepthBelowGrade);
		
		Depth_below_grade = new JTextField();
		Depth_below_grade.setBounds(700, 456, 163, 20);
		frame.getContentPane().add(Depth_below_grade);
		Depth_below_grade.setColumns(10);
		 
	  
		JComboBox doorList = new JComboBox( new String[] {"without storm door", "with wood storm door", "with metal storm door"});
		doorList.setBounds(700, 303, 163, 22);
		frame.getContentPane().add(doorList);
		
		JComboBox comboBox = new JComboBox( new String[] {"uninsulated", "Insulated"});
		comboBox.setBounds(700, 343, 163, 22);
		frame.getContentPane().add(comboBox);
		
		
		JButton btnNewButton = new JButton("Calculation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				float ach=type_room.get(Type_of_room_building.getText());	
				double Vint= ( ach *   Double.parseDouble(Inside_volume.getText()) *1000) /3600;
				vint.setText(String.valueOf(Vint));
	    //2 ------------------------------------------------------------------------
			 	double x=array_tabe2[MR_table2.get(MR_table2.get(application.getText()))][MR_table2.get("L/s/person")];
			 	double n=Double.valueOf(number_of_persons.getText());
			 	Vvent.setText(String.valueOf(x*n));
		//3 --------------------------------------------------------------------------	
			 	 
			 	double Sensile=table6[HR_table6.get(Type_of_activity.getText(),Type_of_application.getText())][HC_table6.get("sensile heat, w")];
			 	Qsensible.setText(String.valueOf(Sensile));
	    //4 --------------------------------------------------------------------------	
			 	double leatent=table6[HR_table6.get(Type_of_activity.getText(),Type_of_application.getText())][HC_table6.get("leatent heat, w")];
			 	Qleatent.setText(String.valueOf(leatent));
	   //5 --------------------------------------------------------------------------------
			 	double Ri=HR_element.get(IElement.getText(), IHeat_direction.getText()).get(IMaterial_type.getText());
			 	double R0=array_table4[HR_wind_speed.get(Element.getText(), Material_type.getText())][HC_wind_speed.get(Speed.getText())];
		
				double Sum_X=0, Sum_K=0;
				String  X[]=X_thichness.getText().split("[, ]+");
				for (String a : X) {
					Sum_X+=Double.valueOf(a);
				} 
				
			String  Material_number[]=material_number.getText().split("[, ]+");
			String  Materials[]=Material.getText().split(",");
			for(int i=0; i<Material_number.length;i++) { 
				Sum_K+= array_table5[HR_material.get(Integer.parseInt(Material_number[i]),Materials[i])][ HC_material.get("thermal conductivity w / mc")];
 			} 
		 
				System.out.println(Sum_K);
				double Rgap=0;
				 if(gap_thichness.getText().equals(null))
					 Rgap =air_gas[HR_air_gas.get(gap_thichness.getText(),gap_material.getText())][HC_air_gas.get(Heat_flow_direction)];
				 double rtotal=Ri+R0+(Sum_X/Sum_K)+Rgap;
				  
			Rtotal.setText(String.valueOf(rtotal ));
			 	
	  //6 ----------------------------------------------------------------------------
			 double uwall=1/rtotal;
			Qwall.setText(String.valueOf(uwall ) );
     //7 ---------------------------------------------------------------------------------
			
			String  DT[]=Dt.getText().split("[, ]+");
			double dt=Double.valueOf(DT[0])-Double.valueOf(DT[1]);
			double qwin=uwall*Double.valueOf(Awall.getText())*dt;
			Qwin.setText(String.valueOf(qwin) );
	//8 ----------------------------------------------------
			String  XY[]=xy.getText().split("[, ]+");
			//Double.valueOf(XY[0])
			//Double.valueOf(XY[1])
			
 // 9 ------------------------------------------------------- 
			String  awin_adoor[]=Awin_Adoor.getText().split("[, ]+");
			double Awin=Double.valueOf(awin_adoor[0]);
          
			double Uwin= material_type[HR_material_type.get(window_material_type_and_peand_frame.getText())][HC_material_type.get(single.getText()).get(Speed.getText())];
		//double qwin =Uwin*dt*Awin;
		
		//10 --------------------------------------------------
		 double Adoor=Double.valueOf(awin_adoor[1]);
		//double 
		 
		
		double Udoor=Dsss_type[HR_Dsss_type.get(door_type.getText())][HC_Dsss_type.get(doorList.getSelectedItem())];
		 double qdoor=Udoor*Adoor*dt;
		Qdoor.setText(String.valueOf(qdoor));
				//System.out.print();
		//11 ------------------------------------------
		String  xin_kin[]=Xin_Kin.getText().split("[, ]+");
		double Xin=Double.valueOf(xin_kin[0]);
		double Kin=Double.valueOf(xin_kin[0]);
		double Rbelow=Xin/Kin;
		double Ubelow=0 ,qbelow ,abelow;
        double depthbelow=Double.valueOf(Depth_Below.getText());
        int colum=0;
        abelow=Double.valueOf(Abelow.getText());
	       
            if(depthbelow<3.0) colum=0;
			if(0.3 < depthbelow&& depthbelow<0.6) colum=1;
			if(0.6<depthbelow&&depthbelow<0.9) colum=2;
			if(0.9<depthbelow&&depthbelow<1.2) colum=3;
			if(1.2<depthbelow&&depthbelow<2.5) colum=4;
			if(2.5<depthbelow&&depthbelow<1.8) colum=5;
			if(1.8<depthbelow&&depthbelow<2.1) colum=6;
			
		if(comboBox.getSelectedItem().equals("uninsulated" )) {
			
			Ubelow=depth_below_grade[HR_depth_below_grade.get(colum )][HC_depth_below_grade.get("uninsulated",0.0)];
		}else {
			Ubelow=depth_below_grade[HR_depth_below_grade.get(colum)][HC_depth_below_grade.get("insulated",Rbelow)];
		}
		/* dt مش متأكد منها */
		double ddt=Double.valueOf(DT[1])-8;
		qbelow=Ubelow*abelow*ddt;
		Qbelwor.setText(String.valueOf(qbelow ));
		//System.out.println(depth_below_grade[HR_depth_below_grade.get("0.9-1.2" )][HC_depth_below_grade.get("uninsulated")]);
		// 12 ----------------------------------------------------
		double afloor=Double.valueOf(Afloor.getText());
		double Ubit=depth_below[HR_depth_below.get(Depth_below_grade.getText())][HC_depth_below.get(Narrwest.getText())];
		 
			 
		double Qfloorbelow=Ubit*afloor*ddt;
		//13--------------------------------------------------------------------
		double Qceilin=0;
		//14 -------------------------------------------------------------
		double qtotal=qwin+qbelow+Qfloorbelow+qdoor+Qceilin;
		Qtotal.setText(String.valueOf(qtotal));
		//15 -----------------------------------------------------
		double dtTunconditioned=(2/3)*dt;
		Tuncond_itioned.setText(String.valueOf(dtTunconditioned));
		//16 --------------------------------------------------
		double QQ=uwall*Double.valueOf(Awall.getText())*dtTunconditioned;
		//17 --------------------------------------------------
		double Tanneated=0.5*dt;
		tanneated.setText(String.valueOf(Tanneated));
		//18 --------------------------------------------------
		double Tasuusaal;
		//19 --------------------------------------------------
		double dtTauusaal=Double.valueOf(DT[0])+8;
		Tauusaal.setText(String.valueOf(dtTauusaal));
		
		//20 --------------------------------------------------
		double QTauusaal=uwall*Double.valueOf(Awall.getText())*dtTauusaal;
		
		
			}
		});

		btnNewButton.setBounds(700, 499, 140, 46);
		frame.getContentPane().add(btnNewButton);
		
		
		
	

		 
 
 
		
		
		
		
		
	
		 
		 
		//System.out.print("");
	}
}
