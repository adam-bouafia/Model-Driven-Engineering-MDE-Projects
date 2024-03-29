package ErasmusPrograms.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_DegreeLevel extends EnumerationDescriptorBase {

  public EnumerationDescriptor_DegreeLevel() {
    super(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc561695e7L, "DegreeLevel", "r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158375");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_BACHELOR_0 = new EnumerationDescriptor.MemberDescriptor("BACHELOR", "bachelor", 0x26276edc561695e9L, "r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158377");
  private final EnumerationDescriptor.MemberDescriptor myMember_MASTER_0 = new EnumerationDescriptor.MemberDescriptor("MASTER", "master", 0x26276edc561695ebL, "r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158379");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc561695e7L, 0x26276edc561695e9L, 0x26276edc561695ebL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_BACHELOR_0, myMember_MASTER_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_BACHELOR_0;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "BACHELOR":
        return myMember_BACHELOR_0;
      case "MASTER":
        return myMember_MASTER_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
