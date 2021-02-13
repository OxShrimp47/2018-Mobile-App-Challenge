/*Name:Tommy Lee Truong
Last Edit:Apr 7 2018
Program Name: Off The Grid
 */
public class Timer {
	 public long duration = 0;
	    public long start = 0;
	    public boolean active = false;
	    public void start(){
	        this.start = System.currentTimeMillis();
	        this.active = true;
	    }
	    public void stop(){
	        if (this.active)
	            this.duration += (System.currentTimeMillis() - this.start);
	        this.active = false;
	    }
	    public void reset(){
	        this.duration = 0;
	        this.start = 0;
	        this.active = false;
	    }
	    public void restart(){
	        this.reset();
	        this.start();
	    }
	    public long getmillisec(long t){
	        if (this.active)
	            return t + System.currentTimeMillis() - this.start;
	        else
	            return t;
	    }
	    public long getsec(long t){
	        if (this.active)
	            return (t + System.currentTimeMillis() - this.start)/1000;
	        else
	            return t/1000;
	    }
	    public long getmin(long t){
	        if (this.active)
	            return (t + System.currentTimeMillis() - this.start)/60000;
	        else
	            return t/60000;
	    }
	    public long gethr(long t){
	        if (this.active)
	            return (t + System.currentTimeMillis() - this.start)/3600000;
	        else
	            return t/3600000;
	    }
	    public void reportstudylength(){
	        long hours = gethr(this.duration);
	        long minutes = getmin(this.duration%3600000);
	        long seconds = getsec((this.duration%3600000)%60000);
	        System.out.println(hours +":"+ minutes +":"+ seconds);
	    }
}