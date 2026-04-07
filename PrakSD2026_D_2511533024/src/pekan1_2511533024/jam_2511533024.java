package pekan1_2511533024;

public class jam_2511533024 {
	
		private int hh;
		private int mm;
		private int ss;
		
		public static boolean isValid(int h, int m, int s) {
			return (0<= h && h <= 23) && (0 <= m && m <=59) && (0<= s && s <=59); 
		}
		
		public jam_2511533024(int h, int m, int s) {
			this.hh = h; this.mm = m; this.ss = s;
		}

		public int getHour() {
			return hh;
		}
		public int getMinute() {
			return mm;
		}
		public int getSecond() {
			return ss;
		}
		
		public void setHour(int h) {
			this.hh = h;
		}
		public void getMinute(int m) {
			this.mm = m;
		}
		public void getSecond(int s) {
			this.ss = s;
		}
		
		public int toSeconds() {
			return hh * 3600 + mm *60 + ss; 
		}
		public static jam_2511533024 fromSeconds(int total) {
			if (total < 0) throw new IllegalArgumentException("detik negatif");
			total %= 24 *3600;
			int h = total /3600;
			int m = total/60;
			int s = total %60;
			return new jam_2511533024(h,m,s);
		}
		
		public int compareTo(jam_2511533024 other) {
			return Integer.compare(this.toSeconds(), other.toSeconds());
		}
		
		public boolean equals(Object o) {
			if (!(o instanceof jam_2511533024 j)) return false;
			return hh == j.hh && mm == j.mm && ss == j.ss;
		}
		
		public int hashCode() {
			return java.util.Objects.hash(hh, mm, ss);	
		}
		
		public jam_2511533024 plus(jam_2511533024 other) {	return fromSeconds(this.toSeconds()+other.toSeconds());}
		public jam_2511533024 minus(jam_2511533024 other) { return fromSeconds(Math.floorMod(this.toSeconds()- other.toSeconds(), 24*3600));}
		public jam_2511533024 nextSecond() { return fromSeconds(this.toSeconds() + 1);}
		public jam_2511533024 nextNseconds(int n) {return fromSeconds(this.toSeconds() + Math.max(0, n));  }
		public jam_2511533024 prevSecond() { return fromSeconds(Math.floorMod(this.toSeconds()- 1, 24*3600));}
		public jam_2511533024 prevNseconds(int n) {return fromSeconds(Math.floorMod(this.toSeconds()- Math.max(0, n), 24*3600));}
		
		public static int durasiDetik (jam_2511533024 jaw,jam_2511533024 jakh) {
			return jakh.toSeconds() - jaw.toSeconds();
		}
		public String toString() { return String.format("%02d:%02d:%02d", hh,mm,ss);}
	}

