import java.sql.Date;
import java.sql.Time;

public class ShootingVictim {

  private int dist;
  private java.sql.Date date;
  private java.sql.Time time;

  private String race;
  private int age;

    public void setDist(int dist) {
        this.dist = dist;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDist() {
        return dist;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }
}
