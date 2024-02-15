package ErasmusPrograms.feedback;

/*Generated by MPS */

import jetbrains.mps.core.aspects.feedback.api.BaseFeedbackDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.feedback.api.FeedbackProvider;
import jetbrains.mps.core.aspects.feedback.messages.FailingPropertyConstraintContext;
import jetbrains.mps.core.aspects.feedback.messages.BaseMessageProvider;
import jetbrains.mps.core.aspects.feedback.messages.FailingPropertyConstraintProblemId;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.core.aspects.feedback.messages.MessageProvider;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Stream;
import org.jetbrains.mps.openapi.language.SProperty;

public final class Step_FeedbackFeedback extends BaseFeedbackDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc5616960aL, "ErasmusPrograms.structure.Step");

  private static final FeedbackProvider<FailingPropertyConstraintContext> MSGPROVIDER_WhenPropertyConstraintFails_apsgim_a = new BaseMessageProvider<FailingPropertyConstraintContext>(new FailingPropertyConstraintProblemId(PROPS.startDate$kRIt)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(FailingPropertyConstraintContext context) {
      return new MessageProvider.StringMsg("Date should follow the format of DD/MM/YYYY");
    }
  };
  private static final FeedbackProvider<FailingPropertyConstraintContext> MSGPROVIDER_WhenPropertyConstraintFails_apsgim_b = new BaseMessageProvider<FailingPropertyConstraintContext>(new FailingPropertyConstraintProblemId(PROPS.endDate$kX_Q)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(FailingPropertyConstraintContext context) {
      return new MessageProvider.StringMsg("Date should follow the format of DD/MM/YYYY");
    }
  };

  private static final List<FeedbackProvider> PROVIDERS = Collections.unmodifiableList(Arrays.<FeedbackProvider>asList(MSGPROVIDER_WhenPropertyConstraintFails_apsgim_a, MSGPROVIDER_WhenPropertyConstraintFails_apsgim_b));

  public Step_FeedbackFeedback() {
    super(CONCEPT);
  }

  @NotNull
  @Override
  public Stream<FeedbackProvider> getDeclaredProviders() {
    return PROVIDERS.stream();
  }

  private static final class PROPS {
    /*package*/ static final SProperty startDate$kRIt = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc5616960aL, 0x26276edc56169610L, "startDate");
    /*package*/ static final SProperty endDate$kX_Q = MetaAdapterFactory.getProperty(0x45d743938b794afaL, 0x9cc9d68d79ce89e1L, 0x26276edc5616960aL, 0x26276edc56169614L, "endDate");
  }
}