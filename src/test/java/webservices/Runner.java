package webservices;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        MyParser parser = new MyParser();

        parser.parseGSON();
    }
}
