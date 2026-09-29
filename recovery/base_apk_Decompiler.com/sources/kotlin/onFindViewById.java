package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0016\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00058\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u00058\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lo/onFindViewById;", "", "", "p0", "p1", "Lo/assignParameter;", "p2", "p3", "<init>", "(IIFFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "read", "(IIFF)V", "I", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "F", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onFindViewById {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public float write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public float IconCompatParcelizer;

    private onFindViewById(int i, int i2, float f, float f2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.IconCompatParcelizer = f;
        this.write = f2;
    }

    public final void read(int p0, int p1, float p2, float p3) {
        this.RemoteActionCompatParcelizer = p0;
        this.read = p1;
        this.IconCompatParcelizer = p2;
        this.write = p3;
    }

    public /* synthetic */ onFindViewById(int i, int i2, float f, float f2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED) : f, (i3 & 8) != 0 ? assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED) : f2, null);
    }

    public /* synthetic */ onFindViewById(int i, int i2, float f, float f2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, i2, f, f2);
    }
}
