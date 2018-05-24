package DB;
import java.io.*;
/**
 * @author LuiggiFernandez
 */
public class DBInternal {
    
    private String FirstName;
    private String LastName;
    private String Gender;
    private String Age;
    private String Role;
    private String hasJob;
    
    
    
    public DBInternal(String FirstName, String LastName, String Gender,  int Age, String Role, boolean hasJob) throws IOException {
        File CharactersDB = new File("/Users/LuiggiFernandez/Desktop/Progs/Luiggi_Money/txtDataBase/Characters.txt");
        try (FileReader FileReaderCharactersDB = new FileReader(CharactersDB); BufferedReader BufferedReaderChacractersDB = new BufferedReader(FileReaderCharactersDB)) {
            try (FileWriter FileWriterCharactersDB = new FileWriter(CharactersDB, true); BufferedWriter BufferedWriterCharactersDB = new BufferedWriter(FileWriterCharactersDB)) {
                String Line;
                String LineColumn[];
                this.Age = Integer.toString(Age);
                if (hasJob) {
                    this.hasJob = "Employed";
                } else {
                    this.hasJob = "Unemployed";
                }   
                Line = BufferedReaderChacractersDB.readLine();
                while (Line != null) Line = BufferedReaderChacractersDB.readLine();
                if (Line == null) {
                    BufferedWriterCharactersDB.write(Format(FirstName, 9)+"| "+Format(LastName, 12)+"| "+Format(Gender, 7)+"| "+Format(this.Age, 4)+"| "+Format(Role, 13)+"| "+this.hasJob+"\n");
                }
                BufferedWriterCharactersDB.close();
                FileWriterCharactersDB.close();
            }
            BufferedReaderChacractersDB.close();
            FileReaderCharactersDB.close();
        }
        System.out.print(Format(FirstName, 9)+"| "+Format(LastName, 12)+"| "+Format(Gender, 7)+"| "+Format(this.Age, 4)+"| "+Format(Role, 13)+"| "+this.hasJob+"\n");
    }
    
    public static String Format(String WORD, int SIZE){
        while(WORD.length() < SIZE){
            WORD += " "; 
        }
        return WORD;
    }
    
}
