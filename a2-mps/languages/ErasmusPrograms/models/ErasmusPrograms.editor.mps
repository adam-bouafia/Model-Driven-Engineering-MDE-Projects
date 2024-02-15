<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:c9860172-af56-4fdd-9929-7fd022cc102e(ErasmusPrograms.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="mmpm" ref="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1237385578942" name="jetbrains.mps.lang.editor.structure.IndentLayoutOnNewLineStyleClassItem" flags="ln" index="pVoyu" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186403694788" name="jetbrains.mps.lang.editor.structure.ColorStyleClassItem" flags="ln" index="VaVBg">
        <property id="1186403713874" name="color" index="Vb096" />
      </concept>
      <concept id="1186403751766" name="jetbrains.mps.lang.editor.structure.FontStyleStyleClassItem" flags="ln" index="Vb9p2">
        <property id="1186403771423" name="style" index="Vbekb" />
      </concept>
      <concept id="1186404549998" name="jetbrains.mps.lang.editor.structure.ForegroundColorStyleClassItem" flags="ln" index="VechU" />
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1186415722038" name="jetbrains.mps.lang.editor.structure.FontSizeStyleClassItem" flags="ln" index="VSNWy">
        <property id="1221209241505" name="value" index="1lJzqX" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ngI" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="7iX8vQu165E">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5ATo" resolve="Results" />
    <node concept="3EZMnI" id="7iX8vQu166H" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu166I" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu166J" role="3EZMnx">
        <property role="3F0ifm" value="New Results Entry" />
        <node concept="VechU" id="43_izBFIuLB" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu166N" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu166O" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu166P" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu166Q" role="3EZMnx">
          <property role="3F0ifm" value="Year" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu166R" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu166S" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu166T" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ATp" resolve="year" />
          <node concept="ljvvj" id="7iX8vQu166U" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuLi" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu166V" role="3EZMnx">
          <property role="3F0ifm" value="Total admitted" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu166W" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu166X" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu166Y" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ATr" resolve="totalAdmitted" />
          <node concept="ljvvj" id="7iX8vQu166Z" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuLo" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu1670" role="3EZMnx">
          <property role="3F0ifm" value="Scholarships awarded" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu1671" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu1672" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu1673" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ATv" resolve="scholarshipsAwarded" />
          <node concept="ljvvj" id="7iX8vQu1674" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuLu" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu1675" role="3EZMnx">
          <property role="3F0ifm" value="Admitted students" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu1676" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu1677" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu1678" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ATz" resolve="admittedStudents" />
          <node concept="ljvvj" id="7iX8vQu1679" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuL$" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuKN" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu167G">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5Doa" resolve="Step" />
    <node concept="3EZMnI" id="7iX8vQu167I" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu167J" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu167K" role="3EZMnx">
        <property role="3F0ifm" value="New Step Entry" />
        <node concept="VechU" id="43_izBFIuK3" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu167P" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu167Q" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu167R" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="43_izBFIuHY" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFIuIy" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VechU" id="43_izBFIuK5" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu167S" role="3EZMnx">
          <property role="3F0ifm" value="Description" />
          <node concept="pVoyu" id="43_izBFIuIP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu167T" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu167U" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu167V" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Dod" resolve="description" />
          <node concept="ljvvj" id="7iX8vQu167W" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuKa" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu167X" role="3EZMnx">
          <property role="3F0ifm" value="Start date" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu167Y" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu167Z" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu1680" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Dog" resolve="startDate" />
          <node concept="ljvvj" id="7iX8vQu1681" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuKg" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu1682" role="3EZMnx">
          <property role="3F0ifm" value="End date" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu1683" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu1684" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu1685" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Dok" resolve="endDate" />
          <node concept="ljvvj" id="7iX8vQu1686" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuKm" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuK0" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu168_">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5DnI" resolve="ApplicationProcess" />
    <node concept="3EZMnI" id="7iX8vQu168B" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu168C" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu168D" role="3EZMnx">
        <property role="3F0ifm" value="New Application Process Entry" />
        <node concept="VechU" id="43_izBFIuHp" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu168H" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu168I" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu168J" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu168K" role="3EZMnx">
          <property role="3F0ifm" value="Steps Record" />
          <node concept="VechU" id="43_izBFIuHn" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu168L" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu168M" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu168N" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7iX8vQu168O" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Dp0" resolve="steps" />
          <node concept="l2Vlx" id="7iX8vQu168P" role="2czzBx" />
          <node concept="pj6Ft" id="7iX8vQu168Q" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7iX8vQu168R" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu168S" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuH6" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu169h">
    <property role="3GE5qa" value="AdmissionStructure" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5ATn" resolve="AdmissionStructure" />
    <node concept="3EZMnI" id="7iX8vQu169j" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu169k" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu169l" role="3EZMnx">
        <property role="3F0ifm" value="New Admission Structure Entry" />
        <node concept="VechU" id="43_izBFIuBn" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu169p" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu169q" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu169r" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu169s" role="3EZMnx">
          <property role="3F0ifm" value="Requirements Record" />
          <node concept="VechU" id="43_izBFIuBp" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu169t" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu169u" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu169v" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7iX8vQu169w" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5DoR" resolve="requirements" />
          <node concept="l2Vlx" id="7iX8vQu169x" role="2czzBx" />
          <node concept="pj6Ft" id="7iX8vQu169y" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7iX8vQu169z" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu169$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu169_" role="3EZMnx">
          <node concept="ljvvj" id="7iX8vQu169A" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu169B" role="3EZMnx">
          <property role="3F0ifm" value="Application Process Record" />
          <node concept="VechU" id="43_izBFIuBr" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu169C" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu169D" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu169E" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7iX8vQu169F" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5DoT" resolve="applicationProcess" />
          <node concept="l2Vlx" id="7iX8vQu169G" role="2czzBx" />
          <node concept="pj6Ft" id="7iX8vQu169H" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7iX8vQu169I" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu169J" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu169K" role="3EZMnx">
          <node concept="ljvvj" id="7iX8vQu169L" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu169M" role="3EZMnx">
          <property role="3F0ifm" value="Results Record" />
          <node concept="VechU" id="43_izBFIuBt" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu169N" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu169O" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu169P" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7iX8vQu169Q" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5DoW" resolve="results" />
          <node concept="l2Vlx" id="7iX8vQu169R" role="2czzBx" />
          <node concept="pj6Ft" id="7iX8vQu169S" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7iX8vQu169T" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu169U" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuAK" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu16aC">
    <property role="3GE5qa" value="Requirement" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5Doq" resolve="DegreeRequirement" />
    <node concept="3EZMnI" id="7iX8vQu16aE" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu16aF" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu16aG" role="3EZMnx">
        <property role="3F0ifm" value="New Degree Requirement Entry" />
        <node concept="VechU" id="43_izBFIuDg" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu16aL" role="3EZMnx">
        <node concept="3F0ifn" id="43_izBFIuBG" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFIuC7" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VechU" id="43_izBFIuDk" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="l2Vlx" id="7iX8vQu16aM" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu16aN" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu16aO" role="3EZMnx">
          <property role="3F0ifm" value="Field of study" />
          <node concept="pVoyu" id="43_izBFIuDi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16aP" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16aQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16aR" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Dot" resolve="fieldOfStudy" />
          <node concept="ljvvj" id="7iX8vQu16aS" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuDp" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16aT" role="3EZMnx">
          <property role="3F0ifm" value="Level" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu16aU" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16aV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16aW" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Dow" resolve="level" />
          <node concept="ljvvj" id="7iX8vQu16aX" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuDv" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuCW" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu16bn">
    <property role="3GE5qa" value="Requirement" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5Dnr" resolve="DocumentRequirement" />
    <node concept="3EZMnI" id="7iX8vQu16bp" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu16bq" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu16br" role="3EZMnx">
        <property role="3F0ifm" value="New Document Requirement Entry" />
        <node concept="VechU" id="43_izBFIuFi" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu16bw" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu16bx" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu16by" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="43_izBFIuDL" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFIuE1" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VechU" id="43_izBFIuFa" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16bz" role="3EZMnx">
          <property role="3F0ifm" value="Description" />
          <node concept="pVoyu" id="43_izBFIuEq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16b$" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16b_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16bA" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Dnu" resolve="description" />
          <node concept="ljvvj" id="7iX8vQu16bB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuFf" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuF7" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu16bV">
    <property role="3GE5qa" value="Requirement" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5Dnx" resolve="LanguageRequirement" />
    <node concept="3EZMnI" id="7iX8vQu16bX" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu16bY" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu16bZ" role="3EZMnx">
        <property role="3F0ifm" value="New Language Requirement Entry" />
        <node concept="VechU" id="43_izBFIuGH" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu16c4" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu16c5" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu16c6" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="43_izBFIuFz" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFIuFN" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VechU" id="43_izBFIuGJ" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16c7" role="3EZMnx">
          <property role="3F0ifm" value="level" />
          <node concept="pVoyu" id="43_izBFIuFW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16c8" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16c9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16ca" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Dn$" resolve="level" />
          <node concept="ljvvj" id="7iX8vQu16cb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuGO" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuGt" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu16cI">
    <ref role="1XX52x" to="mmpm:2oBrHLm5ATb" resolve="AssociatePartner" />
    <node concept="3EZMnI" id="7iX8vQu16cK" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu16cL" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu16cM" role="3EZMnx">
        <property role="3F0ifm" value="New Associate Partner Entry" />
        <node concept="VechU" id="43_izBFFx0N" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu16cR" role="3EZMnx">
        <node concept="3F0ifn" id="43_izBFDGLQ" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFDGM6" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ATc" resolve="name" />
          <node concept="VechU" id="43_izBFFx0P" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="l2Vlx" id="7iX8vQu16cS" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu16cT" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu16cU" role="3EZMnx">
          <property role="3F0ifm" value="Type" />
          <node concept="pVoyu" id="43_izBFDGMx" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16cV" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16cW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16cX" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ATk" resolve="type" />
          <node concept="ljvvj" id="7iX8vQu16cY" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFFxtn" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFDGNv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu16dj">
    <property role="3GE5qa" value="University" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5AT5" resolve="Location" />
    <node concept="3EZMnI" id="7iX8vQu16dl" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu16dm" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu16dn" role="3EZMnx">
        <property role="3F0ifm" value="New Location Entry" />
        <node concept="VechU" id="43_izBFIuA9" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu16ds" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu16dt" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu16du" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="43_izBFIu$R" role="3EZMnx">
          <property role="3F0ifm" value="Country name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFIu_7" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5AT6" resolve="countryName" />
          <node concept="VechU" id="43_izBFIuA1" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16dv" role="3EZMnx">
          <property role="3F0ifm" value="City name" />
          <node concept="pVoyu" id="43_izBFIu_g" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16dw" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16dx" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16dy" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5AT8" resolve="cityName" />
          <node concept="ljvvj" id="7iX8vQu16dz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuA6" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIu_Y" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu16dS">
    <property role="3GE5qa" value="University" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5ASP" resolve="Course" />
    <node concept="3EZMnI" id="7iX8vQu16dU" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu16dV" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu16dW" role="3EZMnx">
        <property role="3F0ifm" value="New Course Entry" />
        <node concept="VechU" id="43_izBFIuzQ" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu16e1" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu16e2" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu16e3" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="43_izBFIuy9" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFIuyH" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VechU" id="43_izBFIuzS" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16e4" role="3EZMnx">
          <property role="3F0ifm" value="Course code" />
          <node concept="pVoyu" id="43_izBFIuz0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16e5" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16e6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16e7" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ASQ" resolve="courseCode" />
          <node concept="ljvvj" id="7iX8vQu16e8" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuzX" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16e9" role="3EZMnx">
          <property role="3F0ifm" value="Credits" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu16ea" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16eb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16ec" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ASV" resolve="credits" />
          <node concept="ljvvj" id="7iX8vQu16ed" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIu$3" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16ee" role="3EZMnx">
          <property role="3F0ifm" value="Faculty" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu16ef" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16eg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16eh" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ASZ" resolve="faculty" />
          <node concept="ljvvj" id="7iX8vQu16ei" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIu$9" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuzN" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu16eL">
    <property role="3GE5qa" value="University" />
    <ref role="1XX52x" to="mmpm:2oBrHLm5ASI" resolve="University" />
    <node concept="3EZMnI" id="7iX8vQu16eN" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu16eO" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu16eP" role="3EZMnx">
        <property role="3F0ifm" value="New University Entry" />
        <node concept="VechU" id="43_izBFIutq" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu16eU" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu16eV" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu16eW" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="43_izBFIuuj" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFIuvb" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VechU" id="43_izBFIuwM" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16eX" role="3EZMnx">
          <property role="3F0ifm" value="Credits" />
          <node concept="pVoyu" id="43_izBFIuwK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16eY" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16eZ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16f0" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ASL" resolve="credits" />
          <node concept="ljvvj" id="7iX8vQu16f1" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIuwR" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16f2" role="3EZMnx">
          <node concept="ljvvj" id="7iX8vQu16f3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16f4" role="3EZMnx">
          <property role="3F0ifm" value="Courses Record" />
          <node concept="VechU" id="43_izBFIuwU" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16f5" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16f6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu16f7" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7iX8vQu16f8" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5Do_" resolve="courses" />
          <node concept="l2Vlx" id="7iX8vQu16f9" role="2czzBx" />
          <node concept="pj6Ft" id="7iX8vQu16fa" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7iX8vQu16fb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu16fc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16fd" role="3EZMnx">
          <node concept="ljvvj" id="7iX8vQu16fe" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16ff" role="3EZMnx">
          <property role="3F0ifm" value="Location Record" />
          <node concept="VechU" id="43_izBFIuwW" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16fg" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16fh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu16fi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="7iX8vQu16fj" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:7iX8vQtZRiJ" resolve="location" />
          <node concept="lj46D" id="7iX8vQu16fk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu16fl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuwH" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu16fY">
    <ref role="1XX52x" to="mmpm:2oBrHLm5AS0" resolve="Scholarship" />
    <node concept="3EZMnI" id="7iX8vQu16g0" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu16g1" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu16g2" role="3EZMnx">
        <property role="3F0ifm" value="New Scholarship Entry" />
        <node concept="VechU" id="43_izBFIupB" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu16g7" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu16g8" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu16g9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="43_izBFIurk" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFIus2" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VechU" id="43_izBFIuss" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16ga" role="3EZMnx">
          <property role="3F0ifm" value="Type" />
          <node concept="pVoyu" id="43_izBFIusq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16gb" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16gc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16gd" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5AS2" resolve="type" />
          <node concept="ljvvj" id="7iX8vQu16ge" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIusx" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16gf" role="3EZMnx">
          <property role="3F0ifm" value="Tuition fee" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu16gg" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16gh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16gi" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ASv" resolve="tuitionFee" />
          <node concept="ljvvj" id="7iX8vQu16gj" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIusB" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16gk" role="3EZMnx">
          <property role="3F0ifm" value="Travel grant" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu16gl" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16gm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16gn" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5AS$" resolve="travelGrant" />
          <node concept="ljvvj" id="7iX8vQu16go" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIusH" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu16gp" role="3EZMnx">
          <property role="3F0ifm" value="Allowance" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu16gq" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu16gr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu16gs" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ASC" resolve="allowance" />
          <node concept="ljvvj" id="7iX8vQu16gt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFIusN" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFIuqz" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7iX8vQu17E$">
    <ref role="1XX52x" to="mmpm:BnvEjgjN33" resolve="ErasmusProgram" />
    <node concept="3EZMnI" id="7iX8vQu17EA" role="2wV5jI">
      <node concept="l2Vlx" id="7iX8vQu17EB" role="2iSdaV" />
      <node concept="3F0ifn" id="7iX8vQu17EC" role="3EZMnx">
        <property role="3F0ifm" value="Erasmus Program Record" />
        <node concept="VechU" id="43_izBFHqd9" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
        <node concept="Vb9p2" id="43_izBFMiIO" role="3F10Kt">
          <property role="Vbekb" value="g1_k_vY/BOLD" />
        </node>
        <node concept="VSNWy" id="43_izBFMiIW" role="3F10Kt">
          <property role="1lJzqX" value="20" />
        </node>
      </node>
      <node concept="3F0ifn" id="43_izBFNREH" role="3EZMnx">
        <node concept="pVoyu" id="43_izBFNRFV" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="43_izBFHqc1" role="3EZMnx">
        <property role="3F0ifm" value="New Program Entry" />
        <node concept="VechU" id="43_izBFHqd7" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
        <node concept="pVoyu" id="43_izBFHWIH" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="43_izBFHWIK" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7iX8vQu17EH" role="3EZMnx">
        <node concept="l2Vlx" id="7iX8vQu17EI" role="2iSdaV" />
        <node concept="lj46D" id="7iX8vQu17EJ" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu17EK" role="3EZMnx">
          <property role="3F0ifm" value="Id" />
        </node>
        <node concept="3F0ifn" id="7iX8vQu17EL" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu17EM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu17EN" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm8$4d" resolve="id" />
          <node concept="ljvvj" id="7iX8vQu17EO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFHqhD" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="43_izBFHq23" role="3EZMnx">
          <property role="3F0ifm" value="Name:" />
        </node>
        <node concept="3F0A7n" id="43_izBFHq3T" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VechU" id="43_izBFHqhG" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17EP" role="3EZMnx">
          <property role="3F0ifm" value="Total number of credits" />
          <node concept="pVoyu" id="43_izBFHq6F" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17EQ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu17ER" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7iX8vQu17ES" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5ARX" resolve="totalCredits" />
          <node concept="ljvvj" id="7iX8vQu17ET" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="43_izBFHqhL" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17EU" role="3EZMnx">
          <node concept="ljvvj" id="7iX8vQu17EV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17EW" role="3EZMnx">
          <property role="3F0ifm" value="Scholarships Record" />
          <node concept="VechU" id="43_izBFHq07" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17EX" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu17EY" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu17EZ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7iX8vQu17F0" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5DoI" resolve="scholarships" />
          <node concept="l2Vlx" id="7iX8vQu17F1" role="2czzBx" />
          <node concept="pj6Ft" id="7iX8vQu17F2" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7iX8vQu17F3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu17F4" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17F5" role="3EZMnx">
          <node concept="ljvvj" id="7iX8vQu17F6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17F7" role="3EZMnx">
          <property role="3F0ifm" value="Universities Record" />
          <node concept="VechU" id="43_izBFHq05" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17F8" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu17F9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu17Fa" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7iX8vQu17Fb" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5DoC" resolve="universities" />
          <node concept="l2Vlx" id="7iX8vQu17Fc" role="2czzBx" />
          <node concept="pj6Ft" id="7iX8vQu17Fd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7iX8vQu17Fe" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu17Ff" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17Fg" role="3EZMnx">
          <node concept="ljvvj" id="7iX8vQu17Fh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17Fi" role="3EZMnx">
          <property role="3F0ifm" value="Associate Partners Record" />
          <node concept="VechU" id="43_izBFFx0J" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17Fj" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu17Fk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu17Fl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7iX8vQu17Fm" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:2oBrHLm5DoL" resolve="associatePartner" />
          <node concept="l2Vlx" id="7iX8vQu17Fn" role="2czzBx" />
          <node concept="pj6Ft" id="7iX8vQu17Fo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7iX8vQu17Fp" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu17Fq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17Fr" role="3EZMnx">
          <node concept="ljvvj" id="7iX8vQu17Fs" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17Ft" role="3EZMnx">
          <property role="3F0ifm" value="Admission Structure Record" />
          <node concept="VechU" id="43_izBFHq09" role="3F10Kt">
            <property role="Vb096" value="fLwANPp/orange" />
          </node>
        </node>
        <node concept="3F0ifn" id="7iX8vQu17Fu" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7iX8vQu17Fv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu17Fw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="7iX8vQu17Fx" role="3EZMnx">
          <ref role="1NtTu8" to="mmpm:7iX8vQtZRjl" resolve="admissionStructure" />
          <node concept="lj46D" id="7iX8vQu17Fy" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7iX8vQu17Fz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="pVoyu" id="43_izBFHqfo" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
</model>

