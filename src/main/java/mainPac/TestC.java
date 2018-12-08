package mainPac;


    import candys.Lollipops;

    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestC {

        /* Содержимое файла file.scv:
         * qwe
         * rty
         * qaz
         */
        private static final String default_filename = "src/main/java/mainPac/file.scv";

        private static String[] readLines(String filename) throws IOException {

            List<String> list = new ArrayList<String>();

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
            fr.close();

            return list.toArray(new String[list.size()]);
        }

        public static void main(String[] args) {



            try {

                String[] arr = readLines(default_filename);
                for (String s : arr) {
//                    System.out.println(s);


                }

            } catch (IOException e) {

                e.printStackTrace();
            }
        }

}
