public class App {
    public static void main(String[] args) throws Exception {
       int ika = 45;   

// Tulostusehdot   
System.out.println("github harjoitus");
System.out.println("Olet " + (ika) + " vuotias");

if (ika > 0 && ika < 18) { 

System.out.println("Olet alaikäinen"); 


} else if (ika >= 65) { 

System.out.println("Olet eläkeläinen"); 

} else { 

System.out.println("Olet aikuinen"); 

  }
  
  if (ika >= 15) { 

System.out.println("Saat ajaa mopoa"); 

}
else if (ika > 0 && ika < 15) {
System.out.println("Et saa ajaa mopolla");
} 

if (ika >= 16 && ika <= 17) {
    System.out.println("voit ajaa kevarilla");
}
if (ika == 18) {
    System.out.println("Olet juuri tullut täysi-ikäiseksi voit ajaa autoa");
}
else if (ika >= 19) {
    System.out.println("Voit ajaa autoa");
}
else {
    System.out.println("Et voi ajaa autoa vielä");
}
if (ika % 10 == 0 && ika < 100){
    System.out.println("Onnea tasavuodesta " + (ika) + "v");
}
if (ika == 100){
    System.out.println("Onnea " + (ika) + "v");
    System.out.println("Onnea " + (ika) + "v");
    System.out.println("Onnea " + (ika) + "v");
}
if (ika >= 58){
    System.out.println("Voit jäädä varhais eläkkeelle");
}
if (ika >= 40 && ika <= 50){
    System.out.println("Parasta keski-ikää!");
    
}
    }
}

