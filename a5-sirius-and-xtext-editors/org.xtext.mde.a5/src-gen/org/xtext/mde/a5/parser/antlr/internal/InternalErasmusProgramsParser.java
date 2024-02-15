package org.xtext.mde.a5.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mde.a5.services.ErasmusProgramsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErasmusProgramsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_EDATE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ErasmusProgram'", "'{'", "'totalCredits'", "'universities'", "','", "'}'", "'scholarships'", "'associatePartners'", "'admissionStructure'", "'tuitionFee'", "'travelGrant'", "'allowance'", "'University'", "'location'", "'credits'", "'courses'", "'code'", "':'", "'name'", "'faculty'", "'country'", "'city'", "'('", "')'", "'applicationProcess'", "'requirements'", "'results'", "'Year'", "'totalAdmitted'", "'scholarshipsAwarded'", "'admittedStudents'", "'DocumentRequirement'", "'documentName'", "'description'", "'DegreeRequirement'", "'degreeName'", "'fieldOfStudy'", "'level'", "'LanguageRequirement'", "'language'", "'steps'", "'Step'", "'startDate'", "'endDate'", "'Program_Country'", "'Partner_Country'", "'A1'", "'A2'", "'B1'", "'B2'", "'C1'", "'C2'", "'Industrial'", "'Academic'", "'Bachelor'", "'Master'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_EDATE=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalErasmusProgramsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalErasmusProgramsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalErasmusProgramsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalErasmusPrograms.g"; }



     	private ErasmusProgramsGrammarAccess grammarAccess;

        public InternalErasmusProgramsParser(TokenStream input, ErasmusProgramsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ErasmusProgram";
       	}

       	@Override
       	protected ErasmusProgramsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleErasmusProgram"
    // InternalErasmusPrograms.g:65:1: entryRuleErasmusProgram returns [EObject current=null] : iv_ruleErasmusProgram= ruleErasmusProgram EOF ;
    public final EObject entryRuleErasmusProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErasmusProgram = null;


        try {
            // InternalErasmusPrograms.g:65:55: (iv_ruleErasmusProgram= ruleErasmusProgram EOF )
            // InternalErasmusPrograms.g:66:2: iv_ruleErasmusProgram= ruleErasmusProgram EOF
            {
             newCompositeNode(grammarAccess.getErasmusProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErasmusProgram=ruleErasmusProgram();

            state._fsp--;

             current =iv_ruleErasmusProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErasmusProgram"


    // $ANTLR start "ruleErasmusProgram"
    // InternalErasmusPrograms.g:72:1: ruleErasmusProgram returns [EObject current=null] : (otherlv_0= 'ErasmusProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'totalCredits' ( (lv_totalCredits_4_0= RULE_INT ) ) (otherlv_5= 'universities' otherlv_6= '{' ( (lv_universities_7_0= ruleUniversity ) ) (otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) ) )* otherlv_10= '}' )? (otherlv_11= 'scholarships' otherlv_12= '{' ( (lv_scholarships_13_0= ruleScholarship ) ) (otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) ) )* otherlv_16= '}' )? (otherlv_17= 'associatePartners' otherlv_18= '{' ( (lv_associatePartners_19_0= ruleAssociatePartner ) ) (otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) ) )* otherlv_22= '}' )? otherlv_23= 'admissionStructure' ( (lv_admissionStructure_24_0= ruleAdmissionStructure ) ) otherlv_25= '}' ) ;
    public final EObject ruleErasmusProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_totalCredits_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_universities_7_0 = null;

        EObject lv_universities_9_0 = null;

        EObject lv_scholarships_13_0 = null;

        EObject lv_scholarships_15_0 = null;

        EObject lv_associatePartners_19_0 = null;

        EObject lv_associatePartners_21_0 = null;

        EObject lv_admissionStructure_24_0 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:78:2: ( (otherlv_0= 'ErasmusProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'totalCredits' ( (lv_totalCredits_4_0= RULE_INT ) ) (otherlv_5= 'universities' otherlv_6= '{' ( (lv_universities_7_0= ruleUniversity ) ) (otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) ) )* otherlv_10= '}' )? (otherlv_11= 'scholarships' otherlv_12= '{' ( (lv_scholarships_13_0= ruleScholarship ) ) (otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) ) )* otherlv_16= '}' )? (otherlv_17= 'associatePartners' otherlv_18= '{' ( (lv_associatePartners_19_0= ruleAssociatePartner ) ) (otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) ) )* otherlv_22= '}' )? otherlv_23= 'admissionStructure' ( (lv_admissionStructure_24_0= ruleAdmissionStructure ) ) otherlv_25= '}' ) )
            // InternalErasmusPrograms.g:79:2: (otherlv_0= 'ErasmusProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'totalCredits' ( (lv_totalCredits_4_0= RULE_INT ) ) (otherlv_5= 'universities' otherlv_6= '{' ( (lv_universities_7_0= ruleUniversity ) ) (otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) ) )* otherlv_10= '}' )? (otherlv_11= 'scholarships' otherlv_12= '{' ( (lv_scholarships_13_0= ruleScholarship ) ) (otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) ) )* otherlv_16= '}' )? (otherlv_17= 'associatePartners' otherlv_18= '{' ( (lv_associatePartners_19_0= ruleAssociatePartner ) ) (otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) ) )* otherlv_22= '}' )? otherlv_23= 'admissionStructure' ( (lv_admissionStructure_24_0= ruleAdmissionStructure ) ) otherlv_25= '}' )
            {
            // InternalErasmusPrograms.g:79:2: (otherlv_0= 'ErasmusProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'totalCredits' ( (lv_totalCredits_4_0= RULE_INT ) ) (otherlv_5= 'universities' otherlv_6= '{' ( (lv_universities_7_0= ruleUniversity ) ) (otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) ) )* otherlv_10= '}' )? (otherlv_11= 'scholarships' otherlv_12= '{' ( (lv_scholarships_13_0= ruleScholarship ) ) (otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) ) )* otherlv_16= '}' )? (otherlv_17= 'associatePartners' otherlv_18= '{' ( (lv_associatePartners_19_0= ruleAssociatePartner ) ) (otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) ) )* otherlv_22= '}' )? otherlv_23= 'admissionStructure' ( (lv_admissionStructure_24_0= ruleAdmissionStructure ) ) otherlv_25= '}' )
            // InternalErasmusPrograms.g:80:3: otherlv_0= 'ErasmusProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'totalCredits' ( (lv_totalCredits_4_0= RULE_INT ) ) (otherlv_5= 'universities' otherlv_6= '{' ( (lv_universities_7_0= ruleUniversity ) ) (otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) ) )* otherlv_10= '}' )? (otherlv_11= 'scholarships' otherlv_12= '{' ( (lv_scholarships_13_0= ruleScholarship ) ) (otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) ) )* otherlv_16= '}' )? (otherlv_17= 'associatePartners' otherlv_18= '{' ( (lv_associatePartners_19_0= ruleAssociatePartner ) ) (otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) ) )* otherlv_22= '}' )? otherlv_23= 'admissionStructure' ( (lv_admissionStructure_24_0= ruleAdmissionStructure ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getErasmusProgramAccess().getErasmusProgramKeyword_0());
            		
            // InternalErasmusPrograms.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalErasmusPrograms.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getErasmusProgramAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErasmusProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getErasmusProgramAccess().getTotalCreditsKeyword_3());
            		
            // InternalErasmusPrograms.g:110:3: ( (lv_totalCredits_4_0= RULE_INT ) )
            // InternalErasmusPrograms.g:111:4: (lv_totalCredits_4_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:111:4: (lv_totalCredits_4_0= RULE_INT )
            // InternalErasmusPrograms.g:112:5: lv_totalCredits_4_0= RULE_INT
            {
            lv_totalCredits_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_totalCredits_4_0, grammarAccess.getErasmusProgramAccess().getTotalCreditsINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErasmusProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"totalCredits",
            						lv_totalCredits_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalErasmusPrograms.g:128:3: (otherlv_5= 'universities' otherlv_6= '{' ( (lv_universities_7_0= ruleUniversity ) ) (otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) ) )* otherlv_10= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalErasmusPrograms.g:129:4: otherlv_5= 'universities' otherlv_6= '{' ( (lv_universities_7_0= ruleUniversity ) ) (otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getErasmusProgramAccess().getUniversitiesKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalErasmusPrograms.g:137:4: ( (lv_universities_7_0= ruleUniversity ) )
                    // InternalErasmusPrograms.g:138:5: (lv_universities_7_0= ruleUniversity )
                    {
                    // InternalErasmusPrograms.g:138:5: (lv_universities_7_0= ruleUniversity )
                    // InternalErasmusPrograms.g:139:6: lv_universities_7_0= ruleUniversity
                    {

                    						newCompositeNode(grammarAccess.getErasmusProgramAccess().getUniversitiesUniversityParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_universities_7_0=ruleUniversity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getErasmusProgramRule());
                    						}
                    						add(
                    							current,
                    							"universities",
                    							lv_universities_7_0,
                    							"org.xtext.mde.a5.ErasmusPrograms.University");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErasmusPrograms.g:156:4: (otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalErasmusPrograms.g:157:5: otherlv_8= ',' ( (lv_universities_9_0= ruleUniversity ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getErasmusProgramAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalErasmusPrograms.g:161:5: ( (lv_universities_9_0= ruleUniversity ) )
                    	    // InternalErasmusPrograms.g:162:6: (lv_universities_9_0= ruleUniversity )
                    	    {
                    	    // InternalErasmusPrograms.g:162:6: (lv_universities_9_0= ruleUniversity )
                    	    // InternalErasmusPrograms.g:163:7: lv_universities_9_0= ruleUniversity
                    	    {

                    	    							newCompositeNode(grammarAccess.getErasmusProgramAccess().getUniversitiesUniversityParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_universities_9_0=ruleUniversity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getErasmusProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"universities",
                    	    								lv_universities_9_0,
                    	    								"org.xtext.mde.a5.ErasmusPrograms.University");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalErasmusPrograms.g:186:3: (otherlv_11= 'scholarships' otherlv_12= '{' ( (lv_scholarships_13_0= ruleScholarship ) ) (otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalErasmusPrograms.g:187:4: otherlv_11= 'scholarships' otherlv_12= '{' ( (lv_scholarships_13_0= ruleScholarship ) ) (otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getErasmusProgramAccess().getScholarshipsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalErasmusPrograms.g:195:4: ( (lv_scholarships_13_0= ruleScholarship ) )
                    // InternalErasmusPrograms.g:196:5: (lv_scholarships_13_0= ruleScholarship )
                    {
                    // InternalErasmusPrograms.g:196:5: (lv_scholarships_13_0= ruleScholarship )
                    // InternalErasmusPrograms.g:197:6: lv_scholarships_13_0= ruleScholarship
                    {

                    						newCompositeNode(grammarAccess.getErasmusProgramAccess().getScholarshipsScholarshipParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_scholarships_13_0=ruleScholarship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getErasmusProgramRule());
                    						}
                    						add(
                    							current,
                    							"scholarships",
                    							lv_scholarships_13_0,
                    							"org.xtext.mde.a5.ErasmusPrograms.Scholarship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErasmusPrograms.g:214:4: (otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalErasmusPrograms.g:215:5: otherlv_14= ',' ( (lv_scholarships_15_0= ruleScholarship ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getErasmusProgramAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalErasmusPrograms.g:219:5: ( (lv_scholarships_15_0= ruleScholarship ) )
                    	    // InternalErasmusPrograms.g:220:6: (lv_scholarships_15_0= ruleScholarship )
                    	    {
                    	    // InternalErasmusPrograms.g:220:6: (lv_scholarships_15_0= ruleScholarship )
                    	    // InternalErasmusPrograms.g:221:7: lv_scholarships_15_0= ruleScholarship
                    	    {

                    	    							newCompositeNode(grammarAccess.getErasmusProgramAccess().getScholarshipsScholarshipParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_scholarships_15_0=ruleScholarship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getErasmusProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"scholarships",
                    	    								lv_scholarships_15_0,
                    	    								"org.xtext.mde.a5.ErasmusPrograms.Scholarship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalErasmusPrograms.g:244:3: (otherlv_17= 'associatePartners' otherlv_18= '{' ( (lv_associatePartners_19_0= ruleAssociatePartner ) ) (otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) ) )* otherlv_22= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalErasmusPrograms.g:245:4: otherlv_17= 'associatePartners' otherlv_18= '{' ( (lv_associatePartners_19_0= ruleAssociatePartner ) ) (otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getErasmusProgramAccess().getAssociatePartnersKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalErasmusPrograms.g:253:4: ( (lv_associatePartners_19_0= ruleAssociatePartner ) )
                    // InternalErasmusPrograms.g:254:5: (lv_associatePartners_19_0= ruleAssociatePartner )
                    {
                    // InternalErasmusPrograms.g:254:5: (lv_associatePartners_19_0= ruleAssociatePartner )
                    // InternalErasmusPrograms.g:255:6: lv_associatePartners_19_0= ruleAssociatePartner
                    {

                    						newCompositeNode(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssociatePartnerParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_associatePartners_19_0=ruleAssociatePartner();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getErasmusProgramRule());
                    						}
                    						add(
                    							current,
                    							"associatePartners",
                    							lv_associatePartners_19_0,
                    							"org.xtext.mde.a5.ErasmusPrograms.AssociatePartner");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErasmusPrograms.g:272:4: (otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalErasmusPrograms.g:273:5: otherlv_20= ',' ( (lv_associatePartners_21_0= ruleAssociatePartner ) )
                    	    {
                    	    otherlv_20=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getErasmusProgramAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalErasmusPrograms.g:277:5: ( (lv_associatePartners_21_0= ruleAssociatePartner ) )
                    	    // InternalErasmusPrograms.g:278:6: (lv_associatePartners_21_0= ruleAssociatePartner )
                    	    {
                    	    // InternalErasmusPrograms.g:278:6: (lv_associatePartners_21_0= ruleAssociatePartner )
                    	    // InternalErasmusPrograms.g:279:7: lv_associatePartners_21_0= ruleAssociatePartner
                    	    {

                    	    							newCompositeNode(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssociatePartnerParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_associatePartners_21_0=ruleAssociatePartner();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getErasmusProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"associatePartners",
                    	    								lv_associatePartners_21_0,
                    	    								"org.xtext.mde.a5.ErasmusPrograms.AssociatePartner");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_23, grammarAccess.getErasmusProgramAccess().getAdmissionStructureKeyword_8());
            		
            // InternalErasmusPrograms.g:306:3: ( (lv_admissionStructure_24_0= ruleAdmissionStructure ) )
            // InternalErasmusPrograms.g:307:4: (lv_admissionStructure_24_0= ruleAdmissionStructure )
            {
            // InternalErasmusPrograms.g:307:4: (lv_admissionStructure_24_0= ruleAdmissionStructure )
            // InternalErasmusPrograms.g:308:5: lv_admissionStructure_24_0= ruleAdmissionStructure
            {

            					newCompositeNode(grammarAccess.getErasmusProgramAccess().getAdmissionStructureAdmissionStructureParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_admissionStructure_24_0=ruleAdmissionStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErasmusProgramRule());
            					}
            					set(
            						current,
            						"admissionStructure",
            						lv_admissionStructure_24_0,
            						"org.xtext.mde.a5.ErasmusPrograms.AdmissionStructure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErasmusProgram"


    // $ANTLR start "entryRuleScholarship"
    // InternalErasmusPrograms.g:333:1: entryRuleScholarship returns [EObject current=null] : iv_ruleScholarship= ruleScholarship EOF ;
    public final EObject entryRuleScholarship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScholarship = null;


        try {
            // InternalErasmusPrograms.g:333:52: (iv_ruleScholarship= ruleScholarship EOF )
            // InternalErasmusPrograms.g:334:2: iv_ruleScholarship= ruleScholarship EOF
            {
             newCompositeNode(grammarAccess.getScholarshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScholarship=ruleScholarship();

            state._fsp--;

             current =iv_ruleScholarship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScholarship"


    // $ANTLR start "ruleScholarship"
    // InternalErasmusPrograms.g:340:1: ruleScholarship returns [EObject current=null] : ( ( (lv_type_0_0= ruleScholarshipType ) ) otherlv_1= '{' otherlv_2= 'tuitionFee' ( (lv_tuitionFee_3_0= RULE_INT ) ) otherlv_4= 'travelGrant' ( (lv_travelGrant_5_0= RULE_INT ) ) otherlv_6= 'allowance' ( (lv_allowance_7_0= RULE_INT ) ) otherlv_8= '}' ) ;
    public final EObject ruleScholarship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tuitionFee_3_0=null;
        Token otherlv_4=null;
        Token lv_travelGrant_5_0=null;
        Token otherlv_6=null;
        Token lv_allowance_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:346:2: ( ( ( (lv_type_0_0= ruleScholarshipType ) ) otherlv_1= '{' otherlv_2= 'tuitionFee' ( (lv_tuitionFee_3_0= RULE_INT ) ) otherlv_4= 'travelGrant' ( (lv_travelGrant_5_0= RULE_INT ) ) otherlv_6= 'allowance' ( (lv_allowance_7_0= RULE_INT ) ) otherlv_8= '}' ) )
            // InternalErasmusPrograms.g:347:2: ( ( (lv_type_0_0= ruleScholarshipType ) ) otherlv_1= '{' otherlv_2= 'tuitionFee' ( (lv_tuitionFee_3_0= RULE_INT ) ) otherlv_4= 'travelGrant' ( (lv_travelGrant_5_0= RULE_INT ) ) otherlv_6= 'allowance' ( (lv_allowance_7_0= RULE_INT ) ) otherlv_8= '}' )
            {
            // InternalErasmusPrograms.g:347:2: ( ( (lv_type_0_0= ruleScholarshipType ) ) otherlv_1= '{' otherlv_2= 'tuitionFee' ( (lv_tuitionFee_3_0= RULE_INT ) ) otherlv_4= 'travelGrant' ( (lv_travelGrant_5_0= RULE_INT ) ) otherlv_6= 'allowance' ( (lv_allowance_7_0= RULE_INT ) ) otherlv_8= '}' )
            // InternalErasmusPrograms.g:348:3: ( (lv_type_0_0= ruleScholarshipType ) ) otherlv_1= '{' otherlv_2= 'tuitionFee' ( (lv_tuitionFee_3_0= RULE_INT ) ) otherlv_4= 'travelGrant' ( (lv_travelGrant_5_0= RULE_INT ) ) otherlv_6= 'allowance' ( (lv_allowance_7_0= RULE_INT ) ) otherlv_8= '}'
            {
            // InternalErasmusPrograms.g:348:3: ( (lv_type_0_0= ruleScholarshipType ) )
            // InternalErasmusPrograms.g:349:4: (lv_type_0_0= ruleScholarshipType )
            {
            // InternalErasmusPrograms.g:349:4: (lv_type_0_0= ruleScholarshipType )
            // InternalErasmusPrograms.g:350:5: lv_type_0_0= ruleScholarshipType
            {

            					newCompositeNode(grammarAccess.getScholarshipAccess().getTypeScholarshipTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleScholarshipType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScholarshipRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.mde.a5.ErasmusPrograms.ScholarshipType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getScholarshipAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getScholarshipAccess().getTuitionFeeKeyword_2());
            		
            // InternalErasmusPrograms.g:375:3: ( (lv_tuitionFee_3_0= RULE_INT ) )
            // InternalErasmusPrograms.g:376:4: (lv_tuitionFee_3_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:376:4: (lv_tuitionFee_3_0= RULE_INT )
            // InternalErasmusPrograms.g:377:5: lv_tuitionFee_3_0= RULE_INT
            {
            lv_tuitionFee_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_tuitionFee_3_0, grammarAccess.getScholarshipAccess().getTuitionFeeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScholarshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tuitionFee",
            						lv_tuitionFee_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getScholarshipAccess().getTravelGrantKeyword_4());
            		
            // InternalErasmusPrograms.g:397:3: ( (lv_travelGrant_5_0= RULE_INT ) )
            // InternalErasmusPrograms.g:398:4: (lv_travelGrant_5_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:398:4: (lv_travelGrant_5_0= RULE_INT )
            // InternalErasmusPrograms.g:399:5: lv_travelGrant_5_0= RULE_INT
            {
            lv_travelGrant_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_travelGrant_5_0, grammarAccess.getScholarshipAccess().getTravelGrantINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScholarshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"travelGrant",
            						lv_travelGrant_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getScholarshipAccess().getAllowanceKeyword_6());
            		
            // InternalErasmusPrograms.g:419:3: ( (lv_allowance_7_0= RULE_INT ) )
            // InternalErasmusPrograms.g:420:4: (lv_allowance_7_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:420:4: (lv_allowance_7_0= RULE_INT )
            // InternalErasmusPrograms.g:421:5: lv_allowance_7_0= RULE_INT
            {
            lv_allowance_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_allowance_7_0, grammarAccess.getScholarshipAccess().getAllowanceINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScholarshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"allowance",
            						lv_allowance_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getScholarshipAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScholarship"


    // $ANTLR start "entryRuleUniversity"
    // InternalErasmusPrograms.g:445:1: entryRuleUniversity returns [EObject current=null] : iv_ruleUniversity= ruleUniversity EOF ;
    public final EObject entryRuleUniversity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversity = null;


        try {
            // InternalErasmusPrograms.g:445:51: (iv_ruleUniversity= ruleUniversity EOF )
            // InternalErasmusPrograms.g:446:2: iv_ruleUniversity= ruleUniversity EOF
            {
             newCompositeNode(grammarAccess.getUniversityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniversity=ruleUniversity();

            state._fsp--;

             current =iv_ruleUniversity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniversity"


    // $ANTLR start "ruleUniversity"
    // InternalErasmusPrograms.g:452:1: ruleUniversity returns [EObject current=null] : (otherlv_0= 'University' ( (lv_universityName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'location' ( (lv_location_4_0= ruleLocation ) ) otherlv_5= 'credits' ( (lv_credits_6_0= RULE_INT ) ) (otherlv_7= 'courses' otherlv_8= '{' ( (lv_courses_9_0= ruleCourse ) ) (otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleUniversity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_universityName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_credits_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_location_4_0 = null;

        EObject lv_courses_9_0 = null;

        EObject lv_courses_11_0 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:458:2: ( (otherlv_0= 'University' ( (lv_universityName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'location' ( (lv_location_4_0= ruleLocation ) ) otherlv_5= 'credits' ( (lv_credits_6_0= RULE_INT ) ) (otherlv_7= 'courses' otherlv_8= '{' ( (lv_courses_9_0= ruleCourse ) ) (otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalErasmusPrograms.g:459:2: (otherlv_0= 'University' ( (lv_universityName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'location' ( (lv_location_4_0= ruleLocation ) ) otherlv_5= 'credits' ( (lv_credits_6_0= RULE_INT ) ) (otherlv_7= 'courses' otherlv_8= '{' ( (lv_courses_9_0= ruleCourse ) ) (otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalErasmusPrograms.g:459:2: (otherlv_0= 'University' ( (lv_universityName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'location' ( (lv_location_4_0= ruleLocation ) ) otherlv_5= 'credits' ( (lv_credits_6_0= RULE_INT ) ) (otherlv_7= 'courses' otherlv_8= '{' ( (lv_courses_9_0= ruleCourse ) ) (otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalErasmusPrograms.g:460:3: otherlv_0= 'University' ( (lv_universityName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'location' ( (lv_location_4_0= ruleLocation ) ) otherlv_5= 'credits' ( (lv_credits_6_0= RULE_INT ) ) (otherlv_7= 'courses' otherlv_8= '{' ( (lv_courses_9_0= ruleCourse ) ) (otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniversityAccess().getUniversityKeyword_0());
            		
            // InternalErasmusPrograms.g:464:3: ( (lv_universityName_1_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:465:4: (lv_universityName_1_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:465:4: (lv_universityName_1_0= RULE_STRING )
            // InternalErasmusPrograms.g:466:5: lv_universityName_1_0= RULE_STRING
            {
            lv_universityName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_universityName_1_0, grammarAccess.getUniversityAccess().getUniversityNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniversityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"universityName",
            						lv_universityName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getUniversityAccess().getLocationKeyword_3());
            		
            // InternalErasmusPrograms.g:490:3: ( (lv_location_4_0= ruleLocation ) )
            // InternalErasmusPrograms.g:491:4: (lv_location_4_0= ruleLocation )
            {
            // InternalErasmusPrograms.g:491:4: (lv_location_4_0= ruleLocation )
            // InternalErasmusPrograms.g:492:5: lv_location_4_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getUniversityAccess().getLocationLocationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_location_4_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversityRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_4_0,
            						"org.xtext.mde.a5.ErasmusPrograms.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getUniversityAccess().getCreditsKeyword_5());
            		
            // InternalErasmusPrograms.g:513:3: ( (lv_credits_6_0= RULE_INT ) )
            // InternalErasmusPrograms.g:514:4: (lv_credits_6_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:514:4: (lv_credits_6_0= RULE_INT )
            // InternalErasmusPrograms.g:515:5: lv_credits_6_0= RULE_INT
            {
            lv_credits_6_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_credits_6_0, grammarAccess.getUniversityAccess().getCreditsINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniversityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"credits",
            						lv_credits_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalErasmusPrograms.g:531:3: (otherlv_7= 'courses' otherlv_8= '{' ( (lv_courses_9_0= ruleCourse ) ) (otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) ) )* otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErasmusPrograms.g:532:4: otherlv_7= 'courses' otherlv_8= '{' ( (lv_courses_9_0= ruleCourse ) ) (otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getUniversityAccess().getCoursesKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalErasmusPrograms.g:540:4: ( (lv_courses_9_0= ruleCourse ) )
                    // InternalErasmusPrograms.g:541:5: (lv_courses_9_0= ruleCourse )
                    {
                    // InternalErasmusPrograms.g:541:5: (lv_courses_9_0= ruleCourse )
                    // InternalErasmusPrograms.g:542:6: lv_courses_9_0= ruleCourse
                    {

                    						newCompositeNode(grammarAccess.getUniversityAccess().getCoursesCourseParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_courses_9_0=ruleCourse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniversityRule());
                    						}
                    						add(
                    							current,
                    							"courses",
                    							lv_courses_9_0,
                    							"org.xtext.mde.a5.ErasmusPrograms.Course");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErasmusPrograms.g:559:4: (otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalErasmusPrograms.g:560:5: otherlv_10= ',' ( (lv_courses_11_0= ruleCourse ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getUniversityAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalErasmusPrograms.g:564:5: ( (lv_courses_11_0= ruleCourse ) )
                    	    // InternalErasmusPrograms.g:565:6: (lv_courses_11_0= ruleCourse )
                    	    {
                    	    // InternalErasmusPrograms.g:565:6: (lv_courses_11_0= ruleCourse )
                    	    // InternalErasmusPrograms.g:566:7: lv_courses_11_0= ruleCourse
                    	    {

                    	    							newCompositeNode(grammarAccess.getUniversityAccess().getCoursesCourseParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_courses_11_0=ruleCourse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUniversityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"courses",
                    	    								lv_courses_11_0,
                    	    								"org.xtext.mde.a5.ErasmusPrograms.Course");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniversity"


    // $ANTLR start "entryRuleCourse"
    // InternalErasmusPrograms.g:597:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalErasmusPrograms.g:597:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalErasmusPrograms.g:598:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalErasmusPrograms.g:604:1: ruleCourse returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'code' otherlv_2= ':' ( (lv_courseCode_3_0= RULE_STRING ) ) otherlv_4= 'name' otherlv_5= ':' ( (lv_courseName_6_0= RULE_STRING ) ) otherlv_7= 'faculty' otherlv_8= ':' ( (lv_faculty_9_0= RULE_STRING ) ) otherlv_10= 'credits' otherlv_11= ':' ( (lv_courseCredits_12_0= RULE_INT ) ) otherlv_13= '}' ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_courseCode_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_courseName_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_faculty_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_courseCredits_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:610:2: ( (otherlv_0= '{' otherlv_1= 'code' otherlv_2= ':' ( (lv_courseCode_3_0= RULE_STRING ) ) otherlv_4= 'name' otherlv_5= ':' ( (lv_courseName_6_0= RULE_STRING ) ) otherlv_7= 'faculty' otherlv_8= ':' ( (lv_faculty_9_0= RULE_STRING ) ) otherlv_10= 'credits' otherlv_11= ':' ( (lv_courseCredits_12_0= RULE_INT ) ) otherlv_13= '}' ) )
            // InternalErasmusPrograms.g:611:2: (otherlv_0= '{' otherlv_1= 'code' otherlv_2= ':' ( (lv_courseCode_3_0= RULE_STRING ) ) otherlv_4= 'name' otherlv_5= ':' ( (lv_courseName_6_0= RULE_STRING ) ) otherlv_7= 'faculty' otherlv_8= ':' ( (lv_faculty_9_0= RULE_STRING ) ) otherlv_10= 'credits' otherlv_11= ':' ( (lv_courseCredits_12_0= RULE_INT ) ) otherlv_13= '}' )
            {
            // InternalErasmusPrograms.g:611:2: (otherlv_0= '{' otherlv_1= 'code' otherlv_2= ':' ( (lv_courseCode_3_0= RULE_STRING ) ) otherlv_4= 'name' otherlv_5= ':' ( (lv_courseName_6_0= RULE_STRING ) ) otherlv_7= 'faculty' otherlv_8= ':' ( (lv_faculty_9_0= RULE_STRING ) ) otherlv_10= 'credits' otherlv_11= ':' ( (lv_courseCredits_12_0= RULE_INT ) ) otherlv_13= '}' )
            // InternalErasmusPrograms.g:612:3: otherlv_0= '{' otherlv_1= 'code' otherlv_2= ':' ( (lv_courseCode_3_0= RULE_STRING ) ) otherlv_4= 'name' otherlv_5= ':' ( (lv_courseName_6_0= RULE_STRING ) ) otherlv_7= 'faculty' otherlv_8= ':' ( (lv_faculty_9_0= RULE_STRING ) ) otherlv_10= 'credits' otherlv_11= ':' ( (lv_courseCredits_12_0= RULE_INT ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getCourseAccess().getCodeKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getColonKeyword_2());
            		
            // InternalErasmusPrograms.g:624:3: ( (lv_courseCode_3_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:625:4: (lv_courseCode_3_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:625:4: (lv_courseCode_3_0= RULE_STRING )
            // InternalErasmusPrograms.g:626:5: lv_courseCode_3_0= RULE_STRING
            {
            lv_courseCode_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_courseCode_3_0, grammarAccess.getCourseAccess().getCourseCodeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"courseCode",
            						lv_courseCode_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getColonKeyword_5());
            		
            // InternalErasmusPrograms.g:650:3: ( (lv_courseName_6_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:651:4: (lv_courseName_6_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:651:4: (lv_courseName_6_0= RULE_STRING )
            // InternalErasmusPrograms.g:652:5: lv_courseName_6_0= RULE_STRING
            {
            lv_courseName_6_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_courseName_6_0, grammarAccess.getCourseAccess().getCourseNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"courseName",
            						lv_courseName_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getCourseAccess().getFacultyKeyword_7());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getCourseAccess().getColonKeyword_8());
            		
            // InternalErasmusPrograms.g:676:3: ( (lv_faculty_9_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:677:4: (lv_faculty_9_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:677:4: (lv_faculty_9_0= RULE_STRING )
            // InternalErasmusPrograms.g:678:5: lv_faculty_9_0= RULE_STRING
            {
            lv_faculty_9_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_faculty_9_0, grammarAccess.getCourseAccess().getFacultySTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"faculty",
            						lv_faculty_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_10, grammarAccess.getCourseAccess().getCreditsKeyword_10());
            		
            otherlv_11=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getCourseAccess().getColonKeyword_11());
            		
            // InternalErasmusPrograms.g:702:3: ( (lv_courseCredits_12_0= RULE_INT ) )
            // InternalErasmusPrograms.g:703:4: (lv_courseCredits_12_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:703:4: (lv_courseCredits_12_0= RULE_INT )
            // InternalErasmusPrograms.g:704:5: lv_courseCredits_12_0= RULE_INT
            {
            lv_courseCredits_12_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_courseCredits_12_0, grammarAccess.getCourseAccess().getCourseCreditsINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"courseCredits",
            						lv_courseCredits_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleLocation"
    // InternalErasmusPrograms.g:728:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalErasmusPrograms.g:728:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalErasmusPrograms.g:729:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalErasmusPrograms.g:735:1: ruleLocation returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'country' otherlv_2= ':' ( (lv_countryName_3_0= RULE_STRING ) ) otherlv_4= 'city' otherlv_5= ':' ( (lv_cityName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_countryName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_cityName_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:741:2: ( (otherlv_0= '{' otherlv_1= 'country' otherlv_2= ':' ( (lv_countryName_3_0= RULE_STRING ) ) otherlv_4= 'city' otherlv_5= ':' ( (lv_cityName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalErasmusPrograms.g:742:2: (otherlv_0= '{' otherlv_1= 'country' otherlv_2= ':' ( (lv_countryName_3_0= RULE_STRING ) ) otherlv_4= 'city' otherlv_5= ':' ( (lv_cityName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalErasmusPrograms.g:742:2: (otherlv_0= '{' otherlv_1= 'country' otherlv_2= ':' ( (lv_countryName_3_0= RULE_STRING ) ) otherlv_4= 'city' otherlv_5= ':' ( (lv_cityName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalErasmusPrograms.g:743:3: otherlv_0= '{' otherlv_1= 'country' otherlv_2= ':' ( (lv_countryName_3_0= RULE_STRING ) ) otherlv_4= 'city' otherlv_5= ':' ( (lv_cityName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getCountryKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getColonKeyword_2());
            		
            // InternalErasmusPrograms.g:755:3: ( (lv_countryName_3_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:756:4: (lv_countryName_3_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:756:4: (lv_countryName_3_0= RULE_STRING )
            // InternalErasmusPrograms.g:757:5: lv_countryName_3_0= RULE_STRING
            {
            lv_countryName_3_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_countryName_3_0, grammarAccess.getLocationAccess().getCountryNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"countryName",
            						lv_countryName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getCityKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getColonKeyword_5());
            		
            // InternalErasmusPrograms.g:781:3: ( (lv_cityName_6_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:782:4: (lv_cityName_6_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:782:4: (lv_cityName_6_0= RULE_STRING )
            // InternalErasmusPrograms.g:783:5: lv_cityName_6_0= RULE_STRING
            {
            lv_cityName_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_cityName_6_0, grammarAccess.getLocationAccess().getCityNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cityName",
            						lv_cityName_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleAssociatePartner"
    // InternalErasmusPrograms.g:807:1: entryRuleAssociatePartner returns [EObject current=null] : iv_ruleAssociatePartner= ruleAssociatePartner EOF ;
    public final EObject entryRuleAssociatePartner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociatePartner = null;


        try {
            // InternalErasmusPrograms.g:807:57: (iv_ruleAssociatePartner= ruleAssociatePartner EOF )
            // InternalErasmusPrograms.g:808:2: iv_ruleAssociatePartner= ruleAssociatePartner EOF
            {
             newCompositeNode(grammarAccess.getAssociatePartnerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociatePartner=ruleAssociatePartner();

            state._fsp--;

             current =iv_ruleAssociatePartner; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociatePartner"


    // $ANTLR start "ruleAssociatePartner"
    // InternalErasmusPrograms.g:814:1: ruleAssociatePartner returns [EObject current=null] : ( ( (lv_partnerName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_type_2_0= rulePartnerType ) ) otherlv_3= ')' ) ;
    public final EObject ruleAssociatePartner() throws RecognitionException {
        EObject current = null;

        Token lv_partnerName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:820:2: ( ( ( (lv_partnerName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_type_2_0= rulePartnerType ) ) otherlv_3= ')' ) )
            // InternalErasmusPrograms.g:821:2: ( ( (lv_partnerName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_type_2_0= rulePartnerType ) ) otherlv_3= ')' )
            {
            // InternalErasmusPrograms.g:821:2: ( ( (lv_partnerName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_type_2_0= rulePartnerType ) ) otherlv_3= ')' )
            // InternalErasmusPrograms.g:822:3: ( (lv_partnerName_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_type_2_0= rulePartnerType ) ) otherlv_3= ')'
            {
            // InternalErasmusPrograms.g:822:3: ( (lv_partnerName_0_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:823:4: (lv_partnerName_0_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:823:4: (lv_partnerName_0_0= RULE_STRING )
            // InternalErasmusPrograms.g:824:5: lv_partnerName_0_0= RULE_STRING
            {
            lv_partnerName_0_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_partnerName_0_0, grammarAccess.getAssociatePartnerAccess().getPartnerNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociatePartnerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"partnerName",
            						lv_partnerName_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociatePartnerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalErasmusPrograms.g:844:3: ( (lv_type_2_0= rulePartnerType ) )
            // InternalErasmusPrograms.g:845:4: (lv_type_2_0= rulePartnerType )
            {
            // InternalErasmusPrograms.g:845:4: (lv_type_2_0= rulePartnerType )
            // InternalErasmusPrograms.g:846:5: lv_type_2_0= rulePartnerType
            {

            					newCompositeNode(grammarAccess.getAssociatePartnerAccess().getTypePartnerTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_type_2_0=rulePartnerType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociatePartnerRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.mde.a5.ErasmusPrograms.PartnerType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociatePartnerAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociatePartner"


    // $ANTLR start "entryRuleAdmissionStructure"
    // InternalErasmusPrograms.g:871:1: entryRuleAdmissionStructure returns [EObject current=null] : iv_ruleAdmissionStructure= ruleAdmissionStructure EOF ;
    public final EObject entryRuleAdmissionStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdmissionStructure = null;


        try {
            // InternalErasmusPrograms.g:871:59: (iv_ruleAdmissionStructure= ruleAdmissionStructure EOF )
            // InternalErasmusPrograms.g:872:2: iv_ruleAdmissionStructure= ruleAdmissionStructure EOF
            {
             newCompositeNode(grammarAccess.getAdmissionStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdmissionStructure=ruleAdmissionStructure();

            state._fsp--;

             current =iv_ruleAdmissionStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdmissionStructure"


    // $ANTLR start "ruleAdmissionStructure"
    // InternalErasmusPrograms.g:878:1: ruleAdmissionStructure returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'applicationProcess' ( (lv_applicationProcess_2_0= ruleApplicationProcess ) ) (otherlv_3= 'requirements' otherlv_4= '{' ( (lv_requierements_5_0= ruleRequirement ) ) (otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) ) )* otherlv_8= '}' )? (otherlv_9= 'results' otherlv_10= '{' ( (lv_results_11_0= ruleResults ) ) (otherlv_12= ',' ( (lv_results_13_0= ruleResults ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleAdmissionStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_applicationProcess_2_0 = null;

        EObject lv_requierements_5_0 = null;

        EObject lv_requierements_7_0 = null;

        EObject lv_results_11_0 = null;

        EObject lv_results_13_0 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:884:2: ( (otherlv_0= '{' otherlv_1= 'applicationProcess' ( (lv_applicationProcess_2_0= ruleApplicationProcess ) ) (otherlv_3= 'requirements' otherlv_4= '{' ( (lv_requierements_5_0= ruleRequirement ) ) (otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) ) )* otherlv_8= '}' )? (otherlv_9= 'results' otherlv_10= '{' ( (lv_results_11_0= ruleResults ) ) (otherlv_12= ',' ( (lv_results_13_0= ruleResults ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalErasmusPrograms.g:885:2: (otherlv_0= '{' otherlv_1= 'applicationProcess' ( (lv_applicationProcess_2_0= ruleApplicationProcess ) ) (otherlv_3= 'requirements' otherlv_4= '{' ( (lv_requierements_5_0= ruleRequirement ) ) (otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) ) )* otherlv_8= '}' )? (otherlv_9= 'results' otherlv_10= '{' ( (lv_results_11_0= ruleResults ) ) (otherlv_12= ',' ( (lv_results_13_0= ruleResults ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalErasmusPrograms.g:885:2: (otherlv_0= '{' otherlv_1= 'applicationProcess' ( (lv_applicationProcess_2_0= ruleApplicationProcess ) ) (otherlv_3= 'requirements' otherlv_4= '{' ( (lv_requierements_5_0= ruleRequirement ) ) (otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) ) )* otherlv_8= '}' )? (otherlv_9= 'results' otherlv_10= '{' ( (lv_results_11_0= ruleResults ) ) (otherlv_12= ',' ( (lv_results_13_0= ruleResults ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalErasmusPrograms.g:886:3: otherlv_0= '{' otherlv_1= 'applicationProcess' ( (lv_applicationProcess_2_0= ruleApplicationProcess ) ) (otherlv_3= 'requirements' otherlv_4= '{' ( (lv_requierements_5_0= ruleRequirement ) ) (otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) ) )* otherlv_8= '}' )? (otherlv_9= 'results' otherlv_10= '{' ( (lv_results_11_0= ruleResults ) ) (otherlv_12= ',' ( (lv_results_13_0= ruleResults ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAdmissionStructureAccess().getApplicationProcessKeyword_1());
            		
            // InternalErasmusPrograms.g:894:3: ( (lv_applicationProcess_2_0= ruleApplicationProcess ) )
            // InternalErasmusPrograms.g:895:4: (lv_applicationProcess_2_0= ruleApplicationProcess )
            {
            // InternalErasmusPrograms.g:895:4: (lv_applicationProcess_2_0= ruleApplicationProcess )
            // InternalErasmusPrograms.g:896:5: lv_applicationProcess_2_0= ruleApplicationProcess
            {

            					newCompositeNode(grammarAccess.getAdmissionStructureAccess().getApplicationProcessApplicationProcessParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_applicationProcess_2_0=ruleApplicationProcess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdmissionStructureRule());
            					}
            					set(
            						current,
            						"applicationProcess",
            						lv_applicationProcess_2_0,
            						"org.xtext.mde.a5.ErasmusPrograms.ApplicationProcess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalErasmusPrograms.g:913:3: (otherlv_3= 'requirements' otherlv_4= '{' ( (lv_requierements_5_0= ruleRequirement ) ) (otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalErasmusPrograms.g:914:4: otherlv_3= 'requirements' otherlv_4= '{' ( (lv_requierements_5_0= ruleRequirement ) ) (otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAdmissionStructureAccess().getRequirementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalErasmusPrograms.g:922:4: ( (lv_requierements_5_0= ruleRequirement ) )
                    // InternalErasmusPrograms.g:923:5: (lv_requierements_5_0= ruleRequirement )
                    {
                    // InternalErasmusPrograms.g:923:5: (lv_requierements_5_0= ruleRequirement )
                    // InternalErasmusPrograms.g:924:6: lv_requierements_5_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getAdmissionStructureAccess().getRequierementsRequirementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_requierements_5_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdmissionStructureRule());
                    						}
                    						add(
                    							current,
                    							"requierements",
                    							lv_requierements_5_0,
                    							"org.xtext.mde.a5.ErasmusPrograms.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErasmusPrograms.g:941:4: (otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalErasmusPrograms.g:942:5: otherlv_6= ',' ( (lv_requierements_7_0= ruleRequirement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_32); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAdmissionStructureAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalErasmusPrograms.g:946:5: ( (lv_requierements_7_0= ruleRequirement ) )
                    	    // InternalErasmusPrograms.g:947:6: (lv_requierements_7_0= ruleRequirement )
                    	    {
                    	    // InternalErasmusPrograms.g:947:6: (lv_requierements_7_0= ruleRequirement )
                    	    // InternalErasmusPrograms.g:948:7: lv_requierements_7_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAdmissionStructureAccess().getRequierementsRequirementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_requierements_7_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAdmissionStructureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requierements",
                    	    								lv_requierements_7_0,
                    	    								"org.xtext.mde.a5.ErasmusPrograms.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalErasmusPrograms.g:971:3: (otherlv_9= 'results' otherlv_10= '{' ( (lv_results_11_0= ruleResults ) ) (otherlv_12= ',' ( (lv_results_13_0= ruleResults ) ) )* otherlv_14= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalErasmusPrograms.g:972:4: otherlv_9= 'results' otherlv_10= '{' ( (lv_results_11_0= ruleResults ) ) (otherlv_12= ',' ( (lv_results_13_0= ruleResults ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAdmissionStructureAccess().getResultsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalErasmusPrograms.g:980:4: ( (lv_results_11_0= ruleResults ) )
                    // InternalErasmusPrograms.g:981:5: (lv_results_11_0= ruleResults )
                    {
                    // InternalErasmusPrograms.g:981:5: (lv_results_11_0= ruleResults )
                    // InternalErasmusPrograms.g:982:6: lv_results_11_0= ruleResults
                    {

                    						newCompositeNode(grammarAccess.getAdmissionStructureAccess().getResultsResultsParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_results_11_0=ruleResults();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdmissionStructureRule());
                    						}
                    						add(
                    							current,
                    							"results",
                    							lv_results_11_0,
                    							"org.xtext.mde.a5.ErasmusPrograms.Results");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErasmusPrograms.g:999:4: (otherlv_12= ',' ( (lv_results_13_0= ruleResults ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalErasmusPrograms.g:1000:5: otherlv_12= ',' ( (lv_results_13_0= ruleResults ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_34); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAdmissionStructureAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalErasmusPrograms.g:1004:5: ( (lv_results_13_0= ruleResults ) )
                    	    // InternalErasmusPrograms.g:1005:6: (lv_results_13_0= ruleResults )
                    	    {
                    	    // InternalErasmusPrograms.g:1005:6: (lv_results_13_0= ruleResults )
                    	    // InternalErasmusPrograms.g:1006:7: lv_results_13_0= ruleResults
                    	    {

                    	    							newCompositeNode(grammarAccess.getAdmissionStructureAccess().getResultsResultsParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_results_13_0=ruleResults();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAdmissionStructureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"results",
                    	    								lv_results_13_0,
                    	    								"org.xtext.mde.a5.ErasmusPrograms.Results");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdmissionStructure"


    // $ANTLR start "entryRuleResults"
    // InternalErasmusPrograms.g:1037:1: entryRuleResults returns [EObject current=null] : iv_ruleResults= ruleResults EOF ;
    public final EObject entryRuleResults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResults = null;


        try {
            // InternalErasmusPrograms.g:1037:48: (iv_ruleResults= ruleResults EOF )
            // InternalErasmusPrograms.g:1038:2: iv_ruleResults= ruleResults EOF
            {
             newCompositeNode(grammarAccess.getResultsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResults=ruleResults();

            state._fsp--;

             current =iv_ruleResults; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResults"


    // $ANTLR start "ruleResults"
    // InternalErasmusPrograms.g:1044:1: ruleResults returns [EObject current=null] : (otherlv_0= 'Year' ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'totalAdmitted' ( (lv_totalAdmitted_4_0= RULE_INT ) ) otherlv_5= 'scholarshipsAwarded' ( (lv_scholarshipsAwarded_6_0= RULE_INT ) ) (otherlv_7= 'admittedStudents' otherlv_8= '{' ( (lv_admittedStudents_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleResults() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_year_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_totalAdmitted_4_0=null;
        Token otherlv_5=null;
        Token lv_scholarshipsAwarded_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_admittedStudents_9_0=null;
        Token otherlv_10=null;
        Token lv_admittedStudents_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:1050:2: ( (otherlv_0= 'Year' ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'totalAdmitted' ( (lv_totalAdmitted_4_0= RULE_INT ) ) otherlv_5= 'scholarshipsAwarded' ( (lv_scholarshipsAwarded_6_0= RULE_INT ) ) (otherlv_7= 'admittedStudents' otherlv_8= '{' ( (lv_admittedStudents_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalErasmusPrograms.g:1051:2: (otherlv_0= 'Year' ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'totalAdmitted' ( (lv_totalAdmitted_4_0= RULE_INT ) ) otherlv_5= 'scholarshipsAwarded' ( (lv_scholarshipsAwarded_6_0= RULE_INT ) ) (otherlv_7= 'admittedStudents' otherlv_8= '{' ( (lv_admittedStudents_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalErasmusPrograms.g:1051:2: (otherlv_0= 'Year' ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'totalAdmitted' ( (lv_totalAdmitted_4_0= RULE_INT ) ) otherlv_5= 'scholarshipsAwarded' ( (lv_scholarshipsAwarded_6_0= RULE_INT ) ) (otherlv_7= 'admittedStudents' otherlv_8= '{' ( (lv_admittedStudents_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalErasmusPrograms.g:1052:3: otherlv_0= 'Year' ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'totalAdmitted' ( (lv_totalAdmitted_4_0= RULE_INT ) ) otherlv_5= 'scholarshipsAwarded' ( (lv_scholarshipsAwarded_6_0= RULE_INT ) ) (otherlv_7= 'admittedStudents' otherlv_8= '{' ( (lv_admittedStudents_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getResultsAccess().getYearKeyword_0());
            		
            // InternalErasmusPrograms.g:1056:3: ( (lv_year_1_0= RULE_INT ) )
            // InternalErasmusPrograms.g:1057:4: (lv_year_1_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:1057:4: (lv_year_1_0= RULE_INT )
            // InternalErasmusPrograms.g:1058:5: lv_year_1_0= RULE_INT
            {
            lv_year_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_year_1_0, grammarAccess.getResultsAccess().getYearINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResultsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getResultsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getResultsAccess().getTotalAdmittedKeyword_3());
            		
            // InternalErasmusPrograms.g:1082:3: ( (lv_totalAdmitted_4_0= RULE_INT ) )
            // InternalErasmusPrograms.g:1083:4: (lv_totalAdmitted_4_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:1083:4: (lv_totalAdmitted_4_0= RULE_INT )
            // InternalErasmusPrograms.g:1084:5: lv_totalAdmitted_4_0= RULE_INT
            {
            lv_totalAdmitted_4_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            					newLeafNode(lv_totalAdmitted_4_0, grammarAccess.getResultsAccess().getTotalAdmittedINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResultsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"totalAdmitted",
            						lv_totalAdmitted_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getResultsAccess().getScholarshipsAwardedKeyword_5());
            		
            // InternalErasmusPrograms.g:1104:3: ( (lv_scholarshipsAwarded_6_0= RULE_INT ) )
            // InternalErasmusPrograms.g:1105:4: (lv_scholarshipsAwarded_6_0= RULE_INT )
            {
            // InternalErasmusPrograms.g:1105:4: (lv_scholarshipsAwarded_6_0= RULE_INT )
            // InternalErasmusPrograms.g:1106:5: lv_scholarshipsAwarded_6_0= RULE_INT
            {
            lv_scholarshipsAwarded_6_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            					newLeafNode(lv_scholarshipsAwarded_6_0, grammarAccess.getResultsAccess().getScholarshipsAwardedINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResultsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scholarshipsAwarded",
            						lv_scholarshipsAwarded_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalErasmusPrograms.g:1122:3: (otherlv_7= 'admittedStudents' otherlv_8= '{' ( (lv_admittedStudents_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) ) )* otherlv_12= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalErasmusPrograms.g:1123:4: otherlv_7= 'admittedStudents' otherlv_8= '{' ( (lv_admittedStudents_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getResultsAccess().getAdmittedStudentsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getResultsAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalErasmusPrograms.g:1131:4: ( (lv_admittedStudents_9_0= RULE_STRING ) )
                    // InternalErasmusPrograms.g:1132:5: (lv_admittedStudents_9_0= RULE_STRING )
                    {
                    // InternalErasmusPrograms.g:1132:5: (lv_admittedStudents_9_0= RULE_STRING )
                    // InternalErasmusPrograms.g:1133:6: lv_admittedStudents_9_0= RULE_STRING
                    {
                    lv_admittedStudents_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_admittedStudents_9_0, grammarAccess.getResultsAccess().getAdmittedStudentsSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResultsRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"admittedStudents",
                    							lv_admittedStudents_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalErasmusPrograms.g:1149:4: (otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalErasmusPrograms.g:1150:5: otherlv_10= ',' ( (lv_admittedStudents_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getResultsAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalErasmusPrograms.g:1154:5: ( (lv_admittedStudents_11_0= RULE_STRING ) )
                    	    // InternalErasmusPrograms.g:1155:6: (lv_admittedStudents_11_0= RULE_STRING )
                    	    {
                    	    // InternalErasmusPrograms.g:1155:6: (lv_admittedStudents_11_0= RULE_STRING )
                    	    // InternalErasmusPrograms.g:1156:7: lv_admittedStudents_11_0= RULE_STRING
                    	    {
                    	    lv_admittedStudents_11_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    	    							newLeafNode(lv_admittedStudents_11_0, grammarAccess.getResultsAccess().getAdmittedStudentsSTRINGTerminalRuleCall_7_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResultsRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"admittedStudents",
                    	    								lv_admittedStudents_11_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getResultsAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getResultsAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResults"


    // $ANTLR start "entryRuleRequirement"
    // InternalErasmusPrograms.g:1186:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalErasmusPrograms.g:1186:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalErasmusPrograms.g:1187:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalErasmusPrograms.g:1193:1: ruleRequirement returns [EObject current=null] : (this_DocumentRequirement_0= ruleDocumentRequirement | this_DegreeRequirement_1= ruleDegreeRequirement | this_LanguageRequirement_2= ruleLanguageRequirement ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_DocumentRequirement_0 = null;

        EObject this_DegreeRequirement_1 = null;

        EObject this_LanguageRequirement_2 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:1199:2: ( (this_DocumentRequirement_0= ruleDocumentRequirement | this_DegreeRequirement_1= ruleDegreeRequirement | this_LanguageRequirement_2= ruleLanguageRequirement ) )
            // InternalErasmusPrograms.g:1200:2: (this_DocumentRequirement_0= ruleDocumentRequirement | this_DegreeRequirement_1= ruleDegreeRequirement | this_LanguageRequirement_2= ruleLanguageRequirement )
            {
            // InternalErasmusPrograms.g:1200:2: (this_DocumentRequirement_0= ruleDocumentRequirement | this_DegreeRequirement_1= ruleDegreeRequirement | this_LanguageRequirement_2= ruleLanguageRequirement )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt15=1;
                }
                break;
            case 46:
                {
                alt15=2;
                }
                break;
            case 50:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalErasmusPrograms.g:1201:3: this_DocumentRequirement_0= ruleDocumentRequirement
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getDocumentRequirementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DocumentRequirement_0=ruleDocumentRequirement();

                    state._fsp--;


                    			current = this_DocumentRequirement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:1210:3: this_DegreeRequirement_1= ruleDegreeRequirement
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getDegreeRequirementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DegreeRequirement_1=ruleDegreeRequirement();

                    state._fsp--;


                    			current = this_DegreeRequirement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalErasmusPrograms.g:1219:3: this_LanguageRequirement_2= ruleLanguageRequirement
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getLanguageRequirementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LanguageRequirement_2=ruleLanguageRequirement();

                    state._fsp--;


                    			current = this_LanguageRequirement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleDocumentRequirement"
    // InternalErasmusPrograms.g:1231:1: entryRuleDocumentRequirement returns [EObject current=null] : iv_ruleDocumentRequirement= ruleDocumentRequirement EOF ;
    public final EObject entryRuleDocumentRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentRequirement = null;


        try {
            // InternalErasmusPrograms.g:1231:60: (iv_ruleDocumentRequirement= ruleDocumentRequirement EOF )
            // InternalErasmusPrograms.g:1232:2: iv_ruleDocumentRequirement= ruleDocumentRequirement EOF
            {
             newCompositeNode(grammarAccess.getDocumentRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentRequirement=ruleDocumentRequirement();

            state._fsp--;

             current =iv_ruleDocumentRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentRequirement"


    // $ANTLR start "ruleDocumentRequirement"
    // InternalErasmusPrograms.g:1238:1: ruleDocumentRequirement returns [EObject current=null] : (otherlv_0= 'DocumentRequirement' otherlv_1= '{' otherlv_2= 'documentName' ( (lv_documentName_3_0= RULE_STRING ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleDocumentRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_documentName_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:1244:2: ( (otherlv_0= 'DocumentRequirement' otherlv_1= '{' otherlv_2= 'documentName' ( (lv_documentName_3_0= RULE_STRING ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalErasmusPrograms.g:1245:2: (otherlv_0= 'DocumentRequirement' otherlv_1= '{' otherlv_2= 'documentName' ( (lv_documentName_3_0= RULE_STRING ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalErasmusPrograms.g:1245:2: (otherlv_0= 'DocumentRequirement' otherlv_1= '{' otherlv_2= 'documentName' ( (lv_documentName_3_0= RULE_STRING ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalErasmusPrograms.g:1246:3: otherlv_0= 'DocumentRequirement' otherlv_1= '{' otherlv_2= 'documentName' ( (lv_documentName_3_0= RULE_STRING ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentRequirementAccess().getDocumentRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentRequirementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDocumentRequirementAccess().getDocumentNameKeyword_2());
            		
            // InternalErasmusPrograms.g:1258:3: ( (lv_documentName_3_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:1259:4: (lv_documentName_3_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:1259:4: (lv_documentName_3_0= RULE_STRING )
            // InternalErasmusPrograms.g:1260:5: lv_documentName_3_0= RULE_STRING
            {
            lv_documentName_3_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_documentName_3_0, grammarAccess.getDocumentRequirementAccess().getDocumentNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"documentName",
            						lv_documentName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDocumentRequirementAccess().getDescriptionKeyword_4());
            		
            // InternalErasmusPrograms.g:1280:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:1281:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:1281:4: (lv_description_5_0= RULE_STRING )
            // InternalErasmusPrograms.g:1282:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_description_5_0, grammarAccess.getDocumentRequirementAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDocumentRequirementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentRequirement"


    // $ANTLR start "entryRuleDegreeRequirement"
    // InternalErasmusPrograms.g:1306:1: entryRuleDegreeRequirement returns [EObject current=null] : iv_ruleDegreeRequirement= ruleDegreeRequirement EOF ;
    public final EObject entryRuleDegreeRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDegreeRequirement = null;


        try {
            // InternalErasmusPrograms.g:1306:58: (iv_ruleDegreeRequirement= ruleDegreeRequirement EOF )
            // InternalErasmusPrograms.g:1307:2: iv_ruleDegreeRequirement= ruleDegreeRequirement EOF
            {
             newCompositeNode(grammarAccess.getDegreeRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDegreeRequirement=ruleDegreeRequirement();

            state._fsp--;

             current =iv_ruleDegreeRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDegreeRequirement"


    // $ANTLR start "ruleDegreeRequirement"
    // InternalErasmusPrograms.g:1313:1: ruleDegreeRequirement returns [EObject current=null] : (otherlv_0= 'DegreeRequirement' otherlv_1= '{' otherlv_2= 'degreeName' ( (lv_degreeName_3_0= RULE_STRING ) ) otherlv_4= 'fieldOfStudy' ( (lv_fieldOfStudy_5_0= RULE_STRING ) ) otherlv_6= 'level' ( (lv_level_7_0= ruleDegreeLevel ) ) otherlv_8= '}' ) ;
    public final EObject ruleDegreeRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_degreeName_3_0=null;
        Token otherlv_4=null;
        Token lv_fieldOfStudy_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_level_7_0 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:1319:2: ( (otherlv_0= 'DegreeRequirement' otherlv_1= '{' otherlv_2= 'degreeName' ( (lv_degreeName_3_0= RULE_STRING ) ) otherlv_4= 'fieldOfStudy' ( (lv_fieldOfStudy_5_0= RULE_STRING ) ) otherlv_6= 'level' ( (lv_level_7_0= ruleDegreeLevel ) ) otherlv_8= '}' ) )
            // InternalErasmusPrograms.g:1320:2: (otherlv_0= 'DegreeRequirement' otherlv_1= '{' otherlv_2= 'degreeName' ( (lv_degreeName_3_0= RULE_STRING ) ) otherlv_4= 'fieldOfStudy' ( (lv_fieldOfStudy_5_0= RULE_STRING ) ) otherlv_6= 'level' ( (lv_level_7_0= ruleDegreeLevel ) ) otherlv_8= '}' )
            {
            // InternalErasmusPrograms.g:1320:2: (otherlv_0= 'DegreeRequirement' otherlv_1= '{' otherlv_2= 'degreeName' ( (lv_degreeName_3_0= RULE_STRING ) ) otherlv_4= 'fieldOfStudy' ( (lv_fieldOfStudy_5_0= RULE_STRING ) ) otherlv_6= 'level' ( (lv_level_7_0= ruleDegreeLevel ) ) otherlv_8= '}' )
            // InternalErasmusPrograms.g:1321:3: otherlv_0= 'DegreeRequirement' otherlv_1= '{' otherlv_2= 'degreeName' ( (lv_degreeName_3_0= RULE_STRING ) ) otherlv_4= 'fieldOfStudy' ( (lv_fieldOfStudy_5_0= RULE_STRING ) ) otherlv_6= 'level' ( (lv_level_7_0= ruleDegreeLevel ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDegreeRequirementAccess().getDegreeRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getDegreeRequirementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDegreeRequirementAccess().getDegreeNameKeyword_2());
            		
            // InternalErasmusPrograms.g:1333:3: ( (lv_degreeName_3_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:1334:4: (lv_degreeName_3_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:1334:4: (lv_degreeName_3_0= RULE_STRING )
            // InternalErasmusPrograms.g:1335:5: lv_degreeName_3_0= RULE_STRING
            {
            lv_degreeName_3_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_degreeName_3_0, grammarAccess.getDegreeRequirementAccess().getDegreeNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degreeName",
            						lv_degreeName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDegreeRequirementAccess().getFieldOfStudyKeyword_4());
            		
            // InternalErasmusPrograms.g:1355:3: ( (lv_fieldOfStudy_5_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:1356:4: (lv_fieldOfStudy_5_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:1356:4: (lv_fieldOfStudy_5_0= RULE_STRING )
            // InternalErasmusPrograms.g:1357:5: lv_fieldOfStudy_5_0= RULE_STRING
            {
            lv_fieldOfStudy_5_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_fieldOfStudy_5_0, grammarAccess.getDegreeRequirementAccess().getFieldOfStudySTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fieldOfStudy",
            						lv_fieldOfStudy_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_43); 

            			newLeafNode(otherlv_6, grammarAccess.getDegreeRequirementAccess().getLevelKeyword_6());
            		
            // InternalErasmusPrograms.g:1377:3: ( (lv_level_7_0= ruleDegreeLevel ) )
            // InternalErasmusPrograms.g:1378:4: (lv_level_7_0= ruleDegreeLevel )
            {
            // InternalErasmusPrograms.g:1378:4: (lv_level_7_0= ruleDegreeLevel )
            // InternalErasmusPrograms.g:1379:5: lv_level_7_0= ruleDegreeLevel
            {

            					newCompositeNode(grammarAccess.getDegreeRequirementAccess().getLevelDegreeLevelEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_level_7_0=ruleDegreeLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDegreeRequirementRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_7_0,
            						"org.xtext.mde.a5.ErasmusPrograms.DegreeLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDegreeRequirementAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDegreeRequirement"


    // $ANTLR start "entryRuleLanguageRequirement"
    // InternalErasmusPrograms.g:1404:1: entryRuleLanguageRequirement returns [EObject current=null] : iv_ruleLanguageRequirement= ruleLanguageRequirement EOF ;
    public final EObject entryRuleLanguageRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageRequirement = null;


        try {
            // InternalErasmusPrograms.g:1404:60: (iv_ruleLanguageRequirement= ruleLanguageRequirement EOF )
            // InternalErasmusPrograms.g:1405:2: iv_ruleLanguageRequirement= ruleLanguageRequirement EOF
            {
             newCompositeNode(grammarAccess.getLanguageRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageRequirement=ruleLanguageRequirement();

            state._fsp--;

             current =iv_ruleLanguageRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageRequirement"


    // $ANTLR start "ruleLanguageRequirement"
    // InternalErasmusPrograms.g:1411:1: ruleLanguageRequirement returns [EObject current=null] : (otherlv_0= 'LanguageRequirement' otherlv_1= '{' otherlv_2= 'language' ( (lv_languageName_3_0= RULE_STRING ) ) otherlv_4= 'level' ( (lv_level_5_0= ruleLanguageLevel ) ) otherlv_6= '}' ) ;
    public final EObject ruleLanguageRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_languageName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_level_5_0 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:1417:2: ( (otherlv_0= 'LanguageRequirement' otherlv_1= '{' otherlv_2= 'language' ( (lv_languageName_3_0= RULE_STRING ) ) otherlv_4= 'level' ( (lv_level_5_0= ruleLanguageLevel ) ) otherlv_6= '}' ) )
            // InternalErasmusPrograms.g:1418:2: (otherlv_0= 'LanguageRequirement' otherlv_1= '{' otherlv_2= 'language' ( (lv_languageName_3_0= RULE_STRING ) ) otherlv_4= 'level' ( (lv_level_5_0= ruleLanguageLevel ) ) otherlv_6= '}' )
            {
            // InternalErasmusPrograms.g:1418:2: (otherlv_0= 'LanguageRequirement' otherlv_1= '{' otherlv_2= 'language' ( (lv_languageName_3_0= RULE_STRING ) ) otherlv_4= 'level' ( (lv_level_5_0= ruleLanguageLevel ) ) otherlv_6= '}' )
            // InternalErasmusPrograms.g:1419:3: otherlv_0= 'LanguageRequirement' otherlv_1= '{' otherlv_2= 'language' ( (lv_languageName_3_0= RULE_STRING ) ) otherlv_4= 'level' ( (lv_level_5_0= ruleLanguageLevel ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguageRequirementAccess().getLanguageRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageRequirementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLanguageRequirementAccess().getLanguageKeyword_2());
            		
            // InternalErasmusPrograms.g:1431:3: ( (lv_languageName_3_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:1432:4: (lv_languageName_3_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:1432:4: (lv_languageName_3_0= RULE_STRING )
            // InternalErasmusPrograms.g:1433:5: lv_languageName_3_0= RULE_STRING
            {
            lv_languageName_3_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_languageName_3_0, grammarAccess.getLanguageRequirementAccess().getLanguageNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"languageName",
            						lv_languageName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getLanguageRequirementAccess().getLevelKeyword_4());
            		
            // InternalErasmusPrograms.g:1453:3: ( (lv_level_5_0= ruleLanguageLevel ) )
            // InternalErasmusPrograms.g:1454:4: (lv_level_5_0= ruleLanguageLevel )
            {
            // InternalErasmusPrograms.g:1454:4: (lv_level_5_0= ruleLanguageLevel )
            // InternalErasmusPrograms.g:1455:5: lv_level_5_0= ruleLanguageLevel
            {

            					newCompositeNode(grammarAccess.getLanguageRequirementAccess().getLevelLanguageLevelEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_level_5_0=ruleLanguageLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguageRequirementRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_5_0,
            						"org.xtext.mde.a5.ErasmusPrograms.LanguageLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLanguageRequirementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageRequirement"


    // $ANTLR start "entryRuleApplicationProcess"
    // InternalErasmusPrograms.g:1480:1: entryRuleApplicationProcess returns [EObject current=null] : iv_ruleApplicationProcess= ruleApplicationProcess EOF ;
    public final EObject entryRuleApplicationProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationProcess = null;


        try {
            // InternalErasmusPrograms.g:1480:59: (iv_ruleApplicationProcess= ruleApplicationProcess EOF )
            // InternalErasmusPrograms.g:1481:2: iv_ruleApplicationProcess= ruleApplicationProcess EOF
            {
             newCompositeNode(grammarAccess.getApplicationProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationProcess=ruleApplicationProcess();

            state._fsp--;

             current =iv_ruleApplicationProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationProcess"


    // $ANTLR start "ruleApplicationProcess"
    // InternalErasmusPrograms.g:1487:1: ruleApplicationProcess returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'steps' otherlv_3= '{' ( (lv_steps_4_0= ruleStep ) ) (otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleApplicationProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_steps_4_0 = null;

        EObject lv_steps_6_0 = null;



        	enterRule();

        try {
            // InternalErasmusPrograms.g:1493:2: ( ( () otherlv_1= '{' (otherlv_2= 'steps' otherlv_3= '{' ( (lv_steps_4_0= ruleStep ) ) (otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // InternalErasmusPrograms.g:1494:2: ( () otherlv_1= '{' (otherlv_2= 'steps' otherlv_3= '{' ( (lv_steps_4_0= ruleStep ) ) (otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // InternalErasmusPrograms.g:1494:2: ( () otherlv_1= '{' (otherlv_2= 'steps' otherlv_3= '{' ( (lv_steps_4_0= ruleStep ) ) (otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // InternalErasmusPrograms.g:1495:3: () otherlv_1= '{' (otherlv_2= 'steps' otherlv_3= '{' ( (lv_steps_4_0= ruleStep ) ) (otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            // InternalErasmusPrograms.g:1495:3: ()
            // InternalErasmusPrograms.g:1496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationProcessAccess().getApplicationProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationProcessAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalErasmusPrograms.g:1506:3: (otherlv_2= 'steps' otherlv_3= '{' ( (lv_steps_4_0= ruleStep ) ) (otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) ) )* otherlv_7= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalErasmusPrograms.g:1507:4: otherlv_2= 'steps' otherlv_3= '{' ( (lv_steps_4_0= ruleStep ) ) (otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getApplicationProcessAccess().getStepsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getApplicationProcessAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalErasmusPrograms.g:1515:4: ( (lv_steps_4_0= ruleStep ) )
                    // InternalErasmusPrograms.g:1516:5: (lv_steps_4_0= ruleStep )
                    {
                    // InternalErasmusPrograms.g:1516:5: (lv_steps_4_0= ruleStep )
                    // InternalErasmusPrograms.g:1517:6: lv_steps_4_0= ruleStep
                    {

                    						newCompositeNode(grammarAccess.getApplicationProcessAccess().getStepsStepParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_steps_4_0=ruleStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationProcessRule());
                    						}
                    						add(
                    							current,
                    							"steps",
                    							lv_steps_4_0,
                    							"org.xtext.mde.a5.ErasmusPrograms.Step");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErasmusPrograms.g:1534:4: (otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalErasmusPrograms.g:1535:5: otherlv_5= ',' ( (lv_steps_6_0= ruleStep ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getApplicationProcessAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalErasmusPrograms.g:1539:5: ( (lv_steps_6_0= ruleStep ) )
                    	    // InternalErasmusPrograms.g:1540:6: (lv_steps_6_0= ruleStep )
                    	    {
                    	    // InternalErasmusPrograms.g:1540:6: (lv_steps_6_0= ruleStep )
                    	    // InternalErasmusPrograms.g:1541:7: lv_steps_6_0= ruleStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getApplicationProcessAccess().getStepsStepParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_steps_6_0=ruleStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getApplicationProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"steps",
                    	    								lv_steps_6_0,
                    	    								"org.xtext.mde.a5.ErasmusPrograms.Step");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getApplicationProcessAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getApplicationProcessAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationProcess"


    // $ANTLR start "entryRuleStep"
    // InternalErasmusPrograms.g:1572:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalErasmusPrograms.g:1572:45: (iv_ruleStep= ruleStep EOF )
            // InternalErasmusPrograms.g:1573:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalErasmusPrograms.g:1579:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_stepName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_stepDescription_4_0= RULE_STRING ) ) otherlv_5= 'startDate' ( (lv_startDate_6_0= RULE_EDATE ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= RULE_EDATE ) ) otherlv_9= '}' ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stepName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_stepDescription_4_0=null;
        Token otherlv_5=null;
        Token lv_startDate_6_0=null;
        Token otherlv_7=null;
        Token lv_endDate_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:1585:2: ( (otherlv_0= 'Step' ( (lv_stepName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_stepDescription_4_0= RULE_STRING ) ) otherlv_5= 'startDate' ( (lv_startDate_6_0= RULE_EDATE ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= RULE_EDATE ) ) otherlv_9= '}' ) )
            // InternalErasmusPrograms.g:1586:2: (otherlv_0= 'Step' ( (lv_stepName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_stepDescription_4_0= RULE_STRING ) ) otherlv_5= 'startDate' ( (lv_startDate_6_0= RULE_EDATE ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= RULE_EDATE ) ) otherlv_9= '}' )
            {
            // InternalErasmusPrograms.g:1586:2: (otherlv_0= 'Step' ( (lv_stepName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_stepDescription_4_0= RULE_STRING ) ) otherlv_5= 'startDate' ( (lv_startDate_6_0= RULE_EDATE ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= RULE_EDATE ) ) otherlv_9= '}' )
            // InternalErasmusPrograms.g:1587:3: otherlv_0= 'Step' ( (lv_stepName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_stepDescription_4_0= RULE_STRING ) ) otherlv_5= 'startDate' ( (lv_startDate_6_0= RULE_EDATE ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= RULE_EDATE ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
            		
            // InternalErasmusPrograms.g:1591:3: ( (lv_stepName_1_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:1592:4: (lv_stepName_1_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:1592:4: (lv_stepName_1_0= RULE_STRING )
            // InternalErasmusPrograms.g:1593:5: lv_stepName_1_0= RULE_STRING
            {
            lv_stepName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_stepName_1_0, grammarAccess.getStepAccess().getStepNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stepName",
            						lv_stepName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStepAccess().getDescriptionKeyword_3());
            		
            // InternalErasmusPrograms.g:1617:3: ( (lv_stepDescription_4_0= RULE_STRING ) )
            // InternalErasmusPrograms.g:1618:4: (lv_stepDescription_4_0= RULE_STRING )
            {
            // InternalErasmusPrograms.g:1618:4: (lv_stepDescription_4_0= RULE_STRING )
            // InternalErasmusPrograms.g:1619:5: lv_stepDescription_4_0= RULE_STRING
            {
            lv_stepDescription_4_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_stepDescription_4_0, grammarAccess.getStepAccess().getStepDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stepDescription",
            						lv_stepDescription_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,54,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getStepAccess().getStartDateKeyword_5());
            		
            // InternalErasmusPrograms.g:1639:3: ( (lv_startDate_6_0= RULE_EDATE ) )
            // InternalErasmusPrograms.g:1640:4: (lv_startDate_6_0= RULE_EDATE )
            {
            // InternalErasmusPrograms.g:1640:4: (lv_startDate_6_0= RULE_EDATE )
            // InternalErasmusPrograms.g:1641:5: lv_startDate_6_0= RULE_EDATE
            {
            lv_startDate_6_0=(Token)match(input,RULE_EDATE,FOLLOW_50); 

            					newLeafNode(lv_startDate_6_0, grammarAccess.getStepAccess().getStartDateEDATETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_6_0,
            						"org.xtext.mde.a5.ErasmusPrograms.EDATE");
            				

            }


            }

            otherlv_7=(Token)match(input,55,FOLLOW_49); 

            			newLeafNode(otherlv_7, grammarAccess.getStepAccess().getEndDateKeyword_7());
            		
            // InternalErasmusPrograms.g:1661:3: ( (lv_endDate_8_0= RULE_EDATE ) )
            // InternalErasmusPrograms.g:1662:4: (lv_endDate_8_0= RULE_EDATE )
            {
            // InternalErasmusPrograms.g:1662:4: (lv_endDate_8_0= RULE_EDATE )
            // InternalErasmusPrograms.g:1663:5: lv_endDate_8_0= RULE_EDATE
            {
            lv_endDate_8_0=(Token)match(input,RULE_EDATE,FOLLOW_14); 

            					newLeafNode(lv_endDate_8_0, grammarAccess.getStepAccess().getEndDateEDATETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endDate",
            						lv_endDate_8_0,
            						"org.xtext.mde.a5.ErasmusPrograms.EDATE");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "ruleScholarshipType"
    // InternalErasmusPrograms.g:1687:1: ruleScholarshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'Program_Country' ) | (enumLiteral_1= 'Partner_Country' ) ) ;
    public final Enumerator ruleScholarshipType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:1693:2: ( ( (enumLiteral_0= 'Program_Country' ) | (enumLiteral_1= 'Partner_Country' ) ) )
            // InternalErasmusPrograms.g:1694:2: ( (enumLiteral_0= 'Program_Country' ) | (enumLiteral_1= 'Partner_Country' ) )
            {
            // InternalErasmusPrograms.g:1694:2: ( (enumLiteral_0= 'Program_Country' ) | (enumLiteral_1= 'Partner_Country' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==56) ) {
                alt18=1;
            }
            else if ( (LA18_0==57) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalErasmusPrograms.g:1695:3: (enumLiteral_0= 'Program_Country' )
                    {
                    // InternalErasmusPrograms.g:1695:3: (enumLiteral_0= 'Program_Country' )
                    // InternalErasmusPrograms.g:1696:4: enumLiteral_0= 'Program_Country'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getScholarshipTypeAccess().getProgram_CountryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getScholarshipTypeAccess().getProgram_CountryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:1703:3: (enumLiteral_1= 'Partner_Country' )
                    {
                    // InternalErasmusPrograms.g:1703:3: (enumLiteral_1= 'Partner_Country' )
                    // InternalErasmusPrograms.g:1704:4: enumLiteral_1= 'Partner_Country'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getScholarshipTypeAccess().getPartner_CountryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getScholarshipTypeAccess().getPartner_CountryEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScholarshipType"


    // $ANTLR start "ruleLanguageLevel"
    // InternalErasmusPrograms.g:1714:1: ruleLanguageLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'A1' ) | (enumLiteral_1= 'A2' ) | (enumLiteral_2= 'B1' ) | (enumLiteral_3= 'B2' ) | (enumLiteral_4= 'C1' ) | (enumLiteral_5= 'C2' ) ) ;
    public final Enumerator ruleLanguageLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:1720:2: ( ( (enumLiteral_0= 'A1' ) | (enumLiteral_1= 'A2' ) | (enumLiteral_2= 'B1' ) | (enumLiteral_3= 'B2' ) | (enumLiteral_4= 'C1' ) | (enumLiteral_5= 'C2' ) ) )
            // InternalErasmusPrograms.g:1721:2: ( (enumLiteral_0= 'A1' ) | (enumLiteral_1= 'A2' ) | (enumLiteral_2= 'B1' ) | (enumLiteral_3= 'B2' ) | (enumLiteral_4= 'C1' ) | (enumLiteral_5= 'C2' ) )
            {
            // InternalErasmusPrograms.g:1721:2: ( (enumLiteral_0= 'A1' ) | (enumLiteral_1= 'A2' ) | (enumLiteral_2= 'B1' ) | (enumLiteral_3= 'B2' ) | (enumLiteral_4= 'C1' ) | (enumLiteral_5= 'C2' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt19=1;
                }
                break;
            case 59:
                {
                alt19=2;
                }
                break;
            case 60:
                {
                alt19=3;
                }
                break;
            case 61:
                {
                alt19=4;
                }
                break;
            case 62:
                {
                alt19=5;
                }
                break;
            case 63:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalErasmusPrograms.g:1722:3: (enumLiteral_0= 'A1' )
                    {
                    // InternalErasmusPrograms.g:1722:3: (enumLiteral_0= 'A1' )
                    // InternalErasmusPrograms.g:1723:4: enumLiteral_0= 'A1'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getLanguageLevelAccess().getA1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageLevelAccess().getA1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:1730:3: (enumLiteral_1= 'A2' )
                    {
                    // InternalErasmusPrograms.g:1730:3: (enumLiteral_1= 'A2' )
                    // InternalErasmusPrograms.g:1731:4: enumLiteral_1= 'A2'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getLanguageLevelAccess().getA2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLanguageLevelAccess().getA2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalErasmusPrograms.g:1738:3: (enumLiteral_2= 'B1' )
                    {
                    // InternalErasmusPrograms.g:1738:3: (enumLiteral_2= 'B1' )
                    // InternalErasmusPrograms.g:1739:4: enumLiteral_2= 'B1'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getLanguageLevelAccess().getB1EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLanguageLevelAccess().getB1EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalErasmusPrograms.g:1746:3: (enumLiteral_3= 'B2' )
                    {
                    // InternalErasmusPrograms.g:1746:3: (enumLiteral_3= 'B2' )
                    // InternalErasmusPrograms.g:1747:4: enumLiteral_3= 'B2'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getLanguageLevelAccess().getB2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLanguageLevelAccess().getB2EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalErasmusPrograms.g:1754:3: (enumLiteral_4= 'C1' )
                    {
                    // InternalErasmusPrograms.g:1754:3: (enumLiteral_4= 'C1' )
                    // InternalErasmusPrograms.g:1755:4: enumLiteral_4= 'C1'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getLanguageLevelAccess().getC1EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLanguageLevelAccess().getC1EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalErasmusPrograms.g:1762:3: (enumLiteral_5= 'C2' )
                    {
                    // InternalErasmusPrograms.g:1762:3: (enumLiteral_5= 'C2' )
                    // InternalErasmusPrograms.g:1763:4: enumLiteral_5= 'C2'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLanguageLevelAccess().getC2EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLanguageLevelAccess().getC2EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageLevel"


    // $ANTLR start "rulePartnerType"
    // InternalErasmusPrograms.g:1773:1: rulePartnerType returns [Enumerator current=null] : ( (enumLiteral_0= 'Industrial' ) | (enumLiteral_1= 'Academic' ) ) ;
    public final Enumerator rulePartnerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:1779:2: ( ( (enumLiteral_0= 'Industrial' ) | (enumLiteral_1= 'Academic' ) ) )
            // InternalErasmusPrograms.g:1780:2: ( (enumLiteral_0= 'Industrial' ) | (enumLiteral_1= 'Academic' ) )
            {
            // InternalErasmusPrograms.g:1780:2: ( (enumLiteral_0= 'Industrial' ) | (enumLiteral_1= 'Academic' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==64) ) {
                alt20=1;
            }
            else if ( (LA20_0==65) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalErasmusPrograms.g:1781:3: (enumLiteral_0= 'Industrial' )
                    {
                    // InternalErasmusPrograms.g:1781:3: (enumLiteral_0= 'Industrial' )
                    // InternalErasmusPrograms.g:1782:4: enumLiteral_0= 'Industrial'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getPartnerTypeAccess().getIndustrialEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPartnerTypeAccess().getIndustrialEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:1789:3: (enumLiteral_1= 'Academic' )
                    {
                    // InternalErasmusPrograms.g:1789:3: (enumLiteral_1= 'Academic' )
                    // InternalErasmusPrograms.g:1790:4: enumLiteral_1= 'Academic'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getPartnerTypeAccess().getAcademicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPartnerTypeAccess().getAcademicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartnerType"


    // $ANTLR start "ruleDegreeLevel"
    // InternalErasmusPrograms.g:1800:1: ruleDegreeLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'Bachelor' ) | (enumLiteral_1= 'Master' ) ) ;
    public final Enumerator ruleDegreeLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalErasmusPrograms.g:1806:2: ( ( (enumLiteral_0= 'Bachelor' ) | (enumLiteral_1= 'Master' ) ) )
            // InternalErasmusPrograms.g:1807:2: ( (enumLiteral_0= 'Bachelor' ) | (enumLiteral_1= 'Master' ) )
            {
            // InternalErasmusPrograms.g:1807:2: ( (enumLiteral_0= 'Bachelor' ) | (enumLiteral_1= 'Master' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==66) ) {
                alt21=1;
            }
            else if ( (LA21_0==67) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalErasmusPrograms.g:1808:3: (enumLiteral_0= 'Bachelor' )
                    {
                    // InternalErasmusPrograms.g:1808:3: (enumLiteral_0= 'Bachelor' )
                    // InternalErasmusPrograms.g:1809:4: enumLiteral_0= 'Bachelor'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getDegreeLevelAccess().getBachelorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDegreeLevelAccess().getBachelorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:1816:3: (enumLiteral_1= 'Master' )
                    {
                    // InternalErasmusPrograms.g:1816:3: (enumLiteral_1= 'Master' )
                    // InternalErasmusPrograms.g:1817:4: enumLiteral_1= 'Master'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDegreeLevelAccess().getMasterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDegreeLevelAccess().getMasterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDegreeLevel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004480000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xFC00000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});

}