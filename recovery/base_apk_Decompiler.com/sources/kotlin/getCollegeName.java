package kotlin;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010j\u0002\b\u0011j\u0002\b\rj\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lo/getCollegeName;", "", "<init>", "(Ljava/lang/String;I)V", "R", "T", "Lkotlin/Function2;", "Lo/SampleVideos;", "", "p0", "p1", "p2", "", "RemoteActionCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;Ljava/lang/Object;Lo/SampleVideos;)V", "", "()Z", "write", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getCollegeName {
    private static final /* synthetic */ getCollegeName[] IconCompatParcelizer;
    public static final getCollegeName write = new getCollegeName(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 0);
    public static final getCollegeName RemoteActionCompatParcelizer = new getCollegeName("LAZY", 1);
    public static final getCollegeName read = new getCollegeName("ATOMIC", 2);
    public static final getCollegeName AudioAttributesCompatParcelizer = new getCollegeName("UNDISPATCHED", 3);

    /* JADX INFO: loaded from: classes4.dex */
    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getCollegeName.values().length];
            try {
                iArr[getCollegeName.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getCollegeName.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getCollegeName.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getCollegeName.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    private getCollegeName(String str, int i) {
    }

    static {
        getCollegeName[] getcollegenameArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        IconCompatParcelizer = getcollegenameArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getcollegenameArrAudioAttributesCompatParcelizer);
    }

    public final <R, T> void RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super R, ? super SampleVideos<? super T>, ? extends Object> p0, R p1, SampleVideos<? super T> p2) {
        int i = write.IconCompatParcelizer[ordinal()];
        if (i == 1) {
            setResumeTimeMs.AudioAttributesCompatParcelizer(p0, p1, p2);
            return;
        }
        if (i == 2) {
            VideoHeartbeatResponseBody.read(p0, p1, p2);
        } else if (i == 3) {
            getReferenceId.read(p0, p1, p2);
        } else if (i != 4) {
            throw new RenewEligibleCreator();
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this == RemoteActionCompatParcelizer;
    }

    public static getCollegeName valueOf(String str) {
        return (getCollegeName) Enum.valueOf(getCollegeName.class, str);
    }

    public static getCollegeName[] values() {
        return (getCollegeName[]) IconCompatParcelizer.clone();
    }

    private static final /* synthetic */ getCollegeName[] AudioAttributesCompatParcelizer() {
        return new getCollegeName[]{write, RemoteActionCompatParcelizer, read, AudioAttributesCompatParcelizer};
    }
}
