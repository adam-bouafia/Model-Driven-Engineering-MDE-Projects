package ErasmusPrograms.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ApplicationProcess_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    for (SNode item : SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.steps$lm0s)) {
      tgs.appendNode(item);
    }
    tgs.newLine();
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink steps$lm0s = MetaAdapterFactory.getContainmentLink(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc561695eeL, 0x26276edc56169640L, "steps");
  }
}
