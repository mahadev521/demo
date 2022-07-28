import java.awt.*;
import java.applet.*;

public class FunnyClown extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawString("See!  A Funny Clown=)", 30, 30 );

        //Draw a beautiful sky
        setBackground(Color.cyan);

         //Grass
        g.setColor(Color.green);
        g.fillRect(0,580,1500,3000);

        //Draw a round face
        g.setColor(Color.white);
        g.fillArc(555,300,140,150,0,360);

        //Eyes
        g.setColor(Color.black);
        g.fillArc(600,360,15,20,0,360);
        g.fillArc(640,360,15,20,0,360);

        //Smile
        g.setColor(Color.red);
        g.drawArc(615,420,20,8,190,200);

        //Hat
        g.setColor(Color.pink);
        g.fillArc(520,290,205,60,0,360);
        g.fillRect(568,220,115,100);
        g.fillArc(568,200,115,50,0,360);

        //Ribbons
        g.setColor(Color.white);
        g.fillRect(568,285,115,15);

        //Body
        g.setColor(Color.white);
        g.fillRect(543,470,25,70);
        g.fillRect(683,470,25,70);
        g.fillArc(543,535,20,25,0,360);
        g.fillArc(685,535,20,25,0,360);

        //T-shirt
        g.setColor(Color.yellow);
        g.fillRect(570,450,110,200);
        int []x1={570,500,570};
        int []y1={450,475,490};
        g.fillPolygon(x1,y1,3);
        int []x2={680,750,680};
        int []y2={450,475,490};
        g.fillPolygon(x2,y2,3);

        //Pants
        g.setColor(Color.blue);
        g.fillRect(570,580,110,150);
        g.setColor(Color.green);
        int []x3={625,598,638};
        int []y3={600,730,730};
        g.fillPolygon(x3,y3,3);

        //Shoes
        g.setColor(Color.black);
        g.fillArc(570,728,35,30,0,360);
        g.fillArc(642,728,35,30,0,360);

        //Clouds
        g.setColor(Color.white);
        g.fillArc(100,100,60,60,0,360);
        g.fillArc(120,120,70,70,0,360);
        g.fillArc(120,80,70,70,0,360);
        g.fillArc(160,70,80,80,0,360);
        g.fillArc(190,75,90,90,0,360);
        g.fillArc(240,85,60,60,0,360);
        g.fillArc(220,110,70,70,0,360);
        g.fillArc(170,120,70,70,0,360);

        //Sun
        g.setColor(Color.yellow);
        int x[]={900,1080,1180,980,1080,1180,800,900,1000};
        int y[]={100,80,150,80,100,80,110,100,60};
        g.fillPolygon(x,y,9);
        g.setColor(Color.red);
        g.fillArc(1015,50,80,80,0,360);

        //Flower
        g.setColor(Color.magenta);
        g.fillArc(80,500,20,20,0,360);
        g.fillArc(95,485,20,20,0,360);
        g.fillArc(110,500,20,20,0,360);
        g.fillArc(86,515,20,20,0,360);
        g.fillArc(103,515,20,20,0,360);
        g.setColor(Color.yellow);
        g.fillArc(95,503,20,20,0,360);
        g.setColor(Color.darkGray);
        g.fillRect(103,525,5,70);

        g.setColor(Color.magenta);
        g.fillArc(300,500,20,20,0,360);
        g.fillArc(315,485,20,20,0,360);
        g.fillArc(330,500,20,20,0,360);
        g.fillArc(306,515,20,20,0,360);
        g.fillArc(323,515,20,20,0,360);
        g.setColor(Color.yellow);
        g.fillArc(315,503,20,20,0,360);
        g.setColor(Color.darkGray);
        g.fillRect(323,525,5,70);

        g.setColor(Color.magenta);
        g.fillArc(190,500,20,20,0,360);
        g.fillArc(205,485,20,20,0,360);
        g.fillArc(220,500,20,20,0,360);
        g.fillArc(196,515,20,20,0,360);
        g.fillArc(217,515,20,20,0,360);
        g.setColor(Color.yellow);
        g.fillArc(205,503,20,20,0,360);
        g.setColor(Color.darkGray);
        g.fillRect(215,525,5,70);

        //House
        g.setColor(Color.gray);
        int []x4={850,1050,1250};
        int []y4={300,200,300};
        g.fillPolygon(x4,y4,3);
        g.setColor(Color.lightGray);
        g.fillRect(850,300,400,300);


        //Window
        g.setColor(Color.cyan);
        g.drawRect(1100,350,100,100);
        g.drawLine(1100,400,1200,400);
        g.drawLine(1150,350,1150,450);

        //Door
        g.setColor(Color.darkGray);
        g.fillRect(900,400,130,200);
        g.setColor(Color.yellow);
        g.fillArc(930,480,10,10,0,360);





    }
}