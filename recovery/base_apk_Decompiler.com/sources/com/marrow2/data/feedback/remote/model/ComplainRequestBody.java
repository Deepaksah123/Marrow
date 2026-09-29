package com.marrow2.data.feedback.remote.model;

import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jz\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0012R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010\u0012R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001aR\u001a\u00106\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u0010\u0017R\u001a\u00108\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u0010\u0017R\u001a\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b;\u0010\u0012"}, d2 = {"Lcom/marrow2/data/feedback/remote/model/ComplainRequestBody;", "", "", "p0", "p1", "p2", "p3", "", "p4", "p5", "", "p6", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IILjava/lang/String;)Lcom/marrow2/data/feedback/remote/model/ComplainRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "contentId", "Ljava/lang/String;", "getContentId", DownloadService.KEY_CONTENT_ID, "getContent_id", "contentType", "getContentType", "content_type", "getContent_type", FilterParams.KEY_COURSE_ID, "I", "getCourse_id", "description", "getDescription", "error_types", "Ljava/util/List;", "getError_types", "feedback_type", "getFeedback_type", "type", "getType", "title", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComplainRequestBody {
    public static final int $stable = 8;
    private final String contentId;
    private final String contentType;
    private final String content_id;
    private final String content_type;
    private final int course_id;
    private final String description;
    private final List<Integer> error_types;
    private final int feedback_type;
    private final String title;
    private final int type;

    public ComplainRequestBody(String str, String str2, String str3, String str4, int i, String str5, List<Integer> list, int i2, int i3, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.contentId = str;
        this.content_id = str2;
        this.contentType = str3;
        this.content_type = str4;
        this.course_id = i;
        this.description = str5;
        this.error_types = list;
        this.feedback_type = i2;
        this.type = i3;
        this.title = str6;
    }

    public /* synthetic */ ComplainRequestBody(String str, String str2, String str3, String str4, int i, String str5, List list, int i2, int i3, String str6, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, str3, str4, i, str5, list, (i4 & 128) != 0 ? 2 : i2, (i4 & 256) != 0 ? 2 : i3, str6);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContent_id() {
        return this.content_id;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final int getCourse_id() {
        return this.course_id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<Integer> getError_types() {
        return this.error_types;
    }

    public final int getFeedback_type() {
        return this.feedback_type;
    }

    public final int getType() {
        return this.type;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent_id() {
        return this.content_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent_type() {
        return this.content_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCourse_id() {
        return this.course_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<Integer> component7() {
        return this.error_types;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFeedback_type() {
        return this.feedback_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final ComplainRequestBody copy(String p0, String p1, String p2, String p3, int p4, String p5, List<Integer> p6, int p7, int p8, String p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        return new ComplainRequestBody(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ComplainRequestBody)) {
            return false;
        }
        ComplainRequestBody complainRequestBody = (ComplainRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentId, (Object) complainRequestBody.contentId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.content_id, (Object) complainRequestBody.content_id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentType, (Object) complainRequestBody.contentType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.content_type, (Object) complainRequestBody.content_type) && this.course_id == complainRequestBody.course_id && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) complainRequestBody.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.error_types, complainRequestBody.error_types) && this.feedback_type == complainRequestBody.feedback_type && this.type == complainRequestBody.type && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) complainRequestBody.title);
    }

    public final int hashCode() {
        return (((((((((((((((((this.contentId.hashCode() * 31) + this.content_id.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.content_type.hashCode()) * 31) + Integer.hashCode(this.course_id)) * 31) + this.description.hashCode()) * 31) + this.error_types.hashCode()) * 31) + Integer.hashCode(this.feedback_type)) * 31) + Integer.hashCode(this.type)) * 31) + this.title.hashCode();
    }

    public final String toString() {
        String str = this.contentId;
        String str2 = this.content_id;
        String str3 = this.contentType;
        String str4 = this.content_type;
        int i = this.course_id;
        String str5 = this.description;
        List<Integer> list = this.error_types;
        int i2 = this.feedback_type;
        int i3 = this.type;
        String str6 = this.title;
        StringBuilder sb = new StringBuilder("ComplainRequestBody(contentId=");
        sb.append(str);
        sb.append(", content_id=");
        sb.append(str2);
        sb.append(", contentType=");
        sb.append(str3);
        sb.append(", content_type=");
        sb.append(str4);
        sb.append(", course_id=");
        sb.append(i);
        sb.append(", description=");
        sb.append(str5);
        sb.append(", error_types=");
        sb.append(list);
        sb.append(", feedback_type=");
        sb.append(i2);
        sb.append(", type=");
        sb.append(i3);
        sb.append(", title=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
