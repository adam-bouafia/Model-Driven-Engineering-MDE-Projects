package ErasmusPrograms.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Scholarship_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("--insert values into scholarships table");
    tgs.newLine();
    tgs.append("INSERT INTO scholarship (name, type, tuition_fee, travel_grant, allowance) ");
    tgs.append("VALUES (\"");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.name$MnvL));
    tgs.append("\",\"");
    tgs.append(String.valueOf(SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.type$zKQT)));
    tgs.append("\",");
    tgs.append(Integer.toString(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.tuitionFee$$6sl)));
    tgs.append(",");
    tgs.append(Integer.toString(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.travelGrant$$7Bq)));
    tgs.append(",");
    tgs.append(Integer.toString(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.allowance$AAdY)));
    tgs.append(");");
    tgs.newLine();
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty type$zKQT = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e00L, 0x26276edc56166e02L, "type");
    /*package*/ static final SProperty tuitionFee$$6sl = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e00L, 0x26276edc56166e1fL, "tuitionFee");
    /*package*/ static final SProperty travelGrant$$7Bq = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e00L, 0x26276edc56166e24L, "travelGrant");
    /*package*/ static final SProperty allowance$AAdY = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e00L, 0x26276edc56166e28L, "allowance");
  }
}
