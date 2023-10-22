package zad14;

import java.util.HashMap;
import java.util.Map;

public class ParseMolecule {

    public static Map<String, Integer> getAtoms(String formula) {

        Map<String, Integer> parseMolecule = new HashMap<>();
        char[] formulaCharArray = formula.toCharArray();
        String atom = "";
        for (int i = 0; i < formulaCharArray.length; i++) {
            if (formulaCharArray[i] >= '0' && formulaCharArray[i] <= '9') {

                parseMolecule.put(atom, Character.getNumericValue(formulaCharArray[i]));
                atom = "";
            } else {
                atom = atom.concat(String.valueOf(formulaCharArray[i]));
            }
        }
        if (!atom.equals("")){
            parseMolecule.put(atom, 1);
        }

        Map<String, Integer> parseMoleculeSort = new HashMap<>();

//        for(Map.Entry<String,Integer> entry : parseMolecule.entrySet()){
//            if (entry.getKey().length() > 1){
//                for (int i = 0; i < entry.getKey().length(); i++) {
//                    if(parseMoleculeSort.containsKey(String.valueOf(entry.getKey().charAt(i)))) {
//                        parseMoleculeSort.put(String.valueOf(entry.getKey().charAt(i)),parseMoleculeSort.get(String.valueOf(entry.getKey().charAt(i))) + entry.getValue());
//                    }else {
//                        parseMoleculeSort.put(String.valueOf(entry.getKey().charAt(i)), entry.getValue());
//                    }
//                }
//            }else {
//                if(parseMoleculeSort.containsKey(entry.getKey())){
//                    parseMoleculeSort.put(entry.getKey(), parseMoleculeSort.get(entry.getKey()) + entry.getValue());
//                }else {
//                    parseMoleculeSort.put(entry.getKey(), entry.getValue());
//                }
//            }
//        }




        return parseMolecule;
    }

    public static void main(String[] args) {

        String water = "K4[ON(SO3)2]2";

        Map<String, Integer> atoms = getAtoms(water);

        atoms.entrySet().stream().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));


    }

}
