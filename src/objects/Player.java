package objects;

/**
 *
 * @author malinda
 */
public class Player 
{
    /**
     * Private variables
     **/
    
    private String name;
    private String zodiacSign;
    private String description;
    private int year;
    private int month;
    private int date;
    private int age;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the zodiacSign
     */
    public String getZodiacSign() {
        return zodiacSign;
    }

    /**
     * @param zodiacSign the zodiacSign to set
     */
    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the date
     */
    public int getDay() {
        return date;
    }

    /**
     * @param day the date to set
     */
    public void setDay(int day) {
        this.date = day;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
