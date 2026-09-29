package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJU\u0010\u0010\u001a\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/setSkipSilenceEnabled;", "", "", "p0", "p1", "Lo/setWindowTitle;", "p2", "write", "(IILo/setWindowTitle;)Lo/setWindowTitle;", "", "Lo/addAudioOffloadListener;", "p3", "p4", "p5", "p6", "p7", "RemoteActionCompatParcelizer", "(Ljava/util/List;IIIIIII)I", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setSkipSilenceEnabled {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;

    int RemoteActionCompatParcelizer(List<? extends addAudioOffloadListener> p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7);

    setWindowTitle write(int p0, int p1, setWindowTitle p2);

    /* JADX INFO: renamed from: o.setSkipSilenceEnabled$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setSkipSilenceEnabled$IconCompatParcelizer;", "", "<init>", "()V", "Lo/setSkipSilenceEnabled;", "IconCompatParcelizer", "Lo/setSkipSilenceEnabled;", "AudioAttributesCompatParcelizer", "()Lo/setSkipSilenceEnabled;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion write = new Companion();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private static final setSkipSilenceEnabled read = new C0147IconCompatParcelizer();

        private Companion() {
        }

        /* JADX INFO: renamed from: o.setSkipSilenceEnabled$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001JU\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/setSkipSilenceEnabled$IconCompatParcelizer$IconCompatParcelizer;", "Lo/setSkipSilenceEnabled;", "", "Lo/addAudioOffloadListener;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "RemoteActionCompatParcelizer", "(Ljava/util/List;IIIIIII)I", "Lo/setWindowTitle;", "write", "(IILo/setWindowTitle;)Lo/setWindowTitle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0147IconCompatParcelizer implements setSkipSilenceEnabled {
            C0147IconCompatParcelizer() {
            }

            @Override // kotlin.setSkipSilenceEnabled
            public final int RemoteActionCompatParcelizer(List<? extends addAudioOffloadListener> p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {
                addAudioOffloadListener addaudiooffloadlistener;
                int size = p0.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        addaudiooffloadlistener = null;
                        break;
                    }
                    addaudiooffloadlistener = p0.get(i);
                    if (addaudiooffloadlistener.getAudioAttributesCompatParcelizer() != p1) {
                        break;
                    }
                    i++;
                }
                addAudioOffloadListener addaudiooffloadlistener2 = addaudiooffloadlistener;
                int iAudioAttributesCompatParcelizer = addaudiooffloadlistener2 != null ? getVideoComponent.AudioAttributesCompatParcelizer(addaudiooffloadlistener2) : Integer.MIN_VALUE;
                int iMax = -p4;
                if (p3 != Integer.MIN_VALUE) {
                    iMax = Math.max(iMax, p3);
                }
                return iAudioAttributesCompatParcelizer != Integer.MIN_VALUE ? Math.min(iMax, iAudioAttributesCompatParcelizer - p2) : iMax;
            }

            @Override // kotlin.setSkipSilenceEnabled
            public final setWindowTitle write(int p0, int p1, setWindowTitle p2) {
                if (p1 - p0 < 0 || p2.AudioAttributesCompatParcelizer == 0) {
                    return ActionBarOverlayLayoutLayoutParams.AudioAttributesCompatParcelizer();
                }
                newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, p2.AudioAttributesCompatParcelizer);
                int read = newencryptedobjectIconCompatParcelizer.getRead();
                int audioAttributesCompatParcelizer = newencryptedobjectIconCompatParcelizer.getAudioAttributesCompatParcelizer();
                int i = -1;
                if (read <= audioAttributesCompatParcelizer) {
                    while (p2.read(read) <= p0) {
                        i = p2.read(read);
                        if (read == audioAttributesCompatParcelizer) {
                            break;
                        }
                        read++;
                    }
                }
                if (i == -1) {
                    return ActionBarOverlayLayoutLayoutParams.AudioAttributesCompatParcelizer();
                }
                return ActionBarOverlayLayoutLayoutParams.RemoteActionCompatParcelizer(i);
            }
        }

        public final setSkipSilenceEnabled AudioAttributesCompatParcelizer() {
            return read;
        }
    }
}
