import java.rmi.*;
import java.rmi.server.*;

public class Reverse extends UnicastRemoteObject implements ReverseInterface {
    public Reverse() throws RemoteException {
        super();
    }

    public String reverseString(String ChaineOrigine) throws RemoteException {
        int longueur = ChaineOrigine.length();
        StringBuffer temp = new StringBuffer(longueur);
        for (int i = longueur; i > 0; i--) {
            temp.append(ChaineOrigine.substring(i - 1, i));
        }
        return temp.toString();
    }
}
