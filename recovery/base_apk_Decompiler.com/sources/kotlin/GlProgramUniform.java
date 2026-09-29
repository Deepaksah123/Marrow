package kotlin;

import com.marrow2.data.test.remote.model.RankPairModel;
import com.marrow2.data.test.remote.model.TestStatModel;
import com.marrow2.data.test.remote.model.TestSubjectStatModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0019R\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b#\u0010\u0019R\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0019R\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010\u0019R\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b$\u0010'R\"\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001c\u0010.\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b(\u0010-"}, d2 = {"Lo/GlProgramUniform;", "", "", "p0", "", "p1", "p2", "p3", "", "Lcom/marrow2/data/test/remote/model/RankPairModel;", "p4", "p5", "p6", "p7", "Lcom/marrow2/data/test/remote/model/TestSubjectStatModel;", "p8", "p9", "Lcom/marrow2/data/test/remote/model/TestStatModel;", "p10", "<init>", "(Ljava/lang/String;IIILjava/util/List;IIILjava/util/List;Ljava/util/List;Lcom/marrow2/data/test/remote/model/TestStatModel;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "read", "I", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "()Ljava/util/List;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatSearchResultReceiver", "RatingCompat", "Lcom/marrow2/data/test/remote/model/TestStatModel;", "()Lcom/marrow2/data/test/remote/model/TestStatModel;", "MediaMetadataCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GlProgramUniform {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final TestStatModel MediaMetadataCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private List<TestSubjectStatModel> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private List<RankPairModel> write;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private List<TestSubjectStatModel> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public GlProgramUniform(String str, int i, int i2, int i3, List<RankPairModel> list, int i4, int i5, int i6, List<TestSubjectStatModel> list2, List<TestSubjectStatModel> list3, TestStatModel testStatModel) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.write = list;
        this.MediaBrowserCompatItemReceiver = i4;
        this.AudioAttributesImplApi26Parcelizer = i5;
        this.MediaBrowserCompatCustomActionResultReceiver = i6;
        this.AudioAttributesImplApi21Parcelizer = list2;
        this.AudioAttributesImplBaseParcelizer = list3;
        this.MediaMetadataCompat = testStatModel;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<RankPairModel> AudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final List<TestSubjectStatModel> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final List<TestSubjectStatModel> RatingCompat() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final TestStatModel getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GlProgramUniform)) {
            return false;
        }
        GlProgramUniform glProgramUniform = (GlProgramUniform) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) glProgramUniform.RemoteActionCompatParcelizer) && this.read == glProgramUniform.read && this.IconCompatParcelizer == glProgramUniform.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == glProgramUniform.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, glProgramUniform.write) && this.MediaBrowserCompatItemReceiver == glProgramUniform.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi26Parcelizer == glProgramUniform.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == glProgramUniform.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, glProgramUniform.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, glProgramUniform.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, glProgramUniform.MediaMetadataCompat);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = Integer.hashCode(this.read);
        int iHashCode3 = Integer.hashCode(this.IconCompatParcelizer);
        int iHashCode4 = Integer.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode5 = this.write.hashCode();
        int iHashCode6 = Integer.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode7 = Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode8 = Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode9 = this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode10 = this.AudioAttributesImplBaseParcelizer.hashCode();
        TestStatModel testStatModel = this.MediaMetadataCompat;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (testStatModel == null ? 0 : testStatModel.hashCode());
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        int i = this.read;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.AudioAttributesCompatParcelizer;
        List<RankPairModel> list = this.write;
        int i4 = this.MediaBrowserCompatItemReceiver;
        int i5 = this.AudioAttributesImplApi26Parcelizer;
        int i6 = this.MediaBrowserCompatCustomActionResultReceiver;
        List<TestSubjectStatModel> list2 = this.AudioAttributesImplApi21Parcelizer;
        List<TestSubjectStatModel> list3 = this.AudioAttributesImplBaseParcelizer;
        TestStatModel testStatModel = this.MediaMetadataCompat;
        StringBuilder sb = new StringBuilder("GlProgramUniform(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(i);
        sb.append(", IconCompatParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i3);
        sb.append(", write=");
        sb.append(list);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i4);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i5);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i6);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(list2);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(list3);
        sb.append(", MediaMetadataCompat=");
        sb.append(testStatModel);
        sb.append(")");
        return sb.toString();
    }
}
