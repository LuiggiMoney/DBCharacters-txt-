package DB;

import java.io.IOException;

/**
 * @author LuiggiFernandez
 */
public class CharactersDB {
    
    static String FirstName;
    static String LastName;
    static String Gender;
    static int Age;
    static String Role;
    static boolean hasJob;
    
    public static int Random(int Options) {
        int Random = (int)(Math.random()*Options);
        return Random;
    }
    
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            DBInternal Characters = new  DBInternal(FirstName(), LastName(), Gender(), Age(), Role(), hasJob());
        }
    }    
    
    public static String FirstName() {
        String FirstNames[] = {"Alex", "Andy", "Blake", "Brook", "Campbell", "Chris", "Delta", "Dorian", "Eli", "Emery", "Finley", "Frances", "Gabriel", "Glenn", "Harley", "Hunter", "Jean",  "Jesse", "Kaden", "Kai", "Lake", "Lou", "Mason", "Max", "Pat", "Phoenix", "Ray", "Reese", "Sage", "Sydney", "Tanner", "Tatum", "West", "Winter"};
        FirstName  = FirstNames[Random(34)];
        return FirstName;
    }
    public static String LastName() {
        String LastNames[] = {"Abernathy", "Babbit", "Caffee", "Dabkowski", "Enoch", "Fernandez", "Goude", "Hutch", "Ivanoff", "Jeralds", "Kwong", "Lablanc", "Myrtle", "Najar", "Ozuna", "Pagani", "Quirk", "Rosberg", "Szymkowiak", "Taft", "Umbridge", "Verner", "Wei", "Xin", "Yi", "Zak"};
        LastName  = LastNames[Random(25)];
        return LastName;
    }
    
    public static String Gender() {
        String Genders[] = {"Male",  "Female"};
        Gender = Genders[Random(2)];
        return Gender;
    }
    
    public static int Age() {
        int Ages[] = {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75};
        Age = Ages[Random(58)];
        return Age;
    }
    
    public static String Role() {
        String Roles[] = {"Protagonist", "Antagonist", "Mentor", "Tempter",  "Sidekick", "Skeptic", "Emotional", "Logical", "Extra"};
        Role = Roles[Random(9)];
        return Role;
    }
    
    public static boolean hasJob() {
        boolean hasJobs[] = {true, false};
        hasJob = hasJobs[Random(2)];
        return hasJob;
    }
    
}
