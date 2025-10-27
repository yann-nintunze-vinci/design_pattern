import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTexte {
  private ArrayList<Observer> observers;

  public AnalyseurDeTexte() {
    observers = new ArrayList<>();
  }

  public void registerObservers(Observer... observers) {
    this.observers.addAll(List.of(observers));
  }

  public void lireFichier(String nomFichier) {
    try {
      BufferedReader lecteurAvecBuffer = new BufferedReader(
          new FileReader(nomFichier));

      String ligne;
      while ((ligne = lecteurAvecBuffer.readLine()) != null) {
        for (Observer observer : observers) {
          observer.traiterLigne(ligne);
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Erreur d'ouverture");
    } catch (IOException e) {
      System.out.println("Erreur de lecture");
    }
  }
}
