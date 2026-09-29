package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;
import kotlin.getOrderDetails;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017Jr\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0019R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001bR\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010\u0017R\u001a\u00105\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u0010\u001eR\u001c\u00107\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010 R\u001a\u0010:\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u0010\u0019R\u001a\u0010<\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010\u0017R\u001a\u0010>\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010\u0017"}, d2 = {"Lcom/marrow2/data/user/remote/model/CourseModelV3;", "", "", "p0", "", "p1", "", "Lcom/marrow2/data/user/remote/model/EditionsModelV3;", "p2", "p3", "", "p4", "Lcom/marrow2/data/user/remote/model/LearnMoreModelV3;", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;ZLcom/marrow2/data/user/remote/model/LearnMoreModelV3;ILjava/lang/String;Ljava/lang/String;)V", "Lcom/marrow2/data/user/remote/model/CourseModelV3$CollegeCategory;", "getCollegeCategoryVal", "()Lcom/marrow2/data/user/remote/model/CourseModelV3$CollegeCategory;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "component5", "()Z", "component6", "()Lcom/marrow2/data/user/remote/model/LearnMoreModelV3;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;ZLcom/marrow2/data/user/remote/model/LearnMoreModelV3;ILjava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/CourseModelV3;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "collegeCategory", "Ljava/lang/String;", "getCollegeCategory", "courseSection", "I", "getCourseSection", CourseResponseKeyConstantsKt.KEY_EDITIONS, "Ljava/util/List;", "getEditions", "courseId", "getCourseId", "isNew", "Z", "learnMore", "Lcom/marrow2/data/user/remote/model/LearnMoreModelV3;", "getLearnMore", "sortOrder", "getSortOrder", "subTitle", "getSubTitle", "title", "getTitle", "Companion", "CollegeCategory"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CourseModelV3 {

    @JsonProperty("college_category")
    private final String collegeCategory;

    @JsonProperty("id")
    private final String courseId;

    @JsonProperty("course_section")
    private final int courseSection;

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_EDITIONS)
    private final List<EditionsModelV3> editions;

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_IS_NEW)
    private final boolean isNew;

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_LEARN_MORE)
    private final LearnMoreModelV3 learnMore;

    @JsonProperty("sort_order")
    private final int sortOrder;

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_SUBTITLE)
    private final String subTitle;

    @JsonProperty("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CourseModelV3(String str, int i, List<EditionsModelV3> list, String str2, boolean z, LearnMoreModelV3 learnMoreModelV3, int i2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.collegeCategory = str;
        this.courseSection = i;
        this.editions = list;
        this.courseId = str2;
        this.isNew = z;
        this.learnMore = learnMoreModelV3;
        this.sortOrder = i2;
        this.subTitle = str3;
        this.title = str4;
    }

    public /* synthetic */ CourseModelV3(String str, int i, List list, String str2, boolean z, LearnMoreModelV3 learnMoreModelV3, int i2, String str3, String str4, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? new LearnMoreModelV3(null, null, 3, null) : learnMoreModelV3, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? "" : str4);
    }

    public final String getCollegeCategory() {
        return this.collegeCategory;
    }

    public final int getCourseSection() {
        return this.courseSection;
    }

    public final List<EditionsModelV3> getEditions() {
        return this.editions;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final LearnMoreModelV3 getLearnMore() {
        return this.learnMore;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/marrow2/data/user/remote/model/CourseModelV3$CollegeCategory;", "", "<init>", "(Ljava/lang/String;I)V", "UG", "PG"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CollegeCategory {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ CollegeCategory[] $VALUES;
        public static final CollegeCategory UG = new CollegeCategory("UG", 0);
        public static final CollegeCategory PG = new CollegeCategory("PG", 1);

        private CollegeCategory(String str, int i) {
        }

        static {
            CollegeCategory[] collegeCategoryArr$values = $values();
            $VALUES = collegeCategoryArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(collegeCategoryArr$values);
        }

        private static final /* synthetic */ CollegeCategory[] $values() {
            return new CollegeCategory[]{UG, PG};
        }

        public static getMagicModuleSavedMcqCount<CollegeCategory> getEntries() {
            return $ENTRIES;
        }

        public static CollegeCategory valueOf(String str) {
            return (CollegeCategory) Enum.valueOf(CollegeCategory.class, str);
        }

        public static CollegeCategory[] values() {
            return (CollegeCategory[]) $VALUES.clone();
        }
    }

    public final CollegeCategory getCollegeCategoryVal() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.collegeCategory, (Object) "pg")) {
            return CollegeCategory.PG;
        }
        return CollegeCategory.UG;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/marrow2/data/user/remote/model/CourseModelV3$Companion;", "", "<init>", "()V", "", "p0", "", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "fromJson", "(Ljava/lang/String;)Ljava/util/List;", "toJson", "(Ljava/util/List;)Ljava/lang/String;", "", "p1", "getCourseNameWithEdition", "(Ljava/util/List;II)Ljava/lang/String;", "", "hasNewCourse", "(Ljava/util/List;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<CourseModelV3> fromJson(String p0) throws JsonProcessingException {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object value = new ObjectMapper().readValue(p0, (Class<Object>) CourseModelV3[].class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
            return getOrderDetails.onCommand((Object[]) value);
        }

        public final String toJson(List<CourseModelV3> list) throws JsonProcessingException {
            toMagicModuleMetaRepoModel.write(list, "");
            String strWriteValueAsString = new ObjectMapper().writeValueAsString(list.toArray(new CourseModelV3[0]));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWriteValueAsString, "");
            return strWriteValueAsString;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String getCourseNameWithEdition(java.util.List<com.marrow2.data.user.remote.model.CourseModelV3> r4, int r5, int r6) {
            /*
                r3 = this;
                java.lang.String r3 = ""
                kotlin.toMagicModuleMetaRepoModel.write(r4, r3)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            Lb:
                boolean r0 = r4.hasNext()
                r1 = 0
                if (r0 == 0) goto L24
                java.lang.Object r0 = r4.next()
                r2 = r0
                com.marrow2.data.user.remote.model.CourseModelV3 r2 = (com.marrow2.data.user.remote.model.CourseModelV3) r2
                java.lang.String r2 = r2.getCourseId()
                int r2 = java.lang.Integer.parseInt(r2)
                if (r2 != r5) goto Lb
                goto L25
            L24:
                r0 = r1
            L25:
                com.marrow2.data.user.remote.model.CourseModelV3 r0 = (com.marrow2.data.user.remote.model.CourseModelV3) r0
                if (r0 == 0) goto L59
                java.util.List r4 = r0.getEditions()
                if (r4 == 0) goto L59
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L35:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L4f
                java.lang.Object r5 = r4.next()
                r2 = r5
                com.marrow2.data.user.remote.model.EditionsModelV3 r2 = (com.marrow2.data.user.remote.model.EditionsModelV3) r2
                java.lang.Integer r2 = r2.getId()
                if (r2 == 0) goto L35
                int r2 = r2.intValue()
                if (r2 != r6) goto L35
                goto L50
            L4f:
                r5 = r1
            L50:
                com.marrow2.data.user.remote.model.EditionsModelV3 r5 = (com.marrow2.data.user.remote.model.EditionsModelV3) r5
                if (r5 == 0) goto L59
                java.lang.String r4 = r5.getTitle()
                goto L5a
            L59:
                r4 = r1
            L5a:
                if (r4 != 0) goto L5d
                r4 = r3
            L5d:
                if (r0 == 0) goto L63
                java.lang.String r1 = r0.getTitle()
            L63:
                if (r1 != 0) goto L66
                goto L67
            L66:
                r3 = r1
            L67:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                java.lang.String r3 = " "
                r5.append(r3)
                r5.append(r4)
                java.lang.String r3 = r5.toString()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.CharSequence r3 = kotlin.TestGroupLSModel.AudioAttributesImplApi26Parcelizer(r3)
                java.lang.String r3 = r3.toString()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.data.user.remote.model.CourseModelV3.Companion.getCourseNameWithEdition(java.util.List, int, int):java.lang.String");
        }

        public final boolean hasNewCourse(List<CourseModelV3> list) {
            Object next;
            toMagicModuleMetaRepoModel.write(list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CourseModelV3) next).isNew()) {
                    break;
                }
            }
            return next != null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public CourseModelV3() {
        this(null, 0, null, null, false, null, 0, null, null, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCollegeCategory() {
        return this.collegeCategory;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseSection() {
        return this.courseSection;
    }

    public final List<EditionsModelV3> component3() {
        return this.editions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LearnMoreModelV3 getLearnMore() {
        return this.learnMore;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final CourseModelV3 copy(String p0, int p1, List<EditionsModelV3> p2, String p3, boolean p4, LearnMoreModelV3 p5, int p6, String p7, String p8) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        toMagicModuleMetaRepoModel.write(p8, "");
        return new CourseModelV3(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CourseModelV3)) {
            return false;
        }
        CourseModelV3 courseModelV3 = (CourseModelV3) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.collegeCategory, (Object) courseModelV3.collegeCategory) && this.courseSection == courseModelV3.courseSection && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.editions, courseModelV3.editions) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) courseModelV3.courseId) && this.isNew == courseModelV3.isNew && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.learnMore, courseModelV3.learnMore) && this.sortOrder == courseModelV3.sortOrder && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subTitle, (Object) courseModelV3.subTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) courseModelV3.title);
    }

    public final int hashCode() {
        int iHashCode = this.collegeCategory.hashCode();
        int iHashCode2 = Integer.hashCode(this.courseSection);
        int iHashCode3 = this.editions.hashCode();
        int iHashCode4 = this.courseId.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isNew);
        LearnMoreModelV3 learnMoreModelV3 = this.learnMore;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (learnMoreModelV3 == null ? 0 : learnMoreModelV3.hashCode())) * 31) + Integer.hashCode(this.sortOrder)) * 31) + this.subTitle.hashCode()) * 31) + this.title.hashCode();
    }

    public final String toString() {
        String str = this.collegeCategory;
        int i = this.courseSection;
        List<EditionsModelV3> list = this.editions;
        String str2 = this.courseId;
        boolean z = this.isNew;
        LearnMoreModelV3 learnMoreModelV3 = this.learnMore;
        int i2 = this.sortOrder;
        String str3 = this.subTitle;
        String str4 = this.title;
        StringBuilder sb = new StringBuilder("CourseModelV3(collegeCategory=");
        sb.append(str);
        sb.append(", courseSection=");
        sb.append(i);
        sb.append(", editions=");
        sb.append(list);
        sb.append(", courseId=");
        sb.append(str2);
        sb.append(", isNew=");
        sb.append(z);
        sb.append(", learnMore=");
        sb.append(learnMoreModelV3);
        sb.append(", sortOrder=");
        sb.append(i2);
        sb.append(", subTitle=");
        sb.append(str3);
        sb.append(", title=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
