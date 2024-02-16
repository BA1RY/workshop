package heapdump;

public class OOMGenerator {

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {
    
    System.out.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
    try {
      ProductManager productManager = new ProductManager();
      productManager.populateProducts();
      
    } catch (OutOfMemoryError outofMemory) {
      System.out.println("Catching out of memory error");
   
      throw outofMemory;
    }
  }
}
