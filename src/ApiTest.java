import com.pdfcrowd.Pdfcrowd;

import java.io.IOException;

    public class ApiTest {
        public static void main(String[] args) throws IOException, Pdfcrowd.Error {
            try {
                // create the API client instance
                Pdfcrowd.HtmlToPdfClient client =
                        new Pdfcrowd.HtmlToPdfClient("demo", "ce544b6ea52a5621fb9d55f8b542d14d");
                // run the conversion and write the result to a file
                client.convertFileToFile("CV.html", "MyCV.pdf");
            }
            catch(Pdfcrowd.Error why) {
                // report the error
                System.err.println("Pdfcrowd Error: " + why);

                // rethrow or handle the exception
                throw why;
            }
            catch(IOException why) {
                // report the error
                System.err.println("IO Error: " + why.getMessage());

                // rethrow or handle the exception
                throw why;
            }
        }
    }

