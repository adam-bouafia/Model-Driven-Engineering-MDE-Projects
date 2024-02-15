package org.xtext.mde.a5.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.mde.a5.services.ErasmusProgramsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErasmusProgramsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_EDATE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program_Country'", "'Partner_Country'", "'A1'", "'A2'", "'B1'", "'B2'", "'C1'", "'C2'", "'Industrial'", "'Academic'", "'Bachelor'", "'Master'", "'ErasmusProgram'", "'{'", "'totalCredits'", "'admissionStructure'", "'}'", "'universities'", "','", "'scholarships'", "'associatePartners'", "'tuitionFee'", "'travelGrant'", "'allowance'", "'University'", "'location'", "'credits'", "'courses'", "'code'", "':'", "'name'", "'faculty'", "'country'", "'city'", "'('", "')'", "'applicationProcess'", "'requirements'", "'results'", "'Year'", "'totalAdmitted'", "'scholarshipsAwarded'", "'admittedStudents'", "'DocumentRequirement'", "'documentName'", "'description'", "'DegreeRequirement'", "'degreeName'", "'fieldOfStudy'", "'level'", "'LanguageRequirement'", "'language'", "'steps'", "'Step'", "'startDate'", "'endDate'"
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

    	public void setGrammarAccess(ErasmusProgramsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleErasmusProgram"
    // InternalErasmusPrograms.g:53:1: entryRuleErasmusProgram : ruleErasmusProgram EOF ;
    public final void entryRuleErasmusProgram() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:54:1: ( ruleErasmusProgram EOF )
            // InternalErasmusPrograms.g:55:1: ruleErasmusProgram EOF
            {
             before(grammarAccess.getErasmusProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleErasmusProgram();

            state._fsp--;

             after(grammarAccess.getErasmusProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleErasmusProgram"


    // $ANTLR start "ruleErasmusProgram"
    // InternalErasmusPrograms.g:62:1: ruleErasmusProgram : ( ( rule__ErasmusProgram__Group__0 ) ) ;
    public final void ruleErasmusProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:66:2: ( ( ( rule__ErasmusProgram__Group__0 ) ) )
            // InternalErasmusPrograms.g:67:2: ( ( rule__ErasmusProgram__Group__0 ) )
            {
            // InternalErasmusPrograms.g:67:2: ( ( rule__ErasmusProgram__Group__0 ) )
            // InternalErasmusPrograms.g:68:3: ( rule__ErasmusProgram__Group__0 )
            {
             before(grammarAccess.getErasmusProgramAccess().getGroup()); 
            // InternalErasmusPrograms.g:69:3: ( rule__ErasmusProgram__Group__0 )
            // InternalErasmusPrograms.g:69:4: rule__ErasmusProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleErasmusProgram"


    // $ANTLR start "entryRuleScholarship"
    // InternalErasmusPrograms.g:78:1: entryRuleScholarship : ruleScholarship EOF ;
    public final void entryRuleScholarship() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:79:1: ( ruleScholarship EOF )
            // InternalErasmusPrograms.g:80:1: ruleScholarship EOF
            {
             before(grammarAccess.getScholarshipRule()); 
            pushFollow(FOLLOW_1);
            ruleScholarship();

            state._fsp--;

             after(grammarAccess.getScholarshipRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScholarship"


    // $ANTLR start "ruleScholarship"
    // InternalErasmusPrograms.g:87:1: ruleScholarship : ( ( rule__Scholarship__Group__0 ) ) ;
    public final void ruleScholarship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:91:2: ( ( ( rule__Scholarship__Group__0 ) ) )
            // InternalErasmusPrograms.g:92:2: ( ( rule__Scholarship__Group__0 ) )
            {
            // InternalErasmusPrograms.g:92:2: ( ( rule__Scholarship__Group__0 ) )
            // InternalErasmusPrograms.g:93:3: ( rule__Scholarship__Group__0 )
            {
             before(grammarAccess.getScholarshipAccess().getGroup()); 
            // InternalErasmusPrograms.g:94:3: ( rule__Scholarship__Group__0 )
            // InternalErasmusPrograms.g:94:4: rule__Scholarship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScholarshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScholarship"


    // $ANTLR start "entryRuleUniversity"
    // InternalErasmusPrograms.g:103:1: entryRuleUniversity : ruleUniversity EOF ;
    public final void entryRuleUniversity() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:104:1: ( ruleUniversity EOF )
            // InternalErasmusPrograms.g:105:1: ruleUniversity EOF
            {
             before(grammarAccess.getUniversityRule()); 
            pushFollow(FOLLOW_1);
            ruleUniversity();

            state._fsp--;

             after(grammarAccess.getUniversityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUniversity"


    // $ANTLR start "ruleUniversity"
    // InternalErasmusPrograms.g:112:1: ruleUniversity : ( ( rule__University__Group__0 ) ) ;
    public final void ruleUniversity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:116:2: ( ( ( rule__University__Group__0 ) ) )
            // InternalErasmusPrograms.g:117:2: ( ( rule__University__Group__0 ) )
            {
            // InternalErasmusPrograms.g:117:2: ( ( rule__University__Group__0 ) )
            // InternalErasmusPrograms.g:118:3: ( rule__University__Group__0 )
            {
             before(grammarAccess.getUniversityAccess().getGroup()); 
            // InternalErasmusPrograms.g:119:3: ( rule__University__Group__0 )
            // InternalErasmusPrograms.g:119:4: rule__University__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__University__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniversity"


    // $ANTLR start "entryRuleCourse"
    // InternalErasmusPrograms.g:128:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:129:1: ( ruleCourse EOF )
            // InternalErasmusPrograms.g:130:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalErasmusPrograms.g:137:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:141:2: ( ( ( rule__Course__Group__0 ) ) )
            // InternalErasmusPrograms.g:142:2: ( ( rule__Course__Group__0 ) )
            {
            // InternalErasmusPrograms.g:142:2: ( ( rule__Course__Group__0 ) )
            // InternalErasmusPrograms.g:143:3: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // InternalErasmusPrograms.g:144:3: ( rule__Course__Group__0 )
            // InternalErasmusPrograms.g:144:4: rule__Course__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleLocation"
    // InternalErasmusPrograms.g:153:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:154:1: ( ruleLocation EOF )
            // InternalErasmusPrograms.g:155:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalErasmusPrograms.g:162:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:166:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalErasmusPrograms.g:167:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalErasmusPrograms.g:167:2: ( ( rule__Location__Group__0 ) )
            // InternalErasmusPrograms.g:168:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalErasmusPrograms.g:169:3: ( rule__Location__Group__0 )
            // InternalErasmusPrograms.g:169:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleAssociatePartner"
    // InternalErasmusPrograms.g:178:1: entryRuleAssociatePartner : ruleAssociatePartner EOF ;
    public final void entryRuleAssociatePartner() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:179:1: ( ruleAssociatePartner EOF )
            // InternalErasmusPrograms.g:180:1: ruleAssociatePartner EOF
            {
             before(grammarAccess.getAssociatePartnerRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociatePartner();

            state._fsp--;

             after(grammarAccess.getAssociatePartnerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociatePartner"


    // $ANTLR start "ruleAssociatePartner"
    // InternalErasmusPrograms.g:187:1: ruleAssociatePartner : ( ( rule__AssociatePartner__Group__0 ) ) ;
    public final void ruleAssociatePartner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:191:2: ( ( ( rule__AssociatePartner__Group__0 ) ) )
            // InternalErasmusPrograms.g:192:2: ( ( rule__AssociatePartner__Group__0 ) )
            {
            // InternalErasmusPrograms.g:192:2: ( ( rule__AssociatePartner__Group__0 ) )
            // InternalErasmusPrograms.g:193:3: ( rule__AssociatePartner__Group__0 )
            {
             before(grammarAccess.getAssociatePartnerAccess().getGroup()); 
            // InternalErasmusPrograms.g:194:3: ( rule__AssociatePartner__Group__0 )
            // InternalErasmusPrograms.g:194:4: rule__AssociatePartner__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociatePartner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociatePartnerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociatePartner"


    // $ANTLR start "entryRuleAdmissionStructure"
    // InternalErasmusPrograms.g:203:1: entryRuleAdmissionStructure : ruleAdmissionStructure EOF ;
    public final void entryRuleAdmissionStructure() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:204:1: ( ruleAdmissionStructure EOF )
            // InternalErasmusPrograms.g:205:1: ruleAdmissionStructure EOF
            {
             before(grammarAccess.getAdmissionStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleAdmissionStructure();

            state._fsp--;

             after(grammarAccess.getAdmissionStructureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdmissionStructure"


    // $ANTLR start "ruleAdmissionStructure"
    // InternalErasmusPrograms.g:212:1: ruleAdmissionStructure : ( ( rule__AdmissionStructure__Group__0 ) ) ;
    public final void ruleAdmissionStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:216:2: ( ( ( rule__AdmissionStructure__Group__0 ) ) )
            // InternalErasmusPrograms.g:217:2: ( ( rule__AdmissionStructure__Group__0 ) )
            {
            // InternalErasmusPrograms.g:217:2: ( ( rule__AdmissionStructure__Group__0 ) )
            // InternalErasmusPrograms.g:218:3: ( rule__AdmissionStructure__Group__0 )
            {
             before(grammarAccess.getAdmissionStructureAccess().getGroup()); 
            // InternalErasmusPrograms.g:219:3: ( rule__AdmissionStructure__Group__0 )
            // InternalErasmusPrograms.g:219:4: rule__AdmissionStructure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdmissionStructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdmissionStructure"


    // $ANTLR start "entryRuleResults"
    // InternalErasmusPrograms.g:228:1: entryRuleResults : ruleResults EOF ;
    public final void entryRuleResults() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:229:1: ( ruleResults EOF )
            // InternalErasmusPrograms.g:230:1: ruleResults EOF
            {
             before(grammarAccess.getResultsRule()); 
            pushFollow(FOLLOW_1);
            ruleResults();

            state._fsp--;

             after(grammarAccess.getResultsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResults"


    // $ANTLR start "ruleResults"
    // InternalErasmusPrograms.g:237:1: ruleResults : ( ( rule__Results__Group__0 ) ) ;
    public final void ruleResults() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:241:2: ( ( ( rule__Results__Group__0 ) ) )
            // InternalErasmusPrograms.g:242:2: ( ( rule__Results__Group__0 ) )
            {
            // InternalErasmusPrograms.g:242:2: ( ( rule__Results__Group__0 ) )
            // InternalErasmusPrograms.g:243:3: ( rule__Results__Group__0 )
            {
             before(grammarAccess.getResultsAccess().getGroup()); 
            // InternalErasmusPrograms.g:244:3: ( rule__Results__Group__0 )
            // InternalErasmusPrograms.g:244:4: rule__Results__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Results__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResults"


    // $ANTLR start "entryRuleRequirement"
    // InternalErasmusPrograms.g:253:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:254:1: ( ruleRequirement EOF )
            // InternalErasmusPrograms.g:255:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalErasmusPrograms.g:262:1: ruleRequirement : ( ( rule__Requirement__Alternatives ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:266:2: ( ( ( rule__Requirement__Alternatives ) ) )
            // InternalErasmusPrograms.g:267:2: ( ( rule__Requirement__Alternatives ) )
            {
            // InternalErasmusPrograms.g:267:2: ( ( rule__Requirement__Alternatives ) )
            // InternalErasmusPrograms.g:268:3: ( rule__Requirement__Alternatives )
            {
             before(grammarAccess.getRequirementAccess().getAlternatives()); 
            // InternalErasmusPrograms.g:269:3: ( rule__Requirement__Alternatives )
            // InternalErasmusPrograms.g:269:4: rule__Requirement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleDocumentRequirement"
    // InternalErasmusPrograms.g:278:1: entryRuleDocumentRequirement : ruleDocumentRequirement EOF ;
    public final void entryRuleDocumentRequirement() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:279:1: ( ruleDocumentRequirement EOF )
            // InternalErasmusPrograms.g:280:1: ruleDocumentRequirement EOF
            {
             before(grammarAccess.getDocumentRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleDocumentRequirement();

            state._fsp--;

             after(grammarAccess.getDocumentRequirementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocumentRequirement"


    // $ANTLR start "ruleDocumentRequirement"
    // InternalErasmusPrograms.g:287:1: ruleDocumentRequirement : ( ( rule__DocumentRequirement__Group__0 ) ) ;
    public final void ruleDocumentRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:291:2: ( ( ( rule__DocumentRequirement__Group__0 ) ) )
            // InternalErasmusPrograms.g:292:2: ( ( rule__DocumentRequirement__Group__0 ) )
            {
            // InternalErasmusPrograms.g:292:2: ( ( rule__DocumentRequirement__Group__0 ) )
            // InternalErasmusPrograms.g:293:3: ( rule__DocumentRequirement__Group__0 )
            {
             before(grammarAccess.getDocumentRequirementAccess().getGroup()); 
            // InternalErasmusPrograms.g:294:3: ( rule__DocumentRequirement__Group__0 )
            // InternalErasmusPrograms.g:294:4: rule__DocumentRequirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentRequirement"


    // $ANTLR start "entryRuleDegreeRequirement"
    // InternalErasmusPrograms.g:303:1: entryRuleDegreeRequirement : ruleDegreeRequirement EOF ;
    public final void entryRuleDegreeRequirement() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:304:1: ( ruleDegreeRequirement EOF )
            // InternalErasmusPrograms.g:305:1: ruleDegreeRequirement EOF
            {
             before(grammarAccess.getDegreeRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleDegreeRequirement();

            state._fsp--;

             after(grammarAccess.getDegreeRequirementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDegreeRequirement"


    // $ANTLR start "ruleDegreeRequirement"
    // InternalErasmusPrograms.g:312:1: ruleDegreeRequirement : ( ( rule__DegreeRequirement__Group__0 ) ) ;
    public final void ruleDegreeRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:316:2: ( ( ( rule__DegreeRequirement__Group__0 ) ) )
            // InternalErasmusPrograms.g:317:2: ( ( rule__DegreeRequirement__Group__0 ) )
            {
            // InternalErasmusPrograms.g:317:2: ( ( rule__DegreeRequirement__Group__0 ) )
            // InternalErasmusPrograms.g:318:3: ( rule__DegreeRequirement__Group__0 )
            {
             before(grammarAccess.getDegreeRequirementAccess().getGroup()); 
            // InternalErasmusPrograms.g:319:3: ( rule__DegreeRequirement__Group__0 )
            // InternalErasmusPrograms.g:319:4: rule__DegreeRequirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDegreeRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDegreeRequirement"


    // $ANTLR start "entryRuleLanguageRequirement"
    // InternalErasmusPrograms.g:328:1: entryRuleLanguageRequirement : ruleLanguageRequirement EOF ;
    public final void entryRuleLanguageRequirement() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:329:1: ( ruleLanguageRequirement EOF )
            // InternalErasmusPrograms.g:330:1: ruleLanguageRequirement EOF
            {
             before(grammarAccess.getLanguageRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageRequirement();

            state._fsp--;

             after(grammarAccess.getLanguageRequirementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguageRequirement"


    // $ANTLR start "ruleLanguageRequirement"
    // InternalErasmusPrograms.g:337:1: ruleLanguageRequirement : ( ( rule__LanguageRequirement__Group__0 ) ) ;
    public final void ruleLanguageRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:341:2: ( ( ( rule__LanguageRequirement__Group__0 ) ) )
            // InternalErasmusPrograms.g:342:2: ( ( rule__LanguageRequirement__Group__0 ) )
            {
            // InternalErasmusPrograms.g:342:2: ( ( rule__LanguageRequirement__Group__0 ) )
            // InternalErasmusPrograms.g:343:3: ( rule__LanguageRequirement__Group__0 )
            {
             before(grammarAccess.getLanguageRequirementAccess().getGroup()); 
            // InternalErasmusPrograms.g:344:3: ( rule__LanguageRequirement__Group__0 )
            // InternalErasmusPrograms.g:344:4: rule__LanguageRequirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageRequirement"


    // $ANTLR start "entryRuleApplicationProcess"
    // InternalErasmusPrograms.g:353:1: entryRuleApplicationProcess : ruleApplicationProcess EOF ;
    public final void entryRuleApplicationProcess() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:354:1: ( ruleApplicationProcess EOF )
            // InternalErasmusPrograms.g:355:1: ruleApplicationProcess EOF
            {
             before(grammarAccess.getApplicationProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationProcess();

            state._fsp--;

             after(grammarAccess.getApplicationProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplicationProcess"


    // $ANTLR start "ruleApplicationProcess"
    // InternalErasmusPrograms.g:362:1: ruleApplicationProcess : ( ( rule__ApplicationProcess__Group__0 ) ) ;
    public final void ruleApplicationProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:366:2: ( ( ( rule__ApplicationProcess__Group__0 ) ) )
            // InternalErasmusPrograms.g:367:2: ( ( rule__ApplicationProcess__Group__0 ) )
            {
            // InternalErasmusPrograms.g:367:2: ( ( rule__ApplicationProcess__Group__0 ) )
            // InternalErasmusPrograms.g:368:3: ( rule__ApplicationProcess__Group__0 )
            {
             before(grammarAccess.getApplicationProcessAccess().getGroup()); 
            // InternalErasmusPrograms.g:369:3: ( rule__ApplicationProcess__Group__0 )
            // InternalErasmusPrograms.g:369:4: rule__ApplicationProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationProcess"


    // $ANTLR start "entryRuleStep"
    // InternalErasmusPrograms.g:378:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalErasmusPrograms.g:379:1: ( ruleStep EOF )
            // InternalErasmusPrograms.g:380:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalErasmusPrograms.g:387:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:391:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalErasmusPrograms.g:392:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalErasmusPrograms.g:392:2: ( ( rule__Step__Group__0 ) )
            // InternalErasmusPrograms.g:393:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalErasmusPrograms.g:394:3: ( rule__Step__Group__0 )
            // InternalErasmusPrograms.g:394:4: rule__Step__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "ruleScholarshipType"
    // InternalErasmusPrograms.g:403:1: ruleScholarshipType : ( ( rule__ScholarshipType__Alternatives ) ) ;
    public final void ruleScholarshipType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:407:1: ( ( ( rule__ScholarshipType__Alternatives ) ) )
            // InternalErasmusPrograms.g:408:2: ( ( rule__ScholarshipType__Alternatives ) )
            {
            // InternalErasmusPrograms.g:408:2: ( ( rule__ScholarshipType__Alternatives ) )
            // InternalErasmusPrograms.g:409:3: ( rule__ScholarshipType__Alternatives )
            {
             before(grammarAccess.getScholarshipTypeAccess().getAlternatives()); 
            // InternalErasmusPrograms.g:410:3: ( rule__ScholarshipType__Alternatives )
            // InternalErasmusPrograms.g:410:4: rule__ScholarshipType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ScholarshipType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScholarshipTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScholarshipType"


    // $ANTLR start "ruleLanguageLevel"
    // InternalErasmusPrograms.g:419:1: ruleLanguageLevel : ( ( rule__LanguageLevel__Alternatives ) ) ;
    public final void ruleLanguageLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:423:1: ( ( ( rule__LanguageLevel__Alternatives ) ) )
            // InternalErasmusPrograms.g:424:2: ( ( rule__LanguageLevel__Alternatives ) )
            {
            // InternalErasmusPrograms.g:424:2: ( ( rule__LanguageLevel__Alternatives ) )
            // InternalErasmusPrograms.g:425:3: ( rule__LanguageLevel__Alternatives )
            {
             before(grammarAccess.getLanguageLevelAccess().getAlternatives()); 
            // InternalErasmusPrograms.g:426:3: ( rule__LanguageLevel__Alternatives )
            // InternalErasmusPrograms.g:426:4: rule__LanguageLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LanguageLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageLevel"


    // $ANTLR start "rulePartnerType"
    // InternalErasmusPrograms.g:435:1: rulePartnerType : ( ( rule__PartnerType__Alternatives ) ) ;
    public final void rulePartnerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:439:1: ( ( ( rule__PartnerType__Alternatives ) ) )
            // InternalErasmusPrograms.g:440:2: ( ( rule__PartnerType__Alternatives ) )
            {
            // InternalErasmusPrograms.g:440:2: ( ( rule__PartnerType__Alternatives ) )
            // InternalErasmusPrograms.g:441:3: ( rule__PartnerType__Alternatives )
            {
             before(grammarAccess.getPartnerTypeAccess().getAlternatives()); 
            // InternalErasmusPrograms.g:442:3: ( rule__PartnerType__Alternatives )
            // InternalErasmusPrograms.g:442:4: rule__PartnerType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PartnerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartnerTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartnerType"


    // $ANTLR start "ruleDegreeLevel"
    // InternalErasmusPrograms.g:451:1: ruleDegreeLevel : ( ( rule__DegreeLevel__Alternatives ) ) ;
    public final void ruleDegreeLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:455:1: ( ( ( rule__DegreeLevel__Alternatives ) ) )
            // InternalErasmusPrograms.g:456:2: ( ( rule__DegreeLevel__Alternatives ) )
            {
            // InternalErasmusPrograms.g:456:2: ( ( rule__DegreeLevel__Alternatives ) )
            // InternalErasmusPrograms.g:457:3: ( rule__DegreeLevel__Alternatives )
            {
             before(grammarAccess.getDegreeLevelAccess().getAlternatives()); 
            // InternalErasmusPrograms.g:458:3: ( rule__DegreeLevel__Alternatives )
            // InternalErasmusPrograms.g:458:4: rule__DegreeLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DegreeLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDegreeLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDegreeLevel"


    // $ANTLR start "rule__Requirement__Alternatives"
    // InternalErasmusPrograms.g:466:1: rule__Requirement__Alternatives : ( ( ruleDocumentRequirement ) | ( ruleDegreeRequirement ) | ( ruleLanguageRequirement ) );
    public final void rule__Requirement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:470:1: ( ( ruleDocumentRequirement ) | ( ruleDegreeRequirement ) | ( ruleLanguageRequirement ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt1=1;
                }
                break;
            case 58:
                {
                alt1=2;
                }
                break;
            case 62:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalErasmusPrograms.g:471:2: ( ruleDocumentRequirement )
                    {
                    // InternalErasmusPrograms.g:471:2: ( ruleDocumentRequirement )
                    // InternalErasmusPrograms.g:472:3: ruleDocumentRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getDocumentRequirementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDocumentRequirement();

                    state._fsp--;

                     after(grammarAccess.getRequirementAccess().getDocumentRequirementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:477:2: ( ruleDegreeRequirement )
                    {
                    // InternalErasmusPrograms.g:477:2: ( ruleDegreeRequirement )
                    // InternalErasmusPrograms.g:478:3: ruleDegreeRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getDegreeRequirementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDegreeRequirement();

                    state._fsp--;

                     after(grammarAccess.getRequirementAccess().getDegreeRequirementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErasmusPrograms.g:483:2: ( ruleLanguageRequirement )
                    {
                    // InternalErasmusPrograms.g:483:2: ( ruleLanguageRequirement )
                    // InternalErasmusPrograms.g:484:3: ruleLanguageRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getLanguageRequirementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLanguageRequirement();

                    state._fsp--;

                     after(grammarAccess.getRequirementAccess().getLanguageRequirementParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Alternatives"


    // $ANTLR start "rule__ScholarshipType__Alternatives"
    // InternalErasmusPrograms.g:493:1: rule__ScholarshipType__Alternatives : ( ( ( 'Program_Country' ) ) | ( ( 'Partner_Country' ) ) );
    public final void rule__ScholarshipType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:497:1: ( ( ( 'Program_Country' ) ) | ( ( 'Partner_Country' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalErasmusPrograms.g:498:2: ( ( 'Program_Country' ) )
                    {
                    // InternalErasmusPrograms.g:498:2: ( ( 'Program_Country' ) )
                    // InternalErasmusPrograms.g:499:3: ( 'Program_Country' )
                    {
                     before(grammarAccess.getScholarshipTypeAccess().getProgram_CountryEnumLiteralDeclaration_0()); 
                    // InternalErasmusPrograms.g:500:3: ( 'Program_Country' )
                    // InternalErasmusPrograms.g:500:4: 'Program_Country'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getScholarshipTypeAccess().getProgram_CountryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:504:2: ( ( 'Partner_Country' ) )
                    {
                    // InternalErasmusPrograms.g:504:2: ( ( 'Partner_Country' ) )
                    // InternalErasmusPrograms.g:505:3: ( 'Partner_Country' )
                    {
                     before(grammarAccess.getScholarshipTypeAccess().getPartner_CountryEnumLiteralDeclaration_1()); 
                    // InternalErasmusPrograms.g:506:3: ( 'Partner_Country' )
                    // InternalErasmusPrograms.g:506:4: 'Partner_Country'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getScholarshipTypeAccess().getPartner_CountryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScholarshipType__Alternatives"


    // $ANTLR start "rule__LanguageLevel__Alternatives"
    // InternalErasmusPrograms.g:514:1: rule__LanguageLevel__Alternatives : ( ( ( 'A1' ) ) | ( ( 'A2' ) ) | ( ( 'B1' ) ) | ( ( 'B2' ) ) | ( ( 'C1' ) ) | ( ( 'C2' ) ) );
    public final void rule__LanguageLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:518:1: ( ( ( 'A1' ) ) | ( ( 'A2' ) ) | ( ( 'B1' ) ) | ( ( 'B2' ) ) | ( ( 'C1' ) ) | ( ( 'C2' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalErasmusPrograms.g:519:2: ( ( 'A1' ) )
                    {
                    // InternalErasmusPrograms.g:519:2: ( ( 'A1' ) )
                    // InternalErasmusPrograms.g:520:3: ( 'A1' )
                    {
                     before(grammarAccess.getLanguageLevelAccess().getA1EnumLiteralDeclaration_0()); 
                    // InternalErasmusPrograms.g:521:3: ( 'A1' )
                    // InternalErasmusPrograms.g:521:4: 'A1'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageLevelAccess().getA1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:525:2: ( ( 'A2' ) )
                    {
                    // InternalErasmusPrograms.g:525:2: ( ( 'A2' ) )
                    // InternalErasmusPrograms.g:526:3: ( 'A2' )
                    {
                     before(grammarAccess.getLanguageLevelAccess().getA2EnumLiteralDeclaration_1()); 
                    // InternalErasmusPrograms.g:527:3: ( 'A2' )
                    // InternalErasmusPrograms.g:527:4: 'A2'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageLevelAccess().getA2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErasmusPrograms.g:531:2: ( ( 'B1' ) )
                    {
                    // InternalErasmusPrograms.g:531:2: ( ( 'B1' ) )
                    // InternalErasmusPrograms.g:532:3: ( 'B1' )
                    {
                     before(grammarAccess.getLanguageLevelAccess().getB1EnumLiteralDeclaration_2()); 
                    // InternalErasmusPrograms.g:533:3: ( 'B1' )
                    // InternalErasmusPrograms.g:533:4: 'B1'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageLevelAccess().getB1EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErasmusPrograms.g:537:2: ( ( 'B2' ) )
                    {
                    // InternalErasmusPrograms.g:537:2: ( ( 'B2' ) )
                    // InternalErasmusPrograms.g:538:3: ( 'B2' )
                    {
                     before(grammarAccess.getLanguageLevelAccess().getB2EnumLiteralDeclaration_3()); 
                    // InternalErasmusPrograms.g:539:3: ( 'B2' )
                    // InternalErasmusPrograms.g:539:4: 'B2'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageLevelAccess().getB2EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErasmusPrograms.g:543:2: ( ( 'C1' ) )
                    {
                    // InternalErasmusPrograms.g:543:2: ( ( 'C1' ) )
                    // InternalErasmusPrograms.g:544:3: ( 'C1' )
                    {
                     before(grammarAccess.getLanguageLevelAccess().getC1EnumLiteralDeclaration_4()); 
                    // InternalErasmusPrograms.g:545:3: ( 'C1' )
                    // InternalErasmusPrograms.g:545:4: 'C1'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageLevelAccess().getC1EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErasmusPrograms.g:549:2: ( ( 'C2' ) )
                    {
                    // InternalErasmusPrograms.g:549:2: ( ( 'C2' ) )
                    // InternalErasmusPrograms.g:550:3: ( 'C2' )
                    {
                     before(grammarAccess.getLanguageLevelAccess().getC2EnumLiteralDeclaration_5()); 
                    // InternalErasmusPrograms.g:551:3: ( 'C2' )
                    // InternalErasmusPrograms.g:551:4: 'C2'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageLevelAccess().getC2EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageLevel__Alternatives"


    // $ANTLR start "rule__PartnerType__Alternatives"
    // InternalErasmusPrograms.g:559:1: rule__PartnerType__Alternatives : ( ( ( 'Industrial' ) ) | ( ( 'Academic' ) ) );
    public final void rule__PartnerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:563:1: ( ( ( 'Industrial' ) ) | ( ( 'Academic' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalErasmusPrograms.g:564:2: ( ( 'Industrial' ) )
                    {
                    // InternalErasmusPrograms.g:564:2: ( ( 'Industrial' ) )
                    // InternalErasmusPrograms.g:565:3: ( 'Industrial' )
                    {
                     before(grammarAccess.getPartnerTypeAccess().getIndustrialEnumLiteralDeclaration_0()); 
                    // InternalErasmusPrograms.g:566:3: ( 'Industrial' )
                    // InternalErasmusPrograms.g:566:4: 'Industrial'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartnerTypeAccess().getIndustrialEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:570:2: ( ( 'Academic' ) )
                    {
                    // InternalErasmusPrograms.g:570:2: ( ( 'Academic' ) )
                    // InternalErasmusPrograms.g:571:3: ( 'Academic' )
                    {
                     before(grammarAccess.getPartnerTypeAccess().getAcademicEnumLiteralDeclaration_1()); 
                    // InternalErasmusPrograms.g:572:3: ( 'Academic' )
                    // InternalErasmusPrograms.g:572:4: 'Academic'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartnerTypeAccess().getAcademicEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartnerType__Alternatives"


    // $ANTLR start "rule__DegreeLevel__Alternatives"
    // InternalErasmusPrograms.g:580:1: rule__DegreeLevel__Alternatives : ( ( ( 'Bachelor' ) ) | ( ( 'Master' ) ) );
    public final void rule__DegreeLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:584:1: ( ( ( 'Bachelor' ) ) | ( ( 'Master' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalErasmusPrograms.g:585:2: ( ( 'Bachelor' ) )
                    {
                    // InternalErasmusPrograms.g:585:2: ( ( 'Bachelor' ) )
                    // InternalErasmusPrograms.g:586:3: ( 'Bachelor' )
                    {
                     before(grammarAccess.getDegreeLevelAccess().getBachelorEnumLiteralDeclaration_0()); 
                    // InternalErasmusPrograms.g:587:3: ( 'Bachelor' )
                    // InternalErasmusPrograms.g:587:4: 'Bachelor'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDegreeLevelAccess().getBachelorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErasmusPrograms.g:591:2: ( ( 'Master' ) )
                    {
                    // InternalErasmusPrograms.g:591:2: ( ( 'Master' ) )
                    // InternalErasmusPrograms.g:592:3: ( 'Master' )
                    {
                     before(grammarAccess.getDegreeLevelAccess().getMasterEnumLiteralDeclaration_1()); 
                    // InternalErasmusPrograms.g:593:3: ( 'Master' )
                    // InternalErasmusPrograms.g:593:4: 'Master'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDegreeLevelAccess().getMasterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeLevel__Alternatives"


    // $ANTLR start "rule__ErasmusProgram__Group__0"
    // InternalErasmusPrograms.g:601:1: rule__ErasmusProgram__Group__0 : rule__ErasmusProgram__Group__0__Impl rule__ErasmusProgram__Group__1 ;
    public final void rule__ErasmusProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:605:1: ( rule__ErasmusProgram__Group__0__Impl rule__ErasmusProgram__Group__1 )
            // InternalErasmusPrograms.g:606:2: rule__ErasmusProgram__Group__0__Impl rule__ErasmusProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ErasmusProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__0"


    // $ANTLR start "rule__ErasmusProgram__Group__0__Impl"
    // InternalErasmusPrograms.g:613:1: rule__ErasmusProgram__Group__0__Impl : ( 'ErasmusProgram' ) ;
    public final void rule__ErasmusProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:617:1: ( ( 'ErasmusProgram' ) )
            // InternalErasmusPrograms.g:618:1: ( 'ErasmusProgram' )
            {
            // InternalErasmusPrograms.g:618:1: ( 'ErasmusProgram' )
            // InternalErasmusPrograms.g:619:2: 'ErasmusProgram'
            {
             before(grammarAccess.getErasmusProgramAccess().getErasmusProgramKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getErasmusProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__0__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__1"
    // InternalErasmusPrograms.g:628:1: rule__ErasmusProgram__Group__1 : rule__ErasmusProgram__Group__1__Impl rule__ErasmusProgram__Group__2 ;
    public final void rule__ErasmusProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:632:1: ( rule__ErasmusProgram__Group__1__Impl rule__ErasmusProgram__Group__2 )
            // InternalErasmusPrograms.g:633:2: rule__ErasmusProgram__Group__1__Impl rule__ErasmusProgram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ErasmusProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__1"


    // $ANTLR start "rule__ErasmusProgram__Group__1__Impl"
    // InternalErasmusPrograms.g:640:1: rule__ErasmusProgram__Group__1__Impl : ( ( rule__ErasmusProgram__NameAssignment_1 ) ) ;
    public final void rule__ErasmusProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:644:1: ( ( ( rule__ErasmusProgram__NameAssignment_1 ) ) )
            // InternalErasmusPrograms.g:645:1: ( ( rule__ErasmusProgram__NameAssignment_1 ) )
            {
            // InternalErasmusPrograms.g:645:1: ( ( rule__ErasmusProgram__NameAssignment_1 ) )
            // InternalErasmusPrograms.g:646:2: ( rule__ErasmusProgram__NameAssignment_1 )
            {
             before(grammarAccess.getErasmusProgramAccess().getNameAssignment_1()); 
            // InternalErasmusPrograms.g:647:2: ( rule__ErasmusProgram__NameAssignment_1 )
            // InternalErasmusPrograms.g:647:3: rule__ErasmusProgram__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__1__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__2"
    // InternalErasmusPrograms.g:655:1: rule__ErasmusProgram__Group__2 : rule__ErasmusProgram__Group__2__Impl rule__ErasmusProgram__Group__3 ;
    public final void rule__ErasmusProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:659:1: ( rule__ErasmusProgram__Group__2__Impl rule__ErasmusProgram__Group__3 )
            // InternalErasmusPrograms.g:660:2: rule__ErasmusProgram__Group__2__Impl rule__ErasmusProgram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ErasmusProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__2"


    // $ANTLR start "rule__ErasmusProgram__Group__2__Impl"
    // InternalErasmusPrograms.g:667:1: rule__ErasmusProgram__Group__2__Impl : ( '{' ) ;
    public final void rule__ErasmusProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:671:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:672:1: ( '{' )
            {
            // InternalErasmusPrograms.g:672:1: ( '{' )
            // InternalErasmusPrograms.g:673:2: '{'
            {
             before(grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__2__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__3"
    // InternalErasmusPrograms.g:682:1: rule__ErasmusProgram__Group__3 : rule__ErasmusProgram__Group__3__Impl rule__ErasmusProgram__Group__4 ;
    public final void rule__ErasmusProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:686:1: ( rule__ErasmusProgram__Group__3__Impl rule__ErasmusProgram__Group__4 )
            // InternalErasmusPrograms.g:687:2: rule__ErasmusProgram__Group__3__Impl rule__ErasmusProgram__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ErasmusProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__3"


    // $ANTLR start "rule__ErasmusProgram__Group__3__Impl"
    // InternalErasmusPrograms.g:694:1: rule__ErasmusProgram__Group__3__Impl : ( 'totalCredits' ) ;
    public final void rule__ErasmusProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:698:1: ( ( 'totalCredits' ) )
            // InternalErasmusPrograms.g:699:1: ( 'totalCredits' )
            {
            // InternalErasmusPrograms.g:699:1: ( 'totalCredits' )
            // InternalErasmusPrograms.g:700:2: 'totalCredits'
            {
             before(grammarAccess.getErasmusProgramAccess().getTotalCreditsKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getTotalCreditsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__3__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__4"
    // InternalErasmusPrograms.g:709:1: rule__ErasmusProgram__Group__4 : rule__ErasmusProgram__Group__4__Impl rule__ErasmusProgram__Group__5 ;
    public final void rule__ErasmusProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:713:1: ( rule__ErasmusProgram__Group__4__Impl rule__ErasmusProgram__Group__5 )
            // InternalErasmusPrograms.g:714:2: rule__ErasmusProgram__Group__4__Impl rule__ErasmusProgram__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ErasmusProgram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__4"


    // $ANTLR start "rule__ErasmusProgram__Group__4__Impl"
    // InternalErasmusPrograms.g:721:1: rule__ErasmusProgram__Group__4__Impl : ( ( rule__ErasmusProgram__TotalCreditsAssignment_4 ) ) ;
    public final void rule__ErasmusProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:725:1: ( ( ( rule__ErasmusProgram__TotalCreditsAssignment_4 ) ) )
            // InternalErasmusPrograms.g:726:1: ( ( rule__ErasmusProgram__TotalCreditsAssignment_4 ) )
            {
            // InternalErasmusPrograms.g:726:1: ( ( rule__ErasmusProgram__TotalCreditsAssignment_4 ) )
            // InternalErasmusPrograms.g:727:2: ( rule__ErasmusProgram__TotalCreditsAssignment_4 )
            {
             before(grammarAccess.getErasmusProgramAccess().getTotalCreditsAssignment_4()); 
            // InternalErasmusPrograms.g:728:2: ( rule__ErasmusProgram__TotalCreditsAssignment_4 )
            // InternalErasmusPrograms.g:728:3: rule__ErasmusProgram__TotalCreditsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__TotalCreditsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getTotalCreditsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__4__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__5"
    // InternalErasmusPrograms.g:736:1: rule__ErasmusProgram__Group__5 : rule__ErasmusProgram__Group__5__Impl rule__ErasmusProgram__Group__6 ;
    public final void rule__ErasmusProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:740:1: ( rule__ErasmusProgram__Group__5__Impl rule__ErasmusProgram__Group__6 )
            // InternalErasmusPrograms.g:741:2: rule__ErasmusProgram__Group__5__Impl rule__ErasmusProgram__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ErasmusProgram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__5"


    // $ANTLR start "rule__ErasmusProgram__Group__5__Impl"
    // InternalErasmusPrograms.g:748:1: rule__ErasmusProgram__Group__5__Impl : ( ( rule__ErasmusProgram__Group_5__0 )? ) ;
    public final void rule__ErasmusProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:752:1: ( ( ( rule__ErasmusProgram__Group_5__0 )? ) )
            // InternalErasmusPrograms.g:753:1: ( ( rule__ErasmusProgram__Group_5__0 )? )
            {
            // InternalErasmusPrograms.g:753:1: ( ( rule__ErasmusProgram__Group_5__0 )? )
            // InternalErasmusPrograms.g:754:2: ( rule__ErasmusProgram__Group_5__0 )?
            {
             before(grammarAccess.getErasmusProgramAccess().getGroup_5()); 
            // InternalErasmusPrograms.g:755:2: ( rule__ErasmusProgram__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalErasmusPrograms.g:755:3: rule__ErasmusProgram__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ErasmusProgram__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getErasmusProgramAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__5__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__6"
    // InternalErasmusPrograms.g:763:1: rule__ErasmusProgram__Group__6 : rule__ErasmusProgram__Group__6__Impl rule__ErasmusProgram__Group__7 ;
    public final void rule__ErasmusProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:767:1: ( rule__ErasmusProgram__Group__6__Impl rule__ErasmusProgram__Group__7 )
            // InternalErasmusPrograms.g:768:2: rule__ErasmusProgram__Group__6__Impl rule__ErasmusProgram__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__ErasmusProgram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__6"


    // $ANTLR start "rule__ErasmusProgram__Group__6__Impl"
    // InternalErasmusPrograms.g:775:1: rule__ErasmusProgram__Group__6__Impl : ( ( rule__ErasmusProgram__Group_6__0 )? ) ;
    public final void rule__ErasmusProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:779:1: ( ( ( rule__ErasmusProgram__Group_6__0 )? ) )
            // InternalErasmusPrograms.g:780:1: ( ( rule__ErasmusProgram__Group_6__0 )? )
            {
            // InternalErasmusPrograms.g:780:1: ( ( rule__ErasmusProgram__Group_6__0 )? )
            // InternalErasmusPrograms.g:781:2: ( rule__ErasmusProgram__Group_6__0 )?
            {
             before(grammarAccess.getErasmusProgramAccess().getGroup_6()); 
            // InternalErasmusPrograms.g:782:2: ( rule__ErasmusProgram__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErasmusPrograms.g:782:3: rule__ErasmusProgram__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ErasmusProgram__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getErasmusProgramAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__6__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__7"
    // InternalErasmusPrograms.g:790:1: rule__ErasmusProgram__Group__7 : rule__ErasmusProgram__Group__7__Impl rule__ErasmusProgram__Group__8 ;
    public final void rule__ErasmusProgram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:794:1: ( rule__ErasmusProgram__Group__7__Impl rule__ErasmusProgram__Group__8 )
            // InternalErasmusPrograms.g:795:2: rule__ErasmusProgram__Group__7__Impl rule__ErasmusProgram__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__ErasmusProgram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__7"


    // $ANTLR start "rule__ErasmusProgram__Group__7__Impl"
    // InternalErasmusPrograms.g:802:1: rule__ErasmusProgram__Group__7__Impl : ( ( rule__ErasmusProgram__Group_7__0 )? ) ;
    public final void rule__ErasmusProgram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:806:1: ( ( ( rule__ErasmusProgram__Group_7__0 )? ) )
            // InternalErasmusPrograms.g:807:1: ( ( rule__ErasmusProgram__Group_7__0 )? )
            {
            // InternalErasmusPrograms.g:807:1: ( ( rule__ErasmusProgram__Group_7__0 )? )
            // InternalErasmusPrograms.g:808:2: ( rule__ErasmusProgram__Group_7__0 )?
            {
             before(grammarAccess.getErasmusProgramAccess().getGroup_7()); 
            // InternalErasmusPrograms.g:809:2: ( rule__ErasmusProgram__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErasmusPrograms.g:809:3: rule__ErasmusProgram__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ErasmusProgram__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getErasmusProgramAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__7__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__8"
    // InternalErasmusPrograms.g:817:1: rule__ErasmusProgram__Group__8 : rule__ErasmusProgram__Group__8__Impl rule__ErasmusProgram__Group__9 ;
    public final void rule__ErasmusProgram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:821:1: ( rule__ErasmusProgram__Group__8__Impl rule__ErasmusProgram__Group__9 )
            // InternalErasmusPrograms.g:822:2: rule__ErasmusProgram__Group__8__Impl rule__ErasmusProgram__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__ErasmusProgram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__8"


    // $ANTLR start "rule__ErasmusProgram__Group__8__Impl"
    // InternalErasmusPrograms.g:829:1: rule__ErasmusProgram__Group__8__Impl : ( 'admissionStructure' ) ;
    public final void rule__ErasmusProgram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:833:1: ( ( 'admissionStructure' ) )
            // InternalErasmusPrograms.g:834:1: ( 'admissionStructure' )
            {
            // InternalErasmusPrograms.g:834:1: ( 'admissionStructure' )
            // InternalErasmusPrograms.g:835:2: 'admissionStructure'
            {
             before(grammarAccess.getErasmusProgramAccess().getAdmissionStructureKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getAdmissionStructureKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__8__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__9"
    // InternalErasmusPrograms.g:844:1: rule__ErasmusProgram__Group__9 : rule__ErasmusProgram__Group__9__Impl rule__ErasmusProgram__Group__10 ;
    public final void rule__ErasmusProgram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:848:1: ( rule__ErasmusProgram__Group__9__Impl rule__ErasmusProgram__Group__10 )
            // InternalErasmusPrograms.g:849:2: rule__ErasmusProgram__Group__9__Impl rule__ErasmusProgram__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__ErasmusProgram__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__9"


    // $ANTLR start "rule__ErasmusProgram__Group__9__Impl"
    // InternalErasmusPrograms.g:856:1: rule__ErasmusProgram__Group__9__Impl : ( ( rule__ErasmusProgram__AdmissionStructureAssignment_9 ) ) ;
    public final void rule__ErasmusProgram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:860:1: ( ( ( rule__ErasmusProgram__AdmissionStructureAssignment_9 ) ) )
            // InternalErasmusPrograms.g:861:1: ( ( rule__ErasmusProgram__AdmissionStructureAssignment_9 ) )
            {
            // InternalErasmusPrograms.g:861:1: ( ( rule__ErasmusProgram__AdmissionStructureAssignment_9 ) )
            // InternalErasmusPrograms.g:862:2: ( rule__ErasmusProgram__AdmissionStructureAssignment_9 )
            {
             before(grammarAccess.getErasmusProgramAccess().getAdmissionStructureAssignment_9()); 
            // InternalErasmusPrograms.g:863:2: ( rule__ErasmusProgram__AdmissionStructureAssignment_9 )
            // InternalErasmusPrograms.g:863:3: rule__ErasmusProgram__AdmissionStructureAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__AdmissionStructureAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getAdmissionStructureAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__9__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group__10"
    // InternalErasmusPrograms.g:871:1: rule__ErasmusProgram__Group__10 : rule__ErasmusProgram__Group__10__Impl ;
    public final void rule__ErasmusProgram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:875:1: ( rule__ErasmusProgram__Group__10__Impl )
            // InternalErasmusPrograms.g:876:2: rule__ErasmusProgram__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__10"


    // $ANTLR start "rule__ErasmusProgram__Group__10__Impl"
    // InternalErasmusPrograms.g:882:1: rule__ErasmusProgram__Group__10__Impl : ( '}' ) ;
    public final void rule__ErasmusProgram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:886:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:887:1: ( '}' )
            {
            // InternalErasmusPrograms.g:887:1: ( '}' )
            // InternalErasmusPrograms.g:888:2: '}'
            {
             before(grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group__10__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_5__0"
    // InternalErasmusPrograms.g:898:1: rule__ErasmusProgram__Group_5__0 : rule__ErasmusProgram__Group_5__0__Impl rule__ErasmusProgram__Group_5__1 ;
    public final void rule__ErasmusProgram__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:902:1: ( rule__ErasmusProgram__Group_5__0__Impl rule__ErasmusProgram__Group_5__1 )
            // InternalErasmusPrograms.g:903:2: rule__ErasmusProgram__Group_5__0__Impl rule__ErasmusProgram__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ErasmusProgram__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__0"


    // $ANTLR start "rule__ErasmusProgram__Group_5__0__Impl"
    // InternalErasmusPrograms.g:910:1: rule__ErasmusProgram__Group_5__0__Impl : ( 'universities' ) ;
    public final void rule__ErasmusProgram__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:914:1: ( ( 'universities' ) )
            // InternalErasmusPrograms.g:915:1: ( 'universities' )
            {
            // InternalErasmusPrograms.g:915:1: ( 'universities' )
            // InternalErasmusPrograms.g:916:2: 'universities'
            {
             before(grammarAccess.getErasmusProgramAccess().getUniversitiesKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getUniversitiesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__0__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_5__1"
    // InternalErasmusPrograms.g:925:1: rule__ErasmusProgram__Group_5__1 : rule__ErasmusProgram__Group_5__1__Impl rule__ErasmusProgram__Group_5__2 ;
    public final void rule__ErasmusProgram__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:929:1: ( rule__ErasmusProgram__Group_5__1__Impl rule__ErasmusProgram__Group_5__2 )
            // InternalErasmusPrograms.g:930:2: rule__ErasmusProgram__Group_5__1__Impl rule__ErasmusProgram__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__ErasmusProgram__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__1"


    // $ANTLR start "rule__ErasmusProgram__Group_5__1__Impl"
    // InternalErasmusPrograms.g:937:1: rule__ErasmusProgram__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ErasmusProgram__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:941:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:942:1: ( '{' )
            {
            // InternalErasmusPrograms.g:942:1: ( '{' )
            // InternalErasmusPrograms.g:943:2: '{'
            {
             before(grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__1__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_5__2"
    // InternalErasmusPrograms.g:952:1: rule__ErasmusProgram__Group_5__2 : rule__ErasmusProgram__Group_5__2__Impl rule__ErasmusProgram__Group_5__3 ;
    public final void rule__ErasmusProgram__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:956:1: ( rule__ErasmusProgram__Group_5__2__Impl rule__ErasmusProgram__Group_5__3 )
            // InternalErasmusPrograms.g:957:2: rule__ErasmusProgram__Group_5__2__Impl rule__ErasmusProgram__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__ErasmusProgram__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__2"


    // $ANTLR start "rule__ErasmusProgram__Group_5__2__Impl"
    // InternalErasmusPrograms.g:964:1: rule__ErasmusProgram__Group_5__2__Impl : ( ( rule__ErasmusProgram__UniversitiesAssignment_5_2 ) ) ;
    public final void rule__ErasmusProgram__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:968:1: ( ( ( rule__ErasmusProgram__UniversitiesAssignment_5_2 ) ) )
            // InternalErasmusPrograms.g:969:1: ( ( rule__ErasmusProgram__UniversitiesAssignment_5_2 ) )
            {
            // InternalErasmusPrograms.g:969:1: ( ( rule__ErasmusProgram__UniversitiesAssignment_5_2 ) )
            // InternalErasmusPrograms.g:970:2: ( rule__ErasmusProgram__UniversitiesAssignment_5_2 )
            {
             before(grammarAccess.getErasmusProgramAccess().getUniversitiesAssignment_5_2()); 
            // InternalErasmusPrograms.g:971:2: ( rule__ErasmusProgram__UniversitiesAssignment_5_2 )
            // InternalErasmusPrograms.g:971:3: rule__ErasmusProgram__UniversitiesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__UniversitiesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getUniversitiesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__2__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_5__3"
    // InternalErasmusPrograms.g:979:1: rule__ErasmusProgram__Group_5__3 : rule__ErasmusProgram__Group_5__3__Impl rule__ErasmusProgram__Group_5__4 ;
    public final void rule__ErasmusProgram__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:983:1: ( rule__ErasmusProgram__Group_5__3__Impl rule__ErasmusProgram__Group_5__4 )
            // InternalErasmusPrograms.g:984:2: rule__ErasmusProgram__Group_5__3__Impl rule__ErasmusProgram__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__ErasmusProgram__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__3"


    // $ANTLR start "rule__ErasmusProgram__Group_5__3__Impl"
    // InternalErasmusPrograms.g:991:1: rule__ErasmusProgram__Group_5__3__Impl : ( ( rule__ErasmusProgram__Group_5_3__0 )* ) ;
    public final void rule__ErasmusProgram__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:995:1: ( ( ( rule__ErasmusProgram__Group_5_3__0 )* ) )
            // InternalErasmusPrograms.g:996:1: ( ( rule__ErasmusProgram__Group_5_3__0 )* )
            {
            // InternalErasmusPrograms.g:996:1: ( ( rule__ErasmusProgram__Group_5_3__0 )* )
            // InternalErasmusPrograms.g:997:2: ( rule__ErasmusProgram__Group_5_3__0 )*
            {
             before(grammarAccess.getErasmusProgramAccess().getGroup_5_3()); 
            // InternalErasmusPrograms.g:998:2: ( rule__ErasmusProgram__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErasmusPrograms.g:998:3: rule__ErasmusProgram__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ErasmusProgram__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getErasmusProgramAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__3__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_5__4"
    // InternalErasmusPrograms.g:1006:1: rule__ErasmusProgram__Group_5__4 : rule__ErasmusProgram__Group_5__4__Impl ;
    public final void rule__ErasmusProgram__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1010:1: ( rule__ErasmusProgram__Group_5__4__Impl )
            // InternalErasmusPrograms.g:1011:2: rule__ErasmusProgram__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__4"


    // $ANTLR start "rule__ErasmusProgram__Group_5__4__Impl"
    // InternalErasmusPrograms.g:1017:1: rule__ErasmusProgram__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ErasmusProgram__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1021:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:1022:1: ( '}' )
            {
            // InternalErasmusPrograms.g:1022:1: ( '}' )
            // InternalErasmusPrograms.g:1023:2: '}'
            {
             before(grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5__4__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_5_3__0"
    // InternalErasmusPrograms.g:1033:1: rule__ErasmusProgram__Group_5_3__0 : rule__ErasmusProgram__Group_5_3__0__Impl rule__ErasmusProgram__Group_5_3__1 ;
    public final void rule__ErasmusProgram__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1037:1: ( rule__ErasmusProgram__Group_5_3__0__Impl rule__ErasmusProgram__Group_5_3__1 )
            // InternalErasmusPrograms.g:1038:2: rule__ErasmusProgram__Group_5_3__0__Impl rule__ErasmusProgram__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__ErasmusProgram__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5_3__0"


    // $ANTLR start "rule__ErasmusProgram__Group_5_3__0__Impl"
    // InternalErasmusPrograms.g:1045:1: rule__ErasmusProgram__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ErasmusProgram__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1049:1: ( ( ',' ) )
            // InternalErasmusPrograms.g:1050:1: ( ',' )
            {
            // InternalErasmusPrograms.g:1050:1: ( ',' )
            // InternalErasmusPrograms.g:1051:2: ','
            {
             before(grammarAccess.getErasmusProgramAccess().getCommaKeyword_5_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5_3__0__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_5_3__1"
    // InternalErasmusPrograms.g:1060:1: rule__ErasmusProgram__Group_5_3__1 : rule__ErasmusProgram__Group_5_3__1__Impl ;
    public final void rule__ErasmusProgram__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1064:1: ( rule__ErasmusProgram__Group_5_3__1__Impl )
            // InternalErasmusPrograms.g:1065:2: rule__ErasmusProgram__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5_3__1"


    // $ANTLR start "rule__ErasmusProgram__Group_5_3__1__Impl"
    // InternalErasmusPrograms.g:1071:1: rule__ErasmusProgram__Group_5_3__1__Impl : ( ( rule__ErasmusProgram__UniversitiesAssignment_5_3_1 ) ) ;
    public final void rule__ErasmusProgram__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1075:1: ( ( ( rule__ErasmusProgram__UniversitiesAssignment_5_3_1 ) ) )
            // InternalErasmusPrograms.g:1076:1: ( ( rule__ErasmusProgram__UniversitiesAssignment_5_3_1 ) )
            {
            // InternalErasmusPrograms.g:1076:1: ( ( rule__ErasmusProgram__UniversitiesAssignment_5_3_1 ) )
            // InternalErasmusPrograms.g:1077:2: ( rule__ErasmusProgram__UniversitiesAssignment_5_3_1 )
            {
             before(grammarAccess.getErasmusProgramAccess().getUniversitiesAssignment_5_3_1()); 
            // InternalErasmusPrograms.g:1078:2: ( rule__ErasmusProgram__UniversitiesAssignment_5_3_1 )
            // InternalErasmusPrograms.g:1078:3: rule__ErasmusProgram__UniversitiesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__UniversitiesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getUniversitiesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_5_3__1__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_6__0"
    // InternalErasmusPrograms.g:1087:1: rule__ErasmusProgram__Group_6__0 : rule__ErasmusProgram__Group_6__0__Impl rule__ErasmusProgram__Group_6__1 ;
    public final void rule__ErasmusProgram__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1091:1: ( rule__ErasmusProgram__Group_6__0__Impl rule__ErasmusProgram__Group_6__1 )
            // InternalErasmusPrograms.g:1092:2: rule__ErasmusProgram__Group_6__0__Impl rule__ErasmusProgram__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__ErasmusProgram__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__0"


    // $ANTLR start "rule__ErasmusProgram__Group_6__0__Impl"
    // InternalErasmusPrograms.g:1099:1: rule__ErasmusProgram__Group_6__0__Impl : ( 'scholarships' ) ;
    public final void rule__ErasmusProgram__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1103:1: ( ( 'scholarships' ) )
            // InternalErasmusPrograms.g:1104:1: ( 'scholarships' )
            {
            // InternalErasmusPrograms.g:1104:1: ( 'scholarships' )
            // InternalErasmusPrograms.g:1105:2: 'scholarships'
            {
             before(grammarAccess.getErasmusProgramAccess().getScholarshipsKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getScholarshipsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__0__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_6__1"
    // InternalErasmusPrograms.g:1114:1: rule__ErasmusProgram__Group_6__1 : rule__ErasmusProgram__Group_6__1__Impl rule__ErasmusProgram__Group_6__2 ;
    public final void rule__ErasmusProgram__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1118:1: ( rule__ErasmusProgram__Group_6__1__Impl rule__ErasmusProgram__Group_6__2 )
            // InternalErasmusPrograms.g:1119:2: rule__ErasmusProgram__Group_6__1__Impl rule__ErasmusProgram__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__ErasmusProgram__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__1"


    // $ANTLR start "rule__ErasmusProgram__Group_6__1__Impl"
    // InternalErasmusPrograms.g:1126:1: rule__ErasmusProgram__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ErasmusProgram__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1130:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:1131:1: ( '{' )
            {
            // InternalErasmusPrograms.g:1131:1: ( '{' )
            // InternalErasmusPrograms.g:1132:2: '{'
            {
             before(grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__1__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_6__2"
    // InternalErasmusPrograms.g:1141:1: rule__ErasmusProgram__Group_6__2 : rule__ErasmusProgram__Group_6__2__Impl rule__ErasmusProgram__Group_6__3 ;
    public final void rule__ErasmusProgram__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1145:1: ( rule__ErasmusProgram__Group_6__2__Impl rule__ErasmusProgram__Group_6__3 )
            // InternalErasmusPrograms.g:1146:2: rule__ErasmusProgram__Group_6__2__Impl rule__ErasmusProgram__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__ErasmusProgram__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__2"


    // $ANTLR start "rule__ErasmusProgram__Group_6__2__Impl"
    // InternalErasmusPrograms.g:1153:1: rule__ErasmusProgram__Group_6__2__Impl : ( ( rule__ErasmusProgram__ScholarshipsAssignment_6_2 ) ) ;
    public final void rule__ErasmusProgram__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1157:1: ( ( ( rule__ErasmusProgram__ScholarshipsAssignment_6_2 ) ) )
            // InternalErasmusPrograms.g:1158:1: ( ( rule__ErasmusProgram__ScholarshipsAssignment_6_2 ) )
            {
            // InternalErasmusPrograms.g:1158:1: ( ( rule__ErasmusProgram__ScholarshipsAssignment_6_2 ) )
            // InternalErasmusPrograms.g:1159:2: ( rule__ErasmusProgram__ScholarshipsAssignment_6_2 )
            {
             before(grammarAccess.getErasmusProgramAccess().getScholarshipsAssignment_6_2()); 
            // InternalErasmusPrograms.g:1160:2: ( rule__ErasmusProgram__ScholarshipsAssignment_6_2 )
            // InternalErasmusPrograms.g:1160:3: rule__ErasmusProgram__ScholarshipsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__ScholarshipsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getScholarshipsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__2__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_6__3"
    // InternalErasmusPrograms.g:1168:1: rule__ErasmusProgram__Group_6__3 : rule__ErasmusProgram__Group_6__3__Impl rule__ErasmusProgram__Group_6__4 ;
    public final void rule__ErasmusProgram__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1172:1: ( rule__ErasmusProgram__Group_6__3__Impl rule__ErasmusProgram__Group_6__4 )
            // InternalErasmusPrograms.g:1173:2: rule__ErasmusProgram__Group_6__3__Impl rule__ErasmusProgram__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__ErasmusProgram__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__3"


    // $ANTLR start "rule__ErasmusProgram__Group_6__3__Impl"
    // InternalErasmusPrograms.g:1180:1: rule__ErasmusProgram__Group_6__3__Impl : ( ( rule__ErasmusProgram__Group_6_3__0 )* ) ;
    public final void rule__ErasmusProgram__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1184:1: ( ( ( rule__ErasmusProgram__Group_6_3__0 )* ) )
            // InternalErasmusPrograms.g:1185:1: ( ( rule__ErasmusProgram__Group_6_3__0 )* )
            {
            // InternalErasmusPrograms.g:1185:1: ( ( rule__ErasmusProgram__Group_6_3__0 )* )
            // InternalErasmusPrograms.g:1186:2: ( rule__ErasmusProgram__Group_6_3__0 )*
            {
             before(grammarAccess.getErasmusProgramAccess().getGroup_6_3()); 
            // InternalErasmusPrograms.g:1187:2: ( rule__ErasmusProgram__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalErasmusPrograms.g:1187:3: rule__ErasmusProgram__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ErasmusProgram__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getErasmusProgramAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__3__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_6__4"
    // InternalErasmusPrograms.g:1195:1: rule__ErasmusProgram__Group_6__4 : rule__ErasmusProgram__Group_6__4__Impl ;
    public final void rule__ErasmusProgram__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1199:1: ( rule__ErasmusProgram__Group_6__4__Impl )
            // InternalErasmusPrograms.g:1200:2: rule__ErasmusProgram__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__4"


    // $ANTLR start "rule__ErasmusProgram__Group_6__4__Impl"
    // InternalErasmusPrograms.g:1206:1: rule__ErasmusProgram__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ErasmusProgram__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1210:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:1211:1: ( '}' )
            {
            // InternalErasmusPrograms.g:1211:1: ( '}' )
            // InternalErasmusPrograms.g:1212:2: '}'
            {
             before(grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6__4__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_6_3__0"
    // InternalErasmusPrograms.g:1222:1: rule__ErasmusProgram__Group_6_3__0 : rule__ErasmusProgram__Group_6_3__0__Impl rule__ErasmusProgram__Group_6_3__1 ;
    public final void rule__ErasmusProgram__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1226:1: ( rule__ErasmusProgram__Group_6_3__0__Impl rule__ErasmusProgram__Group_6_3__1 )
            // InternalErasmusPrograms.g:1227:2: rule__ErasmusProgram__Group_6_3__0__Impl rule__ErasmusProgram__Group_6_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ErasmusProgram__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6_3__0"


    // $ANTLR start "rule__ErasmusProgram__Group_6_3__0__Impl"
    // InternalErasmusPrograms.g:1234:1: rule__ErasmusProgram__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ErasmusProgram__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1238:1: ( ( ',' ) )
            // InternalErasmusPrograms.g:1239:1: ( ',' )
            {
            // InternalErasmusPrograms.g:1239:1: ( ',' )
            // InternalErasmusPrograms.g:1240:2: ','
            {
             before(grammarAccess.getErasmusProgramAccess().getCommaKeyword_6_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6_3__0__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_6_3__1"
    // InternalErasmusPrograms.g:1249:1: rule__ErasmusProgram__Group_6_3__1 : rule__ErasmusProgram__Group_6_3__1__Impl ;
    public final void rule__ErasmusProgram__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1253:1: ( rule__ErasmusProgram__Group_6_3__1__Impl )
            // InternalErasmusPrograms.g:1254:2: rule__ErasmusProgram__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6_3__1"


    // $ANTLR start "rule__ErasmusProgram__Group_6_3__1__Impl"
    // InternalErasmusPrograms.g:1260:1: rule__ErasmusProgram__Group_6_3__1__Impl : ( ( rule__ErasmusProgram__ScholarshipsAssignment_6_3_1 ) ) ;
    public final void rule__ErasmusProgram__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1264:1: ( ( ( rule__ErasmusProgram__ScholarshipsAssignment_6_3_1 ) ) )
            // InternalErasmusPrograms.g:1265:1: ( ( rule__ErasmusProgram__ScholarshipsAssignment_6_3_1 ) )
            {
            // InternalErasmusPrograms.g:1265:1: ( ( rule__ErasmusProgram__ScholarshipsAssignment_6_3_1 ) )
            // InternalErasmusPrograms.g:1266:2: ( rule__ErasmusProgram__ScholarshipsAssignment_6_3_1 )
            {
             before(grammarAccess.getErasmusProgramAccess().getScholarshipsAssignment_6_3_1()); 
            // InternalErasmusPrograms.g:1267:2: ( rule__ErasmusProgram__ScholarshipsAssignment_6_3_1 )
            // InternalErasmusPrograms.g:1267:3: rule__ErasmusProgram__ScholarshipsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__ScholarshipsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getScholarshipsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_6_3__1__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_7__0"
    // InternalErasmusPrograms.g:1276:1: rule__ErasmusProgram__Group_7__0 : rule__ErasmusProgram__Group_7__0__Impl rule__ErasmusProgram__Group_7__1 ;
    public final void rule__ErasmusProgram__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1280:1: ( rule__ErasmusProgram__Group_7__0__Impl rule__ErasmusProgram__Group_7__1 )
            // InternalErasmusPrograms.g:1281:2: rule__ErasmusProgram__Group_7__0__Impl rule__ErasmusProgram__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__ErasmusProgram__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__0"


    // $ANTLR start "rule__ErasmusProgram__Group_7__0__Impl"
    // InternalErasmusPrograms.g:1288:1: rule__ErasmusProgram__Group_7__0__Impl : ( 'associatePartners' ) ;
    public final void rule__ErasmusProgram__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1292:1: ( ( 'associatePartners' ) )
            // InternalErasmusPrograms.g:1293:1: ( 'associatePartners' )
            {
            // InternalErasmusPrograms.g:1293:1: ( 'associatePartners' )
            // InternalErasmusPrograms.g:1294:2: 'associatePartners'
            {
             before(grammarAccess.getErasmusProgramAccess().getAssociatePartnersKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getAssociatePartnersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__0__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_7__1"
    // InternalErasmusPrograms.g:1303:1: rule__ErasmusProgram__Group_7__1 : rule__ErasmusProgram__Group_7__1__Impl rule__ErasmusProgram__Group_7__2 ;
    public final void rule__ErasmusProgram__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1307:1: ( rule__ErasmusProgram__Group_7__1__Impl rule__ErasmusProgram__Group_7__2 )
            // InternalErasmusPrograms.g:1308:2: rule__ErasmusProgram__Group_7__1__Impl rule__ErasmusProgram__Group_7__2
            {
            pushFollow(FOLLOW_3);
            rule__ErasmusProgram__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__1"


    // $ANTLR start "rule__ErasmusProgram__Group_7__1__Impl"
    // InternalErasmusPrograms.g:1315:1: rule__ErasmusProgram__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ErasmusProgram__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1319:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:1320:1: ( '{' )
            {
            // InternalErasmusPrograms.g:1320:1: ( '{' )
            // InternalErasmusPrograms.g:1321:2: '{'
            {
             before(grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__1__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_7__2"
    // InternalErasmusPrograms.g:1330:1: rule__ErasmusProgram__Group_7__2 : rule__ErasmusProgram__Group_7__2__Impl rule__ErasmusProgram__Group_7__3 ;
    public final void rule__ErasmusProgram__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1334:1: ( rule__ErasmusProgram__Group_7__2__Impl rule__ErasmusProgram__Group_7__3 )
            // InternalErasmusPrograms.g:1335:2: rule__ErasmusProgram__Group_7__2__Impl rule__ErasmusProgram__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__ErasmusProgram__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__2"


    // $ANTLR start "rule__ErasmusProgram__Group_7__2__Impl"
    // InternalErasmusPrograms.g:1342:1: rule__ErasmusProgram__Group_7__2__Impl : ( ( rule__ErasmusProgram__AssociatePartnersAssignment_7_2 ) ) ;
    public final void rule__ErasmusProgram__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1346:1: ( ( ( rule__ErasmusProgram__AssociatePartnersAssignment_7_2 ) ) )
            // InternalErasmusPrograms.g:1347:1: ( ( rule__ErasmusProgram__AssociatePartnersAssignment_7_2 ) )
            {
            // InternalErasmusPrograms.g:1347:1: ( ( rule__ErasmusProgram__AssociatePartnersAssignment_7_2 ) )
            // InternalErasmusPrograms.g:1348:2: ( rule__ErasmusProgram__AssociatePartnersAssignment_7_2 )
            {
             before(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssignment_7_2()); 
            // InternalErasmusPrograms.g:1349:2: ( rule__ErasmusProgram__AssociatePartnersAssignment_7_2 )
            // InternalErasmusPrograms.g:1349:3: rule__ErasmusProgram__AssociatePartnersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__AssociatePartnersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__2__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_7__3"
    // InternalErasmusPrograms.g:1357:1: rule__ErasmusProgram__Group_7__3 : rule__ErasmusProgram__Group_7__3__Impl rule__ErasmusProgram__Group_7__4 ;
    public final void rule__ErasmusProgram__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1361:1: ( rule__ErasmusProgram__Group_7__3__Impl rule__ErasmusProgram__Group_7__4 )
            // InternalErasmusPrograms.g:1362:2: rule__ErasmusProgram__Group_7__3__Impl rule__ErasmusProgram__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__ErasmusProgram__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__3"


    // $ANTLR start "rule__ErasmusProgram__Group_7__3__Impl"
    // InternalErasmusPrograms.g:1369:1: rule__ErasmusProgram__Group_7__3__Impl : ( ( rule__ErasmusProgram__Group_7_3__0 )* ) ;
    public final void rule__ErasmusProgram__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1373:1: ( ( ( rule__ErasmusProgram__Group_7_3__0 )* ) )
            // InternalErasmusPrograms.g:1374:1: ( ( rule__ErasmusProgram__Group_7_3__0 )* )
            {
            // InternalErasmusPrograms.g:1374:1: ( ( rule__ErasmusProgram__Group_7_3__0 )* )
            // InternalErasmusPrograms.g:1375:2: ( rule__ErasmusProgram__Group_7_3__0 )*
            {
             before(grammarAccess.getErasmusProgramAccess().getGroup_7_3()); 
            // InternalErasmusPrograms.g:1376:2: ( rule__ErasmusProgram__Group_7_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalErasmusPrograms.g:1376:3: rule__ErasmusProgram__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ErasmusProgram__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getErasmusProgramAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__3__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_7__4"
    // InternalErasmusPrograms.g:1384:1: rule__ErasmusProgram__Group_7__4 : rule__ErasmusProgram__Group_7__4__Impl ;
    public final void rule__ErasmusProgram__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1388:1: ( rule__ErasmusProgram__Group_7__4__Impl )
            // InternalErasmusPrograms.g:1389:2: rule__ErasmusProgram__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__4"


    // $ANTLR start "rule__ErasmusProgram__Group_7__4__Impl"
    // InternalErasmusPrograms.g:1395:1: rule__ErasmusProgram__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ErasmusProgram__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1399:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:1400:1: ( '}' )
            {
            // InternalErasmusPrograms.g:1400:1: ( '}' )
            // InternalErasmusPrograms.g:1401:2: '}'
            {
             before(grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7__4__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_7_3__0"
    // InternalErasmusPrograms.g:1411:1: rule__ErasmusProgram__Group_7_3__0 : rule__ErasmusProgram__Group_7_3__0__Impl rule__ErasmusProgram__Group_7_3__1 ;
    public final void rule__ErasmusProgram__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1415:1: ( rule__ErasmusProgram__Group_7_3__0__Impl rule__ErasmusProgram__Group_7_3__1 )
            // InternalErasmusPrograms.g:1416:2: rule__ErasmusProgram__Group_7_3__0__Impl rule__ErasmusProgram__Group_7_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ErasmusProgram__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7_3__0"


    // $ANTLR start "rule__ErasmusProgram__Group_7_3__0__Impl"
    // InternalErasmusPrograms.g:1423:1: rule__ErasmusProgram__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ErasmusProgram__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1427:1: ( ( ',' ) )
            // InternalErasmusPrograms.g:1428:1: ( ',' )
            {
            // InternalErasmusPrograms.g:1428:1: ( ',' )
            // InternalErasmusPrograms.g:1429:2: ','
            {
             before(grammarAccess.getErasmusProgramAccess().getCommaKeyword_7_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7_3__0__Impl"


    // $ANTLR start "rule__ErasmusProgram__Group_7_3__1"
    // InternalErasmusPrograms.g:1438:1: rule__ErasmusProgram__Group_7_3__1 : rule__ErasmusProgram__Group_7_3__1__Impl ;
    public final void rule__ErasmusProgram__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1442:1: ( rule__ErasmusProgram__Group_7_3__1__Impl )
            // InternalErasmusPrograms.g:1443:2: rule__ErasmusProgram__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7_3__1"


    // $ANTLR start "rule__ErasmusProgram__Group_7_3__1__Impl"
    // InternalErasmusPrograms.g:1449:1: rule__ErasmusProgram__Group_7_3__1__Impl : ( ( rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1 ) ) ;
    public final void rule__ErasmusProgram__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1453:1: ( ( ( rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1 ) ) )
            // InternalErasmusPrograms.g:1454:1: ( ( rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1 ) )
            {
            // InternalErasmusPrograms.g:1454:1: ( ( rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1 ) )
            // InternalErasmusPrograms.g:1455:2: ( rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1 )
            {
             before(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssignment_7_3_1()); 
            // InternalErasmusPrograms.g:1456:2: ( rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1 )
            // InternalErasmusPrograms.g:1456:3: rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__Group_7_3__1__Impl"


    // $ANTLR start "rule__Scholarship__Group__0"
    // InternalErasmusPrograms.g:1465:1: rule__Scholarship__Group__0 : rule__Scholarship__Group__0__Impl rule__Scholarship__Group__1 ;
    public final void rule__Scholarship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1469:1: ( rule__Scholarship__Group__0__Impl rule__Scholarship__Group__1 )
            // InternalErasmusPrograms.g:1470:2: rule__Scholarship__Group__0__Impl rule__Scholarship__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Scholarship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__0"


    // $ANTLR start "rule__Scholarship__Group__0__Impl"
    // InternalErasmusPrograms.g:1477:1: rule__Scholarship__Group__0__Impl : ( ( rule__Scholarship__TypeAssignment_0 ) ) ;
    public final void rule__Scholarship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1481:1: ( ( ( rule__Scholarship__TypeAssignment_0 ) ) )
            // InternalErasmusPrograms.g:1482:1: ( ( rule__Scholarship__TypeAssignment_0 ) )
            {
            // InternalErasmusPrograms.g:1482:1: ( ( rule__Scholarship__TypeAssignment_0 ) )
            // InternalErasmusPrograms.g:1483:2: ( rule__Scholarship__TypeAssignment_0 )
            {
             before(grammarAccess.getScholarshipAccess().getTypeAssignment_0()); 
            // InternalErasmusPrograms.g:1484:2: ( rule__Scholarship__TypeAssignment_0 )
            // InternalErasmusPrograms.g:1484:3: rule__Scholarship__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Scholarship__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScholarshipAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__0__Impl"


    // $ANTLR start "rule__Scholarship__Group__1"
    // InternalErasmusPrograms.g:1492:1: rule__Scholarship__Group__1 : rule__Scholarship__Group__1__Impl rule__Scholarship__Group__2 ;
    public final void rule__Scholarship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1496:1: ( rule__Scholarship__Group__1__Impl rule__Scholarship__Group__2 )
            // InternalErasmusPrograms.g:1497:2: rule__Scholarship__Group__1__Impl rule__Scholarship__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Scholarship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__1"


    // $ANTLR start "rule__Scholarship__Group__1__Impl"
    // InternalErasmusPrograms.g:1504:1: rule__Scholarship__Group__1__Impl : ( '{' ) ;
    public final void rule__Scholarship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1508:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:1509:1: ( '{' )
            {
            // InternalErasmusPrograms.g:1509:1: ( '{' )
            // InternalErasmusPrograms.g:1510:2: '{'
            {
             before(grammarAccess.getScholarshipAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getScholarshipAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__1__Impl"


    // $ANTLR start "rule__Scholarship__Group__2"
    // InternalErasmusPrograms.g:1519:1: rule__Scholarship__Group__2 : rule__Scholarship__Group__2__Impl rule__Scholarship__Group__3 ;
    public final void rule__Scholarship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1523:1: ( rule__Scholarship__Group__2__Impl rule__Scholarship__Group__3 )
            // InternalErasmusPrograms.g:1524:2: rule__Scholarship__Group__2__Impl rule__Scholarship__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Scholarship__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__2"


    // $ANTLR start "rule__Scholarship__Group__2__Impl"
    // InternalErasmusPrograms.g:1531:1: rule__Scholarship__Group__2__Impl : ( 'tuitionFee' ) ;
    public final void rule__Scholarship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1535:1: ( ( 'tuitionFee' ) )
            // InternalErasmusPrograms.g:1536:1: ( 'tuitionFee' )
            {
            // InternalErasmusPrograms.g:1536:1: ( 'tuitionFee' )
            // InternalErasmusPrograms.g:1537:2: 'tuitionFee'
            {
             before(grammarAccess.getScholarshipAccess().getTuitionFeeKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getScholarshipAccess().getTuitionFeeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__2__Impl"


    // $ANTLR start "rule__Scholarship__Group__3"
    // InternalErasmusPrograms.g:1546:1: rule__Scholarship__Group__3 : rule__Scholarship__Group__3__Impl rule__Scholarship__Group__4 ;
    public final void rule__Scholarship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1550:1: ( rule__Scholarship__Group__3__Impl rule__Scholarship__Group__4 )
            // InternalErasmusPrograms.g:1551:2: rule__Scholarship__Group__3__Impl rule__Scholarship__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Scholarship__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__3"


    // $ANTLR start "rule__Scholarship__Group__3__Impl"
    // InternalErasmusPrograms.g:1558:1: rule__Scholarship__Group__3__Impl : ( ( rule__Scholarship__TuitionFeeAssignment_3 ) ) ;
    public final void rule__Scholarship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1562:1: ( ( ( rule__Scholarship__TuitionFeeAssignment_3 ) ) )
            // InternalErasmusPrograms.g:1563:1: ( ( rule__Scholarship__TuitionFeeAssignment_3 ) )
            {
            // InternalErasmusPrograms.g:1563:1: ( ( rule__Scholarship__TuitionFeeAssignment_3 ) )
            // InternalErasmusPrograms.g:1564:2: ( rule__Scholarship__TuitionFeeAssignment_3 )
            {
             before(grammarAccess.getScholarshipAccess().getTuitionFeeAssignment_3()); 
            // InternalErasmusPrograms.g:1565:2: ( rule__Scholarship__TuitionFeeAssignment_3 )
            // InternalErasmusPrograms.g:1565:3: rule__Scholarship__TuitionFeeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scholarship__TuitionFeeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScholarshipAccess().getTuitionFeeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__3__Impl"


    // $ANTLR start "rule__Scholarship__Group__4"
    // InternalErasmusPrograms.g:1573:1: rule__Scholarship__Group__4 : rule__Scholarship__Group__4__Impl rule__Scholarship__Group__5 ;
    public final void rule__Scholarship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1577:1: ( rule__Scholarship__Group__4__Impl rule__Scholarship__Group__5 )
            // InternalErasmusPrograms.g:1578:2: rule__Scholarship__Group__4__Impl rule__Scholarship__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Scholarship__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__4"


    // $ANTLR start "rule__Scholarship__Group__4__Impl"
    // InternalErasmusPrograms.g:1585:1: rule__Scholarship__Group__4__Impl : ( 'travelGrant' ) ;
    public final void rule__Scholarship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1589:1: ( ( 'travelGrant' ) )
            // InternalErasmusPrograms.g:1590:1: ( 'travelGrant' )
            {
            // InternalErasmusPrograms.g:1590:1: ( 'travelGrant' )
            // InternalErasmusPrograms.g:1591:2: 'travelGrant'
            {
             before(grammarAccess.getScholarshipAccess().getTravelGrantKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getScholarshipAccess().getTravelGrantKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__4__Impl"


    // $ANTLR start "rule__Scholarship__Group__5"
    // InternalErasmusPrograms.g:1600:1: rule__Scholarship__Group__5 : rule__Scholarship__Group__5__Impl rule__Scholarship__Group__6 ;
    public final void rule__Scholarship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1604:1: ( rule__Scholarship__Group__5__Impl rule__Scholarship__Group__6 )
            // InternalErasmusPrograms.g:1605:2: rule__Scholarship__Group__5__Impl rule__Scholarship__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Scholarship__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__5"


    // $ANTLR start "rule__Scholarship__Group__5__Impl"
    // InternalErasmusPrograms.g:1612:1: rule__Scholarship__Group__5__Impl : ( ( rule__Scholarship__TravelGrantAssignment_5 ) ) ;
    public final void rule__Scholarship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1616:1: ( ( ( rule__Scholarship__TravelGrantAssignment_5 ) ) )
            // InternalErasmusPrograms.g:1617:1: ( ( rule__Scholarship__TravelGrantAssignment_5 ) )
            {
            // InternalErasmusPrograms.g:1617:1: ( ( rule__Scholarship__TravelGrantAssignment_5 ) )
            // InternalErasmusPrograms.g:1618:2: ( rule__Scholarship__TravelGrantAssignment_5 )
            {
             before(grammarAccess.getScholarshipAccess().getTravelGrantAssignment_5()); 
            // InternalErasmusPrograms.g:1619:2: ( rule__Scholarship__TravelGrantAssignment_5 )
            // InternalErasmusPrograms.g:1619:3: rule__Scholarship__TravelGrantAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Scholarship__TravelGrantAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScholarshipAccess().getTravelGrantAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__5__Impl"


    // $ANTLR start "rule__Scholarship__Group__6"
    // InternalErasmusPrograms.g:1627:1: rule__Scholarship__Group__6 : rule__Scholarship__Group__6__Impl rule__Scholarship__Group__7 ;
    public final void rule__Scholarship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1631:1: ( rule__Scholarship__Group__6__Impl rule__Scholarship__Group__7 )
            // InternalErasmusPrograms.g:1632:2: rule__Scholarship__Group__6__Impl rule__Scholarship__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Scholarship__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__6"


    // $ANTLR start "rule__Scholarship__Group__6__Impl"
    // InternalErasmusPrograms.g:1639:1: rule__Scholarship__Group__6__Impl : ( 'allowance' ) ;
    public final void rule__Scholarship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1643:1: ( ( 'allowance' ) )
            // InternalErasmusPrograms.g:1644:1: ( 'allowance' )
            {
            // InternalErasmusPrograms.g:1644:1: ( 'allowance' )
            // InternalErasmusPrograms.g:1645:2: 'allowance'
            {
             before(grammarAccess.getScholarshipAccess().getAllowanceKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getScholarshipAccess().getAllowanceKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__6__Impl"


    // $ANTLR start "rule__Scholarship__Group__7"
    // InternalErasmusPrograms.g:1654:1: rule__Scholarship__Group__7 : rule__Scholarship__Group__7__Impl rule__Scholarship__Group__8 ;
    public final void rule__Scholarship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1658:1: ( rule__Scholarship__Group__7__Impl rule__Scholarship__Group__8 )
            // InternalErasmusPrograms.g:1659:2: rule__Scholarship__Group__7__Impl rule__Scholarship__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Scholarship__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__7"


    // $ANTLR start "rule__Scholarship__Group__7__Impl"
    // InternalErasmusPrograms.g:1666:1: rule__Scholarship__Group__7__Impl : ( ( rule__Scholarship__AllowanceAssignment_7 ) ) ;
    public final void rule__Scholarship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1670:1: ( ( ( rule__Scholarship__AllowanceAssignment_7 ) ) )
            // InternalErasmusPrograms.g:1671:1: ( ( rule__Scholarship__AllowanceAssignment_7 ) )
            {
            // InternalErasmusPrograms.g:1671:1: ( ( rule__Scholarship__AllowanceAssignment_7 ) )
            // InternalErasmusPrograms.g:1672:2: ( rule__Scholarship__AllowanceAssignment_7 )
            {
             before(grammarAccess.getScholarshipAccess().getAllowanceAssignment_7()); 
            // InternalErasmusPrograms.g:1673:2: ( rule__Scholarship__AllowanceAssignment_7 )
            // InternalErasmusPrograms.g:1673:3: rule__Scholarship__AllowanceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Scholarship__AllowanceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getScholarshipAccess().getAllowanceAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__7__Impl"


    // $ANTLR start "rule__Scholarship__Group__8"
    // InternalErasmusPrograms.g:1681:1: rule__Scholarship__Group__8 : rule__Scholarship__Group__8__Impl ;
    public final void rule__Scholarship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1685:1: ( rule__Scholarship__Group__8__Impl )
            // InternalErasmusPrograms.g:1686:2: rule__Scholarship__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scholarship__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__8"


    // $ANTLR start "rule__Scholarship__Group__8__Impl"
    // InternalErasmusPrograms.g:1692:1: rule__Scholarship__Group__8__Impl : ( '}' ) ;
    public final void rule__Scholarship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1696:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:1697:1: ( '}' )
            {
            // InternalErasmusPrograms.g:1697:1: ( '}' )
            // InternalErasmusPrograms.g:1698:2: '}'
            {
             before(grammarAccess.getScholarshipAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getScholarshipAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__Group__8__Impl"


    // $ANTLR start "rule__University__Group__0"
    // InternalErasmusPrograms.g:1708:1: rule__University__Group__0 : rule__University__Group__0__Impl rule__University__Group__1 ;
    public final void rule__University__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1712:1: ( rule__University__Group__0__Impl rule__University__Group__1 )
            // InternalErasmusPrograms.g:1713:2: rule__University__Group__0__Impl rule__University__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__University__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__0"


    // $ANTLR start "rule__University__Group__0__Impl"
    // InternalErasmusPrograms.g:1720:1: rule__University__Group__0__Impl : ( 'University' ) ;
    public final void rule__University__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1724:1: ( ( 'University' ) )
            // InternalErasmusPrograms.g:1725:1: ( 'University' )
            {
            // InternalErasmusPrograms.g:1725:1: ( 'University' )
            // InternalErasmusPrograms.g:1726:2: 'University'
            {
             before(grammarAccess.getUniversityAccess().getUniversityKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getUniversityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__0__Impl"


    // $ANTLR start "rule__University__Group__1"
    // InternalErasmusPrograms.g:1735:1: rule__University__Group__1 : rule__University__Group__1__Impl rule__University__Group__2 ;
    public final void rule__University__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1739:1: ( rule__University__Group__1__Impl rule__University__Group__2 )
            // InternalErasmusPrograms.g:1740:2: rule__University__Group__1__Impl rule__University__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__University__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__1"


    // $ANTLR start "rule__University__Group__1__Impl"
    // InternalErasmusPrograms.g:1747:1: rule__University__Group__1__Impl : ( ( rule__University__UniversityNameAssignment_1 ) ) ;
    public final void rule__University__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1751:1: ( ( ( rule__University__UniversityNameAssignment_1 ) ) )
            // InternalErasmusPrograms.g:1752:1: ( ( rule__University__UniversityNameAssignment_1 ) )
            {
            // InternalErasmusPrograms.g:1752:1: ( ( rule__University__UniversityNameAssignment_1 ) )
            // InternalErasmusPrograms.g:1753:2: ( rule__University__UniversityNameAssignment_1 )
            {
             before(grammarAccess.getUniversityAccess().getUniversityNameAssignment_1()); 
            // InternalErasmusPrograms.g:1754:2: ( rule__University__UniversityNameAssignment_1 )
            // InternalErasmusPrograms.g:1754:3: rule__University__UniversityNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__University__UniversityNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getUniversityNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__1__Impl"


    // $ANTLR start "rule__University__Group__2"
    // InternalErasmusPrograms.g:1762:1: rule__University__Group__2 : rule__University__Group__2__Impl rule__University__Group__3 ;
    public final void rule__University__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1766:1: ( rule__University__Group__2__Impl rule__University__Group__3 )
            // InternalErasmusPrograms.g:1767:2: rule__University__Group__2__Impl rule__University__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__University__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__2"


    // $ANTLR start "rule__University__Group__2__Impl"
    // InternalErasmusPrograms.g:1774:1: rule__University__Group__2__Impl : ( '{' ) ;
    public final void rule__University__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1778:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:1779:1: ( '{' )
            {
            // InternalErasmusPrograms.g:1779:1: ( '{' )
            // InternalErasmusPrograms.g:1780:2: '{'
            {
             before(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__2__Impl"


    // $ANTLR start "rule__University__Group__3"
    // InternalErasmusPrograms.g:1789:1: rule__University__Group__3 : rule__University__Group__3__Impl rule__University__Group__4 ;
    public final void rule__University__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1793:1: ( rule__University__Group__3__Impl rule__University__Group__4 )
            // InternalErasmusPrograms.g:1794:2: rule__University__Group__3__Impl rule__University__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__University__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__3"


    // $ANTLR start "rule__University__Group__3__Impl"
    // InternalErasmusPrograms.g:1801:1: rule__University__Group__3__Impl : ( 'location' ) ;
    public final void rule__University__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1805:1: ( ( 'location' ) )
            // InternalErasmusPrograms.g:1806:1: ( 'location' )
            {
            // InternalErasmusPrograms.g:1806:1: ( 'location' )
            // InternalErasmusPrograms.g:1807:2: 'location'
            {
             before(grammarAccess.getUniversityAccess().getLocationKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getLocationKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__3__Impl"


    // $ANTLR start "rule__University__Group__4"
    // InternalErasmusPrograms.g:1816:1: rule__University__Group__4 : rule__University__Group__4__Impl rule__University__Group__5 ;
    public final void rule__University__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1820:1: ( rule__University__Group__4__Impl rule__University__Group__5 )
            // InternalErasmusPrograms.g:1821:2: rule__University__Group__4__Impl rule__University__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__University__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__4"


    // $ANTLR start "rule__University__Group__4__Impl"
    // InternalErasmusPrograms.g:1828:1: rule__University__Group__4__Impl : ( ( rule__University__LocationAssignment_4 ) ) ;
    public final void rule__University__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1832:1: ( ( ( rule__University__LocationAssignment_4 ) ) )
            // InternalErasmusPrograms.g:1833:1: ( ( rule__University__LocationAssignment_4 ) )
            {
            // InternalErasmusPrograms.g:1833:1: ( ( rule__University__LocationAssignment_4 ) )
            // InternalErasmusPrograms.g:1834:2: ( rule__University__LocationAssignment_4 )
            {
             before(grammarAccess.getUniversityAccess().getLocationAssignment_4()); 
            // InternalErasmusPrograms.g:1835:2: ( rule__University__LocationAssignment_4 )
            // InternalErasmusPrograms.g:1835:3: rule__University__LocationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__University__LocationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getLocationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__4__Impl"


    // $ANTLR start "rule__University__Group__5"
    // InternalErasmusPrograms.g:1843:1: rule__University__Group__5 : rule__University__Group__5__Impl rule__University__Group__6 ;
    public final void rule__University__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1847:1: ( rule__University__Group__5__Impl rule__University__Group__6 )
            // InternalErasmusPrograms.g:1848:2: rule__University__Group__5__Impl rule__University__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__University__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__5"


    // $ANTLR start "rule__University__Group__5__Impl"
    // InternalErasmusPrograms.g:1855:1: rule__University__Group__5__Impl : ( 'credits' ) ;
    public final void rule__University__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1859:1: ( ( 'credits' ) )
            // InternalErasmusPrograms.g:1860:1: ( 'credits' )
            {
            // InternalErasmusPrograms.g:1860:1: ( 'credits' )
            // InternalErasmusPrograms.g:1861:2: 'credits'
            {
             before(grammarAccess.getUniversityAccess().getCreditsKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCreditsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__5__Impl"


    // $ANTLR start "rule__University__Group__6"
    // InternalErasmusPrograms.g:1870:1: rule__University__Group__6 : rule__University__Group__6__Impl rule__University__Group__7 ;
    public final void rule__University__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1874:1: ( rule__University__Group__6__Impl rule__University__Group__7 )
            // InternalErasmusPrograms.g:1875:2: rule__University__Group__6__Impl rule__University__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__University__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__6"


    // $ANTLR start "rule__University__Group__6__Impl"
    // InternalErasmusPrograms.g:1882:1: rule__University__Group__6__Impl : ( ( rule__University__CreditsAssignment_6 ) ) ;
    public final void rule__University__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1886:1: ( ( ( rule__University__CreditsAssignment_6 ) ) )
            // InternalErasmusPrograms.g:1887:1: ( ( rule__University__CreditsAssignment_6 ) )
            {
            // InternalErasmusPrograms.g:1887:1: ( ( rule__University__CreditsAssignment_6 ) )
            // InternalErasmusPrograms.g:1888:2: ( rule__University__CreditsAssignment_6 )
            {
             before(grammarAccess.getUniversityAccess().getCreditsAssignment_6()); 
            // InternalErasmusPrograms.g:1889:2: ( rule__University__CreditsAssignment_6 )
            // InternalErasmusPrograms.g:1889:3: rule__University__CreditsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__University__CreditsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getCreditsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__6__Impl"


    // $ANTLR start "rule__University__Group__7"
    // InternalErasmusPrograms.g:1897:1: rule__University__Group__7 : rule__University__Group__7__Impl rule__University__Group__8 ;
    public final void rule__University__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1901:1: ( rule__University__Group__7__Impl rule__University__Group__8 )
            // InternalErasmusPrograms.g:1902:2: rule__University__Group__7__Impl rule__University__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__University__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__7"


    // $ANTLR start "rule__University__Group__7__Impl"
    // InternalErasmusPrograms.g:1909:1: rule__University__Group__7__Impl : ( ( rule__University__Group_7__0 )? ) ;
    public final void rule__University__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1913:1: ( ( ( rule__University__Group_7__0 )? ) )
            // InternalErasmusPrograms.g:1914:1: ( ( rule__University__Group_7__0 )? )
            {
            // InternalErasmusPrograms.g:1914:1: ( ( rule__University__Group_7__0 )? )
            // InternalErasmusPrograms.g:1915:2: ( rule__University__Group_7__0 )?
            {
             before(grammarAccess.getUniversityAccess().getGroup_7()); 
            // InternalErasmusPrograms.g:1916:2: ( rule__University__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalErasmusPrograms.g:1916:3: rule__University__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__University__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniversityAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__7__Impl"


    // $ANTLR start "rule__University__Group__8"
    // InternalErasmusPrograms.g:1924:1: rule__University__Group__8 : rule__University__Group__8__Impl ;
    public final void rule__University__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1928:1: ( rule__University__Group__8__Impl )
            // InternalErasmusPrograms.g:1929:2: rule__University__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__8"


    // $ANTLR start "rule__University__Group__8__Impl"
    // InternalErasmusPrograms.g:1935:1: rule__University__Group__8__Impl : ( '}' ) ;
    public final void rule__University__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1939:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:1940:1: ( '}' )
            {
            // InternalErasmusPrograms.g:1940:1: ( '}' )
            // InternalErasmusPrograms.g:1941:2: '}'
            {
             before(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__8__Impl"


    // $ANTLR start "rule__University__Group_7__0"
    // InternalErasmusPrograms.g:1951:1: rule__University__Group_7__0 : rule__University__Group_7__0__Impl rule__University__Group_7__1 ;
    public final void rule__University__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1955:1: ( rule__University__Group_7__0__Impl rule__University__Group_7__1 )
            // InternalErasmusPrograms.g:1956:2: rule__University__Group_7__0__Impl rule__University__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__University__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__0"


    // $ANTLR start "rule__University__Group_7__0__Impl"
    // InternalErasmusPrograms.g:1963:1: rule__University__Group_7__0__Impl : ( 'courses' ) ;
    public final void rule__University__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1967:1: ( ( 'courses' ) )
            // InternalErasmusPrograms.g:1968:1: ( 'courses' )
            {
            // InternalErasmusPrograms.g:1968:1: ( 'courses' )
            // InternalErasmusPrograms.g:1969:2: 'courses'
            {
             before(grammarAccess.getUniversityAccess().getCoursesKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCoursesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__0__Impl"


    // $ANTLR start "rule__University__Group_7__1"
    // InternalErasmusPrograms.g:1978:1: rule__University__Group_7__1 : rule__University__Group_7__1__Impl rule__University__Group_7__2 ;
    public final void rule__University__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1982:1: ( rule__University__Group_7__1__Impl rule__University__Group_7__2 )
            // InternalErasmusPrograms.g:1983:2: rule__University__Group_7__1__Impl rule__University__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__University__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__1"


    // $ANTLR start "rule__University__Group_7__1__Impl"
    // InternalErasmusPrograms.g:1990:1: rule__University__Group_7__1__Impl : ( '{' ) ;
    public final void rule__University__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:1994:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:1995:1: ( '{' )
            {
            // InternalErasmusPrograms.g:1995:1: ( '{' )
            // InternalErasmusPrograms.g:1996:2: '{'
            {
             before(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__1__Impl"


    // $ANTLR start "rule__University__Group_7__2"
    // InternalErasmusPrograms.g:2005:1: rule__University__Group_7__2 : rule__University__Group_7__2__Impl rule__University__Group_7__3 ;
    public final void rule__University__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2009:1: ( rule__University__Group_7__2__Impl rule__University__Group_7__3 )
            // InternalErasmusPrograms.g:2010:2: rule__University__Group_7__2__Impl rule__University__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__University__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__2"


    // $ANTLR start "rule__University__Group_7__2__Impl"
    // InternalErasmusPrograms.g:2017:1: rule__University__Group_7__2__Impl : ( ( rule__University__CoursesAssignment_7_2 ) ) ;
    public final void rule__University__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2021:1: ( ( ( rule__University__CoursesAssignment_7_2 ) ) )
            // InternalErasmusPrograms.g:2022:1: ( ( rule__University__CoursesAssignment_7_2 ) )
            {
            // InternalErasmusPrograms.g:2022:1: ( ( rule__University__CoursesAssignment_7_2 ) )
            // InternalErasmusPrograms.g:2023:2: ( rule__University__CoursesAssignment_7_2 )
            {
             before(grammarAccess.getUniversityAccess().getCoursesAssignment_7_2()); 
            // InternalErasmusPrograms.g:2024:2: ( rule__University__CoursesAssignment_7_2 )
            // InternalErasmusPrograms.g:2024:3: rule__University__CoursesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__University__CoursesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getCoursesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__2__Impl"


    // $ANTLR start "rule__University__Group_7__3"
    // InternalErasmusPrograms.g:2032:1: rule__University__Group_7__3 : rule__University__Group_7__3__Impl rule__University__Group_7__4 ;
    public final void rule__University__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2036:1: ( rule__University__Group_7__3__Impl rule__University__Group_7__4 )
            // InternalErasmusPrograms.g:2037:2: rule__University__Group_7__3__Impl rule__University__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__University__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__3"


    // $ANTLR start "rule__University__Group_7__3__Impl"
    // InternalErasmusPrograms.g:2044:1: rule__University__Group_7__3__Impl : ( ( rule__University__Group_7_3__0 )* ) ;
    public final void rule__University__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2048:1: ( ( ( rule__University__Group_7_3__0 )* ) )
            // InternalErasmusPrograms.g:2049:1: ( ( rule__University__Group_7_3__0 )* )
            {
            // InternalErasmusPrograms.g:2049:1: ( ( rule__University__Group_7_3__0 )* )
            // InternalErasmusPrograms.g:2050:2: ( rule__University__Group_7_3__0 )*
            {
             before(grammarAccess.getUniversityAccess().getGroup_7_3()); 
            // InternalErasmusPrograms.g:2051:2: ( rule__University__Group_7_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalErasmusPrograms.g:2051:3: rule__University__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__University__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getUniversityAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__3__Impl"


    // $ANTLR start "rule__University__Group_7__4"
    // InternalErasmusPrograms.g:2059:1: rule__University__Group_7__4 : rule__University__Group_7__4__Impl ;
    public final void rule__University__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2063:1: ( rule__University__Group_7__4__Impl )
            // InternalErasmusPrograms.g:2064:2: rule__University__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__4"


    // $ANTLR start "rule__University__Group_7__4__Impl"
    // InternalErasmusPrograms.g:2070:1: rule__University__Group_7__4__Impl : ( '}' ) ;
    public final void rule__University__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2074:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:2075:1: ( '}' )
            {
            // InternalErasmusPrograms.g:2075:1: ( '}' )
            // InternalErasmusPrograms.g:2076:2: '}'
            {
             before(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7__4__Impl"


    // $ANTLR start "rule__University__Group_7_3__0"
    // InternalErasmusPrograms.g:2086:1: rule__University__Group_7_3__0 : rule__University__Group_7_3__0__Impl rule__University__Group_7_3__1 ;
    public final void rule__University__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2090:1: ( rule__University__Group_7_3__0__Impl rule__University__Group_7_3__1 )
            // InternalErasmusPrograms.g:2091:2: rule__University__Group_7_3__0__Impl rule__University__Group_7_3__1
            {
            pushFollow(FOLLOW_4);
            rule__University__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7_3__0"


    // $ANTLR start "rule__University__Group_7_3__0__Impl"
    // InternalErasmusPrograms.g:2098:1: rule__University__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__University__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2102:1: ( ( ',' ) )
            // InternalErasmusPrograms.g:2103:1: ( ',' )
            {
            // InternalErasmusPrograms.g:2103:1: ( ',' )
            // InternalErasmusPrograms.g:2104:2: ','
            {
             before(grammarAccess.getUniversityAccess().getCommaKeyword_7_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7_3__0__Impl"


    // $ANTLR start "rule__University__Group_7_3__1"
    // InternalErasmusPrograms.g:2113:1: rule__University__Group_7_3__1 : rule__University__Group_7_3__1__Impl ;
    public final void rule__University__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2117:1: ( rule__University__Group_7_3__1__Impl )
            // InternalErasmusPrograms.g:2118:2: rule__University__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7_3__1"


    // $ANTLR start "rule__University__Group_7_3__1__Impl"
    // InternalErasmusPrograms.g:2124:1: rule__University__Group_7_3__1__Impl : ( ( rule__University__CoursesAssignment_7_3_1 ) ) ;
    public final void rule__University__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2128:1: ( ( ( rule__University__CoursesAssignment_7_3_1 ) ) )
            // InternalErasmusPrograms.g:2129:1: ( ( rule__University__CoursesAssignment_7_3_1 ) )
            {
            // InternalErasmusPrograms.g:2129:1: ( ( rule__University__CoursesAssignment_7_3_1 ) )
            // InternalErasmusPrograms.g:2130:2: ( rule__University__CoursesAssignment_7_3_1 )
            {
             before(grammarAccess.getUniversityAccess().getCoursesAssignment_7_3_1()); 
            // InternalErasmusPrograms.g:2131:2: ( rule__University__CoursesAssignment_7_3_1 )
            // InternalErasmusPrograms.g:2131:3: rule__University__CoursesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__University__CoursesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getCoursesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_7_3__1__Impl"


    // $ANTLR start "rule__Course__Group__0"
    // InternalErasmusPrograms.g:2140:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2144:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // InternalErasmusPrograms.g:2145:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // InternalErasmusPrograms.g:2152:1: rule__Course__Group__0__Impl : ( '{' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2156:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:2157:1: ( '{' )
            {
            // InternalErasmusPrograms.g:2157:1: ( '{' )
            // InternalErasmusPrograms.g:2158:2: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // InternalErasmusPrograms.g:2167:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2171:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // InternalErasmusPrograms.g:2172:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // InternalErasmusPrograms.g:2179:1: rule__Course__Group__1__Impl : ( 'code' ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2183:1: ( ( 'code' ) )
            // InternalErasmusPrograms.g:2184:1: ( 'code' )
            {
            // InternalErasmusPrograms.g:2184:1: ( 'code' )
            // InternalErasmusPrograms.g:2185:2: 'code'
            {
             before(grammarAccess.getCourseAccess().getCodeKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // InternalErasmusPrograms.g:2194:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2198:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // InternalErasmusPrograms.g:2199:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // InternalErasmusPrograms.g:2206:1: rule__Course__Group__2__Impl : ( ':' ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2210:1: ( ( ':' ) )
            // InternalErasmusPrograms.g:2211:1: ( ':' )
            {
            // InternalErasmusPrograms.g:2211:1: ( ':' )
            // InternalErasmusPrograms.g:2212:2: ':'
            {
             before(grammarAccess.getCourseAccess().getColonKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // InternalErasmusPrograms.g:2221:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2225:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // InternalErasmusPrograms.g:2226:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // InternalErasmusPrograms.g:2233:1: rule__Course__Group__3__Impl : ( ( rule__Course__CourseCodeAssignment_3 ) ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2237:1: ( ( ( rule__Course__CourseCodeAssignment_3 ) ) )
            // InternalErasmusPrograms.g:2238:1: ( ( rule__Course__CourseCodeAssignment_3 ) )
            {
            // InternalErasmusPrograms.g:2238:1: ( ( rule__Course__CourseCodeAssignment_3 ) )
            // InternalErasmusPrograms.g:2239:2: ( rule__Course__CourseCodeAssignment_3 )
            {
             before(grammarAccess.getCourseAccess().getCourseCodeAssignment_3()); 
            // InternalErasmusPrograms.g:2240:2: ( rule__Course__CourseCodeAssignment_3 )
            // InternalErasmusPrograms.g:2240:3: rule__Course__CourseCodeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Course__CourseCodeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourseCodeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // InternalErasmusPrograms.g:2248:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2252:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // InternalErasmusPrograms.g:2253:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // InternalErasmusPrograms.g:2260:1: rule__Course__Group__4__Impl : ( 'name' ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2264:1: ( ( 'name' ) )
            // InternalErasmusPrograms.g:2265:1: ( 'name' )
            {
            // InternalErasmusPrograms.g:2265:1: ( 'name' )
            // InternalErasmusPrograms.g:2266:2: 'name'
            {
             before(grammarAccess.getCourseAccess().getNameKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // InternalErasmusPrograms.g:2275:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2279:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // InternalErasmusPrograms.g:2280:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Course__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // InternalErasmusPrograms.g:2287:1: rule__Course__Group__5__Impl : ( ':' ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2291:1: ( ( ':' ) )
            // InternalErasmusPrograms.g:2292:1: ( ':' )
            {
            // InternalErasmusPrograms.g:2292:1: ( ':' )
            // InternalErasmusPrograms.g:2293:2: ':'
            {
             before(grammarAccess.getCourseAccess().getColonKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__6"
    // InternalErasmusPrograms.g:2302:1: rule__Course__Group__6 : rule__Course__Group__6__Impl rule__Course__Group__7 ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2306:1: ( rule__Course__Group__6__Impl rule__Course__Group__7 )
            // InternalErasmusPrograms.g:2307:2: rule__Course__Group__6__Impl rule__Course__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Course__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6"


    // $ANTLR start "rule__Course__Group__6__Impl"
    // InternalErasmusPrograms.g:2314:1: rule__Course__Group__6__Impl : ( ( rule__Course__CourseNameAssignment_6 ) ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2318:1: ( ( ( rule__Course__CourseNameAssignment_6 ) ) )
            // InternalErasmusPrograms.g:2319:1: ( ( rule__Course__CourseNameAssignment_6 ) )
            {
            // InternalErasmusPrograms.g:2319:1: ( ( rule__Course__CourseNameAssignment_6 ) )
            // InternalErasmusPrograms.g:2320:2: ( rule__Course__CourseNameAssignment_6 )
            {
             before(grammarAccess.getCourseAccess().getCourseNameAssignment_6()); 
            // InternalErasmusPrograms.g:2321:2: ( rule__Course__CourseNameAssignment_6 )
            // InternalErasmusPrograms.g:2321:3: rule__Course__CourseNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Course__CourseNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourseNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6__Impl"


    // $ANTLR start "rule__Course__Group__7"
    // InternalErasmusPrograms.g:2329:1: rule__Course__Group__7 : rule__Course__Group__7__Impl rule__Course__Group__8 ;
    public final void rule__Course__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2333:1: ( rule__Course__Group__7__Impl rule__Course__Group__8 )
            // InternalErasmusPrograms.g:2334:2: rule__Course__Group__7__Impl rule__Course__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Course__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7"


    // $ANTLR start "rule__Course__Group__7__Impl"
    // InternalErasmusPrograms.g:2341:1: rule__Course__Group__7__Impl : ( 'faculty' ) ;
    public final void rule__Course__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2345:1: ( ( 'faculty' ) )
            // InternalErasmusPrograms.g:2346:1: ( 'faculty' )
            {
            // InternalErasmusPrograms.g:2346:1: ( 'faculty' )
            // InternalErasmusPrograms.g:2347:2: 'faculty'
            {
             before(grammarAccess.getCourseAccess().getFacultyKeyword_7()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getFacultyKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7__Impl"


    // $ANTLR start "rule__Course__Group__8"
    // InternalErasmusPrograms.g:2356:1: rule__Course__Group__8 : rule__Course__Group__8__Impl rule__Course__Group__9 ;
    public final void rule__Course__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2360:1: ( rule__Course__Group__8__Impl rule__Course__Group__9 )
            // InternalErasmusPrograms.g:2361:2: rule__Course__Group__8__Impl rule__Course__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Course__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__8"


    // $ANTLR start "rule__Course__Group__8__Impl"
    // InternalErasmusPrograms.g:2368:1: rule__Course__Group__8__Impl : ( ':' ) ;
    public final void rule__Course__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2372:1: ( ( ':' ) )
            // InternalErasmusPrograms.g:2373:1: ( ':' )
            {
            // InternalErasmusPrograms.g:2373:1: ( ':' )
            // InternalErasmusPrograms.g:2374:2: ':'
            {
             before(grammarAccess.getCourseAccess().getColonKeyword_8()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__8__Impl"


    // $ANTLR start "rule__Course__Group__9"
    // InternalErasmusPrograms.g:2383:1: rule__Course__Group__9 : rule__Course__Group__9__Impl rule__Course__Group__10 ;
    public final void rule__Course__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2387:1: ( rule__Course__Group__9__Impl rule__Course__Group__10 )
            // InternalErasmusPrograms.g:2388:2: rule__Course__Group__9__Impl rule__Course__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Course__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__9"


    // $ANTLR start "rule__Course__Group__9__Impl"
    // InternalErasmusPrograms.g:2395:1: rule__Course__Group__9__Impl : ( ( rule__Course__FacultyAssignment_9 ) ) ;
    public final void rule__Course__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2399:1: ( ( ( rule__Course__FacultyAssignment_9 ) ) )
            // InternalErasmusPrograms.g:2400:1: ( ( rule__Course__FacultyAssignment_9 ) )
            {
            // InternalErasmusPrograms.g:2400:1: ( ( rule__Course__FacultyAssignment_9 ) )
            // InternalErasmusPrograms.g:2401:2: ( rule__Course__FacultyAssignment_9 )
            {
             before(grammarAccess.getCourseAccess().getFacultyAssignment_9()); 
            // InternalErasmusPrograms.g:2402:2: ( rule__Course__FacultyAssignment_9 )
            // InternalErasmusPrograms.g:2402:3: rule__Course__FacultyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Course__FacultyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getFacultyAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__9__Impl"


    // $ANTLR start "rule__Course__Group__10"
    // InternalErasmusPrograms.g:2410:1: rule__Course__Group__10 : rule__Course__Group__10__Impl rule__Course__Group__11 ;
    public final void rule__Course__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2414:1: ( rule__Course__Group__10__Impl rule__Course__Group__11 )
            // InternalErasmusPrograms.g:2415:2: rule__Course__Group__10__Impl rule__Course__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Course__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__10"


    // $ANTLR start "rule__Course__Group__10__Impl"
    // InternalErasmusPrograms.g:2422:1: rule__Course__Group__10__Impl : ( 'credits' ) ;
    public final void rule__Course__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2426:1: ( ( 'credits' ) )
            // InternalErasmusPrograms.g:2427:1: ( 'credits' )
            {
            // InternalErasmusPrograms.g:2427:1: ( 'credits' )
            // InternalErasmusPrograms.g:2428:2: 'credits'
            {
             before(grammarAccess.getCourseAccess().getCreditsKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCreditsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__10__Impl"


    // $ANTLR start "rule__Course__Group__11"
    // InternalErasmusPrograms.g:2437:1: rule__Course__Group__11 : rule__Course__Group__11__Impl rule__Course__Group__12 ;
    public final void rule__Course__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2441:1: ( rule__Course__Group__11__Impl rule__Course__Group__12 )
            // InternalErasmusPrograms.g:2442:2: rule__Course__Group__11__Impl rule__Course__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__11"


    // $ANTLR start "rule__Course__Group__11__Impl"
    // InternalErasmusPrograms.g:2449:1: rule__Course__Group__11__Impl : ( ':' ) ;
    public final void rule__Course__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2453:1: ( ( ':' ) )
            // InternalErasmusPrograms.g:2454:1: ( ':' )
            {
            // InternalErasmusPrograms.g:2454:1: ( ':' )
            // InternalErasmusPrograms.g:2455:2: ':'
            {
             before(grammarAccess.getCourseAccess().getColonKeyword_11()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__11__Impl"


    // $ANTLR start "rule__Course__Group__12"
    // InternalErasmusPrograms.g:2464:1: rule__Course__Group__12 : rule__Course__Group__12__Impl rule__Course__Group__13 ;
    public final void rule__Course__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2468:1: ( rule__Course__Group__12__Impl rule__Course__Group__13 )
            // InternalErasmusPrograms.g:2469:2: rule__Course__Group__12__Impl rule__Course__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__12"


    // $ANTLR start "rule__Course__Group__12__Impl"
    // InternalErasmusPrograms.g:2476:1: rule__Course__Group__12__Impl : ( ( rule__Course__CourseCreditsAssignment_12 ) ) ;
    public final void rule__Course__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2480:1: ( ( ( rule__Course__CourseCreditsAssignment_12 ) ) )
            // InternalErasmusPrograms.g:2481:1: ( ( rule__Course__CourseCreditsAssignment_12 ) )
            {
            // InternalErasmusPrograms.g:2481:1: ( ( rule__Course__CourseCreditsAssignment_12 ) )
            // InternalErasmusPrograms.g:2482:2: ( rule__Course__CourseCreditsAssignment_12 )
            {
             before(grammarAccess.getCourseAccess().getCourseCreditsAssignment_12()); 
            // InternalErasmusPrograms.g:2483:2: ( rule__Course__CourseCreditsAssignment_12 )
            // InternalErasmusPrograms.g:2483:3: rule__Course__CourseCreditsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Course__CourseCreditsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourseCreditsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__12__Impl"


    // $ANTLR start "rule__Course__Group__13"
    // InternalErasmusPrograms.g:2491:1: rule__Course__Group__13 : rule__Course__Group__13__Impl ;
    public final void rule__Course__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2495:1: ( rule__Course__Group__13__Impl )
            // InternalErasmusPrograms.g:2496:2: rule__Course__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__13"


    // $ANTLR start "rule__Course__Group__13__Impl"
    // InternalErasmusPrograms.g:2502:1: rule__Course__Group__13__Impl : ( '}' ) ;
    public final void rule__Course__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2506:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:2507:1: ( '}' )
            {
            // InternalErasmusPrograms.g:2507:1: ( '}' )
            // InternalErasmusPrograms.g:2508:2: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__13__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalErasmusPrograms.g:2518:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2522:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalErasmusPrograms.g:2523:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalErasmusPrograms.g:2530:1: rule__Location__Group__0__Impl : ( '{' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2534:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:2535:1: ( '{' )
            {
            // InternalErasmusPrograms.g:2535:1: ( '{' )
            // InternalErasmusPrograms.g:2536:2: '{'
            {
             before(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalErasmusPrograms.g:2545:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2549:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalErasmusPrograms.g:2550:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalErasmusPrograms.g:2557:1: rule__Location__Group__1__Impl : ( 'country' ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2561:1: ( ( 'country' ) )
            // InternalErasmusPrograms.g:2562:1: ( 'country' )
            {
            // InternalErasmusPrograms.g:2562:1: ( 'country' )
            // InternalErasmusPrograms.g:2563:2: 'country'
            {
             before(grammarAccess.getLocationAccess().getCountryKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getCountryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalErasmusPrograms.g:2572:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2576:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalErasmusPrograms.g:2577:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalErasmusPrograms.g:2584:1: rule__Location__Group__2__Impl : ( ':' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2588:1: ( ( ':' ) )
            // InternalErasmusPrograms.g:2589:1: ( ':' )
            {
            // InternalErasmusPrograms.g:2589:1: ( ':' )
            // InternalErasmusPrograms.g:2590:2: ':'
            {
             before(grammarAccess.getLocationAccess().getColonKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // InternalErasmusPrograms.g:2599:1: rule__Location__Group__3 : rule__Location__Group__3__Impl rule__Location__Group__4 ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2603:1: ( rule__Location__Group__3__Impl rule__Location__Group__4 )
            // InternalErasmusPrograms.g:2604:2: rule__Location__Group__3__Impl rule__Location__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Location__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // InternalErasmusPrograms.g:2611:1: rule__Location__Group__3__Impl : ( ( rule__Location__CountryNameAssignment_3 ) ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2615:1: ( ( ( rule__Location__CountryNameAssignment_3 ) ) )
            // InternalErasmusPrograms.g:2616:1: ( ( rule__Location__CountryNameAssignment_3 ) )
            {
            // InternalErasmusPrograms.g:2616:1: ( ( rule__Location__CountryNameAssignment_3 ) )
            // InternalErasmusPrograms.g:2617:2: ( rule__Location__CountryNameAssignment_3 )
            {
             before(grammarAccess.getLocationAccess().getCountryNameAssignment_3()); 
            // InternalErasmusPrograms.g:2618:2: ( rule__Location__CountryNameAssignment_3 )
            // InternalErasmusPrograms.g:2618:3: rule__Location__CountryNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Location__CountryNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getCountryNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Location__Group__4"
    // InternalErasmusPrograms.g:2626:1: rule__Location__Group__4 : rule__Location__Group__4__Impl rule__Location__Group__5 ;
    public final void rule__Location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2630:1: ( rule__Location__Group__4__Impl rule__Location__Group__5 )
            // InternalErasmusPrograms.g:2631:2: rule__Location__Group__4__Impl rule__Location__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Location__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4"


    // $ANTLR start "rule__Location__Group__4__Impl"
    // InternalErasmusPrograms.g:2638:1: rule__Location__Group__4__Impl : ( 'city' ) ;
    public final void rule__Location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2642:1: ( ( 'city' ) )
            // InternalErasmusPrograms.g:2643:1: ( 'city' )
            {
            // InternalErasmusPrograms.g:2643:1: ( 'city' )
            // InternalErasmusPrograms.g:2644:2: 'city'
            {
             before(grammarAccess.getLocationAccess().getCityKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getCityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4__Impl"


    // $ANTLR start "rule__Location__Group__5"
    // InternalErasmusPrograms.g:2653:1: rule__Location__Group__5 : rule__Location__Group__5__Impl rule__Location__Group__6 ;
    public final void rule__Location__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2657:1: ( rule__Location__Group__5__Impl rule__Location__Group__6 )
            // InternalErasmusPrograms.g:2658:2: rule__Location__Group__5__Impl rule__Location__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Location__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5"


    // $ANTLR start "rule__Location__Group__5__Impl"
    // InternalErasmusPrograms.g:2665:1: rule__Location__Group__5__Impl : ( ':' ) ;
    public final void rule__Location__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2669:1: ( ( ':' ) )
            // InternalErasmusPrograms.g:2670:1: ( ':' )
            {
            // InternalErasmusPrograms.g:2670:1: ( ':' )
            // InternalErasmusPrograms.g:2671:2: ':'
            {
             before(grammarAccess.getLocationAccess().getColonKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5__Impl"


    // $ANTLR start "rule__Location__Group__6"
    // InternalErasmusPrograms.g:2680:1: rule__Location__Group__6 : rule__Location__Group__6__Impl rule__Location__Group__7 ;
    public final void rule__Location__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2684:1: ( rule__Location__Group__6__Impl rule__Location__Group__7 )
            // InternalErasmusPrograms.g:2685:2: rule__Location__Group__6__Impl rule__Location__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Location__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6"


    // $ANTLR start "rule__Location__Group__6__Impl"
    // InternalErasmusPrograms.g:2692:1: rule__Location__Group__6__Impl : ( ( rule__Location__CityNameAssignment_6 ) ) ;
    public final void rule__Location__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2696:1: ( ( ( rule__Location__CityNameAssignment_6 ) ) )
            // InternalErasmusPrograms.g:2697:1: ( ( rule__Location__CityNameAssignment_6 ) )
            {
            // InternalErasmusPrograms.g:2697:1: ( ( rule__Location__CityNameAssignment_6 ) )
            // InternalErasmusPrograms.g:2698:2: ( rule__Location__CityNameAssignment_6 )
            {
             before(grammarAccess.getLocationAccess().getCityNameAssignment_6()); 
            // InternalErasmusPrograms.g:2699:2: ( rule__Location__CityNameAssignment_6 )
            // InternalErasmusPrograms.g:2699:3: rule__Location__CityNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Location__CityNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getCityNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6__Impl"


    // $ANTLR start "rule__Location__Group__7"
    // InternalErasmusPrograms.g:2707:1: rule__Location__Group__7 : rule__Location__Group__7__Impl ;
    public final void rule__Location__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2711:1: ( rule__Location__Group__7__Impl )
            // InternalErasmusPrograms.g:2712:2: rule__Location__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__7"


    // $ANTLR start "rule__Location__Group__7__Impl"
    // InternalErasmusPrograms.g:2718:1: rule__Location__Group__7__Impl : ( '}' ) ;
    public final void rule__Location__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2722:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:2723:1: ( '}' )
            {
            // InternalErasmusPrograms.g:2723:1: ( '}' )
            // InternalErasmusPrograms.g:2724:2: '}'
            {
             before(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__7__Impl"


    // $ANTLR start "rule__AssociatePartner__Group__0"
    // InternalErasmusPrograms.g:2734:1: rule__AssociatePartner__Group__0 : rule__AssociatePartner__Group__0__Impl rule__AssociatePartner__Group__1 ;
    public final void rule__AssociatePartner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2738:1: ( rule__AssociatePartner__Group__0__Impl rule__AssociatePartner__Group__1 )
            // InternalErasmusPrograms.g:2739:2: rule__AssociatePartner__Group__0__Impl rule__AssociatePartner__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AssociatePartner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociatePartner__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__Group__0"


    // $ANTLR start "rule__AssociatePartner__Group__0__Impl"
    // InternalErasmusPrograms.g:2746:1: rule__AssociatePartner__Group__0__Impl : ( ( rule__AssociatePartner__PartnerNameAssignment_0 ) ) ;
    public final void rule__AssociatePartner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2750:1: ( ( ( rule__AssociatePartner__PartnerNameAssignment_0 ) ) )
            // InternalErasmusPrograms.g:2751:1: ( ( rule__AssociatePartner__PartnerNameAssignment_0 ) )
            {
            // InternalErasmusPrograms.g:2751:1: ( ( rule__AssociatePartner__PartnerNameAssignment_0 ) )
            // InternalErasmusPrograms.g:2752:2: ( rule__AssociatePartner__PartnerNameAssignment_0 )
            {
             before(grammarAccess.getAssociatePartnerAccess().getPartnerNameAssignment_0()); 
            // InternalErasmusPrograms.g:2753:2: ( rule__AssociatePartner__PartnerNameAssignment_0 )
            // InternalErasmusPrograms.g:2753:3: rule__AssociatePartner__PartnerNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AssociatePartner__PartnerNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociatePartnerAccess().getPartnerNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__Group__0__Impl"


    // $ANTLR start "rule__AssociatePartner__Group__1"
    // InternalErasmusPrograms.g:2761:1: rule__AssociatePartner__Group__1 : rule__AssociatePartner__Group__1__Impl rule__AssociatePartner__Group__2 ;
    public final void rule__AssociatePartner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2765:1: ( rule__AssociatePartner__Group__1__Impl rule__AssociatePartner__Group__2 )
            // InternalErasmusPrograms.g:2766:2: rule__AssociatePartner__Group__1__Impl rule__AssociatePartner__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AssociatePartner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociatePartner__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__Group__1"


    // $ANTLR start "rule__AssociatePartner__Group__1__Impl"
    // InternalErasmusPrograms.g:2773:1: rule__AssociatePartner__Group__1__Impl : ( '(' ) ;
    public final void rule__AssociatePartner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2777:1: ( ( '(' ) )
            // InternalErasmusPrograms.g:2778:1: ( '(' )
            {
            // InternalErasmusPrograms.g:2778:1: ( '(' )
            // InternalErasmusPrograms.g:2779:2: '('
            {
             before(grammarAccess.getAssociatePartnerAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAssociatePartnerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__Group__1__Impl"


    // $ANTLR start "rule__AssociatePartner__Group__2"
    // InternalErasmusPrograms.g:2788:1: rule__AssociatePartner__Group__2 : rule__AssociatePartner__Group__2__Impl rule__AssociatePartner__Group__3 ;
    public final void rule__AssociatePartner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2792:1: ( rule__AssociatePartner__Group__2__Impl rule__AssociatePartner__Group__3 )
            // InternalErasmusPrograms.g:2793:2: rule__AssociatePartner__Group__2__Impl rule__AssociatePartner__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AssociatePartner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociatePartner__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__Group__2"


    // $ANTLR start "rule__AssociatePartner__Group__2__Impl"
    // InternalErasmusPrograms.g:2800:1: rule__AssociatePartner__Group__2__Impl : ( ( rule__AssociatePartner__TypeAssignment_2 ) ) ;
    public final void rule__AssociatePartner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2804:1: ( ( ( rule__AssociatePartner__TypeAssignment_2 ) ) )
            // InternalErasmusPrograms.g:2805:1: ( ( rule__AssociatePartner__TypeAssignment_2 ) )
            {
            // InternalErasmusPrograms.g:2805:1: ( ( rule__AssociatePartner__TypeAssignment_2 ) )
            // InternalErasmusPrograms.g:2806:2: ( rule__AssociatePartner__TypeAssignment_2 )
            {
             before(grammarAccess.getAssociatePartnerAccess().getTypeAssignment_2()); 
            // InternalErasmusPrograms.g:2807:2: ( rule__AssociatePartner__TypeAssignment_2 )
            // InternalErasmusPrograms.g:2807:3: rule__AssociatePartner__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociatePartner__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociatePartnerAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__Group__2__Impl"


    // $ANTLR start "rule__AssociatePartner__Group__3"
    // InternalErasmusPrograms.g:2815:1: rule__AssociatePartner__Group__3 : rule__AssociatePartner__Group__3__Impl ;
    public final void rule__AssociatePartner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2819:1: ( rule__AssociatePartner__Group__3__Impl )
            // InternalErasmusPrograms.g:2820:2: rule__AssociatePartner__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociatePartner__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__Group__3"


    // $ANTLR start "rule__AssociatePartner__Group__3__Impl"
    // InternalErasmusPrograms.g:2826:1: rule__AssociatePartner__Group__3__Impl : ( ')' ) ;
    public final void rule__AssociatePartner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2830:1: ( ( ')' ) )
            // InternalErasmusPrograms.g:2831:1: ( ')' )
            {
            // InternalErasmusPrograms.g:2831:1: ( ')' )
            // InternalErasmusPrograms.g:2832:2: ')'
            {
             before(grammarAccess.getAssociatePartnerAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAssociatePartnerAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__Group__3__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group__0"
    // InternalErasmusPrograms.g:2842:1: rule__AdmissionStructure__Group__0 : rule__AdmissionStructure__Group__0__Impl rule__AdmissionStructure__Group__1 ;
    public final void rule__AdmissionStructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2846:1: ( rule__AdmissionStructure__Group__0__Impl rule__AdmissionStructure__Group__1 )
            // InternalErasmusPrograms.g:2847:2: rule__AdmissionStructure__Group__0__Impl rule__AdmissionStructure__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AdmissionStructure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__0"


    // $ANTLR start "rule__AdmissionStructure__Group__0__Impl"
    // InternalErasmusPrograms.g:2854:1: rule__AdmissionStructure__Group__0__Impl : ( '{' ) ;
    public final void rule__AdmissionStructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2858:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:2859:1: ( '{' )
            {
            // InternalErasmusPrograms.g:2859:1: ( '{' )
            // InternalErasmusPrograms.g:2860:2: '{'
            {
             before(grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__0__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group__1"
    // InternalErasmusPrograms.g:2869:1: rule__AdmissionStructure__Group__1 : rule__AdmissionStructure__Group__1__Impl rule__AdmissionStructure__Group__2 ;
    public final void rule__AdmissionStructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2873:1: ( rule__AdmissionStructure__Group__1__Impl rule__AdmissionStructure__Group__2 )
            // InternalErasmusPrograms.g:2874:2: rule__AdmissionStructure__Group__1__Impl rule__AdmissionStructure__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AdmissionStructure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__1"


    // $ANTLR start "rule__AdmissionStructure__Group__1__Impl"
    // InternalErasmusPrograms.g:2881:1: rule__AdmissionStructure__Group__1__Impl : ( 'applicationProcess' ) ;
    public final void rule__AdmissionStructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2885:1: ( ( 'applicationProcess' ) )
            // InternalErasmusPrograms.g:2886:1: ( 'applicationProcess' )
            {
            // InternalErasmusPrograms.g:2886:1: ( 'applicationProcess' )
            // InternalErasmusPrograms.g:2887:2: 'applicationProcess'
            {
             before(grammarAccess.getAdmissionStructureAccess().getApplicationProcessKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getApplicationProcessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__1__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group__2"
    // InternalErasmusPrograms.g:2896:1: rule__AdmissionStructure__Group__2 : rule__AdmissionStructure__Group__2__Impl rule__AdmissionStructure__Group__3 ;
    public final void rule__AdmissionStructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2900:1: ( rule__AdmissionStructure__Group__2__Impl rule__AdmissionStructure__Group__3 )
            // InternalErasmusPrograms.g:2901:2: rule__AdmissionStructure__Group__2__Impl rule__AdmissionStructure__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__AdmissionStructure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__2"


    // $ANTLR start "rule__AdmissionStructure__Group__2__Impl"
    // InternalErasmusPrograms.g:2908:1: rule__AdmissionStructure__Group__2__Impl : ( ( rule__AdmissionStructure__ApplicationProcessAssignment_2 ) ) ;
    public final void rule__AdmissionStructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2912:1: ( ( ( rule__AdmissionStructure__ApplicationProcessAssignment_2 ) ) )
            // InternalErasmusPrograms.g:2913:1: ( ( rule__AdmissionStructure__ApplicationProcessAssignment_2 ) )
            {
            // InternalErasmusPrograms.g:2913:1: ( ( rule__AdmissionStructure__ApplicationProcessAssignment_2 ) )
            // InternalErasmusPrograms.g:2914:2: ( rule__AdmissionStructure__ApplicationProcessAssignment_2 )
            {
             before(grammarAccess.getAdmissionStructureAccess().getApplicationProcessAssignment_2()); 
            // InternalErasmusPrograms.g:2915:2: ( rule__AdmissionStructure__ApplicationProcessAssignment_2 )
            // InternalErasmusPrograms.g:2915:3: rule__AdmissionStructure__ApplicationProcessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__ApplicationProcessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdmissionStructureAccess().getApplicationProcessAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__2__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group__3"
    // InternalErasmusPrograms.g:2923:1: rule__AdmissionStructure__Group__3 : rule__AdmissionStructure__Group__3__Impl rule__AdmissionStructure__Group__4 ;
    public final void rule__AdmissionStructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2927:1: ( rule__AdmissionStructure__Group__3__Impl rule__AdmissionStructure__Group__4 )
            // InternalErasmusPrograms.g:2928:2: rule__AdmissionStructure__Group__3__Impl rule__AdmissionStructure__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__AdmissionStructure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__3"


    // $ANTLR start "rule__AdmissionStructure__Group__3__Impl"
    // InternalErasmusPrograms.g:2935:1: rule__AdmissionStructure__Group__3__Impl : ( ( rule__AdmissionStructure__Group_3__0 )? ) ;
    public final void rule__AdmissionStructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2939:1: ( ( ( rule__AdmissionStructure__Group_3__0 )? ) )
            // InternalErasmusPrograms.g:2940:1: ( ( rule__AdmissionStructure__Group_3__0 )? )
            {
            // InternalErasmusPrograms.g:2940:1: ( ( rule__AdmissionStructure__Group_3__0 )? )
            // InternalErasmusPrograms.g:2941:2: ( rule__AdmissionStructure__Group_3__0 )?
            {
             before(grammarAccess.getAdmissionStructureAccess().getGroup_3()); 
            // InternalErasmusPrograms.g:2942:2: ( rule__AdmissionStructure__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalErasmusPrograms.g:2942:3: rule__AdmissionStructure__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdmissionStructure__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAdmissionStructureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__3__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group__4"
    // InternalErasmusPrograms.g:2950:1: rule__AdmissionStructure__Group__4 : rule__AdmissionStructure__Group__4__Impl rule__AdmissionStructure__Group__5 ;
    public final void rule__AdmissionStructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2954:1: ( rule__AdmissionStructure__Group__4__Impl rule__AdmissionStructure__Group__5 )
            // InternalErasmusPrograms.g:2955:2: rule__AdmissionStructure__Group__4__Impl rule__AdmissionStructure__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__AdmissionStructure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__4"


    // $ANTLR start "rule__AdmissionStructure__Group__4__Impl"
    // InternalErasmusPrograms.g:2962:1: rule__AdmissionStructure__Group__4__Impl : ( ( rule__AdmissionStructure__Group_4__0 )? ) ;
    public final void rule__AdmissionStructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2966:1: ( ( ( rule__AdmissionStructure__Group_4__0 )? ) )
            // InternalErasmusPrograms.g:2967:1: ( ( rule__AdmissionStructure__Group_4__0 )? )
            {
            // InternalErasmusPrograms.g:2967:1: ( ( rule__AdmissionStructure__Group_4__0 )? )
            // InternalErasmusPrograms.g:2968:2: ( rule__AdmissionStructure__Group_4__0 )?
            {
             before(grammarAccess.getAdmissionStructureAccess().getGroup_4()); 
            // InternalErasmusPrograms.g:2969:2: ( rule__AdmissionStructure__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalErasmusPrograms.g:2969:3: rule__AdmissionStructure__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdmissionStructure__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAdmissionStructureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__4__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group__5"
    // InternalErasmusPrograms.g:2977:1: rule__AdmissionStructure__Group__5 : rule__AdmissionStructure__Group__5__Impl ;
    public final void rule__AdmissionStructure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2981:1: ( rule__AdmissionStructure__Group__5__Impl )
            // InternalErasmusPrograms.g:2982:2: rule__AdmissionStructure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__5"


    // $ANTLR start "rule__AdmissionStructure__Group__5__Impl"
    // InternalErasmusPrograms.g:2988:1: rule__AdmissionStructure__Group__5__Impl : ( '}' ) ;
    public final void rule__AdmissionStructure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:2992:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:2993:1: ( '}' )
            {
            // InternalErasmusPrograms.g:2993:1: ( '}' )
            // InternalErasmusPrograms.g:2994:2: '}'
            {
             before(grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group__5__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_3__0"
    // InternalErasmusPrograms.g:3004:1: rule__AdmissionStructure__Group_3__0 : rule__AdmissionStructure__Group_3__0__Impl rule__AdmissionStructure__Group_3__1 ;
    public final void rule__AdmissionStructure__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3008:1: ( rule__AdmissionStructure__Group_3__0__Impl rule__AdmissionStructure__Group_3__1 )
            // InternalErasmusPrograms.g:3009:2: rule__AdmissionStructure__Group_3__0__Impl rule__AdmissionStructure__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__AdmissionStructure__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__0"


    // $ANTLR start "rule__AdmissionStructure__Group_3__0__Impl"
    // InternalErasmusPrograms.g:3016:1: rule__AdmissionStructure__Group_3__0__Impl : ( 'requirements' ) ;
    public final void rule__AdmissionStructure__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3020:1: ( ( 'requirements' ) )
            // InternalErasmusPrograms.g:3021:1: ( 'requirements' )
            {
            // InternalErasmusPrograms.g:3021:1: ( 'requirements' )
            // InternalErasmusPrograms.g:3022:2: 'requirements'
            {
             before(grammarAccess.getAdmissionStructureAccess().getRequirementsKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getRequirementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__0__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_3__1"
    // InternalErasmusPrograms.g:3031:1: rule__AdmissionStructure__Group_3__1 : rule__AdmissionStructure__Group_3__1__Impl rule__AdmissionStructure__Group_3__2 ;
    public final void rule__AdmissionStructure__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3035:1: ( rule__AdmissionStructure__Group_3__1__Impl rule__AdmissionStructure__Group_3__2 )
            // InternalErasmusPrograms.g:3036:2: rule__AdmissionStructure__Group_3__1__Impl rule__AdmissionStructure__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__AdmissionStructure__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__1"


    // $ANTLR start "rule__AdmissionStructure__Group_3__1__Impl"
    // InternalErasmusPrograms.g:3043:1: rule__AdmissionStructure__Group_3__1__Impl : ( '{' ) ;
    public final void rule__AdmissionStructure__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3047:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:3048:1: ( '{' )
            {
            // InternalErasmusPrograms.g:3048:1: ( '{' )
            // InternalErasmusPrograms.g:3049:2: '{'
            {
             before(grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__1__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_3__2"
    // InternalErasmusPrograms.g:3058:1: rule__AdmissionStructure__Group_3__2 : rule__AdmissionStructure__Group_3__2__Impl rule__AdmissionStructure__Group_3__3 ;
    public final void rule__AdmissionStructure__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3062:1: ( rule__AdmissionStructure__Group_3__2__Impl rule__AdmissionStructure__Group_3__3 )
            // InternalErasmusPrograms.g:3063:2: rule__AdmissionStructure__Group_3__2__Impl rule__AdmissionStructure__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__AdmissionStructure__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__2"


    // $ANTLR start "rule__AdmissionStructure__Group_3__2__Impl"
    // InternalErasmusPrograms.g:3070:1: rule__AdmissionStructure__Group_3__2__Impl : ( ( rule__AdmissionStructure__RequierementsAssignment_3_2 ) ) ;
    public final void rule__AdmissionStructure__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3074:1: ( ( ( rule__AdmissionStructure__RequierementsAssignment_3_2 ) ) )
            // InternalErasmusPrograms.g:3075:1: ( ( rule__AdmissionStructure__RequierementsAssignment_3_2 ) )
            {
            // InternalErasmusPrograms.g:3075:1: ( ( rule__AdmissionStructure__RequierementsAssignment_3_2 ) )
            // InternalErasmusPrograms.g:3076:2: ( rule__AdmissionStructure__RequierementsAssignment_3_2 )
            {
             before(grammarAccess.getAdmissionStructureAccess().getRequierementsAssignment_3_2()); 
            // InternalErasmusPrograms.g:3077:2: ( rule__AdmissionStructure__RequierementsAssignment_3_2 )
            // InternalErasmusPrograms.g:3077:3: rule__AdmissionStructure__RequierementsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__RequierementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAdmissionStructureAccess().getRequierementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__2__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_3__3"
    // InternalErasmusPrograms.g:3085:1: rule__AdmissionStructure__Group_3__3 : rule__AdmissionStructure__Group_3__3__Impl rule__AdmissionStructure__Group_3__4 ;
    public final void rule__AdmissionStructure__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3089:1: ( rule__AdmissionStructure__Group_3__3__Impl rule__AdmissionStructure__Group_3__4 )
            // InternalErasmusPrograms.g:3090:2: rule__AdmissionStructure__Group_3__3__Impl rule__AdmissionStructure__Group_3__4
            {
            pushFollow(FOLLOW_10);
            rule__AdmissionStructure__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__3"


    // $ANTLR start "rule__AdmissionStructure__Group_3__3__Impl"
    // InternalErasmusPrograms.g:3097:1: rule__AdmissionStructure__Group_3__3__Impl : ( ( rule__AdmissionStructure__Group_3_3__0 )* ) ;
    public final void rule__AdmissionStructure__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3101:1: ( ( ( rule__AdmissionStructure__Group_3_3__0 )* ) )
            // InternalErasmusPrograms.g:3102:1: ( ( rule__AdmissionStructure__Group_3_3__0 )* )
            {
            // InternalErasmusPrograms.g:3102:1: ( ( rule__AdmissionStructure__Group_3_3__0 )* )
            // InternalErasmusPrograms.g:3103:2: ( rule__AdmissionStructure__Group_3_3__0 )*
            {
             before(grammarAccess.getAdmissionStructureAccess().getGroup_3_3()); 
            // InternalErasmusPrograms.g:3104:2: ( rule__AdmissionStructure__Group_3_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalErasmusPrograms.g:3104:3: rule__AdmissionStructure__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AdmissionStructure__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAdmissionStructureAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__3__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_3__4"
    // InternalErasmusPrograms.g:3112:1: rule__AdmissionStructure__Group_3__4 : rule__AdmissionStructure__Group_3__4__Impl ;
    public final void rule__AdmissionStructure__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3116:1: ( rule__AdmissionStructure__Group_3__4__Impl )
            // InternalErasmusPrograms.g:3117:2: rule__AdmissionStructure__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__4"


    // $ANTLR start "rule__AdmissionStructure__Group_3__4__Impl"
    // InternalErasmusPrograms.g:3123:1: rule__AdmissionStructure__Group_3__4__Impl : ( '}' ) ;
    public final void rule__AdmissionStructure__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3127:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:3128:1: ( '}' )
            {
            // InternalErasmusPrograms.g:3128:1: ( '}' )
            // InternalErasmusPrograms.g:3129:2: '}'
            {
             before(grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3__4__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_3_3__0"
    // InternalErasmusPrograms.g:3139:1: rule__AdmissionStructure__Group_3_3__0 : rule__AdmissionStructure__Group_3_3__0__Impl rule__AdmissionStructure__Group_3_3__1 ;
    public final void rule__AdmissionStructure__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3143:1: ( rule__AdmissionStructure__Group_3_3__0__Impl rule__AdmissionStructure__Group_3_3__1 )
            // InternalErasmusPrograms.g:3144:2: rule__AdmissionStructure__Group_3_3__0__Impl rule__AdmissionStructure__Group_3_3__1
            {
            pushFollow(FOLLOW_30);
            rule__AdmissionStructure__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3_3__0"


    // $ANTLR start "rule__AdmissionStructure__Group_3_3__0__Impl"
    // InternalErasmusPrograms.g:3151:1: rule__AdmissionStructure__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__AdmissionStructure__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3155:1: ( ( ',' ) )
            // InternalErasmusPrograms.g:3156:1: ( ',' )
            {
            // InternalErasmusPrograms.g:3156:1: ( ',' )
            // InternalErasmusPrograms.g:3157:2: ','
            {
             before(grammarAccess.getAdmissionStructureAccess().getCommaKeyword_3_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3_3__0__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_3_3__1"
    // InternalErasmusPrograms.g:3166:1: rule__AdmissionStructure__Group_3_3__1 : rule__AdmissionStructure__Group_3_3__1__Impl ;
    public final void rule__AdmissionStructure__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3170:1: ( rule__AdmissionStructure__Group_3_3__1__Impl )
            // InternalErasmusPrograms.g:3171:2: rule__AdmissionStructure__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3_3__1"


    // $ANTLR start "rule__AdmissionStructure__Group_3_3__1__Impl"
    // InternalErasmusPrograms.g:3177:1: rule__AdmissionStructure__Group_3_3__1__Impl : ( ( rule__AdmissionStructure__RequierementsAssignment_3_3_1 ) ) ;
    public final void rule__AdmissionStructure__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3181:1: ( ( ( rule__AdmissionStructure__RequierementsAssignment_3_3_1 ) ) )
            // InternalErasmusPrograms.g:3182:1: ( ( rule__AdmissionStructure__RequierementsAssignment_3_3_1 ) )
            {
            // InternalErasmusPrograms.g:3182:1: ( ( rule__AdmissionStructure__RequierementsAssignment_3_3_1 ) )
            // InternalErasmusPrograms.g:3183:2: ( rule__AdmissionStructure__RequierementsAssignment_3_3_1 )
            {
             before(grammarAccess.getAdmissionStructureAccess().getRequierementsAssignment_3_3_1()); 
            // InternalErasmusPrograms.g:3184:2: ( rule__AdmissionStructure__RequierementsAssignment_3_3_1 )
            // InternalErasmusPrograms.g:3184:3: rule__AdmissionStructure__RequierementsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__RequierementsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAdmissionStructureAccess().getRequierementsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_3_3__1__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_4__0"
    // InternalErasmusPrograms.g:3193:1: rule__AdmissionStructure__Group_4__0 : rule__AdmissionStructure__Group_4__0__Impl rule__AdmissionStructure__Group_4__1 ;
    public final void rule__AdmissionStructure__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3197:1: ( rule__AdmissionStructure__Group_4__0__Impl rule__AdmissionStructure__Group_4__1 )
            // InternalErasmusPrograms.g:3198:2: rule__AdmissionStructure__Group_4__0__Impl rule__AdmissionStructure__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__AdmissionStructure__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__0"


    // $ANTLR start "rule__AdmissionStructure__Group_4__0__Impl"
    // InternalErasmusPrograms.g:3205:1: rule__AdmissionStructure__Group_4__0__Impl : ( 'results' ) ;
    public final void rule__AdmissionStructure__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3209:1: ( ( 'results' ) )
            // InternalErasmusPrograms.g:3210:1: ( 'results' )
            {
            // InternalErasmusPrograms.g:3210:1: ( 'results' )
            // InternalErasmusPrograms.g:3211:2: 'results'
            {
             before(grammarAccess.getAdmissionStructureAccess().getResultsKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getResultsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__0__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_4__1"
    // InternalErasmusPrograms.g:3220:1: rule__AdmissionStructure__Group_4__1 : rule__AdmissionStructure__Group_4__1__Impl rule__AdmissionStructure__Group_4__2 ;
    public final void rule__AdmissionStructure__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3224:1: ( rule__AdmissionStructure__Group_4__1__Impl rule__AdmissionStructure__Group_4__2 )
            // InternalErasmusPrograms.g:3225:2: rule__AdmissionStructure__Group_4__1__Impl rule__AdmissionStructure__Group_4__2
            {
            pushFollow(FOLLOW_31);
            rule__AdmissionStructure__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__1"


    // $ANTLR start "rule__AdmissionStructure__Group_4__1__Impl"
    // InternalErasmusPrograms.g:3232:1: rule__AdmissionStructure__Group_4__1__Impl : ( '{' ) ;
    public final void rule__AdmissionStructure__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3236:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:3237:1: ( '{' )
            {
            // InternalErasmusPrograms.g:3237:1: ( '{' )
            // InternalErasmusPrograms.g:3238:2: '{'
            {
             before(grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__1__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_4__2"
    // InternalErasmusPrograms.g:3247:1: rule__AdmissionStructure__Group_4__2 : rule__AdmissionStructure__Group_4__2__Impl rule__AdmissionStructure__Group_4__3 ;
    public final void rule__AdmissionStructure__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3251:1: ( rule__AdmissionStructure__Group_4__2__Impl rule__AdmissionStructure__Group_4__3 )
            // InternalErasmusPrograms.g:3252:2: rule__AdmissionStructure__Group_4__2__Impl rule__AdmissionStructure__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__AdmissionStructure__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__2"


    // $ANTLR start "rule__AdmissionStructure__Group_4__2__Impl"
    // InternalErasmusPrograms.g:3259:1: rule__AdmissionStructure__Group_4__2__Impl : ( ( rule__AdmissionStructure__ResultsAssignment_4_2 ) ) ;
    public final void rule__AdmissionStructure__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3263:1: ( ( ( rule__AdmissionStructure__ResultsAssignment_4_2 ) ) )
            // InternalErasmusPrograms.g:3264:1: ( ( rule__AdmissionStructure__ResultsAssignment_4_2 ) )
            {
            // InternalErasmusPrograms.g:3264:1: ( ( rule__AdmissionStructure__ResultsAssignment_4_2 ) )
            // InternalErasmusPrograms.g:3265:2: ( rule__AdmissionStructure__ResultsAssignment_4_2 )
            {
             before(grammarAccess.getAdmissionStructureAccess().getResultsAssignment_4_2()); 
            // InternalErasmusPrograms.g:3266:2: ( rule__AdmissionStructure__ResultsAssignment_4_2 )
            // InternalErasmusPrograms.g:3266:3: rule__AdmissionStructure__ResultsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__ResultsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAdmissionStructureAccess().getResultsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__2__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_4__3"
    // InternalErasmusPrograms.g:3274:1: rule__AdmissionStructure__Group_4__3 : rule__AdmissionStructure__Group_4__3__Impl rule__AdmissionStructure__Group_4__4 ;
    public final void rule__AdmissionStructure__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3278:1: ( rule__AdmissionStructure__Group_4__3__Impl rule__AdmissionStructure__Group_4__4 )
            // InternalErasmusPrograms.g:3279:2: rule__AdmissionStructure__Group_4__3__Impl rule__AdmissionStructure__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__AdmissionStructure__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__3"


    // $ANTLR start "rule__AdmissionStructure__Group_4__3__Impl"
    // InternalErasmusPrograms.g:3286:1: rule__AdmissionStructure__Group_4__3__Impl : ( ( rule__AdmissionStructure__Group_4_3__0 )* ) ;
    public final void rule__AdmissionStructure__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3290:1: ( ( ( rule__AdmissionStructure__Group_4_3__0 )* ) )
            // InternalErasmusPrograms.g:3291:1: ( ( rule__AdmissionStructure__Group_4_3__0 )* )
            {
            // InternalErasmusPrograms.g:3291:1: ( ( rule__AdmissionStructure__Group_4_3__0 )* )
            // InternalErasmusPrograms.g:3292:2: ( rule__AdmissionStructure__Group_4_3__0 )*
            {
             before(grammarAccess.getAdmissionStructureAccess().getGroup_4_3()); 
            // InternalErasmusPrograms.g:3293:2: ( rule__AdmissionStructure__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalErasmusPrograms.g:3293:3: rule__AdmissionStructure__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AdmissionStructure__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAdmissionStructureAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__3__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_4__4"
    // InternalErasmusPrograms.g:3301:1: rule__AdmissionStructure__Group_4__4 : rule__AdmissionStructure__Group_4__4__Impl ;
    public final void rule__AdmissionStructure__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3305:1: ( rule__AdmissionStructure__Group_4__4__Impl )
            // InternalErasmusPrograms.g:3306:2: rule__AdmissionStructure__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__4"


    // $ANTLR start "rule__AdmissionStructure__Group_4__4__Impl"
    // InternalErasmusPrograms.g:3312:1: rule__AdmissionStructure__Group_4__4__Impl : ( '}' ) ;
    public final void rule__AdmissionStructure__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3316:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:3317:1: ( '}' )
            {
            // InternalErasmusPrograms.g:3317:1: ( '}' )
            // InternalErasmusPrograms.g:3318:2: '}'
            {
             before(grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4__4__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_4_3__0"
    // InternalErasmusPrograms.g:3328:1: rule__AdmissionStructure__Group_4_3__0 : rule__AdmissionStructure__Group_4_3__0__Impl rule__AdmissionStructure__Group_4_3__1 ;
    public final void rule__AdmissionStructure__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3332:1: ( rule__AdmissionStructure__Group_4_3__0__Impl rule__AdmissionStructure__Group_4_3__1 )
            // InternalErasmusPrograms.g:3333:2: rule__AdmissionStructure__Group_4_3__0__Impl rule__AdmissionStructure__Group_4_3__1
            {
            pushFollow(FOLLOW_31);
            rule__AdmissionStructure__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4_3__0"


    // $ANTLR start "rule__AdmissionStructure__Group_4_3__0__Impl"
    // InternalErasmusPrograms.g:3340:1: rule__AdmissionStructure__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__AdmissionStructure__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3344:1: ( ( ',' ) )
            // InternalErasmusPrograms.g:3345:1: ( ',' )
            {
            // InternalErasmusPrograms.g:3345:1: ( ',' )
            // InternalErasmusPrograms.g:3346:2: ','
            {
             before(grammarAccess.getAdmissionStructureAccess().getCommaKeyword_4_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAdmissionStructureAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4_3__0__Impl"


    // $ANTLR start "rule__AdmissionStructure__Group_4_3__1"
    // InternalErasmusPrograms.g:3355:1: rule__AdmissionStructure__Group_4_3__1 : rule__AdmissionStructure__Group_4_3__1__Impl ;
    public final void rule__AdmissionStructure__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3359:1: ( rule__AdmissionStructure__Group_4_3__1__Impl )
            // InternalErasmusPrograms.g:3360:2: rule__AdmissionStructure__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4_3__1"


    // $ANTLR start "rule__AdmissionStructure__Group_4_3__1__Impl"
    // InternalErasmusPrograms.g:3366:1: rule__AdmissionStructure__Group_4_3__1__Impl : ( ( rule__AdmissionStructure__ResultsAssignment_4_3_1 ) ) ;
    public final void rule__AdmissionStructure__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3370:1: ( ( ( rule__AdmissionStructure__ResultsAssignment_4_3_1 ) ) )
            // InternalErasmusPrograms.g:3371:1: ( ( rule__AdmissionStructure__ResultsAssignment_4_3_1 ) )
            {
            // InternalErasmusPrograms.g:3371:1: ( ( rule__AdmissionStructure__ResultsAssignment_4_3_1 ) )
            // InternalErasmusPrograms.g:3372:2: ( rule__AdmissionStructure__ResultsAssignment_4_3_1 )
            {
             before(grammarAccess.getAdmissionStructureAccess().getResultsAssignment_4_3_1()); 
            // InternalErasmusPrograms.g:3373:2: ( rule__AdmissionStructure__ResultsAssignment_4_3_1 )
            // InternalErasmusPrograms.g:3373:3: rule__AdmissionStructure__ResultsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AdmissionStructure__ResultsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAdmissionStructureAccess().getResultsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__Group_4_3__1__Impl"


    // $ANTLR start "rule__Results__Group__0"
    // InternalErasmusPrograms.g:3382:1: rule__Results__Group__0 : rule__Results__Group__0__Impl rule__Results__Group__1 ;
    public final void rule__Results__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3386:1: ( rule__Results__Group__0__Impl rule__Results__Group__1 )
            // InternalErasmusPrograms.g:3387:2: rule__Results__Group__0__Impl rule__Results__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Results__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__0"


    // $ANTLR start "rule__Results__Group__0__Impl"
    // InternalErasmusPrograms.g:3394:1: rule__Results__Group__0__Impl : ( 'Year' ) ;
    public final void rule__Results__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3398:1: ( ( 'Year' ) )
            // InternalErasmusPrograms.g:3399:1: ( 'Year' )
            {
            // InternalErasmusPrograms.g:3399:1: ( 'Year' )
            // InternalErasmusPrograms.g:3400:2: 'Year'
            {
             before(grammarAccess.getResultsAccess().getYearKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getYearKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__0__Impl"


    // $ANTLR start "rule__Results__Group__1"
    // InternalErasmusPrograms.g:3409:1: rule__Results__Group__1 : rule__Results__Group__1__Impl rule__Results__Group__2 ;
    public final void rule__Results__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3413:1: ( rule__Results__Group__1__Impl rule__Results__Group__2 )
            // InternalErasmusPrograms.g:3414:2: rule__Results__Group__1__Impl rule__Results__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Results__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__1"


    // $ANTLR start "rule__Results__Group__1__Impl"
    // InternalErasmusPrograms.g:3421:1: rule__Results__Group__1__Impl : ( ( rule__Results__YearAssignment_1 ) ) ;
    public final void rule__Results__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3425:1: ( ( ( rule__Results__YearAssignment_1 ) ) )
            // InternalErasmusPrograms.g:3426:1: ( ( rule__Results__YearAssignment_1 ) )
            {
            // InternalErasmusPrograms.g:3426:1: ( ( rule__Results__YearAssignment_1 ) )
            // InternalErasmusPrograms.g:3427:2: ( rule__Results__YearAssignment_1 )
            {
             before(grammarAccess.getResultsAccess().getYearAssignment_1()); 
            // InternalErasmusPrograms.g:3428:2: ( rule__Results__YearAssignment_1 )
            // InternalErasmusPrograms.g:3428:3: rule__Results__YearAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Results__YearAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getYearAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__1__Impl"


    // $ANTLR start "rule__Results__Group__2"
    // InternalErasmusPrograms.g:3436:1: rule__Results__Group__2 : rule__Results__Group__2__Impl rule__Results__Group__3 ;
    public final void rule__Results__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3440:1: ( rule__Results__Group__2__Impl rule__Results__Group__3 )
            // InternalErasmusPrograms.g:3441:2: rule__Results__Group__2__Impl rule__Results__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Results__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__2"


    // $ANTLR start "rule__Results__Group__2__Impl"
    // InternalErasmusPrograms.g:3448:1: rule__Results__Group__2__Impl : ( '{' ) ;
    public final void rule__Results__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3452:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:3453:1: ( '{' )
            {
            // InternalErasmusPrograms.g:3453:1: ( '{' )
            // InternalErasmusPrograms.g:3454:2: '{'
            {
             before(grammarAccess.getResultsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__2__Impl"


    // $ANTLR start "rule__Results__Group__3"
    // InternalErasmusPrograms.g:3463:1: rule__Results__Group__3 : rule__Results__Group__3__Impl rule__Results__Group__4 ;
    public final void rule__Results__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3467:1: ( rule__Results__Group__3__Impl rule__Results__Group__4 )
            // InternalErasmusPrograms.g:3468:2: rule__Results__Group__3__Impl rule__Results__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Results__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__3"


    // $ANTLR start "rule__Results__Group__3__Impl"
    // InternalErasmusPrograms.g:3475:1: rule__Results__Group__3__Impl : ( 'totalAdmitted' ) ;
    public final void rule__Results__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3479:1: ( ( 'totalAdmitted' ) )
            // InternalErasmusPrograms.g:3480:1: ( 'totalAdmitted' )
            {
            // InternalErasmusPrograms.g:3480:1: ( 'totalAdmitted' )
            // InternalErasmusPrograms.g:3481:2: 'totalAdmitted'
            {
             before(grammarAccess.getResultsAccess().getTotalAdmittedKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getTotalAdmittedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__3__Impl"


    // $ANTLR start "rule__Results__Group__4"
    // InternalErasmusPrograms.g:3490:1: rule__Results__Group__4 : rule__Results__Group__4__Impl rule__Results__Group__5 ;
    public final void rule__Results__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3494:1: ( rule__Results__Group__4__Impl rule__Results__Group__5 )
            // InternalErasmusPrograms.g:3495:2: rule__Results__Group__4__Impl rule__Results__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Results__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__4"


    // $ANTLR start "rule__Results__Group__4__Impl"
    // InternalErasmusPrograms.g:3502:1: rule__Results__Group__4__Impl : ( ( rule__Results__TotalAdmittedAssignment_4 ) ) ;
    public final void rule__Results__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3506:1: ( ( ( rule__Results__TotalAdmittedAssignment_4 ) ) )
            // InternalErasmusPrograms.g:3507:1: ( ( rule__Results__TotalAdmittedAssignment_4 ) )
            {
            // InternalErasmusPrograms.g:3507:1: ( ( rule__Results__TotalAdmittedAssignment_4 ) )
            // InternalErasmusPrograms.g:3508:2: ( rule__Results__TotalAdmittedAssignment_4 )
            {
             before(grammarAccess.getResultsAccess().getTotalAdmittedAssignment_4()); 
            // InternalErasmusPrograms.g:3509:2: ( rule__Results__TotalAdmittedAssignment_4 )
            // InternalErasmusPrograms.g:3509:3: rule__Results__TotalAdmittedAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Results__TotalAdmittedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getTotalAdmittedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__4__Impl"


    // $ANTLR start "rule__Results__Group__5"
    // InternalErasmusPrograms.g:3517:1: rule__Results__Group__5 : rule__Results__Group__5__Impl rule__Results__Group__6 ;
    public final void rule__Results__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3521:1: ( rule__Results__Group__5__Impl rule__Results__Group__6 )
            // InternalErasmusPrograms.g:3522:2: rule__Results__Group__5__Impl rule__Results__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Results__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__5"


    // $ANTLR start "rule__Results__Group__5__Impl"
    // InternalErasmusPrograms.g:3529:1: rule__Results__Group__5__Impl : ( 'scholarshipsAwarded' ) ;
    public final void rule__Results__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3533:1: ( ( 'scholarshipsAwarded' ) )
            // InternalErasmusPrograms.g:3534:1: ( 'scholarshipsAwarded' )
            {
            // InternalErasmusPrograms.g:3534:1: ( 'scholarshipsAwarded' )
            // InternalErasmusPrograms.g:3535:2: 'scholarshipsAwarded'
            {
             before(grammarAccess.getResultsAccess().getScholarshipsAwardedKeyword_5()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getScholarshipsAwardedKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__5__Impl"


    // $ANTLR start "rule__Results__Group__6"
    // InternalErasmusPrograms.g:3544:1: rule__Results__Group__6 : rule__Results__Group__6__Impl rule__Results__Group__7 ;
    public final void rule__Results__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3548:1: ( rule__Results__Group__6__Impl rule__Results__Group__7 )
            // InternalErasmusPrograms.g:3549:2: rule__Results__Group__6__Impl rule__Results__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__Results__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__6"


    // $ANTLR start "rule__Results__Group__6__Impl"
    // InternalErasmusPrograms.g:3556:1: rule__Results__Group__6__Impl : ( ( rule__Results__ScholarshipsAwardedAssignment_6 ) ) ;
    public final void rule__Results__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3560:1: ( ( ( rule__Results__ScholarshipsAwardedAssignment_6 ) ) )
            // InternalErasmusPrograms.g:3561:1: ( ( rule__Results__ScholarshipsAwardedAssignment_6 ) )
            {
            // InternalErasmusPrograms.g:3561:1: ( ( rule__Results__ScholarshipsAwardedAssignment_6 ) )
            // InternalErasmusPrograms.g:3562:2: ( rule__Results__ScholarshipsAwardedAssignment_6 )
            {
             before(grammarAccess.getResultsAccess().getScholarshipsAwardedAssignment_6()); 
            // InternalErasmusPrograms.g:3563:2: ( rule__Results__ScholarshipsAwardedAssignment_6 )
            // InternalErasmusPrograms.g:3563:3: rule__Results__ScholarshipsAwardedAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Results__ScholarshipsAwardedAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getScholarshipsAwardedAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__6__Impl"


    // $ANTLR start "rule__Results__Group__7"
    // InternalErasmusPrograms.g:3571:1: rule__Results__Group__7 : rule__Results__Group__7__Impl rule__Results__Group__8 ;
    public final void rule__Results__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3575:1: ( rule__Results__Group__7__Impl rule__Results__Group__8 )
            // InternalErasmusPrograms.g:3576:2: rule__Results__Group__7__Impl rule__Results__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__Results__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__7"


    // $ANTLR start "rule__Results__Group__7__Impl"
    // InternalErasmusPrograms.g:3583:1: rule__Results__Group__7__Impl : ( ( rule__Results__Group_7__0 )? ) ;
    public final void rule__Results__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3587:1: ( ( ( rule__Results__Group_7__0 )? ) )
            // InternalErasmusPrograms.g:3588:1: ( ( rule__Results__Group_7__0 )? )
            {
            // InternalErasmusPrograms.g:3588:1: ( ( rule__Results__Group_7__0 )? )
            // InternalErasmusPrograms.g:3589:2: ( rule__Results__Group_7__0 )?
            {
             before(grammarAccess.getResultsAccess().getGroup_7()); 
            // InternalErasmusPrograms.g:3590:2: ( rule__Results__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalErasmusPrograms.g:3590:3: rule__Results__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Results__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResultsAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__7__Impl"


    // $ANTLR start "rule__Results__Group__8"
    // InternalErasmusPrograms.g:3598:1: rule__Results__Group__8 : rule__Results__Group__8__Impl ;
    public final void rule__Results__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3602:1: ( rule__Results__Group__8__Impl )
            // InternalErasmusPrograms.g:3603:2: rule__Results__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Results__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__8"


    // $ANTLR start "rule__Results__Group__8__Impl"
    // InternalErasmusPrograms.g:3609:1: rule__Results__Group__8__Impl : ( '}' ) ;
    public final void rule__Results__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3613:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:3614:1: ( '}' )
            {
            // InternalErasmusPrograms.g:3614:1: ( '}' )
            // InternalErasmusPrograms.g:3615:2: '}'
            {
             before(grammarAccess.getResultsAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group__8__Impl"


    // $ANTLR start "rule__Results__Group_7__0"
    // InternalErasmusPrograms.g:3625:1: rule__Results__Group_7__0 : rule__Results__Group_7__0__Impl rule__Results__Group_7__1 ;
    public final void rule__Results__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3629:1: ( rule__Results__Group_7__0__Impl rule__Results__Group_7__1 )
            // InternalErasmusPrograms.g:3630:2: rule__Results__Group_7__0__Impl rule__Results__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Results__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__0"


    // $ANTLR start "rule__Results__Group_7__0__Impl"
    // InternalErasmusPrograms.g:3637:1: rule__Results__Group_7__0__Impl : ( 'admittedStudents' ) ;
    public final void rule__Results__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3641:1: ( ( 'admittedStudents' ) )
            // InternalErasmusPrograms.g:3642:1: ( 'admittedStudents' )
            {
            // InternalErasmusPrograms.g:3642:1: ( 'admittedStudents' )
            // InternalErasmusPrograms.g:3643:2: 'admittedStudents'
            {
             before(grammarAccess.getResultsAccess().getAdmittedStudentsKeyword_7_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getAdmittedStudentsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__0__Impl"


    // $ANTLR start "rule__Results__Group_7__1"
    // InternalErasmusPrograms.g:3652:1: rule__Results__Group_7__1 : rule__Results__Group_7__1__Impl rule__Results__Group_7__2 ;
    public final void rule__Results__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3656:1: ( rule__Results__Group_7__1__Impl rule__Results__Group_7__2 )
            // InternalErasmusPrograms.g:3657:2: rule__Results__Group_7__1__Impl rule__Results__Group_7__2
            {
            pushFollow(FOLLOW_3);
            rule__Results__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__1"


    // $ANTLR start "rule__Results__Group_7__1__Impl"
    // InternalErasmusPrograms.g:3664:1: rule__Results__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Results__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3668:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:3669:1: ( '{' )
            {
            // InternalErasmusPrograms.g:3669:1: ( '{' )
            // InternalErasmusPrograms.g:3670:2: '{'
            {
             before(grammarAccess.getResultsAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__1__Impl"


    // $ANTLR start "rule__Results__Group_7__2"
    // InternalErasmusPrograms.g:3679:1: rule__Results__Group_7__2 : rule__Results__Group_7__2__Impl rule__Results__Group_7__3 ;
    public final void rule__Results__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3683:1: ( rule__Results__Group_7__2__Impl rule__Results__Group_7__3 )
            // InternalErasmusPrograms.g:3684:2: rule__Results__Group_7__2__Impl rule__Results__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__Results__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__2"


    // $ANTLR start "rule__Results__Group_7__2__Impl"
    // InternalErasmusPrograms.g:3691:1: rule__Results__Group_7__2__Impl : ( ( rule__Results__AdmittedStudentsAssignment_7_2 ) ) ;
    public final void rule__Results__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3695:1: ( ( ( rule__Results__AdmittedStudentsAssignment_7_2 ) ) )
            // InternalErasmusPrograms.g:3696:1: ( ( rule__Results__AdmittedStudentsAssignment_7_2 ) )
            {
            // InternalErasmusPrograms.g:3696:1: ( ( rule__Results__AdmittedStudentsAssignment_7_2 ) )
            // InternalErasmusPrograms.g:3697:2: ( rule__Results__AdmittedStudentsAssignment_7_2 )
            {
             before(grammarAccess.getResultsAccess().getAdmittedStudentsAssignment_7_2()); 
            // InternalErasmusPrograms.g:3698:2: ( rule__Results__AdmittedStudentsAssignment_7_2 )
            // InternalErasmusPrograms.g:3698:3: rule__Results__AdmittedStudentsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Results__AdmittedStudentsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getAdmittedStudentsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__2__Impl"


    // $ANTLR start "rule__Results__Group_7__3"
    // InternalErasmusPrograms.g:3706:1: rule__Results__Group_7__3 : rule__Results__Group_7__3__Impl rule__Results__Group_7__4 ;
    public final void rule__Results__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3710:1: ( rule__Results__Group_7__3__Impl rule__Results__Group_7__4 )
            // InternalErasmusPrograms.g:3711:2: rule__Results__Group_7__3__Impl rule__Results__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__Results__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__3"


    // $ANTLR start "rule__Results__Group_7__3__Impl"
    // InternalErasmusPrograms.g:3718:1: rule__Results__Group_7__3__Impl : ( ( rule__Results__Group_7_3__0 )* ) ;
    public final void rule__Results__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3722:1: ( ( ( rule__Results__Group_7_3__0 )* ) )
            // InternalErasmusPrograms.g:3723:1: ( ( rule__Results__Group_7_3__0 )* )
            {
            // InternalErasmusPrograms.g:3723:1: ( ( rule__Results__Group_7_3__0 )* )
            // InternalErasmusPrograms.g:3724:2: ( rule__Results__Group_7_3__0 )*
            {
             before(grammarAccess.getResultsAccess().getGroup_7_3()); 
            // InternalErasmusPrograms.g:3725:2: ( rule__Results__Group_7_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalErasmusPrograms.g:3725:3: rule__Results__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Results__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getResultsAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__3__Impl"


    // $ANTLR start "rule__Results__Group_7__4"
    // InternalErasmusPrograms.g:3733:1: rule__Results__Group_7__4 : rule__Results__Group_7__4__Impl ;
    public final void rule__Results__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3737:1: ( rule__Results__Group_7__4__Impl )
            // InternalErasmusPrograms.g:3738:2: rule__Results__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Results__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__4"


    // $ANTLR start "rule__Results__Group_7__4__Impl"
    // InternalErasmusPrograms.g:3744:1: rule__Results__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Results__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3748:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:3749:1: ( '}' )
            {
            // InternalErasmusPrograms.g:3749:1: ( '}' )
            // InternalErasmusPrograms.g:3750:2: '}'
            {
             before(grammarAccess.getResultsAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7__4__Impl"


    // $ANTLR start "rule__Results__Group_7_3__0"
    // InternalErasmusPrograms.g:3760:1: rule__Results__Group_7_3__0 : rule__Results__Group_7_3__0__Impl rule__Results__Group_7_3__1 ;
    public final void rule__Results__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3764:1: ( rule__Results__Group_7_3__0__Impl rule__Results__Group_7_3__1 )
            // InternalErasmusPrograms.g:3765:2: rule__Results__Group_7_3__0__Impl rule__Results__Group_7_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Results__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Results__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7_3__0"


    // $ANTLR start "rule__Results__Group_7_3__0__Impl"
    // InternalErasmusPrograms.g:3772:1: rule__Results__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Results__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3776:1: ( ( ',' ) )
            // InternalErasmusPrograms.g:3777:1: ( ',' )
            {
            // InternalErasmusPrograms.g:3777:1: ( ',' )
            // InternalErasmusPrograms.g:3778:2: ','
            {
             before(grammarAccess.getResultsAccess().getCommaKeyword_7_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7_3__0__Impl"


    // $ANTLR start "rule__Results__Group_7_3__1"
    // InternalErasmusPrograms.g:3787:1: rule__Results__Group_7_3__1 : rule__Results__Group_7_3__1__Impl ;
    public final void rule__Results__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3791:1: ( rule__Results__Group_7_3__1__Impl )
            // InternalErasmusPrograms.g:3792:2: rule__Results__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Results__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7_3__1"


    // $ANTLR start "rule__Results__Group_7_3__1__Impl"
    // InternalErasmusPrograms.g:3798:1: rule__Results__Group_7_3__1__Impl : ( ( rule__Results__AdmittedStudentsAssignment_7_3_1 ) ) ;
    public final void rule__Results__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3802:1: ( ( ( rule__Results__AdmittedStudentsAssignment_7_3_1 ) ) )
            // InternalErasmusPrograms.g:3803:1: ( ( rule__Results__AdmittedStudentsAssignment_7_3_1 ) )
            {
            // InternalErasmusPrograms.g:3803:1: ( ( rule__Results__AdmittedStudentsAssignment_7_3_1 ) )
            // InternalErasmusPrograms.g:3804:2: ( rule__Results__AdmittedStudentsAssignment_7_3_1 )
            {
             before(grammarAccess.getResultsAccess().getAdmittedStudentsAssignment_7_3_1()); 
            // InternalErasmusPrograms.g:3805:2: ( rule__Results__AdmittedStudentsAssignment_7_3_1 )
            // InternalErasmusPrograms.g:3805:3: rule__Results__AdmittedStudentsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Results__AdmittedStudentsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResultsAccess().getAdmittedStudentsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__Group_7_3__1__Impl"


    // $ANTLR start "rule__DocumentRequirement__Group__0"
    // InternalErasmusPrograms.g:3814:1: rule__DocumentRequirement__Group__0 : rule__DocumentRequirement__Group__0__Impl rule__DocumentRequirement__Group__1 ;
    public final void rule__DocumentRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3818:1: ( rule__DocumentRequirement__Group__0__Impl rule__DocumentRequirement__Group__1 )
            // InternalErasmusPrograms.g:3819:2: rule__DocumentRequirement__Group__0__Impl rule__DocumentRequirement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DocumentRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__0"


    // $ANTLR start "rule__DocumentRequirement__Group__0__Impl"
    // InternalErasmusPrograms.g:3826:1: rule__DocumentRequirement__Group__0__Impl : ( 'DocumentRequirement' ) ;
    public final void rule__DocumentRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3830:1: ( ( 'DocumentRequirement' ) )
            // InternalErasmusPrograms.g:3831:1: ( 'DocumentRequirement' )
            {
            // InternalErasmusPrograms.g:3831:1: ( 'DocumentRequirement' )
            // InternalErasmusPrograms.g:3832:2: 'DocumentRequirement'
            {
             before(grammarAccess.getDocumentRequirementAccess().getDocumentRequirementKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDocumentRequirementAccess().getDocumentRequirementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__0__Impl"


    // $ANTLR start "rule__DocumentRequirement__Group__1"
    // InternalErasmusPrograms.g:3841:1: rule__DocumentRequirement__Group__1 : rule__DocumentRequirement__Group__1__Impl rule__DocumentRequirement__Group__2 ;
    public final void rule__DocumentRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3845:1: ( rule__DocumentRequirement__Group__1__Impl rule__DocumentRequirement__Group__2 )
            // InternalErasmusPrograms.g:3846:2: rule__DocumentRequirement__Group__1__Impl rule__DocumentRequirement__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__DocumentRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__1"


    // $ANTLR start "rule__DocumentRequirement__Group__1__Impl"
    // InternalErasmusPrograms.g:3853:1: rule__DocumentRequirement__Group__1__Impl : ( '{' ) ;
    public final void rule__DocumentRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3857:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:3858:1: ( '{' )
            {
            // InternalErasmusPrograms.g:3858:1: ( '{' )
            // InternalErasmusPrograms.g:3859:2: '{'
            {
             before(grammarAccess.getDocumentRequirementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDocumentRequirementAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__1__Impl"


    // $ANTLR start "rule__DocumentRequirement__Group__2"
    // InternalErasmusPrograms.g:3868:1: rule__DocumentRequirement__Group__2 : rule__DocumentRequirement__Group__2__Impl rule__DocumentRequirement__Group__3 ;
    public final void rule__DocumentRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3872:1: ( rule__DocumentRequirement__Group__2__Impl rule__DocumentRequirement__Group__3 )
            // InternalErasmusPrograms.g:3873:2: rule__DocumentRequirement__Group__2__Impl rule__DocumentRequirement__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__DocumentRequirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__2"


    // $ANTLR start "rule__DocumentRequirement__Group__2__Impl"
    // InternalErasmusPrograms.g:3880:1: rule__DocumentRequirement__Group__2__Impl : ( 'documentName' ) ;
    public final void rule__DocumentRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3884:1: ( ( 'documentName' ) )
            // InternalErasmusPrograms.g:3885:1: ( 'documentName' )
            {
            // InternalErasmusPrograms.g:3885:1: ( 'documentName' )
            // InternalErasmusPrograms.g:3886:2: 'documentName'
            {
             before(grammarAccess.getDocumentRequirementAccess().getDocumentNameKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDocumentRequirementAccess().getDocumentNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__2__Impl"


    // $ANTLR start "rule__DocumentRequirement__Group__3"
    // InternalErasmusPrograms.g:3895:1: rule__DocumentRequirement__Group__3 : rule__DocumentRequirement__Group__3__Impl rule__DocumentRequirement__Group__4 ;
    public final void rule__DocumentRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3899:1: ( rule__DocumentRequirement__Group__3__Impl rule__DocumentRequirement__Group__4 )
            // InternalErasmusPrograms.g:3900:2: rule__DocumentRequirement__Group__3__Impl rule__DocumentRequirement__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__DocumentRequirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__3"


    // $ANTLR start "rule__DocumentRequirement__Group__3__Impl"
    // InternalErasmusPrograms.g:3907:1: rule__DocumentRequirement__Group__3__Impl : ( ( rule__DocumentRequirement__DocumentNameAssignment_3 ) ) ;
    public final void rule__DocumentRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3911:1: ( ( ( rule__DocumentRequirement__DocumentNameAssignment_3 ) ) )
            // InternalErasmusPrograms.g:3912:1: ( ( rule__DocumentRequirement__DocumentNameAssignment_3 ) )
            {
            // InternalErasmusPrograms.g:3912:1: ( ( rule__DocumentRequirement__DocumentNameAssignment_3 ) )
            // InternalErasmusPrograms.g:3913:2: ( rule__DocumentRequirement__DocumentNameAssignment_3 )
            {
             before(grammarAccess.getDocumentRequirementAccess().getDocumentNameAssignment_3()); 
            // InternalErasmusPrograms.g:3914:2: ( rule__DocumentRequirement__DocumentNameAssignment_3 )
            // InternalErasmusPrograms.g:3914:3: rule__DocumentRequirement__DocumentNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__DocumentNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDocumentRequirementAccess().getDocumentNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__3__Impl"


    // $ANTLR start "rule__DocumentRequirement__Group__4"
    // InternalErasmusPrograms.g:3922:1: rule__DocumentRequirement__Group__4 : rule__DocumentRequirement__Group__4__Impl rule__DocumentRequirement__Group__5 ;
    public final void rule__DocumentRequirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3926:1: ( rule__DocumentRequirement__Group__4__Impl rule__DocumentRequirement__Group__5 )
            // InternalErasmusPrograms.g:3927:2: rule__DocumentRequirement__Group__4__Impl rule__DocumentRequirement__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__DocumentRequirement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__4"


    // $ANTLR start "rule__DocumentRequirement__Group__4__Impl"
    // InternalErasmusPrograms.g:3934:1: rule__DocumentRequirement__Group__4__Impl : ( 'description' ) ;
    public final void rule__DocumentRequirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3938:1: ( ( 'description' ) )
            // InternalErasmusPrograms.g:3939:1: ( 'description' )
            {
            // InternalErasmusPrograms.g:3939:1: ( 'description' )
            // InternalErasmusPrograms.g:3940:2: 'description'
            {
             before(grammarAccess.getDocumentRequirementAccess().getDescriptionKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDocumentRequirementAccess().getDescriptionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__4__Impl"


    // $ANTLR start "rule__DocumentRequirement__Group__5"
    // InternalErasmusPrograms.g:3949:1: rule__DocumentRequirement__Group__5 : rule__DocumentRequirement__Group__5__Impl rule__DocumentRequirement__Group__6 ;
    public final void rule__DocumentRequirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3953:1: ( rule__DocumentRequirement__Group__5__Impl rule__DocumentRequirement__Group__6 )
            // InternalErasmusPrograms.g:3954:2: rule__DocumentRequirement__Group__5__Impl rule__DocumentRequirement__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__DocumentRequirement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__5"


    // $ANTLR start "rule__DocumentRequirement__Group__5__Impl"
    // InternalErasmusPrograms.g:3961:1: rule__DocumentRequirement__Group__5__Impl : ( ( rule__DocumentRequirement__DescriptionAssignment_5 ) ) ;
    public final void rule__DocumentRequirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3965:1: ( ( ( rule__DocumentRequirement__DescriptionAssignment_5 ) ) )
            // InternalErasmusPrograms.g:3966:1: ( ( rule__DocumentRequirement__DescriptionAssignment_5 ) )
            {
            // InternalErasmusPrograms.g:3966:1: ( ( rule__DocumentRequirement__DescriptionAssignment_5 ) )
            // InternalErasmusPrograms.g:3967:2: ( rule__DocumentRequirement__DescriptionAssignment_5 )
            {
             before(grammarAccess.getDocumentRequirementAccess().getDescriptionAssignment_5()); 
            // InternalErasmusPrograms.g:3968:2: ( rule__DocumentRequirement__DescriptionAssignment_5 )
            // InternalErasmusPrograms.g:3968:3: rule__DocumentRequirement__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDocumentRequirementAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__5__Impl"


    // $ANTLR start "rule__DocumentRequirement__Group__6"
    // InternalErasmusPrograms.g:3976:1: rule__DocumentRequirement__Group__6 : rule__DocumentRequirement__Group__6__Impl ;
    public final void rule__DocumentRequirement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3980:1: ( rule__DocumentRequirement__Group__6__Impl )
            // InternalErasmusPrograms.g:3981:2: rule__DocumentRequirement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocumentRequirement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__6"


    // $ANTLR start "rule__DocumentRequirement__Group__6__Impl"
    // InternalErasmusPrograms.g:3987:1: rule__DocumentRequirement__Group__6__Impl : ( '}' ) ;
    public final void rule__DocumentRequirement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:3991:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:3992:1: ( '}' )
            {
            // InternalErasmusPrograms.g:3992:1: ( '}' )
            // InternalErasmusPrograms.g:3993:2: '}'
            {
             before(grammarAccess.getDocumentRequirementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDocumentRequirementAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__Group__6__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__0"
    // InternalErasmusPrograms.g:4003:1: rule__DegreeRequirement__Group__0 : rule__DegreeRequirement__Group__0__Impl rule__DegreeRequirement__Group__1 ;
    public final void rule__DegreeRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4007:1: ( rule__DegreeRequirement__Group__0__Impl rule__DegreeRequirement__Group__1 )
            // InternalErasmusPrograms.g:4008:2: rule__DegreeRequirement__Group__0__Impl rule__DegreeRequirement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DegreeRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__0"


    // $ANTLR start "rule__DegreeRequirement__Group__0__Impl"
    // InternalErasmusPrograms.g:4015:1: rule__DegreeRequirement__Group__0__Impl : ( 'DegreeRequirement' ) ;
    public final void rule__DegreeRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4019:1: ( ( 'DegreeRequirement' ) )
            // InternalErasmusPrograms.g:4020:1: ( 'DegreeRequirement' )
            {
            // InternalErasmusPrograms.g:4020:1: ( 'DegreeRequirement' )
            // InternalErasmusPrograms.g:4021:2: 'DegreeRequirement'
            {
             before(grammarAccess.getDegreeRequirementAccess().getDegreeRequirementKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDegreeRequirementAccess().getDegreeRequirementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__0__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__1"
    // InternalErasmusPrograms.g:4030:1: rule__DegreeRequirement__Group__1 : rule__DegreeRequirement__Group__1__Impl rule__DegreeRequirement__Group__2 ;
    public final void rule__DegreeRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4034:1: ( rule__DegreeRequirement__Group__1__Impl rule__DegreeRequirement__Group__2 )
            // InternalErasmusPrograms.g:4035:2: rule__DegreeRequirement__Group__1__Impl rule__DegreeRequirement__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__DegreeRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__1"


    // $ANTLR start "rule__DegreeRequirement__Group__1__Impl"
    // InternalErasmusPrograms.g:4042:1: rule__DegreeRequirement__Group__1__Impl : ( '{' ) ;
    public final void rule__DegreeRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4046:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:4047:1: ( '{' )
            {
            // InternalErasmusPrograms.g:4047:1: ( '{' )
            // InternalErasmusPrograms.g:4048:2: '{'
            {
             before(grammarAccess.getDegreeRequirementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDegreeRequirementAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__1__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__2"
    // InternalErasmusPrograms.g:4057:1: rule__DegreeRequirement__Group__2 : rule__DegreeRequirement__Group__2__Impl rule__DegreeRequirement__Group__3 ;
    public final void rule__DegreeRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4061:1: ( rule__DegreeRequirement__Group__2__Impl rule__DegreeRequirement__Group__3 )
            // InternalErasmusPrograms.g:4062:2: rule__DegreeRequirement__Group__2__Impl rule__DegreeRequirement__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__DegreeRequirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__2"


    // $ANTLR start "rule__DegreeRequirement__Group__2__Impl"
    // InternalErasmusPrograms.g:4069:1: rule__DegreeRequirement__Group__2__Impl : ( 'degreeName' ) ;
    public final void rule__DegreeRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4073:1: ( ( 'degreeName' ) )
            // InternalErasmusPrograms.g:4074:1: ( 'degreeName' )
            {
            // InternalErasmusPrograms.g:4074:1: ( 'degreeName' )
            // InternalErasmusPrograms.g:4075:2: 'degreeName'
            {
             before(grammarAccess.getDegreeRequirementAccess().getDegreeNameKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDegreeRequirementAccess().getDegreeNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__2__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__3"
    // InternalErasmusPrograms.g:4084:1: rule__DegreeRequirement__Group__3 : rule__DegreeRequirement__Group__3__Impl rule__DegreeRequirement__Group__4 ;
    public final void rule__DegreeRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4088:1: ( rule__DegreeRequirement__Group__3__Impl rule__DegreeRequirement__Group__4 )
            // InternalErasmusPrograms.g:4089:2: rule__DegreeRequirement__Group__3__Impl rule__DegreeRequirement__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__DegreeRequirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__3"


    // $ANTLR start "rule__DegreeRequirement__Group__3__Impl"
    // InternalErasmusPrograms.g:4096:1: rule__DegreeRequirement__Group__3__Impl : ( ( rule__DegreeRequirement__DegreeNameAssignment_3 ) ) ;
    public final void rule__DegreeRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4100:1: ( ( ( rule__DegreeRequirement__DegreeNameAssignment_3 ) ) )
            // InternalErasmusPrograms.g:4101:1: ( ( rule__DegreeRequirement__DegreeNameAssignment_3 ) )
            {
            // InternalErasmusPrograms.g:4101:1: ( ( rule__DegreeRequirement__DegreeNameAssignment_3 ) )
            // InternalErasmusPrograms.g:4102:2: ( rule__DegreeRequirement__DegreeNameAssignment_3 )
            {
             before(grammarAccess.getDegreeRequirementAccess().getDegreeNameAssignment_3()); 
            // InternalErasmusPrograms.g:4103:2: ( rule__DegreeRequirement__DegreeNameAssignment_3 )
            // InternalErasmusPrograms.g:4103:3: rule__DegreeRequirement__DegreeNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__DegreeNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDegreeRequirementAccess().getDegreeNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__3__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__4"
    // InternalErasmusPrograms.g:4111:1: rule__DegreeRequirement__Group__4 : rule__DegreeRequirement__Group__4__Impl rule__DegreeRequirement__Group__5 ;
    public final void rule__DegreeRequirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4115:1: ( rule__DegreeRequirement__Group__4__Impl rule__DegreeRequirement__Group__5 )
            // InternalErasmusPrograms.g:4116:2: rule__DegreeRequirement__Group__4__Impl rule__DegreeRequirement__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__DegreeRequirement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__4"


    // $ANTLR start "rule__DegreeRequirement__Group__4__Impl"
    // InternalErasmusPrograms.g:4123:1: rule__DegreeRequirement__Group__4__Impl : ( 'fieldOfStudy' ) ;
    public final void rule__DegreeRequirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4127:1: ( ( 'fieldOfStudy' ) )
            // InternalErasmusPrograms.g:4128:1: ( 'fieldOfStudy' )
            {
            // InternalErasmusPrograms.g:4128:1: ( 'fieldOfStudy' )
            // InternalErasmusPrograms.g:4129:2: 'fieldOfStudy'
            {
             before(grammarAccess.getDegreeRequirementAccess().getFieldOfStudyKeyword_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDegreeRequirementAccess().getFieldOfStudyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__4__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__5"
    // InternalErasmusPrograms.g:4138:1: rule__DegreeRequirement__Group__5 : rule__DegreeRequirement__Group__5__Impl rule__DegreeRequirement__Group__6 ;
    public final void rule__DegreeRequirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4142:1: ( rule__DegreeRequirement__Group__5__Impl rule__DegreeRequirement__Group__6 )
            // InternalErasmusPrograms.g:4143:2: rule__DegreeRequirement__Group__5__Impl rule__DegreeRequirement__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__DegreeRequirement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__5"


    // $ANTLR start "rule__DegreeRequirement__Group__5__Impl"
    // InternalErasmusPrograms.g:4150:1: rule__DegreeRequirement__Group__5__Impl : ( ( rule__DegreeRequirement__FieldOfStudyAssignment_5 ) ) ;
    public final void rule__DegreeRequirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4154:1: ( ( ( rule__DegreeRequirement__FieldOfStudyAssignment_5 ) ) )
            // InternalErasmusPrograms.g:4155:1: ( ( rule__DegreeRequirement__FieldOfStudyAssignment_5 ) )
            {
            // InternalErasmusPrograms.g:4155:1: ( ( rule__DegreeRequirement__FieldOfStudyAssignment_5 ) )
            // InternalErasmusPrograms.g:4156:2: ( rule__DegreeRequirement__FieldOfStudyAssignment_5 )
            {
             before(grammarAccess.getDegreeRequirementAccess().getFieldOfStudyAssignment_5()); 
            // InternalErasmusPrograms.g:4157:2: ( rule__DegreeRequirement__FieldOfStudyAssignment_5 )
            // InternalErasmusPrograms.g:4157:3: rule__DegreeRequirement__FieldOfStudyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__FieldOfStudyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDegreeRequirementAccess().getFieldOfStudyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__5__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__6"
    // InternalErasmusPrograms.g:4165:1: rule__DegreeRequirement__Group__6 : rule__DegreeRequirement__Group__6__Impl rule__DegreeRequirement__Group__7 ;
    public final void rule__DegreeRequirement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4169:1: ( rule__DegreeRequirement__Group__6__Impl rule__DegreeRequirement__Group__7 )
            // InternalErasmusPrograms.g:4170:2: rule__DegreeRequirement__Group__6__Impl rule__DegreeRequirement__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__DegreeRequirement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__6"


    // $ANTLR start "rule__DegreeRequirement__Group__6__Impl"
    // InternalErasmusPrograms.g:4177:1: rule__DegreeRequirement__Group__6__Impl : ( 'level' ) ;
    public final void rule__DegreeRequirement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4181:1: ( ( 'level' ) )
            // InternalErasmusPrograms.g:4182:1: ( 'level' )
            {
            // InternalErasmusPrograms.g:4182:1: ( 'level' )
            // InternalErasmusPrograms.g:4183:2: 'level'
            {
             before(grammarAccess.getDegreeRequirementAccess().getLevelKeyword_6()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDegreeRequirementAccess().getLevelKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__6__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__7"
    // InternalErasmusPrograms.g:4192:1: rule__DegreeRequirement__Group__7 : rule__DegreeRequirement__Group__7__Impl rule__DegreeRequirement__Group__8 ;
    public final void rule__DegreeRequirement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4196:1: ( rule__DegreeRequirement__Group__7__Impl rule__DegreeRequirement__Group__8 )
            // InternalErasmusPrograms.g:4197:2: rule__DegreeRequirement__Group__7__Impl rule__DegreeRequirement__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__DegreeRequirement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__7"


    // $ANTLR start "rule__DegreeRequirement__Group__7__Impl"
    // InternalErasmusPrograms.g:4204:1: rule__DegreeRequirement__Group__7__Impl : ( ( rule__DegreeRequirement__LevelAssignment_7 ) ) ;
    public final void rule__DegreeRequirement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4208:1: ( ( ( rule__DegreeRequirement__LevelAssignment_7 ) ) )
            // InternalErasmusPrograms.g:4209:1: ( ( rule__DegreeRequirement__LevelAssignment_7 ) )
            {
            // InternalErasmusPrograms.g:4209:1: ( ( rule__DegreeRequirement__LevelAssignment_7 ) )
            // InternalErasmusPrograms.g:4210:2: ( rule__DegreeRequirement__LevelAssignment_7 )
            {
             before(grammarAccess.getDegreeRequirementAccess().getLevelAssignment_7()); 
            // InternalErasmusPrograms.g:4211:2: ( rule__DegreeRequirement__LevelAssignment_7 )
            // InternalErasmusPrograms.g:4211:3: rule__DegreeRequirement__LevelAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__LevelAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDegreeRequirementAccess().getLevelAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__7__Impl"


    // $ANTLR start "rule__DegreeRequirement__Group__8"
    // InternalErasmusPrograms.g:4219:1: rule__DegreeRequirement__Group__8 : rule__DegreeRequirement__Group__8__Impl ;
    public final void rule__DegreeRequirement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4223:1: ( rule__DegreeRequirement__Group__8__Impl )
            // InternalErasmusPrograms.g:4224:2: rule__DegreeRequirement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DegreeRequirement__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__8"


    // $ANTLR start "rule__DegreeRequirement__Group__8__Impl"
    // InternalErasmusPrograms.g:4230:1: rule__DegreeRequirement__Group__8__Impl : ( '}' ) ;
    public final void rule__DegreeRequirement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4234:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:4235:1: ( '}' )
            {
            // InternalErasmusPrograms.g:4235:1: ( '}' )
            // InternalErasmusPrograms.g:4236:2: '}'
            {
             before(grammarAccess.getDegreeRequirementAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDegreeRequirementAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__Group__8__Impl"


    // $ANTLR start "rule__LanguageRequirement__Group__0"
    // InternalErasmusPrograms.g:4246:1: rule__LanguageRequirement__Group__0 : rule__LanguageRequirement__Group__0__Impl rule__LanguageRequirement__Group__1 ;
    public final void rule__LanguageRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4250:1: ( rule__LanguageRequirement__Group__0__Impl rule__LanguageRequirement__Group__1 )
            // InternalErasmusPrograms.g:4251:2: rule__LanguageRequirement__Group__0__Impl rule__LanguageRequirement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LanguageRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__0"


    // $ANTLR start "rule__LanguageRequirement__Group__0__Impl"
    // InternalErasmusPrograms.g:4258:1: rule__LanguageRequirement__Group__0__Impl : ( 'LanguageRequirement' ) ;
    public final void rule__LanguageRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4262:1: ( ( 'LanguageRequirement' ) )
            // InternalErasmusPrograms.g:4263:1: ( 'LanguageRequirement' )
            {
            // InternalErasmusPrograms.g:4263:1: ( 'LanguageRequirement' )
            // InternalErasmusPrograms.g:4264:2: 'LanguageRequirement'
            {
             before(grammarAccess.getLanguageRequirementAccess().getLanguageRequirementKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getLanguageRequirementAccess().getLanguageRequirementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__0__Impl"


    // $ANTLR start "rule__LanguageRequirement__Group__1"
    // InternalErasmusPrograms.g:4273:1: rule__LanguageRequirement__Group__1 : rule__LanguageRequirement__Group__1__Impl rule__LanguageRequirement__Group__2 ;
    public final void rule__LanguageRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4277:1: ( rule__LanguageRequirement__Group__1__Impl rule__LanguageRequirement__Group__2 )
            // InternalErasmusPrograms.g:4278:2: rule__LanguageRequirement__Group__1__Impl rule__LanguageRequirement__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__LanguageRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__1"


    // $ANTLR start "rule__LanguageRequirement__Group__1__Impl"
    // InternalErasmusPrograms.g:4285:1: rule__LanguageRequirement__Group__1__Impl : ( '{' ) ;
    public final void rule__LanguageRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4289:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:4290:1: ( '{' )
            {
            // InternalErasmusPrograms.g:4290:1: ( '{' )
            // InternalErasmusPrograms.g:4291:2: '{'
            {
             before(grammarAccess.getLanguageRequirementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLanguageRequirementAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__1__Impl"


    // $ANTLR start "rule__LanguageRequirement__Group__2"
    // InternalErasmusPrograms.g:4300:1: rule__LanguageRequirement__Group__2 : rule__LanguageRequirement__Group__2__Impl rule__LanguageRequirement__Group__3 ;
    public final void rule__LanguageRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4304:1: ( rule__LanguageRequirement__Group__2__Impl rule__LanguageRequirement__Group__3 )
            // InternalErasmusPrograms.g:4305:2: rule__LanguageRequirement__Group__2__Impl rule__LanguageRequirement__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__LanguageRequirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__2"


    // $ANTLR start "rule__LanguageRequirement__Group__2__Impl"
    // InternalErasmusPrograms.g:4312:1: rule__LanguageRequirement__Group__2__Impl : ( 'language' ) ;
    public final void rule__LanguageRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4316:1: ( ( 'language' ) )
            // InternalErasmusPrograms.g:4317:1: ( 'language' )
            {
            // InternalErasmusPrograms.g:4317:1: ( 'language' )
            // InternalErasmusPrograms.g:4318:2: 'language'
            {
             before(grammarAccess.getLanguageRequirementAccess().getLanguageKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getLanguageRequirementAccess().getLanguageKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__2__Impl"


    // $ANTLR start "rule__LanguageRequirement__Group__3"
    // InternalErasmusPrograms.g:4327:1: rule__LanguageRequirement__Group__3 : rule__LanguageRequirement__Group__3__Impl rule__LanguageRequirement__Group__4 ;
    public final void rule__LanguageRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4331:1: ( rule__LanguageRequirement__Group__3__Impl rule__LanguageRequirement__Group__4 )
            // InternalErasmusPrograms.g:4332:2: rule__LanguageRequirement__Group__3__Impl rule__LanguageRequirement__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__LanguageRequirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__3"


    // $ANTLR start "rule__LanguageRequirement__Group__3__Impl"
    // InternalErasmusPrograms.g:4339:1: rule__LanguageRequirement__Group__3__Impl : ( ( rule__LanguageRequirement__LanguageNameAssignment_3 ) ) ;
    public final void rule__LanguageRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4343:1: ( ( ( rule__LanguageRequirement__LanguageNameAssignment_3 ) ) )
            // InternalErasmusPrograms.g:4344:1: ( ( rule__LanguageRequirement__LanguageNameAssignment_3 ) )
            {
            // InternalErasmusPrograms.g:4344:1: ( ( rule__LanguageRequirement__LanguageNameAssignment_3 ) )
            // InternalErasmusPrograms.g:4345:2: ( rule__LanguageRequirement__LanguageNameAssignment_3 )
            {
             before(grammarAccess.getLanguageRequirementAccess().getLanguageNameAssignment_3()); 
            // InternalErasmusPrograms.g:4346:2: ( rule__LanguageRequirement__LanguageNameAssignment_3 )
            // InternalErasmusPrograms.g:4346:3: rule__LanguageRequirement__LanguageNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__LanguageNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLanguageRequirementAccess().getLanguageNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__3__Impl"


    // $ANTLR start "rule__LanguageRequirement__Group__4"
    // InternalErasmusPrograms.g:4354:1: rule__LanguageRequirement__Group__4 : rule__LanguageRequirement__Group__4__Impl rule__LanguageRequirement__Group__5 ;
    public final void rule__LanguageRequirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4358:1: ( rule__LanguageRequirement__Group__4__Impl rule__LanguageRequirement__Group__5 )
            // InternalErasmusPrograms.g:4359:2: rule__LanguageRequirement__Group__4__Impl rule__LanguageRequirement__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__LanguageRequirement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__4"


    // $ANTLR start "rule__LanguageRequirement__Group__4__Impl"
    // InternalErasmusPrograms.g:4366:1: rule__LanguageRequirement__Group__4__Impl : ( 'level' ) ;
    public final void rule__LanguageRequirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4370:1: ( ( 'level' ) )
            // InternalErasmusPrograms.g:4371:1: ( 'level' )
            {
            // InternalErasmusPrograms.g:4371:1: ( 'level' )
            // InternalErasmusPrograms.g:4372:2: 'level'
            {
             before(grammarAccess.getLanguageRequirementAccess().getLevelKeyword_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLanguageRequirementAccess().getLevelKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__4__Impl"


    // $ANTLR start "rule__LanguageRequirement__Group__5"
    // InternalErasmusPrograms.g:4381:1: rule__LanguageRequirement__Group__5 : rule__LanguageRequirement__Group__5__Impl rule__LanguageRequirement__Group__6 ;
    public final void rule__LanguageRequirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4385:1: ( rule__LanguageRequirement__Group__5__Impl rule__LanguageRequirement__Group__6 )
            // InternalErasmusPrograms.g:4386:2: rule__LanguageRequirement__Group__5__Impl rule__LanguageRequirement__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__LanguageRequirement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__5"


    // $ANTLR start "rule__LanguageRequirement__Group__5__Impl"
    // InternalErasmusPrograms.g:4393:1: rule__LanguageRequirement__Group__5__Impl : ( ( rule__LanguageRequirement__LevelAssignment_5 ) ) ;
    public final void rule__LanguageRequirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4397:1: ( ( ( rule__LanguageRequirement__LevelAssignment_5 ) ) )
            // InternalErasmusPrograms.g:4398:1: ( ( rule__LanguageRequirement__LevelAssignment_5 ) )
            {
            // InternalErasmusPrograms.g:4398:1: ( ( rule__LanguageRequirement__LevelAssignment_5 ) )
            // InternalErasmusPrograms.g:4399:2: ( rule__LanguageRequirement__LevelAssignment_5 )
            {
             before(grammarAccess.getLanguageRequirementAccess().getLevelAssignment_5()); 
            // InternalErasmusPrograms.g:4400:2: ( rule__LanguageRequirement__LevelAssignment_5 )
            // InternalErasmusPrograms.g:4400:3: rule__LanguageRequirement__LevelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__LevelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLanguageRequirementAccess().getLevelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__5__Impl"


    // $ANTLR start "rule__LanguageRequirement__Group__6"
    // InternalErasmusPrograms.g:4408:1: rule__LanguageRequirement__Group__6 : rule__LanguageRequirement__Group__6__Impl ;
    public final void rule__LanguageRequirement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4412:1: ( rule__LanguageRequirement__Group__6__Impl )
            // InternalErasmusPrograms.g:4413:2: rule__LanguageRequirement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageRequirement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__6"


    // $ANTLR start "rule__LanguageRequirement__Group__6__Impl"
    // InternalErasmusPrograms.g:4419:1: rule__LanguageRequirement__Group__6__Impl : ( '}' ) ;
    public final void rule__LanguageRequirement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4423:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:4424:1: ( '}' )
            {
            // InternalErasmusPrograms.g:4424:1: ( '}' )
            // InternalErasmusPrograms.g:4425:2: '}'
            {
             before(grammarAccess.getLanguageRequirementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLanguageRequirementAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__Group__6__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group__0"
    // InternalErasmusPrograms.g:4435:1: rule__ApplicationProcess__Group__0 : rule__ApplicationProcess__Group__0__Impl rule__ApplicationProcess__Group__1 ;
    public final void rule__ApplicationProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4439:1: ( rule__ApplicationProcess__Group__0__Impl rule__ApplicationProcess__Group__1 )
            // InternalErasmusPrograms.g:4440:2: rule__ApplicationProcess__Group__0__Impl rule__ApplicationProcess__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ApplicationProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group__0"


    // $ANTLR start "rule__ApplicationProcess__Group__0__Impl"
    // InternalErasmusPrograms.g:4447:1: rule__ApplicationProcess__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4451:1: ( ( () ) )
            // InternalErasmusPrograms.g:4452:1: ( () )
            {
            // InternalErasmusPrograms.g:4452:1: ( () )
            // InternalErasmusPrograms.g:4453:2: ()
            {
             before(grammarAccess.getApplicationProcessAccess().getApplicationProcessAction_0()); 
            // InternalErasmusPrograms.g:4454:2: ()
            // InternalErasmusPrograms.g:4454:3: 
            {
            }

             after(grammarAccess.getApplicationProcessAccess().getApplicationProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group__0__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group__1"
    // InternalErasmusPrograms.g:4462:1: rule__ApplicationProcess__Group__1 : rule__ApplicationProcess__Group__1__Impl rule__ApplicationProcess__Group__2 ;
    public final void rule__ApplicationProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4466:1: ( rule__ApplicationProcess__Group__1__Impl rule__ApplicationProcess__Group__2 )
            // InternalErasmusPrograms.g:4467:2: rule__ApplicationProcess__Group__1__Impl rule__ApplicationProcess__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ApplicationProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group__1"


    // $ANTLR start "rule__ApplicationProcess__Group__1__Impl"
    // InternalErasmusPrograms.g:4474:1: rule__ApplicationProcess__Group__1__Impl : ( '{' ) ;
    public final void rule__ApplicationProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4478:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:4479:1: ( '{' )
            {
            // InternalErasmusPrograms.g:4479:1: ( '{' )
            // InternalErasmusPrograms.g:4480:2: '{'
            {
             before(grammarAccess.getApplicationProcessAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getApplicationProcessAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group__1__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group__2"
    // InternalErasmusPrograms.g:4489:1: rule__ApplicationProcess__Group__2 : rule__ApplicationProcess__Group__2__Impl rule__ApplicationProcess__Group__3 ;
    public final void rule__ApplicationProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4493:1: ( rule__ApplicationProcess__Group__2__Impl rule__ApplicationProcess__Group__3 )
            // InternalErasmusPrograms.g:4494:2: rule__ApplicationProcess__Group__2__Impl rule__ApplicationProcess__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__ApplicationProcess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group__2"


    // $ANTLR start "rule__ApplicationProcess__Group__2__Impl"
    // InternalErasmusPrograms.g:4501:1: rule__ApplicationProcess__Group__2__Impl : ( ( rule__ApplicationProcess__Group_2__0 )? ) ;
    public final void rule__ApplicationProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4505:1: ( ( ( rule__ApplicationProcess__Group_2__0 )? ) )
            // InternalErasmusPrograms.g:4506:1: ( ( rule__ApplicationProcess__Group_2__0 )? )
            {
            // InternalErasmusPrograms.g:4506:1: ( ( rule__ApplicationProcess__Group_2__0 )? )
            // InternalErasmusPrograms.g:4507:2: ( rule__ApplicationProcess__Group_2__0 )?
            {
             before(grammarAccess.getApplicationProcessAccess().getGroup_2()); 
            // InternalErasmusPrograms.g:4508:2: ( rule__ApplicationProcess__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==64) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalErasmusPrograms.g:4508:3: rule__ApplicationProcess__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationProcess__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationProcessAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group__2__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group__3"
    // InternalErasmusPrograms.g:4516:1: rule__ApplicationProcess__Group__3 : rule__ApplicationProcess__Group__3__Impl ;
    public final void rule__ApplicationProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4520:1: ( rule__ApplicationProcess__Group__3__Impl )
            // InternalErasmusPrograms.g:4521:2: rule__ApplicationProcess__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group__3"


    // $ANTLR start "rule__ApplicationProcess__Group__3__Impl"
    // InternalErasmusPrograms.g:4527:1: rule__ApplicationProcess__Group__3__Impl : ( '}' ) ;
    public final void rule__ApplicationProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4531:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:4532:1: ( '}' )
            {
            // InternalErasmusPrograms.g:4532:1: ( '}' )
            // InternalErasmusPrograms.g:4533:2: '}'
            {
             before(grammarAccess.getApplicationProcessAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getApplicationProcessAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group__3__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group_2__0"
    // InternalErasmusPrograms.g:4543:1: rule__ApplicationProcess__Group_2__0 : rule__ApplicationProcess__Group_2__0__Impl rule__ApplicationProcess__Group_2__1 ;
    public final void rule__ApplicationProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4547:1: ( rule__ApplicationProcess__Group_2__0__Impl rule__ApplicationProcess__Group_2__1 )
            // InternalErasmusPrograms.g:4548:2: rule__ApplicationProcess__Group_2__0__Impl rule__ApplicationProcess__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ApplicationProcess__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__0"


    // $ANTLR start "rule__ApplicationProcess__Group_2__0__Impl"
    // InternalErasmusPrograms.g:4555:1: rule__ApplicationProcess__Group_2__0__Impl : ( 'steps' ) ;
    public final void rule__ApplicationProcess__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4559:1: ( ( 'steps' ) )
            // InternalErasmusPrograms.g:4560:1: ( 'steps' )
            {
            // InternalErasmusPrograms.g:4560:1: ( 'steps' )
            // InternalErasmusPrograms.g:4561:2: 'steps'
            {
             before(grammarAccess.getApplicationProcessAccess().getStepsKeyword_2_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getApplicationProcessAccess().getStepsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__0__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group_2__1"
    // InternalErasmusPrograms.g:4570:1: rule__ApplicationProcess__Group_2__1 : rule__ApplicationProcess__Group_2__1__Impl rule__ApplicationProcess__Group_2__2 ;
    public final void rule__ApplicationProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4574:1: ( rule__ApplicationProcess__Group_2__1__Impl rule__ApplicationProcess__Group_2__2 )
            // InternalErasmusPrograms.g:4575:2: rule__ApplicationProcess__Group_2__1__Impl rule__ApplicationProcess__Group_2__2
            {
            pushFollow(FOLLOW_44);
            rule__ApplicationProcess__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__1"


    // $ANTLR start "rule__ApplicationProcess__Group_2__1__Impl"
    // InternalErasmusPrograms.g:4582:1: rule__ApplicationProcess__Group_2__1__Impl : ( '{' ) ;
    public final void rule__ApplicationProcess__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4586:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:4587:1: ( '{' )
            {
            // InternalErasmusPrograms.g:4587:1: ( '{' )
            // InternalErasmusPrograms.g:4588:2: '{'
            {
             before(grammarAccess.getApplicationProcessAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getApplicationProcessAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__1__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group_2__2"
    // InternalErasmusPrograms.g:4597:1: rule__ApplicationProcess__Group_2__2 : rule__ApplicationProcess__Group_2__2__Impl rule__ApplicationProcess__Group_2__3 ;
    public final void rule__ApplicationProcess__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4601:1: ( rule__ApplicationProcess__Group_2__2__Impl rule__ApplicationProcess__Group_2__3 )
            // InternalErasmusPrograms.g:4602:2: rule__ApplicationProcess__Group_2__2__Impl rule__ApplicationProcess__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__ApplicationProcess__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__2"


    // $ANTLR start "rule__ApplicationProcess__Group_2__2__Impl"
    // InternalErasmusPrograms.g:4609:1: rule__ApplicationProcess__Group_2__2__Impl : ( ( rule__ApplicationProcess__StepsAssignment_2_2 ) ) ;
    public final void rule__ApplicationProcess__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4613:1: ( ( ( rule__ApplicationProcess__StepsAssignment_2_2 ) ) )
            // InternalErasmusPrograms.g:4614:1: ( ( rule__ApplicationProcess__StepsAssignment_2_2 ) )
            {
            // InternalErasmusPrograms.g:4614:1: ( ( rule__ApplicationProcess__StepsAssignment_2_2 ) )
            // InternalErasmusPrograms.g:4615:2: ( rule__ApplicationProcess__StepsAssignment_2_2 )
            {
             before(grammarAccess.getApplicationProcessAccess().getStepsAssignment_2_2()); 
            // InternalErasmusPrograms.g:4616:2: ( rule__ApplicationProcess__StepsAssignment_2_2 )
            // InternalErasmusPrograms.g:4616:3: rule__ApplicationProcess__StepsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__StepsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationProcessAccess().getStepsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__2__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group_2__3"
    // InternalErasmusPrograms.g:4624:1: rule__ApplicationProcess__Group_2__3 : rule__ApplicationProcess__Group_2__3__Impl rule__ApplicationProcess__Group_2__4 ;
    public final void rule__ApplicationProcess__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4628:1: ( rule__ApplicationProcess__Group_2__3__Impl rule__ApplicationProcess__Group_2__4 )
            // InternalErasmusPrograms.g:4629:2: rule__ApplicationProcess__Group_2__3__Impl rule__ApplicationProcess__Group_2__4
            {
            pushFollow(FOLLOW_10);
            rule__ApplicationProcess__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__3"


    // $ANTLR start "rule__ApplicationProcess__Group_2__3__Impl"
    // InternalErasmusPrograms.g:4636:1: rule__ApplicationProcess__Group_2__3__Impl : ( ( rule__ApplicationProcess__Group_2_3__0 )* ) ;
    public final void rule__ApplicationProcess__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4640:1: ( ( ( rule__ApplicationProcess__Group_2_3__0 )* ) )
            // InternalErasmusPrograms.g:4641:1: ( ( rule__ApplicationProcess__Group_2_3__0 )* )
            {
            // InternalErasmusPrograms.g:4641:1: ( ( rule__ApplicationProcess__Group_2_3__0 )* )
            // InternalErasmusPrograms.g:4642:2: ( rule__ApplicationProcess__Group_2_3__0 )*
            {
             before(grammarAccess.getApplicationProcessAccess().getGroup_2_3()); 
            // InternalErasmusPrograms.g:4643:2: ( rule__ApplicationProcess__Group_2_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalErasmusPrograms.g:4643:3: rule__ApplicationProcess__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ApplicationProcess__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getApplicationProcessAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__3__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group_2__4"
    // InternalErasmusPrograms.g:4651:1: rule__ApplicationProcess__Group_2__4 : rule__ApplicationProcess__Group_2__4__Impl ;
    public final void rule__ApplicationProcess__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4655:1: ( rule__ApplicationProcess__Group_2__4__Impl )
            // InternalErasmusPrograms.g:4656:2: rule__ApplicationProcess__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__4"


    // $ANTLR start "rule__ApplicationProcess__Group_2__4__Impl"
    // InternalErasmusPrograms.g:4662:1: rule__ApplicationProcess__Group_2__4__Impl : ( '}' ) ;
    public final void rule__ApplicationProcess__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4666:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:4667:1: ( '}' )
            {
            // InternalErasmusPrograms.g:4667:1: ( '}' )
            // InternalErasmusPrograms.g:4668:2: '}'
            {
             before(grammarAccess.getApplicationProcessAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getApplicationProcessAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2__4__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group_2_3__0"
    // InternalErasmusPrograms.g:4678:1: rule__ApplicationProcess__Group_2_3__0 : rule__ApplicationProcess__Group_2_3__0__Impl rule__ApplicationProcess__Group_2_3__1 ;
    public final void rule__ApplicationProcess__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4682:1: ( rule__ApplicationProcess__Group_2_3__0__Impl rule__ApplicationProcess__Group_2_3__1 )
            // InternalErasmusPrograms.g:4683:2: rule__ApplicationProcess__Group_2_3__0__Impl rule__ApplicationProcess__Group_2_3__1
            {
            pushFollow(FOLLOW_44);
            rule__ApplicationProcess__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2_3__0"


    // $ANTLR start "rule__ApplicationProcess__Group_2_3__0__Impl"
    // InternalErasmusPrograms.g:4690:1: rule__ApplicationProcess__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__ApplicationProcess__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4694:1: ( ( ',' ) )
            // InternalErasmusPrograms.g:4695:1: ( ',' )
            {
            // InternalErasmusPrograms.g:4695:1: ( ',' )
            // InternalErasmusPrograms.g:4696:2: ','
            {
             before(grammarAccess.getApplicationProcessAccess().getCommaKeyword_2_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getApplicationProcessAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2_3__0__Impl"


    // $ANTLR start "rule__ApplicationProcess__Group_2_3__1"
    // InternalErasmusPrograms.g:4705:1: rule__ApplicationProcess__Group_2_3__1 : rule__ApplicationProcess__Group_2_3__1__Impl ;
    public final void rule__ApplicationProcess__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4709:1: ( rule__ApplicationProcess__Group_2_3__1__Impl )
            // InternalErasmusPrograms.g:4710:2: rule__ApplicationProcess__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2_3__1"


    // $ANTLR start "rule__ApplicationProcess__Group_2_3__1__Impl"
    // InternalErasmusPrograms.g:4716:1: rule__ApplicationProcess__Group_2_3__1__Impl : ( ( rule__ApplicationProcess__StepsAssignment_2_3_1 ) ) ;
    public final void rule__ApplicationProcess__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4720:1: ( ( ( rule__ApplicationProcess__StepsAssignment_2_3_1 ) ) )
            // InternalErasmusPrograms.g:4721:1: ( ( rule__ApplicationProcess__StepsAssignment_2_3_1 ) )
            {
            // InternalErasmusPrograms.g:4721:1: ( ( rule__ApplicationProcess__StepsAssignment_2_3_1 ) )
            // InternalErasmusPrograms.g:4722:2: ( rule__ApplicationProcess__StepsAssignment_2_3_1 )
            {
             before(grammarAccess.getApplicationProcessAccess().getStepsAssignment_2_3_1()); 
            // InternalErasmusPrograms.g:4723:2: ( rule__ApplicationProcess__StepsAssignment_2_3_1 )
            // InternalErasmusPrograms.g:4723:3: rule__ApplicationProcess__StepsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationProcess__StepsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationProcessAccess().getStepsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__Group_2_3__1__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalErasmusPrograms.g:4732:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4736:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalErasmusPrograms.g:4737:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // InternalErasmusPrograms.g:4744:1: rule__Step__Group__0__Impl : ( 'Step' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4748:1: ( ( 'Step' ) )
            // InternalErasmusPrograms.g:4749:1: ( 'Step' )
            {
            // InternalErasmusPrograms.g:4749:1: ( 'Step' )
            // InternalErasmusPrograms.g:4750:2: 'Step'
            {
             before(grammarAccess.getStepAccess().getStepKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // InternalErasmusPrograms.g:4759:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4763:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalErasmusPrograms.g:4764:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // InternalErasmusPrograms.g:4771:1: rule__Step__Group__1__Impl : ( ( rule__Step__StepNameAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4775:1: ( ( ( rule__Step__StepNameAssignment_1 ) ) )
            // InternalErasmusPrograms.g:4776:1: ( ( rule__Step__StepNameAssignment_1 ) )
            {
            // InternalErasmusPrograms.g:4776:1: ( ( rule__Step__StepNameAssignment_1 ) )
            // InternalErasmusPrograms.g:4777:2: ( rule__Step__StepNameAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getStepNameAssignment_1()); 
            // InternalErasmusPrograms.g:4778:2: ( rule__Step__StepNameAssignment_1 )
            // InternalErasmusPrograms.g:4778:3: rule__Step__StepNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__StepNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getStepNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // InternalErasmusPrograms.g:4786:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4790:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalErasmusPrograms.g:4791:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // InternalErasmusPrograms.g:4798:1: rule__Step__Group__2__Impl : ( '{' ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4802:1: ( ( '{' ) )
            // InternalErasmusPrograms.g:4803:1: ( '{' )
            {
            // InternalErasmusPrograms.g:4803:1: ( '{' )
            // InternalErasmusPrograms.g:4804:2: '{'
            {
             before(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // InternalErasmusPrograms.g:4813:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4817:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalErasmusPrograms.g:4818:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Step__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // InternalErasmusPrograms.g:4825:1: rule__Step__Group__3__Impl : ( 'description' ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4829:1: ( ( 'description' ) )
            // InternalErasmusPrograms.g:4830:1: ( 'description' )
            {
            // InternalErasmusPrograms.g:4830:1: ( 'description' )
            // InternalErasmusPrograms.g:4831:2: 'description'
            {
             before(grammarAccess.getStepAccess().getDescriptionKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__Step__Group__4"
    // InternalErasmusPrograms.g:4840:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4844:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalErasmusPrograms.g:4845:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__Step__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4"


    // $ANTLR start "rule__Step__Group__4__Impl"
    // InternalErasmusPrograms.g:4852:1: rule__Step__Group__4__Impl : ( ( rule__Step__StepDescriptionAssignment_4 ) ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4856:1: ( ( ( rule__Step__StepDescriptionAssignment_4 ) ) )
            // InternalErasmusPrograms.g:4857:1: ( ( rule__Step__StepDescriptionAssignment_4 ) )
            {
            // InternalErasmusPrograms.g:4857:1: ( ( rule__Step__StepDescriptionAssignment_4 ) )
            // InternalErasmusPrograms.g:4858:2: ( rule__Step__StepDescriptionAssignment_4 )
            {
             before(grammarAccess.getStepAccess().getStepDescriptionAssignment_4()); 
            // InternalErasmusPrograms.g:4859:2: ( rule__Step__StepDescriptionAssignment_4 )
            // InternalErasmusPrograms.g:4859:3: rule__Step__StepDescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Step__StepDescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getStepDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4__Impl"


    // $ANTLR start "rule__Step__Group__5"
    // InternalErasmusPrograms.g:4867:1: rule__Step__Group__5 : rule__Step__Group__5__Impl rule__Step__Group__6 ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4871:1: ( rule__Step__Group__5__Impl rule__Step__Group__6 )
            // InternalErasmusPrograms.g:4872:2: rule__Step__Group__5__Impl rule__Step__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__Step__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5"


    // $ANTLR start "rule__Step__Group__5__Impl"
    // InternalErasmusPrograms.g:4879:1: rule__Step__Group__5__Impl : ( 'startDate' ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4883:1: ( ( 'startDate' ) )
            // InternalErasmusPrograms.g:4884:1: ( 'startDate' )
            {
            // InternalErasmusPrograms.g:4884:1: ( 'startDate' )
            // InternalErasmusPrograms.g:4885:2: 'startDate'
            {
             before(grammarAccess.getStepAccess().getStartDateKeyword_5()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getStartDateKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5__Impl"


    // $ANTLR start "rule__Step__Group__6"
    // InternalErasmusPrograms.g:4894:1: rule__Step__Group__6 : rule__Step__Group__6__Impl rule__Step__Group__7 ;
    public final void rule__Step__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4898:1: ( rule__Step__Group__6__Impl rule__Step__Group__7 )
            // InternalErasmusPrograms.g:4899:2: rule__Step__Group__6__Impl rule__Step__Group__7
            {
            pushFollow(FOLLOW_47);
            rule__Step__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__6"


    // $ANTLR start "rule__Step__Group__6__Impl"
    // InternalErasmusPrograms.g:4906:1: rule__Step__Group__6__Impl : ( ( rule__Step__StartDateAssignment_6 ) ) ;
    public final void rule__Step__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4910:1: ( ( ( rule__Step__StartDateAssignment_6 ) ) )
            // InternalErasmusPrograms.g:4911:1: ( ( rule__Step__StartDateAssignment_6 ) )
            {
            // InternalErasmusPrograms.g:4911:1: ( ( rule__Step__StartDateAssignment_6 ) )
            // InternalErasmusPrograms.g:4912:2: ( rule__Step__StartDateAssignment_6 )
            {
             before(grammarAccess.getStepAccess().getStartDateAssignment_6()); 
            // InternalErasmusPrograms.g:4913:2: ( rule__Step__StartDateAssignment_6 )
            // InternalErasmusPrograms.g:4913:3: rule__Step__StartDateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Step__StartDateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getStartDateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__6__Impl"


    // $ANTLR start "rule__Step__Group__7"
    // InternalErasmusPrograms.g:4921:1: rule__Step__Group__7 : rule__Step__Group__7__Impl rule__Step__Group__8 ;
    public final void rule__Step__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4925:1: ( rule__Step__Group__7__Impl rule__Step__Group__8 )
            // InternalErasmusPrograms.g:4926:2: rule__Step__Group__7__Impl rule__Step__Group__8
            {
            pushFollow(FOLLOW_46);
            rule__Step__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__7"


    // $ANTLR start "rule__Step__Group__7__Impl"
    // InternalErasmusPrograms.g:4933:1: rule__Step__Group__7__Impl : ( 'endDate' ) ;
    public final void rule__Step__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4937:1: ( ( 'endDate' ) )
            // InternalErasmusPrograms.g:4938:1: ( 'endDate' )
            {
            // InternalErasmusPrograms.g:4938:1: ( 'endDate' )
            // InternalErasmusPrograms.g:4939:2: 'endDate'
            {
             before(grammarAccess.getStepAccess().getEndDateKeyword_7()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getEndDateKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__7__Impl"


    // $ANTLR start "rule__Step__Group__8"
    // InternalErasmusPrograms.g:4948:1: rule__Step__Group__8 : rule__Step__Group__8__Impl rule__Step__Group__9 ;
    public final void rule__Step__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4952:1: ( rule__Step__Group__8__Impl rule__Step__Group__9 )
            // InternalErasmusPrograms.g:4953:2: rule__Step__Group__8__Impl rule__Step__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Step__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__8"


    // $ANTLR start "rule__Step__Group__8__Impl"
    // InternalErasmusPrograms.g:4960:1: rule__Step__Group__8__Impl : ( ( rule__Step__EndDateAssignment_8 ) ) ;
    public final void rule__Step__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4964:1: ( ( ( rule__Step__EndDateAssignment_8 ) ) )
            // InternalErasmusPrograms.g:4965:1: ( ( rule__Step__EndDateAssignment_8 ) )
            {
            // InternalErasmusPrograms.g:4965:1: ( ( rule__Step__EndDateAssignment_8 ) )
            // InternalErasmusPrograms.g:4966:2: ( rule__Step__EndDateAssignment_8 )
            {
             before(grammarAccess.getStepAccess().getEndDateAssignment_8()); 
            // InternalErasmusPrograms.g:4967:2: ( rule__Step__EndDateAssignment_8 )
            // InternalErasmusPrograms.g:4967:3: rule__Step__EndDateAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Step__EndDateAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getEndDateAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__8__Impl"


    // $ANTLR start "rule__Step__Group__9"
    // InternalErasmusPrograms.g:4975:1: rule__Step__Group__9 : rule__Step__Group__9__Impl ;
    public final void rule__Step__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4979:1: ( rule__Step__Group__9__Impl )
            // InternalErasmusPrograms.g:4980:2: rule__Step__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__9"


    // $ANTLR start "rule__Step__Group__9__Impl"
    // InternalErasmusPrograms.g:4986:1: rule__Step__Group__9__Impl : ( '}' ) ;
    public final void rule__Step__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:4990:1: ( ( '}' ) )
            // InternalErasmusPrograms.g:4991:1: ( '}' )
            {
            // InternalErasmusPrograms.g:4991:1: ( '}' )
            // InternalErasmusPrograms.g:4992:2: '}'
            {
             before(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__9__Impl"


    // $ANTLR start "rule__ErasmusProgram__NameAssignment_1"
    // InternalErasmusPrograms.g:5002:1: rule__ErasmusProgram__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ErasmusProgram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5006:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5007:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5007:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5008:3: RULE_STRING
            {
             before(grammarAccess.getErasmusProgramAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__NameAssignment_1"


    // $ANTLR start "rule__ErasmusProgram__TotalCreditsAssignment_4"
    // InternalErasmusPrograms.g:5017:1: rule__ErasmusProgram__TotalCreditsAssignment_4 : ( RULE_INT ) ;
    public final void rule__ErasmusProgram__TotalCreditsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5021:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5022:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5022:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5023:3: RULE_INT
            {
             before(grammarAccess.getErasmusProgramAccess().getTotalCreditsINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getErasmusProgramAccess().getTotalCreditsINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__TotalCreditsAssignment_4"


    // $ANTLR start "rule__ErasmusProgram__UniversitiesAssignment_5_2"
    // InternalErasmusPrograms.g:5032:1: rule__ErasmusProgram__UniversitiesAssignment_5_2 : ( ruleUniversity ) ;
    public final void rule__ErasmusProgram__UniversitiesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5036:1: ( ( ruleUniversity ) )
            // InternalErasmusPrograms.g:5037:2: ( ruleUniversity )
            {
            // InternalErasmusPrograms.g:5037:2: ( ruleUniversity )
            // InternalErasmusPrograms.g:5038:3: ruleUniversity
            {
             before(grammarAccess.getErasmusProgramAccess().getUniversitiesUniversityParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUniversity();

            state._fsp--;

             after(grammarAccess.getErasmusProgramAccess().getUniversitiesUniversityParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__UniversitiesAssignment_5_2"


    // $ANTLR start "rule__ErasmusProgram__UniversitiesAssignment_5_3_1"
    // InternalErasmusPrograms.g:5047:1: rule__ErasmusProgram__UniversitiesAssignment_5_3_1 : ( ruleUniversity ) ;
    public final void rule__ErasmusProgram__UniversitiesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5051:1: ( ( ruleUniversity ) )
            // InternalErasmusPrograms.g:5052:2: ( ruleUniversity )
            {
            // InternalErasmusPrograms.g:5052:2: ( ruleUniversity )
            // InternalErasmusPrograms.g:5053:3: ruleUniversity
            {
             before(grammarAccess.getErasmusProgramAccess().getUniversitiesUniversityParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUniversity();

            state._fsp--;

             after(grammarAccess.getErasmusProgramAccess().getUniversitiesUniversityParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__UniversitiesAssignment_5_3_1"


    // $ANTLR start "rule__ErasmusProgram__ScholarshipsAssignment_6_2"
    // InternalErasmusPrograms.g:5062:1: rule__ErasmusProgram__ScholarshipsAssignment_6_2 : ( ruleScholarship ) ;
    public final void rule__ErasmusProgram__ScholarshipsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5066:1: ( ( ruleScholarship ) )
            // InternalErasmusPrograms.g:5067:2: ( ruleScholarship )
            {
            // InternalErasmusPrograms.g:5067:2: ( ruleScholarship )
            // InternalErasmusPrograms.g:5068:3: ruleScholarship
            {
             before(grammarAccess.getErasmusProgramAccess().getScholarshipsScholarshipParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleScholarship();

            state._fsp--;

             after(grammarAccess.getErasmusProgramAccess().getScholarshipsScholarshipParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__ScholarshipsAssignment_6_2"


    // $ANTLR start "rule__ErasmusProgram__ScholarshipsAssignment_6_3_1"
    // InternalErasmusPrograms.g:5077:1: rule__ErasmusProgram__ScholarshipsAssignment_6_3_1 : ( ruleScholarship ) ;
    public final void rule__ErasmusProgram__ScholarshipsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5081:1: ( ( ruleScholarship ) )
            // InternalErasmusPrograms.g:5082:2: ( ruleScholarship )
            {
            // InternalErasmusPrograms.g:5082:2: ( ruleScholarship )
            // InternalErasmusPrograms.g:5083:3: ruleScholarship
            {
             before(grammarAccess.getErasmusProgramAccess().getScholarshipsScholarshipParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScholarship();

            state._fsp--;

             after(grammarAccess.getErasmusProgramAccess().getScholarshipsScholarshipParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__ScholarshipsAssignment_6_3_1"


    // $ANTLR start "rule__ErasmusProgram__AssociatePartnersAssignment_7_2"
    // InternalErasmusPrograms.g:5092:1: rule__ErasmusProgram__AssociatePartnersAssignment_7_2 : ( ruleAssociatePartner ) ;
    public final void rule__ErasmusProgram__AssociatePartnersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5096:1: ( ( ruleAssociatePartner ) )
            // InternalErasmusPrograms.g:5097:2: ( ruleAssociatePartner )
            {
            // InternalErasmusPrograms.g:5097:2: ( ruleAssociatePartner )
            // InternalErasmusPrograms.g:5098:3: ruleAssociatePartner
            {
             before(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssociatePartnerParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociatePartner();

            state._fsp--;

             after(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssociatePartnerParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__AssociatePartnersAssignment_7_2"


    // $ANTLR start "rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1"
    // InternalErasmusPrograms.g:5107:1: rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1 : ( ruleAssociatePartner ) ;
    public final void rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5111:1: ( ( ruleAssociatePartner ) )
            // InternalErasmusPrograms.g:5112:2: ( ruleAssociatePartner )
            {
            // InternalErasmusPrograms.g:5112:2: ( ruleAssociatePartner )
            // InternalErasmusPrograms.g:5113:3: ruleAssociatePartner
            {
             before(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssociatePartnerParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociatePartner();

            state._fsp--;

             after(grammarAccess.getErasmusProgramAccess().getAssociatePartnersAssociatePartnerParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__AssociatePartnersAssignment_7_3_1"


    // $ANTLR start "rule__ErasmusProgram__AdmissionStructureAssignment_9"
    // InternalErasmusPrograms.g:5122:1: rule__ErasmusProgram__AdmissionStructureAssignment_9 : ( ruleAdmissionStructure ) ;
    public final void rule__ErasmusProgram__AdmissionStructureAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5126:1: ( ( ruleAdmissionStructure ) )
            // InternalErasmusPrograms.g:5127:2: ( ruleAdmissionStructure )
            {
            // InternalErasmusPrograms.g:5127:2: ( ruleAdmissionStructure )
            // InternalErasmusPrograms.g:5128:3: ruleAdmissionStructure
            {
             before(grammarAccess.getErasmusProgramAccess().getAdmissionStructureAdmissionStructureParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAdmissionStructure();

            state._fsp--;

             after(grammarAccess.getErasmusProgramAccess().getAdmissionStructureAdmissionStructureParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErasmusProgram__AdmissionStructureAssignment_9"


    // $ANTLR start "rule__Scholarship__TypeAssignment_0"
    // InternalErasmusPrograms.g:5137:1: rule__Scholarship__TypeAssignment_0 : ( ruleScholarshipType ) ;
    public final void rule__Scholarship__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5141:1: ( ( ruleScholarshipType ) )
            // InternalErasmusPrograms.g:5142:2: ( ruleScholarshipType )
            {
            // InternalErasmusPrograms.g:5142:2: ( ruleScholarshipType )
            // InternalErasmusPrograms.g:5143:3: ruleScholarshipType
            {
             before(grammarAccess.getScholarshipAccess().getTypeScholarshipTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleScholarshipType();

            state._fsp--;

             after(grammarAccess.getScholarshipAccess().getTypeScholarshipTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__TypeAssignment_0"


    // $ANTLR start "rule__Scholarship__TuitionFeeAssignment_3"
    // InternalErasmusPrograms.g:5152:1: rule__Scholarship__TuitionFeeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Scholarship__TuitionFeeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5156:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5157:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5157:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5158:3: RULE_INT
            {
             before(grammarAccess.getScholarshipAccess().getTuitionFeeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScholarshipAccess().getTuitionFeeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__TuitionFeeAssignment_3"


    // $ANTLR start "rule__Scholarship__TravelGrantAssignment_5"
    // InternalErasmusPrograms.g:5167:1: rule__Scholarship__TravelGrantAssignment_5 : ( RULE_INT ) ;
    public final void rule__Scholarship__TravelGrantAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5171:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5172:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5172:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5173:3: RULE_INT
            {
             before(grammarAccess.getScholarshipAccess().getTravelGrantINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScholarshipAccess().getTravelGrantINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__TravelGrantAssignment_5"


    // $ANTLR start "rule__Scholarship__AllowanceAssignment_7"
    // InternalErasmusPrograms.g:5182:1: rule__Scholarship__AllowanceAssignment_7 : ( RULE_INT ) ;
    public final void rule__Scholarship__AllowanceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5186:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5187:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5187:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5188:3: RULE_INT
            {
             before(grammarAccess.getScholarshipAccess().getAllowanceINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScholarshipAccess().getAllowanceINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scholarship__AllowanceAssignment_7"


    // $ANTLR start "rule__University__UniversityNameAssignment_1"
    // InternalErasmusPrograms.g:5197:1: rule__University__UniversityNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__University__UniversityNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5201:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5202:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5202:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5203:3: RULE_STRING
            {
             before(grammarAccess.getUniversityAccess().getUniversityNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getUniversityNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__UniversityNameAssignment_1"


    // $ANTLR start "rule__University__LocationAssignment_4"
    // InternalErasmusPrograms.g:5212:1: rule__University__LocationAssignment_4 : ( ruleLocation ) ;
    public final void rule__University__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5216:1: ( ( ruleLocation ) )
            // InternalErasmusPrograms.g:5217:2: ( ruleLocation )
            {
            // InternalErasmusPrograms.g:5217:2: ( ruleLocation )
            // InternalErasmusPrograms.g:5218:3: ruleLocation
            {
             before(grammarAccess.getUniversityAccess().getLocationLocationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getLocationLocationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__LocationAssignment_4"


    // $ANTLR start "rule__University__CreditsAssignment_6"
    // InternalErasmusPrograms.g:5227:1: rule__University__CreditsAssignment_6 : ( RULE_INT ) ;
    public final void rule__University__CreditsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5231:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5232:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5232:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5233:3: RULE_INT
            {
             before(grammarAccess.getUniversityAccess().getCreditsINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCreditsINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__CreditsAssignment_6"


    // $ANTLR start "rule__University__CoursesAssignment_7_2"
    // InternalErasmusPrograms.g:5242:1: rule__University__CoursesAssignment_7_2 : ( ruleCourse ) ;
    public final void rule__University__CoursesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5246:1: ( ( ruleCourse ) )
            // InternalErasmusPrograms.g:5247:2: ( ruleCourse )
            {
            // InternalErasmusPrograms.g:5247:2: ( ruleCourse )
            // InternalErasmusPrograms.g:5248:3: ruleCourse
            {
             before(grammarAccess.getUniversityAccess().getCoursesCourseParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getCoursesCourseParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__CoursesAssignment_7_2"


    // $ANTLR start "rule__University__CoursesAssignment_7_3_1"
    // InternalErasmusPrograms.g:5257:1: rule__University__CoursesAssignment_7_3_1 : ( ruleCourse ) ;
    public final void rule__University__CoursesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5261:1: ( ( ruleCourse ) )
            // InternalErasmusPrograms.g:5262:2: ( ruleCourse )
            {
            // InternalErasmusPrograms.g:5262:2: ( ruleCourse )
            // InternalErasmusPrograms.g:5263:3: ruleCourse
            {
             before(grammarAccess.getUniversityAccess().getCoursesCourseParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getCoursesCourseParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__CoursesAssignment_7_3_1"


    // $ANTLR start "rule__Course__CourseCodeAssignment_3"
    // InternalErasmusPrograms.g:5272:1: rule__Course__CourseCodeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Course__CourseCodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5276:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5277:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5277:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5278:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getCourseCodeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseCodeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__CourseCodeAssignment_3"


    // $ANTLR start "rule__Course__CourseNameAssignment_6"
    // InternalErasmusPrograms.g:5287:1: rule__Course__CourseNameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Course__CourseNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5291:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5292:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5292:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5293:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getCourseNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseNameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__CourseNameAssignment_6"


    // $ANTLR start "rule__Course__FacultyAssignment_9"
    // InternalErasmusPrograms.g:5302:1: rule__Course__FacultyAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Course__FacultyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5306:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5307:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5307:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5308:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getFacultySTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getFacultySTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__FacultyAssignment_9"


    // $ANTLR start "rule__Course__CourseCreditsAssignment_12"
    // InternalErasmusPrograms.g:5317:1: rule__Course__CourseCreditsAssignment_12 : ( RULE_INT ) ;
    public final void rule__Course__CourseCreditsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5321:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5322:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5322:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5323:3: RULE_INT
            {
             before(grammarAccess.getCourseAccess().getCourseCreditsINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseCreditsINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__CourseCreditsAssignment_12"


    // $ANTLR start "rule__Location__CountryNameAssignment_3"
    // InternalErasmusPrograms.g:5332:1: rule__Location__CountryNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Location__CountryNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5336:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5337:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5337:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5338:3: RULE_STRING
            {
             before(grammarAccess.getLocationAccess().getCountryNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getCountryNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__CountryNameAssignment_3"


    // $ANTLR start "rule__Location__CityNameAssignment_6"
    // InternalErasmusPrograms.g:5347:1: rule__Location__CityNameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Location__CityNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5351:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5352:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5352:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5353:3: RULE_STRING
            {
             before(grammarAccess.getLocationAccess().getCityNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getCityNameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__CityNameAssignment_6"


    // $ANTLR start "rule__AssociatePartner__PartnerNameAssignment_0"
    // InternalErasmusPrograms.g:5362:1: rule__AssociatePartner__PartnerNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AssociatePartner__PartnerNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5366:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5367:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5367:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5368:3: RULE_STRING
            {
             before(grammarAccess.getAssociatePartnerAccess().getPartnerNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociatePartnerAccess().getPartnerNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__PartnerNameAssignment_0"


    // $ANTLR start "rule__AssociatePartner__TypeAssignment_2"
    // InternalErasmusPrograms.g:5377:1: rule__AssociatePartner__TypeAssignment_2 : ( rulePartnerType ) ;
    public final void rule__AssociatePartner__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5381:1: ( ( rulePartnerType ) )
            // InternalErasmusPrograms.g:5382:2: ( rulePartnerType )
            {
            // InternalErasmusPrograms.g:5382:2: ( rulePartnerType )
            // InternalErasmusPrograms.g:5383:3: rulePartnerType
            {
             before(grammarAccess.getAssociatePartnerAccess().getTypePartnerTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePartnerType();

            state._fsp--;

             after(grammarAccess.getAssociatePartnerAccess().getTypePartnerTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociatePartner__TypeAssignment_2"


    // $ANTLR start "rule__AdmissionStructure__ApplicationProcessAssignment_2"
    // InternalErasmusPrograms.g:5392:1: rule__AdmissionStructure__ApplicationProcessAssignment_2 : ( ruleApplicationProcess ) ;
    public final void rule__AdmissionStructure__ApplicationProcessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5396:1: ( ( ruleApplicationProcess ) )
            // InternalErasmusPrograms.g:5397:2: ( ruleApplicationProcess )
            {
            // InternalErasmusPrograms.g:5397:2: ( ruleApplicationProcess )
            // InternalErasmusPrograms.g:5398:3: ruleApplicationProcess
            {
             before(grammarAccess.getAdmissionStructureAccess().getApplicationProcessApplicationProcessParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleApplicationProcess();

            state._fsp--;

             after(grammarAccess.getAdmissionStructureAccess().getApplicationProcessApplicationProcessParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__ApplicationProcessAssignment_2"


    // $ANTLR start "rule__AdmissionStructure__RequierementsAssignment_3_2"
    // InternalErasmusPrograms.g:5407:1: rule__AdmissionStructure__RequierementsAssignment_3_2 : ( ruleRequirement ) ;
    public final void rule__AdmissionStructure__RequierementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5411:1: ( ( ruleRequirement ) )
            // InternalErasmusPrograms.g:5412:2: ( ruleRequirement )
            {
            // InternalErasmusPrograms.g:5412:2: ( ruleRequirement )
            // InternalErasmusPrograms.g:5413:3: ruleRequirement
            {
             before(grammarAccess.getAdmissionStructureAccess().getRequierementsRequirementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getAdmissionStructureAccess().getRequierementsRequirementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__RequierementsAssignment_3_2"


    // $ANTLR start "rule__AdmissionStructure__RequierementsAssignment_3_3_1"
    // InternalErasmusPrograms.g:5422:1: rule__AdmissionStructure__RequierementsAssignment_3_3_1 : ( ruleRequirement ) ;
    public final void rule__AdmissionStructure__RequierementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5426:1: ( ( ruleRequirement ) )
            // InternalErasmusPrograms.g:5427:2: ( ruleRequirement )
            {
            // InternalErasmusPrograms.g:5427:2: ( ruleRequirement )
            // InternalErasmusPrograms.g:5428:3: ruleRequirement
            {
             before(grammarAccess.getAdmissionStructureAccess().getRequierementsRequirementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getAdmissionStructureAccess().getRequierementsRequirementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__RequierementsAssignment_3_3_1"


    // $ANTLR start "rule__AdmissionStructure__ResultsAssignment_4_2"
    // InternalErasmusPrograms.g:5437:1: rule__AdmissionStructure__ResultsAssignment_4_2 : ( ruleResults ) ;
    public final void rule__AdmissionStructure__ResultsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5441:1: ( ( ruleResults ) )
            // InternalErasmusPrograms.g:5442:2: ( ruleResults )
            {
            // InternalErasmusPrograms.g:5442:2: ( ruleResults )
            // InternalErasmusPrograms.g:5443:3: ruleResults
            {
             before(grammarAccess.getAdmissionStructureAccess().getResultsResultsParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResults();

            state._fsp--;

             after(grammarAccess.getAdmissionStructureAccess().getResultsResultsParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__ResultsAssignment_4_2"


    // $ANTLR start "rule__AdmissionStructure__ResultsAssignment_4_3_1"
    // InternalErasmusPrograms.g:5452:1: rule__AdmissionStructure__ResultsAssignment_4_3_1 : ( ruleResults ) ;
    public final void rule__AdmissionStructure__ResultsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5456:1: ( ( ruleResults ) )
            // InternalErasmusPrograms.g:5457:2: ( ruleResults )
            {
            // InternalErasmusPrograms.g:5457:2: ( ruleResults )
            // InternalErasmusPrograms.g:5458:3: ruleResults
            {
             before(grammarAccess.getAdmissionStructureAccess().getResultsResultsParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResults();

            state._fsp--;

             after(grammarAccess.getAdmissionStructureAccess().getResultsResultsParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdmissionStructure__ResultsAssignment_4_3_1"


    // $ANTLR start "rule__Results__YearAssignment_1"
    // InternalErasmusPrograms.g:5467:1: rule__Results__YearAssignment_1 : ( RULE_INT ) ;
    public final void rule__Results__YearAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5471:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5472:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5472:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5473:3: RULE_INT
            {
             before(grammarAccess.getResultsAccess().getYearINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getYearINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__YearAssignment_1"


    // $ANTLR start "rule__Results__TotalAdmittedAssignment_4"
    // InternalErasmusPrograms.g:5482:1: rule__Results__TotalAdmittedAssignment_4 : ( RULE_INT ) ;
    public final void rule__Results__TotalAdmittedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5486:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5487:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5487:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5488:3: RULE_INT
            {
             before(grammarAccess.getResultsAccess().getTotalAdmittedINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getTotalAdmittedINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__TotalAdmittedAssignment_4"


    // $ANTLR start "rule__Results__ScholarshipsAwardedAssignment_6"
    // InternalErasmusPrograms.g:5497:1: rule__Results__ScholarshipsAwardedAssignment_6 : ( RULE_INT ) ;
    public final void rule__Results__ScholarshipsAwardedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5501:1: ( ( RULE_INT ) )
            // InternalErasmusPrograms.g:5502:2: ( RULE_INT )
            {
            // InternalErasmusPrograms.g:5502:2: ( RULE_INT )
            // InternalErasmusPrograms.g:5503:3: RULE_INT
            {
             before(grammarAccess.getResultsAccess().getScholarshipsAwardedINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getScholarshipsAwardedINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__ScholarshipsAwardedAssignment_6"


    // $ANTLR start "rule__Results__AdmittedStudentsAssignment_7_2"
    // InternalErasmusPrograms.g:5512:1: rule__Results__AdmittedStudentsAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__Results__AdmittedStudentsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5516:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5517:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5517:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5518:3: RULE_STRING
            {
             before(grammarAccess.getResultsAccess().getAdmittedStudentsSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getAdmittedStudentsSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__AdmittedStudentsAssignment_7_2"


    // $ANTLR start "rule__Results__AdmittedStudentsAssignment_7_3_1"
    // InternalErasmusPrograms.g:5527:1: rule__Results__AdmittedStudentsAssignment_7_3_1 : ( RULE_STRING ) ;
    public final void rule__Results__AdmittedStudentsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5531:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5532:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5532:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5533:3: RULE_STRING
            {
             before(grammarAccess.getResultsAccess().getAdmittedStudentsSTRINGTerminalRuleCall_7_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResultsAccess().getAdmittedStudentsSTRINGTerminalRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Results__AdmittedStudentsAssignment_7_3_1"


    // $ANTLR start "rule__DocumentRequirement__DocumentNameAssignment_3"
    // InternalErasmusPrograms.g:5542:1: rule__DocumentRequirement__DocumentNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DocumentRequirement__DocumentNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5546:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5547:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5547:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5548:3: RULE_STRING
            {
             before(grammarAccess.getDocumentRequirementAccess().getDocumentNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentRequirementAccess().getDocumentNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__DocumentNameAssignment_3"


    // $ANTLR start "rule__DocumentRequirement__DescriptionAssignment_5"
    // InternalErasmusPrograms.g:5557:1: rule__DocumentRequirement__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__DocumentRequirement__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5561:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5562:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5562:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5563:3: RULE_STRING
            {
             before(grammarAccess.getDocumentRequirementAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentRequirementAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRequirement__DescriptionAssignment_5"


    // $ANTLR start "rule__DegreeRequirement__DegreeNameAssignment_3"
    // InternalErasmusPrograms.g:5572:1: rule__DegreeRequirement__DegreeNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DegreeRequirement__DegreeNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5576:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5577:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5577:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5578:3: RULE_STRING
            {
             before(grammarAccess.getDegreeRequirementAccess().getDegreeNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDegreeRequirementAccess().getDegreeNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__DegreeNameAssignment_3"


    // $ANTLR start "rule__DegreeRequirement__FieldOfStudyAssignment_5"
    // InternalErasmusPrograms.g:5587:1: rule__DegreeRequirement__FieldOfStudyAssignment_5 : ( RULE_STRING ) ;
    public final void rule__DegreeRequirement__FieldOfStudyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5591:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5592:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5592:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5593:3: RULE_STRING
            {
             before(grammarAccess.getDegreeRequirementAccess().getFieldOfStudySTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDegreeRequirementAccess().getFieldOfStudySTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__FieldOfStudyAssignment_5"


    // $ANTLR start "rule__DegreeRequirement__LevelAssignment_7"
    // InternalErasmusPrograms.g:5602:1: rule__DegreeRequirement__LevelAssignment_7 : ( ruleDegreeLevel ) ;
    public final void rule__DegreeRequirement__LevelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5606:1: ( ( ruleDegreeLevel ) )
            // InternalErasmusPrograms.g:5607:2: ( ruleDegreeLevel )
            {
            // InternalErasmusPrograms.g:5607:2: ( ruleDegreeLevel )
            // InternalErasmusPrograms.g:5608:3: ruleDegreeLevel
            {
             before(grammarAccess.getDegreeRequirementAccess().getLevelDegreeLevelEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDegreeLevel();

            state._fsp--;

             after(grammarAccess.getDegreeRequirementAccess().getLevelDegreeLevelEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DegreeRequirement__LevelAssignment_7"


    // $ANTLR start "rule__LanguageRequirement__LanguageNameAssignment_3"
    // InternalErasmusPrograms.g:5617:1: rule__LanguageRequirement__LanguageNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__LanguageRequirement__LanguageNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5621:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5622:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5622:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5623:3: RULE_STRING
            {
             before(grammarAccess.getLanguageRequirementAccess().getLanguageNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguageRequirementAccess().getLanguageNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__LanguageNameAssignment_3"


    // $ANTLR start "rule__LanguageRequirement__LevelAssignment_5"
    // InternalErasmusPrograms.g:5632:1: rule__LanguageRequirement__LevelAssignment_5 : ( ruleLanguageLevel ) ;
    public final void rule__LanguageRequirement__LevelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5636:1: ( ( ruleLanguageLevel ) )
            // InternalErasmusPrograms.g:5637:2: ( ruleLanguageLevel )
            {
            // InternalErasmusPrograms.g:5637:2: ( ruleLanguageLevel )
            // InternalErasmusPrograms.g:5638:3: ruleLanguageLevel
            {
             before(grammarAccess.getLanguageRequirementAccess().getLevelLanguageLevelEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageLevel();

            state._fsp--;

             after(grammarAccess.getLanguageRequirementAccess().getLevelLanguageLevelEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageRequirement__LevelAssignment_5"


    // $ANTLR start "rule__ApplicationProcess__StepsAssignment_2_2"
    // InternalErasmusPrograms.g:5647:1: rule__ApplicationProcess__StepsAssignment_2_2 : ( ruleStep ) ;
    public final void rule__ApplicationProcess__StepsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5651:1: ( ( ruleStep ) )
            // InternalErasmusPrograms.g:5652:2: ( ruleStep )
            {
            // InternalErasmusPrograms.g:5652:2: ( ruleStep )
            // InternalErasmusPrograms.g:5653:3: ruleStep
            {
             before(grammarAccess.getApplicationProcessAccess().getStepsStepParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getApplicationProcessAccess().getStepsStepParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__StepsAssignment_2_2"


    // $ANTLR start "rule__ApplicationProcess__StepsAssignment_2_3_1"
    // InternalErasmusPrograms.g:5662:1: rule__ApplicationProcess__StepsAssignment_2_3_1 : ( ruleStep ) ;
    public final void rule__ApplicationProcess__StepsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5666:1: ( ( ruleStep ) )
            // InternalErasmusPrograms.g:5667:2: ( ruleStep )
            {
            // InternalErasmusPrograms.g:5667:2: ( ruleStep )
            // InternalErasmusPrograms.g:5668:3: ruleStep
            {
             before(grammarAccess.getApplicationProcessAccess().getStepsStepParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getApplicationProcessAccess().getStepsStepParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationProcess__StepsAssignment_2_3_1"


    // $ANTLR start "rule__Step__StepNameAssignment_1"
    // InternalErasmusPrograms.g:5677:1: rule__Step__StepNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Step__StepNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5681:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5682:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5682:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5683:3: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getStepNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getStepNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__StepNameAssignment_1"


    // $ANTLR start "rule__Step__StepDescriptionAssignment_4"
    // InternalErasmusPrograms.g:5692:1: rule__Step__StepDescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Step__StepDescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5696:1: ( ( RULE_STRING ) )
            // InternalErasmusPrograms.g:5697:2: ( RULE_STRING )
            {
            // InternalErasmusPrograms.g:5697:2: ( RULE_STRING )
            // InternalErasmusPrograms.g:5698:3: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getStepDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getStepDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__StepDescriptionAssignment_4"


    // $ANTLR start "rule__Step__StartDateAssignment_6"
    // InternalErasmusPrograms.g:5707:1: rule__Step__StartDateAssignment_6 : ( RULE_EDATE ) ;
    public final void rule__Step__StartDateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5711:1: ( ( RULE_EDATE ) )
            // InternalErasmusPrograms.g:5712:2: ( RULE_EDATE )
            {
            // InternalErasmusPrograms.g:5712:2: ( RULE_EDATE )
            // InternalErasmusPrograms.g:5713:3: RULE_EDATE
            {
             before(grammarAccess.getStepAccess().getStartDateEDATETerminalRuleCall_6_0()); 
            match(input,RULE_EDATE,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getStartDateEDATETerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__StartDateAssignment_6"


    // $ANTLR start "rule__Step__EndDateAssignment_8"
    // InternalErasmusPrograms.g:5722:1: rule__Step__EndDateAssignment_8 : ( RULE_EDATE ) ;
    public final void rule__Step__EndDateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErasmusPrograms.g:5726:1: ( ( RULE_EDATE ) )
            // InternalErasmusPrograms.g:5727:2: ( RULE_EDATE )
            {
            // InternalErasmusPrograms.g:5727:2: ( RULE_EDATE )
            // InternalErasmusPrograms.g:5728:3: RULE_EDATE
            {
             before(grammarAccess.getStepAccess().getEndDateEDATETerminalRuleCall_8_0()); 
            match(input,RULE_EDATE,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getEndDateEDATETerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__EndDateAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001A8000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0006000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4480000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});

}