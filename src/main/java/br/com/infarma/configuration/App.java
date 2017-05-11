package br.com.infarma.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@Configuration
@EnableAutoConfiguration
@EnableScheduling // É usado no processo do Tabela Service
@ComponentScan(basePackages = "br.com.infarma")
public class App {

  public static void main(String[] args) {
    System.getProperties().put("server.port", 8888);
    SpringApplication.run(App.class, args);

    String url = "http://localhost:8888";

    if (Desktop.isDesktopSupported()) {
      Desktop desktop = Desktop.getDesktop();
      try {
        desktop.browse(new URI(url));
      } catch (IOException | URISyntaxException e) {
        e.printStackTrace();
      }
    } else {
      Runtime runtime = Runtime.getRuntime();
      try {
        if (System.getProperty("os.name").equalsIgnoreCase("Mac OS X")) {
          runtime.exec("open " + url); // MAC
        } else {
          runtime.exec("explorer " + url); // Window
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
