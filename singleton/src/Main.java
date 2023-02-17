import com.es2.singleton.Registry;

public class Main {
    public static void main(String[] args) {
        String path, connectionString;
        Registry test = Registry.getInstance();

        path = test.getPath();
        connectionString = test.getConnectionString();
        System.out.println("Caminho: " + path + " | ConnectionString: "+  connectionString);

        test.setPath("Ola");
        test.setConnectionString("Teste");
        System.out.println("Caminho: " + test.getPath() + " | ConnectionString: "+ test.getConnectionString());
    }
}