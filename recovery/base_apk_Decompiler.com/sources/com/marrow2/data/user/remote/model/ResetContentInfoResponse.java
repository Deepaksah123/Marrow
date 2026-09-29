package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse;", "", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentStatus;", "p0", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ScreenCopy;", "p1", "<init>", "(Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentStatus;Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ScreenCopy;)V", "component1", "()Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentStatus;", "component2", "()Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ScreenCopy;", "copy", "(Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentStatus;Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ScreenCopy;)Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "contentStatus", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentStatus;", "getContentStatus", "screenCopy", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ScreenCopy;", "getScreenCopy", "ContentStatus", "ScreenCopy", "UiContentCopy", "ContentResetInfo"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResetContentInfoResponse {
    public static final int $stable = 0;
    private final ContentStatus contentStatus;
    private final ScreenCopy screenCopy;

    public ResetContentInfoResponse(@JsonProperty("content_status") ContentStatus contentStatus, @JsonProperty("screen_copy") ScreenCopy screenCopy) {
        this.contentStatus = contentStatus;
        this.screenCopy = screenCopy;
    }

    public /* synthetic */ ResetContentInfoResponse(ContentStatus contentStatus, ScreenCopy screenCopy, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : contentStatus, (i & 2) != 0 ? null : screenCopy);
    }

    public final ContentStatus getContentStatus() {
        return this.contentStatus;
    }

    public final ScreenCopy getScreenCopy() {
        return this.screenCopy;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentStatus;", "", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;", "p0", "p1", "<init>", "(Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;)V", "component1", "()Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;", "component2", "copy", "(Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;)Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentStatus;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "lessonContentResetInfo", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;", "getLessonContentResetInfo", "bookmarkContentResetInfo", "getBookmarkContentResetInfo"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContentStatus {
        public static final int $stable = 0;
        private final ContentResetInfo bookmarkContentResetInfo;
        private final ContentResetInfo lessonContentResetInfo;

        public ContentStatus(@JsonProperty(CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON) ContentResetInfo contentResetInfo, @JsonProperty("bookmark") ContentResetInfo contentResetInfo2) {
            this.lessonContentResetInfo = contentResetInfo;
            this.bookmarkContentResetInfo = contentResetInfo2;
        }

        public /* synthetic */ ContentStatus(ContentResetInfo contentResetInfo, ContentResetInfo contentResetInfo2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : contentResetInfo, (i & 2) != 0 ? null : contentResetInfo2);
        }

        public final ContentResetInfo getLessonContentResetInfo() {
            return this.lessonContentResetInfo;
        }

        public final ContentResetInfo getBookmarkContentResetInfo() {
            return this.bookmarkContentResetInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContentStatus() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ContentStatus copy$default(ContentStatus contentStatus, ContentResetInfo contentResetInfo, ContentResetInfo contentResetInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                contentResetInfo = contentStatus.lessonContentResetInfo;
            }
            if ((i & 2) != 0) {
                contentResetInfo2 = contentStatus.bookmarkContentResetInfo;
            }
            return contentStatus.copy(contentResetInfo, contentResetInfo2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ContentResetInfo getLessonContentResetInfo() {
            return this.lessonContentResetInfo;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ContentResetInfo getBookmarkContentResetInfo() {
            return this.bookmarkContentResetInfo;
        }

        public final ContentStatus copy(@JsonProperty(CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON) ContentResetInfo p0, @JsonProperty("bookmark") ContentResetInfo p1) {
            return new ContentStatus(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof ContentStatus)) {
                return false;
            }
            ContentStatus contentStatus = (ContentStatus) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.lessonContentResetInfo, contentStatus.lessonContentResetInfo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.bookmarkContentResetInfo, contentStatus.bookmarkContentResetInfo);
        }

        public final int hashCode() {
            ContentResetInfo contentResetInfo = this.lessonContentResetInfo;
            int iHashCode = contentResetInfo == null ? 0 : contentResetInfo.hashCode();
            ContentResetInfo contentResetInfo2 = this.bookmarkContentResetInfo;
            return (iHashCode * 31) + (contentResetInfo2 != null ? contentResetInfo2.hashCode() : 0);
        }

        public final String toString() {
            ContentResetInfo contentResetInfo = this.lessonContentResetInfo;
            ContentResetInfo contentResetInfo2 = this.bookmarkContentResetInfo;
            StringBuilder sb = new StringBuilder("ContentStatus(lessonContentResetInfo=");
            sb.append(contentResetInfo);
            sb.append(", bookmarkContentResetInfo=");
            sb.append(contentResetInfo2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResetContentInfoResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ResetContentInfoResponse copy$default(ResetContentInfoResponse resetContentInfoResponse, ContentStatus contentStatus, ScreenCopy screenCopy, int i, Object obj) {
        if ((i & 1) != 0) {
            contentStatus = resetContentInfoResponse.contentStatus;
        }
        if ((i & 2) != 0) {
            screenCopy = resetContentInfoResponse.screenCopy;
        }
        return resetContentInfoResponse.copy(contentStatus, screenCopy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ContentStatus getContentStatus() {
        return this.contentStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScreenCopy getScreenCopy() {
        return this.screenCopy;
    }

    public final ResetContentInfoResponse copy(@JsonProperty("content_status") ContentStatus p0, @JsonProperty("screen_copy") ScreenCopy p1) {
        return new ResetContentInfoResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ResetContentInfoResponse)) {
            return false;
        }
        ResetContentInfoResponse resetContentInfoResponse = (ResetContentInfoResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.contentStatus, resetContentInfoResponse.contentStatus) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.screenCopy, resetContentInfoResponse.screenCopy);
    }

    public final int hashCode() {
        ContentStatus contentStatus = this.contentStatus;
        int iHashCode = contentStatus == null ? 0 : contentStatus.hashCode();
        ScreenCopy screenCopy = this.screenCopy;
        return (iHashCode * 31) + (screenCopy != null ? screenCopy.hashCode() : 0);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ScreenCopy;", "", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;", "p0", "p1", "p2", "", "p3", "<init>", "(Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;Ljava/lang/String;)V", "component1", "()Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;", "component2", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ScreenCopy;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "bookmarkContentUiCopy", "Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;", "getBookmarkContentUiCopy", "qBankContentUiCopy", "getQBankContentUiCopy", "qBankAndBookmarkContentUiCopy", "getQBankAndBookmarkContentUiCopy", "screenTitle", "Ljava/lang/String;", "getScreenTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScreenCopy {
        public static final int $stable = 0;
        private final UiContentCopy bookmarkContentUiCopy;
        private final UiContentCopy qBankAndBookmarkContentUiCopy;
        private final UiContentCopy qBankContentUiCopy;
        private final String screenTitle;

        public ScreenCopy(@JsonProperty("bookmarks_only") UiContentCopy uiContentCopy, @JsonProperty("qbank_only") UiContentCopy uiContentCopy2, @JsonProperty("qbank_bookmarks") UiContentCopy uiContentCopy3, @JsonProperty("screen_title") String str) {
            this.bookmarkContentUiCopy = uiContentCopy;
            this.qBankContentUiCopy = uiContentCopy2;
            this.qBankAndBookmarkContentUiCopy = uiContentCopy3;
            this.screenTitle = str;
        }

        public /* synthetic */ ScreenCopy(UiContentCopy uiContentCopy, UiContentCopy uiContentCopy2, UiContentCopy uiContentCopy3, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : uiContentCopy, (i & 2) != 0 ? null : uiContentCopy2, (i & 4) != 0 ? null : uiContentCopy3, (i & 8) != 0 ? null : str);
        }

        public final UiContentCopy getBookmarkContentUiCopy() {
            return this.bookmarkContentUiCopy;
        }

        public final UiContentCopy getQBankContentUiCopy() {
            return this.qBankContentUiCopy;
        }

        public final UiContentCopy getQBankAndBookmarkContentUiCopy() {
            return this.qBankAndBookmarkContentUiCopy;
        }

        public final String getScreenTitle() {
            return this.screenTitle;
        }

        public ScreenCopy() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ ScreenCopy copy$default(ScreenCopy screenCopy, UiContentCopy uiContentCopy, UiContentCopy uiContentCopy2, UiContentCopy uiContentCopy3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uiContentCopy = screenCopy.bookmarkContentUiCopy;
            }
            if ((i & 2) != 0) {
                uiContentCopy2 = screenCopy.qBankContentUiCopy;
            }
            if ((i & 4) != 0) {
                uiContentCopy3 = screenCopy.qBankAndBookmarkContentUiCopy;
            }
            if ((i & 8) != 0) {
                str = screenCopy.screenTitle;
            }
            return screenCopy.copy(uiContentCopy, uiContentCopy2, uiContentCopy3, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UiContentCopy getBookmarkContentUiCopy() {
            return this.bookmarkContentUiCopy;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final UiContentCopy getQBankContentUiCopy() {
            return this.qBankContentUiCopy;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final UiContentCopy getQBankAndBookmarkContentUiCopy() {
            return this.qBankAndBookmarkContentUiCopy;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getScreenTitle() {
            return this.screenTitle;
        }

        public final ScreenCopy copy(@JsonProperty("bookmarks_only") UiContentCopy p0, @JsonProperty("qbank_only") UiContentCopy p1, @JsonProperty("qbank_bookmarks") UiContentCopy p2, @JsonProperty("screen_title") String p3) {
            return new ScreenCopy(p0, p1, p2, p3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof ScreenCopy)) {
                return false;
            }
            ScreenCopy screenCopy = (ScreenCopy) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.bookmarkContentUiCopy, screenCopy.bookmarkContentUiCopy) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.qBankContentUiCopy, screenCopy.qBankContentUiCopy) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.qBankAndBookmarkContentUiCopy, screenCopy.qBankAndBookmarkContentUiCopy) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.screenTitle, (Object) screenCopy.screenTitle);
        }

        public final int hashCode() {
            UiContentCopy uiContentCopy = this.bookmarkContentUiCopy;
            int iHashCode = uiContentCopy == null ? 0 : uiContentCopy.hashCode();
            UiContentCopy uiContentCopy2 = this.qBankContentUiCopy;
            int iHashCode2 = uiContentCopy2 == null ? 0 : uiContentCopy2.hashCode();
            UiContentCopy uiContentCopy3 = this.qBankAndBookmarkContentUiCopy;
            int iHashCode3 = uiContentCopy3 == null ? 0 : uiContentCopy3.hashCode();
            String str = this.screenTitle;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            UiContentCopy uiContentCopy = this.bookmarkContentUiCopy;
            UiContentCopy uiContentCopy2 = this.qBankContentUiCopy;
            UiContentCopy uiContentCopy3 = this.qBankAndBookmarkContentUiCopy;
            String str = this.screenTitle;
            StringBuilder sb = new StringBuilder("ScreenCopy(bookmarkContentUiCopy=");
            sb.append(uiContentCopy);
            sb.append(", qBankContentUiCopy=");
            sb.append(uiContentCopy2);
            sb.append(", qBankAndBookmarkContentUiCopy=");
            sb.append(uiContentCopy3);
            sb.append(", screenTitle=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public final String toString() {
        ContentStatus contentStatus = this.contentStatus;
        ScreenCopy screenCopy = this.screenCopy;
        StringBuilder sb = new StringBuilder("ResetContentInfoResponse(contentStatus=");
        sb.append(contentStatus);
        sb.append(", screenCopy=");
        sb.append(screenCopy);
        sb.append(")");
        return sb.toString();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$UiContentCopy;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "description", "Ljava/lang/String;", "getDescription", "title", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UiContentCopy {
        public static final int $stable = 0;
        private final String description;
        private final String title;

        public UiContentCopy(@JsonProperty("description") String str, @JsonProperty("title") String str2) {
            this.description = str;
            this.title = str2;
        }

        public /* synthetic */ UiContentCopy(String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UiContentCopy() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UiContentCopy copy$default(UiContentCopy uiContentCopy, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiContentCopy.description;
            }
            if ((i & 2) != 0) {
                str2 = uiContentCopy.title;
            }
            return uiContentCopy.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final UiContentCopy copy(@JsonProperty("description") String p0, @JsonProperty("title") String p1) {
            return new UiContentCopy(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof UiContentCopy)) {
                return false;
            }
            UiContentCopy uiContentCopy = (UiContentCopy) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) uiContentCopy.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) uiContentCopy.title);
        }

        public final int hashCode() {
            String str = this.description;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.description;
            String str2 = this.title;
            StringBuilder sb = new StringBuilder("UiContentCopy(description=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/marrow2/data/user/remote/model/ResetContentInfoResponse$ContentResetInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "allowResetAfter", "Ljava/lang/Long;", "getAllowResetAfter", "lastResettedOn", "getLastResettedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContentResetInfo {
        public static final int $stable = 0;
        private final Long allowResetAfter;
        private final Long lastResettedOn;

        public ContentResetInfo(@JsonProperty("allow_reset_after") Long l, @JsonProperty("last_resetted_on") Long l2) {
            this.allowResetAfter = l;
            this.lastResettedOn = l2;
        }

        public /* synthetic */ ContentResetInfo(Long l, Long l2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
        }

        public final Long getAllowResetAfter() {
            return this.allowResetAfter;
        }

        public final Long getLastResettedOn() {
            return this.lastResettedOn;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContentResetInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ContentResetInfo copy$default(ContentResetInfo contentResetInfo, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = contentResetInfo.allowResetAfter;
            }
            if ((i & 2) != 0) {
                l2 = contentResetInfo.lastResettedOn;
            }
            return contentResetInfo.copy(l, l2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getAllowResetAfter() {
            return this.allowResetAfter;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getLastResettedOn() {
            return this.lastResettedOn;
        }

        public final ContentResetInfo copy(@JsonProperty("allow_reset_after") Long p0, @JsonProperty("last_resetted_on") Long p1) {
            return new ContentResetInfo(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof ContentResetInfo)) {
                return false;
            }
            ContentResetInfo contentResetInfo = (ContentResetInfo) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.allowResetAfter, contentResetInfo.allowResetAfter) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.lastResettedOn, contentResetInfo.lastResettedOn);
        }

        public final int hashCode() {
            Long l = this.allowResetAfter;
            int iHashCode = l == null ? 0 : l.hashCode();
            Long l2 = this.lastResettedOn;
            return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
        }

        public final String toString() {
            Long l = this.allowResetAfter;
            Long l2 = this.lastResettedOn;
            StringBuilder sb = new StringBuilder("ContentResetInfo(allowResetAfter=");
            sb.append(l);
            sb.append(", lastResettedOn=");
            sb.append(l2);
            sb.append(")");
            return sb.toString();
        }
    }
}
