package ErasmusPrograms.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseConstraintsAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class ConstraintsAspectDescriptor extends BaseConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  @Override
  public ConstraintsDescriptor getConstraints(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return new ErasmusProgram_Constraints();
      case 1:
        return new Requirement_Constraints();
      case 2:
        return new Step_Constraints();
      case 3:
        return new University_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x9d77ea4d04f30c3L), MetaIdFactory.conceptId(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e6aL), MetaIdFactory.conceptId(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc5616960aL), MetaIdFactory.conceptId(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc56166e2eL)).seal();
}
