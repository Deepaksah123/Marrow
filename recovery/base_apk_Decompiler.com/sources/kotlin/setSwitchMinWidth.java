package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u000eJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lo/setSwitchMinWidth;", "Lo/SearchViewSavedState;", "", "p0", "p1", "Lo/setOnQueryTextFocusChangeListener;", "p2", "<init>", "(IILo/setOnQueryTextFocusChangeListener;)V", "", "", "p3", "AudioAttributesCompatParcelizer", "(JFFF)F", "(FFF)J", "read", "IconCompatParcelizer", "I", "write", "Lo/setOnQueryTextFocusChangeListener;", "J", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setSwitchMinWidth implements SearchViewSavedState {
    private final setOnQueryTextFocusChangeListener AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int read;
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    public setSwitchMinWidth(int i, int i2, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener) {
        this.read = i;
        this.write = i2;
        this.AudioAttributesCompatParcelizer = setonquerytextfocuschangelistener;
        this.IconCompatParcelizer = ((long) i) * 1000000;
        this.RemoteActionCompatParcelizer = ((long) i2) * 1000000;
    }

    public /* synthetic */ setSwitchMinWidth(int i, int i2, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? setShowText.AudioAttributesCompatParcelizer() : setonquerytextfocuschangelistener);
    }

    @Override // kotlin.SearchViewSavedState
    public final long AudioAttributesCompatParcelizer(float p0, float p1, float p2) {
        return this.RemoteActionCompatParcelizer + this.IconCompatParcelizer;
    }

    @Override // kotlin.SearchViewSavedState
    public final float AudioAttributesCompatParcelizer(long p0, float p1, float p2, float p3) {
        long j = p0 - this.RemoteActionCompatParcelizer;
        long j2 = this.IconCompatParcelizer;
        if (j < 0) {
            j = 0;
        }
        if (j > j2) {
            j = j2;
        }
        float fAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.read == 0 ? 1.0f : j / j2);
        return (p1 * (1.0f - fAudioAttributesCompatParcelizer)) + (p2 * fAudioAttributesCompatParcelizer);
    }

    @Override // kotlin.SearchViewSavedState
    public final float read(long p0, float p1, float p2, float p3) {
        long j = p0 - this.RemoteActionCompatParcelizer;
        long j2 = this.IconCompatParcelizer;
        if (j < 0) {
            j = 0;
        }
        long j3 = j > j2 ? j2 : j;
        if (j3 == 0) {
            return p3;
        }
        return (AudioAttributesCompatParcelizer(j3, p1, p2, p3) - AudioAttributesCompatParcelizer(j3 - 1000000, p1, p2, p3)) * 1000.0f;
    }

    public setSwitchMinWidth() {
        this(0, 0, null, 7, null);
    }
}
