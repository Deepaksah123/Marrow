package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0013\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u001a\u0010\u0017\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a"}, d2 = {"Lo/setPlayedColor;", "Lo/findAndAddVirtualProperties;", "Lo/contentsAsString;", "Lo/setUnplayedColor;", "p0", "p1", "p2", "p3", "<init>", "(Lo/setUnplayedColor;Lo/setUnplayedColor;Lo/setUnplayedColor;Lo/setUnplayedColor;)V", "Lo/calloc;", "Lo/tryToResolveUnresolved;", "Lo/bufferMapProperty;", "Lo/resetWithString;", "write", "(JLo/tryToResolveUnresolved;Lo/bufferMapProperty;)Lo/resetWithString;", "", "p4", "p5", "AudioAttributesCompatParcelizer", "(JFFFFLo/tryToResolveUnresolved;)Lo/resetWithString;", "read", "(Lo/setUnplayedColor;Lo/setUnplayedColor;Lo/setUnplayedColor;Lo/setUnplayedColor;)Lo/setPlayedColor;", "IconCompatParcelizer", "(Lo/setUnplayedColor;)Lo/setPlayedColor;", "Lo/setUnplayedColor;", "()Lo/setUnplayedColor;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setPlayedColor implements findAndAddVirtualProperties, contentsAsString {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setUnplayedColor IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setUnplayedColor AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setUnplayedColor write;
    private final setUnplayedColor read;

    public abstract resetWithString AudioAttributesCompatParcelizer(long p0, float p1, float p2, float p3, float p4, tryToResolveUnresolved p5);

    public abstract setPlayedColor read(setUnplayedColor p0, setUnplayedColor p1, setUnplayedColor p2, setUnplayedColor p3);

    public setPlayedColor(setUnplayedColor setunplayedcolor, setUnplayedColor setunplayedcolor2, setUnplayedColor setunplayedcolor3, setUnplayedColor setunplayedcolor4) {
        this.AudioAttributesCompatParcelizer = setunplayedcolor;
        this.write = setunplayedcolor2;
        this.read = setunplayedcolor3;
        this.IconCompatParcelizer = setunplayedcolor4;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setUnplayedColor getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final setUnplayedColor getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final setUnplayedColor getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setUnplayedColor getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.findAndAddVirtualProperties
    public final resetWithString write(long p0, tryToResolveUnresolved p1, bufferMapProperty p2) {
        float fWrite = this.AudioAttributesCompatParcelizer.write(p0, p2);
        float fWrite2 = this.write.write(p0, p2);
        float fWrite3 = this.read.write(p0, p2);
        float fWrite4 = this.IconCompatParcelizer.write(p0, p2);
        float fIconCompatParcelizer = calloc.IconCompatParcelizer(p0);
        float f = fWrite + fWrite4;
        if (f > fIconCompatParcelizer) {
            float f2 = fIconCompatParcelizer / f;
            fWrite *= f2;
            fWrite4 *= f2;
        }
        float f3 = fWrite4;
        float f4 = fWrite;
        float f5 = fWrite2 + fWrite3;
        if (f5 > fIconCompatParcelizer) {
            float f6 = fIconCompatParcelizer / f5;
            fWrite2 *= f6;
            fWrite3 *= f6;
        }
        float f7 = fWrite2;
        float f8 = fWrite3;
        if (f4 < BitmapDescriptorFactory.HUE_RED || f7 < BitmapDescriptorFactory.HUE_RED || f8 < BitmapDescriptorFactory.HUE_RED || f3 < BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder("Corner size in Px can't be negative(topStart = ");
            sb.append(f4);
            sb.append(", topEnd = ");
            sb.append(f7);
            sb.append(", bottomEnd = ");
            sb.append(f8);
            sb.append(", bottomStart = ");
            sb.append(f3);
            sb.append(")!");
            getRootStableInsets.RemoteActionCompatParcelizer(sb.toString());
        }
        return AudioAttributesCompatParcelizer(p0, f4, f7, f8, f3, p1);
    }

    public static /* synthetic */ setPlayedColor read$default(setPlayedColor setplayedcolor, setUnplayedColor setunplayedcolor, setUnplayedColor setunplayedcolor2, setUnplayedColor setunplayedcolor3, setUnplayedColor setunplayedcolor4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            setunplayedcolor = setplayedcolor.AudioAttributesCompatParcelizer;
        }
        if ((i & 2) != 0) {
            setunplayedcolor2 = setplayedcolor.write;
        }
        if ((i & 4) != 0) {
            setunplayedcolor3 = setplayedcolor.read;
        }
        if ((i & 8) != 0) {
            setunplayedcolor4 = setplayedcolor.IconCompatParcelizer;
        }
        return setplayedcolor.read(setunplayedcolor, setunplayedcolor2, setunplayedcolor3, setunplayedcolor4);
    }

    public final setPlayedColor IconCompatParcelizer(setUnplayedColor p0) {
        return read(p0, p0, p0, p0);
    }
}
