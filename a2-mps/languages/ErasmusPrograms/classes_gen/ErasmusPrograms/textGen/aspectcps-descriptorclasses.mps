<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:f74716d(checkpoints/ErasmusPrograms.textGen@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <attribute name="user-objects" value="true" />
  <languages />
  <imports>
    <import index="ycca" ref="r:6671f2a8-2119-4cd1-9085-e97cc00177ff(ErasmusPrograms.textGen)" />
    <import index="kpbf" ref="7124e466-fc92-4803-a656-d7a6b7eb3910/java:jetbrains.mps.text.impl(MPS.TextGen/)" />
    <import index="yfwt" ref="7124e466-fc92-4803-a656-d7a6b7eb3910/java:jetbrains.mps.text.rt(MPS.TextGen/)" />
    <import index="tpcf" ref="r:00000000-0000-4000-0000-011c89590293(jetbrains.mps.lang.structure.generator_new.baseLanguage@generator)" />
    <import index="mmpm" ref="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="nn" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ngI" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="2820489544401957797" name="jetbrains.mps.baseLanguage.structure.DefaultClassCreator" flags="nn" index="HV5vD">
        <reference id="2820489544401957798" name="classifier" index="HV5vE" />
      </concept>
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <property id="1075300953594" name="abstractClass" index="1sVAO0" />
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
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
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
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
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
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ngI" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1144226303539" name="jetbrains.mps.baseLanguage.structure.ForeachStatement" flags="nn" index="1DcWWT">
        <child id="1144226360166" name="iterable" index="1DdaDG" />
      </concept>
      <concept id="1144230876926" name="jetbrains.mps.baseLanguage.structure.AbstractForStatement" flags="nn" index="1DupvO">
        <child id="1144230900587" name="variable" index="1Duv9x" />
      </concept>
      <concept id="1163668896201" name="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" flags="nn" index="3K4zz7">
        <child id="1163668914799" name="condition" index="3K4Cdx" />
        <child id="1163668922816" name="ifTrue" index="3K4E3e" />
        <child id="1163668934364" name="ifFalse" index="3K4GZi" />
      </concept>
      <concept id="1163670490218" name="jetbrains.mps.baseLanguage.structure.SwitchStatement" flags="nn" index="3KaCP$">
        <child id="1163670766145" name="expression" index="3KbGdf" />
        <child id="1163670772911" name="case" index="3KbHQx" />
      </concept>
      <concept id="1163670641947" name="jetbrains.mps.baseLanguage.structure.SwitchCase" flags="ng" index="3KbdKl">
        <child id="1163670677455" name="expression" index="3Kbmr1" />
        <child id="1163670683720" name="body" index="3Kbo56" />
      </concept>
      <concept id="1082113931046" name="jetbrains.mps.baseLanguage.structure.ContinueStatement" flags="nn" index="3N13vt" />
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1200397529627" name="jetbrains.mps.baseLanguage.structure.CharConstant" flags="nn" index="1Xhbcc">
        <property id="1200397540847" name="charConstant" index="1XhdNS" />
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
    <language id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal">
      <concept id="1174914042989" name="jetbrains.mps.baseLanguageInternal.structure.InternalClassifierType" flags="in" index="2eloPW">
        <property id="1174914081067" name="fqClassName" index="2ely0U" />
      </concept>
      <concept id="1100832983841311024" name="jetbrains.mps.baseLanguageInternal.structure.InternalClassCreator" flags="nn" index="xCZzO">
        <property id="1100832983841311026" name="fqClassName" index="xCZzQ" />
        <child id="1100832983841311029" name="type" index="xCZzL" />
      </concept>
      <concept id="1173995204289" name="jetbrains.mps.baseLanguageInternal.structure.InternalStaticFieldReference" flags="nn" index="1n$iZg">
        <property id="1173995448817" name="fqClassName" index="1n_ezw" />
        <property id="1173995466678" name="fieldName" index="1n_iUB" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1171500988903" name="jetbrains.mps.lang.smodel.structure.Node_GetChildrenOperation" flags="nn" index="32TBzR" />
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="0">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="AdmissionStructure_TextGen" />
    <property role="3GE5qa" value="AdmissionStructure" />
    <uo k="s:originTrace" v="n:4676225400725146701" />
    <node concept="3Tm1VV" id="1" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725146701" />
    </node>
    <node concept="3uibUv" id="2" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725146701" />
    </node>
    <node concept="3clFb_" id="3" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725146701" />
      <node concept="3cqZAl" id="4" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725146701" />
      </node>
      <node concept="3Tm1VV" id="5" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725146701" />
      </node>
      <node concept="3clFbS" id="6" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725146701" />
        <node concept="3cpWs8" id="9" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725146701" />
          <node concept="3cpWsn" id="h" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725146701" />
            <node concept="3uibUv" id="i" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725146701" />
            </node>
            <node concept="2ShNRf" id="j" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725146701" />
              <node concept="1pGfFk" id="k" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725146701" />
                <node concept="37vLTw" id="l" role="37wK5m">
                  <ref role="3cqZAo" node="7" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725146701" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="a" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725146737" />
          <node concept="3clFbS" id="m" role="2LFqv$">
            <uo k="s:originTrace" v="n:4676225400725146737" />
            <node concept="3clFbF" id="p" role="3cqZAp">
              <uo k="s:originTrace" v="n:4676225400725146737" />
              <node concept="2OqwBi" id="q" role="3clFbG">
                <uo k="s:originTrace" v="n:4676225400725146737" />
                <node concept="37vLTw" id="r" role="2Oq$k0">
                  <ref role="3cqZAo" node="h" resolve="tgs" />
                  <uo k="s:originTrace" v="n:4676225400725146737" />
                </node>
                <node concept="liA8E" id="s" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:4676225400725146737" />
                  <node concept="37vLTw" id="t" role="37wK5m">
                    <ref role="3cqZAo" node="n" resolve="item" />
                    <uo k="s:originTrace" v="n:4676225400725146737" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="n" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:4676225400725146737" />
            <node concept="3Tqbb2" id="u" role="1tU5fm">
              <uo k="s:originTrace" v="n:4676225400725146737" />
            </node>
          </node>
          <node concept="2OqwBi" id="o" role="1DdaDG">
            <uo k="s:originTrace" v="n:4676225400725146738" />
            <node concept="2OqwBi" id="v" role="2Oq$k0">
              <uo k="s:originTrace" v="n:4676225400725146739" />
              <node concept="37vLTw" id="x" role="2Oq$k0">
                <ref role="3cqZAo" node="7" resolve="ctx" />
              </node>
              <node concept="liA8E" id="y" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="3Tsc0h" id="w" role="2OqNvi">
              <ref role="3TtcxE" to="mmpm:2oBrHLm5DoW" resolve="results" />
              <uo k="s:originTrace" v="n:4676225400725147416" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="b" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725146741" />
          <node concept="2OqwBi" id="z" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725146741" />
            <node concept="37vLTw" id="$" role="2Oq$k0">
              <ref role="3cqZAo" node="h" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725146741" />
            </node>
            <node concept="liA8E" id="_" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725146741" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="c" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725147481" />
          <node concept="3clFbS" id="A" role="2LFqv$">
            <uo k="s:originTrace" v="n:4676225400725147481" />
            <node concept="3clFbF" id="D" role="3cqZAp">
              <uo k="s:originTrace" v="n:4676225400725147481" />
              <node concept="2OqwBi" id="E" role="3clFbG">
                <uo k="s:originTrace" v="n:4676225400725147481" />
                <node concept="37vLTw" id="F" role="2Oq$k0">
                  <ref role="3cqZAo" node="h" resolve="tgs" />
                  <uo k="s:originTrace" v="n:4676225400725147481" />
                </node>
                <node concept="liA8E" id="G" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:4676225400725147481" />
                  <node concept="37vLTw" id="H" role="37wK5m">
                    <ref role="3cqZAo" node="B" resolve="item" />
                    <uo k="s:originTrace" v="n:4676225400725147481" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="B" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:4676225400725147481" />
            <node concept="3Tqbb2" id="I" role="1tU5fm">
              <uo k="s:originTrace" v="n:4676225400725147481" />
            </node>
          </node>
          <node concept="2OqwBi" id="C" role="1DdaDG">
            <uo k="s:originTrace" v="n:4676225400725147482" />
            <node concept="2OqwBi" id="J" role="2Oq$k0">
              <uo k="s:originTrace" v="n:4676225400725147483" />
              <node concept="37vLTw" id="L" role="2Oq$k0">
                <ref role="3cqZAo" node="7" resolve="ctx" />
              </node>
              <node concept="liA8E" id="M" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="3Tsc0h" id="K" role="2OqNvi">
              <ref role="3TtcxE" to="mmpm:2oBrHLm5DoT" resolve="applicationProcess" />
              <uo k="s:originTrace" v="n:4676225400725148226" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="d" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725147485" />
          <node concept="2OqwBi" id="N" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725147485" />
            <node concept="37vLTw" id="O" role="2Oq$k0">
              <ref role="3cqZAo" node="h" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725147485" />
            </node>
            <node concept="liA8E" id="P" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725147485" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="e" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725147563" />
          <node concept="3clFbS" id="Q" role="2LFqv$">
            <uo k="s:originTrace" v="n:4676225400725147563" />
            <node concept="3clFbF" id="T" role="3cqZAp">
              <uo k="s:originTrace" v="n:4676225400725147563" />
              <node concept="2OqwBi" id="U" role="3clFbG">
                <uo k="s:originTrace" v="n:4676225400725147563" />
                <node concept="37vLTw" id="V" role="2Oq$k0">
                  <ref role="3cqZAo" node="h" resolve="tgs" />
                  <uo k="s:originTrace" v="n:4676225400725147563" />
                </node>
                <node concept="liA8E" id="W" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:4676225400725147563" />
                  <node concept="37vLTw" id="X" role="37wK5m">
                    <ref role="3cqZAo" node="R" resolve="item" />
                    <uo k="s:originTrace" v="n:4676225400725147563" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="R" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:4676225400725147563" />
            <node concept="3Tqbb2" id="Y" role="1tU5fm">
              <uo k="s:originTrace" v="n:4676225400725147563" />
            </node>
          </node>
          <node concept="2OqwBi" id="S" role="1DdaDG">
            <uo k="s:originTrace" v="n:4676225400725147564" />
            <node concept="2OqwBi" id="Z" role="2Oq$k0">
              <uo k="s:originTrace" v="n:4676225400725147565" />
              <node concept="37vLTw" id="11" role="2Oq$k0">
                <ref role="3cqZAo" node="7" resolve="ctx" />
              </node>
              <node concept="liA8E" id="12" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="3Tsc0h" id="10" role="2OqNvi">
              <ref role="3TtcxE" to="mmpm:2oBrHLm5DoR" resolve="requirements" />
              <uo k="s:originTrace" v="n:4676225400725148327" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="f" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725147567" />
          <node concept="2OqwBi" id="13" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725147567" />
            <node concept="37vLTw" id="14" role="2Oq$k0">
              <ref role="3cqZAo" node="h" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725147567" />
            </node>
            <node concept="liA8E" id="15" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725147567" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="g" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725147450" />
        </node>
      </node>
      <node concept="37vLTG" id="7" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725146701" />
        <node concept="3uibUv" id="16" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725146701" />
        </node>
      </node>
      <node concept="2AHcQZ" id="8" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725146701" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="17">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="ApplicationProcess_TextGen" />
    <property role="3GE5qa" value="AdmissionStructure" />
    <uo k="s:originTrace" v="n:4676225400725160677" />
    <node concept="3Tm1VV" id="18" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725160677" />
    </node>
    <node concept="3uibUv" id="19" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725160677" />
    </node>
    <node concept="3clFb_" id="1a" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725160677" />
      <node concept="3cqZAl" id="1b" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725160677" />
      </node>
      <node concept="3Tm1VV" id="1c" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725160677" />
      </node>
      <node concept="3clFbS" id="1d" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725160677" />
        <node concept="3cpWs8" id="1g" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725160677" />
          <node concept="3cpWsn" id="1j" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725160677" />
            <node concept="3uibUv" id="1k" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725160677" />
            </node>
            <node concept="2ShNRf" id="1l" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725160677" />
              <node concept="1pGfFk" id="1m" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725160677" />
                <node concept="37vLTw" id="1n" role="37wK5m">
                  <ref role="3cqZAo" node="1e" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725160677" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="1h" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725160705" />
          <node concept="3clFbS" id="1o" role="2LFqv$">
            <uo k="s:originTrace" v="n:4676225400725160705" />
            <node concept="3clFbF" id="1r" role="3cqZAp">
              <uo k="s:originTrace" v="n:4676225400725160705" />
              <node concept="2OqwBi" id="1s" role="3clFbG">
                <uo k="s:originTrace" v="n:4676225400725160705" />
                <node concept="37vLTw" id="1t" role="2Oq$k0">
                  <ref role="3cqZAo" node="1j" resolve="tgs" />
                  <uo k="s:originTrace" v="n:4676225400725160705" />
                </node>
                <node concept="liA8E" id="1u" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:4676225400725160705" />
                  <node concept="37vLTw" id="1v" role="37wK5m">
                    <ref role="3cqZAo" node="1p" resolve="item" />
                    <uo k="s:originTrace" v="n:4676225400725160705" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="1p" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:4676225400725160705" />
            <node concept="3Tqbb2" id="1w" role="1tU5fm">
              <uo k="s:originTrace" v="n:4676225400725160705" />
            </node>
          </node>
          <node concept="2OqwBi" id="1q" role="1DdaDG">
            <uo k="s:originTrace" v="n:4676225400725160706" />
            <node concept="2OqwBi" id="1x" role="2Oq$k0">
              <uo k="s:originTrace" v="n:4676225400725160707" />
              <node concept="37vLTw" id="1z" role="2Oq$k0">
                <ref role="3cqZAo" node="1e" resolve="ctx" />
              </node>
              <node concept="liA8E" id="1$" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="3Tsc0h" id="1y" role="2OqNvi">
              <ref role="3TtcxE" to="mmpm:2oBrHLm5Dp0" resolve="steps" />
              <uo k="s:originTrace" v="n:4676225400725161384" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1i" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725160709" />
          <node concept="2OqwBi" id="1_" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725160709" />
            <node concept="37vLTw" id="1A" role="2Oq$k0">
              <ref role="3cqZAo" node="1j" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725160709" />
            </node>
            <node concept="liA8E" id="1B" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725160709" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="1e" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725160677" />
        <node concept="3uibUv" id="1C" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725160677" />
        </node>
      </node>
      <node concept="2AHcQZ" id="1f" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725160677" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="1D">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="AssociatePartner_TextGen" />
    <uo k="s:originTrace" v="n:8411917052164926909" />
    <node concept="3Tm1VV" id="1E" role="1B3o_S">
      <uo k="s:originTrace" v="n:8411917052164926909" />
    </node>
    <node concept="3uibUv" id="1F" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:8411917052164926909" />
    </node>
    <node concept="3clFb_" id="1G" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:8411917052164926909" />
      <node concept="3cqZAl" id="1H" role="3clF45">
        <uo k="s:originTrace" v="n:8411917052164926909" />
      </node>
      <node concept="3Tm1VV" id="1I" role="1B3o_S">
        <uo k="s:originTrace" v="n:8411917052164926909" />
      </node>
      <node concept="3clFbS" id="1J" role="3clF47">
        <uo k="s:originTrace" v="n:8411917052164926909" />
        <node concept="3cpWs8" id="1M" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926909" />
          <node concept="3cpWsn" id="1W" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:8411917052164926909" />
            <node concept="3uibUv" id="1X" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:8411917052164926909" />
            </node>
            <node concept="2ShNRf" id="1Y" role="33vP2m">
              <uo k="s:originTrace" v="n:8411917052164926909" />
              <node concept="1pGfFk" id="1Z" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:8411917052164926909" />
                <node concept="37vLTw" id="20" role="37wK5m">
                  <ref role="3cqZAo" node="1K" resolve="ctx" />
                  <uo k="s:originTrace" v="n:8411917052164926909" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1N" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926914" />
          <node concept="2OqwBi" id="21" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164926914" />
            <node concept="37vLTw" id="22" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164926914" />
            </node>
            <node concept="liA8E" id="23" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164926914" />
              <node concept="Xl_RD" id="24" role="37wK5m">
                <property role="Xl_RC" value="--insert values into partners table" />
                <uo k="s:originTrace" v="n:8411917052164926914" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1O" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926915" />
          <node concept="2OqwBi" id="25" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164926915" />
            <node concept="37vLTw" id="26" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164926915" />
            </node>
            <node concept="liA8E" id="27" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052164926915" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1P" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926920" />
          <node concept="2OqwBi" id="28" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164926920" />
            <node concept="37vLTw" id="29" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164926920" />
            </node>
            <node concept="liA8E" id="2a" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164926920" />
              <node concept="Xl_RD" id="2b" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO partner (name, type) " />
                <uo k="s:originTrace" v="n:8411917052164926920" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1Q" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926925" />
          <node concept="2OqwBi" id="2c" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164926925" />
            <node concept="37vLTw" id="2d" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164926925" />
            </node>
            <node concept="liA8E" id="2e" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164926925" />
              <node concept="Xl_RD" id="2f" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:8411917052164926925" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1R" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926926" />
          <node concept="2OqwBi" id="2g" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164926926" />
            <node concept="37vLTw" id="2h" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164926926" />
            </node>
            <node concept="liA8E" id="2i" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164926926" />
              <node concept="2OqwBi" id="2j" role="37wK5m">
                <uo k="s:originTrace" v="n:8411917052164927670" />
                <node concept="2OqwBi" id="2k" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:8411917052164927251" />
                  <node concept="37vLTw" id="2m" role="2Oq$k0">
                    <ref role="3cqZAo" node="1K" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="2n" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="2l" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ATc" resolve="name" />
                  <uo k="s:originTrace" v="n:8411917052164928141" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1S" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926931" />
          <node concept="2OqwBi" id="2o" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164926931" />
            <node concept="37vLTw" id="2p" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164926931" />
            </node>
            <node concept="liA8E" id="2q" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164926931" />
              <node concept="Xl_RD" id="2r" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:8411917052164926931" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1T" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926932" />
          <node concept="2OqwBi" id="2s" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164926932" />
            <node concept="37vLTw" id="2t" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164926932" />
            </node>
            <node concept="liA8E" id="2u" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164926932" />
              <node concept="2YIFZM" id="2v" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~String.valueOf(java.lang.Object)" resolve="valueOf" />
                <ref role="1Pybhc" to="wyt6:~String" resolve="String" />
                <uo k="s:originTrace" v="n:8411917052164928281" />
                <node concept="2OqwBi" id="2w" role="37wK5m">
                  <uo k="s:originTrace" v="n:8411917052164929058" />
                  <node concept="2OqwBi" id="2x" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:8411917052164928283" />
                    <node concept="37vLTw" id="2z" role="2Oq$k0">
                      <ref role="3cqZAo" node="1K" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="2$" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="2y" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ATk" resolve="type" />
                    <uo k="s:originTrace" v="n:8411917052164929531" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1U" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164926942" />
          <node concept="2OqwBi" id="2_" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164926942" />
            <node concept="37vLTw" id="2A" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164926942" />
            </node>
            <node concept="liA8E" id="2B" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164926942" />
              <node concept="Xl_RD" id="2C" role="37wK5m">
                <property role="Xl_RC" value="&quot;);" />
                <uo k="s:originTrace" v="n:8411917052164926942" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1V" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400728567855" />
          <node concept="2OqwBi" id="2D" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400728567855" />
            <node concept="37vLTw" id="2E" role="2Oq$k0">
              <ref role="3cqZAo" node="1W" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400728567855" />
            </node>
            <node concept="liA8E" id="2F" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400728567855" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="1K" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:8411917052164926909" />
        <node concept="3uibUv" id="2G" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:8411917052164926909" />
        </node>
      </node>
      <node concept="2AHcQZ" id="1L" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8411917052164926909" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2H">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="Course_TextGen" />
    <property role="3GE5qa" value="University" />
    <uo k="s:originTrace" v="n:4676225400725132381" />
    <node concept="3Tm1VV" id="2I" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725132381" />
    </node>
    <node concept="3uibUv" id="2J" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725132381" />
    </node>
    <node concept="3clFb_" id="2K" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725132381" />
      <node concept="3cqZAl" id="2L" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725132381" />
      </node>
      <node concept="3Tm1VV" id="2M" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725132381" />
      </node>
      <node concept="3clFbS" id="2N" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725132381" />
        <node concept="3cpWs8" id="2Q" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132381" />
          <node concept="3cpWsn" id="34" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725132381" />
            <node concept="3uibUv" id="35" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725132381" />
            </node>
            <node concept="2ShNRf" id="36" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725132381" />
              <node concept="1pGfFk" id="37" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725132381" />
                <node concept="37vLTw" id="38" role="37wK5m">
                  <ref role="3cqZAo" node="2O" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725132381" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2R" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132411" />
          <node concept="2OqwBi" id="39" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132411" />
            <node concept="37vLTw" id="3a" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132411" />
            </node>
            <node concept="liA8E" id="3b" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725132411" />
              <node concept="Xl_RD" id="3c" role="37wK5m">
                <property role="Xl_RC" value="--insert values into courses table" />
                <uo k="s:originTrace" v="n:4676225400725132411" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2S" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132412" />
          <node concept="2OqwBi" id="3d" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132412" />
            <node concept="37vLTw" id="3e" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132412" />
            </node>
            <node concept="liA8E" id="3f" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725132412" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2T" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132511" />
          <node concept="2OqwBi" id="3g" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132511" />
            <node concept="37vLTw" id="3h" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132511" />
            </node>
            <node concept="liA8E" id="3i" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725132511" />
              <node concept="Xl_RD" id="3j" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO course (name, course_code, credits, faculty) " />
                <uo k="s:originTrace" v="n:4676225400725132511" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2U" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132793" />
          <node concept="2OqwBi" id="3k" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132793" />
            <node concept="37vLTw" id="3l" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132793" />
            </node>
            <node concept="liA8E" id="3m" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725132793" />
              <node concept="Xl_RD" id="3n" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:4676225400725132793" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2V" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132794" />
          <node concept="2OqwBi" id="3o" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132794" />
            <node concept="37vLTw" id="3p" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132794" />
            </node>
            <node concept="liA8E" id="3q" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725132794" />
              <node concept="2OqwBi" id="3r" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725132795" />
                <node concept="2OqwBi" id="3s" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725132796" />
                  <node concept="37vLTw" id="3u" role="2Oq$k0">
                    <ref role="3cqZAo" node="2O" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="3v" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="3t" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  <uo k="s:originTrace" v="n:4676225400725132797" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2W" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132798" />
          <node concept="2OqwBi" id="3w" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132798" />
            <node concept="37vLTw" id="3x" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132798" />
            </node>
            <node concept="liA8E" id="3y" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725132798" />
              <node concept="Xl_RD" id="3z" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725132798" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2X" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725134342" />
          <node concept="2OqwBi" id="3$" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725134342" />
            <node concept="37vLTw" id="3_" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725134342" />
            </node>
            <node concept="liA8E" id="3A" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725134342" />
              <node concept="2OqwBi" id="3B" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725134907" />
                <node concept="2OqwBi" id="3C" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725134438" />
                  <node concept="37vLTw" id="3E" role="2Oq$k0">
                    <ref role="3cqZAo" node="2O" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="3F" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="3D" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ASQ" resolve="courseCode" />
                  <uo k="s:originTrace" v="n:4676225400725136119" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2Y" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725136304" />
          <node concept="2OqwBi" id="3G" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725136304" />
            <node concept="37vLTw" id="3H" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725136304" />
            </node>
            <node concept="liA8E" id="3I" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725136304" />
              <node concept="Xl_RD" id="3J" role="37wK5m">
                <property role="Xl_RC" value="&quot;," />
                <uo k="s:originTrace" v="n:4676225400725136304" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2Z" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132799" />
          <node concept="2OqwBi" id="3K" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132799" />
            <node concept="37vLTw" id="3L" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132799" />
            </node>
            <node concept="liA8E" id="3M" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725132799" />
              <node concept="2YIFZM" id="3N" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:4676225400725132800" />
                <node concept="2OqwBi" id="3O" role="37wK5m">
                  <uo k="s:originTrace" v="n:4676225400725132801" />
                  <node concept="2OqwBi" id="3P" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:4676225400725132802" />
                    <node concept="37vLTw" id="3R" role="2Oq$k0">
                      <ref role="3cqZAo" node="2O" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="3S" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="3Q" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ASV" resolve="credits" />
                    <uo k="s:originTrace" v="n:4676225400725136540" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="30" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725136712" />
          <node concept="2OqwBi" id="3T" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725136712" />
            <node concept="37vLTw" id="3U" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725136712" />
            </node>
            <node concept="liA8E" id="3V" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725136712" />
              <node concept="Xl_RD" id="3W" role="37wK5m">
                <property role="Xl_RC" value=",&quot;" />
                <uo k="s:originTrace" v="n:4676225400725136712" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="31" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725136983" />
          <node concept="2OqwBi" id="3X" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725136983" />
            <node concept="37vLTw" id="3Y" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725136983" />
            </node>
            <node concept="liA8E" id="3Z" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725136983" />
              <node concept="2OqwBi" id="40" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725137132" />
                <node concept="2OqwBi" id="41" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725137103" />
                  <node concept="37vLTw" id="43" role="2Oq$k0">
                    <ref role="3cqZAo" node="2O" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="44" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="42" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ASZ" resolve="faculty" />
                  <uo k="s:originTrace" v="n:4676225400725137211" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="32" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132804" />
          <node concept="2OqwBi" id="45" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132804" />
            <node concept="37vLTw" id="46" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132804" />
            </node>
            <node concept="liA8E" id="47" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725132804" />
              <node concept="Xl_RD" id="48" role="37wK5m">
                <property role="Xl_RC" value="&quot;);" />
                <uo k="s:originTrace" v="n:4676225400725132804" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="33" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725132805" />
          <node concept="2OqwBi" id="49" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725132805" />
            <node concept="37vLTw" id="4a" role="2Oq$k0">
              <ref role="3cqZAo" node="34" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725132805" />
            </node>
            <node concept="liA8E" id="4b" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725132805" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2O" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725132381" />
        <node concept="3uibUv" id="4c" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725132381" />
        </node>
      </node>
      <node concept="2AHcQZ" id="2P" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725132381" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="4d">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="DegreeRequirement_TextGen" />
    <property role="3GE5qa" value="Requirement" />
    <uo k="s:originTrace" v="n:4676225400725182135" />
    <node concept="3Tm1VV" id="4e" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725182135" />
    </node>
    <node concept="3uibUv" id="4f" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725182135" />
    </node>
    <node concept="3clFb_" id="4g" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725182135" />
      <node concept="3cqZAl" id="4h" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725182135" />
      </node>
      <node concept="3Tm1VV" id="4i" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725182135" />
      </node>
      <node concept="3clFbS" id="4j" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725182135" />
        <node concept="3cpWs8" id="4m" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182135" />
          <node concept="3cpWsn" id="4y" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725182135" />
            <node concept="3uibUv" id="4z" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725182135" />
            </node>
            <node concept="2ShNRf" id="4$" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725182135" />
              <node concept="1pGfFk" id="4_" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725182135" />
                <node concept="37vLTw" id="4A" role="37wK5m">
                  <ref role="3cqZAo" node="4k" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725182135" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4n" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182167" />
          <node concept="2OqwBi" id="4B" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182167" />
            <node concept="37vLTw" id="4C" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182167" />
            </node>
            <node concept="liA8E" id="4D" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725182167" />
              <node concept="Xl_RD" id="4E" role="37wK5m">
                <property role="Xl_RC" value="--insert values into degree requirements table" />
                <uo k="s:originTrace" v="n:4676225400725182167" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4o" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182168" />
          <node concept="2OqwBi" id="4F" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182168" />
            <node concept="37vLTw" id="4G" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182168" />
            </node>
            <node concept="liA8E" id="4H" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725182168" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4p" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182246" />
          <node concept="2OqwBi" id="4I" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182246" />
            <node concept="37vLTw" id="4J" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182246" />
            </node>
            <node concept="liA8E" id="4K" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725182246" />
              <node concept="Xl_RD" id="4L" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO degree (name, field_of_study, level) " />
                <uo k="s:originTrace" v="n:4676225400725182246" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4q" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182413" />
          <node concept="2OqwBi" id="4M" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182413" />
            <node concept="37vLTw" id="4N" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182413" />
            </node>
            <node concept="liA8E" id="4O" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725182413" />
              <node concept="Xl_RD" id="4P" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:4676225400725182413" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4r" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182414" />
          <node concept="2OqwBi" id="4Q" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182414" />
            <node concept="37vLTw" id="4R" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182414" />
            </node>
            <node concept="liA8E" id="4S" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725182414" />
              <node concept="2OqwBi" id="4T" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725182415" />
                <node concept="2OqwBi" id="4U" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725182416" />
                  <node concept="37vLTw" id="4W" role="2Oq$k0">
                    <ref role="3cqZAo" node="4k" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="4X" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="4V" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  <uo k="s:originTrace" v="n:4676225400725182417" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4s" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182418" />
          <node concept="2OqwBi" id="4Y" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182418" />
            <node concept="37vLTw" id="4Z" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182418" />
            </node>
            <node concept="liA8E" id="50" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725182418" />
              <node concept="Xl_RD" id="51" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725182418" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4t" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725184457" />
          <node concept="2OqwBi" id="52" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725184457" />
            <node concept="37vLTw" id="53" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725184457" />
            </node>
            <node concept="liA8E" id="54" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725184457" />
              <node concept="2OqwBi" id="55" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725185070" />
                <node concept="2OqwBi" id="56" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725184579" />
                  <node concept="37vLTw" id="58" role="2Oq$k0">
                    <ref role="3cqZAo" node="4k" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="59" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="57" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5Dot" resolve="fieldOfStudy" />
                  <uo k="s:originTrace" v="n:4676225400725185743" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4u" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725185931" />
          <node concept="2OqwBi" id="5a" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725185931" />
            <node concept="37vLTw" id="5b" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725185931" />
            </node>
            <node concept="liA8E" id="5c" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725185931" />
              <node concept="Xl_RD" id="5d" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725185931" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4v" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182419" />
          <node concept="2OqwBi" id="5e" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182419" />
            <node concept="37vLTw" id="5f" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182419" />
            </node>
            <node concept="liA8E" id="5g" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725182419" />
              <node concept="2YIFZM" id="5h" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~String.valueOf(java.lang.Object)" resolve="valueOf" />
                <ref role="1Pybhc" to="wyt6:~String" resolve="String" />
                <uo k="s:originTrace" v="n:4676225400725182420" />
                <node concept="2OqwBi" id="5i" role="37wK5m">
                  <uo k="s:originTrace" v="n:4676225400725182421" />
                  <node concept="2OqwBi" id="5j" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:4676225400725182422" />
                    <node concept="37vLTw" id="5l" role="2Oq$k0">
                      <ref role="3cqZAo" node="4k" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="5m" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="5k" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5Dow" resolve="level" />
                    <uo k="s:originTrace" v="n:4676225400725186214" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4w" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182424" />
          <node concept="2OqwBi" id="5n" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182424" />
            <node concept="37vLTw" id="5o" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182424" />
            </node>
            <node concept="liA8E" id="5p" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725182424" />
              <node concept="Xl_RD" id="5q" role="37wK5m">
                <property role="Xl_RC" value="&quot;);" />
                <uo k="s:originTrace" v="n:4676225400725182424" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4x" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725182425" />
          <node concept="2OqwBi" id="5r" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725182425" />
            <node concept="37vLTw" id="5s" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725182425" />
            </node>
            <node concept="liA8E" id="5t" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725182425" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="4k" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725182135" />
        <node concept="3uibUv" id="5u" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725182135" />
        </node>
      </node>
      <node concept="2AHcQZ" id="4l" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725182135" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="5v">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="DocumentRequirement_TextGen" />
    <property role="3GE5qa" value="Requirement" />
    <uo k="s:originTrace" v="n:4676225400725176585" />
    <node concept="3Tm1VV" id="5w" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725176585" />
    </node>
    <node concept="3uibUv" id="5x" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725176585" />
    </node>
    <node concept="3clFb_" id="5y" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725176585" />
      <node concept="3cqZAl" id="5z" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725176585" />
      </node>
      <node concept="3Tm1VV" id="5$" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725176585" />
      </node>
      <node concept="3clFbS" id="5_" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725176585" />
        <node concept="3cpWs8" id="5C" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725176585" />
          <node concept="3cpWsn" id="5M" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725176585" />
            <node concept="3uibUv" id="5N" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725176585" />
            </node>
            <node concept="2ShNRf" id="5O" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725176585" />
              <node concept="1pGfFk" id="5P" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725176585" />
                <node concept="37vLTw" id="5Q" role="37wK5m">
                  <ref role="3cqZAo" node="5A" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725176585" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5D" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725177852" />
          <node concept="2OqwBi" id="5R" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725177852" />
            <node concept="37vLTw" id="5S" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725177852" />
            </node>
            <node concept="liA8E" id="5T" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725177852" />
              <node concept="Xl_RD" id="5U" role="37wK5m">
                <property role="Xl_RC" value="--insert values into document requirements table" />
                <uo k="s:originTrace" v="n:4676225400725177852" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5E" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725177853" />
          <node concept="2OqwBi" id="5V" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725177853" />
            <node concept="37vLTw" id="5W" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725177853" />
            </node>
            <node concept="liA8E" id="5X" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725177853" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5F" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725177931" />
          <node concept="2OqwBi" id="5Y" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725177931" />
            <node concept="37vLTw" id="5Z" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725177931" />
            </node>
            <node concept="liA8E" id="60" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725177931" />
              <node concept="Xl_RD" id="61" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO document (name, description) " />
                <uo k="s:originTrace" v="n:4676225400725177931" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5G" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725178881" />
          <node concept="2OqwBi" id="62" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725178881" />
            <node concept="37vLTw" id="63" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725178881" />
            </node>
            <node concept="liA8E" id="64" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725178881" />
              <node concept="Xl_RD" id="65" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:4676225400725178881" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5H" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725178882" />
          <node concept="2OqwBi" id="66" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725178882" />
            <node concept="37vLTw" id="67" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725178882" />
            </node>
            <node concept="liA8E" id="68" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725178882" />
              <node concept="2OqwBi" id="69" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725178883" />
                <node concept="2OqwBi" id="6a" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725178884" />
                  <node concept="37vLTw" id="6c" role="2Oq$k0">
                    <ref role="3cqZAo" node="5A" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="6d" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="6b" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  <uo k="s:originTrace" v="n:4676225400725178885" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5I" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725178886" />
          <node concept="2OqwBi" id="6e" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725178886" />
            <node concept="37vLTw" id="6f" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725178886" />
            </node>
            <node concept="liA8E" id="6g" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725178886" />
              <node concept="Xl_RD" id="6h" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725178886" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5J" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725178887" />
          <node concept="2OqwBi" id="6i" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725178887" />
            <node concept="37vLTw" id="6j" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725178887" />
            </node>
            <node concept="liA8E" id="6k" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725178887" />
              <node concept="2OqwBi" id="6l" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725181088" />
                <node concept="2OqwBi" id="6m" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725180597" />
                  <node concept="37vLTw" id="6o" role="2Oq$k0">
                    <ref role="3cqZAo" node="5A" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="6p" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="6n" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5Dnu" resolve="description" />
                  <uo k="s:originTrace" v="n:4676225400725181761" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5K" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725178892" />
          <node concept="2OqwBi" id="6q" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725178892" />
            <node concept="37vLTw" id="6r" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725178892" />
            </node>
            <node concept="liA8E" id="6s" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725178892" />
              <node concept="Xl_RD" id="6t" role="37wK5m">
                <property role="Xl_RC" value="&quot;);" />
                <uo k="s:originTrace" v="n:4676225400725178892" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5L" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725178893" />
          <node concept="2OqwBi" id="6u" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725178893" />
            <node concept="37vLTw" id="6v" role="2Oq$k0">
              <ref role="3cqZAo" node="5M" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725178893" />
            </node>
            <node concept="liA8E" id="6w" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725178893" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="5A" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725176585" />
        <node concept="3uibUv" id="6x" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725176585" />
        </node>
      </node>
      <node concept="2AHcQZ" id="5B" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725176585" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="6y">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="ErasmusProgram_TextGen" />
    <uo k="s:originTrace" v="n:8411917052161291951" />
    <node concept="3Tm1VV" id="6z" role="1B3o_S">
      <uo k="s:originTrace" v="n:8411917052161291951" />
    </node>
    <node concept="3uibUv" id="6$" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:8411917052161291951" />
    </node>
    <node concept="3clFb_" id="6_" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:8411917052161291951" />
      <node concept="3cqZAl" id="6A" role="3clF45">
        <uo k="s:originTrace" v="n:8411917052161291951" />
      </node>
      <node concept="3Tm1VV" id="6B" role="1B3o_S">
        <uo k="s:originTrace" v="n:8411917052161291951" />
      </node>
      <node concept="3clFbS" id="6C" role="3clF47">
        <uo k="s:originTrace" v="n:8411917052161291951" />
        <node concept="3cpWs8" id="6F" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052161291951" />
          <node concept="3cpWsn" id="6Z" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:8411917052161291951" />
            <node concept="3uibUv" id="70" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:8411917052161291951" />
            </node>
            <node concept="2ShNRf" id="71" role="33vP2m">
              <uo k="s:originTrace" v="n:8411917052161291951" />
              <node concept="1pGfFk" id="72" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:8411917052161291951" />
                <node concept="37vLTw" id="73" role="37wK5m">
                  <ref role="3cqZAo" node="6D" resolve="ctx" />
                  <uo k="s:originTrace" v="n:8411917052161291951" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6G" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163305884" />
          <node concept="2OqwBi" id="74" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163305884" />
            <node concept="37vLTw" id="75" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163305884" />
            </node>
            <node concept="liA8E" id="76" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163305884" />
              <node concept="Xl_RD" id="77" role="37wK5m">
                <property role="Xl_RC" value="--insert values into programs table" />
                <uo k="s:originTrace" v="n:8411917052163305884" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6H" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163305890" />
          <node concept="2OqwBi" id="78" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163305890" />
            <node concept="37vLTw" id="79" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163305890" />
            </node>
            <node concept="liA8E" id="7a" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052163305890" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6I" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163305902" />
          <node concept="2OqwBi" id="7b" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163305902" />
            <node concept="37vLTw" id="7c" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163305902" />
            </node>
            <node concept="liA8E" id="7d" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163305902" />
              <node concept="Xl_RD" id="7e" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO program (id, name, total_credits) " />
                <uo k="s:originTrace" v="n:8411917052163305902" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6J" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163305917" />
          <node concept="2OqwBi" id="7f" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163305917" />
            <node concept="37vLTw" id="7g" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163305917" />
            </node>
            <node concept="liA8E" id="7h" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163305917" />
              <node concept="Xl_RD" id="7i" role="37wK5m">
                <property role="Xl_RC" value="VALUES (" />
                <uo k="s:originTrace" v="n:8411917052163305917" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6K" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163305927" />
          <node concept="2OqwBi" id="7j" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163305927" />
            <node concept="37vLTw" id="7k" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163305927" />
            </node>
            <node concept="liA8E" id="7l" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163305927" />
              <node concept="2YIFZM" id="7m" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:8411917052164305924" />
                <node concept="2OqwBi" id="7n" role="37wK5m">
                  <uo k="s:originTrace" v="n:8411917052164306587" />
                  <node concept="2OqwBi" id="7o" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:8411917052164305926" />
                    <node concept="37vLTw" id="7q" role="2Oq$k0">
                      <ref role="3cqZAo" node="6D" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="7r" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="7p" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm8$4d" resolve="id" />
                    <uo k="s:originTrace" v="n:8411917052164307152" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6L" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163312799" />
          <node concept="2OqwBi" id="7s" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163312799" />
            <node concept="37vLTw" id="7t" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163312799" />
            </node>
            <node concept="liA8E" id="7u" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163312799" />
              <node concept="Xl_RD" id="7v" role="37wK5m">
                <property role="Xl_RC" value=", &quot;" />
                <uo k="s:originTrace" v="n:8411917052163312799" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6M" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163312804" />
          <node concept="2OqwBi" id="7w" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163312804" />
            <node concept="37vLTw" id="7x" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163312804" />
            </node>
            <node concept="liA8E" id="7y" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163312804" />
              <node concept="2OqwBi" id="7z" role="37wK5m">
                <uo k="s:originTrace" v="n:8411917052163317504" />
                <node concept="2OqwBi" id="7$" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:8411917052163312809" />
                  <node concept="37vLTw" id="7A" role="2Oq$k0">
                    <ref role="3cqZAo" node="6D" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="7B" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="7_" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  <uo k="s:originTrace" v="n:8411917052163318192" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6N" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163318222" />
          <node concept="2OqwBi" id="7C" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163318222" />
            <node concept="37vLTw" id="7D" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163318222" />
            </node>
            <node concept="liA8E" id="7E" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163318222" />
              <node concept="Xl_RD" id="7F" role="37wK5m">
                <property role="Xl_RC" value="&quot;, " />
                <uo k="s:originTrace" v="n:8411917052163318222" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6O" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163318227" />
          <node concept="2OqwBi" id="7G" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163318227" />
            <node concept="37vLTw" id="7H" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163318227" />
            </node>
            <node concept="liA8E" id="7I" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163318227" />
              <node concept="2YIFZM" id="7J" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:8411917052164335195" />
                <node concept="2OqwBi" id="7K" role="37wK5m">
                  <uo k="s:originTrace" v="n:8411917052164335859" />
                  <node concept="2OqwBi" id="7L" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:8411917052164335197" />
                    <node concept="37vLTw" id="7N" role="2Oq$k0">
                      <ref role="3cqZAo" node="6D" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="7O" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="7M" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ARX" resolve="totalCredits" />
                    <uo k="s:originTrace" v="n:8411917052164336424" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6P" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163323108" />
          <node concept="2OqwBi" id="7P" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163323108" />
            <node concept="37vLTw" id="7Q" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163323108" />
            </node>
            <node concept="liA8E" id="7R" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163323108" />
              <node concept="Xl_RD" id="7S" role="37wK5m">
                <property role="Xl_RC" value=");" />
                <uo k="s:originTrace" v="n:8411917052163323108" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Q" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163822066" />
          <node concept="2OqwBi" id="7T" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163822066" />
            <node concept="37vLTw" id="7U" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163822066" />
            </node>
            <node concept="liA8E" id="7V" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052163822066" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="6R" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163822076" />
          <node concept="3clFbS" id="7W" role="2LFqv$">
            <uo k="s:originTrace" v="n:8411917052163822076" />
            <node concept="3clFbF" id="7Z" role="3cqZAp">
              <uo k="s:originTrace" v="n:8411917052163822076" />
              <node concept="2OqwBi" id="80" role="3clFbG">
                <uo k="s:originTrace" v="n:8411917052163822076" />
                <node concept="37vLTw" id="81" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Z" resolve="tgs" />
                  <uo k="s:originTrace" v="n:8411917052163822076" />
                </node>
                <node concept="liA8E" id="82" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:8411917052163822076" />
                  <node concept="37vLTw" id="83" role="37wK5m">
                    <ref role="3cqZAo" node="7X" resolve="item" />
                    <uo k="s:originTrace" v="n:8411917052163822076" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="7X" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:8411917052163822076" />
            <node concept="3Tqbb2" id="84" role="1tU5fm">
              <uo k="s:originTrace" v="n:8411917052163822076" />
            </node>
          </node>
          <node concept="2OqwBi" id="7Y" role="1DdaDG">
            <uo k="s:originTrace" v="n:8411917052163824184" />
            <node concept="2OqwBi" id="85" role="2Oq$k0">
              <uo k="s:originTrace" v="n:8411917052163822082" />
              <node concept="37vLTw" id="87" role="2Oq$k0">
                <ref role="3cqZAo" node="6D" resolve="ctx" />
              </node>
              <node concept="liA8E" id="88" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="3Tsc0h" id="86" role="2OqNvi">
              <ref role="3TtcxE" to="mmpm:2oBrHLm5DoI" resolve="scholarships" />
              <uo k="s:originTrace" v="n:8411917052163824855" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6S" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164650973" />
          <node concept="2OqwBi" id="89" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164650973" />
            <node concept="37vLTw" id="8a" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164650973" />
            </node>
            <node concept="liA8E" id="8b" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052164650973" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="6T" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164652625" />
          <node concept="3clFbS" id="8c" role="2LFqv$">
            <uo k="s:originTrace" v="n:8411917052164652625" />
            <node concept="3clFbF" id="8f" role="3cqZAp">
              <uo k="s:originTrace" v="n:8411917052164652625" />
              <node concept="2OqwBi" id="8g" role="3clFbG">
                <uo k="s:originTrace" v="n:8411917052164652625" />
                <node concept="37vLTw" id="8h" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Z" resolve="tgs" />
                  <uo k="s:originTrace" v="n:8411917052164652625" />
                </node>
                <node concept="liA8E" id="8i" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:8411917052164652625" />
                  <node concept="37vLTw" id="8j" role="37wK5m">
                    <ref role="3cqZAo" node="8d" resolve="item" />
                    <uo k="s:originTrace" v="n:8411917052164652625" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="8d" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:8411917052164652625" />
            <node concept="3Tqbb2" id="8k" role="1tU5fm">
              <uo k="s:originTrace" v="n:8411917052164652625" />
            </node>
          </node>
          <node concept="2OqwBi" id="8e" role="1DdaDG">
            <uo k="s:originTrace" v="n:8411917052164653245" />
            <node concept="2OqwBi" id="8l" role="2Oq$k0">
              <uo k="s:originTrace" v="n:8411917052164652630" />
              <node concept="37vLTw" id="8n" role="2Oq$k0">
                <ref role="3cqZAo" node="6D" resolve="ctx" />
              </node>
              <node concept="liA8E" id="8o" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="3Tsc0h" id="8m" role="2OqNvi">
              <ref role="3TtcxE" to="mmpm:2oBrHLm5DoC" resolve="universities" />
              <uo k="s:originTrace" v="n:8411917052164653805" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6U" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164653819" />
          <node concept="2OqwBi" id="8p" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164653819" />
            <node concept="37vLTw" id="8q" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164653819" />
            </node>
            <node concept="liA8E" id="8r" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052164653819" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="6V" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164930025" />
          <node concept="3clFbS" id="8s" role="2LFqv$">
            <uo k="s:originTrace" v="n:8411917052164930025" />
            <node concept="3clFbF" id="8v" role="3cqZAp">
              <uo k="s:originTrace" v="n:8411917052164930025" />
              <node concept="2OqwBi" id="8w" role="3clFbG">
                <uo k="s:originTrace" v="n:8411917052164930025" />
                <node concept="37vLTw" id="8x" role="2Oq$k0">
                  <ref role="3cqZAo" node="6Z" resolve="tgs" />
                  <uo k="s:originTrace" v="n:8411917052164930025" />
                </node>
                <node concept="liA8E" id="8y" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:8411917052164930025" />
                  <node concept="37vLTw" id="8z" role="37wK5m">
                    <ref role="3cqZAo" node="8t" resolve="item" />
                    <uo k="s:originTrace" v="n:8411917052164930025" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="8t" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:8411917052164930025" />
            <node concept="3Tqbb2" id="8$" role="1tU5fm">
              <uo k="s:originTrace" v="n:8411917052164930025" />
            </node>
          </node>
          <node concept="2OqwBi" id="8u" role="1DdaDG">
            <uo k="s:originTrace" v="n:8411917052164931739" />
            <node concept="2OqwBi" id="8_" role="2Oq$k0">
              <uo k="s:originTrace" v="n:8411917052164930030" />
              <node concept="37vLTw" id="8B" role="2Oq$k0">
                <ref role="3cqZAo" node="6D" resolve="ctx" />
              </node>
              <node concept="liA8E" id="8C" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="3Tsc0h" id="8A" role="2OqNvi">
              <ref role="3TtcxE" to="mmpm:2oBrHLm5DoL" resolve="associatePartner" />
              <uo k="s:originTrace" v="n:8411917052164932299" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6W" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164932313" />
          <node concept="2OqwBi" id="8D" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164932313" />
            <node concept="37vLTw" id="8E" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164932313" />
            </node>
            <node concept="liA8E" id="8F" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052164932313" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6X" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400727647473" />
          <node concept="2OqwBi" id="8G" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400727647473" />
            <node concept="37vLTw" id="8H" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400727647473" />
            </node>
            <node concept="liA8E" id="8I" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
              <uo k="s:originTrace" v="n:4676225400727647473" />
              <node concept="2OqwBi" id="8J" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400727648049" />
                <node concept="2OqwBi" id="8K" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400727647580" />
                  <node concept="37vLTw" id="8M" role="2Oq$k0">
                    <ref role="3cqZAo" node="6D" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="8N" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrEf2" id="8L" role="2OqNvi">
                  <ref role="3Tt5mk" to="mmpm:7iX8vQtZRjl" resolve="admissionStructure" />
                  <uo k="s:originTrace" v="n:4676225400727648632" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6Y" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400727648947" />
          <node concept="2OqwBi" id="8O" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400727648947" />
            <node concept="37vLTw" id="8P" role="2Oq$k0">
              <ref role="3cqZAo" node="6Z" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400727648947" />
            </node>
            <node concept="liA8E" id="8Q" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400727648947" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="6D" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:8411917052161291951" />
        <node concept="3uibUv" id="8R" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:8411917052161291951" />
        </node>
      </node>
      <node concept="2AHcQZ" id="6E" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8411917052161291951" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="8S">
    <node concept="39e2AJ" id="8T" role="39e2AI">
      <property role="39e3Y2" value="GetExtension" />
      <node concept="39e2AG" id="8X" role="39e3Y0">
        <ref role="39e2AK" to="ycca:7iX8vQu7ZqJ" resolve="ErasmusProgram_TextGen" />
        <node concept="385nmt" id="8Y" role="385vvn">
          <property role="385vuF" value="ErasmusProgram_TextGen" />
          <node concept="3u3nmq" id="90" role="385v07">
            <property role="3u3nmv" value="8411917052161291951" />
          </node>
        </node>
        <node concept="39e2AT" id="8Z" role="39e2AY">
          <ref role="39e2AS" node="hx" resolve="getFileExtension_ErasmusProgram" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="8U" role="39e2AI">
      <property role="39e3Y2" value="GetFilename" />
      <node concept="39e2AG" id="91" role="39e3Y0">
        <ref role="39e2AK" to="ycca:7iX8vQu7ZqJ" resolve="ErasmusProgram_TextGen" />
        <node concept="385nmt" id="92" role="385vvn">
          <property role="385vuF" value="ErasmusProgram_TextGen" />
          <node concept="3u3nmq" id="94" role="385v07">
            <property role="3u3nmv" value="8411917052161291951" />
          </node>
        </node>
        <node concept="39e2AT" id="93" role="39e2AY">
          <ref role="39e2AS" node="hw" resolve="getFileName_ErasmusProgram" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="8V" role="39e2AI">
      <property role="39e3Y2" value="TextGenClass" />
      <node concept="39e2AG" id="95" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSoLd" resolve="AdmissionStructure_TextGen" />
        <node concept="385nmt" id="9j" role="385vvn">
          <property role="385vuF" value="AdmissionStructure_TextGen" />
          <node concept="3u3nmq" id="9l" role="385v07">
            <property role="3u3nmv" value="4676225400725146701" />
          </node>
        </node>
        <node concept="39e2AT" id="9k" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="AdmissionStructure_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="96" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSsb_" resolve="ApplicationProcess_TextGen" />
        <node concept="385nmt" id="9m" role="385vvn">
          <property role="385vuF" value="ApplicationProcess_TextGen" />
          <node concept="3u3nmq" id="9o" role="385v07">
            <property role="3u3nmv" value="4676225400725160677" />
          </node>
        </node>
        <node concept="39e2AT" id="9n" role="39e2AY">
          <ref role="39e2AS" node="17" resolve="ApplicationProcess_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="97" role="39e3Y0">
        <ref role="39e2AK" to="ycca:7iX8vQulQQX" resolve="AssociatePartner_TextGen" />
        <node concept="385nmt" id="9p" role="385vvn">
          <property role="385vuF" value="AssociatePartner_TextGen" />
          <node concept="3u3nmq" id="9r" role="385v07">
            <property role="3u3nmv" value="8411917052164926909" />
          </node>
        </node>
        <node concept="39e2AT" id="9q" role="39e2AY">
          <ref role="39e2AS" node="1D" resolve="AssociatePartner_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="98" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSlht" resolve="Course_TextGen" />
        <node concept="385nmt" id="9s" role="385vvn">
          <property role="385vuF" value="Course_TextGen" />
          <node concept="3u3nmq" id="9u" role="385v07">
            <property role="3u3nmv" value="4676225400725132381" />
          </node>
        </node>
        <node concept="39e2AT" id="9t" role="39e2AY">
          <ref role="39e2AS" node="2H" resolve="Course_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="99" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSxqR" resolve="DegreeRequirement_TextGen" />
        <node concept="385nmt" id="9v" role="385vvn">
          <property role="385vuF" value="DegreeRequirement_TextGen" />
          <node concept="3u3nmq" id="9x" role="385v07">
            <property role="3u3nmv" value="4676225400725182135" />
          </node>
        </node>
        <node concept="39e2AT" id="9w" role="39e2AY">
          <ref role="39e2AS" node="4d" resolve="DegreeRequirement_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9a" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSw49" resolve="DocumentRequirement_TextGen" />
        <node concept="385nmt" id="9y" role="385vvn">
          <property role="385vuF" value="DocumentRequirement_TextGen" />
          <node concept="3u3nmq" id="9$" role="385v07">
            <property role="3u3nmv" value="4676225400725176585" />
          </node>
        </node>
        <node concept="39e2AT" id="9z" role="39e2AY">
          <ref role="39e2AS" node="5v" resolve="DocumentRequirement_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9b" role="39e3Y0">
        <ref role="39e2AK" to="ycca:7iX8vQu7ZqJ" resolve="ErasmusProgram_TextGen" />
        <node concept="385nmt" id="9_" role="385vvn">
          <property role="385vuF" value="ErasmusProgram_TextGen" />
          <node concept="3u3nmq" id="9B" role="385v07">
            <property role="3u3nmv" value="8411917052161291951" />
          </node>
        </node>
        <node concept="39e2AT" id="9A" role="39e2AY">
          <ref role="39e2AS" node="6y" resolve="ErasmusProgram_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9c" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSuGB" resolve="LanguageRequirement_TextGen" />
        <node concept="385nmt" id="9C" role="385vvn">
          <property role="385vuF" value="LanguageRequirement_TextGen" />
          <node concept="3u3nmq" id="9E" role="385v07">
            <property role="3u3nmv" value="4676225400725170983" />
          </node>
        </node>
        <node concept="39e2AT" id="9D" role="39e2AY">
          <ref role="39e2AS" node="9Z" resolve="LanguageRequirement_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9d" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSmuR" resolve="Location_TextGen" />
        <node concept="385nmt" id="9F" role="385vvn">
          <property role="385vuF" value="Location_TextGen" />
          <node concept="3u3nmq" id="9H" role="385v07">
            <property role="3u3nmv" value="4676225400725137335" />
          </node>
        </node>
        <node concept="39e2AT" id="9G" role="39e2AY">
          <ref role="39e2AS" node="b3" resolve="Location_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9e" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSuuP" resolve="Requirement_TextGen" />
        <node concept="385nmt" id="9I" role="385vvn">
          <property role="385vuF" value="Requirement_TextGen" />
          <node concept="3u3nmq" id="9K" role="385v07">
            <property role="3u3nmv" value="4676225400725170101" />
          </node>
        </node>
        <node concept="39e2AT" id="9J" role="39e2AY">
          <ref role="39e2AS" node="c6" resolve="Requirement_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9f" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSpb9" resolve="Results_TextGen" />
        <node concept="385nmt" id="9L" role="385vvn">
          <property role="385vuF" value="Results_TextGen" />
          <node concept="3u3nmq" id="9N" role="385v07">
            <property role="3u3nmv" value="4676225400725148361" />
          </node>
        </node>
        <node concept="39e2AT" id="9M" role="39e2AY">
          <ref role="39e2AS" node="c$" resolve="Results_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9g" role="39e3Y0">
        <ref role="39e2AK" to="ycca:7iX8vQudwUW" resolve="Scholarship_TextGen" />
        <node concept="385nmt" id="9O" role="385vvn">
          <property role="385vuF" value="Scholarship_TextGen" />
          <node concept="3u3nmq" id="9Q" role="385v07">
            <property role="3u3nmv" value="8411917052162739900" />
          </node>
        </node>
        <node concept="39e2AT" id="9P" role="39e2AY">
          <ref role="39e2AS" node="e6" resolve="Scholarship_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9h" role="39e3Y0">
        <ref role="39e2AK" to="ycca:43_izBFSsnd" resolve="Step_TextGen" />
        <node concept="385nmt" id="9R" role="385vvn">
          <property role="385vuF" value="Step_TextGen" />
          <node concept="3u3nmq" id="9T" role="385v07">
            <property role="3u3nmv" value="4676225400725161421" />
          </node>
        </node>
        <node concept="39e2AT" id="9S" role="39e2AY">
          <ref role="39e2AS" node="fR" resolve="Step_TextGen" />
        </node>
      </node>
      <node concept="39e2AG" id="9i" role="39e3Y0">
        <ref role="39e2AK" to="ycca:7iX8vQukNvx" resolve="University_TextGen" />
        <node concept="385nmt" id="9U" role="385vvn">
          <property role="385vuF" value="University_TextGen" />
          <node concept="3u3nmq" id="9W" role="385v07">
            <property role="3u3nmv" value="8411917052164650977" />
          </node>
        </node>
        <node concept="39e2AT" id="9V" role="39e2AY">
          <ref role="39e2AS" node="kg" resolve="University_TextGen" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="8W" role="39e2AI">
      <property role="39e3Y2" value="TextGenAspectDescriptorCons" />
      <node concept="39e2AG" id="9X" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="9Y" role="39e2AY">
          <ref role="39e2AS" node="hp" resolve="TextGenAspectDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="9Z">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="LanguageRequirement_TextGen" />
    <property role="3GE5qa" value="Requirement" />
    <uo k="s:originTrace" v="n:4676225400725170983" />
    <node concept="3Tm1VV" id="a0" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725170983" />
    </node>
    <node concept="3uibUv" id="a1" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725170983" />
    </node>
    <node concept="3clFb_" id="a2" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725170983" />
      <node concept="3cqZAl" id="a3" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725170983" />
      </node>
      <node concept="3Tm1VV" id="a4" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725170983" />
      </node>
      <node concept="3clFbS" id="a5" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725170983" />
        <node concept="3cpWs8" id="a8" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725170983" />
          <node concept="3cpWsn" id="ai" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725170983" />
            <node concept="3uibUv" id="aj" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725170983" />
            </node>
            <node concept="2ShNRf" id="ak" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725170983" />
              <node concept="1pGfFk" id="al" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725170983" />
                <node concept="37vLTw" id="am" role="37wK5m">
                  <ref role="3cqZAo" node="a6" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725170983" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="a9" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171016" />
          <node concept="2OqwBi" id="an" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171016" />
            <node concept="37vLTw" id="ao" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171016" />
            </node>
            <node concept="liA8E" id="ap" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725171016" />
              <node concept="Xl_RD" id="aq" role="37wK5m">
                <property role="Xl_RC" value="--insert values into language requirements table" />
                <uo k="s:originTrace" v="n:4676225400725171016" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="aa" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171017" />
          <node concept="2OqwBi" id="ar" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171017" />
            <node concept="37vLTw" id="as" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171017" />
            </node>
            <node concept="liA8E" id="at" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725171017" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ab" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171164" />
          <node concept="2OqwBi" id="au" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171164" />
            <node concept="37vLTw" id="av" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171164" />
            </node>
            <node concept="liA8E" id="aw" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725171164" />
              <node concept="Xl_RD" id="ax" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO language (name, level) " />
                <uo k="s:originTrace" v="n:4676225400725171164" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ac" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171308" />
          <node concept="2OqwBi" id="ay" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171308" />
            <node concept="37vLTw" id="az" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171308" />
            </node>
            <node concept="liA8E" id="a$" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725171308" />
              <node concept="Xl_RD" id="a_" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:4676225400725171308" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ad" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171309" />
          <node concept="2OqwBi" id="aA" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171309" />
            <node concept="37vLTw" id="aB" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171309" />
            </node>
            <node concept="liA8E" id="aC" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725171309" />
              <node concept="2OqwBi" id="aD" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725173864" />
                <node concept="2OqwBi" id="aE" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725173373" />
                  <node concept="37vLTw" id="aG" role="2Oq$k0">
                    <ref role="3cqZAo" node="a6" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="aH" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="aF" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  <uo k="s:originTrace" v="n:4676225400725174537" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ae" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171314" />
          <node concept="2OqwBi" id="aI" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171314" />
            <node concept="37vLTw" id="aJ" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171314" />
            </node>
            <node concept="liA8E" id="aK" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725171314" />
              <node concept="Xl_RD" id="aL" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725171314" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="af" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171315" />
          <node concept="2OqwBi" id="aM" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171315" />
            <node concept="37vLTw" id="aN" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171315" />
            </node>
            <node concept="liA8E" id="aO" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725171315" />
              <node concept="2YIFZM" id="aP" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~String.valueOf(java.lang.Object)" resolve="valueOf" />
                <ref role="1Pybhc" to="wyt6:~String" resolve="String" />
                <uo k="s:originTrace" v="n:4676225400725174885" />
                <node concept="2OqwBi" id="aQ" role="37wK5m">
                  <uo k="s:originTrace" v="n:4676225400725175679" />
                  <node concept="2OqwBi" id="aR" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:4676225400725174939" />
                    <node concept="37vLTw" id="aT" role="2Oq$k0">
                      <ref role="3cqZAo" node="a6" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="aU" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="aS" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5Dn$" resolve="level" />
                    <uo k="s:originTrace" v="n:4676225400725175884" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ag" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171325" />
          <node concept="2OqwBi" id="aV" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171325" />
            <node concept="37vLTw" id="aW" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171325" />
            </node>
            <node concept="liA8E" id="aX" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725171325" />
              <node concept="Xl_RD" id="aY" role="37wK5m">
                <property role="Xl_RC" value="&quot;);" />
                <uo k="s:originTrace" v="n:4676225400725171325" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ah" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725171326" />
          <node concept="2OqwBi" id="aZ" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725171326" />
            <node concept="37vLTw" id="b0" role="2Oq$k0">
              <ref role="3cqZAo" node="ai" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725171326" />
            </node>
            <node concept="liA8E" id="b1" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725171326" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="a6" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725170983" />
        <node concept="3uibUv" id="b2" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725170983" />
        </node>
      </node>
      <node concept="2AHcQZ" id="a7" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725170983" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="b3">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="Location_TextGen" />
    <property role="3GE5qa" value="University" />
    <uo k="s:originTrace" v="n:4676225400725137335" />
    <node concept="3Tm1VV" id="b4" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725137335" />
    </node>
    <node concept="3uibUv" id="b5" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725137335" />
    </node>
    <node concept="3clFb_" id="b6" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725137335" />
      <node concept="3cqZAl" id="b7" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725137335" />
      </node>
      <node concept="3Tm1VV" id="b8" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725137335" />
      </node>
      <node concept="3clFbS" id="b9" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725137335" />
        <node concept="3cpWs8" id="bc" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725137335" />
          <node concept="3cpWsn" id="bm" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725137335" />
            <node concept="3uibUv" id="bn" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725137335" />
            </node>
            <node concept="2ShNRf" id="bo" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725137335" />
              <node concept="1pGfFk" id="bp" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725137335" />
                <node concept="37vLTw" id="bq" role="37wK5m">
                  <ref role="3cqZAo" node="ba" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725137335" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bd" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725137365" />
          <node concept="2OqwBi" id="br" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725137365" />
            <node concept="37vLTw" id="bs" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725137365" />
            </node>
            <node concept="liA8E" id="bt" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725137365" />
              <node concept="Xl_RD" id="bu" role="37wK5m">
                <property role="Xl_RC" value="--insert values into location table" />
                <uo k="s:originTrace" v="n:4676225400725137365" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="be" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725137366" />
          <node concept="2OqwBi" id="bv" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725137366" />
            <node concept="37vLTw" id="bw" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725137366" />
            </node>
            <node concept="liA8E" id="bx" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725137366" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bf" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725138555" />
          <node concept="2OqwBi" id="by" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725138555" />
            <node concept="37vLTw" id="bz" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725138555" />
            </node>
            <node concept="liA8E" id="b$" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725138555" />
              <node concept="Xl_RD" id="b_" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO location (country_name, city_name) " />
                <uo k="s:originTrace" v="n:4676225400725138555" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bg" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725138857" />
          <node concept="2OqwBi" id="bA" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725138857" />
            <node concept="37vLTw" id="bB" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725138857" />
            </node>
            <node concept="liA8E" id="bC" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725138857" />
              <node concept="Xl_RD" id="bD" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:4676225400725138857" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bh" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725138858" />
          <node concept="2OqwBi" id="bE" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725138858" />
            <node concept="37vLTw" id="bF" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725138858" />
            </node>
            <node concept="liA8E" id="bG" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725138858" />
              <node concept="2OqwBi" id="bH" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725138859" />
                <node concept="2OqwBi" id="bI" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725138860" />
                  <node concept="37vLTw" id="bK" role="2Oq$k0">
                    <ref role="3cqZAo" node="ba" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="bL" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="bJ" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5AT6" resolve="countryName" />
                  <uo k="s:originTrace" v="n:4676225400725140031" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bi" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725138862" />
          <node concept="2OqwBi" id="bM" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725138862" />
            <node concept="37vLTw" id="bN" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725138862" />
            </node>
            <node concept="liA8E" id="bO" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725138862" />
              <node concept="Xl_RD" id="bP" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725138862" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bj" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725138863" />
          <node concept="2OqwBi" id="bQ" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725138863" />
            <node concept="37vLTw" id="bR" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725138863" />
            </node>
            <node concept="liA8E" id="bS" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725138863" />
              <node concept="2OqwBi" id="bT" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725141744" />
                <node concept="2OqwBi" id="bU" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725141337" />
                  <node concept="37vLTw" id="bW" role="2Oq$k0">
                    <ref role="3cqZAo" node="ba" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="bX" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="bV" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5AT8" resolve="cityName" />
                  <uo k="s:originTrace" v="n:4676225400725141823" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bk" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725138868" />
          <node concept="2OqwBi" id="bY" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725138868" />
            <node concept="37vLTw" id="bZ" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725138868" />
            </node>
            <node concept="liA8E" id="c0" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725138868" />
              <node concept="Xl_RD" id="c1" role="37wK5m">
                <property role="Xl_RC" value="&quot;);" />
                <uo k="s:originTrace" v="n:4676225400725138868" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bl" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725138869" />
          <node concept="2OqwBi" id="c2" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725138869" />
            <node concept="37vLTw" id="c3" role="2Oq$k0">
              <ref role="3cqZAo" node="bm" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725138869" />
            </node>
            <node concept="liA8E" id="c4" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725138869" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="ba" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725137335" />
        <node concept="3uibUv" id="c5" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725137335" />
        </node>
      </node>
      <node concept="2AHcQZ" id="bb" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725137335" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="c6">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="Requirement_TextGen" />
    <property role="3GE5qa" value="Requirement" />
    <uo k="s:originTrace" v="n:4676225400725170101" />
    <node concept="3Tm1VV" id="c7" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725170101" />
    </node>
    <node concept="3uibUv" id="c8" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725170101" />
    </node>
    <node concept="3clFb_" id="c9" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725170101" />
      <node concept="3cqZAl" id="ca" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725170101" />
      </node>
      <node concept="3Tm1VV" id="cb" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725170101" />
      </node>
      <node concept="3clFbS" id="cc" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725170101" />
        <node concept="3cpWs8" id="cf" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725170101" />
          <node concept="3cpWsn" id="ch" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725170101" />
            <node concept="3uibUv" id="ci" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725170101" />
            </node>
            <node concept="2ShNRf" id="cj" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725170101" />
              <node concept="1pGfFk" id="ck" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725170101" />
                <node concept="37vLTw" id="cl" role="37wK5m">
                  <ref role="3cqZAo" node="cd" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725170101" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="cg" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725170129" />
          <node concept="3clFbS" id="cm" role="2LFqv$">
            <uo k="s:originTrace" v="n:4676225400725170129" />
            <node concept="3clFbF" id="cp" role="3cqZAp">
              <uo k="s:originTrace" v="n:4676225400725170129" />
              <node concept="2OqwBi" id="cq" role="3clFbG">
                <uo k="s:originTrace" v="n:4676225400725170129" />
                <node concept="37vLTw" id="cr" role="2Oq$k0">
                  <ref role="3cqZAo" node="ch" resolve="tgs" />
                  <uo k="s:originTrace" v="n:4676225400725170129" />
                </node>
                <node concept="liA8E" id="cs" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:4676225400725170129" />
                  <node concept="37vLTw" id="ct" role="37wK5m">
                    <ref role="3cqZAo" node="cn" resolve="item" />
                    <uo k="s:originTrace" v="n:4676225400725170129" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="cn" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:4676225400725170129" />
            <node concept="3Tqbb2" id="cu" role="1tU5fm">
              <uo k="s:originTrace" v="n:4676225400725170129" />
            </node>
          </node>
          <node concept="2OqwBi" id="co" role="1DdaDG">
            <uo k="s:originTrace" v="n:4676225400725170130" />
            <node concept="2OqwBi" id="cv" role="2Oq$k0">
              <uo k="s:originTrace" v="n:4676225400725170131" />
              <node concept="37vLTw" id="cx" role="2Oq$k0">
                <ref role="3cqZAo" node="cd" resolve="ctx" />
              </node>
              <node concept="liA8E" id="cy" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="32TBzR" id="cw" role="2OqNvi">
              <uo k="s:originTrace" v="n:4676225400725170928" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="cd" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725170101" />
        <node concept="3uibUv" id="cz" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725170101" />
        </node>
      </node>
      <node concept="2AHcQZ" id="ce" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725170101" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="c$">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="Results_TextGen" />
    <property role="3GE5qa" value="AdmissionStructure" />
    <uo k="s:originTrace" v="n:4676225400725148361" />
    <node concept="3Tm1VV" id="c_" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725148361" />
    </node>
    <node concept="3uibUv" id="cA" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725148361" />
    </node>
    <node concept="3clFb_" id="cB" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725148361" />
      <node concept="3cqZAl" id="cC" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725148361" />
      </node>
      <node concept="3Tm1VV" id="cD" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725148361" />
      </node>
      <node concept="3clFbS" id="cE" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725148361" />
        <node concept="3cpWs8" id="cH" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148361" />
          <node concept="3cpWsn" id="cV" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725148361" />
            <node concept="3uibUv" id="cW" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725148361" />
            </node>
            <node concept="2ShNRf" id="cX" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725148361" />
              <node concept="1pGfFk" id="cY" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725148361" />
                <node concept="37vLTw" id="cZ" role="37wK5m">
                  <ref role="3cqZAo" node="cF" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725148361" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cI" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148393" />
          <node concept="2OqwBi" id="d0" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148393" />
            <node concept="37vLTw" id="d1" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148393" />
            </node>
            <node concept="liA8E" id="d2" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725148393" />
              <node concept="Xl_RD" id="d3" role="37wK5m">
                <property role="Xl_RC" value="--insert values into results table" />
                <uo k="s:originTrace" v="n:4676225400725148393" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cJ" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148394" />
          <node concept="2OqwBi" id="d4" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148394" />
            <node concept="37vLTw" id="d5" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148394" />
            </node>
            <node concept="liA8E" id="d6" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725148394" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cK" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148472" />
          <node concept="2OqwBi" id="d7" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148472" />
            <node concept="37vLTw" id="d8" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148472" />
            </node>
            <node concept="liA8E" id="d9" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725148472" />
              <node concept="Xl_RD" id="da" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO result (year, total_admitted, scholarships_awarded, admitted_students) " />
                <uo k="s:originTrace" v="n:4676225400725148472" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cL" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148873" />
          <node concept="2OqwBi" id="db" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148873" />
            <node concept="37vLTw" id="dc" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148873" />
            </node>
            <node concept="liA8E" id="dd" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725148873" />
              <node concept="Xl_RD" id="de" role="37wK5m">
                <property role="Xl_RC" value="VALUES (" />
                <uo k="s:originTrace" v="n:4676225400725148873" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cM" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148874" />
          <node concept="2OqwBi" id="df" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148874" />
            <node concept="37vLTw" id="dg" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148874" />
            </node>
            <node concept="liA8E" id="dh" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725148874" />
              <node concept="2YIFZM" id="di" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:4676225400725148875" />
                <node concept="2OqwBi" id="dj" role="37wK5m">
                  <uo k="s:originTrace" v="n:4676225400725148876" />
                  <node concept="2OqwBi" id="dk" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:4676225400725148877" />
                    <node concept="37vLTw" id="dm" role="2Oq$k0">
                      <ref role="3cqZAo" node="cF" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="dn" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="dl" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ATp" resolve="year" />
                    <uo k="s:originTrace" v="n:4676225400725151150" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cN" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148879" />
          <node concept="2OqwBi" id="do" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148879" />
            <node concept="37vLTw" id="dp" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148879" />
            </node>
            <node concept="liA8E" id="dq" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725148879" />
              <node concept="Xl_RD" id="dr" role="37wK5m">
                <property role="Xl_RC" value="," />
                <uo k="s:originTrace" v="n:4676225400725148879" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cO" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725151383" />
          <node concept="2OqwBi" id="ds" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725151383" />
            <node concept="37vLTw" id="dt" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725151383" />
            </node>
            <node concept="liA8E" id="du" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725151383" />
              <node concept="2YIFZM" id="dv" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:4676225400725151627" />
                <node concept="2OqwBi" id="dw" role="37wK5m">
                  <uo k="s:originTrace" v="n:4676225400725152563" />
                  <node concept="2OqwBi" id="dx" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:4676225400725151679" />
                    <node concept="37vLTw" id="dz" role="2Oq$k0">
                      <ref role="3cqZAo" node="cF" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="d$" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="dy" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ATr" resolve="totalAdmitted" />
                    <uo k="s:originTrace" v="n:4676225400725152648" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cP" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725152874" />
          <node concept="2OqwBi" id="d_" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725152874" />
            <node concept="37vLTw" id="dA" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725152874" />
            </node>
            <node concept="liA8E" id="dB" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725152874" />
              <node concept="Xl_RD" id="dC" role="37wK5m">
                <property role="Xl_RC" value="," />
                <uo k="s:originTrace" v="n:4676225400725152874" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cQ" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725153230" />
          <node concept="2OqwBi" id="dD" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725153230" />
            <node concept="37vLTw" id="dE" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725153230" />
            </node>
            <node concept="liA8E" id="dF" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725153230" />
              <node concept="2YIFZM" id="dG" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:4676225400725153517" />
                <node concept="2OqwBi" id="dH" role="37wK5m">
                  <uo k="s:originTrace" v="n:4676225400725155622" />
                  <node concept="2OqwBi" id="dI" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:4676225400725154341" />
                    <node concept="37vLTw" id="dK" role="2Oq$k0">
                      <ref role="3cqZAo" node="cF" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="dL" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="dJ" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ATv" resolve="scholarshipsAwarded" />
                    <uo k="s:originTrace" v="n:4676225400725156641" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cR" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148884" />
          <node concept="2OqwBi" id="dM" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148884" />
            <node concept="37vLTw" id="dN" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148884" />
            </node>
            <node concept="liA8E" id="dO" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725148884" />
              <node concept="Xl_RD" id="dP" role="37wK5m">
                <property role="Xl_RC" value=",&quot;" />
                <uo k="s:originTrace" v="n:4676225400725148884" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cS" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148885" />
          <node concept="2OqwBi" id="dQ" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148885" />
            <node concept="37vLTw" id="dR" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148885" />
            </node>
            <node concept="liA8E" id="dS" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725148885" />
              <node concept="2OqwBi" id="dT" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725159985" />
                <node concept="2OqwBi" id="dU" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725159566" />
                  <node concept="37vLTw" id="dW" role="2Oq$k0">
                    <ref role="3cqZAo" node="cF" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="dX" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="dV" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ATz" resolve="admittedStudents" />
                  <uo k="s:originTrace" v="n:4676225400725160476" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cT" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148890" />
          <node concept="2OqwBi" id="dY" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148890" />
            <node concept="37vLTw" id="dZ" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148890" />
            </node>
            <node concept="liA8E" id="e0" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725148890" />
              <node concept="Xl_RD" id="e1" role="37wK5m">
                <property role="Xl_RC" value="&quot;);" />
                <uo k="s:originTrace" v="n:4676225400725148890" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="cU" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725148891" />
          <node concept="2OqwBi" id="e2" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725148891" />
            <node concept="37vLTw" id="e3" role="2Oq$k0">
              <ref role="3cqZAo" node="cV" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725148891" />
            </node>
            <node concept="liA8E" id="e4" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725148891" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="cF" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725148361" />
        <node concept="3uibUv" id="e5" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725148361" />
        </node>
      </node>
      <node concept="2AHcQZ" id="cG" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725148361" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="e6">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="Scholarship_TextGen" />
    <uo k="s:originTrace" v="n:8411917052162739900" />
    <node concept="3Tm1VV" id="e7" role="1B3o_S">
      <uo k="s:originTrace" v="n:8411917052162739900" />
    </node>
    <node concept="3uibUv" id="e8" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:8411917052162739900" />
    </node>
    <node concept="3clFb_" id="e9" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:8411917052162739900" />
      <node concept="3cqZAl" id="ea" role="3clF45">
        <uo k="s:originTrace" v="n:8411917052162739900" />
      </node>
      <node concept="3Tm1VV" id="eb" role="1B3o_S">
        <uo k="s:originTrace" v="n:8411917052162739900" />
      </node>
      <node concept="3clFbS" id="ec" role="3clF47">
        <uo k="s:originTrace" v="n:8411917052162739900" />
        <node concept="3cpWs8" id="ef" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052162739900" />
          <node concept="3cpWsn" id="ev" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:8411917052162739900" />
            <node concept="3uibUv" id="ew" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:8411917052162739900" />
            </node>
            <node concept="2ShNRf" id="ex" role="33vP2m">
              <uo k="s:originTrace" v="n:8411917052162739900" />
              <node concept="1pGfFk" id="ey" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:8411917052162739900" />
                <node concept="37vLTw" id="ez" role="37wK5m">
                  <ref role="3cqZAo" node="ed" resolve="ctx" />
                  <uo k="s:originTrace" v="n:8411917052162739900" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eg" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163808923" />
          <node concept="2OqwBi" id="e$" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163808923" />
            <node concept="37vLTw" id="e_" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163808923" />
            </node>
            <node concept="liA8E" id="eA" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163808923" />
              <node concept="Xl_RD" id="eB" role="37wK5m">
                <property role="Xl_RC" value="--insert values into scholarships table" />
                <uo k="s:originTrace" v="n:8411917052163808923" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eh" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164125481" />
          <node concept="2OqwBi" id="eC" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164125481" />
            <node concept="37vLTw" id="eD" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164125481" />
            </node>
            <node concept="liA8E" id="eE" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052164125481" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ei" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163808942" />
          <node concept="2OqwBi" id="eF" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163808942" />
            <node concept="37vLTw" id="eG" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163808942" />
            </node>
            <node concept="liA8E" id="eH" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163808942" />
              <node concept="Xl_RD" id="eI" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO scholarship (name, type, tuition_fee, travel_grant, allowance) " />
                <uo k="s:originTrace" v="n:8411917052163808942" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ej" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163808951" />
          <node concept="2OqwBi" id="eJ" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163808951" />
            <node concept="37vLTw" id="eK" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163808951" />
            </node>
            <node concept="liA8E" id="eL" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163808951" />
              <node concept="Xl_RD" id="eM" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:8411917052163808951" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ek" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163816408" />
          <node concept="2OqwBi" id="eN" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163816408" />
            <node concept="37vLTw" id="eO" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163816408" />
            </node>
            <node concept="liA8E" id="eP" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163816408" />
              <node concept="2OqwBi" id="eQ" role="37wK5m">
                <uo k="s:originTrace" v="n:8411917052163816882" />
                <node concept="2OqwBi" id="eR" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:8411917052163816413" />
                  <node concept="37vLTw" id="eT" role="2Oq$k0">
                    <ref role="3cqZAo" node="ed" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="eU" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="eS" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  <uo k="s:originTrace" v="n:8411917052163817556" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="el" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164515367" />
          <node concept="2OqwBi" id="eV" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164515367" />
            <node concept="37vLTw" id="eW" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164515367" />
            </node>
            <node concept="liA8E" id="eX" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164515367" />
              <node concept="Xl_RD" id="eY" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:8411917052164515367" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="em" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163817586" />
          <node concept="2OqwBi" id="eZ" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163817586" />
            <node concept="37vLTw" id="f0" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163817586" />
            </node>
            <node concept="liA8E" id="f1" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163817586" />
              <node concept="2YIFZM" id="f2" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~String.valueOf(java.lang.Object)" resolve="valueOf" />
                <ref role="1Pybhc" to="wyt6:~String" resolve="String" />
                <uo k="s:originTrace" v="n:8411917052163817609" />
                <node concept="2OqwBi" id="f3" role="37wK5m">
                  <uo k="s:originTrace" v="n:8411917052163818018" />
                  <node concept="2OqwBi" id="f4" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:8411917052163817611" />
                    <node concept="37vLTw" id="f6" role="2Oq$k0">
                      <ref role="3cqZAo" node="ed" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="f7" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="f5" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5AS2" resolve="type" />
                    <uo k="s:originTrace" v="n:8411917052163818708" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="en" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164515372" />
          <node concept="2OqwBi" id="f8" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164515372" />
            <node concept="37vLTw" id="f9" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164515372" />
            </node>
            <node concept="liA8E" id="fa" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164515372" />
              <node concept="Xl_RD" id="fb" role="37wK5m">
                <property role="Xl_RC" value="&quot;," />
                <uo k="s:originTrace" v="n:8411917052164515372" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eo" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163818713" />
          <node concept="2OqwBi" id="fc" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163818713" />
            <node concept="37vLTw" id="fd" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163818713" />
            </node>
            <node concept="liA8E" id="fe" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163818713" />
              <node concept="2YIFZM" id="ff" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:8411917052164379377" />
                <node concept="2OqwBi" id="fg" role="37wK5m">
                  <uo k="s:originTrace" v="n:8411917052164380040" />
                  <node concept="2OqwBi" id="fh" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:8411917052164379379" />
                    <node concept="37vLTw" id="fj" role="2Oq$k0">
                      <ref role="3cqZAo" node="ed" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="fk" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="fi" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ASv" resolve="tuitionFee" />
                    <uo k="s:originTrace" v="n:8411917052164380716" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ep" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164515377" />
          <node concept="2OqwBi" id="fl" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164515377" />
            <node concept="37vLTw" id="fm" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164515377" />
            </node>
            <node concept="liA8E" id="fn" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164515377" />
              <node concept="Xl_RD" id="fo" role="37wK5m">
                <property role="Xl_RC" value="," />
                <uo k="s:originTrace" v="n:8411917052164515377" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eq" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163820934" />
          <node concept="2OqwBi" id="fp" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163820934" />
            <node concept="37vLTw" id="fq" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163820934" />
            </node>
            <node concept="liA8E" id="fr" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163820934" />
              <node concept="2YIFZM" id="fs" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:8411917052164357043" />
                <node concept="2OqwBi" id="ft" role="37wK5m">
                  <uo k="s:originTrace" v="n:8411917052164358221" />
                  <node concept="2OqwBi" id="fu" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:8411917052164357045" />
                    <node concept="37vLTw" id="fw" role="2Oq$k0">
                      <ref role="3cqZAo" node="ed" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="fx" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="fv" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5AS$" resolve="travelGrant" />
                    <uo k="s:originTrace" v="n:8411917052164358786" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="er" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164790288" />
          <node concept="2OqwBi" id="fy" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164790288" />
            <node concept="37vLTw" id="fz" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164790288" />
            </node>
            <node concept="liA8E" id="f$" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164790288" />
              <node concept="Xl_RD" id="f_" role="37wK5m">
                <property role="Xl_RC" value="," />
                <uo k="s:originTrace" v="n:8411917052164790288" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="es" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164790293" />
          <node concept="2OqwBi" id="fA" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164790293" />
            <node concept="37vLTw" id="fB" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164790293" />
            </node>
            <node concept="liA8E" id="fC" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164790293" />
              <node concept="2YIFZM" id="fD" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:8411917052164790327" />
                <node concept="2OqwBi" id="fE" role="37wK5m">
                  <uo k="s:originTrace" v="n:8411917052164791195" />
                  <node concept="2OqwBi" id="fF" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:8411917052164790329" />
                    <node concept="37vLTw" id="fH" role="2Oq$k0">
                      <ref role="3cqZAo" node="ed" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="fI" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="fG" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ASC" resolve="allowance" />
                    <uo k="s:originTrace" v="n:8411917052164791797" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="et" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052163808968" />
          <node concept="2OqwBi" id="fJ" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052163808968" />
            <node concept="37vLTw" id="fK" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052163808968" />
            </node>
            <node concept="liA8E" id="fL" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052163808968" />
              <node concept="Xl_RD" id="fM" role="37wK5m">
                <property role="Xl_RC" value=");" />
                <uo k="s:originTrace" v="n:8411917052163808968" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eu" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400728413880" />
          <node concept="2OqwBi" id="fN" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400728413880" />
            <node concept="37vLTw" id="fO" role="2Oq$k0">
              <ref role="3cqZAo" node="ev" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400728413880" />
            </node>
            <node concept="liA8E" id="fP" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400728413880" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="ed" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:8411917052162739900" />
        <node concept="3uibUv" id="fQ" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:8411917052162739900" />
        </node>
      </node>
      <node concept="2AHcQZ" id="ee" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8411917052162739900" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="fR">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="Step_TextGen" />
    <property role="3GE5qa" value="AdmissionStructure" />
    <uo k="s:originTrace" v="n:4676225400725161421" />
    <node concept="3Tm1VV" id="fS" role="1B3o_S">
      <uo k="s:originTrace" v="n:4676225400725161421" />
    </node>
    <node concept="3uibUv" id="fT" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:4676225400725161421" />
    </node>
    <node concept="3clFb_" id="fU" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:4676225400725161421" />
      <node concept="3cqZAl" id="fV" role="3clF45">
        <uo k="s:originTrace" v="n:4676225400725161421" />
      </node>
      <node concept="3Tm1VV" id="fW" role="1B3o_S">
        <uo k="s:originTrace" v="n:4676225400725161421" />
      </node>
      <node concept="3clFbS" id="fX" role="3clF47">
        <uo k="s:originTrace" v="n:4676225400725161421" />
        <node concept="3cpWs8" id="g0" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725161421" />
          <node concept="3cpWsn" id="ge" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:4676225400725161421" />
            <node concept="3uibUv" id="gf" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:4676225400725161421" />
            </node>
            <node concept="2ShNRf" id="gg" role="33vP2m">
              <uo k="s:originTrace" v="n:4676225400725161421" />
              <node concept="1pGfFk" id="gh" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:4676225400725161421" />
                <node concept="37vLTw" id="gi" role="37wK5m">
                  <ref role="3cqZAo" node="fY" resolve="ctx" />
                  <uo k="s:originTrace" v="n:4676225400725161421" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g1" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725161697" />
          <node concept="2OqwBi" id="gj" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725161697" />
            <node concept="37vLTw" id="gk" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725161697" />
            </node>
            <node concept="liA8E" id="gl" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725161697" />
              <node concept="Xl_RD" id="gm" role="37wK5m">
                <property role="Xl_RC" value="--insert values into steps table" />
                <uo k="s:originTrace" v="n:4676225400725161697" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g2" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725161698" />
          <node concept="2OqwBi" id="gn" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725161698" />
            <node concept="37vLTw" id="go" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725161698" />
            </node>
            <node concept="liA8E" id="gp" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725161698" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g3" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725161776" />
          <node concept="2OqwBi" id="gq" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725161776" />
            <node concept="37vLTw" id="gr" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725161776" />
            </node>
            <node concept="liA8E" id="gs" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725161776" />
              <node concept="Xl_RD" id="gt" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO step (name, description, start_date, end_date) " />
                <uo k="s:originTrace" v="n:4676225400725161776" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g4" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725162104" />
          <node concept="2OqwBi" id="gu" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725162104" />
            <node concept="37vLTw" id="gv" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725162104" />
            </node>
            <node concept="liA8E" id="gw" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725162104" />
              <node concept="Xl_RD" id="gx" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:4676225400725162104" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g5" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725162105" />
          <node concept="2OqwBi" id="gy" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725162105" />
            <node concept="37vLTw" id="gz" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725162105" />
            </node>
            <node concept="liA8E" id="g$" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725162105" />
              <node concept="2OqwBi" id="g_" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725164564" />
                <node concept="2OqwBi" id="gA" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725164095" />
                  <node concept="37vLTw" id="gC" role="2Oq$k0">
                    <ref role="3cqZAo" node="fY" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="gD" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="gB" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  <uo k="s:originTrace" v="n:4676225400725165198" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g6" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725162110" />
          <node concept="2OqwBi" id="gE" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725162110" />
            <node concept="37vLTw" id="gF" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725162110" />
            </node>
            <node concept="liA8E" id="gG" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725162110" />
              <node concept="Xl_RD" id="gH" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725162110" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g7" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725162111" />
          <node concept="2OqwBi" id="gI" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725162111" />
            <node concept="37vLTw" id="gJ" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725162111" />
            </node>
            <node concept="liA8E" id="gK" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725162111" />
              <node concept="2OqwBi" id="gL" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725162112" />
                <node concept="2OqwBi" id="gM" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725162113" />
                  <node concept="37vLTw" id="gO" role="2Oq$k0">
                    <ref role="3cqZAo" node="fY" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="gP" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="gN" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5Dod" resolve="description" />
                  <uo k="s:originTrace" v="n:4676225400725167249" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g8" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725162115" />
          <node concept="2OqwBi" id="gQ" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725162115" />
            <node concept="37vLTw" id="gR" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725162115" />
            </node>
            <node concept="liA8E" id="gS" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725162115" />
              <node concept="Xl_RD" id="gT" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725162115" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g9" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725162116" />
          <node concept="2OqwBi" id="gU" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725162116" />
            <node concept="37vLTw" id="gV" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725162116" />
            </node>
            <node concept="liA8E" id="gW" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725162116" />
              <node concept="2OqwBi" id="gX" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725168387" />
                <node concept="2OqwBi" id="gY" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725167935" />
                  <node concept="37vLTw" id="h0" role="2Oq$k0">
                    <ref role="3cqZAo" node="fY" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="h1" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="gZ" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5Dog" resolve="startDate" />
                  <uo k="s:originTrace" v="n:4676225400725168466" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ga" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725168613" />
          <node concept="2OqwBi" id="h2" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725168613" />
            <node concept="37vLTw" id="h3" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725168613" />
            </node>
            <node concept="liA8E" id="h4" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725168613" />
              <node concept="Xl_RD" id="h5" role="37wK5m">
                <property role="Xl_RC" value="&quot;,&quot;" />
                <uo k="s:originTrace" v="n:4676225400725168613" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="gb" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725168854" />
          <node concept="2OqwBi" id="h6" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725168854" />
            <node concept="37vLTw" id="h7" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725168854" />
            </node>
            <node concept="liA8E" id="h8" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725168854" />
              <node concept="2OqwBi" id="h9" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400725168988" />
                <node concept="2OqwBi" id="ha" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400725168959" />
                  <node concept="37vLTw" id="hc" role="2Oq$k0">
                    <ref role="3cqZAo" node="fY" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="hd" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="hb" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5Dok" resolve="endDate" />
                  <uo k="s:originTrace" v="n:4676225400725169178" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="gc" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725162121" />
          <node concept="2OqwBi" id="he" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725162121" />
            <node concept="37vLTw" id="hf" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725162121" />
            </node>
            <node concept="liA8E" id="hg" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:4676225400725162121" />
              <node concept="Xl_RD" id="hh" role="37wK5m">
                <property role="Xl_RC" value="&quot;);" />
                <uo k="s:originTrace" v="n:4676225400725162121" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="gd" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725162122" />
          <node concept="2OqwBi" id="hi" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725162122" />
            <node concept="37vLTw" id="hj" role="2Oq$k0">
              <ref role="3cqZAo" node="ge" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725162122" />
            </node>
            <node concept="liA8E" id="hk" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725162122" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="fY" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:4676225400725161421" />
        <node concept="3uibUv" id="hl" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:4676225400725161421" />
        </node>
      </node>
      <node concept="2AHcQZ" id="fZ" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4676225400725161421" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="hm">
    <property role="TrG5h" value="TextGenAspectDescriptor" />
    <node concept="312cEg" id="hn" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="hy" role="1B3o_S" />
      <node concept="2eloPW" id="hz" role="1tU5fm">
        <property role="2ely0U" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
        <ref role="3uigEE" to="tpcf:1OW7rNmnulT" resolve="LanguageConceptSwitch" />
      </node>
      <node concept="2ShNRf" id="h$" role="33vP2m">
        <node concept="xCZzO" id="h_" role="2ShVmc">
          <property role="xCZzQ" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
          <node concept="3uibUv" id="hA" role="xCZzL">
            <ref role="3uigEE" to="tpcf:1OW7rNmnulT" resolve="LanguageConceptSwitch" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="ho" role="jymVt" />
    <node concept="3clFbW" id="hp" role="jymVt">
      <node concept="3cqZAl" id="hB" role="3clF45" />
      <node concept="3clFbS" id="hC" role="3clF47" />
      <node concept="3Tm1VV" id="hD" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="hq" role="jymVt" />
    <node concept="3Tm1VV" id="hr" role="1B3o_S" />
    <node concept="3uibUv" id="hs" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenAspectBase" resolve="TextGenAspectBase" />
    </node>
    <node concept="3clFb_" id="ht" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="hE" role="1B3o_S" />
      <node concept="3uibUv" id="hF" role="3clF45">
        <ref role="3uigEE" to="yfwt:~TextGenDescriptor" resolve="TextGenDescriptor" />
      </node>
      <node concept="37vLTG" id="hG" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="hK" role="1tU5fm" />
        <node concept="2AHcQZ" id="hL" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="2AHcQZ" id="hH" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
      <node concept="3clFbS" id="hI" role="3clF47">
        <node concept="3KaCP$" id="hM" role="3cqZAp">
          <node concept="2OqwBi" id="hO" role="3KbGdf">
            <node concept="37vLTw" id="i3" role="2Oq$k0">
              <ref role="3cqZAo" node="hn" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="i4" role="2OqNvi">
              <ref role="37wK5l" to="tpcf:1OW7rNmnuDr" resolve="index" />
              <node concept="37vLTw" id="i5" role="37wK5m">
                <ref role="3cqZAo" node="hG" resolve="concept" />
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hP" role="3KbHQx">
            <node concept="1n$iZg" id="i6" role="3Kbmr1">
              <property role="1n_iUB" value="AdmissionStructure" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="i7" role="3Kbo56">
              <node concept="3cpWs6" id="i8" role="3cqZAp">
                <node concept="2ShNRf" id="i9" role="3cqZAk">
                  <node concept="HV5vD" id="ia" role="2ShVmc">
                    <ref role="HV5vE" node="0" resolve="AdmissionStructure_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hQ" role="3KbHQx">
            <node concept="1n$iZg" id="ib" role="3Kbmr1">
              <property role="1n_iUB" value="ApplicationProcess" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="ic" role="3Kbo56">
              <node concept="3cpWs6" id="id" role="3cqZAp">
                <node concept="2ShNRf" id="ie" role="3cqZAk">
                  <node concept="HV5vD" id="if" role="2ShVmc">
                    <ref role="HV5vE" node="17" resolve="ApplicationProcess_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hR" role="3KbHQx">
            <node concept="1n$iZg" id="ig" role="3Kbmr1">
              <property role="1n_iUB" value="AssociatePartner" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="ih" role="3Kbo56">
              <node concept="3cpWs6" id="ii" role="3cqZAp">
                <node concept="2ShNRf" id="ij" role="3cqZAk">
                  <node concept="HV5vD" id="ik" role="2ShVmc">
                    <ref role="HV5vE" node="1D" resolve="AssociatePartner_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hS" role="3KbHQx">
            <node concept="1n$iZg" id="il" role="3Kbmr1">
              <property role="1n_iUB" value="Course" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="im" role="3Kbo56">
              <node concept="3cpWs6" id="in" role="3cqZAp">
                <node concept="2ShNRf" id="io" role="3cqZAk">
                  <node concept="HV5vD" id="ip" role="2ShVmc">
                    <ref role="HV5vE" node="2H" resolve="Course_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hT" role="3KbHQx">
            <node concept="1n$iZg" id="iq" role="3Kbmr1">
              <property role="1n_iUB" value="DegreeRequirement" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="ir" role="3Kbo56">
              <node concept="3cpWs6" id="is" role="3cqZAp">
                <node concept="2ShNRf" id="it" role="3cqZAk">
                  <node concept="HV5vD" id="iu" role="2ShVmc">
                    <ref role="HV5vE" node="4d" resolve="DegreeRequirement_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hU" role="3KbHQx">
            <node concept="1n$iZg" id="iv" role="3Kbmr1">
              <property role="1n_iUB" value="DocumentRequirement" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="iw" role="3Kbo56">
              <node concept="3cpWs6" id="ix" role="3cqZAp">
                <node concept="2ShNRf" id="iy" role="3cqZAk">
                  <node concept="HV5vD" id="iz" role="2ShVmc">
                    <ref role="HV5vE" node="5v" resolve="DocumentRequirement_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hV" role="3KbHQx">
            <node concept="1n$iZg" id="i$" role="3Kbmr1">
              <property role="1n_iUB" value="ErasmusProgram" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="i_" role="3Kbo56">
              <node concept="3cpWs6" id="iA" role="3cqZAp">
                <node concept="2ShNRf" id="iB" role="3cqZAk">
                  <node concept="HV5vD" id="iC" role="2ShVmc">
                    <ref role="HV5vE" node="6y" resolve="ErasmusProgram_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hW" role="3KbHQx">
            <node concept="1n$iZg" id="iD" role="3Kbmr1">
              <property role="1n_iUB" value="LanguageRequirement" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="iE" role="3Kbo56">
              <node concept="3cpWs6" id="iF" role="3cqZAp">
                <node concept="2ShNRf" id="iG" role="3cqZAk">
                  <node concept="HV5vD" id="iH" role="2ShVmc">
                    <ref role="HV5vE" node="9Z" resolve="LanguageRequirement_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hX" role="3KbHQx">
            <node concept="1n$iZg" id="iI" role="3Kbmr1">
              <property role="1n_iUB" value="Location" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="iJ" role="3Kbo56">
              <node concept="3cpWs6" id="iK" role="3cqZAp">
                <node concept="2ShNRf" id="iL" role="3cqZAk">
                  <node concept="HV5vD" id="iM" role="2ShVmc">
                    <ref role="HV5vE" node="b3" resolve="Location_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hY" role="3KbHQx">
            <node concept="1n$iZg" id="iN" role="3Kbmr1">
              <property role="1n_iUB" value="Requirement" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="iO" role="3Kbo56">
              <node concept="3cpWs6" id="iP" role="3cqZAp">
                <node concept="2ShNRf" id="iQ" role="3cqZAk">
                  <node concept="HV5vD" id="iR" role="2ShVmc">
                    <ref role="HV5vE" node="c6" resolve="Requirement_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="hZ" role="3KbHQx">
            <node concept="1n$iZg" id="iS" role="3Kbmr1">
              <property role="1n_iUB" value="Results" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="iT" role="3Kbo56">
              <node concept="3cpWs6" id="iU" role="3cqZAp">
                <node concept="2ShNRf" id="iV" role="3cqZAk">
                  <node concept="HV5vD" id="iW" role="2ShVmc">
                    <ref role="HV5vE" node="c$" resolve="Results_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="i0" role="3KbHQx">
            <node concept="1n$iZg" id="iX" role="3Kbmr1">
              <property role="1n_iUB" value="Scholarship" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="iY" role="3Kbo56">
              <node concept="3cpWs6" id="iZ" role="3cqZAp">
                <node concept="2ShNRf" id="j0" role="3cqZAk">
                  <node concept="HV5vD" id="j1" role="2ShVmc">
                    <ref role="HV5vE" node="e6" resolve="Scholarship_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="i1" role="3KbHQx">
            <node concept="1n$iZg" id="j2" role="3Kbmr1">
              <property role="1n_iUB" value="Step" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="j3" role="3Kbo56">
              <node concept="3cpWs6" id="j4" role="3cqZAp">
                <node concept="2ShNRf" id="j5" role="3cqZAk">
                  <node concept="HV5vD" id="j6" role="2ShVmc">
                    <ref role="HV5vE" node="fR" resolve="Step_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="i2" role="3KbHQx">
            <node concept="1n$iZg" id="j7" role="3Kbmr1">
              <property role="1n_iUB" value="University" />
              <property role="1n_ezw" value="ErasmusPrograms.structure.LanguageConceptSwitch" />
            </node>
            <node concept="3clFbS" id="j8" role="3Kbo56">
              <node concept="3cpWs6" id="j9" role="3cqZAp">
                <node concept="2ShNRf" id="ja" role="3cqZAk">
                  <node concept="HV5vD" id="jb" role="2ShVmc">
                    <ref role="HV5vE" node="kg" resolve="University_TextGen" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="hN" role="3cqZAp">
          <node concept="10Nm6u" id="jc" role="3cqZAk" />
        </node>
      </node>
      <node concept="2AHcQZ" id="hJ" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="hu" role="jymVt" />
    <node concept="3clFb_" id="hv" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="breakdownToUnits" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="jd" role="1B3o_S" />
      <node concept="3cqZAl" id="je" role="3clF45" />
      <node concept="37vLTG" id="jf" role="3clF46">
        <property role="TrG5h" value="outline" />
        <node concept="3uibUv" id="ji" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenModelOutline" resolve="TextGenModelOutline" />
        </node>
        <node concept="2AHcQZ" id="jj" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="3clFbS" id="jg" role="3clF47">
        <node concept="1DcWWT" id="jk" role="3cqZAp">
          <node concept="3clFbS" id="jl" role="2LFqv$">
            <node concept="3clFbJ" id="jo" role="3cqZAp">
              <node concept="3clFbS" id="jp" role="3clFbx">
                <node concept="3cpWs8" id="jr" role="3cqZAp">
                  <node concept="3cpWsn" id="jv" role="3cpWs9">
                    <property role="TrG5h" value="fname" />
                    <node concept="3uibUv" id="jw" role="1tU5fm">
                      <ref role="3uigEE" to="wyt6:~String" resolve="String" />
                    </node>
                    <node concept="1rXfSq" id="jx" role="33vP2m">
                      <ref role="37wK5l" node="hw" resolve="getFileName_ErasmusProgram" />
                      <node concept="37vLTw" id="jy" role="37wK5m">
                        <ref role="3cqZAo" node="jm" resolve="root" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3cpWs8" id="js" role="3cqZAp">
                  <node concept="3cpWsn" id="jz" role="3cpWs9">
                    <property role="TrG5h" value="ext" />
                    <node concept="3uibUv" id="j$" role="1tU5fm">
                      <ref role="3uigEE" to="wyt6:~String" resolve="String" />
                    </node>
                    <node concept="1rXfSq" id="j_" role="33vP2m">
                      <ref role="37wK5l" node="hx" resolve="getFileExtension_ErasmusProgram" />
                      <node concept="37vLTw" id="jA" role="37wK5m">
                        <ref role="3cqZAo" node="jm" resolve="root" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbF" id="jt" role="3cqZAp">
                  <node concept="2OqwBi" id="jB" role="3clFbG">
                    <node concept="37vLTw" id="jC" role="2Oq$k0">
                      <ref role="3cqZAo" node="jf" resolve="outline" />
                    </node>
                    <node concept="liA8E" id="jD" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenModelOutline.registerTextUnit(java.lang.String,java.lang.String,java.nio.charset.Charset,org.jetbrains.mps.openapi.model.SNode...)" resolve="registerTextUnit" />
                      <node concept="3K4zz7" id="jE" role="37wK5m">
                        <node concept="1eOMI4" id="jG" role="3K4GZi">
                          <node concept="3cpWs3" id="jJ" role="1eOMHV">
                            <node concept="37vLTw" id="jK" role="3uHU7w">
                              <ref role="3cqZAo" node="jz" resolve="ext" />
                            </node>
                            <node concept="3cpWs3" id="jL" role="3uHU7B">
                              <node concept="37vLTw" id="jM" role="3uHU7B">
                                <ref role="3cqZAo" node="jv" resolve="fname" />
                              </node>
                              <node concept="1Xhbcc" id="jN" role="3uHU7w">
                                <property role="1XhdNS" value="." />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="37vLTw" id="jH" role="3K4E3e">
                          <ref role="3cqZAo" node="jv" resolve="fname" />
                        </node>
                        <node concept="3clFbC" id="jI" role="3K4Cdx">
                          <node concept="10Nm6u" id="jO" role="3uHU7w" />
                          <node concept="37vLTw" id="jP" role="3uHU7B">
                            <ref role="3cqZAo" node="jz" resolve="ext" />
                          </node>
                        </node>
                      </node>
                      <node concept="37vLTw" id="jF" role="37wK5m">
                        <ref role="3cqZAo" node="jm" resolve="root" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3N13vt" id="ju" role="3cqZAp" />
              </node>
              <node concept="2OqwBi" id="jq" role="3clFbw">
                <node concept="2OqwBi" id="jQ" role="2Oq$k0">
                  <node concept="37vLTw" id="jS" role="2Oq$k0">
                    <ref role="3cqZAo" node="jm" resolve="root" />
                  </node>
                  <node concept="liA8E" id="jT" role="2OqNvi">
                    <ref role="37wK5l" to="mhbf:~SNode.getConcept()" resolve="getConcept" />
                  </node>
                </node>
                <node concept="liA8E" id="jR" role="2OqNvi">
                  <ref role="37wK5l" to="wyt6:~Object.equals(java.lang.Object)" resolve="equals" />
                  <node concept="35c_gC" id="jU" role="37wK5m">
                    <ref role="35c_gD" to="mmpm:BnvEjgjN33" resolve="ErasmusProgram" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="jm" role="1Duv9x">
            <property role="TrG5h" value="root" />
            <node concept="3uibUv" id="jV" role="1tU5fm">
              <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
            </node>
          </node>
          <node concept="2OqwBi" id="jn" role="1DdaDG">
            <node concept="2OqwBi" id="jW" role="2Oq$k0">
              <node concept="37vLTw" id="jY" role="2Oq$k0">
                <ref role="3cqZAo" node="jf" resolve="outline" />
              </node>
              <node concept="liA8E" id="jZ" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenModelOutline.getModel()" resolve="getModel" />
              </node>
            </node>
            <node concept="liA8E" id="jX" role="2OqNvi">
              <ref role="37wK5l" to="mhbf:~SModel.getRootNodes()" resolve="getRootNodes" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="jh" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2YIFZL" id="hw" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="getFileName_ErasmusProgram" />
      <node concept="3clFbS" id="k0" role="3clF47">
        <node concept="3clFbF" id="k4" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052161295772" />
          <node concept="2OqwBi" id="k5" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052161297444" />
            <node concept="37vLTw" id="k6" role="2Oq$k0">
              <ref role="3cqZAo" node="k3" resolve="node" />
              <uo k="s:originTrace" v="n:8411917052161295771" />
            </node>
            <node concept="3TrcHB" id="k7" role="2OqNvi">
              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              <uo k="s:originTrace" v="n:8411917052161299051" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="k1" role="1B3o_S" />
      <node concept="3uibUv" id="k2" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="37vLTG" id="k3" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="k8" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
    </node>
    <node concept="2YIFZL" id="hx" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="getFileExtension_ErasmusProgram" />
      <node concept="3clFbS" id="k9" role="3clF47">
        <node concept="3clFbF" id="kd" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052161300315" />
          <node concept="Xl_RD" id="ke" role="3clFbG">
            <property role="Xl_RC" value="sql" />
            <uo k="s:originTrace" v="n:8411917052161300314" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="ka" role="1B3o_S" />
      <node concept="3uibUv" id="kb" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="37vLTG" id="kc" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="kf" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="kg">
    <property role="1sVAO0" value="false" />
    <property role="TrG5h" value="University_TextGen" />
    <property role="3GE5qa" value="University" />
    <uo k="s:originTrace" v="n:8411917052164650977" />
    <node concept="3Tm1VV" id="kh" role="1B3o_S">
      <uo k="s:originTrace" v="n:8411917052164650977" />
    </node>
    <node concept="3uibUv" id="ki" role="1zkMxy">
      <ref role="3uigEE" to="yfwt:~TextGenDescriptorBase" resolve="TextGenDescriptorBase" />
      <uo k="s:originTrace" v="n:8411917052164650977" />
    </node>
    <node concept="3clFb_" id="kj" role="jymVt">
      <property role="TrG5h" value="generateText" />
      <uo k="s:originTrace" v="n:8411917052164650977" />
      <node concept="3cqZAl" id="kk" role="3clF45">
        <uo k="s:originTrace" v="n:8411917052164650977" />
      </node>
      <node concept="3Tm1VV" id="kl" role="1B3o_S">
        <uo k="s:originTrace" v="n:8411917052164650977" />
      </node>
      <node concept="3clFbS" id="km" role="3clF47">
        <uo k="s:originTrace" v="n:8411917052164650977" />
        <node concept="3cpWs8" id="kp" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164650977" />
          <node concept="3cpWsn" id="kB" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="tgs" />
            <uo k="s:originTrace" v="n:8411917052164650977" />
            <node concept="3uibUv" id="kC" role="1tU5fm">
              <ref role="3uigEE" to="kpbf:~TextGenSupport" resolve="TextGenSupport" />
              <uo k="s:originTrace" v="n:8411917052164650977" />
            </node>
            <node concept="2ShNRf" id="kD" role="33vP2m">
              <uo k="s:originTrace" v="n:8411917052164650977" />
              <node concept="1pGfFk" id="kE" role="2ShVmc">
                <ref role="37wK5l" to="kpbf:~TextGenSupport.&lt;init&gt;(jetbrains.mps.text.rt.TextGenContext)" resolve="TextGenSupport" />
                <uo k="s:originTrace" v="n:8411917052164650977" />
                <node concept="37vLTw" id="kF" role="37wK5m">
                  <ref role="3cqZAo" node="kn" resolve="ctx" />
                  <uo k="s:originTrace" v="n:8411917052164650977" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kq" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164650982" />
          <node concept="2OqwBi" id="kG" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164650982" />
            <node concept="37vLTw" id="kH" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164650982" />
            </node>
            <node concept="liA8E" id="kI" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164650982" />
              <node concept="Xl_RD" id="kJ" role="37wK5m">
                <property role="Xl_RC" value="--insert values into universities table" />
                <uo k="s:originTrace" v="n:8411917052164650982" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kr" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164650983" />
          <node concept="2OqwBi" id="kK" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164650983" />
            <node concept="37vLTw" id="kL" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164650983" />
            </node>
            <node concept="liA8E" id="kM" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052164650983" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ks" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164650988" />
          <node concept="2OqwBi" id="kN" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164650988" />
            <node concept="37vLTw" id="kO" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164650988" />
            </node>
            <node concept="liA8E" id="kP" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164650988" />
              <node concept="Xl_RD" id="kQ" role="37wK5m">
                <property role="Xl_RC" value="INSERT INTO university (name, credits) " />
                <uo k="s:originTrace" v="n:8411917052164650988" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kt" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164650993" />
          <node concept="2OqwBi" id="kR" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164650993" />
            <node concept="37vLTw" id="kS" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164650993" />
            </node>
            <node concept="liA8E" id="kT" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164650993" />
              <node concept="Xl_RD" id="kU" role="37wK5m">
                <property role="Xl_RC" value="VALUES (&quot;" />
                <uo k="s:originTrace" v="n:8411917052164650993" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ku" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164650994" />
          <node concept="2OqwBi" id="kV" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164650994" />
            <node concept="37vLTw" id="kW" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164650994" />
            </node>
            <node concept="liA8E" id="kX" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164650994" />
              <node concept="2OqwBi" id="kY" role="37wK5m">
                <uo k="s:originTrace" v="n:8411917052164651793" />
                <node concept="2OqwBi" id="kZ" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:8411917052164651324" />
                  <node concept="37vLTw" id="l1" role="2Oq$k0">
                    <ref role="3cqZAo" node="kn" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="l2" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrcHB" id="l0" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  <uo k="s:originTrace" v="n:8411917052164652356" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kv" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164650999" />
          <node concept="2OqwBi" id="l3" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164650999" />
            <node concept="37vLTw" id="l4" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164650999" />
            </node>
            <node concept="liA8E" id="l5" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164650999" />
              <node concept="Xl_RD" id="l6" role="37wK5m">
                <property role="Xl_RC" value="&quot;," />
                <uo k="s:originTrace" v="n:8411917052164650999" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kw" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164651005" />
          <node concept="2OqwBi" id="l7" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164651005" />
            <node concept="37vLTw" id="l8" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164651005" />
            </node>
            <node concept="liA8E" id="l9" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164651005" />
              <node concept="2YIFZM" id="la" role="37wK5m">
                <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
                <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                <uo k="s:originTrace" v="n:8411917052164651006" />
                <node concept="2OqwBi" id="lb" role="37wK5m">
                  <uo k="s:originTrace" v="n:8411917052164651007" />
                  <node concept="2OqwBi" id="lc" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:8411917052164651008" />
                    <node concept="37vLTw" id="le" role="2Oq$k0">
                      <ref role="3cqZAo" node="kn" resolve="ctx" />
                    </node>
                    <node concept="liA8E" id="lf" role="2OqNvi">
                      <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                    </node>
                  </node>
                  <node concept="3TrcHB" id="ld" role="2OqNvi">
                    <ref role="3TsBF5" to="mmpm:2oBrHLm5ASL" resolve="credits" />
                    <uo k="s:originTrace" v="n:8411917052164652463" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kx" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164651010" />
          <node concept="2OqwBi" id="lg" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164651010" />
            <node concept="37vLTw" id="lh" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164651010" />
            </node>
            <node concept="liA8E" id="li" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.append(java.lang.CharSequence)" resolve="append" />
              <uo k="s:originTrace" v="n:8411917052164651010" />
              <node concept="Xl_RD" id="lj" role="37wK5m">
                <property role="Xl_RC" value=");" />
                <uo k="s:originTrace" v="n:8411917052164651010" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ky" role="3cqZAp">
          <uo k="s:originTrace" v="n:8411917052164651011" />
          <node concept="2OqwBi" id="lk" role="3clFbG">
            <uo k="s:originTrace" v="n:8411917052164651011" />
            <node concept="37vLTw" id="ll" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:8411917052164651011" />
            </node>
            <node concept="liA8E" id="lm" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:8411917052164651011" />
            </node>
          </node>
        </node>
        <node concept="1DcWWT" id="kz" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725128609" />
          <node concept="3clFbS" id="ln" role="2LFqv$">
            <uo k="s:originTrace" v="n:4676225400725128609" />
            <node concept="3clFbF" id="lq" role="3cqZAp">
              <uo k="s:originTrace" v="n:4676225400725128609" />
              <node concept="2OqwBi" id="lr" role="3clFbG">
                <uo k="s:originTrace" v="n:4676225400725128609" />
                <node concept="37vLTw" id="ls" role="2Oq$k0">
                  <ref role="3cqZAo" node="kB" resolve="tgs" />
                  <uo k="s:originTrace" v="n:4676225400725128609" />
                </node>
                <node concept="liA8E" id="lt" role="2OqNvi">
                  <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
                  <uo k="s:originTrace" v="n:4676225400725128609" />
                  <node concept="37vLTw" id="lu" role="37wK5m">
                    <ref role="3cqZAo" node="lo" resolve="item" />
                    <uo k="s:originTrace" v="n:4676225400725128609" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWsn" id="lo" role="1Duv9x">
            <property role="TrG5h" value="item" />
            <uo k="s:originTrace" v="n:4676225400725128609" />
            <node concept="3Tqbb2" id="lv" role="1tU5fm">
              <uo k="s:originTrace" v="n:4676225400725128609" />
            </node>
          </node>
          <node concept="2OqwBi" id="lp" role="1DdaDG">
            <uo k="s:originTrace" v="n:4676225400725128610" />
            <node concept="2OqwBi" id="lw" role="2Oq$k0">
              <uo k="s:originTrace" v="n:4676225400725128611" />
              <node concept="37vLTw" id="ly" role="2Oq$k0">
                <ref role="3cqZAo" node="kn" resolve="ctx" />
              </node>
              <node concept="liA8E" id="lz" role="2OqNvi">
                <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
              </node>
            </node>
            <node concept="3Tsc0h" id="lx" role="2OqNvi">
              <ref role="3TtcxE" to="mmpm:2oBrHLm5Do_" resolve="courses" />
              <uo k="s:originTrace" v="n:4676225400725129856" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="k$" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400725128613" />
          <node concept="2OqwBi" id="l$" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400725128613" />
            <node concept="37vLTw" id="l_" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400725128613" />
            </node>
            <node concept="liA8E" id="lA" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400725128613" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="k_" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400727193446" />
          <node concept="2OqwBi" id="lB" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400727193446" />
            <node concept="37vLTw" id="lC" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400727193446" />
            </node>
            <node concept="liA8E" id="lD" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.appendNode(org.jetbrains.mps.openapi.model.SNode)" resolve="appendNode" />
              <uo k="s:originTrace" v="n:4676225400727193446" />
              <node concept="2OqwBi" id="lE" role="37wK5m">
                <uo k="s:originTrace" v="n:4676225400727193985" />
                <node concept="2OqwBi" id="lF" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4676225400727193516" />
                  <node concept="37vLTw" id="lH" role="2Oq$k0">
                    <ref role="3cqZAo" node="kn" resolve="ctx" />
                  </node>
                  <node concept="liA8E" id="lI" role="2OqNvi">
                    <ref role="37wK5l" to="yfwt:~TextGenContext.getPrimaryInput()" resolve="getPrimaryInput" />
                  </node>
                </node>
                <node concept="3TrEf2" id="lG" role="2OqNvi">
                  <ref role="3Tt5mk" to="mmpm:7iX8vQtZRiJ" resolve="location" />
                  <uo k="s:originTrace" v="n:4676225400727194568" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kA" role="3cqZAp">
          <uo k="s:originTrace" v="n:4676225400727195750" />
          <node concept="2OqwBi" id="lJ" role="3clFbG">
            <uo k="s:originTrace" v="n:4676225400727195750" />
            <node concept="37vLTw" id="lK" role="2Oq$k0">
              <ref role="3cqZAo" node="kB" resolve="tgs" />
              <uo k="s:originTrace" v="n:4676225400727195750" />
            </node>
            <node concept="liA8E" id="lL" role="2OqNvi">
              <ref role="37wK5l" to="kpbf:~TextGenSupport.newLine()" resolve="newLine" />
              <uo k="s:originTrace" v="n:4676225400727195750" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="kn" role="3clF46">
        <property role="TrG5h" value="ctx" />
        <property role="3TUv4t" value="true" />
        <uo k="s:originTrace" v="n:8411917052164650977" />
        <node concept="3uibUv" id="lM" role="1tU5fm">
          <ref role="3uigEE" to="yfwt:~TextGenContext" resolve="TextGenContext" />
          <uo k="s:originTrace" v="n:8411917052164650977" />
        </node>
      </node>
      <node concept="2AHcQZ" id="ko" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8411917052164650977" />
      </node>
    </node>
  </node>
</model>

