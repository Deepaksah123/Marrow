package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0013R+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b\u0014\u0010\u0018R%\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8F@CX\u0087\u008e\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\"\u0004\b\u000e\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0014\u001a\u00020\u00128\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \"\u0004\b\u0019\u0010!R\u001d\u0010\u001d\u001a\u00020\u00028G@FX\u0087\u008c\u0002¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b\u0010\u0010#"}, d2 = {"Lo/suppressLayout;", "", "Lo/superDispatchKeyEvent;", "p0", "", "p1", "<init>", "(Lo/superDispatchKeyEvent;F)V", "()V", "Lo/WritableTypeIdInclusion;", "", "p2", "p3", "", "write", "(Lo/superDispatchKeyEvent;Lo/WritableTypeIdInclusion;II)V", "IconCompatParcelizer", "(FFI)V", "Lo/findProperty;", "(J)I", "RemoteActionCompatParcelizer", "Lo/nextTokenToRead;", "()F", "AudioAttributesCompatParcelizer", "(F)V", "read", "AudioAttributesImplApi21Parcelizer", "Lo/hasMoreBytes;", "(I)V", "MediaBrowserCompatItemReceiver", "Lo/WritableTypeIdInclusion;", "AudioAttributesImplApi26Parcelizer", "J", "(J)V", "Lo/InputAccessor;", "()Lo/superDispatchKeyEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class suppressLayout {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final nextTokenToRead read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final hasMoreBytes IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private WritableTypeIdInclusion AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final nextTokenToRead write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final parseManyDecDigits<suppressLayout, Object> IconCompatParcelizer = squarePointwise.IconCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.bindViewHolder
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return suppressLayout.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (suppressLayout) obj2);
        }
    }, new getAnswerMap() { // from class: o.canRestoreState
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return suppressLayout.write((List) obj);
        }
    });

    public suppressLayout(superDispatchKeyEvent superdispatchkeyevent, float f) {
        this.write = getInputCodeUtf8.AudioAttributesCompatParcelizer(f);
        this.read = getInputCodeUtf8.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        this.IconCompatParcelizer = _appendByte.RemoteActionCompatParcelizer(0);
        this.AudioAttributesCompatParcelizer = WritableTypeIdInclusion.INSTANCE.write();
        this.RemoteActionCompatParcelizer = findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = _qbuf.RemoteActionCompatParcelizer(superdispatchkeyevent, _qbuf.RemoteActionCompatParcelizer());
    }

    public /* synthetic */ suppressLayout(superDispatchKeyEvent superdispatchkeyevent, float f, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(superdispatchkeyevent, (i & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f);
    }

    public suppressLayout() {
        this(superDispatchKeyEvent.write, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.write.write(f);
    }

    public final float RemoteActionCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer(float f) {
        this.read.write(f);
    }

    public final float write() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    private final void write(int i) {
        this.IconCompatParcelizer.read(i);
    }

    public final void read(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final superDispatchKeyEvent IconCompatParcelizer() {
        return (superDispatchKeyEvent) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer();
    }

    public final void write(superDispatchKeyEvent p0, WritableTypeIdInclusion p1, int p2, int p3) {
        float f = p3 - p2;
        RemoteActionCompatParcelizer(f);
        if (p1.getAudioAttributesCompatParcelizer() != this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() || p1.getRemoteActionCompatParcelizer() != this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) {
            boolean z = p0 == superDispatchKeyEvent.write;
            IconCompatParcelizer(z ? p1.getRemoteActionCompatParcelizer() : p1.getAudioAttributesCompatParcelizer(), z ? p1.getIconCompatParcelizer() : p1.getWrite(), p2);
            this.AudioAttributesCompatParcelizer = p1;
        }
        AudioAttributesCompatParcelizer(getQues.read(RemoteActionCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, f));
        write(p2);
    }

    public final void IconCompatParcelizer(float p0, float p1, int p2) {
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        float f = p2;
        float f2 = fRemoteActionCompatParcelizer + f;
        AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer() + ((p1 <= f2 && (p0 >= fRemoteActionCompatParcelizer || p1 - p0 <= f)) ? (p0 >= fRemoteActionCompatParcelizer || p1 - p0 > f) ? BitmapDescriptorFactory.HUE_RED : p0 - fRemoteActionCompatParcelizer : p1 - f2));
    }

    public final int IconCompatParcelizer(long p0) {
        return findProperty.AudioAttributesImplBaseParcelizer(p0) != findProperty.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer) ? findProperty.AudioAttributesImplBaseParcelizer(p0) : findProperty.read(p0) != findProperty.read(this.RemoteActionCompatParcelizer) ? findProperty.read(p0) : findProperty.MediaBrowserCompatCustomActionResultReceiver(p0);
    }

    /* JADX INFO: renamed from: o.suppressLayout$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/suppressLayout$read;", "", "<init>", "()V", "Lo/parseManyDecDigits;", "Lo/suppressLayout;", "IconCompatParcelizer", "Lo/parseManyDecDigits;", "AudioAttributesCompatParcelizer", "()Lo/parseManyDecDigits;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseManyDecDigits<suppressLayout, Object> AudioAttributesCompatParcelizer() {
            return suppressLayout.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, suppressLayout suppresslayout) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Float.valueOf(suppresslayout.RemoteActionCompatParcelizer()), Boolean.valueOf(suppresslayout.IconCompatParcelizer() == superDispatchKeyEvent.write));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final suppressLayout write(List list) {
        Object obj = list.get(1);
        toMagicModuleMetaRepoModel.read(obj, "");
        superDispatchKeyEvent superdispatchkeyevent = ((Boolean) obj).booleanValue() ? superDispatchKeyEvent.write : superDispatchKeyEvent.AudioAttributesCompatParcelizer;
        Object obj2 = list.get(0);
        toMagicModuleMetaRepoModel.read(obj2, "");
        return new suppressLayout(superdispatchkeyevent, ((Float) obj2).floatValue());
    }
}
