
#include <Servo.h>



char data;
int deg=90,deg2=65,deg3=60,deg4=25;
int LED_INPUT=13;
Servo myservo1,myservo2,myservo3,myservo4;



void setup(){
	Serial.begin(9600);
  myservo1.attach(9);
  myservo2.attach(10);
  myservo3.attach(5);
  myservo4.attach(6);
  myservo1.write(90);
  myservo2.write(65);
  myservo3.write(60);
  myservo4.write(25);
	
}

void loop(){

  if(Serial.available()){
    data=Serial.read(); 
     if(data=='f'){digitalWrite(LED_INPUT,HIGH);}
     if(data=='b'){digitalWrite(LED_INPUT,LOW);}    
     if(data=='d'& deg<180){deg=deg+1;myservo1.write(deg);}    
     if(data=='e'& deg>0){deg=deg-1;myservo1.write(deg);}
     if(data=='a'&deg2<130){deg2=deg2+1;myservo2.write(deg2);}
     if(data=='c'&deg2>0){deg2=deg2-1;myservo2.write(deg2);}
     if(data=='g'&deg3<120){deg3=deg3+1;myservo3.write(deg3);}
     if(data=='h'&deg3>0){deg3=deg3-1;myservo3.write(deg3);}
     if(data=='i'&deg4<50){deg4=deg4+1;myservo4.write(deg4);}
     if(data=='j'&deg4>0){deg4=deg4-1;myservo4.write(deg4);}
     
    }
 

	

}
