package ErasmusPrograms.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class University_Constraints extends BaseConstraintsDescriptor {
  public University_Constraints() {
    super(CONCEPTS.University$69);
  }

  public static class Credits_Property extends BasePropertyConstraintsDescriptor {
    public Credits_Property(ConstraintsDescriptor container) {
      super(PROPS.credits$AIfq, container, false, false, true);
    }
    @Override
    public boolean validateValue(SNode node, Object propertyValue, CheckingNodeContext checkingNodeContext) {
      boolean result = staticValidateProperty(node, SPropertyOperations.castInteger(propertyValue));
      if (!(result) && checkingNodeContext != null) {
        checkingNodeContext.setBreakingNode(new SNodePointer("r:d62249e9-1888-40f9-9c51-bbbb092b81e0(ErasmusPrograms.constraints)", "2749287990149730936"));
      }
      return result;
    }
    private static boolean staticValidateProperty(SNode node, int propertyValue) {
      return propertyValue > 0;
    }
  }
  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(PROPS.credits$AIfq, new Credits_Property(this));
    return properties;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept University$69 = MetaAdapterFactory.getConcept(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e2eL, "ErasmusPrograms.structure.University");
  }

  private static final class PROPS {
    /*package*/ static final SProperty credits$AIfq = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e2eL, 0x26276edc56166e31L, "credits");
  }
}
