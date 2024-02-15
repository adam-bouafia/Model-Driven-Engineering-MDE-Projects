package ErasmusPrograms.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class University_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("--insert values into universities table");
    tgs.newLine();
    tgs.append("INSERT INTO university (name, credits) ");
    tgs.append("VALUES (\"");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.name$MnvL));
    tgs.append("\",");
    tgs.append(Integer.toString(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.credits$AIfq)));
    tgs.append(");");
    tgs.newLine();
    for (SNode item : SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.courses$BEeS)) {
      tgs.appendNode(item);
    }
    tgs.newLine();
    tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.location$fFN3));
    tgs.newLine();
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty credits$AIfq = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e2eL, 0x26276edc56166e31L, "credits");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink courses$BEeS = MetaAdapterFactory.getContainmentLink(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e2eL, 0x26276edc56169625L, "courses");
    /*package*/ static final SContainmentLink location$fFN3 = MetaAdapterFactory.getContainmentLink(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e2eL, 0x74bd21fd9dff74afL, "location");
  }
}