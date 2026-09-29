package com.marrow.data.api.models.response.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b2\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0003AB@Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b \u0010!J\u0080\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0015R\u001a\u0010-\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010\u0015R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010\u0015R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010\u0015R \u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001dR \u00109\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010\u001dR\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010\u0015R\u001a\u0010=\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010!"}, d2 = {"Lcom/marrow/data/api/models/response/common/LearnMoreResponse;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "", "Lcom/marrow/data/api/models/response/common/LearnMoreResponse$LearnMoreCard;", "p6", "Lcom/marrow/data/api/models/response/common/LearnMoreResponse$Specials;", "p7", "p8", "", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)Lcom/marrow/data/api/models/response/common/LearnMoreResponse;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "title", "Ljava/lang/String;", "getTitle", "oneLiner", "getOneLiner", "showEditors", "Z", "getShowEditors", "description", "getDescription", "textPrimaryBtn", "getTextPrimaryBtn", "specialQuesHeader", "getSpecialQuesHeader", LearnMoreResponse.KEY_CARDS, "Ljava/util/List;", "getCards", "specialList", "getSpecialList", "textSecondaryBtn", "getTextSecondaryBtn", "version", "I", "getVersion", "Companion", "LearnMoreCard", "Specials"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LearnMoreResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_ANS_LIST = "ans_list";
    private static final String KEY_CARDS = "cards";
    private static final String KEY_CARD_TITLE = "card_title";
    private static final String KEY_DESC = "desc";
    private static final String KEY_ICON = "icon";
    private static final String KEY_LEARN_MORE_VERSION = "config_version";
    private static final String KEY_ONE_LINER = "one_liner";
    private static final String KEY_POINTS = "points";
    private static final String KEY_PRIM_CTA_AND = "prim_cta_and";
    private static final String KEY_QUES = "ques";
    private static final String KEY_SEC_CTA_TEXT = "learn_marrow";
    private static final String KEY_SHOW_EDITORS = "show_editors";
    private static final String KEY_SPC_DESC = "desc";
    private static final String KEY_SPC_TITLE = "title";
    private static final String KEY_TITLE = "title";
    private final List<LearnMoreCard> cards;
    private final String description;
    private final String oneLiner;
    private final boolean showEditors;
    private final List<Specials> specialList;
    private final String specialQuesHeader;
    private final String textPrimaryBtn;
    private final String textSecondaryBtn;
    private final String title;
    private final int version;

    public LearnMoreResponse(String str, String str2, boolean z, String str3, String str4, String str5, List<LearnMoreCard> list, List<Specials> list2, String str6, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.title = str;
        this.oneLiner = str2;
        this.showEditors = z;
        this.description = str3;
        this.textPrimaryBtn = str4;
        this.specialQuesHeader = str5;
        this.cards = list;
        this.specialList = list2;
        this.textSecondaryBtn = str6;
        this.version = i;
    }

    public /* synthetic */ LearnMoreResponse(String str, String str2, boolean z, String str3, String str4, String str5, List list, List list2, String str6, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 128) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? 0 : i);
    }

    @JsonProperty("title")
    public final String getTitle() {
        return this.title;
    }

    @JsonProperty(KEY_ONE_LINER)
    public final String getOneLiner() {
        return this.oneLiner;
    }

    @JsonProperty(KEY_SHOW_EDITORS)
    public final boolean getShowEditors() {
        return this.showEditors;
    }

    @JsonProperty("desc")
    public final String getDescription() {
        return this.description;
    }

    @JsonProperty(KEY_PRIM_CTA_AND)
    public final String getTextPrimaryBtn() {
        return this.textPrimaryBtn;
    }

    @JsonProperty(KEY_QUES)
    public final String getSpecialQuesHeader() {
        return this.specialQuesHeader;
    }

    @JsonProperty(KEY_CARDS)
    public final List<LearnMoreCard> getCards() {
        return this.cards;
    }

    @JsonProperty(KEY_ANS_LIST)
    public final List<Specials> getSpecialList() {
        return this.specialList;
    }

    @JsonProperty(KEY_SEC_CTA_TEXT)
    public final String getTextSecondaryBtn() {
        return this.textSecondaryBtn;
    }

    @JsonProperty("config_version")
    public final int getVersion() {
        return this.version;
    }

    public LearnMoreResponse() {
        this(null, null, false, null, null, null, null, null, null, 0, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOneLiner() {
        return this.oneLiner;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowEditors() {
        return this.showEditors;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/marrow/data/api/models/response/common/LearnMoreResponse$LearnMoreCard;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/marrow/data/api/models/response/common/LearnMoreResponse$LearnMoreCard;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "iconUrl", "Ljava/lang/String;", "getIconUrl", "cardTitle", "getCardTitle", LearnMoreResponse.KEY_POINTS, "Ljava/util/List;", "getPoints"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LearnMoreCard {
        private final String cardTitle;
        private final String iconUrl;
        private final List<String> points;

        public LearnMoreCard(String str, String str2, List<String> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.iconUrl = str;
            this.cardTitle = str2;
            this.points = list;
        }

        public /* synthetic */ LearnMoreCard(String str, String str2, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
        }

        @JsonProperty(LearnMoreResponse.KEY_ICON)
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @JsonProperty(LearnMoreResponse.KEY_CARD_TITLE)
        public final String getCardTitle() {
            return this.cardTitle;
        }

        @JsonProperty(LearnMoreResponse.KEY_POINTS)
        public final List<String> getPoints() {
            return this.points;
        }

        public LearnMoreCard() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LearnMoreCard copy$default(LearnMoreCard learnMoreCard, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = learnMoreCard.iconUrl;
            }
            if ((i & 2) != 0) {
                str2 = learnMoreCard.cardTitle;
            }
            if ((i & 4) != 0) {
                list = learnMoreCard.points;
            }
            return learnMoreCard.copy(str, str2, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardTitle() {
            return this.cardTitle;
        }

        public final List<String> component3() {
            return this.points;
        }

        public final LearnMoreCard copy(String p0, String p1, List<String> p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            return new LearnMoreCard(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof LearnMoreCard)) {
                return false;
            }
            LearnMoreCard learnMoreCard = (LearnMoreCard) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.iconUrl, (Object) learnMoreCard.iconUrl) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.cardTitle, (Object) learnMoreCard.cardTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.points, learnMoreCard.points);
        }

        public final int hashCode() {
            return (((this.iconUrl.hashCode() * 31) + this.cardTitle.hashCode()) * 31) + this.points.hashCode();
        }

        public final String toString() {
            String str = this.iconUrl;
            String str2 = this.cardTitle;
            List<String> list = this.points;
            StringBuilder sb = new StringBuilder("LearnMoreCard(iconUrl=");
            sb.append(str);
            sb.append(", cardTitle=");
            sb.append(str2);
            sb.append(", points=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTextPrimaryBtn() {
        return this.textPrimaryBtn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSpecialQuesHeader() {
        return this.specialQuesHeader;
    }

    public final List<LearnMoreCard> component7() {
        return this.cards;
    }

    public final List<Specials> component8() {
        return this.specialList;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTextSecondaryBtn() {
        return this.textSecondaryBtn;
    }

    public final LearnMoreResponse copy(String p0, String p1, boolean p2, String p3, String p4, String p5, List<LearnMoreCard> p6, List<Specials> p7, String p8, int p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        toMagicModuleMetaRepoModel.write(p8, "");
        return new LearnMoreResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LearnMoreResponse)) {
            return false;
        }
        LearnMoreResponse learnMoreResponse = (LearnMoreResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) learnMoreResponse.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.oneLiner, (Object) learnMoreResponse.oneLiner) && this.showEditors == learnMoreResponse.showEditors && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) learnMoreResponse.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.textPrimaryBtn, (Object) learnMoreResponse.textPrimaryBtn) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.specialQuesHeader, (Object) learnMoreResponse.specialQuesHeader) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.cards, learnMoreResponse.cards) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.specialList, learnMoreResponse.specialList) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.textSecondaryBtn, (Object) learnMoreResponse.textSecondaryBtn) && this.version == learnMoreResponse.version;
    }

    public final int hashCode() {
        return (((((((((((((((((this.title.hashCode() * 31) + this.oneLiner.hashCode()) * 31) + Boolean.hashCode(this.showEditors)) * 31) + this.description.hashCode()) * 31) + this.textPrimaryBtn.hashCode()) * 31) + this.specialQuesHeader.hashCode()) * 31) + this.cards.hashCode()) * 31) + this.specialList.hashCode()) * 31) + this.textSecondaryBtn.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.oneLiner;
        boolean z = this.showEditors;
        String str3 = this.description;
        String str4 = this.textPrimaryBtn;
        String str5 = this.specialQuesHeader;
        List<LearnMoreCard> list = this.cards;
        List<Specials> list2 = this.specialList;
        String str6 = this.textSecondaryBtn;
        int i = this.version;
        StringBuilder sb = new StringBuilder("LearnMoreResponse(title=");
        sb.append(str);
        sb.append(", oneLiner=");
        sb.append(str2);
        sb.append(", showEditors=");
        sb.append(z);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", textPrimaryBtn=");
        sb.append(str4);
        sb.append(", specialQuesHeader=");
        sb.append(str5);
        sb.append(", cards=");
        sb.append(list);
        sb.append(", specialList=");
        sb.append(list2);
        sb.append(", textSecondaryBtn=");
        sb.append(str6);
        sb.append(", version=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow/data/api/models/response/common/LearnMoreResponse$Specials;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/response/common/LearnMoreResponse$Specials;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "title", "Ljava/lang/String;", "getTitle", "description", "getDescription"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Specials {
        private final String description;
        private final String title;

        public Specials(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.title = str;
            this.description = str2;
        }

        public /* synthetic */ Specials(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        @JsonProperty("title")
        public final String getTitle() {
            return this.title;
        }

        @JsonProperty("desc")
        public final String getDescription() {
            return this.description;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Specials() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Specials copy$default(Specials specials, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = specials.title;
            }
            if ((i & 2) != 0) {
                str2 = specials.description;
            }
            return specials.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Specials copy(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new Specials(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Specials)) {
                return false;
            }
            Specials specials = (Specials) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) specials.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) specials.description);
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.description.hashCode();
        }

        public final String toString() {
            String str = this.title;
            String str2 = this.description;
            StringBuilder sb = new StringBuilder("Specials(title=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/marrow/data/api/models/response/common/LearnMoreResponse$Companion;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/api/models/response/common/LearnMoreResponse;", "fromJson", "(Ljava/lang/String;)Lcom/marrow/data/api/models/response/common/LearnMoreResponse;", "toJson", "(Lcom/marrow/data/api/models/response/common/LearnMoreResponse;)Ljava/lang/String;", "KEY_TITLE", "Ljava/lang/String;", "KEY_ONE_LINER", "KEY_SHOW_EDITORS", "KEY_DESC", "KEY_PRIM_CTA_AND", "KEY_QUES", "KEY_CARDS", "KEY_ANS_LIST", "KEY_SEC_CTA_TEXT", "KEY_LEARN_MORE_VERSION", "KEY_ICON", "KEY_CARD_TITLE", "KEY_POINTS", "KEY_SPC_TITLE", "KEY_SPC_DESC"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final LearnMoreResponse fromJson(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject jSONObject = new JSONObject(p0);
            String strOptString = jSONObject.optString("title");
            String strOptString2 = jSONObject.optString(LearnMoreResponse.KEY_ONE_LINER);
            boolean zOptBoolean = jSONObject.optBoolean(LearnMoreResponse.KEY_SHOW_EDITORS);
            String strOptString3 = jSONObject.optString("desc");
            String strOptString4 = jSONObject.optString(LearnMoreResponse.KEY_PRIM_CTA_AND);
            String strOptString5 = jSONObject.optString(LearnMoreResponse.KEY_QUES);
            String strOptString6 = jSONObject.optString(LearnMoreResponse.KEY_SEC_CTA_TEXT);
            int iOptInt = jSONObject.optInt("config_version");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(LearnMoreResponse.KEY_CARDS);
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (i < length) {
                int i2 = length;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                String strOptString7 = jSONObjectOptJSONObject.optString(LearnMoreResponse.KEY_ICON);
                int i3 = iOptInt;
                String strOptString8 = jSONObjectOptJSONObject.optString(LearnMoreResponse.KEY_CARD_TITLE);
                boolean z = zOptBoolean;
                ArrayList arrayList2 = new ArrayList();
                String str = strOptString6;
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(LearnMoreResponse.KEY_POINTS);
                int length2 = jSONArrayOptJSONArray2.length();
                String str2 = strOptString5;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = length2;
                    String strOptString9 = jSONArrayOptJSONArray2.optString(i4);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString9, "");
                    arrayList2.add(strOptString9);
                    i4++;
                    length2 = i5;
                }
                toMagicModuleMetaRepoModel.write((Object) strOptString7);
                toMagicModuleMetaRepoModel.write((Object) strOptString8);
                arrayList.add(new LearnMoreCard(strOptString7, strOptString8, arrayList2));
                i++;
                length = i2;
                jSONArrayOptJSONArray = jSONArray;
                iOptInt = i3;
                strOptString6 = str;
                zOptBoolean = z;
                strOptString5 = str2;
            }
            boolean z2 = zOptBoolean;
            String str3 = strOptString5;
            String str4 = strOptString6;
            int i6 = iOptInt;
            ArrayList arrayList3 = new ArrayList();
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(LearnMoreResponse.KEY_ANS_LIST);
            int length3 = jSONArrayOptJSONArray3.length();
            for (int i7 = 0; i7 < length3; i7++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i7);
                String strOptString10 = jSONObjectOptJSONObject2.optString("title");
                String strOptString11 = jSONObjectOptJSONObject2.optString("desc");
                toMagicModuleMetaRepoModel.write((Object) strOptString10);
                toMagicModuleMetaRepoModel.write((Object) strOptString11);
                arrayList3.add(new Specials(strOptString10, strOptString11));
            }
            toMagicModuleMetaRepoModel.write((Object) strOptString);
            toMagicModuleMetaRepoModel.write((Object) strOptString2);
            toMagicModuleMetaRepoModel.write((Object) strOptString3);
            toMagicModuleMetaRepoModel.write((Object) strOptString4);
            toMagicModuleMetaRepoModel.write((Object) str3);
            toMagicModuleMetaRepoModel.write((Object) str4);
            return new LearnMoreResponse(strOptString, strOptString2, z2, strOptString3, strOptString4, str3, arrayList, arrayList3, str4, i6);
        }

        public final String toJson(LearnMoreResponse p0) throws JSONException {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", p0.getTitle());
            jSONObject.put(LearnMoreResponse.KEY_ONE_LINER, p0.getOneLiner());
            jSONObject.put(LearnMoreResponse.KEY_SHOW_EDITORS, p0.getShowEditors());
            jSONObject.put("desc", p0.getDescription());
            jSONObject.put(LearnMoreResponse.KEY_PRIM_CTA_AND, p0.getTextPrimaryBtn());
            jSONObject.put(LearnMoreResponse.KEY_SEC_CTA_TEXT, p0.getTextSecondaryBtn());
            jSONObject.put(LearnMoreResponse.KEY_QUES, p0.getSpecialQuesHeader());
            jSONObject.put("config_version", p0.getVersion());
            JSONArray jSONArray = new JSONArray();
            for (LearnMoreCard learnMoreCard : p0.getCards()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(LearnMoreResponse.KEY_ICON, learnMoreCard.getIconUrl());
                jSONObject2.put(LearnMoreResponse.KEY_CARD_TITLE, learnMoreCard.getCardTitle());
                JSONArray jSONArray2 = new JSONArray();
                List<String> points = learnMoreCard.getPoints();
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) points, 10));
                Iterator<T> it = points.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArray2.put((String) it.next()));
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                jSONObject2.put(LearnMoreResponse.KEY_POINTS, jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(LearnMoreResponse.KEY_CARDS, jSONArray);
            JSONArray jSONArray3 = new JSONArray();
            for (Specials specials : p0.getSpecialList()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("title", specials.getTitle());
                jSONObject3.put("desc", specials.getDescription());
                jSONArray3.put(jSONObject3);
            }
            jSONObject.put(LearnMoreResponse.KEY_ANS_LIST, jSONArray3);
            String string = jSONObject.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
