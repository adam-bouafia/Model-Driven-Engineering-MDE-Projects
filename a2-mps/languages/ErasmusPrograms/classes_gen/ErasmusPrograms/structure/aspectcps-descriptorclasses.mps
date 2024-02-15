<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:f29c6ed(checkpoints/ErasmusPrograms.structure@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <attribute name="user-objects" value="true" />
  <languages />
  <imports>
    <import index="mmpm" ref="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)" />
    <import index="ksn4" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.smodel(MPS.Core/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="e8bb" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.ids(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="vndm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.language(MPS.Core/)" />
    <import index="bzg8" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime.impl(MPS.Core/)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="nn" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ngI" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1083260308424" name="jetbrains.mps.baseLanguage.structure.EnumConstantReference" flags="nn" index="Rm8GO">
        <reference id="1083260308426" name="enumConstantDeclaration" index="Rm8GQ" />
        <reference id="1144432896254" name="enumClass" index="1Px2BO" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070462154015" name="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" flags="ig" index="Wx3nA">
        <property id="6468716278899126575" name="isVolatile" index="2dlcS1" />
        <property id="6468716278899125786" name="isTransient" index="2dld4O" />
      </concept>
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg">
        <property id="8606350594693632173" name="isTransient" index="eg7rD" />
        <property id="1240249534625" name="isVolatile" index="34CwA1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <property id="1221565133444" name="isFinal" index="1EXbeo" />
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="4269842503726207156" name="jetbrains.mps.baseLanguage.structure.LongLiteral" flags="nn" index="1adDum">
        <property id="4269842503726207157" name="value" index="1adDun" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="4276006055363816570" name="isSynchronized" index="od$2w" />
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242867" name="jetbrains.mps.baseLanguage.structure.LongType" flags="in" index="3cpWsb" />
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025416" name="jetbrains.mps.baseLanguage.structure.MethodDeclaration" flags="ng" index="1rXfSm">
        <property id="8355037393041754995" name="isNative" index="2aFKle" />
      </concept>
      <concept id="7812454656619025412" name="jetbrains.mps.baseLanguage.structure.LocalMethodCall" flags="nn" index="1rXfSq" />
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ngI" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1163670490218" name="jetbrains.mps.baseLanguage.structure.SwitchStatement" flags="nn" index="3KaCP$">
        <child id="1163670592366" name="defaultBlock" index="3Kb1Dw" />
        <child id="1163670766145" name="expression" index="3KbGdf" />
        <child id="1163670772911" name="case" index="3KbHQx" />
      </concept>
      <concept id="1163670641947" name="jetbrains.mps.baseLanguage.structure.SwitchCase" flags="ng" index="3KbdKl">
        <child id="1163670677455" name="expression" index="3Kbmr1" />
        <child id="1163670683720" name="body" index="3Kbo56" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="8356039341262087992" name="line" index="1aUNEU" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1116615150612" name="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" flags="nn" index="3VsKOn">
        <reference id="1116615189566" name="classifier" index="3VsUkX" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="5808518347809715508" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_InputNode" flags="nn" index="385nmt">
        <property id="5808518347809748738" name="presentation" index="385vuF" />
        <child id="5808518347809747118" name="node" index="385v07" />
      </concept>
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE">
        <child id="3864140621129713349" name="labels" index="39e2AI" />
      </concept>
      <concept id="3864140621129713351" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeMapEntry" flags="nn" index="39e2AG">
        <property id="5843998055530255671" name="isNewRoot" index="2mV_xN" />
        <reference id="3864140621129713371" name="inputOrigin" index="39e2AK" />
        <child id="5808518347809748862" name="inputNode" index="385vvn" />
        <child id="3864140621129713365" name="outputNode" index="39e2AY" />
      </concept>
      <concept id="3864140621129713348" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_LabelEntry" flags="nn" index="39e2AJ">
        <property id="3864140621129715945" name="label" index="39e3Y2" />
        <child id="3864140621129715947" name="entries" index="39e3Y0" />
      </concept>
      <concept id="3864140621129713362" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeRef" flags="nn" index="39e2AT">
        <reference id="3864140621129713363" name="node" index="39e2AS" />
      </concept>
      <concept id="3637169702552512264" name="jetbrains.mps.lang.generator.structure.ElementaryNodeId" flags="ng" index="3u3nmq">
        <property id="3637169702552512269" name="nodeId" index="3u3nmv" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
      <concept id="4222318806802425298" name="jetbrains.mps.lang.core.structure.SuppressErrorsAnnotation" flags="ng" index="15s5l7">
        <property id="8575328350543493365" name="message" index="huDt6" />
        <property id="2423417345669755629" name="filter" index="1eyWvh" />
      </concept>
    </language>
    <language id="c7fb639f-be78-4307-89b0-b5959c3fa8c8" name="jetbrains.mps.lang.text">
      <concept id="155656958578482948" name="jetbrains.mps.lang.text.structure.Word" flags="nn" index="3oM_SD">
        <property id="155656958578482949" name="value" index="3oM_SC" />
      </concept>
      <concept id="2535923850359271782" name="jetbrains.mps.lang.text.structure.Line" flags="nn" index="1PaTwC">
        <child id="2535923850359271783" name="elements" index="1PaTwD" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="0">
    <property role="TrG5h" value="ConceptPresentationAspectImpl" />
    <node concept="3uibUv" id="1" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~ConceptPresentationAspectBase" resolve="ConceptPresentationAspectBase" />
    </node>
    <node concept="312cEg" id="2" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_AdmissionStructure" />
      <node concept="3uibUv" id="j" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="k" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_ApplicationProcess" />
      <node concept="3uibUv" id="l" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="m" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="4" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_AssociatePartner" />
      <node concept="3uibUv" id="n" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="o" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Course" />
      <node concept="3uibUv" id="p" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="q" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_DegreeRequirement" />
      <node concept="3uibUv" id="r" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="s" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="7" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_DocumentRequirement" />
      <node concept="3uibUv" id="t" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="u" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="8" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_ErasmusProgram" />
      <node concept="3uibUv" id="v" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="w" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="9" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_LanguageRequirement" />
      <node concept="3uibUv" id="x" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="y" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="a" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Location" />
      <node concept="3uibUv" id="z" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="$" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="b" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Requirement" />
      <node concept="3uibUv" id="_" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="A" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="c" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Results" />
      <node concept="3uibUv" id="B" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="C" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="d" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Scholarship" />
      <node concept="3uibUv" id="D" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="E" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="e" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Step" />
      <node concept="3uibUv" id="F" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="G" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="f" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_University" />
      <node concept="3uibUv" id="H" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="I" role="1B3o_S" />
    </node>
    <node concept="3Tm1VV" id="g" role="1B3o_S" />
    <node concept="2tJIrI" id="h" role="jymVt" />
    <node concept="3clFb_" id="i" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="J" role="1B3o_S" />
      <node concept="37vLTG" id="K" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="P" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="3clFbS" id="L" role="3clF47">
        <node concept="3cpWs8" id="Q" role="3cqZAp">
          <node concept="3cpWsn" id="T" role="3cpWs9">
            <property role="TrG5h" value="structureDescriptor" />
            <node concept="3uibUv" id="U" role="1tU5fm">
              <ref role="3uigEE" node="jK" resolve="StructureAspectDescriptor" />
            </node>
            <node concept="10QFUN" id="V" role="33vP2m">
              <node concept="3uibUv" id="W" role="10QFUM">
                <ref role="3uigEE" node="jK" resolve="StructureAspectDescriptor" />
              </node>
              <node concept="2OqwBi" id="X" role="10QFUP">
                <node concept="37vLTw" id="Y" role="2Oq$k0">
                  <ref role="3cqZAo" to="ze1i:~ConceptPresentationAspectBase.myLanguageRuntime" resolve="myLanguageRuntime" />
                </node>
                <node concept="liA8E" id="Z" role="2OqNvi">
                  <ref role="37wK5l" to="vndm:~LanguageRuntime.getAspect(java.lang.Class)" resolve="getAspect" />
                  <node concept="3VsKOn" id="10" role="37wK5m">
                    <ref role="3VsUkX" to="ze1i:~StructureAspectDescriptor" resolve="StructureAspectDescriptor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="R" role="3cqZAp">
          <node concept="2OqwBi" id="11" role="3KbGdf">
            <node concept="37vLTw" id="1g" role="2Oq$k0">
              <ref role="3cqZAo" node="T" resolve="structureDescriptor" />
            </node>
            <node concept="liA8E" id="1h" role="2OqNvi">
              <ref role="37wK5l" node="ki" resolve="internalIndex" />
              <node concept="37vLTw" id="1i" role="37wK5m">
                <ref role="3cqZAo" node="K" resolve="c" />
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="12" role="3KbHQx">
            <node concept="3clFbS" id="1j" role="3Kbo56">
              <node concept="3clFbJ" id="1l" role="3cqZAp">
                <node concept="3clFbS" id="1n" role="3clFbx">
                  <node concept="3cpWs8" id="1p" role="3cqZAp">
                    <node concept="3cpWsn" id="1s" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1t" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1u" role="33vP2m">
                        <node concept="1pGfFk" id="1v" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1q" role="3cqZAp">
                    <node concept="2OqwBi" id="1w" role="3clFbG">
                      <node concept="37vLTw" id="1x" role="2Oq$k0">
                        <ref role="3cqZAo" node="1s" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1y" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String)" resolve="rawPresentation" />
                        <uo k="s:originTrace" v="n:2749287990149148247" />
                        <node concept="Xl_RD" id="1z" role="37wK5m">
                          <property role="Xl_RC" value="admission" />
                          <uo k="s:originTrace" v="n:2749287990149148247" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1r" role="3cqZAp">
                    <node concept="37vLTI" id="1$" role="3clFbG">
                      <node concept="2OqwBi" id="1_" role="37vLTx">
                        <node concept="37vLTw" id="1B" role="2Oq$k0">
                          <ref role="3cqZAo" node="1s" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1C" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1A" role="37vLTJ">
                        <ref role="3cqZAo" node="2" resolve="props_AdmissionStructure" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1o" role="3clFbw">
                  <node concept="10Nm6u" id="1D" role="3uHU7w" />
                  <node concept="37vLTw" id="1E" role="3uHU7B">
                    <ref role="3cqZAo" node="2" resolve="props_AdmissionStructure" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1m" role="3cqZAp">
                <node concept="37vLTw" id="1F" role="3cqZAk">
                  <ref role="3cqZAo" node="2" resolve="props_AdmissionStructure" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1k" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gS" resolve="AdmissionStructure" />
            </node>
          </node>
          <node concept="3KbdKl" id="13" role="3KbHQx">
            <node concept="3clFbS" id="1G" role="3Kbo56">
              <node concept="3clFbJ" id="1I" role="3cqZAp">
                <node concept="3clFbS" id="1K" role="3clFbx">
                  <node concept="3cpWs8" id="1M" role="3cqZAp">
                    <node concept="3cpWsn" id="1P" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1Q" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1R" role="33vP2m">
                        <node concept="1pGfFk" id="1S" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1N" role="3cqZAp">
                    <node concept="2OqwBi" id="1T" role="3clFbG">
                      <node concept="37vLTw" id="1U" role="2Oq$k0">
                        <ref role="3cqZAo" node="1P" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1V" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String)" resolve="rawPresentation" />
                        <uo k="s:originTrace" v="n:2749287990149158382" />
                        <node concept="Xl_RD" id="1W" role="37wK5m">
                          <property role="Xl_RC" value="application process" />
                          <uo k="s:originTrace" v="n:2749287990149158382" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1O" role="3cqZAp">
                    <node concept="37vLTI" id="1X" role="3clFbG">
                      <node concept="2OqwBi" id="1Y" role="37vLTx">
                        <node concept="37vLTw" id="20" role="2Oq$k0">
                          <ref role="3cqZAo" node="1P" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="21" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1Z" role="37vLTJ">
                        <ref role="3cqZAo" node="3" resolve="props_ApplicationProcess" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1L" role="3clFbw">
                  <node concept="10Nm6u" id="22" role="3uHU7w" />
                  <node concept="37vLTw" id="23" role="3uHU7B">
                    <ref role="3cqZAo" node="3" resolve="props_ApplicationProcess" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1J" role="3cqZAp">
                <node concept="37vLTw" id="24" role="3cqZAk">
                  <ref role="3cqZAo" node="3" resolve="props_ApplicationProcess" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1H" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gT" resolve="ApplicationProcess" />
            </node>
          </node>
          <node concept="3KbdKl" id="14" role="3KbHQx">
            <node concept="3clFbS" id="25" role="3Kbo56">
              <node concept="3clFbJ" id="27" role="3cqZAp">
                <node concept="3clFbS" id="29" role="3clFbx">
                  <node concept="3cpWs8" id="2b" role="3cqZAp">
                    <node concept="3cpWsn" id="2e" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="2f" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="2g" role="33vP2m">
                        <node concept="1pGfFk" id="2h" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2c" role="3cqZAp">
                    <node concept="2OqwBi" id="2i" role="3clFbG">
                      <node concept="37vLTw" id="2j" role="2Oq$k0">
                        <ref role="3cqZAo" node="2e" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2k" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String)" resolve="rawPresentation" />
                        <uo k="s:originTrace" v="n:2749287990149148235" />
                        <node concept="Xl_RD" id="2l" role="37wK5m">
                          <property role="Xl_RC" value="partner" />
                          <uo k="s:originTrace" v="n:2749287990149148235" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2d" role="3cqZAp">
                    <node concept="37vLTI" id="2m" role="3clFbG">
                      <node concept="2OqwBi" id="2n" role="37vLTx">
                        <node concept="37vLTw" id="2p" role="2Oq$k0">
                          <ref role="3cqZAo" node="2e" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="2q" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="2o" role="37vLTJ">
                        <ref role="3cqZAo" node="4" resolve="props_AssociatePartner" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="2a" role="3clFbw">
                  <node concept="10Nm6u" id="2r" role="3uHU7w" />
                  <node concept="37vLTw" id="2s" role="3uHU7B">
                    <ref role="3cqZAo" node="4" resolve="props_AssociatePartner" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="28" role="3cqZAp">
                <node concept="37vLTw" id="2t" role="3cqZAk">
                  <ref role="3cqZAo" node="4" resolve="props_AssociatePartner" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="26" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gU" resolve="AssociatePartner" />
            </node>
          </node>
          <node concept="3KbdKl" id="15" role="3KbHQx">
            <node concept="3clFbS" id="2u" role="3Kbo56">
              <node concept="3clFbJ" id="2w" role="3cqZAp">
                <node concept="3clFbS" id="2y" role="3clFbx">
                  <node concept="3cpWs8" id="2$" role="3cqZAp">
                    <node concept="3cpWsn" id="2B" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="2C" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="2D" role="33vP2m">
                        <node concept="1pGfFk" id="2E" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2_" role="3cqZAp">
                    <node concept="2OqwBi" id="2F" role="3clFbG">
                      <node concept="37vLTw" id="2G" role="2Oq$k0">
                        <ref role="3cqZAo" node="2B" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2H" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:2749287990149148213" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2A" role="3cqZAp">
                    <node concept="37vLTI" id="2I" role="3clFbG">
                      <node concept="2OqwBi" id="2J" role="37vLTx">
                        <node concept="37vLTw" id="2L" role="2Oq$k0">
                          <ref role="3cqZAo" node="2B" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="2M" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="2K" role="37vLTJ">
                        <ref role="3cqZAo" node="5" resolve="props_Course" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="2z" role="3clFbw">
                  <node concept="10Nm6u" id="2N" role="3uHU7w" />
                  <node concept="37vLTw" id="2O" role="3uHU7B">
                    <ref role="3cqZAo" node="5" resolve="props_Course" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="2x" role="3cqZAp">
                <node concept="37vLTw" id="2P" role="3cqZAk">
                  <ref role="3cqZAo" node="5" resolve="props_Course" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="2v" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gV" resolve="Course" />
            </node>
          </node>
          <node concept="3KbdKl" id="16" role="3KbHQx">
            <node concept="3clFbS" id="2Q" role="3Kbo56">
              <node concept="3clFbJ" id="2S" role="3cqZAp">
                <node concept="3clFbS" id="2U" role="3clFbx">
                  <node concept="3cpWs8" id="2W" role="3cqZAp">
                    <node concept="3cpWsn" id="2Z" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="30" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="31" role="33vP2m">
                        <node concept="1pGfFk" id="32" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2X" role="3cqZAp">
                    <node concept="2OqwBi" id="33" role="3clFbG">
                      <node concept="37vLTw" id="34" role="2Oq$k0">
                        <ref role="3cqZAo" node="2Z" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="35" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:2749287990149158426" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2Y" role="3cqZAp">
                    <node concept="37vLTI" id="36" role="3clFbG">
                      <node concept="2OqwBi" id="37" role="37vLTx">
                        <node concept="37vLTw" id="39" role="2Oq$k0">
                          <ref role="3cqZAo" node="2Z" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="3a" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="38" role="37vLTJ">
                        <ref role="3cqZAo" node="6" resolve="props_DegreeRequirement" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="2V" role="3clFbw">
                  <node concept="10Nm6u" id="3b" role="3uHU7w" />
                  <node concept="37vLTw" id="3c" role="3uHU7B">
                    <ref role="3cqZAo" node="6" resolve="props_DegreeRequirement" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="2T" role="3cqZAp">
                <node concept="37vLTw" id="3d" role="3cqZAk">
                  <ref role="3cqZAo" node="6" resolve="props_DegreeRequirement" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="2R" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gW" resolve="DegreeRequirement" />
            </node>
          </node>
          <node concept="3KbdKl" id="17" role="3KbHQx">
            <node concept="3clFbS" id="3e" role="3Kbo56">
              <node concept="3clFbJ" id="3g" role="3cqZAp">
                <node concept="3clFbS" id="3i" role="3clFbx">
                  <node concept="3cpWs8" id="3k" role="3cqZAp">
                    <node concept="3cpWsn" id="3n" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="3o" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="3p" role="33vP2m">
                        <node concept="1pGfFk" id="3q" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3l" role="3cqZAp">
                    <node concept="2OqwBi" id="3r" role="3clFbG">
                      <node concept="37vLTw" id="3s" role="2Oq$k0">
                        <ref role="3cqZAo" node="3n" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="3t" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:2749287990149158363" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3m" role="3cqZAp">
                    <node concept="37vLTI" id="3u" role="3clFbG">
                      <node concept="2OqwBi" id="3v" role="37vLTx">
                        <node concept="37vLTw" id="3x" role="2Oq$k0">
                          <ref role="3cqZAo" node="3n" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="3y" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3w" role="37vLTJ">
                        <ref role="3cqZAo" node="7" resolve="props_DocumentRequirement" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="3j" role="3clFbw">
                  <node concept="10Nm6u" id="3z" role="3uHU7w" />
                  <node concept="37vLTw" id="3$" role="3uHU7B">
                    <ref role="3cqZAo" node="7" resolve="props_DocumentRequirement" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="3h" role="3cqZAp">
                <node concept="37vLTw" id="3_" role="3cqZAk">
                  <ref role="3cqZAo" node="7" resolve="props_DocumentRequirement" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="3f" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gX" resolve="DocumentRequirement" />
            </node>
          </node>
          <node concept="3KbdKl" id="18" role="3KbHQx">
            <node concept="3clFbS" id="3A" role="3Kbo56">
              <node concept="3clFbJ" id="3C" role="3cqZAp">
                <node concept="3clFbS" id="3E" role="3clFbx">
                  <node concept="3cpWs8" id="3G" role="3cqZAp">
                    <node concept="3cpWsn" id="3J" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="3K" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="3L" role="33vP2m">
                        <node concept="1pGfFk" id="3M" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3H" role="3cqZAp">
                    <node concept="2OqwBi" id="3N" role="3clFbG">
                      <node concept="37vLTw" id="3O" role="2Oq$k0">
                        <ref role="3cqZAo" node="3J" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="3P" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:709174712668729539" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3I" role="3cqZAp">
                    <node concept="37vLTI" id="3Q" role="3clFbG">
                      <node concept="2OqwBi" id="3R" role="37vLTx">
                        <node concept="37vLTw" id="3T" role="2Oq$k0">
                          <ref role="3cqZAo" node="3J" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="3U" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3S" role="37vLTJ">
                        <ref role="3cqZAo" node="8" resolve="props_ErasmusProgram" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="3F" role="3clFbw">
                  <node concept="10Nm6u" id="3V" role="3uHU7w" />
                  <node concept="37vLTw" id="3W" role="3uHU7B">
                    <ref role="3cqZAo" node="8" resolve="props_ErasmusProgram" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="3D" role="3cqZAp">
                <node concept="37vLTw" id="3X" role="3cqZAk">
                  <ref role="3cqZAo" node="8" resolve="props_ErasmusProgram" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="3B" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gY" resolve="ErasmusProgram" />
            </node>
          </node>
          <node concept="3KbdKl" id="19" role="3KbHQx">
            <node concept="3clFbS" id="3Y" role="3Kbo56">
              <node concept="3clFbJ" id="40" role="3cqZAp">
                <node concept="3clFbS" id="42" role="3clFbx">
                  <node concept="3cpWs8" id="44" role="3cqZAp">
                    <node concept="3cpWsn" id="47" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="48" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="49" role="33vP2m">
                        <node concept="1pGfFk" id="4a" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="45" role="3cqZAp">
                    <node concept="2OqwBi" id="4b" role="3clFbG">
                      <node concept="37vLTw" id="4c" role="2Oq$k0">
                        <ref role="3cqZAo" node="47" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="4d" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:2749287990149158369" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="46" role="3cqZAp">
                    <node concept="37vLTI" id="4e" role="3clFbG">
                      <node concept="2OqwBi" id="4f" role="37vLTx">
                        <node concept="37vLTw" id="4h" role="2Oq$k0">
                          <ref role="3cqZAo" node="47" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="4i" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="4g" role="37vLTJ">
                        <ref role="3cqZAo" node="9" resolve="props_LanguageRequirement" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="43" role="3clFbw">
                  <node concept="10Nm6u" id="4j" role="3uHU7w" />
                  <node concept="37vLTw" id="4k" role="3uHU7B">
                    <ref role="3cqZAo" node="9" resolve="props_LanguageRequirement" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="41" role="3cqZAp">
                <node concept="37vLTw" id="4l" role="3cqZAk">
                  <ref role="3cqZAo" node="9" resolve="props_LanguageRequirement" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="3Z" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gZ" resolve="LanguageRequirement" />
            </node>
          </node>
          <node concept="3KbdKl" id="1a" role="3KbHQx">
            <node concept="3clFbS" id="4m" role="3Kbo56">
              <node concept="3clFbJ" id="4o" role="3cqZAp">
                <node concept="3clFbS" id="4q" role="3clFbx">
                  <node concept="3cpWs8" id="4s" role="3cqZAp">
                    <node concept="3cpWsn" id="4v" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="4w" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="4x" role="33vP2m">
                        <node concept="1pGfFk" id="4y" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4t" role="3cqZAp">
                    <node concept="2OqwBi" id="4z" role="3clFbG">
                      <node concept="37vLTw" id="4$" role="2Oq$k0">
                        <ref role="3cqZAo" node="4v" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="4_" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String)" resolve="rawPresentation" />
                        <uo k="s:originTrace" v="n:2749287990149148229" />
                        <node concept="Xl_RD" id="4A" role="37wK5m">
                          <property role="Xl_RC" value="location" />
                          <uo k="s:originTrace" v="n:2749287990149148229" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4u" role="3cqZAp">
                    <node concept="37vLTI" id="4B" role="3clFbG">
                      <node concept="2OqwBi" id="4C" role="37vLTx">
                        <node concept="37vLTw" id="4E" role="2Oq$k0">
                          <ref role="3cqZAo" node="4v" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="4F" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="4D" role="37vLTJ">
                        <ref role="3cqZAo" node="a" resolve="props_Location" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="4r" role="3clFbw">
                  <node concept="10Nm6u" id="4G" role="3uHU7w" />
                  <node concept="37vLTw" id="4H" role="3uHU7B">
                    <ref role="3cqZAo" node="a" resolve="props_Location" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="4p" role="3cqZAp">
                <node concept="37vLTw" id="4I" role="3cqZAk">
                  <ref role="3cqZAo" node="a" resolve="props_Location" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="4n" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h0" resolve="Location" />
            </node>
          </node>
          <node concept="3KbdKl" id="1b" role="3KbHQx">
            <node concept="3clFbS" id="4J" role="3Kbo56">
              <node concept="3clFbJ" id="4L" role="3cqZAp">
                <node concept="3clFbS" id="4N" role="3clFbx">
                  <node concept="3cpWs8" id="4P" role="3cqZAp">
                    <node concept="3cpWsn" id="4R" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="4S" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="4T" role="33vP2m">
                        <node concept="1pGfFk" id="4U" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4Q" role="3cqZAp">
                    <node concept="37vLTI" id="4V" role="3clFbG">
                      <node concept="2OqwBi" id="4W" role="37vLTx">
                        <node concept="37vLTw" id="4Y" role="2Oq$k0">
                          <ref role="3cqZAo" node="4R" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="4Z" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="4X" role="37vLTJ">
                        <ref role="3cqZAo" node="b" resolve="props_Requirement" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="4O" role="3clFbw">
                  <node concept="10Nm6u" id="50" role="3uHU7w" />
                  <node concept="37vLTw" id="51" role="3uHU7B">
                    <ref role="3cqZAo" node="b" resolve="props_Requirement" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="4M" role="3cqZAp">
                <node concept="37vLTw" id="52" role="3cqZAk">
                  <ref role="3cqZAo" node="b" resolve="props_Requirement" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="4K" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h1" resolve="Requirement" />
            </node>
          </node>
          <node concept="3KbdKl" id="1c" role="3KbHQx">
            <node concept="3clFbS" id="53" role="3Kbo56">
              <node concept="3clFbJ" id="55" role="3cqZAp">
                <node concept="3clFbS" id="57" role="3clFbx">
                  <node concept="3cpWs8" id="59" role="3cqZAp">
                    <node concept="3cpWsn" id="5c" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="5d" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="5e" role="33vP2m">
                        <node concept="1pGfFk" id="5f" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="5a" role="3cqZAp">
                    <node concept="2OqwBi" id="5g" role="3clFbG">
                      <node concept="37vLTw" id="5h" role="2Oq$k0">
                        <ref role="3cqZAo" node="5c" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="5i" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String)" resolve="rawPresentation" />
                        <uo k="s:originTrace" v="n:2749287990149148248" />
                        <node concept="Xl_RD" id="5j" role="37wK5m">
                          <property role="Xl_RC" value="results" />
                          <uo k="s:originTrace" v="n:2749287990149148248" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="5b" role="3cqZAp">
                    <node concept="37vLTI" id="5k" role="3clFbG">
                      <node concept="2OqwBi" id="5l" role="37vLTx">
                        <node concept="37vLTw" id="5n" role="2Oq$k0">
                          <ref role="3cqZAo" node="5c" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="5o" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="5m" role="37vLTJ">
                        <ref role="3cqZAo" node="c" resolve="props_Results" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="58" role="3clFbw">
                  <node concept="10Nm6u" id="5p" role="3uHU7w" />
                  <node concept="37vLTw" id="5q" role="3uHU7B">
                    <ref role="3cqZAo" node="c" resolve="props_Results" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="56" role="3cqZAp">
                <node concept="37vLTw" id="5r" role="3cqZAk">
                  <ref role="3cqZAo" node="c" resolve="props_Results" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="54" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h2" resolve="Results" />
            </node>
          </node>
          <node concept="3KbdKl" id="1d" role="3KbHQx">
            <node concept="3clFbS" id="5s" role="3Kbo56">
              <node concept="3clFbJ" id="5u" role="3cqZAp">
                <node concept="3clFbS" id="5w" role="3clFbx">
                  <node concept="3cpWs8" id="5y" role="3cqZAp">
                    <node concept="3cpWsn" id="5_" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="5A" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="5B" role="33vP2m">
                        <node concept="1pGfFk" id="5C" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="5z" role="3cqZAp">
                    <node concept="2OqwBi" id="5D" role="3clFbG">
                      <node concept="37vLTw" id="5E" role="2Oq$k0">
                        <ref role="3cqZAo" node="5_" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="5F" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:2749287990149148160" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="5$" role="3cqZAp">
                    <node concept="37vLTI" id="5G" role="3clFbG">
                      <node concept="2OqwBi" id="5H" role="37vLTx">
                        <node concept="37vLTw" id="5J" role="2Oq$k0">
                          <ref role="3cqZAo" node="5_" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="5K" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="5I" role="37vLTJ">
                        <ref role="3cqZAo" node="d" resolve="props_Scholarship" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="5x" role="3clFbw">
                  <node concept="10Nm6u" id="5L" role="3uHU7w" />
                  <node concept="37vLTw" id="5M" role="3uHU7B">
                    <ref role="3cqZAo" node="d" resolve="props_Scholarship" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="5v" role="3cqZAp">
                <node concept="37vLTw" id="5N" role="3cqZAk">
                  <ref role="3cqZAo" node="d" resolve="props_Scholarship" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="5t" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h3" resolve="Scholarship" />
            </node>
          </node>
          <node concept="3KbdKl" id="1e" role="3KbHQx">
            <node concept="3clFbS" id="5O" role="3Kbo56">
              <node concept="3clFbJ" id="5Q" role="3cqZAp">
                <node concept="3clFbS" id="5S" role="3clFbx">
                  <node concept="3cpWs8" id="5U" role="3cqZAp">
                    <node concept="3cpWsn" id="5X" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="5Y" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="5Z" role="33vP2m">
                        <node concept="1pGfFk" id="60" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="5V" role="3cqZAp">
                    <node concept="2OqwBi" id="61" role="3clFbG">
                      <node concept="37vLTw" id="62" role="2Oq$k0">
                        <ref role="3cqZAo" node="5X" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="63" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:2749287990149158410" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="5W" role="3cqZAp">
                    <node concept="37vLTI" id="64" role="3clFbG">
                      <node concept="2OqwBi" id="65" role="37vLTx">
                        <node concept="37vLTw" id="67" role="2Oq$k0">
                          <ref role="3cqZAo" node="5X" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="68" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="66" role="37vLTJ">
                        <ref role="3cqZAo" node="e" resolve="props_Step" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="5T" role="3clFbw">
                  <node concept="10Nm6u" id="69" role="3uHU7w" />
                  <node concept="37vLTw" id="6a" role="3uHU7B">
                    <ref role="3cqZAo" node="e" resolve="props_Step" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="5R" role="3cqZAp">
                <node concept="37vLTw" id="6b" role="3cqZAk">
                  <ref role="3cqZAo" node="e" resolve="props_Step" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="5P" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h4" resolve="Step" />
            </node>
          </node>
          <node concept="3KbdKl" id="1f" role="3KbHQx">
            <node concept="3clFbS" id="6c" role="3Kbo56">
              <node concept="3clFbJ" id="6e" role="3cqZAp">
                <node concept="3clFbS" id="6g" role="3clFbx">
                  <node concept="3cpWs8" id="6i" role="3cqZAp">
                    <node concept="3cpWsn" id="6l" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="6m" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="6n" role="33vP2m">
                        <node concept="1pGfFk" id="6o" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="6j" role="3cqZAp">
                    <node concept="2OqwBi" id="6p" role="3clFbG">
                      <node concept="37vLTw" id="6q" role="2Oq$k0">
                        <ref role="3cqZAo" node="6l" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="6r" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:2749287990149148206" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="6k" role="3cqZAp">
                    <node concept="37vLTI" id="6s" role="3clFbG">
                      <node concept="2OqwBi" id="6t" role="37vLTx">
                        <node concept="37vLTw" id="6v" role="2Oq$k0">
                          <ref role="3cqZAo" node="6l" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="6w" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="6u" role="37vLTJ">
                        <ref role="3cqZAo" node="f" resolve="props_University" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="6h" role="3clFbw">
                  <node concept="10Nm6u" id="6x" role="3uHU7w" />
                  <node concept="37vLTw" id="6y" role="3uHU7B">
                    <ref role="3cqZAo" node="f" resolve="props_University" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="6f" role="3cqZAp">
                <node concept="37vLTw" id="6z" role="3cqZAk">
                  <ref role="3cqZAo" node="f" resolve="props_University" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="6d" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h5" resolve="University" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="S" role="3cqZAp">
          <node concept="10Nm6u" id="6$" role="3cqZAk" />
        </node>
      </node>
      <node concept="3uibUv" id="M" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="2AHcQZ" id="N" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="O" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="6_">
    <property role="3GE5qa" value="Requirement" />
    <property role="TrG5h" value="EnumerationDescriptor_DegreeLevel" />
    <uo k="s:originTrace" v="n:2749287990149158375" />
    <node concept="2tJIrI" id="6A" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="3clFbW" id="6B" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3cqZAl" id="6S" role="3clF45">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3Tm1VV" id="6T" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3clFbS" id="6U" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="XkiVB" id="6V" role="3cqZAp">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String)" resolve="EnumerationDescriptorBase" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="1adDum" id="6W" role="37wK5m">
            <property role="1adDun" value="0x45d743938b794afaL" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="1adDum" id="6X" role="37wK5m">
            <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="1adDum" id="6Y" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695e7L" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="Xl_RD" id="6Z" role="37wK5m">
            <property role="Xl_RC" value="DegreeLevel" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="Xl_RD" id="70" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158375" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6C" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="312cEg" id="6D" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_BACHELOR_0" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3Tm6S6" id="71" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3uibUv" id="72" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="2ShNRf" id="73" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="1pGfFk" id="74" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="Xl_RD" id="75" role="37wK5m">
            <property role="Xl_RC" value="BACHELOR" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="Xl_RD" id="76" role="37wK5m">
            <property role="Xl_RC" value="bachelor" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="1adDum" id="77" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695e9L" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="Xl_RD" id="78" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158377" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="6E" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_MASTER_0" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3Tm6S6" id="79" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3uibUv" id="7a" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="2ShNRf" id="7b" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="1pGfFk" id="7c" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="Xl_RD" id="7d" role="37wK5m">
            <property role="Xl_RC" value="MASTER" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="Xl_RD" id="7e" role="37wK5m">
            <property role="Xl_RC" value="master" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="1adDum" id="7f" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695ebL" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="Xl_RD" id="7g" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158379" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="6F" role="1B3o_S">
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="3uibUv" id="6G" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~EnumerationDescriptorBase" resolve="EnumerationDescriptorBase" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="2tJIrI" id="6H" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="312cEg" id="6I" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3Tm6S6" id="7h" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3uibUv" id="7i" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="2YIFZM" id="7j" role="33vP2m">
        <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.build(long,long,long,long...):jetbrains.mps.lang.smodel.EnumerationLiteralsIndex" resolve="build" />
        <ref role="1Pybhc" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="1adDum" id="7k" role="37wK5m">
          <property role="1adDun" value="0x45d743938b794afaL" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
        <node concept="1adDum" id="7l" role="37wK5m">
          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
        <node concept="1adDum" id="7m" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695e7L" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
        <node concept="1adDum" id="7n" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695e9L" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
        <node concept="1adDum" id="7o" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695ebL" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="6J" role="jymVt">
      <property role="TrG5h" value="myMembers" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3Tm6S6" id="7p" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3uibUv" id="7q" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="3uibUv" id="7s" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
      </node>
      <node concept="2ShNRf" id="7r" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="1pGfFk" id="7t" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase$MembersList.&lt;init&gt;(jetbrains.mps.smodel.runtime.EnumerationDescriptorBase,jetbrains.mps.lang.smodel.EnumerationLiteralsIndex,jetbrains.mps.smodel.runtime.EnumerationDescriptor$MemberDescriptor...)" resolve="EnumerationDescriptorBase.MembersList" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="37vLTw" id="7u" role="37wK5m">
            <ref role="3cqZAo" node="6I" resolve="myIndex" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="37vLTw" id="7v" role="37wK5m">
            <ref role="3cqZAo" node="6D" resolve="myMember_BACHELOR_0" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="37vLTw" id="7w" role="37wK5m">
            <ref role="3cqZAo" node="6E" resolve="myMember_MASTER_0" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6K" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="3clFb_" id="6L" role="jymVt">
      <property role="TrG5h" value="getDefault" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3Tm1VV" id="7x" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="2AHcQZ" id="7y" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3uibUv" id="7z" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3clFbS" id="7$" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="3clFbF" id="7A" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="37vLTw" id="7B" role="3clFbG">
            <ref role="3cqZAo" node="6D" resolve="myMember_BACHELOR_0" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="7_" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
    </node>
    <node concept="2tJIrI" id="6M" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="3clFb_" id="6N" role="jymVt">
      <property role="TrG5h" value="getMembers" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3Tm1VV" id="7C" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="2AHcQZ" id="7D" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3uibUv" id="7E" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="3uibUv" id="7H" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
      </node>
      <node concept="3clFbS" id="7F" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="3cpWs6" id="7I" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="37vLTw" id="7J" role="3cqZAk">
            <ref role="3cqZAo" node="6J" resolve="myMembers" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="7G" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
    </node>
    <node concept="2tJIrI" id="6O" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="3clFb_" id="6P" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3Tm1VV" id="7K" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="2AHcQZ" id="7L" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3uibUv" id="7M" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="37vLTG" id="7N" role="3clF46">
        <property role="TrG5h" value="memberName" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="3uibUv" id="7Q" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
        <node concept="2AHcQZ" id="7R" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
      </node>
      <node concept="3clFbS" id="7O" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="3clFbJ" id="7S" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="3clFbS" id="7V" role="3clFbx">
            <uo k="s:originTrace" v="n:2749287990149158375" />
            <node concept="3cpWs6" id="7X" role="3cqZAp">
              <uo k="s:originTrace" v="n:2749287990149158375" />
              <node concept="10Nm6u" id="7Y" role="3cqZAk">
                <uo k="s:originTrace" v="n:2749287990149158375" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="7W" role="3clFbw">
            <uo k="s:originTrace" v="n:2749287990149158375" />
            <node concept="10Nm6u" id="7Z" role="3uHU7w">
              <uo k="s:originTrace" v="n:2749287990149158375" />
            </node>
            <node concept="37vLTw" id="80" role="3uHU7B">
              <ref role="3cqZAo" node="7N" resolve="memberName" />
              <uo k="s:originTrace" v="n:2749287990149158375" />
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="7T" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="37vLTw" id="81" role="3KbGdf">
            <ref role="3cqZAo" node="7N" resolve="memberName" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
          <node concept="3KbdKl" id="82" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149158375" />
            <node concept="Xl_RD" id="84" role="3Kbmr1">
              <property role="Xl_RC" value="BACHELOR" />
              <uo k="s:originTrace" v="n:2749287990149158375" />
            </node>
            <node concept="3clFbS" id="85" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149158375" />
              <node concept="3cpWs6" id="86" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149158375" />
                <node concept="37vLTw" id="87" role="3cqZAk">
                  <ref role="3cqZAo" node="6D" resolve="myMember_BACHELOR_0" />
                  <uo k="s:originTrace" v="n:2749287990149158375" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="83" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149158375" />
            <node concept="Xl_RD" id="88" role="3Kbmr1">
              <property role="Xl_RC" value="MASTER" />
              <uo k="s:originTrace" v="n:2749287990149158375" />
            </node>
            <node concept="3clFbS" id="89" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149158375" />
              <node concept="3cpWs6" id="8a" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149158375" />
                <node concept="37vLTw" id="8b" role="3cqZAk">
                  <ref role="3cqZAo" node="6E" resolve="myMember_MASTER_0" />
                  <uo k="s:originTrace" v="n:2749287990149158375" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="7U" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="10Nm6u" id="8c" role="3cqZAk">
            <uo k="s:originTrace" v="n:2749287990149158375" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="7P" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
    </node>
    <node concept="2tJIrI" id="6Q" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158375" />
    </node>
    <node concept="3clFb_" id="6R" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:2749287990149158375" />
      <node concept="3Tm1VV" id="8d" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="2AHcQZ" id="8e" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="3uibUv" id="8f" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
      <node concept="37vLTG" id="8g" role="3clF46">
        <property role="TrG5h" value="idValue" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="3cpWsb" id="8j" role="1tU5fm">
          <uo k="s:originTrace" v="n:2749287990149158375" />
        </node>
      </node>
      <node concept="3clFbS" id="8h" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158375" />
        <node concept="3cpWs8" id="8k" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="3cpWsn" id="8n" role="3cpWs9">
            <property role="TrG5h" value="index" />
            <uo k="s:originTrace" v="n:2749287990149158375" />
            <node concept="10Oyi0" id="8o" role="1tU5fm">
              <uo k="s:originTrace" v="n:2749287990149158375" />
            </node>
            <node concept="2OqwBi" id="8p" role="33vP2m">
              <uo k="s:originTrace" v="n:2749287990149158375" />
              <node concept="37vLTw" id="8q" role="2Oq$k0">
                <ref role="3cqZAo" node="6I" resolve="myIndex" />
                <uo k="s:originTrace" v="n:2749287990149158375" />
              </node>
              <node concept="liA8E" id="8r" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.index(long):int" resolve="index" />
                <uo k="s:originTrace" v="n:2749287990149158375" />
                <node concept="37vLTw" id="8s" role="37wK5m">
                  <ref role="3cqZAo" node="8g" resolve="idValue" />
                  <uo k="s:originTrace" v="n:2749287990149158375" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="8l" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="3clFbS" id="8t" role="3clFbx">
            <uo k="s:originTrace" v="n:2749287990149158375" />
            <node concept="3cpWs6" id="8v" role="3cqZAp">
              <uo k="s:originTrace" v="n:2749287990149158375" />
              <node concept="10Nm6u" id="8w" role="3cqZAk">
                <uo k="s:originTrace" v="n:2749287990149158375" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="8u" role="3clFbw">
            <uo k="s:originTrace" v="n:2749287990149158375" />
            <node concept="3cmrfG" id="8x" role="3uHU7w">
              <property role="3cmrfH" value="-1" />
              <uo k="s:originTrace" v="n:2749287990149158375" />
            </node>
            <node concept="37vLTw" id="8y" role="3uHU7B">
              <ref role="3cqZAo" node="8n" resolve="index" />
              <uo k="s:originTrace" v="n:2749287990149158375" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8m" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158375" />
          <node concept="2OqwBi" id="8z" role="3clFbG">
            <uo k="s:originTrace" v="n:2749287990149158375" />
            <node concept="37vLTw" id="8$" role="2Oq$k0">
              <ref role="3cqZAo" node="6J" resolve="myMembers" />
              <uo k="s:originTrace" v="n:2749287990149158375" />
            </node>
            <node concept="liA8E" id="8_" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
              <uo k="s:originTrace" v="n:2749287990149158375" />
              <node concept="37vLTw" id="8A" role="37wK5m">
                <ref role="3cqZAo" node="8n" resolve="index" />
                <uo k="s:originTrace" v="n:2749287990149158375" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="8i" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149158375" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="8B">
    <property role="3GE5qa" value="Requirement" />
    <property role="TrG5h" value="EnumerationDescriptor_LanguageLevel" />
    <uo k="s:originTrace" v="n:2749287990149158383" />
    <node concept="2tJIrI" id="8C" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="3clFbW" id="8D" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3cqZAl" id="8Y" role="3clF45">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3Tm1VV" id="8Z" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3clFbS" id="90" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="XkiVB" id="91" role="3cqZAp">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String)" resolve="EnumerationDescriptorBase" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="1adDum" id="92" role="37wK5m">
            <property role="1adDun" value="0x45d743938b794afaL" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="1adDum" id="93" role="37wK5m">
            <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="1adDum" id="94" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695efL" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="95" role="37wK5m">
            <property role="Xl_RC" value="LanguageLevel" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="96" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158383" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="8E" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="312cEg" id="8F" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_A1_0" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm6S6" id="97" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="98" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2ShNRf" id="99" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="1pGfFk" id="9a" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="Xl_RD" id="9b" role="37wK5m">
            <property role="Xl_RC" value="A1" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9c" role="37wK5m">
            <property role="Xl_RC" value="a1" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="1adDum" id="9d" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695f0L" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9e" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158384" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="8G" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_A2_0" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm6S6" id="9f" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="9g" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2ShNRf" id="9h" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="1pGfFk" id="9i" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="Xl_RD" id="9j" role="37wK5m">
            <property role="Xl_RC" value="A2" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9k" role="37wK5m">
            <property role="Xl_RC" value="a2" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="1adDum" id="9l" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695f1L" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9m" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158385" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="8H" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_B1_0" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm6S6" id="9n" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="9o" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2ShNRf" id="9p" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="1pGfFk" id="9q" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="Xl_RD" id="9r" role="37wK5m">
            <property role="Xl_RC" value="B1" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9s" role="37wK5m">
            <property role="Xl_RC" value="b1" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="1adDum" id="9t" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695f4L" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9u" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158388" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="8I" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_B2_0" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm6S6" id="9v" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="9w" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2ShNRf" id="9x" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="1pGfFk" id="9y" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="Xl_RD" id="9z" role="37wK5m">
            <property role="Xl_RC" value="B2" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9$" role="37wK5m">
            <property role="Xl_RC" value="b2" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="1adDum" id="9_" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695f8L" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9A" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158392" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="8J" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_C1_0" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm6S6" id="9B" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="9C" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2ShNRf" id="9D" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="1pGfFk" id="9E" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="Xl_RD" id="9F" role="37wK5m">
            <property role="Xl_RC" value="C1" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9G" role="37wK5m">
            <property role="Xl_RC" value="c1" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="1adDum" id="9H" role="37wK5m">
            <property role="1adDun" value="0x26276edc561695fdL" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9I" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158397" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="8K" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_C2_0" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm6S6" id="9J" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="9K" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2ShNRf" id="9L" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="1pGfFk" id="9M" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="Xl_RD" id="9N" role="37wK5m">
            <property role="Xl_RC" value="C2" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9O" role="37wK5m">
            <property role="Xl_RC" value="c2" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="1adDum" id="9P" role="37wK5m">
            <property role="1adDun" value="0x26276edc56169603L" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="Xl_RD" id="9Q" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158403" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="8L" role="1B3o_S">
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="3uibUv" id="8M" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~EnumerationDescriptorBase" resolve="EnumerationDescriptorBase" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="2tJIrI" id="8N" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="312cEg" id="8O" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm6S6" id="9R" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="9S" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2YIFZM" id="9T" role="33vP2m">
        <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.build(long,long,long,long...):jetbrains.mps.lang.smodel.EnumerationLiteralsIndex" resolve="build" />
        <ref role="1Pybhc" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="1adDum" id="9U" role="37wK5m">
          <property role="1adDun" value="0x45d743938b794afaL" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="1adDum" id="9V" role="37wK5m">
          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="1adDum" id="9W" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695efL" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="1adDum" id="9X" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695f0L" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="1adDum" id="9Y" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695f1L" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="1adDum" id="9Z" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695f4L" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="1adDum" id="a0" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695f8L" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="1adDum" id="a1" role="37wK5m">
          <property role="1adDun" value="0x26276edc561695fdL" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="1adDum" id="a2" role="37wK5m">
          <property role="1adDun" value="0x26276edc56169603L" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="8P" role="jymVt">
      <property role="TrG5h" value="myMembers" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm6S6" id="a3" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="a4" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="3uibUv" id="a6" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
      </node>
      <node concept="2ShNRf" id="a5" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="1pGfFk" id="a7" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase$MembersList.&lt;init&gt;(jetbrains.mps.smodel.runtime.EnumerationDescriptorBase,jetbrains.mps.lang.smodel.EnumerationLiteralsIndex,jetbrains.mps.smodel.runtime.EnumerationDescriptor$MemberDescriptor...)" resolve="EnumerationDescriptorBase.MembersList" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="37vLTw" id="a8" role="37wK5m">
            <ref role="3cqZAo" node="8O" resolve="myIndex" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="37vLTw" id="a9" role="37wK5m">
            <ref role="3cqZAo" node="8F" resolve="myMember_A1_0" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="37vLTw" id="aa" role="37wK5m">
            <ref role="3cqZAo" node="8G" resolve="myMember_A2_0" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="37vLTw" id="ab" role="37wK5m">
            <ref role="3cqZAo" node="8H" resolve="myMember_B1_0" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="37vLTw" id="ac" role="37wK5m">
            <ref role="3cqZAo" node="8I" resolve="myMember_B2_0" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="37vLTw" id="ad" role="37wK5m">
            <ref role="3cqZAo" node="8J" resolve="myMember_C1_0" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="37vLTw" id="ae" role="37wK5m">
            <ref role="3cqZAo" node="8K" resolve="myMember_C2_0" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="8Q" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="3clFb_" id="8R" role="jymVt">
      <property role="TrG5h" value="getDefault" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm1VV" id="af" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2AHcQZ" id="ag" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="ah" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3clFbS" id="ai" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="3clFbF" id="ak" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="10Nm6u" id="al" role="3clFbG">
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="aj" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
    </node>
    <node concept="2tJIrI" id="8S" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="3clFb_" id="8T" role="jymVt">
      <property role="TrG5h" value="getMembers" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm1VV" id="am" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2AHcQZ" id="an" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="ao" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="3uibUv" id="ar" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
      </node>
      <node concept="3clFbS" id="ap" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="3cpWs6" id="as" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="37vLTw" id="at" role="3cqZAk">
            <ref role="3cqZAo" node="8P" resolve="myMembers" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="aq" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
    </node>
    <node concept="2tJIrI" id="8U" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="3clFb_" id="8V" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm1VV" id="au" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2AHcQZ" id="av" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="aw" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="37vLTG" id="ax" role="3clF46">
        <property role="TrG5h" value="memberName" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="3uibUv" id="a$" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
        <node concept="2AHcQZ" id="a_" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
      </node>
      <node concept="3clFbS" id="ay" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="3clFbJ" id="aA" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="3clFbS" id="aD" role="3clFbx">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="3cpWs6" id="aF" role="3cqZAp">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="10Nm6u" id="aG" role="3cqZAk">
                <uo k="s:originTrace" v="n:2749287990149158383" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="aE" role="3clFbw">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="10Nm6u" id="aH" role="3uHU7w">
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="37vLTw" id="aI" role="3uHU7B">
              <ref role="3cqZAo" node="ax" resolve="memberName" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="aB" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="37vLTw" id="aJ" role="3KbGdf">
            <ref role="3cqZAo" node="ax" resolve="memberName" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
          <node concept="3KbdKl" id="aK" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="Xl_RD" id="aQ" role="3Kbmr1">
              <property role="Xl_RC" value="A1" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="3clFbS" id="aR" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="3cpWs6" id="aS" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149158383" />
                <node concept="37vLTw" id="aT" role="3cqZAk">
                  <ref role="3cqZAo" node="8F" resolve="myMember_A1_0" />
                  <uo k="s:originTrace" v="n:2749287990149158383" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="aL" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="Xl_RD" id="aU" role="3Kbmr1">
              <property role="Xl_RC" value="A2" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="3clFbS" id="aV" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="3cpWs6" id="aW" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149158383" />
                <node concept="37vLTw" id="aX" role="3cqZAk">
                  <ref role="3cqZAo" node="8G" resolve="myMember_A2_0" />
                  <uo k="s:originTrace" v="n:2749287990149158383" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="aM" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="Xl_RD" id="aY" role="3Kbmr1">
              <property role="Xl_RC" value="B1" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="3clFbS" id="aZ" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="3cpWs6" id="b0" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149158383" />
                <node concept="37vLTw" id="b1" role="3cqZAk">
                  <ref role="3cqZAo" node="8H" resolve="myMember_B1_0" />
                  <uo k="s:originTrace" v="n:2749287990149158383" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="aN" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="Xl_RD" id="b2" role="3Kbmr1">
              <property role="Xl_RC" value="B2" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="3clFbS" id="b3" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="3cpWs6" id="b4" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149158383" />
                <node concept="37vLTw" id="b5" role="3cqZAk">
                  <ref role="3cqZAo" node="8I" resolve="myMember_B2_0" />
                  <uo k="s:originTrace" v="n:2749287990149158383" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="aO" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="Xl_RD" id="b6" role="3Kbmr1">
              <property role="Xl_RC" value="C1" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="3clFbS" id="b7" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="3cpWs6" id="b8" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149158383" />
                <node concept="37vLTw" id="b9" role="3cqZAk">
                  <ref role="3cqZAo" node="8J" resolve="myMember_C1_0" />
                  <uo k="s:originTrace" v="n:2749287990149158383" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="aP" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="Xl_RD" id="ba" role="3Kbmr1">
              <property role="Xl_RC" value="C2" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="3clFbS" id="bb" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="3cpWs6" id="bc" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149158383" />
                <node concept="37vLTw" id="bd" role="3cqZAk">
                  <ref role="3cqZAo" node="8K" resolve="myMember_C2_0" />
                  <uo k="s:originTrace" v="n:2749287990149158383" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="aC" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="10Nm6u" id="be" role="3cqZAk">
            <uo k="s:originTrace" v="n:2749287990149158383" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="az" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
    </node>
    <node concept="2tJIrI" id="8W" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149158383" />
    </node>
    <node concept="3clFb_" id="8X" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:2749287990149158383" />
      <node concept="3Tm1VV" id="bf" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="2AHcQZ" id="bg" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="3uibUv" id="bh" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
      <node concept="37vLTG" id="bi" role="3clF46">
        <property role="TrG5h" value="idValue" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="3cpWsb" id="bl" role="1tU5fm">
          <uo k="s:originTrace" v="n:2749287990149158383" />
        </node>
      </node>
      <node concept="3clFbS" id="bj" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149158383" />
        <node concept="3cpWs8" id="bm" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="3cpWsn" id="bp" role="3cpWs9">
            <property role="TrG5h" value="index" />
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="10Oyi0" id="bq" role="1tU5fm">
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="2OqwBi" id="br" role="33vP2m">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="37vLTw" id="bs" role="2Oq$k0">
                <ref role="3cqZAo" node="8O" resolve="myIndex" />
                <uo k="s:originTrace" v="n:2749287990149158383" />
              </node>
              <node concept="liA8E" id="bt" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.index(long):int" resolve="index" />
                <uo k="s:originTrace" v="n:2749287990149158383" />
                <node concept="37vLTw" id="bu" role="37wK5m">
                  <ref role="3cqZAo" node="bi" resolve="idValue" />
                  <uo k="s:originTrace" v="n:2749287990149158383" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="bn" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="3clFbS" id="bv" role="3clFbx">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="3cpWs6" id="bx" role="3cqZAp">
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="10Nm6u" id="by" role="3cqZAk">
                <uo k="s:originTrace" v="n:2749287990149158383" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="bw" role="3clFbw">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="3cmrfG" id="bz" role="3uHU7w">
              <property role="3cmrfH" value="-1" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="37vLTw" id="b$" role="3uHU7B">
              <ref role="3cqZAo" node="bp" resolve="index" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bo" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149158383" />
          <node concept="2OqwBi" id="b_" role="3clFbG">
            <uo k="s:originTrace" v="n:2749287990149158383" />
            <node concept="37vLTw" id="bA" role="2Oq$k0">
              <ref role="3cqZAo" node="8P" resolve="myMembers" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
            </node>
            <node concept="liA8E" id="bB" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
              <uo k="s:originTrace" v="n:2749287990149158383" />
              <node concept="37vLTw" id="bC" role="37wK5m">
                <ref role="3cqZAo" node="bp" resolve="index" />
                <uo k="s:originTrace" v="n:2749287990149158383" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="bk" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149158383" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="bD">
    <property role="TrG5h" value="EnumerationDescriptor_PartnerType" />
    <uo k="s:originTrace" v="n:2749287990149148238" />
    <node concept="2tJIrI" id="bE" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="3clFbW" id="bF" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3cqZAl" id="bW" role="3clF45">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3Tm1VV" id="bX" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3clFbS" id="bY" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="XkiVB" id="bZ" role="3cqZAp">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String)" resolve="EnumerationDescriptorBase" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="1adDum" id="c0" role="37wK5m">
            <property role="1adDun" value="0x45d743938b794afaL" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="1adDum" id="c1" role="37wK5m">
            <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="1adDum" id="c2" role="37wK5m">
            <property role="1adDun" value="0x26276edc56166e4eL" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="Xl_RD" id="c3" role="37wK5m">
            <property role="Xl_RC" value="PartnerType" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="Xl_RD" id="c4" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148238" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="bG" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="312cEg" id="bH" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_INDUSTRIAL_0" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3Tm6S6" id="c5" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3uibUv" id="c6" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="2ShNRf" id="c7" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="1pGfFk" id="c8" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="Xl_RD" id="c9" role="37wK5m">
            <property role="Xl_RC" value="INDUSTRIAL" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="Xl_RD" id="ca" role="37wK5m">
            <property role="Xl_RC" value="industrial" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="1adDum" id="cb" role="37wK5m">
            <property role="1adDun" value="0x26276edc56166e4fL" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="Xl_RD" id="cc" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148239" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="bI" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_ACADEMIC_0" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3Tm6S6" id="cd" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3uibUv" id="ce" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="2ShNRf" id="cf" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="1pGfFk" id="cg" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="Xl_RD" id="ch" role="37wK5m">
            <property role="Xl_RC" value="ACADEMIC" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="Xl_RD" id="ci" role="37wK5m">
            <property role="Xl_RC" value="academic" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="1adDum" id="cj" role="37wK5m">
            <property role="1adDun" value="0x26276edc56166e50L" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="Xl_RD" id="ck" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148240" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="bJ" role="1B3o_S">
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="3uibUv" id="bK" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~EnumerationDescriptorBase" resolve="EnumerationDescriptorBase" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="2tJIrI" id="bL" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="312cEg" id="bM" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3Tm6S6" id="cl" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3uibUv" id="cm" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="2YIFZM" id="cn" role="33vP2m">
        <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.build(long,long,long,long...):jetbrains.mps.lang.smodel.EnumerationLiteralsIndex" resolve="build" />
        <ref role="1Pybhc" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="1adDum" id="co" role="37wK5m">
          <property role="1adDun" value="0x45d743938b794afaL" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
        <node concept="1adDum" id="cp" role="37wK5m">
          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
        <node concept="1adDum" id="cq" role="37wK5m">
          <property role="1adDun" value="0x26276edc56166e4eL" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
        <node concept="1adDum" id="cr" role="37wK5m">
          <property role="1adDun" value="0x26276edc56166e4fL" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
        <node concept="1adDum" id="cs" role="37wK5m">
          <property role="1adDun" value="0x26276edc56166e50L" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="bN" role="jymVt">
      <property role="TrG5h" value="myMembers" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3Tm6S6" id="ct" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3uibUv" id="cu" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="3uibUv" id="cw" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
      </node>
      <node concept="2ShNRf" id="cv" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="1pGfFk" id="cx" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase$MembersList.&lt;init&gt;(jetbrains.mps.smodel.runtime.EnumerationDescriptorBase,jetbrains.mps.lang.smodel.EnumerationLiteralsIndex,jetbrains.mps.smodel.runtime.EnumerationDescriptor$MemberDescriptor...)" resolve="EnumerationDescriptorBase.MembersList" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="37vLTw" id="cy" role="37wK5m">
            <ref role="3cqZAo" node="bM" resolve="myIndex" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="37vLTw" id="cz" role="37wK5m">
            <ref role="3cqZAo" node="bH" resolve="myMember_INDUSTRIAL_0" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="37vLTw" id="c$" role="37wK5m">
            <ref role="3cqZAo" node="bI" resolve="myMember_ACADEMIC_0" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="bO" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="3clFb_" id="bP" role="jymVt">
      <property role="TrG5h" value="getDefault" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3Tm1VV" id="c_" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="2AHcQZ" id="cA" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3uibUv" id="cB" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3clFbS" id="cC" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="3clFbF" id="cE" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="10Nm6u" id="cF" role="3clFbG">
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="cD" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
    </node>
    <node concept="2tJIrI" id="bQ" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="3clFb_" id="bR" role="jymVt">
      <property role="TrG5h" value="getMembers" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3Tm1VV" id="cG" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="2AHcQZ" id="cH" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3uibUv" id="cI" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="3uibUv" id="cL" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
      </node>
      <node concept="3clFbS" id="cJ" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="3cpWs6" id="cM" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="37vLTw" id="cN" role="3cqZAk">
            <ref role="3cqZAo" node="bN" resolve="myMembers" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="cK" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
    </node>
    <node concept="2tJIrI" id="bS" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="3clFb_" id="bT" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3Tm1VV" id="cO" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="2AHcQZ" id="cP" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3uibUv" id="cQ" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="37vLTG" id="cR" role="3clF46">
        <property role="TrG5h" value="memberName" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="3uibUv" id="cU" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
        <node concept="2AHcQZ" id="cV" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
      </node>
      <node concept="3clFbS" id="cS" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="3clFbJ" id="cW" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="3clFbS" id="cZ" role="3clFbx">
            <uo k="s:originTrace" v="n:2749287990149148238" />
            <node concept="3cpWs6" id="d1" role="3cqZAp">
              <uo k="s:originTrace" v="n:2749287990149148238" />
              <node concept="10Nm6u" id="d2" role="3cqZAk">
                <uo k="s:originTrace" v="n:2749287990149148238" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="d0" role="3clFbw">
            <uo k="s:originTrace" v="n:2749287990149148238" />
            <node concept="10Nm6u" id="d3" role="3uHU7w">
              <uo k="s:originTrace" v="n:2749287990149148238" />
            </node>
            <node concept="37vLTw" id="d4" role="3uHU7B">
              <ref role="3cqZAo" node="cR" resolve="memberName" />
              <uo k="s:originTrace" v="n:2749287990149148238" />
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="cX" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="37vLTw" id="d5" role="3KbGdf">
            <ref role="3cqZAo" node="cR" resolve="memberName" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
          <node concept="3KbdKl" id="d6" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149148238" />
            <node concept="Xl_RD" id="d8" role="3Kbmr1">
              <property role="Xl_RC" value="INDUSTRIAL" />
              <uo k="s:originTrace" v="n:2749287990149148238" />
            </node>
            <node concept="3clFbS" id="d9" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149148238" />
              <node concept="3cpWs6" id="da" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149148238" />
                <node concept="37vLTw" id="db" role="3cqZAk">
                  <ref role="3cqZAo" node="bH" resolve="myMember_INDUSTRIAL_0" />
                  <uo k="s:originTrace" v="n:2749287990149148238" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="d7" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149148238" />
            <node concept="Xl_RD" id="dc" role="3Kbmr1">
              <property role="Xl_RC" value="ACADEMIC" />
              <uo k="s:originTrace" v="n:2749287990149148238" />
            </node>
            <node concept="3clFbS" id="dd" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149148238" />
              <node concept="3cpWs6" id="de" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149148238" />
                <node concept="37vLTw" id="df" role="3cqZAk">
                  <ref role="3cqZAo" node="bI" resolve="myMember_ACADEMIC_0" />
                  <uo k="s:originTrace" v="n:2749287990149148238" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="cY" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="10Nm6u" id="dg" role="3cqZAk">
            <uo k="s:originTrace" v="n:2749287990149148238" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="cT" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
    </node>
    <node concept="2tJIrI" id="bU" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148238" />
    </node>
    <node concept="3clFb_" id="bV" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:2749287990149148238" />
      <node concept="3Tm1VV" id="dh" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="2AHcQZ" id="di" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="3uibUv" id="dj" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
      <node concept="37vLTG" id="dk" role="3clF46">
        <property role="TrG5h" value="idValue" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="3cpWsb" id="dn" role="1tU5fm">
          <uo k="s:originTrace" v="n:2749287990149148238" />
        </node>
      </node>
      <node concept="3clFbS" id="dl" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148238" />
        <node concept="3cpWs8" id="do" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="3cpWsn" id="dr" role="3cpWs9">
            <property role="TrG5h" value="index" />
            <uo k="s:originTrace" v="n:2749287990149148238" />
            <node concept="10Oyi0" id="ds" role="1tU5fm">
              <uo k="s:originTrace" v="n:2749287990149148238" />
            </node>
            <node concept="2OqwBi" id="dt" role="33vP2m">
              <uo k="s:originTrace" v="n:2749287990149148238" />
              <node concept="37vLTw" id="du" role="2Oq$k0">
                <ref role="3cqZAo" node="bM" resolve="myIndex" />
                <uo k="s:originTrace" v="n:2749287990149148238" />
              </node>
              <node concept="liA8E" id="dv" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.index(long):int" resolve="index" />
                <uo k="s:originTrace" v="n:2749287990149148238" />
                <node concept="37vLTw" id="dw" role="37wK5m">
                  <ref role="3cqZAo" node="dk" resolve="idValue" />
                  <uo k="s:originTrace" v="n:2749287990149148238" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="dp" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="3clFbS" id="dx" role="3clFbx">
            <uo k="s:originTrace" v="n:2749287990149148238" />
            <node concept="3cpWs6" id="dz" role="3cqZAp">
              <uo k="s:originTrace" v="n:2749287990149148238" />
              <node concept="10Nm6u" id="d$" role="3cqZAk">
                <uo k="s:originTrace" v="n:2749287990149148238" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="dy" role="3clFbw">
            <uo k="s:originTrace" v="n:2749287990149148238" />
            <node concept="3cmrfG" id="d_" role="3uHU7w">
              <property role="3cmrfH" value="-1" />
              <uo k="s:originTrace" v="n:2749287990149148238" />
            </node>
            <node concept="37vLTw" id="dA" role="3uHU7B">
              <ref role="3cqZAo" node="dr" resolve="index" />
              <uo k="s:originTrace" v="n:2749287990149148238" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="dq" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148238" />
          <node concept="2OqwBi" id="dB" role="3clFbG">
            <uo k="s:originTrace" v="n:2749287990149148238" />
            <node concept="37vLTw" id="dC" role="2Oq$k0">
              <ref role="3cqZAo" node="bN" resolve="myMembers" />
              <uo k="s:originTrace" v="n:2749287990149148238" />
            </node>
            <node concept="liA8E" id="dD" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
              <uo k="s:originTrace" v="n:2749287990149148238" />
              <node concept="37vLTw" id="dE" role="37wK5m">
                <ref role="3cqZAo" node="dr" resolve="index" />
                <uo k="s:originTrace" v="n:2749287990149148238" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="dm" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149148238" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="dF">
    <property role="TrG5h" value="EnumerationDescriptor_ScholarshipType" />
    <uo k="s:originTrace" v="n:2749287990149148184" />
    <node concept="2tJIrI" id="dG" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="3clFbW" id="dH" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3cqZAl" id="dY" role="3clF45">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3Tm1VV" id="dZ" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3clFbS" id="e0" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="XkiVB" id="e1" role="3cqZAp">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String)" resolve="EnumerationDescriptorBase" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="1adDum" id="e2" role="37wK5m">
            <property role="1adDun" value="0x45d743938b794afaL" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="1adDum" id="e3" role="37wK5m">
            <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="1adDum" id="e4" role="37wK5m">
            <property role="1adDun" value="0x26276edc56166e18L" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="Xl_RD" id="e5" role="37wK5m">
            <property role="Xl_RC" value="ScholarshipType" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="Xl_RD" id="e6" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148184" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="dI" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="312cEg" id="dJ" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_PROGRAMCOUNTRY_0" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3Tm6S6" id="e7" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3uibUv" id="e8" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="2ShNRf" id="e9" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="1pGfFk" id="ea" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="Xl_RD" id="eb" role="37wK5m">
            <property role="Xl_RC" value="PROGRAMCOUNTRY" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="Xl_RD" id="ec" role="37wK5m">
            <property role="Xl_RC" value="programCountry" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="1adDum" id="ed" role="37wK5m">
            <property role="1adDun" value="0x26276edc56166e19L" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="Xl_RD" id="ee" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148185" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="dK" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_PARTNERCOUNTRY_0" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3Tm6S6" id="ef" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3uibUv" id="eg" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="2ShNRf" id="eh" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="1pGfFk" id="ei" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="Xl_RD" id="ej" role="37wK5m">
            <property role="Xl_RC" value="PARTNERCOUNTRY" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="Xl_RD" id="ek" role="37wK5m">
            <property role="Xl_RC" value="partnerCountry" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="1adDum" id="el" role="37wK5m">
            <property role="1adDun" value="0x26276edc56166e1bL" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="Xl_RD" id="em" role="37wK5m">
            <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148187" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="dL" role="1B3o_S">
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="3uibUv" id="dM" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~EnumerationDescriptorBase" resolve="EnumerationDescriptorBase" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="2tJIrI" id="dN" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="312cEg" id="dO" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3Tm6S6" id="en" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3uibUv" id="eo" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="2YIFZM" id="ep" role="33vP2m">
        <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.build(long,long,long,long...):jetbrains.mps.lang.smodel.EnumerationLiteralsIndex" resolve="build" />
        <ref role="1Pybhc" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="1adDum" id="eq" role="37wK5m">
          <property role="1adDun" value="0x45d743938b794afaL" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
        <node concept="1adDum" id="er" role="37wK5m">
          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
        <node concept="1adDum" id="es" role="37wK5m">
          <property role="1adDun" value="0x26276edc56166e18L" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
        <node concept="1adDum" id="et" role="37wK5m">
          <property role="1adDun" value="0x26276edc56166e19L" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
        <node concept="1adDum" id="eu" role="37wK5m">
          <property role="1adDun" value="0x26276edc56166e1bL" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="dP" role="jymVt">
      <property role="TrG5h" value="myMembers" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3Tm6S6" id="ev" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3uibUv" id="ew" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="3uibUv" id="ey" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
      </node>
      <node concept="2ShNRf" id="ex" role="33vP2m">
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="1pGfFk" id="ez" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase$MembersList.&lt;init&gt;(jetbrains.mps.smodel.runtime.EnumerationDescriptorBase,jetbrains.mps.lang.smodel.EnumerationLiteralsIndex,jetbrains.mps.smodel.runtime.EnumerationDescriptor$MemberDescriptor...)" resolve="EnumerationDescriptorBase.MembersList" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="37vLTw" id="e$" role="37wK5m">
            <ref role="3cqZAo" node="dO" resolve="myIndex" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="37vLTw" id="e_" role="37wK5m">
            <ref role="3cqZAo" node="dJ" resolve="myMember_PROGRAMCOUNTRY_0" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="37vLTw" id="eA" role="37wK5m">
            <ref role="3cqZAo" node="dK" resolve="myMember_PARTNERCOUNTRY_0" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="dQ" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="3clFb_" id="dR" role="jymVt">
      <property role="TrG5h" value="getDefault" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3Tm1VV" id="eB" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="2AHcQZ" id="eC" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3uibUv" id="eD" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3clFbS" id="eE" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="3clFbF" id="eG" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="10Nm6u" id="eH" role="3clFbG">
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="eF" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
    </node>
    <node concept="2tJIrI" id="dS" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="3clFb_" id="dT" role="jymVt">
      <property role="TrG5h" value="getMembers" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3Tm1VV" id="eI" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="2AHcQZ" id="eJ" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3uibUv" id="eK" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="3uibUv" id="eN" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
      </node>
      <node concept="3clFbS" id="eL" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="3cpWs6" id="eO" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="37vLTw" id="eP" role="3cqZAk">
            <ref role="3cqZAo" node="dP" resolve="myMembers" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="eM" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
    </node>
    <node concept="2tJIrI" id="dU" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="3clFb_" id="dV" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3Tm1VV" id="eQ" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="2AHcQZ" id="eR" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3uibUv" id="eS" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="37vLTG" id="eT" role="3clF46">
        <property role="TrG5h" value="memberName" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="3uibUv" id="eW" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
        <node concept="2AHcQZ" id="eX" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
      </node>
      <node concept="3clFbS" id="eU" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="3clFbJ" id="eY" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="3clFbS" id="f1" role="3clFbx">
            <uo k="s:originTrace" v="n:2749287990149148184" />
            <node concept="3cpWs6" id="f3" role="3cqZAp">
              <uo k="s:originTrace" v="n:2749287990149148184" />
              <node concept="10Nm6u" id="f4" role="3cqZAk">
                <uo k="s:originTrace" v="n:2749287990149148184" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="f2" role="3clFbw">
            <uo k="s:originTrace" v="n:2749287990149148184" />
            <node concept="10Nm6u" id="f5" role="3uHU7w">
              <uo k="s:originTrace" v="n:2749287990149148184" />
            </node>
            <node concept="37vLTw" id="f6" role="3uHU7B">
              <ref role="3cqZAo" node="eT" resolve="memberName" />
              <uo k="s:originTrace" v="n:2749287990149148184" />
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="eZ" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="37vLTw" id="f7" role="3KbGdf">
            <ref role="3cqZAo" node="eT" resolve="memberName" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
          <node concept="3KbdKl" id="f8" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149148184" />
            <node concept="Xl_RD" id="fa" role="3Kbmr1">
              <property role="Xl_RC" value="PROGRAMCOUNTRY" />
              <uo k="s:originTrace" v="n:2749287990149148184" />
            </node>
            <node concept="3clFbS" id="fb" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149148184" />
              <node concept="3cpWs6" id="fc" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149148184" />
                <node concept="37vLTw" id="fd" role="3cqZAk">
                  <ref role="3cqZAo" node="dJ" resolve="myMember_PROGRAMCOUNTRY_0" />
                  <uo k="s:originTrace" v="n:2749287990149148184" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="f9" role="3KbHQx">
            <uo k="s:originTrace" v="n:2749287990149148184" />
            <node concept="Xl_RD" id="fe" role="3Kbmr1">
              <property role="Xl_RC" value="PARTNERCOUNTRY" />
              <uo k="s:originTrace" v="n:2749287990149148184" />
            </node>
            <node concept="3clFbS" id="ff" role="3Kbo56">
              <uo k="s:originTrace" v="n:2749287990149148184" />
              <node concept="3cpWs6" id="fg" role="3cqZAp">
                <uo k="s:originTrace" v="n:2749287990149148184" />
                <node concept="37vLTw" id="fh" role="3cqZAk">
                  <ref role="3cqZAo" node="dK" resolve="myMember_PARTNERCOUNTRY_0" />
                  <uo k="s:originTrace" v="n:2749287990149148184" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="f0" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="10Nm6u" id="fi" role="3cqZAk">
            <uo k="s:originTrace" v="n:2749287990149148184" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="eV" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
    </node>
    <node concept="2tJIrI" id="dW" role="jymVt">
      <uo k="s:originTrace" v="n:2749287990149148184" />
    </node>
    <node concept="3clFb_" id="dX" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:2749287990149148184" />
      <node concept="3Tm1VV" id="fj" role="1B3o_S">
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="2AHcQZ" id="fk" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="3uibUv" id="fl" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
      <node concept="37vLTG" id="fm" role="3clF46">
        <property role="TrG5h" value="idValue" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="3cpWsb" id="fp" role="1tU5fm">
          <uo k="s:originTrace" v="n:2749287990149148184" />
        </node>
      </node>
      <node concept="3clFbS" id="fn" role="3clF47">
        <uo k="s:originTrace" v="n:2749287990149148184" />
        <node concept="3cpWs8" id="fq" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="3cpWsn" id="ft" role="3cpWs9">
            <property role="TrG5h" value="index" />
            <uo k="s:originTrace" v="n:2749287990149148184" />
            <node concept="10Oyi0" id="fu" role="1tU5fm">
              <uo k="s:originTrace" v="n:2749287990149148184" />
            </node>
            <node concept="2OqwBi" id="fv" role="33vP2m">
              <uo k="s:originTrace" v="n:2749287990149148184" />
              <node concept="37vLTw" id="fw" role="2Oq$k0">
                <ref role="3cqZAo" node="dO" resolve="myIndex" />
                <uo k="s:originTrace" v="n:2749287990149148184" />
              </node>
              <node concept="liA8E" id="fx" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.index(long):int" resolve="index" />
                <uo k="s:originTrace" v="n:2749287990149148184" />
                <node concept="37vLTw" id="fy" role="37wK5m">
                  <ref role="3cqZAo" node="fm" resolve="idValue" />
                  <uo k="s:originTrace" v="n:2749287990149148184" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="fr" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="3clFbS" id="fz" role="3clFbx">
            <uo k="s:originTrace" v="n:2749287990149148184" />
            <node concept="3cpWs6" id="f_" role="3cqZAp">
              <uo k="s:originTrace" v="n:2749287990149148184" />
              <node concept="10Nm6u" id="fA" role="3cqZAk">
                <uo k="s:originTrace" v="n:2749287990149148184" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="f$" role="3clFbw">
            <uo k="s:originTrace" v="n:2749287990149148184" />
            <node concept="3cmrfG" id="fB" role="3uHU7w">
              <property role="3cmrfH" value="-1" />
              <uo k="s:originTrace" v="n:2749287990149148184" />
            </node>
            <node concept="37vLTw" id="fC" role="3uHU7B">
              <ref role="3cqZAo" node="ft" resolve="index" />
              <uo k="s:originTrace" v="n:2749287990149148184" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fs" role="3cqZAp">
          <uo k="s:originTrace" v="n:2749287990149148184" />
          <node concept="2OqwBi" id="fD" role="3clFbG">
            <uo k="s:originTrace" v="n:2749287990149148184" />
            <node concept="37vLTw" id="fE" role="2Oq$k0">
              <ref role="3cqZAo" node="dP" resolve="myMembers" />
              <uo k="s:originTrace" v="n:2749287990149148184" />
            </node>
            <node concept="liA8E" id="fF" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
              <uo k="s:originTrace" v="n:2749287990149148184" />
              <node concept="37vLTw" id="fG" role="37wK5m">
                <ref role="3cqZAo" node="ft" resolve="index" />
                <uo k="s:originTrace" v="n:2749287990149148184" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="fo" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2749287990149148184" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="fH">
    <node concept="39e2AJ" id="fI" role="39e2AI">
      <property role="39e3Y2" value="EnumerationDescriptorCons" />
      <node concept="39e2AG" id="fM" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnB" resolve="DegreeLevel" />
        <node concept="385nmt" id="fQ" role="385vvn">
          <property role="385vuF" value="DegreeLevel" />
          <node concept="3u3nmq" id="fS" role="385v07">
            <property role="3u3nmv" value="2749287990149158375" />
          </node>
        </node>
        <node concept="39e2AT" id="fR" role="39e2AY">
          <ref role="39e2AS" node="6B" resolve="EnumerationDescriptor_DegreeLevel" />
        </node>
      </node>
      <node concept="39e2AG" id="fN" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnJ" resolve="LanguageLevel" />
        <node concept="385nmt" id="fT" role="385vvn">
          <property role="385vuF" value="LanguageLevel" />
          <node concept="3u3nmq" id="fV" role="385v07">
            <property role="3u3nmv" value="2749287990149158383" />
          </node>
        </node>
        <node concept="39e2AT" id="fU" role="39e2AY">
          <ref role="39e2AS" node="8D" resolve="EnumerationDescriptor_LanguageLevel" />
        </node>
      </node>
      <node concept="39e2AG" id="fO" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5ATe" resolve="PartnerType" />
        <node concept="385nmt" id="fW" role="385vvn">
          <property role="385vuF" value="PartnerType" />
          <node concept="3u3nmq" id="fY" role="385v07">
            <property role="3u3nmv" value="2749287990149148238" />
          </node>
        </node>
        <node concept="39e2AT" id="fX" role="39e2AY">
          <ref role="39e2AS" node="bF" resolve="EnumerationDescriptor_PartnerType" />
        </node>
      </node>
      <node concept="39e2AG" id="fP" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5ASo" resolve="ScholarshipType" />
        <node concept="385nmt" id="fZ" role="385vvn">
          <property role="385vuF" value="ScholarshipType" />
          <node concept="3u3nmq" id="g1" role="385v07">
            <property role="3u3nmv" value="2749287990149148184" />
          </node>
        </node>
        <node concept="39e2AT" id="g0" role="39e2AY">
          <ref role="39e2AS" node="dH" resolve="EnumerationDescriptor_ScholarshipType" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="fJ" role="39e2AI">
      <property role="39e3Y2" value="EnumerationMember" />
      <node concept="39e2AG" id="g2" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnK" resolve="A1" />
        <node concept="385nmt" id="ge" role="385vvn">
          <property role="385vuF" value="A1" />
          <node concept="3u3nmq" id="gg" role="385v07">
            <property role="3u3nmv" value="2749287990149158384" />
          </node>
        </node>
        <node concept="39e2AT" id="gf" role="39e2AY">
          <ref role="39e2AS" node="8F" resolve="myMember_A1_0" />
        </node>
      </node>
      <node concept="39e2AG" id="g3" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnL" resolve="A2" />
        <node concept="385nmt" id="gh" role="385vvn">
          <property role="385vuF" value="A2" />
          <node concept="3u3nmq" id="gj" role="385v07">
            <property role="3u3nmv" value="2749287990149158385" />
          </node>
        </node>
        <node concept="39e2AT" id="gi" role="39e2AY">
          <ref role="39e2AS" node="8G" resolve="myMember_A2_0" />
        </node>
      </node>
      <node concept="39e2AG" id="g4" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5ATg" resolve="ACADEMIC" />
        <node concept="385nmt" id="gk" role="385vvn">
          <property role="385vuF" value="ACADEMIC" />
          <node concept="3u3nmq" id="gm" role="385v07">
            <property role="3u3nmv" value="2749287990149148240" />
          </node>
        </node>
        <node concept="39e2AT" id="gl" role="39e2AY">
          <ref role="39e2AS" node="bI" resolve="myMember_ACADEMIC_0" />
        </node>
      </node>
      <node concept="39e2AG" id="g5" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnO" resolve="B1" />
        <node concept="385nmt" id="gn" role="385vvn">
          <property role="385vuF" value="B1" />
          <node concept="3u3nmq" id="gp" role="385v07">
            <property role="3u3nmv" value="2749287990149158388" />
          </node>
        </node>
        <node concept="39e2AT" id="go" role="39e2AY">
          <ref role="39e2AS" node="8H" resolve="myMember_B1_0" />
        </node>
      </node>
      <node concept="39e2AG" id="g6" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnS" resolve="B2" />
        <node concept="385nmt" id="gq" role="385vvn">
          <property role="385vuF" value="B2" />
          <node concept="3u3nmq" id="gs" role="385v07">
            <property role="3u3nmv" value="2749287990149158392" />
          </node>
        </node>
        <node concept="39e2AT" id="gr" role="39e2AY">
          <ref role="39e2AS" node="8I" resolve="myMember_B2_0" />
        </node>
      </node>
      <node concept="39e2AG" id="g7" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnD" resolve="BACHELOR" />
        <node concept="385nmt" id="gt" role="385vvn">
          <property role="385vuF" value="BACHELOR" />
          <node concept="3u3nmq" id="gv" role="385v07">
            <property role="3u3nmv" value="2749287990149158377" />
          </node>
        </node>
        <node concept="39e2AT" id="gu" role="39e2AY">
          <ref role="39e2AS" node="6D" resolve="myMember_BACHELOR_0" />
        </node>
      </node>
      <node concept="39e2AG" id="g8" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnX" resolve="C1" />
        <node concept="385nmt" id="gw" role="385vvn">
          <property role="385vuF" value="C1" />
          <node concept="3u3nmq" id="gy" role="385v07">
            <property role="3u3nmv" value="2749287990149158397" />
          </node>
        </node>
        <node concept="39e2AT" id="gx" role="39e2AY">
          <ref role="39e2AS" node="8J" resolve="myMember_C1_0" />
        </node>
      </node>
      <node concept="39e2AG" id="g9" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5Do3" resolve="C2" />
        <node concept="385nmt" id="gz" role="385vvn">
          <property role="385vuF" value="C2" />
          <node concept="3u3nmq" id="g_" role="385v07">
            <property role="3u3nmv" value="2749287990149158403" />
          </node>
        </node>
        <node concept="39e2AT" id="g$" role="39e2AY">
          <ref role="39e2AS" node="8K" resolve="myMember_C2_0" />
        </node>
      </node>
      <node concept="39e2AG" id="ga" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5ATf" resolve="INDUSTRIAL" />
        <node concept="385nmt" id="gA" role="385vvn">
          <property role="385vuF" value="INDUSTRIAL" />
          <node concept="3u3nmq" id="gC" role="385v07">
            <property role="3u3nmv" value="2749287990149148239" />
          </node>
        </node>
        <node concept="39e2AT" id="gB" role="39e2AY">
          <ref role="39e2AS" node="bH" resolve="myMember_INDUSTRIAL_0" />
        </node>
      </node>
      <node concept="39e2AG" id="gb" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5DnF" resolve="MASTER" />
        <node concept="385nmt" id="gD" role="385vvn">
          <property role="385vuF" value="MASTER" />
          <node concept="3u3nmq" id="gF" role="385v07">
            <property role="3u3nmv" value="2749287990149158379" />
          </node>
        </node>
        <node concept="39e2AT" id="gE" role="39e2AY">
          <ref role="39e2AS" node="6E" resolve="myMember_MASTER_0" />
        </node>
      </node>
      <node concept="39e2AG" id="gc" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5ASr" resolve="PARTNERCOUNTRY" />
        <node concept="385nmt" id="gG" role="385vvn">
          <property role="385vuF" value="PARTNERCOUNTRY" />
          <node concept="3u3nmq" id="gI" role="385v07">
            <property role="3u3nmv" value="2749287990149148187" />
          </node>
        </node>
        <node concept="39e2AT" id="gH" role="39e2AY">
          <ref role="39e2AS" node="dK" resolve="myMember_PARTNERCOUNTRY_0" />
        </node>
      </node>
      <node concept="39e2AG" id="gd" role="39e3Y0">
        <ref role="39e2AK" to="mmpm:2oBrHLm5ASp" resolve="PROGRAMCOUNTRY" />
        <node concept="385nmt" id="gJ" role="385vvn">
          <property role="385vuF" value="PROGRAMCOUNTRY" />
          <node concept="3u3nmq" id="gL" role="385v07">
            <property role="3u3nmv" value="2749287990149148185" />
          </node>
        </node>
        <node concept="39e2AT" id="gK" role="39e2AY">
          <ref role="39e2AS" node="dJ" resolve="myMember_PROGRAMCOUNTRY_0" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="fK" role="39e2AI">
      <property role="39e3Y2" value="ConceptPresentationAspectClass" />
      <node concept="39e2AG" id="gM" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="gN" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="ConceptPresentationAspectImpl" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="fL" role="39e2AI">
      <property role="39e3Y2" value="StructureAspectDescriptorCons" />
      <node concept="39e2AG" id="gO" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="gP" role="39e2AY">
          <ref role="39e2AS" node="k7" resolve="StructureAspectDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="gQ">
    <property role="TrG5h" value="LanguageConceptSwitch" />
    <property role="1EXbeo" value="true" />
    <node concept="312cEg" id="gR" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="hd" role="1B3o_S" />
      <node concept="3uibUv" id="he" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~LanguageConceptIndex" resolve="LanguageConceptIndex" />
      </node>
    </node>
    <node concept="Wx3nA" id="gS" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="AdmissionStructure" />
      <node concept="3Tm1VV" id="hf" role="1B3o_S" />
      <node concept="10Oyi0" id="hg" role="1tU5fm" />
      <node concept="3cmrfG" id="hh" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="Wx3nA" id="gT" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="ApplicationProcess" />
      <node concept="3Tm1VV" id="hi" role="1B3o_S" />
      <node concept="10Oyi0" id="hj" role="1tU5fm" />
      <node concept="3cmrfG" id="hk" role="33vP2m">
        <property role="3cmrfH" value="1" />
      </node>
    </node>
    <node concept="Wx3nA" id="gU" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="AssociatePartner" />
      <node concept="3Tm1VV" id="hl" role="1B3o_S" />
      <node concept="10Oyi0" id="hm" role="1tU5fm" />
      <node concept="3cmrfG" id="hn" role="33vP2m">
        <property role="3cmrfH" value="2" />
      </node>
    </node>
    <node concept="Wx3nA" id="gV" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Course" />
      <node concept="3Tm1VV" id="ho" role="1B3o_S" />
      <node concept="10Oyi0" id="hp" role="1tU5fm" />
      <node concept="3cmrfG" id="hq" role="33vP2m">
        <property role="3cmrfH" value="3" />
      </node>
    </node>
    <node concept="Wx3nA" id="gW" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="DegreeRequirement" />
      <node concept="3Tm1VV" id="hr" role="1B3o_S" />
      <node concept="10Oyi0" id="hs" role="1tU5fm" />
      <node concept="3cmrfG" id="ht" role="33vP2m">
        <property role="3cmrfH" value="4" />
      </node>
    </node>
    <node concept="Wx3nA" id="gX" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="DocumentRequirement" />
      <node concept="3Tm1VV" id="hu" role="1B3o_S" />
      <node concept="10Oyi0" id="hv" role="1tU5fm" />
      <node concept="3cmrfG" id="hw" role="33vP2m">
        <property role="3cmrfH" value="5" />
      </node>
    </node>
    <node concept="Wx3nA" id="gY" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="ErasmusProgram" />
      <node concept="3Tm1VV" id="hx" role="1B3o_S" />
      <node concept="10Oyi0" id="hy" role="1tU5fm" />
      <node concept="3cmrfG" id="hz" role="33vP2m">
        <property role="3cmrfH" value="6" />
      </node>
    </node>
    <node concept="Wx3nA" id="gZ" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="LanguageRequirement" />
      <node concept="3Tm1VV" id="h$" role="1B3o_S" />
      <node concept="10Oyi0" id="h_" role="1tU5fm" />
      <node concept="3cmrfG" id="hA" role="33vP2m">
        <property role="3cmrfH" value="7" />
      </node>
    </node>
    <node concept="Wx3nA" id="h0" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Location" />
      <node concept="3Tm1VV" id="hB" role="1B3o_S" />
      <node concept="10Oyi0" id="hC" role="1tU5fm" />
      <node concept="3cmrfG" id="hD" role="33vP2m">
        <property role="3cmrfH" value="8" />
      </node>
    </node>
    <node concept="Wx3nA" id="h1" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Requirement" />
      <node concept="3Tm1VV" id="hE" role="1B3o_S" />
      <node concept="10Oyi0" id="hF" role="1tU5fm" />
      <node concept="3cmrfG" id="hG" role="33vP2m">
        <property role="3cmrfH" value="9" />
      </node>
    </node>
    <node concept="Wx3nA" id="h2" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Results" />
      <node concept="3Tm1VV" id="hH" role="1B3o_S" />
      <node concept="10Oyi0" id="hI" role="1tU5fm" />
      <node concept="3cmrfG" id="hJ" role="33vP2m">
        <property role="3cmrfH" value="10" />
      </node>
    </node>
    <node concept="Wx3nA" id="h3" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Scholarship" />
      <node concept="3Tm1VV" id="hK" role="1B3o_S" />
      <node concept="10Oyi0" id="hL" role="1tU5fm" />
      <node concept="3cmrfG" id="hM" role="33vP2m">
        <property role="3cmrfH" value="11" />
      </node>
    </node>
    <node concept="Wx3nA" id="h4" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Step" />
      <node concept="3Tm1VV" id="hN" role="1B3o_S" />
      <node concept="10Oyi0" id="hO" role="1tU5fm" />
      <node concept="3cmrfG" id="hP" role="33vP2m">
        <property role="3cmrfH" value="12" />
      </node>
    </node>
    <node concept="Wx3nA" id="h5" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="University" />
      <node concept="3Tm1VV" id="hQ" role="1B3o_S" />
      <node concept="10Oyi0" id="hR" role="1tU5fm" />
      <node concept="3cmrfG" id="hS" role="33vP2m">
        <property role="3cmrfH" value="13" />
      </node>
    </node>
    <node concept="2tJIrI" id="h6" role="jymVt" />
    <node concept="3clFbW" id="h7" role="jymVt">
      <node concept="3cqZAl" id="hT" role="3clF45" />
      <node concept="3Tm1VV" id="hU" role="1B3o_S" />
      <node concept="3clFbS" id="hV" role="3clF47">
        <node concept="3cpWs8" id="hW" role="3cqZAp">
          <node concept="3cpWsn" id="ic" role="3cpWs9">
            <property role="TrG5h" value="builder" />
            <node concept="3uibUv" id="id" role="1tU5fm">
              <ref role="3uigEE" to="ksn4:~LanguageConceptIndexBuilder" resolve="LanguageConceptIndexBuilder" />
            </node>
            <node concept="2ShNRf" id="ie" role="33vP2m">
              <node concept="1pGfFk" id="if" role="2ShVmc">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.&lt;init&gt;(long,long)" resolve="LanguageConceptIndexBuilder" />
                <node concept="1adDum" id="ig" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="ih" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hX" role="3cqZAp">
          <node concept="2OqwBi" id="ii" role="3clFbG">
            <node concept="37vLTw" id="ij" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="ik" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="il" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e57L" />
              </node>
              <node concept="37vLTw" id="im" role="37wK5m">
                <ref role="3cqZAo" node="gS" resolve="AdmissionStructure" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hY" role="3cqZAp">
          <node concept="2OqwBi" id="in" role="3clFbG">
            <node concept="37vLTw" id="io" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="ip" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="iq" role="37wK5m">
                <property role="1adDun" value="0x26276edc561695eeL" />
              </node>
              <node concept="37vLTw" id="ir" role="37wK5m">
                <ref role="3cqZAo" node="gT" resolve="ApplicationProcess" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hZ" role="3cqZAp">
          <node concept="2OqwBi" id="is" role="3clFbG">
            <node concept="37vLTw" id="it" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="iu" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="iv" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e4bL" />
              </node>
              <node concept="37vLTw" id="iw" role="37wK5m">
                <ref role="3cqZAo" node="gU" resolve="AssociatePartner" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i0" role="3cqZAp">
          <node concept="2OqwBi" id="ix" role="3clFbG">
            <node concept="37vLTw" id="iy" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="iz" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="i$" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e35L" />
              </node>
              <node concept="37vLTw" id="i_" role="37wK5m">
                <ref role="3cqZAo" node="gV" resolve="Course" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i1" role="3cqZAp">
          <node concept="2OqwBi" id="iA" role="3clFbG">
            <node concept="37vLTw" id="iB" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="iC" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="iD" role="37wK5m">
                <property role="1adDun" value="0x26276edc5616961aL" />
              </node>
              <node concept="37vLTw" id="iE" role="37wK5m">
                <ref role="3cqZAo" node="gW" resolve="DegreeRequirement" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i2" role="3cqZAp">
          <node concept="2OqwBi" id="iF" role="3clFbG">
            <node concept="37vLTw" id="iG" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="iH" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="iI" role="37wK5m">
                <property role="1adDun" value="0x26276edc561695dbL" />
              </node>
              <node concept="37vLTw" id="iJ" role="37wK5m">
                <ref role="3cqZAo" node="gX" resolve="DocumentRequirement" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i3" role="3cqZAp">
          <node concept="2OqwBi" id="iK" role="3clFbG">
            <node concept="37vLTw" id="iL" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="iM" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="iN" role="37wK5m">
                <property role="1adDun" value="0x9d77ea4d04f30c3L" />
              </node>
              <node concept="37vLTw" id="iO" role="37wK5m">
                <ref role="3cqZAo" node="gY" resolve="ErasmusProgram" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i4" role="3cqZAp">
          <node concept="2OqwBi" id="iP" role="3clFbG">
            <node concept="37vLTw" id="iQ" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="iR" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="iS" role="37wK5m">
                <property role="1adDun" value="0x26276edc561695e1L" />
              </node>
              <node concept="37vLTw" id="iT" role="37wK5m">
                <ref role="3cqZAo" node="gZ" resolve="LanguageRequirement" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i5" role="3cqZAp">
          <node concept="2OqwBi" id="iU" role="3clFbG">
            <node concept="37vLTw" id="iV" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="iW" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="iX" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e45L" />
              </node>
              <node concept="37vLTw" id="iY" role="37wK5m">
                <ref role="3cqZAo" node="h0" resolve="Location" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i6" role="3cqZAp">
          <node concept="2OqwBi" id="iZ" role="3clFbG">
            <node concept="37vLTw" id="j0" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="j1" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="j2" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e6aL" />
              </node>
              <node concept="37vLTw" id="j3" role="37wK5m">
                <ref role="3cqZAo" node="h1" resolve="Requirement" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i7" role="3cqZAp">
          <node concept="2OqwBi" id="j4" role="3clFbG">
            <node concept="37vLTw" id="j5" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="j6" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="j7" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e58L" />
              </node>
              <node concept="37vLTw" id="j8" role="37wK5m">
                <ref role="3cqZAo" node="h2" resolve="Results" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i8" role="3cqZAp">
          <node concept="2OqwBi" id="j9" role="3clFbG">
            <node concept="37vLTw" id="ja" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="jb" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="jc" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e00L" />
              </node>
              <node concept="37vLTw" id="jd" role="37wK5m">
                <ref role="3cqZAo" node="h3" resolve="Scholarship" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="i9" role="3cqZAp">
          <node concept="2OqwBi" id="je" role="3clFbG">
            <node concept="37vLTw" id="jf" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="jg" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="jh" role="37wK5m">
                <property role="1adDun" value="0x26276edc5616960aL" />
              </node>
              <node concept="37vLTw" id="ji" role="37wK5m">
                <ref role="3cqZAo" node="h4" resolve="Step" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ia" role="3cqZAp">
          <node concept="2OqwBi" id="jj" role="3clFbG">
            <node concept="37vLTw" id="jk" role="2Oq$k0">
              <ref role="3cqZAo" node="ic" resolve="builder" />
            </node>
            <node concept="liA8E" id="jl" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="jm" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e2eL" />
              </node>
              <node concept="37vLTw" id="jn" role="37wK5m">
                <ref role="3cqZAo" node="h5" resolve="University" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ib" role="3cqZAp">
          <node concept="37vLTI" id="jo" role="3clFbG">
            <node concept="2OqwBi" id="jp" role="37vLTx">
              <node concept="37vLTw" id="jr" role="2Oq$k0">
                <ref role="3cqZAo" node="ic" resolve="builder" />
              </node>
              <node concept="liA8E" id="js" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.seal()" resolve="seal" />
              </node>
            </node>
            <node concept="37vLTw" id="jq" role="37vLTJ">
              <ref role="3cqZAo" node="gR" resolve="myIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="h8" role="jymVt" />
    <node concept="3clFb_" id="h9" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="jt" role="3clF45" />
      <node concept="3clFbS" id="ju" role="3clF47">
        <node concept="3cpWs6" id="jw" role="3cqZAp">
          <node concept="2OqwBi" id="jx" role="3cqZAk">
            <node concept="37vLTw" id="jy" role="2Oq$k0">
              <ref role="3cqZAo" node="gR" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="jz" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndex.index(jetbrains.mps.smodel.adapter.ids.SConceptId)" resolve="index" />
              <node concept="37vLTw" id="j$" role="37wK5m">
                <ref role="3cqZAo" node="jv" resolve="cid" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="jv" role="3clF46">
        <property role="TrG5h" value="cid" />
        <node concept="3uibUv" id="j_" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="ha" role="jymVt" />
    <node concept="3clFb_" id="hb" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="jA" role="3clF45" />
      <node concept="3Tm1VV" id="jB" role="1B3o_S" />
      <node concept="3clFbS" id="jC" role="3clF47">
        <node concept="3cpWs6" id="jE" role="3cqZAp">
          <node concept="2OqwBi" id="jF" role="3cqZAk">
            <node concept="37vLTw" id="jG" role="2Oq$k0">
              <ref role="3cqZAo" node="gR" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="jH" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~ConceptIndex.index(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="index" />
              <node concept="37vLTw" id="jI" role="37wK5m">
                <ref role="3cqZAo" node="jD" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="jD" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3uibUv" id="jJ" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="hc" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="jK">
    <property role="TrG5h" value="StructureAspectDescriptor" />
    <node concept="3uibUv" id="jL" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseStructureAspectDescriptor" resolve="BaseStructureAspectDescriptor" />
    </node>
    <node concept="312cEg" id="jM" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptAdmissionStructure" />
      <node concept="3uibUv" id="ky" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kz" role="33vP2m">
        <ref role="37wK5l" node="kk" resolve="createDescriptorForAdmissionStructure" />
      </node>
    </node>
    <node concept="312cEg" id="jN" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptApplicationProcess" />
      <node concept="3uibUv" id="k$" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="k_" role="33vP2m">
        <ref role="37wK5l" node="kl" resolve="createDescriptorForApplicationProcess" />
      </node>
    </node>
    <node concept="312cEg" id="jO" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptAssociatePartner" />
      <node concept="3uibUv" id="kA" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kB" role="33vP2m">
        <ref role="37wK5l" node="km" resolve="createDescriptorForAssociatePartner" />
      </node>
    </node>
    <node concept="312cEg" id="jP" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptCourse" />
      <node concept="3uibUv" id="kC" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kD" role="33vP2m">
        <ref role="37wK5l" node="kn" resolve="createDescriptorForCourse" />
      </node>
    </node>
    <node concept="312cEg" id="jQ" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptDegreeRequirement" />
      <node concept="3uibUv" id="kE" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kF" role="33vP2m">
        <ref role="37wK5l" node="ko" resolve="createDescriptorForDegreeRequirement" />
      </node>
    </node>
    <node concept="312cEg" id="jR" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptDocumentRequirement" />
      <node concept="3uibUv" id="kG" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kH" role="33vP2m">
        <ref role="37wK5l" node="kp" resolve="createDescriptorForDocumentRequirement" />
      </node>
    </node>
    <node concept="312cEg" id="jS" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptErasmusProgram" />
      <node concept="3uibUv" id="kI" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kJ" role="33vP2m">
        <ref role="37wK5l" node="kq" resolve="createDescriptorForErasmusProgram" />
      </node>
    </node>
    <node concept="312cEg" id="jT" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptLanguageRequirement" />
      <node concept="3uibUv" id="kK" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kL" role="33vP2m">
        <ref role="37wK5l" node="kr" resolve="createDescriptorForLanguageRequirement" />
      </node>
    </node>
    <node concept="312cEg" id="jU" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptLocation" />
      <node concept="3uibUv" id="kM" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kN" role="33vP2m">
        <ref role="37wK5l" node="ks" resolve="createDescriptorForLocation" />
      </node>
    </node>
    <node concept="312cEg" id="jV" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptRequirement" />
      <node concept="3uibUv" id="kO" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kP" role="33vP2m">
        <ref role="37wK5l" node="kt" resolve="createDescriptorForRequirement" />
      </node>
    </node>
    <node concept="312cEg" id="jW" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptResults" />
      <node concept="3uibUv" id="kQ" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kR" role="33vP2m">
        <ref role="37wK5l" node="ku" resolve="createDescriptorForResults" />
      </node>
    </node>
    <node concept="312cEg" id="jX" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptScholarship" />
      <node concept="3uibUv" id="kS" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kT" role="33vP2m">
        <ref role="37wK5l" node="kv" resolve="createDescriptorForScholarship" />
      </node>
    </node>
    <node concept="312cEg" id="jY" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptStep" />
      <node concept="3uibUv" id="kU" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kV" role="33vP2m">
        <ref role="37wK5l" node="kw" resolve="createDescriptorForStep" />
      </node>
    </node>
    <node concept="312cEg" id="jZ" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptUniversity" />
      <node concept="3uibUv" id="kW" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="kX" role="33vP2m">
        <ref role="37wK5l" node="kx" resolve="createDescriptorForUniversity" />
      </node>
    </node>
    <node concept="312cEg" id="k0" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEnumerationDegreeLevel" />
      <node concept="3uibUv" id="kY" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor" resolve="EnumerationDescriptor" />
      </node>
      <node concept="2ShNRf" id="kZ" role="33vP2m">
        <node concept="1pGfFk" id="l0" role="2ShVmc">
          <ref role="37wK5l" node="6B" resolve="EnumerationDescriptor_DegreeLevel" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="k1" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEnumerationLanguageLevel" />
      <node concept="3uibUv" id="l1" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor" resolve="EnumerationDescriptor" />
      </node>
      <node concept="2ShNRf" id="l2" role="33vP2m">
        <node concept="1pGfFk" id="l3" role="2ShVmc">
          <ref role="37wK5l" node="8D" resolve="EnumerationDescriptor_LanguageLevel" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="k2" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEnumerationPartnerType" />
      <node concept="3uibUv" id="l4" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor" resolve="EnumerationDescriptor" />
      </node>
      <node concept="2ShNRf" id="l5" role="33vP2m">
        <node concept="1pGfFk" id="l6" role="2ShVmc">
          <ref role="37wK5l" node="bF" resolve="EnumerationDescriptor_PartnerType" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="k3" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEnumerationScholarshipType" />
      <node concept="3uibUv" id="l7" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor" resolve="EnumerationDescriptor" />
      </node>
      <node concept="2ShNRf" id="l8" role="33vP2m">
        <node concept="1pGfFk" id="l9" role="2ShVmc">
          <ref role="37wK5l" node="dH" resolve="EnumerationDescriptor_ScholarshipType" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="k4" role="jymVt">
      <property role="TrG5h" value="myIndexSwitch" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="la" role="1B3o_S" />
      <node concept="3uibUv" id="lb" role="1tU5fm">
        <ref role="3uigEE" node="gQ" resolve="LanguageConceptSwitch" />
      </node>
    </node>
    <node concept="3Tm1VV" id="k5" role="1B3o_S" />
    <node concept="2tJIrI" id="k6" role="jymVt" />
    <node concept="3clFbW" id="k7" role="jymVt">
      <node concept="3cqZAl" id="lc" role="3clF45" />
      <node concept="3Tm1VV" id="ld" role="1B3o_S" />
      <node concept="3clFbS" id="le" role="3clF47">
        <node concept="3clFbF" id="lf" role="3cqZAp">
          <node concept="37vLTI" id="lg" role="3clFbG">
            <node concept="2ShNRf" id="lh" role="37vLTx">
              <node concept="1pGfFk" id="lj" role="2ShVmc">
                <ref role="37wK5l" node="h7" resolve="LanguageConceptSwitch" />
              </node>
            </node>
            <node concept="37vLTw" id="li" role="37vLTJ">
              <ref role="3cqZAo" node="k4" resolve="myIndexSwitch" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="k8" role="jymVt" />
    <node concept="2tJIrI" id="k9" role="jymVt" />
    <node concept="3clFb_" id="ka" role="jymVt">
      <property role="TrG5h" value="reportDependencies" />
      <node concept="3Tm1VV" id="lk" role="1B3o_S" />
      <node concept="3cqZAl" id="ll" role="3clF45" />
      <node concept="37vLTG" id="lm" role="3clF46">
        <property role="TrG5h" value="deps" />
        <node concept="3uibUv" id="lp" role="1tU5fm">
          <ref role="3uigEE" to="ze1i:~StructureAspectDescriptor$Dependencies" resolve="StructureAspectDescriptor.Dependencies" />
        </node>
      </node>
      <node concept="3clFbS" id="ln" role="3clF47">
        <node concept="3clFbF" id="lq" role="3cqZAp">
          <node concept="2OqwBi" id="lr" role="3clFbG">
            <node concept="37vLTw" id="ls" role="2Oq$k0">
              <ref role="3cqZAo" node="lm" resolve="deps" />
            </node>
            <node concept="liA8E" id="lt" role="2OqNvi">
              <ref role="37wK5l" to="ze1i:~StructureAspectDescriptor$Dependencies.extendedLanguage(long,long,java.lang.String)" resolve="extendedLanguage" />
              <node concept="1adDum" id="lu" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="lv" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="Xl_RD" id="lw" role="37wK5m">
                <property role="Xl_RC" value="jetbrains.mps.lang.core" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="lo" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="kb" role="jymVt" />
    <node concept="3clFb_" id="kc" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="od$2w" value="false" />
      <property role="TrG5h" value="getDescriptors" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="lx" role="3clF47">
        <node concept="3cpWs6" id="l_" role="3cqZAp">
          <node concept="2YIFZM" id="lA" role="3cqZAk">
            <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
            <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...)" resolve="asList" />
            <node concept="37vLTw" id="lB" role="37wK5m">
              <ref role="3cqZAo" node="jM" resolve="myConceptAdmissionStructure" />
            </node>
            <node concept="37vLTw" id="lC" role="37wK5m">
              <ref role="3cqZAo" node="jN" resolve="myConceptApplicationProcess" />
            </node>
            <node concept="37vLTw" id="lD" role="37wK5m">
              <ref role="3cqZAo" node="jO" resolve="myConceptAssociatePartner" />
            </node>
            <node concept="37vLTw" id="lE" role="37wK5m">
              <ref role="3cqZAo" node="jP" resolve="myConceptCourse" />
            </node>
            <node concept="37vLTw" id="lF" role="37wK5m">
              <ref role="3cqZAo" node="jQ" resolve="myConceptDegreeRequirement" />
            </node>
            <node concept="37vLTw" id="lG" role="37wK5m">
              <ref role="3cqZAo" node="jR" resolve="myConceptDocumentRequirement" />
            </node>
            <node concept="37vLTw" id="lH" role="37wK5m">
              <ref role="3cqZAo" node="jS" resolve="myConceptErasmusProgram" />
            </node>
            <node concept="37vLTw" id="lI" role="37wK5m">
              <ref role="3cqZAo" node="jT" resolve="myConceptLanguageRequirement" />
            </node>
            <node concept="37vLTw" id="lJ" role="37wK5m">
              <ref role="3cqZAo" node="jU" resolve="myConceptLocation" />
            </node>
            <node concept="37vLTw" id="lK" role="37wK5m">
              <ref role="3cqZAo" node="jV" resolve="myConceptRequirement" />
            </node>
            <node concept="37vLTw" id="lL" role="37wK5m">
              <ref role="3cqZAo" node="jW" resolve="myConceptResults" />
            </node>
            <node concept="37vLTw" id="lM" role="37wK5m">
              <ref role="3cqZAo" node="jX" resolve="myConceptScholarship" />
            </node>
            <node concept="37vLTw" id="lN" role="37wK5m">
              <ref role="3cqZAo" node="jY" resolve="myConceptStep" />
            </node>
            <node concept="37vLTw" id="lO" role="37wK5m">
              <ref role="3cqZAo" node="jZ" resolve="myConceptUniversity" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="ly" role="1B3o_S" />
      <node concept="3uibUv" id="lz" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="lP" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
        </node>
      </node>
      <node concept="2AHcQZ" id="l$" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="kd" role="jymVt" />
    <node concept="3clFb_" id="ke" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="lQ" role="1B3o_S" />
      <node concept="37vLTG" id="lR" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="lW" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
      <node concept="3clFbS" id="lS" role="3clF47">
        <node concept="3KaCP$" id="lX" role="3cqZAp">
          <node concept="3KbdKl" id="lY" role="3KbHQx">
            <node concept="3clFbS" id="me" role="3Kbo56">
              <node concept="3cpWs6" id="mg" role="3cqZAp">
                <node concept="37vLTw" id="mh" role="3cqZAk">
                  <ref role="3cqZAo" node="jM" resolve="myConceptAdmissionStructure" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mf" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gS" resolve="AdmissionStructure" />
            </node>
          </node>
          <node concept="3KbdKl" id="lZ" role="3KbHQx">
            <node concept="3clFbS" id="mi" role="3Kbo56">
              <node concept="3cpWs6" id="mk" role="3cqZAp">
                <node concept="37vLTw" id="ml" role="3cqZAk">
                  <ref role="3cqZAo" node="jN" resolve="myConceptApplicationProcess" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mj" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gT" resolve="ApplicationProcess" />
            </node>
          </node>
          <node concept="3KbdKl" id="m0" role="3KbHQx">
            <node concept="3clFbS" id="mm" role="3Kbo56">
              <node concept="3cpWs6" id="mo" role="3cqZAp">
                <node concept="37vLTw" id="mp" role="3cqZAk">
                  <ref role="3cqZAo" node="jO" resolve="myConceptAssociatePartner" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mn" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gU" resolve="AssociatePartner" />
            </node>
          </node>
          <node concept="3KbdKl" id="m1" role="3KbHQx">
            <node concept="3clFbS" id="mq" role="3Kbo56">
              <node concept="3cpWs6" id="ms" role="3cqZAp">
                <node concept="37vLTw" id="mt" role="3cqZAk">
                  <ref role="3cqZAo" node="jP" resolve="myConceptCourse" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mr" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gV" resolve="Course" />
            </node>
          </node>
          <node concept="3KbdKl" id="m2" role="3KbHQx">
            <node concept="3clFbS" id="mu" role="3Kbo56">
              <node concept="3cpWs6" id="mw" role="3cqZAp">
                <node concept="37vLTw" id="mx" role="3cqZAk">
                  <ref role="3cqZAo" node="jQ" resolve="myConceptDegreeRequirement" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mv" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gW" resolve="DegreeRequirement" />
            </node>
          </node>
          <node concept="3KbdKl" id="m3" role="3KbHQx">
            <node concept="3clFbS" id="my" role="3Kbo56">
              <node concept="3cpWs6" id="m$" role="3cqZAp">
                <node concept="37vLTw" id="m_" role="3cqZAk">
                  <ref role="3cqZAo" node="jR" resolve="myConceptDocumentRequirement" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mz" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gX" resolve="DocumentRequirement" />
            </node>
          </node>
          <node concept="3KbdKl" id="m4" role="3KbHQx">
            <node concept="3clFbS" id="mA" role="3Kbo56">
              <node concept="3cpWs6" id="mC" role="3cqZAp">
                <node concept="37vLTw" id="mD" role="3cqZAk">
                  <ref role="3cqZAo" node="jS" resolve="myConceptErasmusProgram" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mB" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gY" resolve="ErasmusProgram" />
            </node>
          </node>
          <node concept="3KbdKl" id="m5" role="3KbHQx">
            <node concept="3clFbS" id="mE" role="3Kbo56">
              <node concept="3cpWs6" id="mG" role="3cqZAp">
                <node concept="37vLTw" id="mH" role="3cqZAk">
                  <ref role="3cqZAo" node="jT" resolve="myConceptLanguageRequirement" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mF" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="gZ" resolve="LanguageRequirement" />
            </node>
          </node>
          <node concept="3KbdKl" id="m6" role="3KbHQx">
            <node concept="3clFbS" id="mI" role="3Kbo56">
              <node concept="3cpWs6" id="mK" role="3cqZAp">
                <node concept="37vLTw" id="mL" role="3cqZAk">
                  <ref role="3cqZAo" node="jU" resolve="myConceptLocation" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mJ" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h0" resolve="Location" />
            </node>
          </node>
          <node concept="3KbdKl" id="m7" role="3KbHQx">
            <node concept="3clFbS" id="mM" role="3Kbo56">
              <node concept="3cpWs6" id="mO" role="3cqZAp">
                <node concept="37vLTw" id="mP" role="3cqZAk">
                  <ref role="3cqZAo" node="jV" resolve="myConceptRequirement" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mN" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h1" resolve="Requirement" />
            </node>
          </node>
          <node concept="3KbdKl" id="m8" role="3KbHQx">
            <node concept="3clFbS" id="mQ" role="3Kbo56">
              <node concept="3cpWs6" id="mS" role="3cqZAp">
                <node concept="37vLTw" id="mT" role="3cqZAk">
                  <ref role="3cqZAo" node="jW" resolve="myConceptResults" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mR" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h2" resolve="Results" />
            </node>
          </node>
          <node concept="3KbdKl" id="m9" role="3KbHQx">
            <node concept="3clFbS" id="mU" role="3Kbo56">
              <node concept="3cpWs6" id="mW" role="3cqZAp">
                <node concept="37vLTw" id="mX" role="3cqZAk">
                  <ref role="3cqZAo" node="jX" resolve="myConceptScholarship" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mV" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h3" resolve="Scholarship" />
            </node>
          </node>
          <node concept="3KbdKl" id="ma" role="3KbHQx">
            <node concept="3clFbS" id="mY" role="3Kbo56">
              <node concept="3cpWs6" id="n0" role="3cqZAp">
                <node concept="37vLTw" id="n1" role="3cqZAk">
                  <ref role="3cqZAo" node="jY" resolve="myConceptStep" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="mZ" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h4" resolve="Step" />
            </node>
          </node>
          <node concept="3KbdKl" id="mb" role="3KbHQx">
            <node concept="3clFbS" id="n2" role="3Kbo56">
              <node concept="3cpWs6" id="n4" role="3cqZAp">
                <node concept="37vLTw" id="n5" role="3cqZAk">
                  <ref role="3cqZAo" node="jZ" resolve="myConceptUniversity" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="n3" role="3Kbmr1">
              <ref role="1PxDUh" node="gQ" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="h5" resolve="University" />
            </node>
          </node>
          <node concept="2OqwBi" id="mc" role="3KbGdf">
            <node concept="37vLTw" id="n6" role="2Oq$k0">
              <ref role="3cqZAo" node="k4" resolve="myIndexSwitch" />
            </node>
            <node concept="liA8E" id="n7" role="2OqNvi">
              <ref role="37wK5l" node="h9" resolve="index" />
              <node concept="37vLTw" id="n8" role="37wK5m">
                <ref role="3cqZAo" node="lR" resolve="id" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="md" role="3Kb1Dw">
            <node concept="3cpWs6" id="n9" role="3cqZAp">
              <node concept="10Nm6u" id="na" role="3cqZAk" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="lT" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="2AHcQZ" id="lU" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="lV" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
    <node concept="2tJIrI" id="kf" role="jymVt" />
    <node concept="3clFb_" id="kg" role="jymVt">
      <property role="TrG5h" value="getDataTypeDescriptors" />
      <node concept="3Tm1VV" id="nb" role="1B3o_S" />
      <node concept="3uibUv" id="nc" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="nf" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~DataTypeDescriptor" resolve="DataTypeDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="nd" role="3clF47">
        <node concept="3cpWs6" id="ng" role="3cqZAp">
          <node concept="2YIFZM" id="nh" role="3cqZAk">
            <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...)" resolve="asList" />
            <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
            <node concept="37vLTw" id="ni" role="37wK5m">
              <ref role="3cqZAo" node="k0" resolve="myEnumerationDegreeLevel" />
            </node>
            <node concept="37vLTw" id="nj" role="37wK5m">
              <ref role="3cqZAo" node="k1" resolve="myEnumerationLanguageLevel" />
            </node>
            <node concept="37vLTw" id="nk" role="37wK5m">
              <ref role="3cqZAo" node="k2" resolve="myEnumerationPartnerType" />
            </node>
            <node concept="37vLTw" id="nl" role="37wK5m">
              <ref role="3cqZAo" node="k3" resolve="myEnumerationScholarshipType" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="ne" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="kh" role="jymVt" />
    <node concept="3clFb_" id="ki" role="jymVt">
      <property role="TrG5h" value="internalIndex" />
      <node concept="10Oyi0" id="nm" role="3clF45" />
      <node concept="3clFbS" id="nn" role="3clF47">
        <node concept="3cpWs6" id="np" role="3cqZAp">
          <node concept="2OqwBi" id="nq" role="3cqZAk">
            <node concept="37vLTw" id="nr" role="2Oq$k0">
              <ref role="3cqZAo" node="k4" resolve="myIndexSwitch" />
            </node>
            <node concept="liA8E" id="ns" role="2OqNvi">
              <ref role="37wK5l" node="hb" resolve="index" />
              <node concept="37vLTw" id="nt" role="37wK5m">
                <ref role="3cqZAo" node="no" resolve="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="no" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="nu" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="kj" role="jymVt" />
    <node concept="2YIFZL" id="kk" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForAdmissionStructure" />
      <node concept="3clFbS" id="nv" role="3clF47">
        <node concept="3cpWs8" id="ny" role="3cqZAp">
          <node concept="3cpWsn" id="nF" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="nG" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="nH" role="33vP2m">
              <node concept="1pGfFk" id="nI" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="nJ" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="nK" role="37wK5m">
                  <property role="Xl_RC" value="AdmissionStructure" />
                </node>
                <node concept="1adDum" id="nL" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="nM" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="nN" role="37wK5m">
                  <property role="1adDun" value="0x26276edc56166e57L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nz" role="3cqZAp">
          <node concept="2OqwBi" id="nO" role="3clFbG">
            <node concept="37vLTw" id="nP" role="2Oq$k0">
              <ref role="3cqZAo" node="nF" resolve="b" />
            </node>
            <node concept="liA8E" id="nQ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="nR" role="37wK5m" />
              <node concept="3clFbT" id="nS" role="37wK5m" />
              <node concept="3clFbT" id="nT" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="n$" role="3cqZAp">
          <node concept="2OqwBi" id="nU" role="3clFbG">
            <node concept="37vLTw" id="nV" role="2Oq$k0">
              <ref role="3cqZAo" node="nF" resolve="b" />
            </node>
            <node concept="liA8E" id="nW" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="nX" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148247" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="n_" role="3cqZAp">
          <node concept="2OqwBi" id="nY" role="3clFbG">
            <node concept="37vLTw" id="nZ" role="2Oq$k0">
              <ref role="3cqZAo" node="nF" resolve="b" />
            </node>
            <node concept="liA8E" id="o0" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="o1" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nA" role="3cqZAp">
          <node concept="2OqwBi" id="o2" role="3clFbG">
            <node concept="2OqwBi" id="o3" role="2Oq$k0">
              <node concept="2OqwBi" id="o5" role="2Oq$k0">
                <node concept="2OqwBi" id="o7" role="2Oq$k0">
                  <node concept="2OqwBi" id="o9" role="2Oq$k0">
                    <node concept="2OqwBi" id="ob" role="2Oq$k0">
                      <node concept="2OqwBi" id="od" role="2Oq$k0">
                        <node concept="37vLTw" id="of" role="2Oq$k0">
                          <ref role="3cqZAo" node="nF" resolve="b" />
                        </node>
                        <node concept="liA8E" id="og" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="oh" role="37wK5m">
                            <property role="Xl_RC" value="requirements" />
                          </node>
                          <node concept="1adDum" id="oi" role="37wK5m">
                            <property role="1adDun" value="0x26276edc56169637L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="oe" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="oj" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="ok" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="ol" role="37wK5m">
                          <property role="1adDun" value="0x26276edc56166e6aL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="oc" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="om" role="37wK5m" />
                    </node>
                  </node>
                  <node concept="liA8E" id="oa" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="on" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="o8" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="oo" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="o6" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="op" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158455" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="o4" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nB" role="3cqZAp">
          <node concept="2OqwBi" id="oq" role="3clFbG">
            <node concept="2OqwBi" id="or" role="2Oq$k0">
              <node concept="2OqwBi" id="ot" role="2Oq$k0">
                <node concept="2OqwBi" id="ov" role="2Oq$k0">
                  <node concept="2OqwBi" id="ox" role="2Oq$k0">
                    <node concept="2OqwBi" id="oz" role="2Oq$k0">
                      <node concept="2OqwBi" id="o_" role="2Oq$k0">
                        <node concept="37vLTw" id="oB" role="2Oq$k0">
                          <ref role="3cqZAo" node="nF" resolve="b" />
                        </node>
                        <node concept="liA8E" id="oC" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="oD" role="37wK5m">
                            <property role="Xl_RC" value="applicationProcess" />
                          </node>
                          <node concept="1adDum" id="oE" role="37wK5m">
                            <property role="1adDun" value="0x26276edc56169639L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="oA" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="oF" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="oG" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="oH" role="37wK5m">
                          <property role="1adDun" value="0x26276edc561695eeL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="o$" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="oI" role="37wK5m" />
                    </node>
                  </node>
                  <node concept="liA8E" id="oy" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="oJ" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="ow" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="oK" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="ou" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="oL" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158457" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="os" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nC" role="3cqZAp">
          <node concept="2OqwBi" id="oM" role="3clFbG">
            <node concept="2OqwBi" id="oN" role="2Oq$k0">
              <node concept="2OqwBi" id="oP" role="2Oq$k0">
                <node concept="2OqwBi" id="oR" role="2Oq$k0">
                  <node concept="2OqwBi" id="oT" role="2Oq$k0">
                    <node concept="2OqwBi" id="oV" role="2Oq$k0">
                      <node concept="2OqwBi" id="oX" role="2Oq$k0">
                        <node concept="37vLTw" id="oZ" role="2Oq$k0">
                          <ref role="3cqZAo" node="nF" resolve="b" />
                        </node>
                        <node concept="liA8E" id="p0" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="p1" role="37wK5m">
                            <property role="Xl_RC" value="results" />
                          </node>
                          <node concept="1adDum" id="p2" role="37wK5m">
                            <property role="1adDun" value="0x26276edc5616963cL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="oY" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="p3" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="p4" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="p5" role="37wK5m">
                          <property role="1adDun" value="0x26276edc56166e58L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="oW" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="p6" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="oU" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="p7" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="oS" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="p8" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="oQ" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="p9" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158460" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="oO" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nD" role="3cqZAp">
          <node concept="2OqwBi" id="pa" role="3clFbG">
            <node concept="37vLTw" id="pb" role="2Oq$k0">
              <ref role="3cqZAo" node="nF" resolve="b" />
            </node>
            <node concept="liA8E" id="pc" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="pd" role="37wK5m">
                <property role="Xl_RC" value="admission" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="nE" role="3cqZAp">
          <node concept="2OqwBi" id="pe" role="3cqZAk">
            <node concept="37vLTw" id="pf" role="2Oq$k0">
              <ref role="3cqZAo" node="nF" resolve="b" />
            </node>
            <node concept="liA8E" id="pg" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="nw" role="1B3o_S" />
      <node concept="3uibUv" id="nx" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kl" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForApplicationProcess" />
      <node concept="3clFbS" id="ph" role="3clF47">
        <node concept="3cpWs8" id="pk" role="3cqZAp">
          <node concept="3cpWsn" id="pr" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="ps" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="pt" role="33vP2m">
              <node concept="1pGfFk" id="pu" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="pv" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="pw" role="37wK5m">
                  <property role="Xl_RC" value="ApplicationProcess" />
                </node>
                <node concept="1adDum" id="px" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="py" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="pz" role="37wK5m">
                  <property role="1adDun" value="0x26276edc561695eeL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pl" role="3cqZAp">
          <node concept="2OqwBi" id="p$" role="3clFbG">
            <node concept="37vLTw" id="p_" role="2Oq$k0">
              <ref role="3cqZAo" node="pr" resolve="b" />
            </node>
            <node concept="liA8E" id="pA" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="pB" role="37wK5m" />
              <node concept="3clFbT" id="pC" role="37wK5m" />
              <node concept="3clFbT" id="pD" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pm" role="3cqZAp">
          <node concept="2OqwBi" id="pE" role="3clFbG">
            <node concept="37vLTw" id="pF" role="2Oq$k0">
              <ref role="3cqZAo" node="pr" resolve="b" />
            </node>
            <node concept="liA8E" id="pG" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="pH" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158382" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pn" role="3cqZAp">
          <node concept="2OqwBi" id="pI" role="3clFbG">
            <node concept="37vLTw" id="pJ" role="2Oq$k0">
              <ref role="3cqZAo" node="pr" resolve="b" />
            </node>
            <node concept="liA8E" id="pK" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="pL" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="po" role="3cqZAp">
          <node concept="2OqwBi" id="pM" role="3clFbG">
            <node concept="2OqwBi" id="pN" role="2Oq$k0">
              <node concept="2OqwBi" id="pP" role="2Oq$k0">
                <node concept="2OqwBi" id="pR" role="2Oq$k0">
                  <node concept="2OqwBi" id="pT" role="2Oq$k0">
                    <node concept="2OqwBi" id="pV" role="2Oq$k0">
                      <node concept="2OqwBi" id="pX" role="2Oq$k0">
                        <node concept="37vLTw" id="pZ" role="2Oq$k0">
                          <ref role="3cqZAo" node="pr" resolve="b" />
                        </node>
                        <node concept="liA8E" id="q0" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="q1" role="37wK5m">
                            <property role="Xl_RC" value="steps" />
                          </node>
                          <node concept="1adDum" id="q2" role="37wK5m">
                            <property role="1adDun" value="0x26276edc56169640L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="pY" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="q3" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="q4" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="q5" role="37wK5m">
                          <property role="1adDun" value="0x26276edc5616960aL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="pW" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="q6" role="37wK5m" />
                    </node>
                  </node>
                  <node concept="liA8E" id="pU" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="q7" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="pS" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="q8" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="pQ" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="q9" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158464" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="pO" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pp" role="3cqZAp">
          <node concept="2OqwBi" id="qa" role="3clFbG">
            <node concept="37vLTw" id="qb" role="2Oq$k0">
              <ref role="3cqZAo" node="pr" resolve="b" />
            </node>
            <node concept="liA8E" id="qc" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="qd" role="37wK5m">
                <property role="Xl_RC" value="application process" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="pq" role="3cqZAp">
          <node concept="2OqwBi" id="qe" role="3cqZAk">
            <node concept="37vLTw" id="qf" role="2Oq$k0">
              <ref role="3cqZAo" node="pr" resolve="b" />
            </node>
            <node concept="liA8E" id="qg" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="pi" role="1B3o_S" />
      <node concept="3uibUv" id="pj" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="km" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForAssociatePartner" />
      <node concept="3clFbS" id="qh" role="3clF47">
        <node concept="3cpWs8" id="qk" role="3cqZAp">
          <node concept="3cpWsn" id="qs" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="qt" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="qu" role="33vP2m">
              <node concept="1pGfFk" id="qv" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="qw" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="qx" role="37wK5m">
                  <property role="Xl_RC" value="AssociatePartner" />
                </node>
                <node concept="1adDum" id="qy" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="qz" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="q$" role="37wK5m">
                  <property role="1adDun" value="0x26276edc56166e4bL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ql" role="3cqZAp">
          <node concept="2OqwBi" id="q_" role="3clFbG">
            <node concept="37vLTw" id="qA" role="2Oq$k0">
              <ref role="3cqZAo" node="qs" resolve="b" />
            </node>
            <node concept="liA8E" id="qB" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="qC" role="37wK5m" />
              <node concept="3clFbT" id="qD" role="37wK5m" />
              <node concept="3clFbT" id="qE" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qm" role="3cqZAp">
          <node concept="2OqwBi" id="qF" role="3clFbG">
            <node concept="37vLTw" id="qG" role="2Oq$k0">
              <ref role="3cqZAo" node="qs" resolve="b" />
            </node>
            <node concept="liA8E" id="qH" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="qI" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148235" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qn" role="3cqZAp">
          <node concept="2OqwBi" id="qJ" role="3clFbG">
            <node concept="37vLTw" id="qK" role="2Oq$k0">
              <ref role="3cqZAo" node="qs" resolve="b" />
            </node>
            <node concept="liA8E" id="qL" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="qM" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qo" role="3cqZAp">
          <node concept="2OqwBi" id="qN" role="3clFbG">
            <node concept="2OqwBi" id="qO" role="2Oq$k0">
              <node concept="2OqwBi" id="qQ" role="2Oq$k0">
                <node concept="2OqwBi" id="qS" role="2Oq$k0">
                  <node concept="37vLTw" id="qU" role="2Oq$k0">
                    <ref role="3cqZAo" node="qs" resolve="b" />
                  </node>
                  <node concept="liA8E" id="qV" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="qW" role="37wK5m">
                      <property role="Xl_RC" value="name" />
                    </node>
                    <node concept="1adDum" id="qX" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e4cL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="qT" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="qY" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="qR" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="qZ" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148236" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="qP" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qp" role="3cqZAp">
          <node concept="2OqwBi" id="r0" role="3clFbG">
            <node concept="2OqwBi" id="r1" role="2Oq$k0">
              <node concept="2OqwBi" id="r3" role="2Oq$k0">
                <node concept="2OqwBi" id="r5" role="2Oq$k0">
                  <node concept="37vLTw" id="r7" role="2Oq$k0">
                    <ref role="3cqZAo" node="qs" resolve="b" />
                  </node>
                  <node concept="liA8E" id="r8" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="r9" role="37wK5m">
                      <property role="Xl_RC" value="type" />
                    </node>
                    <node concept="1adDum" id="ra" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e54L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="r6" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="rb" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:2749287990149148238" />
                    <node concept="1adDum" id="rc" role="37wK5m">
                      <property role="1adDun" value="0x45d743938b794afaL" />
                      <uo k="s:originTrace" v="n:2749287990149148238" />
                    </node>
                    <node concept="1adDum" id="rd" role="37wK5m">
                      <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                      <uo k="s:originTrace" v="n:2749287990149148238" />
                    </node>
                    <node concept="1adDum" id="re" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e4eL" />
                      <uo k="s:originTrace" v="n:2749287990149148238" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="r4" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="rf" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148244" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="r2" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qq" role="3cqZAp">
          <node concept="2OqwBi" id="rg" role="3clFbG">
            <node concept="37vLTw" id="rh" role="2Oq$k0">
              <ref role="3cqZAo" node="qs" resolve="b" />
            </node>
            <node concept="liA8E" id="ri" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="rj" role="37wK5m">
                <property role="Xl_RC" value="partner" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="qr" role="3cqZAp">
          <node concept="2OqwBi" id="rk" role="3cqZAk">
            <node concept="37vLTw" id="rl" role="2Oq$k0">
              <ref role="3cqZAo" node="qs" resolve="b" />
            </node>
            <node concept="liA8E" id="rm" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="qi" role="1B3o_S" />
      <node concept="3uibUv" id="qj" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kn" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForCourse" />
      <node concept="3clFbS" id="rn" role="3clF47">
        <node concept="3cpWs8" id="rq" role="3cqZAp">
          <node concept="3cpWsn" id="r$" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="r_" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="rA" role="33vP2m">
              <node concept="1pGfFk" id="rB" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="rC" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="rD" role="37wK5m">
                  <property role="Xl_RC" value="Course" />
                </node>
                <node concept="1adDum" id="rE" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="rF" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="rG" role="37wK5m">
                  <property role="1adDun" value="0x26276edc56166e35L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="rr" role="3cqZAp">
          <node concept="2OqwBi" id="rH" role="3clFbG">
            <node concept="37vLTw" id="rI" role="2Oq$k0">
              <ref role="3cqZAo" node="r$" resolve="b" />
            </node>
            <node concept="liA8E" id="rJ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="rK" role="37wK5m" />
              <node concept="3clFbT" id="rL" role="37wK5m" />
              <node concept="3clFbT" id="rM" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="rs" role="3cqZAp">
          <node concept="2OqwBi" id="rN" role="3clFbG">
            <node concept="37vLTw" id="rO" role="2Oq$k0">
              <ref role="3cqZAo" node="r$" resolve="b" />
            </node>
            <node concept="liA8E" id="rP" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="rQ" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="rR" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="rS" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="rt" role="3cqZAp">
          <node concept="2OqwBi" id="rT" role="3clFbG">
            <node concept="37vLTw" id="rU" role="2Oq$k0">
              <ref role="3cqZAo" node="r$" resolve="b" />
            </node>
            <node concept="liA8E" id="rV" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="rW" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148213" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ru" role="3cqZAp">
          <node concept="2OqwBi" id="rX" role="3clFbG">
            <node concept="37vLTw" id="rY" role="2Oq$k0">
              <ref role="3cqZAo" node="r$" resolve="b" />
            </node>
            <node concept="liA8E" id="rZ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="s0" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="rv" role="3cqZAp">
          <node concept="2OqwBi" id="s1" role="3clFbG">
            <node concept="2OqwBi" id="s2" role="2Oq$k0">
              <node concept="2OqwBi" id="s4" role="2Oq$k0">
                <node concept="2OqwBi" id="s6" role="2Oq$k0">
                  <node concept="37vLTw" id="s8" role="2Oq$k0">
                    <ref role="3cqZAo" node="r$" resolve="b" />
                  </node>
                  <node concept="liA8E" id="s9" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="sa" role="37wK5m">
                      <property role="Xl_RC" value="courseCode" />
                    </node>
                    <node concept="1adDum" id="sb" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e36L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="s7" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="sc" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="s5" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="sd" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148214" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="s3" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="rw" role="3cqZAp">
          <node concept="2OqwBi" id="se" role="3clFbG">
            <node concept="2OqwBi" id="sf" role="2Oq$k0">
              <node concept="2OqwBi" id="sh" role="2Oq$k0">
                <node concept="2OqwBi" id="sj" role="2Oq$k0">
                  <node concept="37vLTw" id="sl" role="2Oq$k0">
                    <ref role="3cqZAo" node="r$" resolve="b" />
                  </node>
                  <node concept="liA8E" id="sm" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="sn" role="37wK5m">
                      <property role="Xl_RC" value="credits" />
                    </node>
                    <node concept="1adDum" id="so" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e3bL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="sk" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="sp" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="si" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="sq" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148219" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="sg" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="rx" role="3cqZAp">
          <node concept="2OqwBi" id="sr" role="3clFbG">
            <node concept="2OqwBi" id="ss" role="2Oq$k0">
              <node concept="2OqwBi" id="su" role="2Oq$k0">
                <node concept="2OqwBi" id="sw" role="2Oq$k0">
                  <node concept="37vLTw" id="sy" role="2Oq$k0">
                    <ref role="3cqZAo" node="r$" resolve="b" />
                  </node>
                  <node concept="liA8E" id="sz" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="s$" role="37wK5m">
                      <property role="Xl_RC" value="faculty" />
                    </node>
                    <node concept="1adDum" id="s_" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e3fL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="sx" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="sA" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="sv" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="sB" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148223" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="st" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ry" role="3cqZAp">
          <node concept="2OqwBi" id="sC" role="3clFbG">
            <node concept="37vLTw" id="sD" role="2Oq$k0">
              <ref role="3cqZAo" node="r$" resolve="b" />
            </node>
            <node concept="liA8E" id="sE" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="sF" role="37wK5m">
                <property role="Xl_RC" value="course" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="rz" role="3cqZAp">
          <node concept="2OqwBi" id="sG" role="3cqZAk">
            <node concept="37vLTw" id="sH" role="2Oq$k0">
              <ref role="3cqZAo" node="r$" resolve="b" />
            </node>
            <node concept="liA8E" id="sI" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="ro" role="1B3o_S" />
      <node concept="3uibUv" id="rp" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="ko" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForDegreeRequirement" />
      <node concept="3clFbS" id="sJ" role="3clF47">
        <node concept="3cpWs8" id="sM" role="3cqZAp">
          <node concept="3cpWsn" id="sW" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="sX" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="sY" role="33vP2m">
              <node concept="1pGfFk" id="sZ" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="t0" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="t1" role="37wK5m">
                  <property role="Xl_RC" value="DegreeRequirement" />
                </node>
                <node concept="1adDum" id="t2" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="t3" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="t4" role="37wK5m">
                  <property role="1adDun" value="0x26276edc5616961aL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sN" role="3cqZAp">
          <node concept="2OqwBi" id="t5" role="3clFbG">
            <node concept="37vLTw" id="t6" role="2Oq$k0">
              <ref role="3cqZAo" node="sW" resolve="b" />
            </node>
            <node concept="liA8E" id="t7" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="t8" role="37wK5m" />
              <node concept="3clFbT" id="t9" role="37wK5m" />
              <node concept="3clFbT" id="ta" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3SKdUt" id="sO" role="3cqZAp">
          <node concept="1PaTwC" id="tb" role="1aUNEU">
            <node concept="3oM_SD" id="tc" role="1PaTwD">
              <property role="3oM_SC" value="extends:" />
            </node>
            <node concept="3oM_SD" id="td" role="1PaTwD">
              <property role="3oM_SC" value="ErasmusPrograms.structure.Requirement" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sP" role="3cqZAp">
          <node concept="15s5l7" id="te" role="lGtFl">
            <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: wrong number of parameters&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/5948132024743462708]&quot;;" />
            <property role="huDt6" value="Error: wrong number of parameters" />
          </node>
          <node concept="2OqwBi" id="tf" role="3clFbG">
            <node concept="37vLTw" id="tg" role="2Oq$k0">
              <ref role="3cqZAo" node="sW" resolve="b" />
            </node>
            <node concept="liA8E" id="th" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.super_(long,long,long)" resolve="super_" />
              <node concept="1adDum" id="ti" role="37wK5m">
                <property role="1adDun" value="0x45d743938b794afaL" />
              </node>
              <node concept="1adDum" id="tj" role="37wK5m">
                <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
              </node>
              <node concept="1adDum" id="tk" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e6aL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sQ" role="3cqZAp">
          <node concept="2OqwBi" id="tl" role="3clFbG">
            <node concept="37vLTw" id="tm" role="2Oq$k0">
              <ref role="3cqZAo" node="sW" resolve="b" />
            </node>
            <node concept="liA8E" id="tn" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="to" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158426" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sR" role="3cqZAp">
          <node concept="2OqwBi" id="tp" role="3clFbG">
            <node concept="37vLTw" id="tq" role="2Oq$k0">
              <ref role="3cqZAo" node="sW" resolve="b" />
            </node>
            <node concept="liA8E" id="tr" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="ts" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sS" role="3cqZAp">
          <node concept="2OqwBi" id="tt" role="3clFbG">
            <node concept="2OqwBi" id="tu" role="2Oq$k0">
              <node concept="2OqwBi" id="tw" role="2Oq$k0">
                <node concept="2OqwBi" id="ty" role="2Oq$k0">
                  <node concept="37vLTw" id="t$" role="2Oq$k0">
                    <ref role="3cqZAo" node="sW" resolve="b" />
                  </node>
                  <node concept="liA8E" id="t_" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="tA" role="37wK5m">
                      <property role="Xl_RC" value="fieldOfStudy" />
                    </node>
                    <node concept="1adDum" id="tB" role="37wK5m">
                      <property role="1adDun" value="0x26276edc5616961dL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="tz" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="tC" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="tx" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="tD" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158429" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="tv" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sT" role="3cqZAp">
          <node concept="2OqwBi" id="tE" role="3clFbG">
            <node concept="2OqwBi" id="tF" role="2Oq$k0">
              <node concept="2OqwBi" id="tH" role="2Oq$k0">
                <node concept="2OqwBi" id="tJ" role="2Oq$k0">
                  <node concept="37vLTw" id="tL" role="2Oq$k0">
                    <ref role="3cqZAo" node="sW" resolve="b" />
                  </node>
                  <node concept="liA8E" id="tM" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="tN" role="37wK5m">
                      <property role="Xl_RC" value="level" />
                    </node>
                    <node concept="1adDum" id="tO" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56169620L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="tK" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="tP" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:2749287990149158375" />
                    <node concept="1adDum" id="tQ" role="37wK5m">
                      <property role="1adDun" value="0x45d743938b794afaL" />
                      <uo k="s:originTrace" v="n:2749287990149158375" />
                    </node>
                    <node concept="1adDum" id="tR" role="37wK5m">
                      <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                      <uo k="s:originTrace" v="n:2749287990149158375" />
                    </node>
                    <node concept="1adDum" id="tS" role="37wK5m">
                      <property role="1adDun" value="0x26276edc561695e7L" />
                      <uo k="s:originTrace" v="n:2749287990149158375" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="tI" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="tT" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158432" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="tG" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sU" role="3cqZAp">
          <node concept="2OqwBi" id="tU" role="3clFbG">
            <node concept="37vLTw" id="tV" role="2Oq$k0">
              <ref role="3cqZAo" node="sW" resolve="b" />
            </node>
            <node concept="liA8E" id="tW" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="tX" role="37wK5m">
                <property role="Xl_RC" value="degree requirement" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="sV" role="3cqZAp">
          <node concept="2OqwBi" id="tY" role="3cqZAk">
            <node concept="37vLTw" id="tZ" role="2Oq$k0">
              <ref role="3cqZAo" node="sW" resolve="b" />
            </node>
            <node concept="liA8E" id="u0" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="sK" role="1B3o_S" />
      <node concept="3uibUv" id="sL" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kp" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForDocumentRequirement" />
      <node concept="3clFbS" id="u1" role="3clF47">
        <node concept="3cpWs8" id="u4" role="3cqZAp">
          <node concept="3cpWsn" id="ud" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="ue" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="uf" role="33vP2m">
              <node concept="1pGfFk" id="ug" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="uh" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="ui" role="37wK5m">
                  <property role="Xl_RC" value="DocumentRequirement" />
                </node>
                <node concept="1adDum" id="uj" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="uk" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="ul" role="37wK5m">
                  <property role="1adDun" value="0x26276edc561695dbL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="u5" role="3cqZAp">
          <node concept="2OqwBi" id="um" role="3clFbG">
            <node concept="37vLTw" id="un" role="2Oq$k0">
              <ref role="3cqZAo" node="ud" resolve="b" />
            </node>
            <node concept="liA8E" id="uo" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="up" role="37wK5m" />
              <node concept="3clFbT" id="uq" role="37wK5m" />
              <node concept="3clFbT" id="ur" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3SKdUt" id="u6" role="3cqZAp">
          <node concept="1PaTwC" id="us" role="1aUNEU">
            <node concept="3oM_SD" id="ut" role="1PaTwD">
              <property role="3oM_SC" value="extends:" />
            </node>
            <node concept="3oM_SD" id="uu" role="1PaTwD">
              <property role="3oM_SC" value="ErasmusPrograms.structure.Requirement" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="u7" role="3cqZAp">
          <node concept="15s5l7" id="uv" role="lGtFl">
            <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: wrong number of parameters&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/5948132024743462708]&quot;;" />
            <property role="huDt6" value="Error: wrong number of parameters" />
          </node>
          <node concept="2OqwBi" id="uw" role="3clFbG">
            <node concept="37vLTw" id="ux" role="2Oq$k0">
              <ref role="3cqZAo" node="ud" resolve="b" />
            </node>
            <node concept="liA8E" id="uy" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.super_(long,long,long)" resolve="super_" />
              <node concept="1adDum" id="uz" role="37wK5m">
                <property role="1adDun" value="0x45d743938b794afaL" />
              </node>
              <node concept="1adDum" id="u$" role="37wK5m">
                <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
              </node>
              <node concept="1adDum" id="u_" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e6aL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="u8" role="3cqZAp">
          <node concept="2OqwBi" id="uA" role="3clFbG">
            <node concept="37vLTw" id="uB" role="2Oq$k0">
              <ref role="3cqZAo" node="ud" resolve="b" />
            </node>
            <node concept="liA8E" id="uC" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="uD" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158363" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="u9" role="3cqZAp">
          <node concept="2OqwBi" id="uE" role="3clFbG">
            <node concept="37vLTw" id="uF" role="2Oq$k0">
              <ref role="3cqZAo" node="ud" resolve="b" />
            </node>
            <node concept="liA8E" id="uG" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="uH" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ua" role="3cqZAp">
          <node concept="2OqwBi" id="uI" role="3clFbG">
            <node concept="2OqwBi" id="uJ" role="2Oq$k0">
              <node concept="2OqwBi" id="uL" role="2Oq$k0">
                <node concept="2OqwBi" id="uN" role="2Oq$k0">
                  <node concept="37vLTw" id="uP" role="2Oq$k0">
                    <ref role="3cqZAo" node="ud" resolve="b" />
                  </node>
                  <node concept="liA8E" id="uQ" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="uR" role="37wK5m">
                      <property role="Xl_RC" value="description" />
                    </node>
                    <node concept="1adDum" id="uS" role="37wK5m">
                      <property role="1adDun" value="0x26276edc561695deL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="uO" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="uT" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="uM" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="uU" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158366" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="uK" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ub" role="3cqZAp">
          <node concept="2OqwBi" id="uV" role="3clFbG">
            <node concept="37vLTw" id="uW" role="2Oq$k0">
              <ref role="3cqZAo" node="ud" resolve="b" />
            </node>
            <node concept="liA8E" id="uX" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="uY" role="37wK5m">
                <property role="Xl_RC" value="document requirement" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="uc" role="3cqZAp">
          <node concept="2OqwBi" id="uZ" role="3cqZAk">
            <node concept="37vLTw" id="v0" role="2Oq$k0">
              <ref role="3cqZAo" node="ud" resolve="b" />
            </node>
            <node concept="liA8E" id="v1" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="u2" role="1B3o_S" />
      <node concept="3uibUv" id="u3" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kq" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForErasmusProgram" />
      <node concept="3clFbS" id="v2" role="3clF47">
        <node concept="3cpWs8" id="v5" role="3cqZAp">
          <node concept="3cpWsn" id="vi" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="vj" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="vk" role="33vP2m">
              <node concept="1pGfFk" id="vl" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="vm" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="vn" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusProgram" />
                </node>
                <node concept="1adDum" id="vo" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="vp" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="vq" role="37wK5m">
                  <property role="1adDun" value="0x9d77ea4d04f30c3L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="v6" role="3cqZAp">
          <node concept="2OqwBi" id="vr" role="3clFbG">
            <node concept="37vLTw" id="vs" role="2Oq$k0">
              <ref role="3cqZAo" node="vi" resolve="b" />
            </node>
            <node concept="liA8E" id="vt" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="vu" role="37wK5m" />
              <node concept="3clFbT" id="vv" role="37wK5m" />
              <node concept="3clFbT" id="vw" role="37wK5m">
                <property role="3clFbU" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="v7" role="3cqZAp">
          <node concept="2OqwBi" id="vx" role="3clFbG">
            <node concept="37vLTw" id="vy" role="2Oq$k0">
              <ref role="3cqZAo" node="vi" resolve="b" />
            </node>
            <node concept="liA8E" id="vz" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="v$" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="v_" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="vA" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="v8" role="3cqZAp">
          <node concept="2OqwBi" id="vB" role="3clFbG">
            <node concept="37vLTw" id="vC" role="2Oq$k0">
              <ref role="3cqZAo" node="vi" resolve="b" />
            </node>
            <node concept="liA8E" id="vD" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="vE" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/709174712668729539" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="v9" role="3cqZAp">
          <node concept="2OqwBi" id="vF" role="3clFbG">
            <node concept="37vLTw" id="vG" role="2Oq$k0">
              <ref role="3cqZAo" node="vi" resolve="b" />
            </node>
            <node concept="liA8E" id="vH" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="vI" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="va" role="3cqZAp">
          <node concept="2OqwBi" id="vJ" role="3clFbG">
            <node concept="2OqwBi" id="vK" role="2Oq$k0">
              <node concept="2OqwBi" id="vM" role="2Oq$k0">
                <node concept="2OqwBi" id="vO" role="2Oq$k0">
                  <node concept="37vLTw" id="vQ" role="2Oq$k0">
                    <ref role="3cqZAo" node="vi" resolve="b" />
                  </node>
                  <node concept="liA8E" id="vR" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="vS" role="37wK5m">
                      <property role="Xl_RC" value="id" />
                    </node>
                    <node concept="1adDum" id="vT" role="37wK5m">
                      <property role="1adDun" value="0x26276edc5622410dL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="vP" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="vU" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="vN" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="vV" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149923085" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="vL" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="vb" role="3cqZAp">
          <node concept="2OqwBi" id="vW" role="3clFbG">
            <node concept="2OqwBi" id="vX" role="2Oq$k0">
              <node concept="2OqwBi" id="vZ" role="2Oq$k0">
                <node concept="2OqwBi" id="w1" role="2Oq$k0">
                  <node concept="37vLTw" id="w3" role="2Oq$k0">
                    <ref role="3cqZAo" node="vi" resolve="b" />
                  </node>
                  <node concept="liA8E" id="w4" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="w5" role="37wK5m">
                      <property role="Xl_RC" value="totalCredits" />
                    </node>
                    <node concept="1adDum" id="w6" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166dfdL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="w2" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="w7" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="w0" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="w8" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148157" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="vY" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="vc" role="3cqZAp">
          <node concept="2OqwBi" id="w9" role="3clFbG">
            <node concept="2OqwBi" id="wa" role="2Oq$k0">
              <node concept="2OqwBi" id="wc" role="2Oq$k0">
                <node concept="2OqwBi" id="we" role="2Oq$k0">
                  <node concept="2OqwBi" id="wg" role="2Oq$k0">
                    <node concept="2OqwBi" id="wi" role="2Oq$k0">
                      <node concept="2OqwBi" id="wk" role="2Oq$k0">
                        <node concept="37vLTw" id="wm" role="2Oq$k0">
                          <ref role="3cqZAo" node="vi" resolve="b" />
                        </node>
                        <node concept="liA8E" id="wn" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="wo" role="37wK5m">
                            <property role="Xl_RC" value="scholarships" />
                          </node>
                          <node concept="1adDum" id="wp" role="37wK5m">
                            <property role="1adDun" value="0x26276edc5616962eL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="wl" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="wq" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="wr" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="ws" role="37wK5m">
                          <property role="1adDun" value="0x26276edc56166e00L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="wj" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="wt" role="37wK5m" />
                    </node>
                  </node>
                  <node concept="liA8E" id="wh" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="wu" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="wf" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="wv" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="wd" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="ww" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158446" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="wb" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="vd" role="3cqZAp">
          <node concept="2OqwBi" id="wx" role="3clFbG">
            <node concept="2OqwBi" id="wy" role="2Oq$k0">
              <node concept="2OqwBi" id="w$" role="2Oq$k0">
                <node concept="2OqwBi" id="wA" role="2Oq$k0">
                  <node concept="2OqwBi" id="wC" role="2Oq$k0">
                    <node concept="2OqwBi" id="wE" role="2Oq$k0">
                      <node concept="2OqwBi" id="wG" role="2Oq$k0">
                        <node concept="37vLTw" id="wI" role="2Oq$k0">
                          <ref role="3cqZAo" node="vi" resolve="b" />
                        </node>
                        <node concept="liA8E" id="wJ" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="wK" role="37wK5m">
                            <property role="Xl_RC" value="universities" />
                          </node>
                          <node concept="1adDum" id="wL" role="37wK5m">
                            <property role="1adDun" value="0x26276edc56169628L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="wH" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="wM" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="wN" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="wO" role="37wK5m">
                          <property role="1adDun" value="0x26276edc56166e2eL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="wF" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="wP" role="37wK5m" />
                    </node>
                  </node>
                  <node concept="liA8E" id="wD" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="wQ" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="wB" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="wR" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="w_" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="wS" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158440" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="wz" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ve" role="3cqZAp">
          <node concept="2OqwBi" id="wT" role="3clFbG">
            <node concept="2OqwBi" id="wU" role="2Oq$k0">
              <node concept="2OqwBi" id="wW" role="2Oq$k0">
                <node concept="2OqwBi" id="wY" role="2Oq$k0">
                  <node concept="2OqwBi" id="x0" role="2Oq$k0">
                    <node concept="2OqwBi" id="x2" role="2Oq$k0">
                      <node concept="2OqwBi" id="x4" role="2Oq$k0">
                        <node concept="37vLTw" id="x6" role="2Oq$k0">
                          <ref role="3cqZAo" node="vi" resolve="b" />
                        </node>
                        <node concept="liA8E" id="x7" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="x8" role="37wK5m">
                            <property role="Xl_RC" value="associatePartner" />
                          </node>
                          <node concept="1adDum" id="x9" role="37wK5m">
                            <property role="1adDun" value="0x26276edc56169631L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="x5" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="xa" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="xb" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="xc" role="37wK5m">
                          <property role="1adDun" value="0x26276edc56166e4bL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="x3" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="xd" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="x1" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="xe" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="wZ" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="xf" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="wX" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="xg" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158449" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="wV" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="vf" role="3cqZAp">
          <node concept="2OqwBi" id="xh" role="3clFbG">
            <node concept="2OqwBi" id="xi" role="2Oq$k0">
              <node concept="2OqwBi" id="xk" role="2Oq$k0">
                <node concept="2OqwBi" id="xm" role="2Oq$k0">
                  <node concept="2OqwBi" id="xo" role="2Oq$k0">
                    <node concept="2OqwBi" id="xq" role="2Oq$k0">
                      <node concept="2OqwBi" id="xs" role="2Oq$k0">
                        <node concept="37vLTw" id="xu" role="2Oq$k0">
                          <ref role="3cqZAo" node="vi" resolve="b" />
                        </node>
                        <node concept="liA8E" id="xv" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="xw" role="37wK5m">
                            <property role="Xl_RC" value="admissionStructure" />
                          </node>
                          <node concept="1adDum" id="xx" role="37wK5m">
                            <property role="1adDun" value="0x74bd21fd9dff74d5L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="xt" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="xy" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="xz" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="x$" role="37wK5m">
                          <property role="1adDun" value="0x26276edc56166e57L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="xr" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="x_" role="37wK5m" />
                    </node>
                  </node>
                  <node concept="liA8E" id="xp" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="xA" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="xn" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="xB" role="37wK5m" />
                </node>
              </node>
              <node concept="liA8E" id="xl" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="xC" role="37wK5m">
                  <property role="Xl_RC" value="8411917052159161557" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="xj" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="vg" role="3cqZAp">
          <node concept="2OqwBi" id="xD" role="3clFbG">
            <node concept="37vLTw" id="xE" role="2Oq$k0">
              <ref role="3cqZAo" node="vi" resolve="b" />
            </node>
            <node concept="liA8E" id="xF" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="xG" role="37wK5m">
                <property role="Xl_RC" value="erasmus program" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="vh" role="3cqZAp">
          <node concept="2OqwBi" id="xH" role="3cqZAk">
            <node concept="37vLTw" id="xI" role="2Oq$k0">
              <ref role="3cqZAo" node="vi" resolve="b" />
            </node>
            <node concept="liA8E" id="xJ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="v3" role="1B3o_S" />
      <node concept="3uibUv" id="v4" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kr" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForLanguageRequirement" />
      <node concept="3clFbS" id="xK" role="3clF47">
        <node concept="3cpWs8" id="xN" role="3cqZAp">
          <node concept="3cpWsn" id="xW" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="xX" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="xY" role="33vP2m">
              <node concept="1pGfFk" id="xZ" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="y0" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="y1" role="37wK5m">
                  <property role="Xl_RC" value="LanguageRequirement" />
                </node>
                <node concept="1adDum" id="y2" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="y3" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="y4" role="37wK5m">
                  <property role="1adDun" value="0x26276edc561695e1L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="xO" role="3cqZAp">
          <node concept="2OqwBi" id="y5" role="3clFbG">
            <node concept="37vLTw" id="y6" role="2Oq$k0">
              <ref role="3cqZAo" node="xW" resolve="b" />
            </node>
            <node concept="liA8E" id="y7" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="y8" role="37wK5m" />
              <node concept="3clFbT" id="y9" role="37wK5m" />
              <node concept="3clFbT" id="ya" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3SKdUt" id="xP" role="3cqZAp">
          <node concept="1PaTwC" id="yb" role="1aUNEU">
            <node concept="3oM_SD" id="yc" role="1PaTwD">
              <property role="3oM_SC" value="extends:" />
            </node>
            <node concept="3oM_SD" id="yd" role="1PaTwD">
              <property role="3oM_SC" value="ErasmusPrograms.structure.Requirement" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="xQ" role="3cqZAp">
          <node concept="15s5l7" id="ye" role="lGtFl">
            <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: wrong number of parameters&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/5948132024743462708]&quot;;" />
            <property role="huDt6" value="Error: wrong number of parameters" />
          </node>
          <node concept="2OqwBi" id="yf" role="3clFbG">
            <node concept="37vLTw" id="yg" role="2Oq$k0">
              <ref role="3cqZAo" node="xW" resolve="b" />
            </node>
            <node concept="liA8E" id="yh" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.super_(long,long,long)" resolve="super_" />
              <node concept="1adDum" id="yi" role="37wK5m">
                <property role="1adDun" value="0x45d743938b794afaL" />
              </node>
              <node concept="1adDum" id="yj" role="37wK5m">
                <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
              </node>
              <node concept="1adDum" id="yk" role="37wK5m">
                <property role="1adDun" value="0x26276edc56166e6aL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="xR" role="3cqZAp">
          <node concept="2OqwBi" id="yl" role="3clFbG">
            <node concept="37vLTw" id="ym" role="2Oq$k0">
              <ref role="3cqZAo" node="xW" resolve="b" />
            </node>
            <node concept="liA8E" id="yn" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="yo" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158369" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="xS" role="3cqZAp">
          <node concept="2OqwBi" id="yp" role="3clFbG">
            <node concept="37vLTw" id="yq" role="2Oq$k0">
              <ref role="3cqZAo" node="xW" resolve="b" />
            </node>
            <node concept="liA8E" id="yr" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="ys" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="xT" role="3cqZAp">
          <node concept="2OqwBi" id="yt" role="3clFbG">
            <node concept="2OqwBi" id="yu" role="2Oq$k0">
              <node concept="2OqwBi" id="yw" role="2Oq$k0">
                <node concept="2OqwBi" id="yy" role="2Oq$k0">
                  <node concept="37vLTw" id="y$" role="2Oq$k0">
                    <ref role="3cqZAo" node="xW" resolve="b" />
                  </node>
                  <node concept="liA8E" id="y_" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="yA" role="37wK5m">
                      <property role="Xl_RC" value="level" />
                    </node>
                    <node concept="1adDum" id="yB" role="37wK5m">
                      <property role="1adDun" value="0x26276edc561695e4L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="yz" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="yC" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:2749287990149158383" />
                    <node concept="1adDum" id="yD" role="37wK5m">
                      <property role="1adDun" value="0x45d743938b794afaL" />
                      <uo k="s:originTrace" v="n:2749287990149158383" />
                    </node>
                    <node concept="1adDum" id="yE" role="37wK5m">
                      <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                      <uo k="s:originTrace" v="n:2749287990149158383" />
                    </node>
                    <node concept="1adDum" id="yF" role="37wK5m">
                      <property role="1adDun" value="0x26276edc561695efL" />
                      <uo k="s:originTrace" v="n:2749287990149158383" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="yx" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="yG" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158372" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="yv" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="xU" role="3cqZAp">
          <node concept="2OqwBi" id="yH" role="3clFbG">
            <node concept="37vLTw" id="yI" role="2Oq$k0">
              <ref role="3cqZAo" node="xW" resolve="b" />
            </node>
            <node concept="liA8E" id="yJ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="yK" role="37wK5m">
                <property role="Xl_RC" value="language requirement" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="xV" role="3cqZAp">
          <node concept="2OqwBi" id="yL" role="3cqZAk">
            <node concept="37vLTw" id="yM" role="2Oq$k0">
              <ref role="3cqZAo" node="xW" resolve="b" />
            </node>
            <node concept="liA8E" id="yN" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="xL" role="1B3o_S" />
      <node concept="3uibUv" id="xM" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="ks" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForLocation" />
      <node concept="3clFbS" id="yO" role="3clF47">
        <node concept="3cpWs8" id="yR" role="3cqZAp">
          <node concept="3cpWsn" id="yZ" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="z0" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="z1" role="33vP2m">
              <node concept="1pGfFk" id="z2" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="z3" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="z4" role="37wK5m">
                  <property role="Xl_RC" value="Location" />
                </node>
                <node concept="1adDum" id="z5" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="z6" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="z7" role="37wK5m">
                  <property role="1adDun" value="0x26276edc56166e45L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="yS" role="3cqZAp">
          <node concept="2OqwBi" id="z8" role="3clFbG">
            <node concept="37vLTw" id="z9" role="2Oq$k0">
              <ref role="3cqZAo" node="yZ" resolve="b" />
            </node>
            <node concept="liA8E" id="za" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="zb" role="37wK5m" />
              <node concept="3clFbT" id="zc" role="37wK5m" />
              <node concept="3clFbT" id="zd" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="yT" role="3cqZAp">
          <node concept="2OqwBi" id="ze" role="3clFbG">
            <node concept="37vLTw" id="zf" role="2Oq$k0">
              <ref role="3cqZAo" node="yZ" resolve="b" />
            </node>
            <node concept="liA8E" id="zg" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="zh" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148229" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="yU" role="3cqZAp">
          <node concept="2OqwBi" id="zi" role="3clFbG">
            <node concept="37vLTw" id="zj" role="2Oq$k0">
              <ref role="3cqZAo" node="yZ" resolve="b" />
            </node>
            <node concept="liA8E" id="zk" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="zl" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="yV" role="3cqZAp">
          <node concept="2OqwBi" id="zm" role="3clFbG">
            <node concept="2OqwBi" id="zn" role="2Oq$k0">
              <node concept="2OqwBi" id="zp" role="2Oq$k0">
                <node concept="2OqwBi" id="zr" role="2Oq$k0">
                  <node concept="37vLTw" id="zt" role="2Oq$k0">
                    <ref role="3cqZAo" node="yZ" resolve="b" />
                  </node>
                  <node concept="liA8E" id="zu" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="zv" role="37wK5m">
                      <property role="Xl_RC" value="countryName" />
                    </node>
                    <node concept="1adDum" id="zw" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e46L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="zs" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="zx" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="zq" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="zy" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148230" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="zo" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="yW" role="3cqZAp">
          <node concept="2OqwBi" id="zz" role="3clFbG">
            <node concept="2OqwBi" id="z$" role="2Oq$k0">
              <node concept="2OqwBi" id="zA" role="2Oq$k0">
                <node concept="2OqwBi" id="zC" role="2Oq$k0">
                  <node concept="37vLTw" id="zE" role="2Oq$k0">
                    <ref role="3cqZAo" node="yZ" resolve="b" />
                  </node>
                  <node concept="liA8E" id="zF" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="zG" role="37wK5m">
                      <property role="Xl_RC" value="cityName" />
                    </node>
                    <node concept="1adDum" id="zH" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e48L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="zD" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="zI" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="zB" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="zJ" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148232" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="z_" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="yX" role="3cqZAp">
          <node concept="2OqwBi" id="zK" role="3clFbG">
            <node concept="37vLTw" id="zL" role="2Oq$k0">
              <ref role="3cqZAo" node="yZ" resolve="b" />
            </node>
            <node concept="liA8E" id="zM" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="zN" role="37wK5m">
                <property role="Xl_RC" value="location" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="yY" role="3cqZAp">
          <node concept="2OqwBi" id="zO" role="3cqZAk">
            <node concept="37vLTw" id="zP" role="2Oq$k0">
              <ref role="3cqZAo" node="yZ" resolve="b" />
            </node>
            <node concept="liA8E" id="zQ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="yP" role="1B3o_S" />
      <node concept="3uibUv" id="yQ" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kt" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForRequirement" />
      <node concept="3clFbS" id="zR" role="3clF47">
        <node concept="3cpWs8" id="zU" role="3cqZAp">
          <node concept="3cpWsn" id="$1" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="$2" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="$3" role="33vP2m">
              <node concept="1pGfFk" id="$4" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="$5" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="$6" role="37wK5m">
                  <property role="Xl_RC" value="Requirement" />
                </node>
                <node concept="1adDum" id="$7" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="$8" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="$9" role="37wK5m">
                  <property role="1adDun" value="0x26276edc56166e6aL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="zV" role="3cqZAp">
          <node concept="2OqwBi" id="$a" role="3clFbG">
            <node concept="37vLTw" id="$b" role="2Oq$k0">
              <ref role="3cqZAo" node="$1" resolve="b" />
            </node>
            <node concept="liA8E" id="$c" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="$d" role="37wK5m" />
              <node concept="3clFbT" id="$e" role="37wK5m">
                <property role="3clFbU" value="true" />
              </node>
              <node concept="3clFbT" id="$f" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="zW" role="3cqZAp">
          <node concept="2OqwBi" id="$g" role="3clFbG">
            <node concept="37vLTw" id="$h" role="2Oq$k0">
              <ref role="3cqZAo" node="$1" resolve="b" />
            </node>
            <node concept="liA8E" id="$i" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="$j" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="$k" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="$l" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="zX" role="3cqZAp">
          <node concept="2OqwBi" id="$m" role="3clFbG">
            <node concept="37vLTw" id="$n" role="2Oq$k0">
              <ref role="3cqZAo" node="$1" resolve="b" />
            </node>
            <node concept="liA8E" id="$o" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="$p" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148266" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="zY" role="3cqZAp">
          <node concept="2OqwBi" id="$q" role="3clFbG">
            <node concept="37vLTw" id="$r" role="2Oq$k0">
              <ref role="3cqZAo" node="$1" resolve="b" />
            </node>
            <node concept="liA8E" id="$s" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="$t" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="zZ" role="3cqZAp">
          <node concept="2OqwBi" id="$u" role="3clFbG">
            <node concept="37vLTw" id="$v" role="2Oq$k0">
              <ref role="3cqZAo" node="$1" resolve="b" />
            </node>
            <node concept="liA8E" id="$w" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="$x" role="37wK5m">
                <property role="Xl_RC" value="requirement" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="$0" role="3cqZAp">
          <node concept="2OqwBi" id="$y" role="3cqZAk">
            <node concept="37vLTw" id="$z" role="2Oq$k0">
              <ref role="3cqZAo" node="$1" resolve="b" />
            </node>
            <node concept="liA8E" id="$$" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="zS" role="1B3o_S" />
      <node concept="3uibUv" id="zT" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="ku" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForResults" />
      <node concept="3clFbS" id="$_" role="3clF47">
        <node concept="3cpWs8" id="$C" role="3cqZAp">
          <node concept="3cpWsn" id="$M" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="$N" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="$O" role="33vP2m">
              <node concept="1pGfFk" id="$P" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="$Q" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="$R" role="37wK5m">
                  <property role="Xl_RC" value="Results" />
                </node>
                <node concept="1adDum" id="$S" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="$T" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="$U" role="37wK5m">
                  <property role="1adDun" value="0x26276edc56166e58L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="$D" role="3cqZAp">
          <node concept="2OqwBi" id="$V" role="3clFbG">
            <node concept="37vLTw" id="$W" role="2Oq$k0">
              <ref role="3cqZAo" node="$M" resolve="b" />
            </node>
            <node concept="liA8E" id="$X" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="$Y" role="37wK5m" />
              <node concept="3clFbT" id="$Z" role="37wK5m" />
              <node concept="3clFbT" id="_0" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="$E" role="3cqZAp">
          <node concept="2OqwBi" id="_1" role="3clFbG">
            <node concept="37vLTw" id="_2" role="2Oq$k0">
              <ref role="3cqZAo" node="$M" resolve="b" />
            </node>
            <node concept="liA8E" id="_3" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="_4" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148248" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="$F" role="3cqZAp">
          <node concept="2OqwBi" id="_5" role="3clFbG">
            <node concept="37vLTw" id="_6" role="2Oq$k0">
              <ref role="3cqZAo" node="$M" resolve="b" />
            </node>
            <node concept="liA8E" id="_7" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="_8" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="$G" role="3cqZAp">
          <node concept="2OqwBi" id="_9" role="3clFbG">
            <node concept="2OqwBi" id="_a" role="2Oq$k0">
              <node concept="2OqwBi" id="_c" role="2Oq$k0">
                <node concept="2OqwBi" id="_e" role="2Oq$k0">
                  <node concept="37vLTw" id="_g" role="2Oq$k0">
                    <ref role="3cqZAo" node="$M" resolve="b" />
                  </node>
                  <node concept="liA8E" id="_h" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="_i" role="37wK5m">
                      <property role="Xl_RC" value="year" />
                    </node>
                    <node concept="1adDum" id="_j" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e59L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="_f" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="_k" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="_d" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="_l" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148249" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="_b" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="$H" role="3cqZAp">
          <node concept="2OqwBi" id="_m" role="3clFbG">
            <node concept="2OqwBi" id="_n" role="2Oq$k0">
              <node concept="2OqwBi" id="_p" role="2Oq$k0">
                <node concept="2OqwBi" id="_r" role="2Oq$k0">
                  <node concept="37vLTw" id="_t" role="2Oq$k0">
                    <ref role="3cqZAo" node="$M" resolve="b" />
                  </node>
                  <node concept="liA8E" id="_u" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="_v" role="37wK5m">
                      <property role="Xl_RC" value="totalAdmitted" />
                    </node>
                    <node concept="1adDum" id="_w" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e5bL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="_s" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="_x" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="_q" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="_y" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148251" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="_o" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="$I" role="3cqZAp">
          <node concept="2OqwBi" id="_z" role="3clFbG">
            <node concept="2OqwBi" id="_$" role="2Oq$k0">
              <node concept="2OqwBi" id="_A" role="2Oq$k0">
                <node concept="2OqwBi" id="_C" role="2Oq$k0">
                  <node concept="37vLTw" id="_E" role="2Oq$k0">
                    <ref role="3cqZAo" node="$M" resolve="b" />
                  </node>
                  <node concept="liA8E" id="_F" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="_G" role="37wK5m">
                      <property role="Xl_RC" value="scholarshipsAwarded" />
                    </node>
                    <node concept="1adDum" id="_H" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e5fL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="_D" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="_I" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="_B" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="_J" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148255" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="__" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="$J" role="3cqZAp">
          <node concept="2OqwBi" id="_K" role="3clFbG">
            <node concept="2OqwBi" id="_L" role="2Oq$k0">
              <node concept="2OqwBi" id="_N" role="2Oq$k0">
                <node concept="2OqwBi" id="_P" role="2Oq$k0">
                  <node concept="37vLTw" id="_R" role="2Oq$k0">
                    <ref role="3cqZAo" node="$M" resolve="b" />
                  </node>
                  <node concept="liA8E" id="_S" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="_T" role="37wK5m">
                      <property role="Xl_RC" value="admittedStudents" />
                    </node>
                    <node concept="1adDum" id="_U" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e63L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="_Q" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="_V" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="_O" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="_W" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148259" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="_M" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="$K" role="3cqZAp">
          <node concept="2OqwBi" id="_X" role="3clFbG">
            <node concept="37vLTw" id="_Y" role="2Oq$k0">
              <ref role="3cqZAo" node="$M" resolve="b" />
            </node>
            <node concept="liA8E" id="_Z" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="A0" role="37wK5m">
                <property role="Xl_RC" value="results" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="$L" role="3cqZAp">
          <node concept="2OqwBi" id="A1" role="3cqZAk">
            <node concept="37vLTw" id="A2" role="2Oq$k0">
              <ref role="3cqZAo" node="$M" resolve="b" />
            </node>
            <node concept="liA8E" id="A3" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="$A" role="1B3o_S" />
      <node concept="3uibUv" id="$B" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kv" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForScholarship" />
      <node concept="3clFbS" id="A4" role="3clF47">
        <node concept="3cpWs8" id="A7" role="3cqZAp">
          <node concept="3cpWsn" id="Ai" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="Aj" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="Ak" role="33vP2m">
              <node concept="1pGfFk" id="Al" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="Am" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="An" role="37wK5m">
                  <property role="Xl_RC" value="Scholarship" />
                </node>
                <node concept="1adDum" id="Ao" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="Ap" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="Aq" role="37wK5m">
                  <property role="1adDun" value="0x26276edc56166e00L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="A8" role="3cqZAp">
          <node concept="2OqwBi" id="Ar" role="3clFbG">
            <node concept="37vLTw" id="As" role="2Oq$k0">
              <ref role="3cqZAo" node="Ai" resolve="b" />
            </node>
            <node concept="liA8E" id="At" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="Au" role="37wK5m" />
              <node concept="3clFbT" id="Av" role="37wK5m" />
              <node concept="3clFbT" id="Aw" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="A9" role="3cqZAp">
          <node concept="2OqwBi" id="Ax" role="3clFbG">
            <node concept="37vLTw" id="Ay" role="2Oq$k0">
              <ref role="3cqZAo" node="Ai" resolve="b" />
            </node>
            <node concept="liA8E" id="Az" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="A$" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="A_" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="AA" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Aa" role="3cqZAp">
          <node concept="2OqwBi" id="AB" role="3clFbG">
            <node concept="37vLTw" id="AC" role="2Oq$k0">
              <ref role="3cqZAo" node="Ai" resolve="b" />
            </node>
            <node concept="liA8E" id="AD" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="AE" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148160" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Ab" role="3cqZAp">
          <node concept="2OqwBi" id="AF" role="3clFbG">
            <node concept="37vLTw" id="AG" role="2Oq$k0">
              <ref role="3cqZAo" node="Ai" resolve="b" />
            </node>
            <node concept="liA8E" id="AH" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="AI" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Ac" role="3cqZAp">
          <node concept="2OqwBi" id="AJ" role="3clFbG">
            <node concept="2OqwBi" id="AK" role="2Oq$k0">
              <node concept="2OqwBi" id="AM" role="2Oq$k0">
                <node concept="2OqwBi" id="AO" role="2Oq$k0">
                  <node concept="37vLTw" id="AQ" role="2Oq$k0">
                    <ref role="3cqZAo" node="Ai" resolve="b" />
                  </node>
                  <node concept="liA8E" id="AR" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="AS" role="37wK5m">
                      <property role="Xl_RC" value="type" />
                    </node>
                    <node concept="1adDum" id="AT" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e02L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="AP" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="AU" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:2749287990149148184" />
                    <node concept="1adDum" id="AV" role="37wK5m">
                      <property role="1adDun" value="0x45d743938b794afaL" />
                      <uo k="s:originTrace" v="n:2749287990149148184" />
                    </node>
                    <node concept="1adDum" id="AW" role="37wK5m">
                      <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                      <uo k="s:originTrace" v="n:2749287990149148184" />
                    </node>
                    <node concept="1adDum" id="AX" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e18L" />
                      <uo k="s:originTrace" v="n:2749287990149148184" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="AN" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="AY" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148162" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="AL" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Ad" role="3cqZAp">
          <node concept="2OqwBi" id="AZ" role="3clFbG">
            <node concept="2OqwBi" id="B0" role="2Oq$k0">
              <node concept="2OqwBi" id="B2" role="2Oq$k0">
                <node concept="2OqwBi" id="B4" role="2Oq$k0">
                  <node concept="37vLTw" id="B6" role="2Oq$k0">
                    <ref role="3cqZAo" node="Ai" resolve="b" />
                  </node>
                  <node concept="liA8E" id="B7" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="B8" role="37wK5m">
                      <property role="Xl_RC" value="tuitionFee" />
                    </node>
                    <node concept="1adDum" id="B9" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e1fL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="B5" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="Ba" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="B3" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="Bb" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148191" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="B1" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Ae" role="3cqZAp">
          <node concept="2OqwBi" id="Bc" role="3clFbG">
            <node concept="2OqwBi" id="Bd" role="2Oq$k0">
              <node concept="2OqwBi" id="Bf" role="2Oq$k0">
                <node concept="2OqwBi" id="Bh" role="2Oq$k0">
                  <node concept="37vLTw" id="Bj" role="2Oq$k0">
                    <ref role="3cqZAo" node="Ai" resolve="b" />
                  </node>
                  <node concept="liA8E" id="Bk" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="Bl" role="37wK5m">
                      <property role="Xl_RC" value="travelGrant" />
                    </node>
                    <node concept="1adDum" id="Bm" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e24L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="Bi" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="Bn" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="Bg" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="Bo" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148196" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="Be" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Af" role="3cqZAp">
          <node concept="2OqwBi" id="Bp" role="3clFbG">
            <node concept="2OqwBi" id="Bq" role="2Oq$k0">
              <node concept="2OqwBi" id="Bs" role="2Oq$k0">
                <node concept="2OqwBi" id="Bu" role="2Oq$k0">
                  <node concept="37vLTw" id="Bw" role="2Oq$k0">
                    <ref role="3cqZAo" node="Ai" resolve="b" />
                  </node>
                  <node concept="liA8E" id="Bx" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="By" role="37wK5m">
                      <property role="Xl_RC" value="allowance" />
                    </node>
                    <node concept="1adDum" id="Bz" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e28L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="Bv" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="B$" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="Bt" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="B_" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148200" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="Br" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Ag" role="3cqZAp">
          <node concept="2OqwBi" id="BA" role="3clFbG">
            <node concept="37vLTw" id="BB" role="2Oq$k0">
              <ref role="3cqZAo" node="Ai" resolve="b" />
            </node>
            <node concept="liA8E" id="BC" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="BD" role="37wK5m">
                <property role="Xl_RC" value="scholarship" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="Ah" role="3cqZAp">
          <node concept="2OqwBi" id="BE" role="3cqZAk">
            <node concept="37vLTw" id="BF" role="2Oq$k0">
              <ref role="3cqZAo" node="Ai" resolve="b" />
            </node>
            <node concept="liA8E" id="BG" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="A5" role="1B3o_S" />
      <node concept="3uibUv" id="A6" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kw" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForStep" />
      <node concept="3clFbS" id="BH" role="3clF47">
        <node concept="3cpWs8" id="BK" role="3cqZAp">
          <node concept="3cpWsn" id="BU" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="BV" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="BW" role="33vP2m">
              <node concept="1pGfFk" id="BX" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="BY" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="BZ" role="37wK5m">
                  <property role="Xl_RC" value="Step" />
                </node>
                <node concept="1adDum" id="C0" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="C1" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="C2" role="37wK5m">
                  <property role="1adDun" value="0x26276edc5616960aL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="BL" role="3cqZAp">
          <node concept="2OqwBi" id="C3" role="3clFbG">
            <node concept="37vLTw" id="C4" role="2Oq$k0">
              <ref role="3cqZAo" node="BU" resolve="b" />
            </node>
            <node concept="liA8E" id="C5" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="C6" role="37wK5m" />
              <node concept="3clFbT" id="C7" role="37wK5m" />
              <node concept="3clFbT" id="C8" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="BM" role="3cqZAp">
          <node concept="2OqwBi" id="C9" role="3clFbG">
            <node concept="37vLTw" id="Ca" role="2Oq$k0">
              <ref role="3cqZAo" node="BU" resolve="b" />
            </node>
            <node concept="liA8E" id="Cb" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="Cc" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="Cd" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="Ce" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="BN" role="3cqZAp">
          <node concept="2OqwBi" id="Cf" role="3clFbG">
            <node concept="37vLTw" id="Cg" role="2Oq$k0">
              <ref role="3cqZAo" node="BU" resolve="b" />
            </node>
            <node concept="liA8E" id="Ch" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="Ci" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149158410" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="BO" role="3cqZAp">
          <node concept="2OqwBi" id="Cj" role="3clFbG">
            <node concept="37vLTw" id="Ck" role="2Oq$k0">
              <ref role="3cqZAo" node="BU" resolve="b" />
            </node>
            <node concept="liA8E" id="Cl" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="Cm" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="BP" role="3cqZAp">
          <node concept="2OqwBi" id="Cn" role="3clFbG">
            <node concept="2OqwBi" id="Co" role="2Oq$k0">
              <node concept="2OqwBi" id="Cq" role="2Oq$k0">
                <node concept="2OqwBi" id="Cs" role="2Oq$k0">
                  <node concept="37vLTw" id="Cu" role="2Oq$k0">
                    <ref role="3cqZAo" node="BU" resolve="b" />
                  </node>
                  <node concept="liA8E" id="Cv" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="Cw" role="37wK5m">
                      <property role="Xl_RC" value="description" />
                    </node>
                    <node concept="1adDum" id="Cx" role="37wK5m">
                      <property role="1adDun" value="0x26276edc5616960dL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="Ct" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="Cy" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="Cr" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="Cz" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158413" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="Cp" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="BQ" role="3cqZAp">
          <node concept="2OqwBi" id="C$" role="3clFbG">
            <node concept="2OqwBi" id="C_" role="2Oq$k0">
              <node concept="2OqwBi" id="CB" role="2Oq$k0">
                <node concept="2OqwBi" id="CD" role="2Oq$k0">
                  <node concept="37vLTw" id="CF" role="2Oq$k0">
                    <ref role="3cqZAo" node="BU" resolve="b" />
                  </node>
                  <node concept="liA8E" id="CG" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="CH" role="37wK5m">
                      <property role="Xl_RC" value="startDate" />
                    </node>
                    <node concept="1adDum" id="CI" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56169610L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="CE" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="CJ" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="CC" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="CK" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158416" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="CA" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="BR" role="3cqZAp">
          <node concept="2OqwBi" id="CL" role="3clFbG">
            <node concept="2OqwBi" id="CM" role="2Oq$k0">
              <node concept="2OqwBi" id="CO" role="2Oq$k0">
                <node concept="2OqwBi" id="CQ" role="2Oq$k0">
                  <node concept="37vLTw" id="CS" role="2Oq$k0">
                    <ref role="3cqZAo" node="BU" resolve="b" />
                  </node>
                  <node concept="liA8E" id="CT" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="CU" role="37wK5m">
                      <property role="Xl_RC" value="endDate" />
                    </node>
                    <node concept="1adDum" id="CV" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56169614L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="CR" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="CW" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="CP" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="CX" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158420" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="CN" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="BS" role="3cqZAp">
          <node concept="2OqwBi" id="CY" role="3clFbG">
            <node concept="37vLTw" id="CZ" role="2Oq$k0">
              <ref role="3cqZAo" node="BU" resolve="b" />
            </node>
            <node concept="liA8E" id="D0" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="D1" role="37wK5m">
                <property role="Xl_RC" value="step" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="BT" role="3cqZAp">
          <node concept="2OqwBi" id="D2" role="3cqZAk">
            <node concept="37vLTw" id="D3" role="2Oq$k0">
              <ref role="3cqZAo" node="BU" resolve="b" />
            </node>
            <node concept="liA8E" id="D4" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="BI" role="1B3o_S" />
      <node concept="3uibUv" id="BJ" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="kx" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForUniversity" />
      <node concept="3clFbS" id="D5" role="3clF47">
        <node concept="3cpWs8" id="D8" role="3cqZAp">
          <node concept="3cpWsn" id="Di" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="Dj" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="Dk" role="33vP2m">
              <node concept="1pGfFk" id="Dl" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="Dm" role="37wK5m">
                  <property role="Xl_RC" value="ErasmusPrograms" />
                </node>
                <node concept="Xl_RD" id="Dn" role="37wK5m">
                  <property role="Xl_RC" value="University" />
                </node>
                <node concept="1adDum" id="Do" role="37wK5m">
                  <property role="1adDun" value="0x45d743938b794afaL" />
                </node>
                <node concept="1adDum" id="Dp" role="37wK5m">
                  <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                </node>
                <node concept="1adDum" id="Dq" role="37wK5m">
                  <property role="1adDun" value="0x26276edc56166e2eL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="D9" role="3cqZAp">
          <node concept="2OqwBi" id="Dr" role="3clFbG">
            <node concept="37vLTw" id="Ds" role="2Oq$k0">
              <ref role="3cqZAo" node="Di" resolve="b" />
            </node>
            <node concept="liA8E" id="Dt" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="Du" role="37wK5m" />
              <node concept="3clFbT" id="Dv" role="37wK5m" />
              <node concept="3clFbT" id="Dw" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Da" role="3cqZAp">
          <node concept="2OqwBi" id="Dx" role="3clFbG">
            <node concept="37vLTw" id="Dy" role="2Oq$k0">
              <ref role="3cqZAo" node="Di" resolve="b" />
            </node>
            <node concept="liA8E" id="Dz" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="D$" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="D_" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="DA" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Db" role="3cqZAp">
          <node concept="2OqwBi" id="DB" role="3clFbG">
            <node concept="37vLTw" id="DC" role="2Oq$k0">
              <ref role="3cqZAo" node="Di" resolve="b" />
            </node>
            <node concept="liA8E" id="DD" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="DE" role="37wK5m">
                <property role="Xl_RC" value="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)/2749287990149148206" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Dc" role="3cqZAp">
          <node concept="2OqwBi" id="DF" role="3clFbG">
            <node concept="37vLTw" id="DG" role="2Oq$k0">
              <ref role="3cqZAo" node="Di" resolve="b" />
            </node>
            <node concept="liA8E" id="DH" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="DI" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Dd" role="3cqZAp">
          <node concept="2OqwBi" id="DJ" role="3clFbG">
            <node concept="2OqwBi" id="DK" role="2Oq$k0">
              <node concept="2OqwBi" id="DM" role="2Oq$k0">
                <node concept="2OqwBi" id="DO" role="2Oq$k0">
                  <node concept="37vLTw" id="DQ" role="2Oq$k0">
                    <ref role="3cqZAo" node="Di" resolve="b" />
                  </node>
                  <node concept="liA8E" id="DR" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="DS" role="37wK5m">
                      <property role="Xl_RC" value="credits" />
                    </node>
                    <node concept="1adDum" id="DT" role="37wK5m">
                      <property role="1adDun" value="0x26276edc56166e31L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="DP" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="DU" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="DN" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="DV" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149148209" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="DL" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="De" role="3cqZAp">
          <node concept="2OqwBi" id="DW" role="3clFbG">
            <node concept="2OqwBi" id="DX" role="2Oq$k0">
              <node concept="2OqwBi" id="DZ" role="2Oq$k0">
                <node concept="2OqwBi" id="E1" role="2Oq$k0">
                  <node concept="2OqwBi" id="E3" role="2Oq$k0">
                    <node concept="2OqwBi" id="E5" role="2Oq$k0">
                      <node concept="2OqwBi" id="E7" role="2Oq$k0">
                        <node concept="37vLTw" id="E9" role="2Oq$k0">
                          <ref role="3cqZAo" node="Di" resolve="b" />
                        </node>
                        <node concept="liA8E" id="Ea" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="Eb" role="37wK5m">
                            <property role="Xl_RC" value="courses" />
                          </node>
                          <node concept="1adDum" id="Ec" role="37wK5m">
                            <property role="1adDun" value="0x26276edc56169625L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="E8" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="Ed" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="Ee" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="Ef" role="37wK5m">
                          <property role="1adDun" value="0x26276edc56166e35L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="E6" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="Eg" role="37wK5m" />
                    </node>
                  </node>
                  <node concept="liA8E" id="E4" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="Eh" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="E2" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="Ei" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="E0" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="Ej" role="37wK5m">
                  <property role="Xl_RC" value="2749287990149158437" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="DY" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Df" role="3cqZAp">
          <node concept="2OqwBi" id="Ek" role="3clFbG">
            <node concept="2OqwBi" id="El" role="2Oq$k0">
              <node concept="2OqwBi" id="En" role="2Oq$k0">
                <node concept="2OqwBi" id="Ep" role="2Oq$k0">
                  <node concept="2OqwBi" id="Er" role="2Oq$k0">
                    <node concept="2OqwBi" id="Et" role="2Oq$k0">
                      <node concept="2OqwBi" id="Ev" role="2Oq$k0">
                        <node concept="37vLTw" id="Ex" role="2Oq$k0">
                          <ref role="3cqZAo" node="Di" resolve="b" />
                        </node>
                        <node concept="liA8E" id="Ey" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="Ez" role="37wK5m">
                            <property role="Xl_RC" value="location" />
                          </node>
                          <node concept="1adDum" id="E$" role="37wK5m">
                            <property role="1adDun" value="0x74bd21fd9dff74afL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="Ew" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="E_" role="37wK5m">
                          <property role="1adDun" value="0x45d743938b794afaL" />
                        </node>
                        <node concept="1adDum" id="EA" role="37wK5m">
                          <property role="1adDun" value="0x9cc9d68d79ce89e1L" />
                        </node>
                        <node concept="1adDum" id="EB" role="37wK5m">
                          <property role="1adDun" value="0x26276edc56166e45L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="Eu" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="EC" role="37wK5m" />
                    </node>
                  </node>
                  <node concept="liA8E" id="Es" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="ED" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="Eq" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="EE" role="37wK5m" />
                </node>
              </node>
              <node concept="liA8E" id="Eo" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="EF" role="37wK5m">
                  <property role="Xl_RC" value="8411917052159161519" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="Em" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Dg" role="3cqZAp">
          <node concept="2OqwBi" id="EG" role="3clFbG">
            <node concept="37vLTw" id="EH" role="2Oq$k0">
              <ref role="3cqZAo" node="Di" resolve="b" />
            </node>
            <node concept="liA8E" id="EI" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="EJ" role="37wK5m">
                <property role="Xl_RC" value="university" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="Dh" role="3cqZAp">
          <node concept="2OqwBi" id="EK" role="3cqZAk">
            <node concept="37vLTw" id="EL" role="2Oq$k0">
              <ref role="3cqZAo" node="Di" resolve="b" />
            </node>
            <node concept="liA8E" id="EM" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="D6" role="1B3o_S" />
      <node concept="3uibUv" id="D7" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
  </node>
</model>

