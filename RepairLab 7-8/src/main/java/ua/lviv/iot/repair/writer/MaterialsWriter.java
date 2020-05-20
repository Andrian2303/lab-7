package ua.lviv.iot.repair.writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.repair.model.AbstractMaterials;

public class MaterialsWriter {
  public Writer csvWriter = new StringWriter();

  public Writer getCsvWriter() {
    return csvWriter;
  }

  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }

  public void writeToFile(List<AbstractMaterials> materials) throws IOException {
    csvWriter.write(materials.get(0).getHeaders());
    csvWriter.write("\n");
    for (AbstractMaterials material : materials) {
      csvWriter.write(material.toCSV());
      csvWriter.write("\n");
    }
    csvWriter.flush();
  }

  @Override
  public String toString() {
    return csvWriter.toString();
  }
}
