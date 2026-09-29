package kotlin;

import com.marrow2.data.test.remote.model.RankPairModel;
import com.marrow2.data.test.remote.model.TestStatModel;
import com.marrow2.data.test.remote.model.TestSubjectStatModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b#\u0010\u0019R\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010\u0019R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0019R\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b%\u0010+R\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+"}, d2 = {"Lo/inferFileTypeFromMimeType;", "", "", "p0", "", "p1", "p2", "p3", "Lcom/marrow2/data/test/remote/model/TestStatModel;", "p4", "", "Lcom/marrow2/data/test/remote/model/RankPairModel;", "p5", "p6", "p7", "p8", "Lcom/marrow2/data/test/remote/model/TestSubjectStatModel;", "p9", "p10", "<init>", "(Ljava/lang/String;IIILcom/marrow2/data/test/remote/model/TestStatModel;Ljava/util/List;IIILjava/util/List;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "write", "I", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "AudioAttributesImplApi26Parcelizer", "Lcom/marrow2/data/test/remote/model/TestStatModel;", "AudioAttributesImplBaseParcelizer", "()Lcom/marrow2/data/test/remote/model/TestStatModel;", "Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/util/List;", "MediaMetadataCompat", "RatingCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class inferFileTypeFromMimeType {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final TestStatModel write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private List<RankPairModel> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private List<TestSubjectStatModel> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private List<TestSubjectStatModel> RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    public inferFileTypeFromMimeType(String str, int i, int i2, int i3, TestStatModel testStatModel, List<RankPairModel> list, int i4, int i5, int i6, List<TestSubjectStatModel> list2, List<TestSubjectStatModel> list3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.read = i3;
        this.write = testStatModel;
        this.AudioAttributesImplApi26Parcelizer = list;
        this.AudioAttributesImplApi21Parcelizer = i4;
        this.MediaBrowserCompatCustomActionResultReceiver = i5;
        this.AudioAttributesImplBaseParcelizer = i6;
        this.MediaBrowserCompatItemReceiver = list2;
        this.RatingCompat = list3;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final TestStatModel getWrite() {
        return this.write;
    }

    public final List<RankPairModel> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<TestSubjectStatModel> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final List<TestSubjectStatModel> RatingCompat() {
        return this.RatingCompat;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof inferFileTypeFromMimeType)) {
            return false;
        }
        inferFileTypeFromMimeType inferfiletypefrommimetype = (inferFileTypeFromMimeType) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) inferfiletypefrommimetype.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == inferfiletypefrommimetype.RemoteActionCompatParcelizer && this.IconCompatParcelizer == inferfiletypefrommimetype.IconCompatParcelizer && this.read == inferfiletypefrommimetype.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, inferfiletypefrommimetype.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, inferfiletypefrommimetype.AudioAttributesImplApi26Parcelizer) && this.AudioAttributesImplApi21Parcelizer == inferfiletypefrommimetype.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == inferfiletypefrommimetype.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplBaseParcelizer == inferfiletypefrommimetype.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, inferfiletypefrommimetype.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat, inferfiletypefrommimetype.RatingCompat);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode2 = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode3 = Integer.hashCode(this.IconCompatParcelizer);
        int iHashCode4 = Integer.hashCode(this.read);
        TestStatModel testStatModel = this.write;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (testStatModel == null ? 0 : testStatModel.hashCode())) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.RatingCompat.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.read;
        TestStatModel testStatModel = this.write;
        List<RankPairModel> list = this.AudioAttributesImplApi26Parcelizer;
        int i4 = this.AudioAttributesImplApi21Parcelizer;
        int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i6 = this.AudioAttributesImplBaseParcelizer;
        List<TestSubjectStatModel> list2 = this.MediaBrowserCompatItemReceiver;
        List<TestSubjectStatModel> list3 = this.RatingCompat;
        StringBuilder sb = new StringBuilder("inferFileTypeFromMimeType(AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", IconCompatParcelizer=");
        sb.append(i2);
        sb.append(", read=");
        sb.append(i3);
        sb.append(", write=");
        sb.append(testStatModel);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(list);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i5);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i6);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(list2);
        sb.append(", RatingCompat=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
