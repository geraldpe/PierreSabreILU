package histoire;
import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Ronin roro = new Ronin("roro", 60);
		Yakuza yaku = new Yakuza("clan de warsang", "yaku le noir", 54);
		roro.provoquer(yaku);
	}

}
