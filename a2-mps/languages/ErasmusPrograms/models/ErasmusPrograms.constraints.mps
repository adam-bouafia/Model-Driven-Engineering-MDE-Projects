<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:d62249e9-1888-40f9-9c51-bbbb092b81e0(ErasmusPrograms.constraints)">
  <persistence version="9" />
  <languages>
    <use id="5dae8159-ab99-46bb-a40d-0cee30ee7018" name="jetbrains.mps.lang.constraints.rules.kinds" version="0" />
    <use id="ea3159bf-f48e-4720-bde2-86dba75f0d34" name="jetbrains.mps.lang.context.defs" version="0" />
    <use id="e51810c5-7308-4642-bcb6-469e61b5dd18" name="jetbrains.mps.lang.constraints.msg.specification" version="0" />
    <use id="134c38d4-e3af-4d9e-b069-1c7df0a4005d" name="jetbrains.mps.lang.constraints.rules.skeleton" version="0" />
    <use id="b3551702-269c-4f05-ba61-58060cef4292" name="jetbrains.mps.lang.rulesAndMessages" version="0" />
    <use id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints" version="6" />
    <use id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts" version="0" />
    <use id="3ad5badc-1d9c-461c-b7b1-fa2fcd0a0ae7" name="jetbrains.mps.lang.context" version="0" />
    <use id="ad93155d-79b2-4759-b10c-55123e763903" name="jetbrains.mps.lang.messages" version="0" />
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="mmpm" ref="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)" implicit="true" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
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
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1081506762703" name="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" flags="nn" index="3eOSWO" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="1147467115080" name="jetbrains.mps.lang.constraints.structure.NodePropertyConstraint" flags="ng" index="EnEH3">
        <reference id="1147467295099" name="applicableProperty" index="EomxK" />
        <child id="1212097481299" name="propertyValidator" index="QCWH9" />
      </concept>
      <concept id="1212096972063" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_PropertyValidator" flags="in" index="QB0g5" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <reference id="1213106917431" name="defaultConcreteConcept" index="1MND4H" />
        <child id="1213098023997" name="property" index="1MhHOB" />
      </concept>
      <concept id="1153138554286" name="jetbrains.mps.lang.constraints.structure.ConstraintsFunctionParameter_propertyValue" flags="nn" index="1Wqviy" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
    </language>
  </registry>
  <node concept="1M2fIO" id="2oBrHLm7ezr">
    <ref role="1M2myG" to="mmpm:BnvEjgjN33" resolve="ErasmusProgram" />
    <node concept="EnEH3" id="2oBrHLm7ezu" role="1MhHOB">
      <ref role="EomxK" to="mmpm:2oBrHLm5ARX" resolve="totalCredits" />
      <node concept="QB0g5" id="2oBrHLm7eBc" role="QCWH9">
        <node concept="3clFbS" id="2oBrHLm7eBd" role="2VODD2">
          <node concept="3clFbF" id="7iX8vQu5o9W" role="3cqZAp">
            <node concept="22lmx$" id="7iX8vQu5IFs" role="3clFbG">
              <node concept="3clFbC" id="7iX8vQu5Kxu" role="3uHU7w">
                <node concept="3cmrfG" id="7iX8vQu5KLI" role="3uHU7w">
                  <property role="3cmrfH" value="120" />
                </node>
                <node concept="1Wqviy" id="7iX8vQu5K6c" role="3uHU7B" />
              </node>
              <node concept="22lmx$" id="7iX8vQu5$Lk" role="3uHU7B">
                <node concept="3clFbC" id="7iX8vQu5zw0" role="3uHU7B">
                  <node concept="1Wqviy" id="7iX8vQu5o9V" role="3uHU7B" />
                  <node concept="3cmrfG" id="7iX8vQu5At6" role="3uHU7w">
                    <property role="3cmrfH" value="60" />
                  </node>
                </node>
                <node concept="3clFbC" id="7iX8vQu5Ddk" role="3uHU7w">
                  <node concept="1Wqviy" id="7iX8vQu5AGG" role="3uHU7B" />
                  <node concept="3cmrfG" id="7iX8vQu5E2m" role="3uHU7w">
                    <property role="3cmrfH" value="90" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="2oBrHLm7P7y">
    <ref role="1M2myG" to="mmpm:2oBrHLm5ASI" resolve="University" />
    <node concept="EnEH3" id="2oBrHLm7P7z" role="1MhHOB">
      <ref role="EomxK" to="mmpm:2oBrHLm5ASL" resolve="credits" />
      <node concept="QB0g5" id="2oBrHLm7P9S" role="QCWH9">
        <node concept="3clFbS" id="2oBrHLm7P9T" role="2VODD2">
          <node concept="3clFbF" id="7iX8vQu4Mwo" role="3cqZAp">
            <node concept="3eOSWO" id="7iX8vQu4OMe" role="3clFbG">
              <node concept="3cmrfG" id="7iX8vQu4P_i" role="3uHU7w">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="1Wqviy" id="7iX8vQu4Mwn" role="3uHU7B" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="43_izBFOur5">
    <property role="3GE5qa" value="Requirement" />
    <ref role="1M2myG" to="mmpm:2oBrHLm5ATE" resolve="Requirement" />
    <ref role="1MND4H" to="mmpm:2oBrHLm5Doq" resolve="DegreeRequirement" />
  </node>
  <node concept="1M2fIO" id="43_izBFPC2B">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="1M2myG" to="mmpm:2oBrHLm5Doa" resolve="Step" />
    <node concept="EnEH3" id="43_izBFPDtJ" role="1MhHOB">
      <ref role="EomxK" to="mmpm:2oBrHLm5Dog" resolve="startDate" />
      <node concept="QB0g5" id="43_izBFPEw6" role="QCWH9">
        <node concept="3clFbS" id="43_izBFPEw7" role="2VODD2">
          <node concept="3clFbF" id="43_izBFPFri" role="3cqZAp">
            <node concept="2OqwBi" id="43_izBFPHnH" role="3clFbG">
              <node concept="1Wqviy" id="43_izBFPFrh" role="2Oq$k0" />
              <node concept="liA8E" id="43_izBFPJ8Y" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.matches(java.lang.String)" resolve="matches" />
                <node concept="Xl_RD" id="43_izBFPJae" role="37wK5m">
                  <property role="Xl_RC" value="([0-9]{2})/([0-9]{2})/([0-9]{4})" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="EnEH3" id="43_izBFQhCt" role="1MhHOB">
      <ref role="EomxK" to="mmpm:2oBrHLm5Dok" resolve="endDate" />
      <node concept="QB0g5" id="43_izBFQjkk" role="QCWH9">
        <node concept="3clFbS" id="43_izBFQjkl" role="2VODD2">
          <node concept="3clFbF" id="43_izBFQjyZ" role="3cqZAp">
            <node concept="2OqwBi" id="43_izBFQl2A" role="3clFbG">
              <node concept="1Wqviy" id="43_izBFQjyY" role="2Oq$k0" />
              <node concept="liA8E" id="43_izBFQmMA" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~String.matches(java.lang.String)" resolve="matches" />
                <node concept="Xl_RD" id="43_izBFQn1h" role="37wK5m">
                  <property role="Xl_RC" value="([0-9]{2})/([0-9]{2})/([0-9]{4})" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

