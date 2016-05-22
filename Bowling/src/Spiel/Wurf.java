package Spiel;

public class Wurf {
	
	private int Pkt = 0;
	private boolean Strike = false;
	private boolean Spare = false;
	private int ZusatzPkt;
	
	Wurf(int P,boolean St,boolean Sp){
		Pkt = P;
		Strike = St;
		Spare = Sp;
	
	}
	
	public int ausgabePunkte(){
		return Pkt;
	}
	
	public void berechnungZusatzPkt(){
		if (Strike||Spare){
			ZusatzPkt = 10;
		}else{
			ZusatzPkt = Pkt;
		}
	}
	public String spezialWurf(){
		if (Strike){
			return "Strike";
		}
		else if (Spare){
			return "Spare";
		}else{
			return "Nein";
		}
	}
	}

