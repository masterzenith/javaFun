/*
Camel case in Java programming: It consists of compound words or phases such that each word or abbreviation begins with
a capital letter or first word with a lowercase letter, rest all with capital \.

1. Classes and Interfaces:
   + class names should be nouns, in mixed case with first letter of each internal word capitalised. Interfaces name
     should also be capitalised just like class names.
   + Use whole words and must avoid acronyms and abbreviations.

   Example->
   interface Bicycle
   class MountainBike implements Bicycle

   interface Sports
   class Football implements Sports

2. Methods:
   + Methods should be verbs, in mixed case with the first letter lowercase and with the first letter of each internal
     word capitalised.

   Example->
   void changeGear(int newValue)
   void speedUp(int increment)
   void applyBrakes(int decrement)

3. Variables: Variables names should be short yet meaningful
   + should not start with underscore('_') or '$' characters
   + should be mnemonic i.e, designed to indicate to the casual observer the intent of its use.
   + One-character variable names should be avoided except for temporary variables.
   + Common names for temporary variables are i,j,k,m and n for integers; c,d and e for characters.

   Example->
   // variables for the mountainBike class
   int speed = 0;
   int gear = 1;

4. Constant variables:
   + should be all uppercase with words separated by underscores('_')
   + there are various constants used in predefined classes like Float, Long, String etc.

   Example->
   public static final float POSITIVE_INFINITY = 1.0f / 0.0f

5. Packages:
   + The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top
     level domain names, like com, edu, gov, mil, net, org.
   + subsequent components of the package name vary according to an organization's own internal naming conventions.

   Example->
   com.sun.org


 */
public class NamingConventions {
}
