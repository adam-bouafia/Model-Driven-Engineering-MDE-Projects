<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:40de22c9-4125-47c0-9445-9ee5570f6c96(ErasmusPrograms.structure)">
  <persistence version="9" />
  <languages>
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
        <property id="672037151186491528" name="presentation" index="1L1pqM" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <reference id="1075010451642646892" name="defaultMember" index="1H5jkz" />
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
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
  <node concept="1TIwiD" id="BnvEjgjN33">
    <property role="EcuMT" value="709174712668729539" />
    <property role="TrG5h" value="ErasmusProgram" />
    <property role="34LRSv" value="erasmus program" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2oBrHLm8$4d" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149923085" />
      <property role="TrG5h" value="id" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ARX" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148157" />
      <property role="TrG5h" value="totalCredits" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyj" id="2oBrHLm5DoI" role="1TKVEi">
      <property role="IQ2ns" value="2749287990149158446" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="scholarships" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="2oBrHLm5AS0" resolve="Scholarship" />
    </node>
    <node concept="1TJgyj" id="2oBrHLm5DoC" role="1TKVEi">
      <property role="IQ2ns" value="2749287990149158440" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="universities" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="2oBrHLm5ASI" resolve="University" />
    </node>
    <node concept="1TJgyj" id="2oBrHLm5DoL" role="1TKVEi">
      <property role="IQ2ns" value="2749287990149158449" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="associatePartner" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2oBrHLm5ATb" resolve="AssociatePartner" />
    </node>
    <node concept="1TJgyj" id="7iX8vQtZRjl" role="1TKVEi">
      <property role="IQ2ns" value="8411917052159161557" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="admissionStructure" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="2oBrHLm5ATn" resolve="AdmissionStructure" />
    </node>
    <node concept="PrWs8" id="2oBrHLm5EhD" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5AS0">
    <property role="EcuMT" value="2749287990149148160" />
    <property role="TrG5h" value="Scholarship" />
    <property role="34LRSv" value="scholarship" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2oBrHLm5AS2" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148162" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="2oBrHLm5ASo" resolve="ScholarshipType" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ASv" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148191" />
      <property role="TrG5h" value="tuitionFee" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5AS$" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148196" />
      <property role="TrG5h" value="travelGrant" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ASC" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148200" />
      <property role="TrG5h" value="allowance" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="PrWs8" id="7iX8vQtZRiF" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="25R3W" id="2oBrHLm5ASo">
    <property role="3F6X1D" value="2749287990149148184" />
    <property role="TrG5h" value="ScholarshipType" />
    <node concept="25R33" id="2oBrHLm5ASp" role="25R1y">
      <property role="3tVfz5" value="2749287990149148185" />
      <property role="TrG5h" value="PROGRAMCOUNTRY" />
      <property role="1L1pqM" value="programCountry" />
    </node>
    <node concept="25R33" id="2oBrHLm5ASr" role="25R1y">
      <property role="3tVfz5" value="2749287990149148187" />
      <property role="TrG5h" value="PARTNERCOUNTRY" />
      <property role="1L1pqM" value="partnerCountry" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5ASI">
    <property role="EcuMT" value="2749287990149148206" />
    <property role="TrG5h" value="University" />
    <property role="3GE5qa" value="University" />
    <property role="34LRSv" value="university" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2oBrHLm5ASL" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148209" />
      <property role="TrG5h" value="credits" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyj" id="2oBrHLm5Do_" role="1TKVEi">
      <property role="IQ2ns" value="2749287990149158437" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="courses" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="2oBrHLm5ASP" resolve="Course" />
    </node>
    <node concept="1TJgyj" id="7iX8vQtZRiJ" role="1TKVEi">
      <property role="IQ2ns" value="8411917052159161519" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="location" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="2oBrHLm5AT5" resolve="Location" />
    </node>
    <node concept="PrWs8" id="2oBrHLm5EhG" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5ASP">
    <property role="EcuMT" value="2749287990149148213" />
    <property role="TrG5h" value="Course" />
    <property role="3GE5qa" value="University" />
    <property role="34LRSv" value="course" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2oBrHLm5ASQ" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148214" />
      <property role="TrG5h" value="courseCode" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ASV" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148219" />
      <property role="TrG5h" value="credits" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ASZ" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148223" />
      <property role="TrG5h" value="faculty" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="PrWs8" id="2oBrHLm5EhJ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5AT5">
    <property role="EcuMT" value="2749287990149148229" />
    <property role="TrG5h" value="Location" />
    <property role="3GE5qa" value="University" />
    <property role="34LRSv" value="location" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2oBrHLm5AT6" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148230" />
      <property role="TrG5h" value="countryName" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5AT8" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148232" />
      <property role="TrG5h" value="cityName" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5ATb">
    <property role="EcuMT" value="2749287990149148235" />
    <property role="TrG5h" value="AssociatePartner" />
    <property role="34LRSv" value="partner" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2oBrHLm5ATc" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148236" />
      <property role="TrG5h" value="name" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ATk" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148244" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="2oBrHLm5ATe" resolve="PartnerType" />
    </node>
  </node>
  <node concept="25R3W" id="2oBrHLm5ATe">
    <property role="3F6X1D" value="2749287990149148238" />
    <property role="TrG5h" value="PartnerType" />
    <node concept="25R33" id="2oBrHLm5ATf" role="25R1y">
      <property role="3tVfz5" value="2749287990149148239" />
      <property role="TrG5h" value="INDUSTRIAL" />
      <property role="1L1pqM" value="industrial" />
    </node>
    <node concept="25R33" id="2oBrHLm5ATg" role="25R1y">
      <property role="3tVfz5" value="2749287990149148240" />
      <property role="TrG5h" value="ACADEMIC" />
      <property role="1L1pqM" value="academic" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5ATn">
    <property role="EcuMT" value="2749287990149148247" />
    <property role="TrG5h" value="AdmissionStructure" />
    <property role="3GE5qa" value="AdmissionStructure" />
    <property role="34LRSv" value="admission" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="2oBrHLm5DoR" role="1TKVEi">
      <property role="IQ2ns" value="2749287990149158455" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="requirements" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="2oBrHLm5ATE" resolve="Requirement" />
    </node>
    <node concept="1TJgyj" id="2oBrHLm5DoT" role="1TKVEi">
      <property role="IQ2ns" value="2749287990149158457" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="applicationProcess" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="2oBrHLm5DnI" resolve="ApplicationProcess" />
    </node>
    <node concept="1TJgyj" id="2oBrHLm5DoW" role="1TKVEi">
      <property role="IQ2ns" value="2749287990149158460" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="results" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2oBrHLm5ATo" resolve="Results" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5ATo">
    <property role="EcuMT" value="2749287990149148248" />
    <property role="TrG5h" value="Results" />
    <property role="3GE5qa" value="AdmissionStructure" />
    <property role="34LRSv" value="results" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2oBrHLm5ATp" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148249" />
      <property role="TrG5h" value="year" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ATr" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148251" />
      <property role="TrG5h" value="totalAdmitted" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ATv" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148255" />
      <property role="TrG5h" value="scholarshipsAwarded" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5ATz" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149148259" />
      <property role="TrG5h" value="admittedStudents" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5ATE">
    <property role="EcuMT" value="2749287990149148266" />
    <property role="TrG5h" value="Requirement" />
    <property role="3GE5qa" value="Requirement" />
    <property role="R5$K7" value="true" />
    <property role="34LRSv" value="requirement" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="7iX8vQtZRjf" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5Dnr">
    <property role="EcuMT" value="2749287990149158363" />
    <property role="TrG5h" value="DocumentRequirement" />
    <property role="3GE5qa" value="Requirement" />
    <property role="34LRSv" value="document requirement" />
    <ref role="1TJDcQ" node="2oBrHLm5ATE" resolve="Requirement" />
    <node concept="1TJgyi" id="2oBrHLm5Dnu" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149158366" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5Dnx">
    <property role="EcuMT" value="2749287990149158369" />
    <property role="TrG5h" value="LanguageRequirement" />
    <property role="3GE5qa" value="Requirement" />
    <property role="34LRSv" value="language requirement" />
    <ref role="1TJDcQ" node="2oBrHLm5ATE" resolve="Requirement" />
    <node concept="1TJgyi" id="2oBrHLm5Dn$" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149158372" />
      <property role="TrG5h" value="level" />
      <ref role="AX2Wp" node="2oBrHLm5DnJ" resolve="LanguageLevel" />
    </node>
  </node>
  <node concept="25R3W" id="2oBrHLm5DnB">
    <property role="3F6X1D" value="2749287990149158375" />
    <property role="TrG5h" value="DegreeLevel" />
    <property role="3GE5qa" value="Requirement" />
    <ref role="1H5jkz" node="2oBrHLm5DnD" resolve="BACHELOR" />
    <node concept="25R33" id="2oBrHLm5DnD" role="25R1y">
      <property role="3tVfz5" value="2749287990149158377" />
      <property role="TrG5h" value="BACHELOR" />
      <property role="1L1pqM" value="bachelor" />
    </node>
    <node concept="25R33" id="2oBrHLm5DnF" role="25R1y">
      <property role="3tVfz5" value="2749287990149158379" />
      <property role="TrG5h" value="MASTER" />
      <property role="1L1pqM" value="master" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5DnI">
    <property role="EcuMT" value="2749287990149158382" />
    <property role="TrG5h" value="ApplicationProcess" />
    <property role="3GE5qa" value="AdmissionStructure" />
    <property role="34LRSv" value="application process" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="2oBrHLm5Dp0" role="1TKVEi">
      <property role="IQ2ns" value="2749287990149158464" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="steps" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="2oBrHLm5Doa" resolve="Step" />
    </node>
  </node>
  <node concept="25R3W" id="2oBrHLm5DnJ">
    <property role="3F6X1D" value="2749287990149158383" />
    <property role="TrG5h" value="LanguageLevel" />
    <property role="3GE5qa" value="Requirement" />
    <node concept="25R33" id="2oBrHLm5DnK" role="25R1y">
      <property role="3tVfz5" value="2749287990149158384" />
      <property role="TrG5h" value="A1" />
      <property role="1L1pqM" value="a1" />
    </node>
    <node concept="25R33" id="2oBrHLm5DnL" role="25R1y">
      <property role="3tVfz5" value="2749287990149158385" />
      <property role="TrG5h" value="A2" />
      <property role="1L1pqM" value="a2" />
    </node>
    <node concept="25R33" id="2oBrHLm5DnO" role="25R1y">
      <property role="3tVfz5" value="2749287990149158388" />
      <property role="TrG5h" value="B1" />
      <property role="1L1pqM" value="b1" />
    </node>
    <node concept="25R33" id="2oBrHLm5DnS" role="25R1y">
      <property role="3tVfz5" value="2749287990149158392" />
      <property role="TrG5h" value="B2" />
      <property role="1L1pqM" value="b2" />
    </node>
    <node concept="25R33" id="2oBrHLm5DnX" role="25R1y">
      <property role="3tVfz5" value="2749287990149158397" />
      <property role="TrG5h" value="C1" />
      <property role="1L1pqM" value="c1" />
    </node>
    <node concept="25R33" id="2oBrHLm5Do3" role="25R1y">
      <property role="3tVfz5" value="2749287990149158403" />
      <property role="TrG5h" value="C2" />
      <property role="1L1pqM" value="c2" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5Doa">
    <property role="EcuMT" value="2749287990149158410" />
    <property role="TrG5h" value="Step" />
    <property role="3GE5qa" value="AdmissionStructure" />
    <property role="34LRSv" value="step" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2oBrHLm5Dod" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149158413" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5Dog" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149158416" />
      <property role="TrG5h" value="startDate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5Dok" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149158420" />
      <property role="TrG5h" value="endDate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="PrWs8" id="2oBrHLm8XKK" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2oBrHLm5Doq">
    <property role="EcuMT" value="2749287990149158426" />
    <property role="3GE5qa" value="Requirement" />
    <property role="TrG5h" value="DegreeRequirement" />
    <property role="34LRSv" value="degree requirement" />
    <ref role="1TJDcQ" node="2oBrHLm5ATE" resolve="Requirement" />
    <node concept="1TJgyi" id="2oBrHLm5Dot" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149158429" />
      <property role="TrG5h" value="fieldOfStudy" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2oBrHLm5Dow" role="1TKVEl">
      <property role="IQ2nx" value="2749287990149158432" />
      <property role="TrG5h" value="level" />
      <ref role="AX2Wp" node="2oBrHLm5DnB" resolve="DegreeLevel" />
    </node>
  </node>
</model>

