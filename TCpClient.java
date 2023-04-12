import java.io.*;
import java.net.*;
public class TCpClient
{
    public static void main(String args[]) throws io Expection;
    {
        try
        {
            Socket s =new Socket("localhost",5555);
            BufferReader br= new BufferReader(new inputstreamReader(System.in))
            String str;
            System.out.println("Enter character");
            do
            {
                str=br.getline();
                Printwriter pw= new Printwriter(new outputstreamWriter(s.inputstreamReader,true));
            }
            do{
                str=br.readline();
                pw.println(line);

            }
            while(!str.equals("EXIT"));
            s.close();


        }
    }
}