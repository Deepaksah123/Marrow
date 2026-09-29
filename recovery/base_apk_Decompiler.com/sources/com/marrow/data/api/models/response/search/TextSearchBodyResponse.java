package com.marrow.data.api.models.response.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.pearl.PearlMini;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJL\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000fR\u001a\u0010$\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\u000f"}, d2 = {"Lcom/marrow/data/api/models/response/search/TextSearchBodyResponse;", "", "", "p0", "p1", "", "p2", "", "p3", "Lcom/marrow/data/api/models/response/search/TextSearchBodyResponse$Source;", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;DILcom/marrow/data/api/models/response/search/TextSearchBodyResponse$Source;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "()I", "component5", "()Lcom/marrow/data/api/models/response/search/TextSearchBodyResponse$Source;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;DILcom/marrow/data/api/models/response/search/TextSearchBodyResponse$Source;Ljava/lang/String;)Lcom/marrow/data/api/models/response/search/TextSearchBodyResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "index", "getIndex", "score", "D", "getScore", "sortOrder", "I", "getSortOrder", "source", "Lcom/marrow/data/api/models/response/search/TextSearchBodyResponse$Source;", "getSource", "type", "getType", "Source"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextSearchBodyResponse {
    private final String id;
    private final String index;
    private final double score;
    private final int sortOrder;
    private final Source source;
    private final String type;

    public TextSearchBodyResponse(@JsonProperty("_id") String str, @JsonProperty("_index") String str2, @JsonProperty("_score") double d, @JsonProperty("sort_order") int i, @JsonProperty("_source") Source source, @JsonProperty("_type") String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(source, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.id = str;
        this.index = str2;
        this.score = d;
        this.sortOrder = i;
        this.source = source;
        this.type = str3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIndex() {
        return this.index;
    }

    public final double getScore() {
        return this.score;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final Source getSource() {
        return this.source;
    }

    public final String getType() {
        return this.type;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012Jn\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0010R\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0014R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0010R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u0010R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010\u0010R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u0010R\u001a\u00102\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010\u0012"}, d2 = {"Lcom/marrow/data/api/models/response/search/TextSearchBodyResponse$Source;", "", "", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/marrow/data/api/models/response/search/TextSearchBodyResponse$Source;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "contentType", "Ljava/lang/String;", "getContentType", "videoStartTime", "I", "getVideoStartTime", "rootSubjectIds", "Ljava/util/List;", "getRootSubjectIds", "videoId", "getVideoId", "title", "getTitle", "subTitle", "getSubTitle", "testType", "getTestType", "pytMcqCount", "getPytMcqCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Source {
        private final String contentType;
        private final int pytMcqCount;
        private final List<String> rootSubjectIds;
        private final String subTitle;
        private final String testType;
        private final String title;
        private final String videoId;
        private final int videoStartTime;

        public Source(@JsonProperty("content_type") String str, @JsonProperty("start_time") int i, @JsonProperty(PearlMini.KEY_ROOT_SUBJECT_IDS) List<String> list, @JsonProperty("video_id") String str2, @JsonProperty("title") String str3, @JsonProperty("title_prefix") String str4, @JsonProperty("test_type") String str5, @JsonProperty("hyvt_mcq_count") int i2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.contentType = str;
            this.videoStartTime = i;
            this.rootSubjectIds = list;
            this.videoId = str2;
            this.title = str3;
            this.subTitle = str4;
            this.testType = str5;
            this.pytMcqCount = i2;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final int getVideoStartTime() {
            return this.videoStartTime;
        }

        public /* synthetic */ Source(String str, int i, List list, String str2, String str3, String str4, String str5, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, str2, str3, str4, str5, (i3 & 128) != 0 ? 0 : i2);
        }

        public final List<String> getRootSubjectIds() {
            return this.rootSubjectIds;
        }

        public final String getVideoId() {
            return this.videoId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        public final String getTestType() {
            return this.testType;
        }

        public final int getPytMcqCount() {
            return this.pytMcqCount;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getVideoStartTime() {
            return this.videoStartTime;
        }

        public final List<String> component3() {
            return this.rootSubjectIds;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVideoId() {
            return this.videoId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSubTitle() {
            return this.subTitle;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getPytMcqCount() {
            return this.pytMcqCount;
        }

        public final Source copy(@JsonProperty("content_type") String p0, @JsonProperty("start_time") int p1, @JsonProperty(PearlMini.KEY_ROOT_SUBJECT_IDS) List<String> p2, @JsonProperty("video_id") String p3, @JsonProperty("title") String p4, @JsonProperty("title_prefix") String p5, @JsonProperty("test_type") String p6, @JsonProperty("hyvt_mcq_count") int p7) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            return new Source(p0, p1, p2, p3, p4, p5, p6, p7);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Source)) {
                return false;
            }
            Source source = (Source) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentType, (Object) source.contentType) && this.videoStartTime == source.videoStartTime && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.rootSubjectIds, source.rootSubjectIds) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoId, (Object) source.videoId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) source.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subTitle, (Object) source.subTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testType, (Object) source.testType) && this.pytMcqCount == source.pytMcqCount;
        }

        public final int hashCode() {
            int iHashCode = this.contentType.hashCode();
            int iHashCode2 = Integer.hashCode(this.videoStartTime);
            List<String> list = this.rootSubjectIds;
            int iHashCode3 = list == null ? 0 : list.hashCode();
            String str = this.videoId;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            int iHashCode5 = this.title.hashCode();
            String str2 = this.subTitle;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.testType;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.pytMcqCount);
        }

        public final String toString() {
            String str = this.contentType;
            int i = this.videoStartTime;
            List<String> list = this.rootSubjectIds;
            String str2 = this.videoId;
            String str3 = this.title;
            String str4 = this.subTitle;
            String str5 = this.testType;
            int i2 = this.pytMcqCount;
            StringBuilder sb = new StringBuilder("Source(contentType=");
            sb.append(str);
            sb.append(", videoStartTime=");
            sb.append(i);
            sb.append(", rootSubjectIds=");
            sb.append(list);
            sb.append(", videoId=");
            sb.append(str2);
            sb.append(", title=");
            sb.append(str3);
            sb.append(", subTitle=");
            sb.append(str4);
            sb.append(", testType=");
            sb.append(str5);
            sb.append(", pytMcqCount=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static /* synthetic */ TextSearchBodyResponse copy$default(TextSearchBodyResponse textSearchBodyResponse, String str, String str2, double d, int i, Source source, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = textSearchBodyResponse.id;
        }
        if ((i2 & 2) != 0) {
            str2 = textSearchBodyResponse.index;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            d = textSearchBodyResponse.score;
        }
        double d2 = d;
        if ((i2 & 8) != 0) {
            i = textSearchBodyResponse.sortOrder;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            source = textSearchBodyResponse.source;
        }
        Source source2 = source;
        if ((i2 & 32) != 0) {
            str3 = textSearchBodyResponse.type;
        }
        return textSearchBodyResponse.copy(str, str4, d2, i3, source2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final TextSearchBodyResponse copy(@JsonProperty("_id") String p0, @JsonProperty("_index") String p1, @JsonProperty("_score") double p2, @JsonProperty("sort_order") int p3, @JsonProperty("_source") Source p4, @JsonProperty("_type") String p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new TextSearchBodyResponse(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TextSearchBodyResponse)) {
            return false;
        }
        TextSearchBodyResponse textSearchBodyResponse = (TextSearchBodyResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) textSearchBodyResponse.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.index, (Object) textSearchBodyResponse.index) && Double.compare(this.score, textSearchBodyResponse.score) == 0 && this.sortOrder == textSearchBodyResponse.sortOrder && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.source, textSearchBodyResponse.source) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.type, (Object) textSearchBodyResponse.type);
    }

    public final int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.index.hashCode()) * 31) + Double.hashCode(this.score)) * 31) + Integer.hashCode(this.sortOrder)) * 31) + this.source.hashCode()) * 31) + this.type.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.index;
        double d = this.score;
        int i = this.sortOrder;
        Source source = this.source;
        String str3 = this.type;
        StringBuilder sb = new StringBuilder("TextSearchBodyResponse(id=");
        sb.append(str);
        sb.append(", index=");
        sb.append(str2);
        sb.append(", score=");
        sb.append(d);
        sb.append(", sortOrder=");
        sb.append(i);
        sb.append(", source=");
        sb.append(source);
        sb.append(", type=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
