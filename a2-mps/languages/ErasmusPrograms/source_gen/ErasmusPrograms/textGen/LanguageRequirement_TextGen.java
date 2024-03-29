package ErasmusPrograms.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class LanguageRequirement_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("--insert values into language requirements table");
    tgs.newLine();
    tgs.append("INSERT INTO language (name, level) ");
    tgs.append("VALUES (\"");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.name$MnvL));
    tgs.append("\",\"");
    tgs.append(String.valueOf(SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.level$hUVf)));
    tgs.append("\");");
    tgs.newLine();
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty level$hUVf = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc561695e1L, 0x26276edc561695e4L, "level");
  }
}
