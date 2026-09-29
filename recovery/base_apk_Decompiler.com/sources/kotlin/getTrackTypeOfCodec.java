package kotlin;

import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\n"}, d2 = {"Lo/getTrackTypeOfCodec;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MediaMetadataCompat", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "write", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getTrackTypeOfCodec {
    private static final /* synthetic */ getTrackTypeOfCodec[] AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final String write;
    public static final getTrackTypeOfCodec read = new getTrackTypeOfCodec("TYPE_FC_EXT_VIDEO", 0, "ext_video");
    public static final getTrackTypeOfCodec RemoteActionCompatParcelizer = new getTrackTypeOfCodec("TYPE_FC_INTERNAL_LINK", 1, "int_link");
    public static final getTrackTypeOfCodec IconCompatParcelizer = new getTrackTypeOfCodec("TYPE_FC_EXTERNAL_LINK", 2, "ext_link");
    public static final getTrackTypeOfCodec MediaBrowserCompatCustomActionResultReceiver = new getTrackTypeOfCodec("TYPE_FC_VIDEO", 3, "video");
    public static final getTrackTypeOfCodec AudioAttributesImplApi21Parcelizer = new getTrackTypeOfCodec("TYPE_FC_QBANK", 4, "qbank");
    public static final getTrackTypeOfCodec AudioAttributesCompatParcelizer = new getTrackTypeOfCodec("TYPE_FC_LESSON", 5, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON);
    public static final getTrackTypeOfCodec MediaBrowserCompatItemReceiver = new getTrackTypeOfCodec("TYPE_FC_TEST", 6, "test");
    public static final getTrackTypeOfCodec AudioAttributesImplBaseParcelizer = new getTrackTypeOfCodec("TYPE_FC_MCQ", 7, "mcq");
    public static final getTrackTypeOfCodec write = new getTrackTypeOfCodec("TYPE_FC_EMPTY", 8, "empty");

    private getTrackTypeOfCodec(String str, int i, String str2) {
        this.write = str2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    static {
        getTrackTypeOfCodec[] gettracktypeofcodecArr = read();
        AudioAttributesImplApi26Parcelizer = gettracktypeofcodecArr;
        getMagicModuleTimeline.IconCompatParcelizer(gettracktypeofcodecArr);
    }

    private static final /* synthetic */ getTrackTypeOfCodec[] read() {
        return new getTrackTypeOfCodec[]{read, RemoteActionCompatParcelizer, IconCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver, AudioAttributesImplApi21Parcelizer, AudioAttributesCompatParcelizer, MediaBrowserCompatItemReceiver, AudioAttributesImplBaseParcelizer, write};
    }

    public static getTrackTypeOfCodec valueOf(String str) {
        return (getTrackTypeOfCodec) Enum.valueOf(getTrackTypeOfCodec.class, str);
    }

    public static getTrackTypeOfCodec[] values() {
        return (getTrackTypeOfCodec[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
