import com.inventory.dao.ItemMasterDAO;
import com.inventory.model.ItemMaster;
import org.testng.annotations.Test;

public class TestItemMaster {
  ItemMasterDAO itmdao = new ItemMasterDAO(); 
  ItemMaster itm = new ItemMaster();
 
  @Test
  public void testaddItem() {
    itm.setItem_name("Lassi");
    itm.setCategory("Sweet Drink");
    itm.setPrice(30);
    itm.setQuantity(100);
  }
  
 /* @Test
  public void testdeleteItem() {
    itmdao.delete(itm.getId());
  }*/
}
