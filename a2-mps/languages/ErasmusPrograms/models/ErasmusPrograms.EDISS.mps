<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:442c4ac4-304f-4d46-9f3d-9e9fbfe6664b(ErasmusPrograms.EDISS)">
  <persistence version="9" />
  <languages>
    <use id="45d74393-8b79-4afa-9cc9-d68d79ce89e1" name="ErasmusPrograms" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports />
  <registry>
    <language id="45d74393-8b79-4afa-9cc9-d68d79ce89e1" name="ErasmusPrograms">
      <concept id="709174712668729539" name="ErasmusPrograms.structure.ErasmusProgram" flags="ng" index="3pA4TB">
        <property id="2749287990149923085" name="id" index="1K1iZh" />
        <property id="2749287990149148157" name="totalCredits" index="1Kcgcx" />
        <child id="8411917052159161557" name="admissionStructure" index="3Dg_kC" />
        <child id="2749287990149158449" name="associatePartner" index="1KcvzH" />
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
      <concept id="2749287990149148235" name="ErasmusPrograms.structure.AssociatePartner" flags="ng" index="1Kcg2n">
        <property id="2749287990149148244" name="type" index="1Kcg28" />
        <property id="2749287990149148236" name="name" index="1Kcg2g" />
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
      <concept id="2749287990149158382" name="ErasmusPrograms.structure.ApplicationProcess" flags="ng" index="1KcvGM">
        <child id="2749287990149158464" name="steps" index="1Kcvys" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="3pA4TB" id="7iX8vQu6VOV">
    <property role="TrG5h" value="EDISS" />
    <property role="1K1iZh" value="1" />
    <property role="1Kcgcx" value="120" />
    <node concept="1Kcg2n" id="7iX8vQumqw5" role="1KcvzH">
      <property role="1Kcg2g" value="Nokia" />
      <property role="1Kcg28" value="2oBrHLm5ATf/INDUSTRIAL" />
    </node>
    <node concept="1Kcg3s" id="7iX8vQu6VOW" role="1KcvzM">
      <property role="TrG5h" value="Erasmus Mundus Europe" />
      <property role="1Kcg3u" value="2oBrHLm5ASr/PARTNERCOUNTRY" />
      <property role="1Kcg33" value="2000" />
      <property role="1Kcg3S" value="1000" />
      <property role="1Kcg3O" value="24000" />
    </node>
    <node concept="1Kcg3s" id="43_izBFSe9e" role="1KcvzM">
      <property role="TrG5h" value="Erasmus Mundus Global" />
      <property role="1Kcg3u" value="2oBrHLm5ASp/PROGRAMCOUNTRY" />
      <property role="1Kcg33" value="2000" />
      <property role="1Kcg3S" value="3000" />
      <property role="1Kcg3O" value="24000" />
    </node>
    <node concept="1Kcg3M" id="7iX8vQu6VOX" role="1KcvzO">
      <property role="TrG5h" value="Abo Akademi University" />
      <property role="1Kcg3H" value="60" />
      <node concept="1Kcg3D" id="7iX8vQu6VOY" role="1KcvzT">
        <property role="TrG5h" value="Data Science" />
        <property role="1Kcg3E" value="DS001" />
        <property role="1Kcg3B" value="5" />
        <property role="1Kcg3z" value="Informatics" />
      </node>
      <node concept="1Kcg3D" id="43_izBFSe9f" role="1KcvzT">
        <property role="TrG5h" value="Machine Learning" />
        <property role="1Kcg3E" value="ML001" />
        <property role="1Kcg3B" value="5" />
        <property role="1Kcg3z" value="Informatics" />
      </node>
      <node concept="1Kcg2p" id="7iX8vQu6VOZ" role="3Dg_li">
        <property role="1Kcg2q" value="Finland" />
        <property role="1Kcg2k" value="Turku" />
      </node>
    </node>
    <node concept="1Kcg3M" id="7iX8vQulQQT" role="1KcvzO">
      <property role="TrG5h" value="University of L'Aquila" />
      <property role="1Kcg3H" value="60" />
      <node concept="1Kcg3D" id="7iX8vQulQQU" role="1KcvzT">
        <property role="TrG5h" value="Model Driven Engineering" />
        <property role="1Kcg3E" value="MDE001" />
        <property role="1Kcg3B" value="6" />
        <property role="1Kcg3z" value="Informatics" />
      </node>
      <node concept="1Kcg3D" id="43_izBFSe9g" role="1KcvzT">
        <property role="TrG5h" value="Software Architectures" />
        <property role="1Kcg3E" value="SA001" />
        <property role="1Kcg3B" value="6" />
        <property role="1Kcg3z" value="Informatics" />
      </node>
      <node concept="1Kcg2p" id="7iX8vQulQQV" role="3Dg_li">
        <property role="1Kcg2q" value="Italy" />
        <property role="1Kcg2k" value="L'Aquila" />
      </node>
    </node>
    <node concept="1Kcg2b" id="7iX8vQu6VP0" role="3Dg_kC">
      <node concept="1Kcg24" id="43_izBFSe9j" role="1Kcvzw">
        <property role="1Kcg25" value="2023" />
        <property role="1Kcg27" value="25" />
        <property role="1Kcg23" value="20" />
        <property role="1Kcg2Z" value="Sherkhan, Ricardo, Alex" />
      </node>
      <node concept="1Kcvz6" id="7iX8vQu6VP4" role="1KcvzF">
        <property role="TrG5h" value="Bachelor" />
        <property role="1Kcvz1" value="Computer Science" />
      </node>
      <node concept="1KcvGM" id="7iX8vQu6VP2" role="1Kcvz_">
        <node concept="1Kcvzm" id="7iX8vQu6VP3" role="1Kcvys">
          <property role="TrG5h" value="1" />
          <property role="1Kcvzh" value="Gather documents" />
          <property role="1Kcvzc" value="01/12/2023" />
          <property role="1Kcvz8" value="01/02/2024" />
        </node>
        <node concept="1Kcvzm" id="43_izBFSe9q" role="1Kcvys">
          <property role="TrG5h" value="2" />
          <property role="1Kcvzh" value="Apply online" />
          <property role="1Kcvzc" value="01/12/2023" />
          <property role="1Kcvz8" value="01/02/2024" />
        </node>
      </node>
    </node>
  </node>
</model>

