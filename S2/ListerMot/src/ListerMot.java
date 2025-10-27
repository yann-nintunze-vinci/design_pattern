import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ListerMot {

  private final String fichier;

  public ListerMot(String fichier) {
    this.fichier = fichier;
  }

  public void imprimerSi(Strategy s) {
    try {
      BufferedReader input = new BufferedReader(new FileReader(this.fichier));

      String buffer;
      while ((buffer = input.readLine()) != null) {
        StringTokenizer mots = new StringTokenizer(buffer,
            " \t.;(){}\"'*=:!«»,/\\");
        while (mots.hasMoreTokens()) {
          String mot = mots.nextToken();
          if (s.estValide(mot)) {
            System.out.println(mot);
          }
        }
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
