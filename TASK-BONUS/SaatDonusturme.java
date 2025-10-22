public class SaatDonusturme {
    public static void main(String[] args){
		int Giren = 754454;
		int saat = Giren / 3600;
		int dakika = (Giren % 3600) / 60;
		int saniye = Giren % 60;
		System.out.println(Giren + (" saniye = ") + saat + " saat " + dakika + " dakika " + saniye + " saniye");
    }
}