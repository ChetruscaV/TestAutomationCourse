package topic7;

import java.io.*;

public class FileManager {

    static void scriereaInformatieiTextInFisier(String caleaCatreFisier, String date) {
        File fisierDatePersoane = new File(caleaCatreFisier);


        try {
            if (!fisierDatePersoane.exists())
                fisierDatePersoane.createNewFile();
            FileWriter writer = new FileWriter(fisierDatePersoane);
            writer.write(date);
            writer.close();

        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

        static void alipireaInformatieiLaFisier (String caleaCatreFisier, String date){
            File fisierDatePersoane = new File(caleaCatreFisier);
            try {
                FileWriter writer1 = new FileWriter(fisierDatePersoane);
                writer1.append(date);
                writer1.close();
            } catch (IOException exception1) {
                System.out.println(exception1);
            }
        }

        static String citireDateDinFisier(String caleaCatreFisier){
          try{
              FileReader reader=new FileReader(caleaCatreFisier);
              return reader.toString();
             }
                  catch(FileNotFoundException e2){
             System.out.println(e2);
           }
            return "";
        }
    }





