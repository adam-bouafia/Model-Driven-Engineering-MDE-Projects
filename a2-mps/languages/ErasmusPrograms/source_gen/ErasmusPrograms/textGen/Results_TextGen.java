package ErasmusPrograms.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Results_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("--insert values into results table");
    tgs.newLine();
    tgs.append("INSERT INTO result (year, total_admitted, scholarships_awarded, admitted_students) ");
    tgs.append("VALUES (");
    tgs.append(Integer.toString(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$Bcio)));
    tgs.append(",");
    tgs.append(Integer.toString(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.totalAdmitted$BhFJ)));
    tgs.append(",");
    tgs.append(Integer.toString(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.scholarshipsAwarded$BiBN)));
    tgs.append(",\"");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.admittedStudents$BjzR));
    tgs.append("\");");
    tgs.newLine();
  }

  private static final class PROPS {
    /*package*/ static final SProperty year$Bcio = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e58L, 0x26276edc56166e59L, "year");
    /*package*/ static final SProperty totalAdmitted$BhFJ = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e58L, 0x26276edc56166e5bL, "totalAdmitted");
    /*package*/ static final SProperty scholarshipsAwarded$BiBN = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e58L, 0x26276edc56166e5fL, "scholarshipsAwarded");
    /*package*/ static final SProperty admittedStudents$BjzR = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e58L, 0x26276edc56166e63L, "admittedStudents");
  }
}
