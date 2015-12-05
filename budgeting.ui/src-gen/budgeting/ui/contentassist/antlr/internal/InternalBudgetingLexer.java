package budgeting.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBudgetingLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DECIMAL=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalBudgetingLexer() {;} 
    public InternalBudgetingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBudgetingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:11:7: ( 'expense' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:11:9: 'expense'
            {
            match("expense"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:12:7: ( 'january' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:12:9: 'january'
            {
            match("january"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:13:7: ( 'february' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:13:9: 'february'
            {
            match("february"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:14:7: ( 'march' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:14:9: 'march'
            {
            match("march"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:15:7: ( 'april' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:15:9: 'april'
            {
            match("april"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:16:7: ( 'may' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:16:9: 'may'
            {
            match("may"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:17:7: ( 'june' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:17:9: 'june'
            {
            match("june"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:18:7: ( 'july' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:18:9: 'july'
            {
            match("july"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:19:7: ( 'august' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:19:9: 'august'
            {
            match("august"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:20:7: ( 'september' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:20:9: 'september'
            {
            match("september"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:21:7: ( 'october' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:21:9: 'october'
            {
            match("october"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:22:7: ( 'november' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:22:9: 'november'
            {
            match("november"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:23:7: ( 'december' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:23:9: 'december'
            {
            match("december"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:24:7: ( 'library' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:24:9: 'library'
            {
            match("library"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:25:7: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:25:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:26:7: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:27:7: ( 'uses' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:27:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:28:7: ( 'budget' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:28:9: 'budget'
            {
            match("budget"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:29:7: ( 'actual' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:29:9: 'actual'
            {
            match("actual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:30:7: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:30:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:31:7: ( '*' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:32:7: ( 'cash' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:32:9: 'cash'
            {
            match("cash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:33:7: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:33:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:34:7: ( 'card' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:34:9: 'card'
            {
            match("card"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:35:7: ( 'from' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:35:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:36:7: ( 'income' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:36:9: 'income'
            {
            match("income"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2716:14: ( RULE_INT '.' RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2716:16: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2718:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2718:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2718:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2718:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2718:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2720:10: ( ( '0' .. '9' )+ )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2720:12: ( '0' .. '9' )+
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2720:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2720:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2724:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2724:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2724:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2724:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:41: ( '\\r' )? '\\n'
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2728:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2728:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2728:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2730:16: ( . )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2730:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_DECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=34;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:166: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 28 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:179: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:187: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:196: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:208: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:224: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:240: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1:248: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\12\34\2\uffff\2\34\2\uffff\2\34\1\63\1\32\1\uffff\3\32\2\uffff\1\34\1\uffff\12\34\1\107\3\34\2\uffff\2\34\2\uffff\2\34\1\uffff\1\63\5\uffff\7\34\1\127\5\34\1\uffff\12\34\1\147\1\150\1\34\1\152\1\34\1\uffff\10\34\1\164\1\34\1\166\1\167\3\34\2\uffff\1\34\1\uffff\1\174\1\175\7\34\1\uffff\1\34\2\uffff\4\34\2\uffff\1\u008a\1\u008b\5\34\1\u0091\1\u0092\1\u0093\1\u0094\1\34\2\uffff\1\34\1\u0097\2\34\1\u009a\4\uffff\1\u009b\1\34\1\uffff\1\u009d\1\u009e\2\uffff\1\u009f\3\uffff";
    static final String DFA12_eofS =
        "\u00a0\uffff";
    static final String DFA12_minS =
        "\1\0\1\170\1\141\1\145\1\141\1\143\1\145\1\143\1\157\1\145\1\151\2\uffff\1\163\1\165\2\uffff\1\141\1\156\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\160\1\uffff\1\156\1\154\1\142\1\157\2\162\1\147\1\164\1\160\1\164\1\60\1\166\1\143\1\142\2\uffff\1\145\1\144\2\uffff\1\162\1\143\1\uffff\1\56\5\uffff\1\145\1\165\1\145\1\171\1\162\1\155\1\143\1\60\1\151\2\165\1\164\1\157\1\uffff\2\145\1\162\1\163\1\147\1\150\1\144\1\157\1\156\1\141\2\60\1\165\1\60\1\150\1\uffff\1\154\1\163\1\141\1\145\1\142\2\155\1\141\1\60\1\145\2\60\1\155\1\163\1\162\2\uffff\1\141\1\uffff\2\60\1\164\1\154\1\155\1\145\2\142\1\162\1\uffff\1\164\2\uffff\2\145\1\171\1\162\2\uffff\2\60\1\142\1\162\2\145\1\171\4\60\1\171\2\uffff\1\145\1\60\2\162\1\60\4\uffff\1\60\1\162\1\uffff\2\60\2\uffff\1\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\170\1\165\1\162\1\141\1\165\1\145\1\156\1\157\1\145\1\151\2\uffff\1\163\1\165\2\uffff\1\141\1\156\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\160\1\uffff\2\156\1\142\1\157\1\171\1\162\1\147\1\164\1\160\1\164\1\172\1\166\1\143\1\142\2\uffff\1\145\1\144\2\uffff\1\163\1\143\1\uffff\1\71\5\uffff\1\145\1\165\1\145\1\171\1\162\1\155\1\143\1\172\1\151\2\165\1\164\1\157\1\uffff\2\145\1\162\1\163\1\147\1\150\1\144\1\157\1\156\1\141\2\172\1\165\1\172\1\150\1\uffff\1\154\1\163\1\141\1\145\1\142\2\155\1\141\1\172\1\145\2\172\1\155\1\163\1\162\2\uffff\1\141\1\uffff\2\172\1\164\1\154\1\155\1\145\2\142\1\162\1\uffff\1\164\2\uffff\2\145\1\171\1\162\2\uffff\2\172\1\142\1\162\2\145\1\171\4\172\1\171\2\uffff\1\145\1\172\2\162\1\172\4\uffff\1\172\1\162\1\uffff\2\172\2\uffff\1\172\3\uffff";
    static final String DFA12_acceptS =
        "\13\uffff\1\17\1\20\2\uffff\1\24\1\25\4\uffff\1\34\3\uffff\1\41\1\42\1\uffff\1\34\16\uffff\1\17\1\20\2\uffff\1\24\1\25\2\uffff\1\35\1\uffff\1\33\1\36\1\37\1\40\1\41\15\uffff\1\27\17\uffff\1\6\17\uffff\1\7\1\10\1\uffff\1\31\11\uffff\1\21\1\uffff\1\26\1\30\4\uffff\1\4\1\5\14\uffff\1\11\1\23\5\uffff\1\22\1\32\1\1\1\2\2\uffff\1\13\2\uffff\1\16\1\3\1\uffff\1\14\1\15\1\12";
    static final String DFA12_specialS =
        "\1\2\25\uffff\1\1\1\0\u0088\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\2\32\1\20\4\32\1\30\12\23\1\17\6\32\32\25\3\32\1\24\1\25\1\32\1\5\1\16\1\21\1\11\1\1\1\3\2\25\1\22\1\2\1\25\1\12\1\4\1\10\1\7\3\25\1\6\1\25\1\15\5\25\1\13\1\32\1\14\uff82\32",
            "\1\33",
            "\1\35\23\uffff\1\36",
            "\1\37\14\uffff\1\40",
            "\1\41",
            "\1\44\14\uffff\1\42\4\uffff\1\43",
            "\1\45",
            "\1\46\12\uffff\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\65\1\uffff\12\64",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\0\66",
            "\0\66",
            "\1\67\4\uffff\1\70",
            "",
            "",
            "\1\72",
            "",
            "\1\73",
            "\1\75\1\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100\6\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "",
            "\1\116\1\115",
            "\1\117",
            "",
            "\1\65\1\uffff\12\64",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\151",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\165",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0098",
            "\1\u0099",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u009c",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_DECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 54;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 54;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='e') ) {s = 1;}

                        else if ( (LA12_0=='j') ) {s = 2;}

                        else if ( (LA12_0=='f') ) {s = 3;}

                        else if ( (LA12_0=='m') ) {s = 4;}

                        else if ( (LA12_0=='a') ) {s = 5;}

                        else if ( (LA12_0=='s') ) {s = 6;}

                        else if ( (LA12_0=='o') ) {s = 7;}

                        else if ( (LA12_0=='n') ) {s = 8;}

                        else if ( (LA12_0=='d') ) {s = 9;}

                        else if ( (LA12_0=='l') ) {s = 10;}

                        else if ( (LA12_0=='{') ) {s = 11;}

                        else if ( (LA12_0=='}') ) {s = 12;}

                        else if ( (LA12_0=='u') ) {s = 13;}

                        else if ( (LA12_0=='b') ) {s = 14;}

                        else if ( (LA12_0==':') ) {s = 15;}

                        else if ( (LA12_0=='*') ) {s = 16;}

                        else if ( (LA12_0=='c') ) {s = 17;}

                        else if ( (LA12_0=='i') ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||LA12_0=='k'||(LA12_0>='p' && LA12_0<='r')||LA12_0=='t'||(LA12_0>='v' && LA12_0<='z')) ) {s = 21;}

                        else if ( (LA12_0=='\"') ) {s = 22;}

                        else if ( (LA12_0=='\'') ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 25;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}