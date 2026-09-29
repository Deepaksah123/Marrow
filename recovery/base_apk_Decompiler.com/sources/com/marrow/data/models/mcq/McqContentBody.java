package com.marrow.data.models.mcq;

import com.marrow.data.models.content.ContentBody;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u0019\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001c\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u000bR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u000bR\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\u000bR(\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0$8G¢\u0006\u0006\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/marrow/data/models/mcq/McqContentBody;", "Lo/notifyManifestPublishTimeExpired;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "", "fromJSON", "(Lorg/json/JSONObject;)V", "", "option1", "Ljava/lang/String;", "getOption1", "()Ljava/lang/String;", "setOption1", "(Ljava/lang/String;)V", "option2", "getOption2", "setOption2", "option3", "getOption3", "setOption3", "option4", "getOption4", "setOption4", "title", "getTitle", "setTitle", "questionDescription", "getQuestionDescription", "setQuestionDescription", "id", "option5", "option6", "option7", "option8", "", "Lcom/marrow/data/models/content/ContentBody;", "answerDescription", "[Lcom/marrow/data/models/content/ContentBody;", "getAnswerDescription", "()[Lcom/marrow/data/models/content/ContentBody;", "setAnswerDescription", "([Lcom/marrow/data/models/content/ContentBody;)V", "getOptions", "()[Ljava/lang/String;", "options", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class McqContentBody implements notifyManifestPublishTimeExpired {
    private static final String KEY_ANSWER_DESC = "answer_desc";
    private static final String KEY_DESC_HTML = "desc_html";
    private static final String KEY_ID = "_id";
    public static final String KEY_OPTION_1 = "option_1";
    public static final String KEY_OPTION_2 = "option_2";
    public static final String KEY_OPTION_3 = "option_3";
    public static final String KEY_OPTION_4 = "option_4";
    public static final String KEY_OPTION_5 = "option_5";
    public static final String KEY_OPTION_6 = "option_6";
    public static final String KEY_OPTION_7 = "option_7";
    public static final String KEY_OPTION_8 = "option_8";
    private static final String KEY_TITLE = "title";
    private String option1 = "";
    private String option2 = "";
    private String option3 = "";
    private String option4 = "";
    private String title = "";
    private String questionDescription = "";
    private String id = "";
    private String option5 = "";
    private String option6 = "";
    private String option7 = "";
    private String option8 = "";
    private ContentBody[] answerDescription = new ContentBody[0];

    public final String getOption1() {
        return this.option1;
    }

    public final void setOption1(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.option1 = str;
    }

    public final String getOption2() {
        return this.option2;
    }

    public final void setOption2(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.option2 = str;
    }

    public final String getOption3() {
        return this.option3;
    }

    public final void setOption3(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.option3 = str;
    }

    public final String getOption4() {
        return this.option4;
    }

    public final void setOption4(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.option4 = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.title = str;
    }

    public final String getQuestionDescription() {
        return this.questionDescription;
    }

    public final void setQuestionDescription(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.questionDescription = str;
    }

    public final ContentBody[] getAnswerDescription() {
        return this.answerDescription;
    }

    public final void setAnswerDescription(ContentBody[] contentBodyArr) {
        toMagicModuleMetaRepoModel.write(contentBodyArr, "");
        this.answerDescription = contentBodyArr;
    }

    public final String[] getOptions() {
        String[] strArr = {this.option1, this.option2, this.option3, this.option4, this.option5, this.option6, this.option7, this.option8};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            arrayList2.add("");
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public final void fromJSON(JSONObject p0) {
        if (p0 != null) {
            String strOptString = p0.optString("_id");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
            this.id = strOptString;
            String strOptString2 = p0.optString("title");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
            this.title = strOptString2;
            ContentBody[] contentBodyArrFromJSON = ContentBody.fromJSON(p0.optJSONArray(KEY_ANSWER_DESC));
            if (contentBodyArrFromJSON == null) {
                contentBodyArrFromJSON = new ContentBody[0];
            }
            this.answerDescription = contentBodyArrFromJSON;
            String strOptString3 = p0.optString(KEY_OPTION_1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString3, "");
            this.option1 = strOptString3;
            String strOptString4 = p0.optString(KEY_OPTION_2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString4, "");
            this.option2 = strOptString4;
            String strOptString5 = p0.optString(KEY_OPTION_3);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString5, "");
            this.option3 = strOptString5;
            String strOptString6 = p0.optString(KEY_OPTION_4);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString6, "");
            this.option4 = strOptString6;
            String strOptString7 = p0.optString(KEY_OPTION_5);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString7, "");
            this.option5 = strOptString7;
            String strOptString8 = p0.optString(KEY_OPTION_6);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString8, "");
            this.option6 = strOptString8;
            String strOptString9 = p0.optString(KEY_OPTION_7);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString9, "");
            this.option7 = strOptString9;
            String strOptString10 = p0.optString(KEY_OPTION_8);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString10, "");
            this.option8 = strOptString10;
            String strOptString11 = p0.optString(KEY_DESC_HTML);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString11, "");
            this.questionDescription = strOptString11;
        }
    }
}
