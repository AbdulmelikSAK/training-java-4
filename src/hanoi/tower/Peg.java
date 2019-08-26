package hanoi.tower;

public class Peg {
  private Disk[] disks;
  private int ndisks;

  public Peg(int max) {
    disks = new Disk[max];
  }

  public void push(Disk d) {
	
	  if (ndisks<disks.length) {
		  if (ndisks==0 || disks[ndisks-1].getsize()>d.getsize()) {
			  disks[ndisks]=d;
			  ndisks++;
		  }
		  else {
			  throw new IllegalStateException();
		  }
	  }
	  else {
		  throw new IllegalStateException();
	  }
  }

  public Disk pop() {
	if (ndisks>0) {
		Disk top = disks[ndisks-1];
		disks[ndisks-1]=null;
		ndisks--;
		return top;
	}
	else {
		throw new IllegalStateException();
	}
	  
	  
	  
  }

  //======================================

  public int size() {
    return ndisks;
  }

  Disk peekAt(int depth) {
    return disks[depth];
  }

  boolean legalMove(Peg dst) {
    if (ndisks!=0) {
    	if (dst.ndisks==0) {
    		return true;
    	}
    	if (dst.disks[dst.ndisks-1].getsize()>disks[ndisks-1].getsize()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    else {
    	return false;
    }
  }

}
