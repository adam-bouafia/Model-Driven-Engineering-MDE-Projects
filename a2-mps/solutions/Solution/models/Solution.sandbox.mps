<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:f2c46516-cc05-4ed4-8ac3-c1ed69aec5be(Solution.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="45d74393-8b79-4afa-9cc9-d68d79ce89e1" name="ErasmusPrograms" version="0" />
  </languages>
  <imports />
  <registry>
    <language id="45d74393-8b79-4afa-9cc9-d68d79ce89e1" name="ErasmusPrograms">
      <concept id="709174712668729539" name="ErasmusPrograms.structure.ErasmusProgram" flags="ng" index="3pA4TB">
        <property id="2749287990149923085" name="id" index="1K1iZh" />
        <property id="2749287990149148157" name="totalCredits" index="1Kcgcx" />
        <child id="8411917052159161557" name="admissionStructure" index="3Dg_kC" />
        <child id="2749287990149158446" name="scholarships" index="1KcvzM" />
        <child id="2749287990149158440" name="universities" index="1KcvzO" />
      </concept>
      <concept id="2749287990149148248" name="ErasmusPrograms.structure.Results" flags="ng" index="1Kcg24">
        <property id="2749287990149148255" name="scholarshipsAwarded" index="1Kcg23" />
        <property id="2749287990149148249" name="year" index="1Kcg25" />
        <property id="2749287990149148251" name="totalAdmitted" index="1Kcg27" />
        <property id="2749287990149148259" name="admittedStudents" index="1Kcg2Z" />
      </concept>
      <concept id="2749287990149148247" name="ErasmusPrograms.structure.AdmissionStructure" flags="ng" index="1Kcg2b">
        <child id="2749287990149158460" name="results" index="1Kcvzw" />
        <child id="2749287990149158457" name="applicationProcess" index="1Kcvz_" />
        <child id="2749287990149158455" name="requirements" index="1KcvzF" />
      </concept>
      <concept id="2749287990149148229" name="ErasmusPrograms.structure.Location" flags="ng" index="1Kcg2p">
        <property id="2749287990149148232" name="cityName" index="1Kcg2k" />
        <property id="2749287990149148230" name="countryName" index="1Kcg2q" />
      </concept>
      <concept id="2749287990149148160" name="ErasmusPrograms.structure.Scholarship" flags="ng" index="1Kcg3s">
        <property id="2749287990149148191" name="tuitionFee" index="1Kcg33" />
        <property id="2749287990149148162" name="type" index="1Kcg3u" />
        <property id="2749287990149148200" name="allowance" index="1Kcg3O" />
        <property id="2749287990149148196" name="travelGrant" index="1Kcg3S" />
      </concept>
      <concept id="2749287990149148213" name="ErasmusPrograms.structure.Course" flags="ng" index="1Kcg3D">
        <property id="2749287990149148223" name="faculty" index="1Kcg3z" />
        <property id="2749287990149148219" name="credits" index="1Kcg3B" />
        <property id="2749287990149148214" name="courseCode" index="1Kcg3E" />
      </concept>
      <concept id="2749287990149148206" name="ErasmusPrograms.structure.University" flags="ng" index="1Kcg3M">
        <property id="2749287990149148209" name="credits" index="1Kcg3H" />
        <child id="8411917052159161519" name="location" index="3Dg_li" />
        <child id="2749287990149158437" name="courses" index="1KcvzT" />
      </concept>
      <concept id="2749287990149158426" name="ErasmusPrograms.structure.DegreeRequirement" flags="ng" index="1Kcvz6">
        <property id="2749287990149158429" name="fieldOfStudy" index="1Kcvz1" />
      </concept>
      <concept id="2749287990149158410" name="ErasmusPrograms.structure.Step" flags="ng" index="1Kcvzm">
        <property id="2749287990149158420" name="endDate" index="1Kcvz8" />
        <property id="2749287990149158416" name="startDate" index="1Kcvzc" />
        <property id="2749287990149158413" name="description" index="1Kcvzh" />
      </concept>
      <concept id="2749287990149158363" name="ErasmusPrograms.structure.DocumentRequirement" flags="ng" index="1KcvG7">
        <property id="2749287990149158366" name="description" index="1KcvG2" />
      </concept>
      <concept id="2749287990149158382" name="ErasmusPrograms.structure.ApplicationProcess" flags="ng" index="1KcvGM">
        <child id="2749287990149158464" name="steps" index="1Kcvys" />
      </concept>
      <concept id="2749287990149158369" name="ErasmusPrograms.structure.LanguageRequirement" flags="ng" index="1KcvGX">
        <property id="2749287990149158372" name="level" index="1KcvGS" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="3pA4TB" id="7iX8vQu2acm">
    <property role="TrG5h" value="EDISS" />
    <property role="1K1iZh" value="1" />
    <property role="1Kcgcx" value="120" />
    <node concept="1Kcg3s" id="7iX8vQu2acn" role="1KcvzM">
      <property role="TrG5h" value="Erasmus Mundus" />
      <property role="1Kcg3u" value="2oBrHLm5ASp/PROGRAMCOUNTRY" />
      <property role="1Kcg33" value="20000" />
      <property role="1Kcg3S" value="3000" />
      <property role="1Kcg3O" value="24000" />
    </node>
    <node concept="1Kcg3M" id="7iX8vQu2aco" role="1KcvzO">
      <property role="TrG5h" value="Abo Akademi University" />
      <property role="1Kcg3H" value="60" />
      <node concept="1Kcg3D" id="7iX8vQu2acp" role="1KcvzT">
        <property role="TrG5h" value="Machine Learning" />
        <property role="1Kcg3E" value="ML001" />
        <property role="1Kcg3B" value="5" />
        <property role="1Kcg3z" value="Informatics" />
      </node>
      <node concept="1Kcg3D" id="7iX8vQu2acN" role="1KcvzT">
        <property role="TrG5h" value="Embedded AI" />
        <property role="1Kcg3E" value="EAI001" />
        <property role="1Kcg3B" value="5" />
        <property role="1Kcg3z" value="Informatics" />
      </node>
      <node concept="1Kcg2p" id="7iX8vQu2acq" role="3Dg_li">
        <property role="1Kcg2q" value="Finland" />
        <property role="1Kcg2k" value="Turku" />
      </node>
    </node>
    <node concept="1Kcg3M" id="7iX8vQu2acQ" role="1KcvzO">
      <property role="TrG5h" value="University of L'Aquila" />
      <property role="1Kcg3H" value="60" />
      <node concept="1Kcg3D" id="7iX8vQu2acR" role="1KcvzT">
        <property role="TrG5h" value="Model Driven Engineering" />
        <property role="1Kcg3E" value="MDE001" />
        <property role="1Kcg3B" value="6" />
        <property role="1Kcg3z" value="Science, Informatics and Math" />
      </node>
      <node concept="1Kcg2p" id="7iX8vQu2acS" role="3Dg_li">
        <property role="1Kcg2q" value="Italy" />
        <property role="1Kcg2k" value="L'Aquila" />
      </node>
    </node>
    <node concept="1Kcg2b" id="7iX8vQu2acr" role="3Dg_kC">
      <node concept="1Kcg24" id="7iX8vQu2aee" role="1Kcvzw">
        <property role="1Kcg25" value="2023" />
        <property role="1Kcg27" value="25" />
        <property role="1Kcg23" value="20" />
        <property role="1Kcg2Z" value="Sherkhan, Ricardo, Alex" />
      </node>
      <node concept="1Kcg24" id="7iX8vQu2aeg" role="1Kcvzw">
        <property role="1Kcg25" value="2022" />
        <property role="1Kcg27" value="20" />
        <property role="1Kcg23" value="18" />
        <property role="1Kcg2Z" value="Mudita, Aarohi, Aicha" />
      </node>
      <node concept="1KcvGM" id="7iX8vQu2act" role="1Kcvz_">
        <node concept="1Kcvzm" id="7iX8vQu2acu" role="1Kcvys">
          <property role="TrG5h" value="1" />
          <property role="1Kcvzh" value="gather documents" />
          <property role="1Kcvzc" value="01/12/2023" />
          <property role="1Kcvz8" value="02/01/2024" />
        </node>
        <node concept="1Kcvzm" id="7iX8vQu2ae5" role="1Kcvys">
          <property role="TrG5h" value="2" />
          <property role="1Kcvzh" value="apply online" />
          <property role="1Kcvzc" value="01/12/2024" />
          <property role="1Kcvz8" value="02/01/2024" />
        </node>
      </node>
      <node concept="1Kcvz6" id="7iX8vQu4cN$" role="1KcvzF">
        <property role="TrG5h" value="Bachelor" />
        <property role="1Kcvz1" value="Computer Science" />
      </node>
      <node concept="1KcvGX" id="7iX8vQu4FSs" role="1KcvzF">
        <property role="TrG5h" value="English" />
        <property role="1KcvGS" value="2oBrHLm5DnS/B2" />
      </node>
      <node concept="1KcvG7" id="7iX8vQu4FS$" role="1KcvzF">
        <property role="TrG5h" value="Nationality Proof" />
        <property role="1KcvG2" value="Passport or Identity Card" />
      </node>
    </node>
  </node>
</model>

