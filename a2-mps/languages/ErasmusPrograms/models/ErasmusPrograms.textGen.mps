<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:6671f2a8-2119-4cd1-9085-e97cc00177ff(ErasmusPrograms.textGen)">
  <persistence version="9" />
  <languages>
    <use id="b83431fe-5c8f-40bc-8a36-65e25f4dd253" name="jetbrains.mps.lang.textGen" version="1" />
    <devkit ref="fa73d85a-ac7f-447b-846c-fcdc41caa600(jetbrains.mps.devkit.aspect.textgen)" />
  </languages>
  <imports>
    <import index="mmpm" ref="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
    </language>
    <language id="b83431fe-5c8f-40bc-8a36-65e25f4dd253" name="jetbrains.mps.lang.textGen">
      <concept id="45307784116571022" name="jetbrains.mps.lang.textGen.structure.FilenameFunction" flags="ig" index="29tfMY" />
      <concept id="8931911391946696733" name="jetbrains.mps.lang.textGen.structure.ExtensionDeclaration" flags="in" index="9MYSb" />
      <concept id="1237305208784" name="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" flags="ng" index="l8MVK" />
      <concept id="1237305334312" name="jetbrains.mps.lang.textGen.structure.NodeAppendPart" flags="ng" index="l9hG8">
        <child id="1237305790512" name="value" index="lb14g" />
      </concept>
      <concept id="1237305491868" name="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" flags="ng" index="l9S2W">
        <child id="1237305945551" name="list" index="lbANJ" />
      </concept>
      <concept id="1237305557638" name="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" flags="ng" index="la8eA">
        <property id="1237305576108" name="value" index="lacIc" />
      </concept>
      <concept id="1237306079178" name="jetbrains.mps.lang.textGen.structure.AppendOperation" flags="nn" index="lc7rE">
        <child id="1237306115446" name="part" index="lcghm" />
      </concept>
      <concept id="1233670071145" name="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" flags="ig" index="WtQ9Q">
        <reference id="1233670257997" name="conceptDeclaration" index="WuzLi" />
        <child id="45307784116711884" name="filename" index="29tGrW" />
        <child id="1233749296504" name="textGenBlock" index="11c4hB" />
        <child id="7991274449437422201" name="extension" index="33IsuW" />
      </concept>
      <concept id="1233748055915" name="jetbrains.mps.lang.textGen.structure.NodeParameter" flags="nn" index="117lpO" />
      <concept id="1233749247888" name="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" flags="in" index="11bSqf" />
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1171500988903" name="jetbrains.mps.lang.smodel.structure.Node_GetChildrenOperation" flags="nn" index="32TBzR" />
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
    </language>
  </registry>
  <node concept="WtQ9Q" id="7iX8vQu7ZqJ">
    <ref role="WuzLi" to="mmpm:BnvEjgjN33" resolve="ErasmusProgram" />
    <node concept="29tfMY" id="7iX8vQu80lY" role="29tGrW">
      <node concept="3clFbS" id="7iX8vQu80lZ" role="2VODD2">
        <node concept="3clFbF" id="7iX8vQu80ms" role="3cqZAp">
          <node concept="2OqwBi" id="7iX8vQu80K$" role="3clFbG">
            <node concept="117lpO" id="7iX8vQu80mr" role="2Oq$k0" />
            <node concept="3TrcHB" id="7iX8vQu819F" role="2OqNvi">
              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9MYSb" id="7iX8vQu81sf" role="33IsuW">
      <node concept="3clFbS" id="7iX8vQu81sg" role="2VODD2">
        <node concept="3clFbF" id="7iX8vQu81tr" role="3cqZAp">
          <node concept="Xl_RD" id="7iX8vQu81tq" role="3clFbG">
            <property role="Xl_RC" value="sql" />
          </node>
        </node>
      </node>
    </node>
    <node concept="11bSqf" id="7iX8vQu81LQ" role="11c4hB">
      <node concept="3clFbS" id="7iX8vQu81LR" role="2VODD2">
        <node concept="lc7rE" id="7iX8vQufF6m" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQufF6s" role="lcghm">
            <property role="lacIc" value="--insert values into programs table" />
          </node>
          <node concept="l8MVK" id="7iX8vQufF6y" role="lcghm" />
        </node>
        <node concept="lc7rE" id="7iX8vQufF6C" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQufF6I" role="lcghm">
            <property role="lacIc" value="INSERT INTO program (id, name, total_credits) " />
          </node>
        </node>
        <node concept="lc7rE" id="7iX8vQufF6S" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQufF6X" role="lcghm">
            <property role="lacIc" value="VALUES (" />
          </node>
          <node concept="l9hG8" id="7iX8vQufF77" role="lcghm">
            <node concept="2YIFZM" id="7iX8vQujvg4" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="7iX8vQujvqr" role="37wK5m">
                <node concept="117lpO" id="7iX8vQujvg6" role="2Oq$k0" />
                <node concept="3TrcHB" id="7iX8vQujvzg" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm8$4d" resolve="id" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQufGMv" role="lcghm">
            <property role="lacIc" value=", &quot;" />
          </node>
          <node concept="l9hG8" id="7iX8vQufGM$" role="lcghm">
            <node concept="2OqwBi" id="7iX8vQufHW0" role="lb14g">
              <node concept="117lpO" id="7iX8vQufGMD" role="2Oq$k0" />
              <node concept="3TrcHB" id="7iX8vQufI6K" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQufI7e" role="lcghm">
            <property role="lacIc" value="&quot;, " />
          </node>
          <node concept="l9hG8" id="7iX8vQufI7j" role="lcghm">
            <node concept="2YIFZM" id="7iX8vQujApr" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="7iX8vQujAzN" role="37wK5m">
                <node concept="117lpO" id="7iX8vQujApt" role="2Oq$k0" />
                <node concept="3TrcHB" id="7iX8vQujAGC" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ARX" resolve="totalCredits" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQufJj$" role="lcghm">
            <property role="lacIc" value=");" />
          </node>
          <node concept="l8MVK" id="7iX8vQuhD7M" role="lcghm" />
        </node>
        <node concept="lc7rE" id="7iX8vQuhD7R" role="3cqZAp">
          <node concept="l9S2W" id="7iX8vQuhD7W" role="lcghm">
            <node concept="2OqwBi" id="7iX8vQuhDCS" role="lbANJ">
              <node concept="117lpO" id="7iX8vQuhD82" role="2Oq$k0" />
              <node concept="3Tsc0h" id="7iX8vQuhDNn" role="2OqNvi">
                <ref role="3TtcxE" to="mmpm:2oBrHLm5DoI" resolve="scholarships" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="7iX8vQukNvt" role="lcghm" />
        </node>
        <node concept="lc7rE" id="7iX8vQukNTc" role="3cqZAp">
          <node concept="l9S2W" id="7iX8vQukNTh" role="lcghm">
            <node concept="2OqwBi" id="7iX8vQukO2X" role="lbANJ">
              <node concept="117lpO" id="7iX8vQukNTm" role="2Oq$k0" />
              <node concept="3Tsc0h" id="7iX8vQukObH" role="2OqNvi">
                <ref role="3TtcxE" to="mmpm:2oBrHLm5DoC" resolve="universities" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="7iX8vQukObV" role="lcghm" />
        </node>
        <node concept="lc7rE" id="7iX8vQulRB$" role="3cqZAp">
          <node concept="l9S2W" id="7iX8vQulRBD" role="lcghm">
            <node concept="2OqwBi" id="7iX8vQulS2r" role="lbANJ">
              <node concept="117lpO" id="7iX8vQulRBI" role="2Oq$k0" />
              <node concept="3Tsc0h" id="7iX8vQulSbb" role="2OqNvi">
                <ref role="3TtcxE" to="mmpm:2oBrHLm5DoL" resolve="associatePartner" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="7iX8vQulSbp" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBG1Vhf" role="3cqZAp">
          <node concept="l9hG8" id="43_izBG1VjL" role="lcghm">
            <node concept="2OqwBi" id="43_izBG1VsL" role="lb14g">
              <node concept="117lpO" id="43_izBG1Vls" role="2Oq$k0" />
              <node concept="3TrEf2" id="43_izBG1V_S" role="2OqNvi">
                <ref role="3Tt5mk" to="mmpm:7iX8vQtZRjl" resolve="admissionStructure" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="43_izBG1VEN" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="7iX8vQudwUW">
    <ref role="WuzLi" to="mmpm:2oBrHLm5AS0" resolve="Scholarship" />
    <node concept="11bSqf" id="7iX8vQudwUX" role="11c4hB">
      <node concept="3clFbS" id="7iX8vQudwUY" role="2VODD2">
        <node concept="lc7rE" id="7iX8vQuh_Ub" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQuh_Ur" role="lcghm">
            <property role="lacIc" value="--insert values into scholarships table" />
          </node>
          <node concept="l8MVK" id="7iX8vQuiNcD" role="lcghm" />
        </node>
        <node concept="lc7rE" id="7iX8vQuh_UH" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQuh_UI" role="lcghm">
            <property role="lacIc" value="INSERT INTO scholarship (name, type, tuition_fee, travel_grant, allowance) " />
          </node>
        </node>
        <node concept="lc7rE" id="7iX8vQuh_UQ" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQuh_UR" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="7iX8vQuhBJo" role="lcghm">
            <node concept="2OqwBi" id="7iX8vQuhBQM" role="lb14g">
              <node concept="117lpO" id="7iX8vQuhBJt" role="2Oq$k0" />
              <node concept="3TrcHB" id="7iX8vQuhC1k" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQukioB" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="7iX8vQuhC1M" role="lcghm">
            <node concept="2YIFZM" id="7iX8vQuhC29" role="lb14g">
              <ref role="37wK5l" to="wyt6:~String.valueOf(java.lang.Object)" resolve="valueOf" />
              <ref role="1Pybhc" to="wyt6:~String" resolve="String" />
              <node concept="2OqwBi" id="7iX8vQuhC8y" role="37wK5m">
                <node concept="117lpO" id="7iX8vQuhC2b" role="2Oq$k0" />
                <node concept="3TrcHB" id="7iX8vQuhCjk" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5AS2" resolve="type" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQukioG" role="lcghm">
            <property role="lacIc" value="&quot;," />
          </node>
          <node concept="l9hG8" id="7iX8vQuhCjp" role="lcghm">
            <node concept="2YIFZM" id="7iX8vQujLbL" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="7iX8vQujLm8" role="37wK5m">
                <node concept="117lpO" id="7iX8vQujLbN" role="2Oq$k0" />
                <node concept="3TrcHB" id="7iX8vQujLwG" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ASv" resolve="tuitionFee" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQukioL" role="lcghm">
            <property role="lacIc" value="," />
          </node>
          <node concept="l9hG8" id="7iX8vQuhCQ6" role="lcghm">
            <node concept="2YIFZM" id="7iX8vQujFIN" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="7iX8vQujG1d" role="37wK5m">
                <node concept="117lpO" id="7iX8vQujFIP" role="2Oq$k0" />
                <node concept="3TrcHB" id="7iX8vQujGa2" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5AS$" resolve="travelGrant" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQullwg" role="lcghm">
            <property role="lacIc" value="," />
          </node>
          <node concept="l9hG8" id="7iX8vQullwl" role="lcghm">
            <node concept="2YIFZM" id="7iX8vQullwR" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="7iX8vQullIr" role="37wK5m">
                <node concept="117lpO" id="7iX8vQullwT" role="2Oq$k0" />
                <node concept="3TrcHB" id="7iX8vQullRP" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ASC" resolve="allowance" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQuh_V8" role="lcghm">
            <property role="lacIc" value=");" />
          </node>
          <node concept="l8MVK" id="43_izBG4QqS" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="7iX8vQukNvx">
    <property role="3GE5qa" value="University" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5ASI" resolve="University" />
    <node concept="11bSqf" id="7iX8vQukNvy" role="11c4hB">
      <node concept="3clFbS" id="7iX8vQukNvz" role="2VODD2">
        <node concept="lc7rE" id="7iX8vQukNv_" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQukNvA" role="lcghm">
            <property role="lacIc" value="--insert values into universities table" />
          </node>
          <node concept="l8MVK" id="7iX8vQukNvB" role="lcghm" />
        </node>
        <node concept="lc7rE" id="7iX8vQukNvF" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQukNvG" role="lcghm">
            <property role="lacIc" value="INSERT INTO university (name, credits) " />
          </node>
        </node>
        <node concept="lc7rE" id="7iX8vQukNvK" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQukNvL" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="7iX8vQukNvM" role="lcghm">
            <node concept="2OqwBi" id="7iX8vQukNGh" role="lb14g">
              <node concept="117lpO" id="7iX8vQukN$W" role="2Oq$k0" />
              <node concept="3TrcHB" id="7iX8vQukNP4" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQukNvR" role="lcghm">
            <property role="lacIc" value="&quot;," />
          </node>
          <node concept="l9hG8" id="7iX8vQukNvX" role="lcghm">
            <node concept="2YIFZM" id="7iX8vQukNvY" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="7iX8vQukNvZ" role="37wK5m">
                <node concept="117lpO" id="7iX8vQukNw0" role="2Oq$k0" />
                <node concept="3TrcHB" id="7iX8vQukNQJ" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ASL" resolve="credits" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQukNw2" role="lcghm">
            <property role="lacIc" value=");" />
          </node>
          <node concept="l8MVK" id="7iX8vQukNw3" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSkmw" role="3cqZAp">
          <node concept="l9S2W" id="43_izBFSkmx" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSkmy" role="lbANJ">
              <node concept="117lpO" id="43_izBFSkmz" role="2Oq$k0" />
              <node concept="3Tsc0h" id="43_izBFSkE0" role="2OqNvi">
                <ref role="3TtcxE" to="mmpm:2oBrHLm5Do_" resolve="courses" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="43_izBFSkm_" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBG0crV" role="3cqZAp">
          <node concept="l9hG8" id="43_izBG0ctA" role="lcghm">
            <node concept="2OqwBi" id="43_izBG0cA1" role="lb14g">
              <node concept="117lpO" id="43_izBG0cuG" role="2Oq$k0" />
              <node concept="3TrEf2" id="43_izBG0cJ8" role="2OqNvi">
                <ref role="3Tt5mk" to="mmpm:7iX8vQtZRiJ" resolve="location" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="43_izBG0d1A" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="7iX8vQulQQX">
    <ref role="WuzLi" to="mmpm:2oBrHLm5ATb" resolve="AssociatePartner" />
    <node concept="11bSqf" id="7iX8vQulQQY" role="11c4hB">
      <node concept="3clFbS" id="7iX8vQulQQZ" role="2VODD2">
        <node concept="lc7rE" id="7iX8vQulQR1" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQulQR2" role="lcghm">
            <property role="lacIc" value="--insert values into partners table" />
          </node>
          <node concept="l8MVK" id="7iX8vQulQR3" role="lcghm" />
        </node>
        <node concept="lc7rE" id="7iX8vQulQR7" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQulQR8" role="lcghm">
            <property role="lacIc" value="INSERT INTO partner (name, type) " />
          </node>
        </node>
        <node concept="lc7rE" id="7iX8vQulQRc" role="3cqZAp">
          <node concept="la8eA" id="7iX8vQulQRd" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="7iX8vQulQRe" role="lcghm">
            <node concept="2OqwBi" id="7iX8vQulR2Q" role="lb14g">
              <node concept="117lpO" id="7iX8vQulQWj" role="2Oq$k0" />
              <node concept="3TrcHB" id="7iX8vQulRad" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5ATc" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQulQRj" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="7iX8vQulQRk" role="lcghm">
            <node concept="2YIFZM" id="7iX8vQulRcp" role="lb14g">
              <ref role="37wK5l" to="wyt6:~String.valueOf(java.lang.Object)" resolve="valueOf" />
              <ref role="1Pybhc" to="wyt6:~String" resolve="String" />
              <node concept="2OqwBi" id="7iX8vQulRoy" role="37wK5m">
                <node concept="117lpO" id="7iX8vQulRcr" role="2Oq$k0" />
                <node concept="3TrcHB" id="7iX8vQulRvV" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ATk" resolve="type" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="7iX8vQulQRu" role="lcghm">
            <property role="lacIc" value="&quot;);" />
          </node>
          <node concept="l8MVK" id="43_izBG5s0J" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSlht">
    <property role="3GE5qa" value="University" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5ASP" resolve="Course" />
    <node concept="11bSqf" id="43_izBFSlhu" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSlhv" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSlhU" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSlhV" role="lcghm">
            <property role="lacIc" value="--insert values into courses table" />
          </node>
          <node concept="l8MVK" id="43_izBFSlhW" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSlju" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSljv" role="lcghm">
            <property role="lacIc" value="INSERT INTO course (name, course_code, credits, faculty) " />
          </node>
        </node>
        <node concept="lc7rE" id="43_izBFSlnS" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSlnT" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSlnU" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSlnV" role="lb14g">
              <node concept="117lpO" id="43_izBFSlnW" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSlnX" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSlnY" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSlK6" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSlSV" role="lb14g">
              <node concept="117lpO" id="43_izBFSlLA" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSmbR" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5ASQ" resolve="courseCode" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSmeK" role="lcghm">
            <property role="lacIc" value="&quot;," />
          </node>
          <node concept="l9hG8" id="43_izBFSlnZ" role="lcghm">
            <node concept="2YIFZM" id="43_izBFSlo0" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="43_izBFSlo1" role="37wK5m">
                <node concept="117lpO" id="43_izBFSlo2" role="2Oq$k0" />
                <node concept="3TrcHB" id="43_izBFSmis" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ASV" resolve="credits" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSml8" role="lcghm">
            <property role="lacIc" value=",&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSmpn" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSmrG" role="lb14g">
              <node concept="117lpO" id="43_izBFSmrf" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSmsV" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5ASZ" resolve="faculty" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSlo4" role="lcghm">
            <property role="lacIc" value="&quot;);" />
          </node>
          <node concept="l8MVK" id="43_izBFSlo5" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSmuR">
    <property role="3GE5qa" value="University" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5AT5" resolve="Location" />
    <node concept="11bSqf" id="43_izBFSmuS" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSmuT" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSmvk" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSmvl" role="lcghm">
            <property role="lacIc" value="--insert values into location table" />
          </node>
          <node concept="l8MVK" id="43_izBFSmvm" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSmLU" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSmLV" role="lcghm">
            <property role="lacIc" value="INSERT INTO location (country_name, city_name) " />
          </node>
        </node>
        <node concept="lc7rE" id="43_izBFSmQC" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSmQD" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSmQE" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSmQF" role="lb14g">
              <node concept="117lpO" id="43_izBFSmQG" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSn8Z" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5AT6" resolve="countryName" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSmQI" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSmQJ" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSnzK" role="lb14g">
              <node concept="117lpO" id="43_izBFSntp" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSn$Z" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5AT8" resolve="cityName" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSmQO" role="lcghm">
            <property role="lacIc" value="&quot;);" />
          </node>
          <node concept="l8MVK" id="43_izBFSmQP" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSoLd">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5ATn" resolve="AdmissionStructure" />
    <node concept="11bSqf" id="43_izBFSoLe" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSoLf" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSoLK" role="3cqZAp">
          <node concept="l9S2W" id="43_izBFSoLL" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSoLM" role="lbANJ">
              <node concept="117lpO" id="43_izBFSoLN" role="2Oq$k0" />
              <node concept="3Tsc0h" id="43_izBFSoWo" role="2OqNvi">
                <ref role="3TtcxE" to="mmpm:2oBrHLm5DoW" resolve="results" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="43_izBFSoLP" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSoXo" role="3cqZAp">
          <node concept="l9S2W" id="43_izBFSoXp" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSoXq" role="lbANJ">
              <node concept="117lpO" id="43_izBFSoXr" role="2Oq$k0" />
              <node concept="3Tsc0h" id="43_izBFSp92" role="2OqNvi">
                <ref role="3TtcxE" to="mmpm:2oBrHLm5DoT" resolve="applicationProcess" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="43_izBFSoXt" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSoYE" role="3cqZAp">
          <node concept="l9S2W" id="43_izBFSoYF" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSoYG" role="lbANJ">
              <node concept="117lpO" id="43_izBFSoYH" role="2Oq$k0" />
              <node concept="3Tsc0h" id="43_izBFSpaB" role="2OqNvi">
                <ref role="3TtcxE" to="mmpm:2oBrHLm5DoR" resolve="requirements" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="43_izBFSoYJ" role="lcghm" />
        </node>
        <node concept="3clFbH" id="43_izBFSoWU" role="3cqZAp" />
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSpb9">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5ATo" resolve="Results" />
    <node concept="11bSqf" id="43_izBFSpba" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSpbb" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSpbC" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSpbD" role="lcghm">
            <property role="lacIc" value="--insert values into results table" />
          </node>
          <node concept="l8MVK" id="43_izBFSpbE" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSpcR" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSpcS" role="lcghm">
            <property role="lacIc" value="INSERT INTO result (year, total_admitted, scholarships_awarded, admitted_students) " />
          </node>
        </node>
        <node concept="lc7rE" id="43_izBFSpj8" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSpj9" role="lcghm">
            <property role="lacIc" value="VALUES (" />
          </node>
          <node concept="l9hG8" id="43_izBFSpja" role="lcghm">
            <node concept="2YIFZM" id="43_izBFSpjb" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="43_izBFSpjc" role="37wK5m">
                <node concept="117lpO" id="43_izBFSpjd" role="2Oq$k0" />
                <node concept="3TrcHB" id="43_izBFSpQI" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ATp" resolve="year" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSpjf" role="lcghm">
            <property role="lacIc" value="," />
          </node>
          <node concept="l9hG8" id="43_izBFSpUn" role="lcghm">
            <node concept="2YIFZM" id="43_izBFSpYb" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="43_izBFSqcN" role="37wK5m">
                <node concept="117lpO" id="43_izBFSpYZ" role="2Oq$k0" />
                <node concept="3TrcHB" id="43_izBFSqe8" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ATr" resolve="totalAdmitted" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSqhE" role="lcghm">
            <property role="lacIc" value="," />
          </node>
          <node concept="l9hG8" id="43_izBFSqne" role="lcghm">
            <node concept="2YIFZM" id="43_izBFSqrH" role="lb14g">
              <ref role="37wK5l" to="wyt6:~Integer.toString(int)" resolve="toString" />
              <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
              <node concept="2OqwBi" id="43_izBFSqWA" role="37wK5m">
                <node concept="117lpO" id="43_izBFSqC_" role="2Oq$k0" />
                <node concept="3TrcHB" id="43_izBFSrcx" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5ATv" resolve="scholarshipsAwarded" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSpjk" role="lcghm">
            <property role="lacIc" value=",&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSpjl" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSs0L" role="lb14g">
              <node concept="117lpO" id="43_izBFSrUe" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSs8s" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5ATz" resolve="admittedStudents" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSpjq" role="lcghm">
            <property role="lacIc" value="&quot;);" />
          </node>
          <node concept="l8MVK" id="43_izBFSpjr" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSsb_">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5DnI" resolve="ApplicationProcess" />
    <node concept="11bSqf" id="43_izBFSsbA" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSsbB" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSsc0" role="3cqZAp">
          <node concept="l9S2W" id="43_izBFSsc1" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSsc2" role="lbANJ">
              <node concept="117lpO" id="43_izBFSsc3" role="2Oq$k0" />
              <node concept="3Tsc0h" id="43_izBFSsmC" role="2OqNvi">
                <ref role="3TtcxE" to="mmpm:2oBrHLm5Dp0" resolve="steps" />
              </node>
            </node>
          </node>
          <node concept="l8MVK" id="43_izBFSsc5" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSsnd">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5Doa" resolve="Step" />
    <node concept="11bSqf" id="43_izBFSsne" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSsnf" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSsrw" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSsrx" role="lcghm">
            <property role="lacIc" value="--insert values into steps table" />
          </node>
          <node concept="l8MVK" id="43_izBFSsry" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSssJ" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSssK" role="lcghm">
            <property role="lacIc" value="INSERT INTO step (name, description, start_date, end_date) " />
          </node>
        </node>
        <node concept="lc7rE" id="43_izBFSsxR" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSsxS" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSsxT" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSt8k" role="lb14g">
              <node concept="117lpO" id="43_izBFSt0Z" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFStie" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSsxY" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSsxZ" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSsy0" role="lb14g">
              <node concept="117lpO" id="43_izBFSsy1" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFStMh" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5Dod" resolve="description" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSsy3" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSsy4" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSu43" role="lb14g">
              <node concept="117lpO" id="43_izBFStWZ" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSu5i" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5Dog" resolve="startDate" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSu7_" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSubm" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSuds" role="lb14g">
              <node concept="117lpO" id="43_izBFSucZ" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSugq" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5Dok" resolve="endDate" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSsy9" role="lcghm">
            <property role="lacIc" value="&quot;);" />
          </node>
          <node concept="l8MVK" id="43_izBFSsya" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSuuP">
    <property role="3GE5qa" value="Requirement" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5ATE" resolve="Requirement" />
    <node concept="11bSqf" id="43_izBFSuuQ" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSuuR" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSuvg" role="3cqZAp">
          <node concept="l9S2W" id="43_izBFSuvh" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSuvi" role="lbANJ">
              <node concept="117lpO" id="43_izBFSuvj" role="2Oq$k0" />
              <node concept="32TBzR" id="43_izBFSuFK" role="2OqNvi" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSuGB">
    <property role="3GE5qa" value="Requirement" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5Dnx" resolve="LanguageRequirement" />
    <node concept="11bSqf" id="43_izBFSuGC" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSuGD" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSuH7" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSuH8" role="lcghm">
            <property role="lacIc" value="--insert values into language requirements table" />
          </node>
          <node concept="l8MVK" id="43_izBFSuH9" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSuJr" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSuJs" role="lcghm">
            <property role="lacIc" value="INSERT INTO language (name, level) " />
          </node>
        </node>
        <node concept="lc7rE" id="43_izBFSuLF" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSuLG" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSuLH" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSvpC" role="lb14g">
              <node concept="117lpO" id="43_izBFSvhX" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSv$9" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSuLM" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSuLN" role="lcghm">
            <node concept="2YIFZM" id="43_izBFSvD_" role="lb14g">
              <ref role="37wK5l" to="wyt6:~String.valueOf(java.lang.Object)" resolve="valueOf" />
              <ref role="1Pybhc" to="wyt6:~String" resolve="String" />
              <node concept="2OqwBi" id="43_izBFSvPZ" role="37wK5m">
                <node concept="117lpO" id="43_izBFSvEr" role="2Oq$k0" />
                <node concept="3TrcHB" id="43_izBFSvTc" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5Dn$" resolve="level" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSuLX" role="lcghm">
            <property role="lacIc" value="&quot;);" />
          </node>
          <node concept="l8MVK" id="43_izBFSuLY" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSw49">
    <property role="3GE5qa" value="Requirement" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5Dnr" resolve="DocumentRequirement" />
    <node concept="11bSqf" id="43_izBFSw4a" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSw4b" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSwnV" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSwnW" role="lcghm">
            <property role="lacIc" value="--insert values into document requirements table" />
          </node>
          <node concept="l8MVK" id="43_izBFSwnX" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSwpa" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSwpb" role="lcghm">
            <property role="lacIc" value="INSERT INTO document (name, description) " />
          </node>
        </node>
        <node concept="lc7rE" id="43_izBFSwC0" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSwC1" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSwC2" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSwC3" role="lb14g">
              <node concept="117lpO" id="43_izBFSwC4" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSwC5" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSwC6" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSwC7" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSxaw" role="lb14g">
              <node concept="117lpO" id="43_izBFSx2P" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSxl1" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5Dnu" resolve="description" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSwCc" role="lcghm">
            <property role="lacIc" value="&quot;);" />
          </node>
          <node concept="l8MVK" id="43_izBFSwCd" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
  <node concept="WtQ9Q" id="43_izBFSxqR">
    <property role="3GE5qa" value="Requirement" />
    <ref role="WuzLi" to="mmpm:2oBrHLm5Doq" resolve="DegreeRequirement" />
    <node concept="11bSqf" id="43_izBFSxqS" role="11c4hB">
      <node concept="3clFbS" id="43_izBFSxqT" role="2VODD2">
        <node concept="lc7rE" id="43_izBFSxrm" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSxrn" role="lcghm">
            <property role="lacIc" value="--insert values into degree requirements table" />
          </node>
          <node concept="l8MVK" id="43_izBFSxro" role="lcghm" />
        </node>
        <node concept="lc7rE" id="43_izBFSxs_" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSxsA" role="lcghm">
            <property role="lacIc" value="INSERT INTO degree (name, field_of_study, level) " />
          </node>
        </node>
        <node concept="lc7rE" id="43_izBFSxvc" role="3cqZAp">
          <node concept="la8eA" id="43_izBFSxvd" role="lcghm">
            <property role="lacIc" value="VALUES (&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSxve" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSxvf" role="lb14g">
              <node concept="117lpO" id="43_izBFSxvg" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSxvh" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSxvi" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSxZ9" role="lcghm">
            <node concept="2OqwBi" id="43_izBFSy8I" role="lb14g">
              <node concept="117lpO" id="43_izBFSy13" role="2Oq$k0" />
              <node concept="3TrcHB" id="43_izBFSyjf" role="2OqNvi">
                <ref role="3TsBF5" to="mmpm:2oBrHLm5Dot" resolve="fieldOfStudy" />
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSymb" role="lcghm">
            <property role="lacIc" value="&quot;,&quot;" />
          </node>
          <node concept="l9hG8" id="43_izBFSxvj" role="lcghm">
            <node concept="2YIFZM" id="43_izBFSxvk" role="lb14g">
              <ref role="37wK5l" to="wyt6:~String.valueOf(java.lang.Object)" resolve="valueOf" />
              <ref role="1Pybhc" to="wyt6:~String" resolve="String" />
              <node concept="2OqwBi" id="43_izBFSxvl" role="37wK5m">
                <node concept="117lpO" id="43_izBFSxvm" role="2Oq$k0" />
                <node concept="3TrcHB" id="43_izBFSyqA" role="2OqNvi">
                  <ref role="3TsBF5" to="mmpm:2oBrHLm5Dow" resolve="level" />
                </node>
              </node>
            </node>
          </node>
          <node concept="la8eA" id="43_izBFSxvo" role="lcghm">
            <property role="lacIc" value="&quot;);" />
          </node>
          <node concept="l8MVK" id="43_izBFSxvp" role="lcghm" />
        </node>
      </node>
    </node>
  </node>
</model>

