package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0014\u0010\n\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014"}, d2 = {"Lo/setSwitchTextAppearance;", "Lo/SearchViewSavedState;", "", "p0", "p1", "p2", "<init>", "(FFF)V", "", "p3", "AudioAttributesCompatParcelizer", "(JFFF)F", "read", "RemoteActionCompatParcelizer", "(FFF)F", "(FFF)J", "F", "write", "IconCompatParcelizer", "Lo/setNavigationIcon;", "Lo/setNavigationIcon;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setSwitchTextAppearance implements SearchViewSavedState {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setNavigationIcon AudioAttributesCompatParcelizer;

    @Override // kotlin.SearchViewSavedState
    public final float RemoteActionCompatParcelizer(float p0, float p1, float p2) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public setSwitchTextAppearance(float f, float f2, float f3) {
        this.write = f;
        this.read = f2;
        this.IconCompatParcelizer = f3;
        setNavigationIcon setnavigationicon = new setNavigationIcon(1.0f);
        setnavigationicon.AudioAttributesCompatParcelizer(f);
        setnavigationicon.read(f2);
        this.AudioAttributesCompatParcelizer = setnavigationicon;
    }

    public /* synthetic */ setSwitchTextAppearance(float f, float f2, float f3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }

    @Override // kotlin.SearchViewSavedState
    public final float AudioAttributesCompatParcelizer(long p0, float p1, float p2, float p3) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p2);
        return Float.intBitsToFloat((int) (this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p1, p3, p0 / 1000000) >> 32));
    }

    @Override // kotlin.SearchViewSavedState
    public final float read(long p0, float p1, float p2, float p3) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p2);
        return Float.intBitsToFloat((int) this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p1, p3, p0 / 1000000));
    }

    @Override // kotlin.SearchViewSavedState
    public final long AudioAttributesCompatParcelizer(float p0, float p1, float p2) {
        float fRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        float audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        float f = this.IconCompatParcelizer;
        return setContentInsetsAbsolute.read(fRemoteActionCompatParcelizer, audioAttributesCompatParcelizer, p2 / f, (p0 - p1) / f, 1.0f) * 1000000;
    }

    public setSwitchTextAppearance() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 7, null);
    }
}
