package kotlin;

import kotlin.Metadata;
import kotlin.getTappableElementInsets;
import kotlin.isVisible;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lo/setShutterBackgroundColor;", "", "Lo/inset;", "p0", "<init>", "(Lo/inset;)V", "", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Lo/inset;", "", "AudioAttributesCompatParcelizer", "I", "read", "write", "Lo/hasMoreBytes;", "Lo/hasMoreBytes;", "", "()Z", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setShutterBackgroundColor {
    private final inset RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer = 1;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer = 2;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write = 4;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final hasMoreBytes read = _appendByte.RemoteActionCompatParcelizer(0);

    public setShutterBackgroundColor(inset insetVar) {
        this.RemoteActionCompatParcelizer = insetVar;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read<T> implements getValidationToken {
        final /* synthetic */ setDropDownBackgroundResource<isRound> AudioAttributesCompatParcelizer;
        final /* synthetic */ setShutterBackgroundColor write;

        @Override // kotlin.getValidationToken
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object IconCompatParcelizer(isRound isround, SampleVideos<? super getShowPopup> sampleVideos) {
            int i;
            if ((isround instanceof isVisible.read) || (isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer) || (isround instanceof setOverriddenInsets.read)) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(isround);
            } else if (isround instanceof isVisible.IconCompatParcelizer) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(((isVisible.IconCompatParcelizer) isround).getWrite());
            } else if (isround instanceof getTappableElementInsets.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(((getTappableElementInsets.AudioAttributesCompatParcelizer) isround).getRemoteActionCompatParcelizer());
            } else if (isround instanceof setOverriddenInsets.write) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(((setOverriddenInsets.write) isround).getRead());
            } else if (isround instanceof setOverriddenInsets.IconCompatParcelizer) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(((setOverriddenInsets.IconCompatParcelizer) isround).getRemoteActionCompatParcelizer());
            }
            setDropDownBackgroundResource<isRound> setdropdownbackgroundresource = this.AudioAttributesCompatParcelizer;
            setShutterBackgroundColor setshutterbackgroundcolor = this.write;
            Object[] objArr = setdropdownbackgroundresource.IconCompatParcelizer;
            int i2 = setdropdownbackgroundresource.RemoteActionCompatParcelizer;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                isRound isround2 = (isRound) objArr[i4];
                if (isround2 instanceof isVisible.read) {
                    i = setshutterbackgroundcolor.AudioAttributesCompatParcelizer;
                } else if (isround2 instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
                    i = setshutterbackgroundcolor.IconCompatParcelizer;
                } else if (isround2 instanceof setOverriddenInsets.read) {
                    i = setshutterbackgroundcolor.write;
                }
                i3 |= i;
            }
            this.write.read.read(i3);
            return getShowPopup.INSTANCE;
        }

        read(setDropDownBackgroundResource<isRound> setdropdownbackgroundresource, setShutterBackgroundColor setshutterbackgroundcolor) {
            this.AudioAttributesCompatParcelizer = setdropdownbackgroundresource;
            this.write = setshutterbackgroundcolor;
        }
    }

    public final boolean read() {
        return (this.IconCompatParcelizer & this.read.IconCompatParcelizer()) != 0;
    }

    public final boolean write() {
        return (this.AudioAttributesCompatParcelizer & this.read.IconCompatParcelizer()) != 0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.write & this.read.IconCompatParcelizer()) != 0;
    }

    public final Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().write(new read(new setDropDownBackgroundResource(0, 1, null), this), sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }
}
