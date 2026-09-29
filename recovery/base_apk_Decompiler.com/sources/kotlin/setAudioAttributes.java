package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000fH&¢\u0006\u0004\b\u0007\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/setAudioAttributes;", "", "Lo/CProjection;", "p0", "Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;", "IconCompatParcelizer", "(Lo/CProjection;)Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;", "RemoteActionCompatParcelizer", "", "", "write", "(Ljava/lang/String;)Ljava/util/List;", "", "read", "(Lo/CProjection;)Z", "Lo/CVideoChangeFrameRateStrategy;", "(Lo/CVideoChangeFrameRateStrategy;)Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface setAudioAttributes {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener IconCompatParcelizer(CProjection p0);

    lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener RemoteActionCompatParcelizer(CProjection p0);

    boolean read(CProjection p0);

    List<lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> write(String p0);

    default lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener RemoteActionCompatParcelizer(CVideoChangeFrameRateStrategy p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return IconCompatParcelizer(onReleased.read(p0));
    }

    @getMagicModuleMeta
    static setAudioAttributes RemoteActionCompatParcelizer() {
        return INSTANCE.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.setAudioAttributes$write, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        private Companion() {
        }

        private static /* synthetic */ setAudioAttributes write() {
            return write(true);
        }

        @getMagicModuleMeta
        public static setAudioAttributes write(boolean z) {
            updateAudioFocus updateaudiofocus = new updateAudioFocus();
            if (z) {
                return new AudioFocusManagerAudioFocusListener(updateaudiofocus);
            }
            return updateaudiofocus;
        }

        @getMagicModuleMeta
        public final setAudioAttributes AudioAttributesCompatParcelizer() {
            return write();
        }
    }

    @getMagicModuleMeta
    static setAudioAttributes IconCompatParcelizer() {
        return Companion.write(false);
    }
}
