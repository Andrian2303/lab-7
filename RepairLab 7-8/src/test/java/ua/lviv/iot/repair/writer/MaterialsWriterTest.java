package ua.lviv.iot.repair.writer;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.repair.manager.BaseMaterialsManagerTest;
import ua.lviv.iot.repair.model.AbstractMaterials;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class MaterialsWriterTest extends BaseMaterialsManagerTest {
  @Test
  public void testWriteToFile() throws IOException {
    try (Writer fileWriter = new FileWriter("Materials.csv")) {
      MaterialsWriter writer = new MaterialsWriter();
      writer.setCsvWriter(fileWriter);
      writer.writeToFile(materials);
    }
  }

  @Test
  public void testUsingString() throws IOException {
    try (Writer csvWriter = new StringWriter()) {
      MaterialsWriter writer = new MaterialsWriter();
      writer.setCsvWriter(csvWriter);
      writer.writeToFile(materials);

    }
  }

}