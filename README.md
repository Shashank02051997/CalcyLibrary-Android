# CalcyLibrary-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-11%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=11)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/Shashank02051997/CalcyLibrary-Android.svg)](https://jitpack.io/#Shashank02051997/CalcyLibrary-Android)
## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	compile 'com.github.'
}
```
## Usage

### Java (Syntax)


```
Calculate.Hypotenuse(adjacent_side,opposite_side);
Calculate.Body_Mass_Index(bodyweight_in_KG,height_in_m);
Calculate.Geometric_Progression(first_term,common_difference,nth_term);
Calculate.Geometric_Progression(first_term,common_difference,nth_term);
Calculate.Arithmetic_Progression(first_term,common_difference,nth_term).getSumofnthtermofAP();
Calculate.Arithmetic_Progression(first_term,common_difference,nth_term).getnthtermofAP();
Calculate.Check_Number_is_Prime_or_Not(number);
Calculate.Check_Number_is_Armstrong_or_Not(number);
Calculate.Check_Number_is_Strong_or_Not(number);
Calculate.Check_Number_is_Perfect_or_Not(number);
Calculate.Roman_Numerals(number);
Calculate.HCF(x,y);
Calculate.LCM(x,y);
Calculate.Compound_Interest(principal_amount,interest,compounds_per_year,term);
Calculate.Simple_Interest(principal_amount,interest,year);
Calculate.Triangle_Area(a,b,c);
Calculate.Triangle_Perimeter(a,b,c);
Calculate.Rectangle_Area(length,breadth);
Calculate.Rectangle_Perimeter(length,breadth);
Calculate.Square_Area(side);
Calculate.Rhombus_Area(diagonal_d1,diagonal_d2);
Calculate.Trapezium_Area(base_a,base_b,height);
Calculate.Circumference_of_Circle(radius);
Calculate.Circle_Area(radius);
Calculate.Volume_of_Cuboid(length,base,height);
Calculate.TSA_of_Cuboid(length,base,height);
Calculate.Volume_of_Cube(edge);
Calculate.TSA_of_Cube(edge);
Calculate.Volume_of_Cylinder(radius,height);
Calculate.TSA_of_Cylinder(radius,height);
Calculate.CSA_of_Cylinder(radius,height);
Calculate.Volume_of_Cone(radius,height);
Calculate.TSA_of_Cone(radius,height);
Calculate.CSA_of_Cone(radius,height);
Calculate.Volume_of_Frustum_of_Cone(radius_of_base,radius_of_top,height);
Calculate.Volume_of_Sphere(radius);
Calculate.SurfaceArea_of_Sphere(radius);
Calculate.Volume_of_Hemisphere(radius);
Calculate.CSA_of_Hemisphere(radius);
Calculate.TSA_of_Hemisphere(radius);
Calculate.Distance_btw_points(x1,y1,x2,y2);

```
### For Example

```
Calculate.Circle_Area(5);
```
This line returns the result in double. For example double area=Calculate.Circle_Area(5);

```
Calculate.Volume_of_Cube(15);;
```
This line returns the result in double. For example double area=Calculate.Volume_of_Cube(15);

```
Calculate.Volume_of_Cube(15);;
```
This line returns the result in double. For example double area=Calculate.Volume_of_Cube(15);

For find Arithmetic_Progression

```
Calculate.Arithmetic_Progression(1,5,10).getSumofnthtermofAP();
Calculate.Arithmetic_Progression(1,5,10).getnthtermofAP();
```
First Line return the sum of nth term of AP and the second line return the nth term of AP.

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/Shashank02051997/CalcyLibrary-Android/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2016 Shashank Singhal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
