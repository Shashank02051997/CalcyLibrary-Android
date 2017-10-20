package com.shashank.sony.calcylib;

import android.widget.Toast;

public class Calculate {
    public static double Body_Mass_Index(double bodyweight_in_KG,double height_in_m) {
        double BMI=bodyweight_in_KG/height_in_m;
        return BMI;
    }
    public static double Hypotenuse(double adjacent_side,double opposite_side) {
        double hy=Math.sqrt(adjacent_side*adjacent_side+opposite_side*opposite_side);
        return hy;
    }
    public static int Geometric_Progression(int first_term,int common_difference,int nth_term){
        int gp=(int)(first_term*Math.pow(common_difference,nth_term-1));
        return  gp;
    }
    public static AP Arithmetic_Progression(int first_term, int common_difference, int nth_term){
        int ap=first_term+(nth_term-1)*common_difference;
        int sap=(nth_term/2)*(2*first_term+(nth_term-1)*common_difference);
        AP aps=new AP(ap,sap);
        return aps;
    }
    public static String Check_Number_is_Prime_or_Not(int number){
        int a=0;
        String msg;
        for(int i=1;i<=number;i++)
        { if(number%i==0)
            a++;
        }
        msg=number+" is not a Prime number";
        if(a==2)
            msg=number+" is Prime number";
        return msg;
    }
    public static String Check_Number_is_Armstrong_or_Not(int number){
        int q,t,c=0,r,s=0;
        String msg;
        q=number;
        t=number;
        while(q!=0)
        { q=q/10;
          c++;
        }
        while(t!=0)
        { r=t%10;
          s=s+(int) Math.pow(r,c);
          t=t/10;
        }
        if(s==number)
        msg=number+" is a Armstrong Number";
        else
        msg= number+" is not a Armstrong Number";
        return msg;
    }
    public static String Check_Number_is_Strong_or_Not(int number){
        int p,r,f,i,s=0;
        String msg;
        p=number;
        while(number!=0)
        { r=number%10;
          f=1;
          for(i=1;i<=r;i++)
          f=f*i;
          s=s+f;
          number=number/10;
        }
        if(p==s)
        msg=p+" is a strong no.";
        else
        msg=p+" is not a strong no.";
        return msg;
    }
    public static String Check_Number_is_Perfect_or_Not(int number){
        int i,s=0;
        String msg;
        for(i=1;i<=number/2;i++)
        { if(number%i==0)
          s=s+i;
        }
        if(s==number)
        msg=number+" is a Perfect Number";
        else
        msg=number+" is not a Perfect Number";
        return msg;
    }
    public static String Roman_Numerals(int number){
        if(number>0&&number<4000)
        { String thou[]={"","M","MM","MMM"};
          String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
          String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
          String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
          int th=number/1000;
          int h=(number/100)%10;
          int t=(number/10)%10;
          int u=number%10;
          return ""+thou[th]+hund[h]+ten[t]+unit[u];
        }
        else
        return "You entered a number out of Range. Please enter a number in the range [1-3999]";
    }
    public static int HCF(int x, int y){
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number

        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
    public static int LCM(int x, int y){
        int a;
        a = (x > y) ? x : y; // a is greater number
        while(true)
        { if(a % x == 0 && a % y == 0)
          return a;
          ++a;
        }
    }
    public static double Compound_Interest(int principal_amount,int interest,int compounds_per_year,int term){
        double ci=principal_amount*(Math.pow((1+interest/compounds_per_year),compounds_per_year*term));
        return ci;
    }
    public static double Simple_Interest(int principal_amount,int interest,int year){
       double si=principal_amount*interest*year/100;
       return si;
    }
    public static double Triangle_Area(double a,double b,double c){
      double ar,s;
      s=(a+b+c)/2;
      ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      return ar;
    }
    public static double Triangle_Perimeter(double a,double b,double c){
      double s;
      s=a+b+c;
      return s;
    }
    public static double Rectangle_Area(double length,double breadth){
      double ar=length*breadth;
      return ar;
    }
    public static double Perimeter_Area(double length,double breadth){
      double per=2*(length+breadth);
      return per;
    }
    public static double Square_Area(double side){
      double ar=side*side;
      return ar;
    }
    public static double Square_Perimeter(double side){
      double per=4*side;
      return per;
    }
    public static double Rhombus_Area(double diagonal_d1,double diagonal_d2){
      double ar=diagonal_d1*diagonal_d2/2;
      return ar;
    }
    public static double Trapezium_Area(double base_a,double base_b,double height){
        double ar=((base_a+base_b)/2)*height;
        return ar;
    }
    public static double Circumference_of_Circle(double radius){
        double circum=2*3.14*radius;
        return circum;
    }
    public static double Circle_Area(double radius){
        double ar=3.14*radius*radius;
        return ar;
    }
    public static double Volume_of_Cuboid(double length,double base,double height){
        double v=length*base*height;
        return v;
    }
    public static double TSA_of_Cuboid(double length,double base,double height){
        double tsa=2*(length*base+base*height+height*length);
        return tsa;
    }
    public static double Volume_of_Cube(double edge){
        double v=edge*edge*edge;
        return v;
    }
    public static double TSA_of_Cube(double edge){
        double tsa=6*edge*edge;
        return tsa;
    }
    public static double Volume_of_Cylinder(double radius,double height){
        double v=3.14*radius*radius*height;
        return v;
    }
    public static double TSA_of_Cylinder(double radius,double height){
        double tsa=2*3.14*radius*(radius+height);
        return tsa;
    }
    public static double CSA_of_Cylinder(double radius,double height){
        double csa=2*3.14*radius*height;
        return csa;
    }
    public static double Volume_of_Cone(double radius,double height){
        double v=3.14*radius*height/3;
        return v;
    }
    public static double TSA_of_Cone(double radius,double length){
        double tsa=3.14*radius*(length+radius);
        return tsa;
    }
    public static double CSA_of_Cone(double radius,double length){
        double csa=3.14*radius*length;
        return csa;
    }
    public static double Volume_of_Frustum_of_Cone(double radius_of_base,double radius_of_top,double height){
        double v=3.14*height*(radius_of_base*radius_of_base+radius_of_top*radius_of_top+radius_of_base*radius_of_top);
        return v;
    }
    public static double Volume_of_Sphere(double radius){
        double v=(4*3.14*Math.pow(radius,3))/3;
        return v;
    }
    public static double SurfaceArea_of_Sphere(double radius){
        double ar=4*3.14*radius*radius;
        return ar;
    }
    public static double Volume_of_Hemisphere(double radius){
        double v=(2*3.14*Math.pow(radius,3))/3;
        return v;
    }
    public static double CSA_of_Hemisphere(double radius){
        double csa=2*3.14*radius*radius;
        return csa;
    }
    public static double TSA_of_Hemisphere(double radius){
        double tsa=3*3.14*radius*radius;
        return tsa;
    }
    public static double Distance_btw_points(double x1,double y1,double x2,double y2){
        double dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return dis;
    }

}
