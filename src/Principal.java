import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Principal {
    public static void main(String[] args) {
        URI direccion = URI.create("http://foo.com/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://foo.com/"))
                .build();

    }
}
