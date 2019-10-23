import java.awt.EventQueue;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.JFrame;

public class main2 {

	private JFrame frame;

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
		 // ----------------------------------
		 Map<String, Integer> HR_material_type = new Hashtable<>(); 
		 HR_material_type.put("wood",0);
		 HR_material_type.put("alumiunm",1);
		 HR_material_type.put("steel",2);
		 HR_material_type.put("pvc",3);
		 Map<String, Map<String , Integer>> HC_material_type = new Hashtable<>(); 
		 Map<String , Integer> map = new Hashtable<String , Integer>();;
		 map.put("0.5", 0);
		 map.put("0.5-5.0", 1);
		 map.put("5.0", 2);
		 HC_material_type.put("single_glass",map);
		 
		 map = new Hashtable<String , Integer>();;
		 map.put("0.5", 3);
		 map.put("0.5-5.0", 4);
		 map.put("5.0", 5);
		 HC_material_type.put("gap",map);
		 
		 double material_type[][]= {
				 { 3.8, 4.3 , 5   , 2.3, 2.5 , 2.7 },
				 { 5.0, 5.6 , 6.7 , 3, 3.2 , 3.5 },
				 { 5.0, 5.6 , 6.7 , 3, 3.2 , 3.5 },
				 { 3.8, 4.3 , 5   , 2.3, 2.5 , 2.7 }, 
				 }; 
		 
		// System.out.println( material_type[HR_material_type.get("wood")][HC_material_type.get("gap").get("0.5")]);
	//--------------------------
		 Map<String, Integer> HC_air_gas = new Hashtable<>(); 
		 HC_air_gas.put("horizontal or upward", 0);
		 HC_air_gas.put("downward", 1);
		
		 Map<String, Map<String , Integer>> HR_air_gas = new Hashtable<>(); 
		 map = new Hashtable<String , Integer>();;
		 map.put("construction material", 0);
		 map.put("metals", 1);
		 
		 map = new Hashtable<String , Integer>();;
		 map.put("construction material", 2);
		 map.put("metals", 3);
		 HR_air_gas.put("5 mum",map);
		 HR_air_gas.put("20 mun or mum",map);
		 
		 double air_gas[][]= {
				 { 0.11, 0.11  },
				 { 0.18, 0.18  },
				 { 0.18, 0.20  },
				 { 0.53, 1.06 },
				  
				 }; 
		
				// System.out.println( air_gas[HR_air_gas.get("5 mum").get("metals")][HC_air_gas.get("downward")]);
		 //-------------------------------------
		 Map<String, Integer > HR_depth_below_grade = new Hashtable<>(); 
		 HR_depth_below_grade.put("0.0-0.3",0);
		 HR_depth_below_grade.put("0.3-0.6",1);
		 HR_depth_below_grade.put("0.6-0.9",2);
		 HR_depth_below_grade.put("0.9-1.2",3);
		 HR_depth_below_grade.put("1.2-1.5",4);
		 HR_depth_below_grade.put("2.5-1.8",5); 
		 HR_depth_below_grade.put("1.8-2.1",6);
		 Map<String,  Integer> HC_depth_below_grade = new Hashtable<>(); 
		 HC_depth_below_grade.put("uninsulated",0);
		 HC_depth_below_grade.put("0.715",0);
		 HC_depth_below_grade.put("1.430",0);
		 HC_depth_below_grade.put("2.145",0);
		 
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
	//-----------------------------------------
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
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
