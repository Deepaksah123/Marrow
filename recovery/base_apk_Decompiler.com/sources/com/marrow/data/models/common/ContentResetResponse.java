package com.marrow.data.models.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/marrow/data/models/common/ContentResetResponse;", "", "Lcom/marrow/data/models/common/ContentResetResponse$Bookmark;", "p0", "Lcom/marrow/data/models/common/ContentResetResponse$Lesson;", "p1", "<init>", "(Lcom/marrow/data/models/common/ContentResetResponse$Bookmark;Lcom/marrow/data/models/common/ContentResetResponse$Lesson;)V", "component1", "()Lcom/marrow/data/models/common/ContentResetResponse$Bookmark;", "component2", "()Lcom/marrow/data/models/common/ContentResetResponse$Lesson;", "copy", "(Lcom/marrow/data/models/common/ContentResetResponse$Bookmark;Lcom/marrow/data/models/common/ContentResetResponse$Lesson;)Lcom/marrow/data/models/common/ContentResetResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "bookmark", "Lcom/marrow/data/models/common/ContentResetResponse$Bookmark;", "getBookmark", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "Lcom/marrow/data/models/common/ContentResetResponse$Lesson;", "getLesson", "Bookmark", "Lesson"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContentResetResponse {
    private final Bookmark bookmark;
    private final Lesson lesson;

    public ContentResetResponse(Bookmark bookmark, Lesson lesson) {
        toMagicModuleMetaRepoModel.write(bookmark, "");
        toMagicModuleMetaRepoModel.write(lesson, "");
        this.bookmark = bookmark;
        this.lesson = lesson;
    }

    public /* synthetic */ ContentResetResponse(Bookmark bookmark, Lesson lesson, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new Bookmark(0L, 0L, 3, null) : bookmark, (i & 2) != 0 ? new Lesson(0L, 0L, 3, null) : lesson);
    }

    @JsonProperty("bookmark")
    public final Bookmark getBookmark() {
        return this.bookmark;
    }

    @JsonProperty(CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON)
    public final Lesson getLesson() {
        return this.lesson;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/marrow/data/models/common/ContentResetResponse$Bookmark;", "", "", "p0", "p1", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/marrow/data/models/common/ContentResetResponse$Bookmark;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "allowResetAfter", "J", "getAllowResetAfter", "lastResettedOn", "getLastResettedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bookmark {
        private final long allowResetAfter;
        private final long lastResettedOn;

        public Bookmark(long j, long j2) {
            this.allowResetAfter = j;
            this.lastResettedOn = j2;
        }

        public /* synthetic */ Bookmark(long j, long j2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
        }

        @JsonProperty("allow_reset_after")
        public final long getAllowResetAfter() {
            return this.allowResetAfter;
        }

        @JsonProperty("last_resetted_on")
        public final long getLastResettedOn() {
            return this.lastResettedOn;
        }

        public Bookmark() {
            this(0L, 0L, 3, null);
        }

        public static /* synthetic */ Bookmark copy$default(Bookmark bookmark, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bookmark.allowResetAfter;
            }
            if ((i & 2) != 0) {
                j2 = bookmark.lastResettedOn;
            }
            return bookmark.copy(j, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getAllowResetAfter() {
            return this.allowResetAfter;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getLastResettedOn() {
            return this.lastResettedOn;
        }

        public final Bookmark copy(long p0, long p1) {
            return new Bookmark(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Bookmark)) {
                return false;
            }
            Bookmark bookmark = (Bookmark) p0;
            return this.allowResetAfter == bookmark.allowResetAfter && this.lastResettedOn == bookmark.lastResettedOn;
        }

        public final int hashCode() {
            return (Long.hashCode(this.allowResetAfter) * 31) + Long.hashCode(this.lastResettedOn);
        }

        public final String toString() {
            long j = this.allowResetAfter;
            long j2 = this.lastResettedOn;
            StringBuilder sb = new StringBuilder("Bookmark(allowResetAfter=");
            sb.append(j);
            sb.append(", lastResettedOn=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentResetResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContentResetResponse copy$default(ContentResetResponse contentResetResponse, Bookmark bookmark, Lesson lesson, int i, Object obj) {
        if ((i & 1) != 0) {
            bookmark = contentResetResponse.bookmark;
        }
        if ((i & 2) != 0) {
            lesson = contentResetResponse.lesson;
        }
        return contentResetResponse.copy(bookmark, lesson);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bookmark getBookmark() {
        return this.bookmark;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Lesson getLesson() {
        return this.lesson;
    }

    public final ContentResetResponse copy(Bookmark p0, Lesson p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new ContentResetResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ContentResetResponse)) {
            return false;
        }
        ContentResetResponse contentResetResponse = (ContentResetResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.bookmark, contentResetResponse.bookmark) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.lesson, contentResetResponse.lesson);
    }

    public final int hashCode() {
        return (this.bookmark.hashCode() * 31) + this.lesson.hashCode();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/marrow/data/models/common/ContentResetResponse$Lesson;", "", "", "p0", "p1", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/marrow/data/models/common/ContentResetResponse$Lesson;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "allowResetAfter", "J", "getAllowResetAfter", "lastResettedOn", "getLastResettedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Lesson {
        private final long allowResetAfter;
        private final long lastResettedOn;

        public Lesson(long j, long j2) {
            this.allowResetAfter = j;
            this.lastResettedOn = j2;
        }

        public /* synthetic */ Lesson(long j, long j2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
        }

        @JsonProperty("allow_reset_after")
        public final long getAllowResetAfter() {
            return this.allowResetAfter;
        }

        @JsonProperty("last_resetted_on")
        public final long getLastResettedOn() {
            return this.lastResettedOn;
        }

        public Lesson() {
            this(0L, 0L, 3, null);
        }

        public static /* synthetic */ Lesson copy$default(Lesson lesson, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = lesson.allowResetAfter;
            }
            if ((i & 2) != 0) {
                j2 = lesson.lastResettedOn;
            }
            return lesson.copy(j, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getAllowResetAfter() {
            return this.allowResetAfter;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getLastResettedOn() {
            return this.lastResettedOn;
        }

        public final Lesson copy(long p0, long p1) {
            return new Lesson(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Lesson)) {
                return false;
            }
            Lesson lesson = (Lesson) p0;
            return this.allowResetAfter == lesson.allowResetAfter && this.lastResettedOn == lesson.lastResettedOn;
        }

        public final int hashCode() {
            return (Long.hashCode(this.allowResetAfter) * 31) + Long.hashCode(this.lastResettedOn);
        }

        public final String toString() {
            long j = this.allowResetAfter;
            long j2 = this.lastResettedOn;
            StringBuilder sb = new StringBuilder("Lesson(allowResetAfter=");
            sb.append(j);
            sb.append(", lastResettedOn=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }
    }

    public final String toString() {
        Bookmark bookmark = this.bookmark;
        Lesson lesson = this.lesson;
        StringBuilder sb = new StringBuilder("ContentResetResponse(bookmark=");
        sb.append(bookmark);
        sb.append(", lesson=");
        sb.append(lesson);
        sb.append(")");
        return sb.toString();
    }
}
