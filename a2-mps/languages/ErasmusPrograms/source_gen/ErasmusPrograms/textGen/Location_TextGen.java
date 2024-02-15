package ErasmusPrograms.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Location_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("--insert values into location table");
    tgs.newLine();
    tgs.append("INSERT INTO location (country_name, city_name) ");
    tgs.append("VALUES (\"");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.countryName$B2sd));
    tgs.append("\",\"");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.cityName$B2Uf));
    tgs.append("\");");
    tgs.newLine();
  }

  private static final class PROPS {
    /*package*/ static final SProperty countryName$B2sd = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e45L, 0x26276edc56166e46L, "countryName");
    /*package*/ static final SProperty cityName$B2Uf = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e45L, 0x26276edc56166e48L, "cityName");
  }
}
