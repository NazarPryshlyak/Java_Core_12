package JavaCore12.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println();
		System.out.println("¬вед≥ть 1 , ўоб вивести масив авто");
		System.out.println("¬вед≥ть 2 , ўоб заповнити масив однаковими значенн€ми авто");
	}

	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
		List <WheelMaterial> wheelMaterialList = new ArrayList<WheelMaterial>();
		//WheelMaterial wheelMaterial[] = WheelMaterial.values();
		
		for(WheelMaterial wheelMaterialValue : WheelMaterial.values()) {
			wheelMaterialList.add(wheelMaterialValue);
		}
		
		while (true) {
			menu();
			
			switch (scanner.nextInt()) {
			
			case 1: {
				
				List <Auto> autoArrayList = new ArrayList<Auto>();
				
				//Auto autoArray[][] = new Auto [getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];
				
				for (int i = 0; i < getRandomValueFromRange(1, 5); i++) {
					List <Auto> autoArrayList1 = new ArrayList<Auto>();
					for (int j = 0; j < getRandomValueFromRange(1, 5); j++) {
						autoArrayList1.add(new Auto(getRandomValueFromRange(100, 250), getRandomValueFromRange(1980, 2018),
					         new Wheel(getRandomValueFromRange(35, 50),
                             wheelMaterialList.get(getRandomValueFromRange(0, wheelMaterialList.size() - 1)).toString()), 
					         new Engine(getRandomValueFromRange(2, 12))));
                    }
					autoArrayList.addAll(autoArrayList1);
                }
               // System.out.println(Arrays.deepToString(autoArray));
                System.out.println(autoArrayList);
                
                break;
            }
            
			case 2: {

				Auto auto = new Auto(getRandomValueFromRange(100, 250), getRandomValueFromRange(1980, 2018),
                               new Wheel(getRandomValueFromRange(35, 50),
                               wheelMaterialList.get(getRandomValueFromRange(0, wheelMaterialList.size() - 1)).toString()),
                               new Engine(getRandomValueFromRange(2, 12)));
				
				List <Auto> autoArrayList = new ArrayList<Auto>();
				
				for (int i = 0; i < getRandomValueFromRange(1, 5); i++) {
					 autoArrayList.add(auto);
				}

         //       Auto autoArray[] = new Auto[getRandomValueFromRange(1, 5)];
         //       Arrays.fill(autoArray, auto);
         //       System.out.println(Arrays.deepToString(autoArray));
               
				System.out.println(autoArrayList);
				
                break;
            }

            default: {

                     System.out.println("¬ведене число повинно бути 1 або 2!");

                break;
		    }	   		
			}
		}
    }
	
	static int getRandomValueFromRange(int min, int max) {
		
		if(min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}
		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}