package Spiel;

public class Frame {
	private int Pkt;
	private int FrameNr;
	public Wurf[] wurf = new Wurf[4];
	
	Frame(int F){
		FrameNr = F+1;
		Pkt = 0;
	}
	
	public void Punkte(int Wurf1,int Wurf2,int ZusatzPkt){
		Pkt = wurf[0].ausgabePunkte() + wurf[1].ausgabePunkte();
	}
	
	public int Ergebnis(){
		return Pkt;
	}
	
	public int Nummer(){
		return FrameNr;
	}
	
		
}
