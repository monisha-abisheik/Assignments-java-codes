package day5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SequenceOfCharacter {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size:");
	int size=input.nextInt();
	int[] inputArray=new int[size];
	System.out.println("Enter the elements:");
	for(int x=0;x<size;x++)
	{
		inputArray[x]=input.nextInt();
	}
	Map<Integer,Integer> frequencyOfElements=new LinkedHashMap<>();
	for(int i=0;i<inputArray.length;i++) {
	 frequencyOfElements.put(inputArray[i], frequencyOfElements.getOrDefault(inputArray[i],0)+1);
	}
	List sotedArray=new ArrayList();
	frequencyOfElements.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).
	forEach(entry->{
		int key=entry.getKey();
		int value=entry.getValue();
		for(int i=1;i<=value;i++)
		{
			sotedArray.add(key);
		}
	});
	System.out.println(sotedArray);

}}
