package com.company.excercise.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHttpBrowser implements Browser {

    private HttpURLConnection connnection;

    @Override
    public String get(String urlString) {
        try {
            createConnection(urlString);
            return getResponse();
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private void createConnection(String urlString) throws IOException {
        URL url = new URL(urlString);
        connnection = (HttpURLConnection) url.openConnection();
        connnection.setRequestMethod("GET");
    }

    private String getResponse() throws IOException {
        int status = connnection.getResponseCode();
        Reader streamReader = null;
        if (status > 299) {
            streamReader = new InputStreamReader(connnection.getErrorStream());
        } else {
            streamReader = new InputStreamReader(connnection.getInputStream());
        }

        try (BufferedReader in = new BufferedReader(streamReader)) {
            String inputLine;
            StringBuffer content = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        }
    }
}