package com.juaracoding.UjianKedua;

public class TotalHutang extends PusatAngsuran {

	public TotalHutang (double plafon, double bunga, double lamaPinjaman) {
		
		this.setPlafo(plafon);
		this.setBunga(bunga);
		this.setLamaPinjaman(lamaPinjaman);
		
	}
	
	
	
	 @Override
	public double totalBunga() {
		// TODO Auto-generated method stub
		return (this.getPlafon()*0.012);
	} 
	 
	@Override
	public double totalHutang() {
		// TODO Auto-generated method stub
		return this.totalBunga() + this.getPlafon();
	}
	
	 /*@Override
	public double angsuranBunga() {
		// TODO Auto-generated method stub
		return this.getBunga() / 360 * 30*
	} */
	
	
	@Override
	public double angsuranPokok() {
		// TODO Auto-generated method stub
		return this.getPlafon () / this.getLamaPinjaman();
	}
	
	/* @Override
	public double sisaPinjaman() {
		// TODO Auto-generated method stub
		return this.getPlafon() - this.angsuranPokok ();
	} */
	
	public  void Totalhutang (double plafon) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Total angsuran nasabah setiap bulan sebesar " + this.totalHutang ());
		}
				
		System.out.println("");
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Sisa pinjama  nasabah setiap bulan sebesar " + (this.getPlafon() - this.angsuranPokok()) ) ;
		}
		
		System.out.println("");
		
		
		for (int i = 0; i < 15; i++) {
		System.out.println("Sisa angsuran bunga nasabah setiap bulan sebesar " + (this.totalBunga() / this.getLamaPinjaman() )) ;
	}
 }
}
	


