package com.marrow2.data.feedback.remote.model;

import com.google.android.exoplayer2.offline.DownloadService;
import kotlin.CmcdHeadersFactoryStreamType;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f"}, d2 = {"Lcom/marrow2/data/feedback/remote/model/FeedbackRequestBody;", "Lo/CmcdHeadersFactoryStreamType;", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "courseId", "I", "getCourseId", "()I", "content_type", "Ljava/lang/String;", "getContent_type", "()Ljava/lang/String;", DownloadService.KEY_CONTENT_ID, "getContent_id", "title", "getTitle", "description", "getDescription", "feedback_type", "getFeedback_type"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeedbackRequestBody extends CmcdHeadersFactoryStreamType {
    public static final int $stable = 8;
    private final String content_id;
    private final String content_type;
    private final int courseId;
    private final String description;
    private final int feedback_type;
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackRequestBody(int i, String str, String str2, String str3, String str4, int i2) {
        super(String.valueOf(i));
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.courseId = i;
        this.content_type = str;
        this.content_id = str2;
        this.title = str3;
        this.description = str4;
        this.feedback_type = i2;
    }

    public /* synthetic */ FeedbackRequestBody(int i, String str, String str2, String str3, String str4, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, str, str2, str3, str4, (i3 & 32) != 0 ? 1 : i2);
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final String getContent_id() {
        return this.content_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getFeedback_type() {
        return this.feedback_type;
    }
}
