package webcaisse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // --- TEST DE CONNEXION ICI ---
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webcaisse", "root", "")) {
            System.out.println("Connexion à la base de données réussie !");
        } catch (SQLException e) {
            System.err.println("Erreur de connexion à la base : " + e.getMessage());
        }
        // -----------------------------
        // Chargement du fichier FXML depuis le dossier resources
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/webcaisse/vue/recherche.fxml"));

        // Création de la scène avec des dimensions par défaut
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        // Paramétrage de la fenêtre principale
        stage.setTitle("WebCaisse - Module GRC");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}