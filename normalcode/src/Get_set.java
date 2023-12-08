public class Get_set {
    private String name; 

    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
    public static void main(String[] args) {
        Get_set myObj = new Get_set();
        myObj.setName("Ujjwal");
        System.out.println(myObj.getName());

    }
}
