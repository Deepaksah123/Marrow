package com.marrow.data.models.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0016\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006"}, d2 = {"Lcom/marrow/data/models/test/TopUser;", "", "<init>", "()V", "", "id", "Ljava/lang/String;", "testId", "firstName", "lastName", "profilePic", "", TopUser.KEY_RANK, "I", "", "score", "D", "wrong", "skipped", "correct", "", "isAnonymous", "Z", "getDisplayName", "()Ljava/lang/String;", "displayName", "isScoreStatsAvailable", "()Z", "stateId", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopUser {
    public static final String KEY_CORRECT = "correct";
    public static final String KEY_FIRST_NAME = "fname";
    public static final String KEY_ID = "_id";
    public static final String KEY_IS_ANONYMOUS = "is_anonymous";
    public static final String KEY_LAST_NAME = "lname";
    public static final String KEY_PROFILE_PIC = "profile_pic";
    public static final String KEY_RANK = "rank";
    public static final String KEY_SCORE = "score";
    public static final String KEY_SKIPPED = "skipped";
    public static final String KEY_WRONG = "wrong";

    @JsonProperty("correct")
    public int correct;

    @JsonProperty("_id")
    public String id;

    @JsonProperty(KEY_IS_ANONYMOUS)
    public boolean isAnonymous;

    @JsonProperty("profile_pic")
    public String profilePic;

    @JsonProperty(KEY_RANK)
    public int rank;

    @JsonProperty("score")
    public double score;

    @JsonProperty("skipped")
    public int skipped;

    @JsonProperty("wrong")
    public int wrong;
    public String testId = "";

    @JsonProperty("fname")
    public String firstName = "";

    @JsonProperty("lname")
    public String lastName = "";
    public String stateId = TestIndex.ALL_INDIA_ID;

    public final String getDisplayName() {
        String str = this.lastName;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ".", (Object) str)) {
            str = "";
        }
        String str2 = this.firstName;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        String string = sb.toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = toMagicModuleMetaRepoModel.read((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return string.subSequence(i, length + 1).toString();
    }

    public final boolean isScoreStatsAvailable() {
        return (this.skipped + this.wrong) + this.correct != 0;
    }
}
