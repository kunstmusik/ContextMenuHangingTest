package com.kunstmusik.contextmenuhangingtest;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javax.swing.JFrame;

public class HangingTest {
    
    public static void main(String args[]) {
         var frame = new JFrame("Hanging Test (macOS)");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         final var jfxPanel = new JFXPanel();
         
         Platform.runLater(() -> {
             
             var ctxMenu = new ContextMenu(
                     new MenuItem("Test")
             );
             
             final var btn = new Button("Show Context Menu");
             btn.setOnAction(evt -> {
                 ctxMenu.show(btn, Side.TOP, USE_PREF_SIZE, USE_PREF_SIZE);
             });
             
             var s = new Scene(btn);
             jfxPanel.setScene(s);
         });
         
         frame.setContentPane(jfxPanel);
         
         frame.setSize(200, 200);
         
         frame.setVisible(true);
    }
}
