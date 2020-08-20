import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Games.class)
@interface Game{
	String name();
	String day();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Games{
	Game[]
  value();}

  @Game(name = "Cricket", day= "Saturday")
  @Game(name= "Football", day= "sunday")
  @Game(name= "Hookie", day= "Monday")

public class RepeatingAnnotationExample {

	public static void main(String[] args){
		Game[] game = RepeatingAnnotationExample.class.getAnnotationsByType(Game.class);
		for (Game game1 : game){
			System.out.println(game1.name()+" "+"on"+" "+ game1.day());
		}
	}
}
