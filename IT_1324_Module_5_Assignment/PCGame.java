public class PCGame extends Game
{
  private int mRam;
  private int megInstall;
  private int reqCpu;
 

 public PCGame(int newMRam, int newMegInstall,int newReqCpu,String newDescription)
     {
       super(newDescription);
       setMRam(newMRam);
       setMegInstall(newMegInstall);
       setReqCpu(newReqCpu);
       setDescription(newDescription);
      }
      
      public void setMRam( int newMRam)
      {
       mRam = newMRam;
      }
      
      public void setMegInstall( int newMegInstall)
      {
       megInstall = newMegInstall;
      }
      
      
     public void setReqCpu(int newReqCpu)
     {
       reqCpu = newReqCpu;
     }
     
      public int getMRam()
      {
       return mRam;
      }
      
       public int getMegInstall()
      {
       return megInstall;
      }
      
      public int getReqCpu()
      {
       return reqCpu;
      }


     
     public String toString()
     {
      return (" Required Megabytes of Ram: " +getMRam()+"\n"+
               " Number of Megabytes need to install: " + getMegInstall()+"\n"+
               " Minimum number of GHz:" + getReqCpu()+ "\n" +
               " Description: " + getDescription());
      } 
   }
    
      