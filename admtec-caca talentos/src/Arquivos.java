import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos {
    public static void main(String[] args) {

        try {
            File meuObjeto = new File("filename.txt");
            if(meuObjeto.createNewFile()) {
                System.out.println("Arquivo criado " + meuObjeto.getName());
            } else {
                System.out.println("Arquivo já existe");
            }
            FileWriter meuEscritor = new FileWriter("filename.txt");
            meuEscritor.write("Arquivos em JAVA podem ser complicados, mas são divertidos!");
            meuEscritor.close();
            System.out.println("Gravado com sucesso no arquivo.");
            Scanner in = new Scanner(meuObjeto);
            while (in.hasNextLine()) {
                String dados = in.nextLine();
                System.out.println(dados);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Um erro ocorreu");
            e.printStackTrace();
        }

    }
}
