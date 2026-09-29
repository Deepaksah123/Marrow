package kotlin;

import android.R;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\nj\u0002\b\u000e"}, d2 = {"Lo/getVisibility;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "MediaBrowserCompatItemReceiver", "I", "IconCompatParcelizer", "()I", "write", "read", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getVisibility {
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesImplApi21Parcelizer;
    private static final /* synthetic */ getVisibility[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int write;
    public static final getVisibility IconCompatParcelizer = new getVisibility("Copy", 0, 0);
    public static final getVisibility read = new getVisibility("Paste", 1, 1);
    public static final getVisibility RemoteActionCompatParcelizer = new getVisibility("Cut", 2, 2);
    public static final getVisibility write = new getVisibility("SelectAll", 3, 3);
    public static final getVisibility AudioAttributesCompatParcelizer = new getVisibility("Autofill", 4, 4);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[getVisibility.values().length];
            try {
                iArr[getVisibility.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getVisibility.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getVisibility.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getVisibility.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getVisibility.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            read = iArr;
        }
    }

    private getVisibility(String str, int i, int i2) {
        this.write = i2;
        this.AudioAttributesCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    static {
        getVisibility[] getvisibilityArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver = getvisibilityArrAudioAttributesCompatParcelizer;
        AudioAttributesImplApi21Parcelizer = getMagicModuleTimeline.IconCompatParcelizer(getvisibilityArrAudioAttributesCompatParcelizer);
    }

    public final int read() {
        int i = WhenMappings.read[ordinal()];
        if (i == 1) {
            return R.string.copy;
        }
        if (i == 2) {
            return R.string.paste;
        }
        if (i == 3) {
            return R.string.cut;
        }
        if (i == 4) {
            return R.string.selectAll;
        }
        if (i == 5) {
            return R.string.autofill;
        }
        throw new RenewEligibleCreator();
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private static final /* synthetic */ getVisibility[] AudioAttributesCompatParcelizer() {
        return new getVisibility[]{IconCompatParcelizer, read, RemoteActionCompatParcelizer, write, AudioAttributesCompatParcelizer};
    }

    public static getVisibility valueOf(String str) {
        return (getVisibility) Enum.valueOf(getVisibility.class, str);
    }

    public static getVisibility[] values() {
        return (getVisibility[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
