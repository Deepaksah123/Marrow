package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\r\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u0003R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/using;", "Lo/POJOPropertyBuilderWithMember;", "<init>", "()V", "", "p0", "Lo/using$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(I)Lo/using$IconCompatParcelizer;", "", "write", "Lo/setProvider;", "Lo/setDropDownBackgroundResource;", "IconCompatParcelizer", "Lo/setProvider;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class using extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setProvider<setDropDownBackgroundResource<IconCompatParcelizer>> RemoteActionCompatParcelizer = ActionMenuView.write();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/using$write;", "", "Lkotlin/Function0;", "", "p0", "Lo/_contentReference;", "RemoteActionCompatParcelizer", "(Lo/getCreatedOnDateMs;)Lo/_contentReference;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write {
        _contentReference RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0);
    }

    public final IconCompatParcelizer AudioAttributesCompatParcelizer(int p0) {
        Object obj;
        setProvider<setDropDownBackgroundResource<IconCompatParcelizer>> setprovider = this.RemoteActionCompatParcelizer;
        setDropDownBackgroundResource<IconCompatParcelizer> setdropdownbackgroundresourceAudioAttributesCompatParcelizer = setprovider.AudioAttributesCompatParcelizer(p0);
        if (setdropdownbackgroundresourceAudioAttributesCompatParcelizer == null) {
            setdropdownbackgroundresourceAudioAttributesCompatParcelizer = new setDropDownBackgroundResource<>(1);
            setprovider.write(p0, setdropdownbackgroundresourceAudioAttributesCompatParcelizer);
        }
        setDropDownBackgroundResource<IconCompatParcelizer> setdropdownbackgroundresource = setdropdownbackgroundresourceAudioAttributesCompatParcelizer;
        setDropDownBackgroundResource<IconCompatParcelizer> setdropdownbackgroundresource2 = setdropdownbackgroundresource;
        Object[] objArr = setdropdownbackgroundresource2.IconCompatParcelizer;
        int i = setdropdownbackgroundresource2.RemoteActionCompatParcelizer;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                obj = null;
                break;
            }
            obj = objArr[i2];
            if (!((IconCompatParcelizer) obj).getWrite()) {
                break;
            }
            i2++;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
        if (iconCompatParcelizer == null) {
            iconCompatParcelizer = new IconCompatParcelizer();
            setdropdownbackgroundresource.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        }
        iconCompatParcelizer.IconCompatParcelizer(true);
        return iconCompatParcelizer;
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        setProvider<setDropDownBackgroundResource<IconCompatParcelizer>> setprovider = this.RemoteActionCompatParcelizer;
        int[] iArr = setprovider.IconCompatParcelizer;
        Object[] objArr = setprovider.MediaBrowserCompatItemReceiver;
        long[] jArr = setprovider.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        setDropDownBackgroundResource setdropdownbackgroundresource = (setDropDownBackgroundResource) objArr[i4];
                        Object[] objArr2 = setdropdownbackgroundresource.IconCompatParcelizer;
                        int i6 = setdropdownbackgroundresource.RemoteActionCompatParcelizer;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((IconCompatParcelizer) objArr2[i7]).write();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\f\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\"\u0010\t\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014\"\u0004\b\n\u0010\u0015R(\u0010\n\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00168\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0017\"\u0004\b\f\u0010\u0018"}, d2 = {"Lo/using$IconCompatParcelizer;", "", "<init>", "()V", "", "AudioAttributesCompatParcelizer", "Lo/using$write;", "p0", "(Lo/using$write;)V", "write", "IconCompatParcelizer", "Lo/builder;", "RemoteActionCompatParcelizer", "Lo/builder;", "read", "Lo/timesTwoToThe;", "Lo/timesTwoToThe;", "()Lo/timesTwoToThe;", "", "Z", "()Z", "(Z)V", "Lo/_contentReference;", "Lo/_contentReference;", "(Lo/_contentReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private _contentReference IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final timesTwoToThe RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final builder read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private boolean write;

        public IconCompatParcelizer() {
            builder builderVar = new builder(null, 1, null);
            this.read = builderVar;
            this.RemoteActionCompatParcelizer = builderVar;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final timesTwoToThe getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void IconCompatParcelizer(boolean z) {
            this.write = z;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        private final void RemoteActionCompatParcelizer(_contentReference _contentreference) {
            _contentReference _contentreference2 = this.IconCompatParcelizer;
            if (_contentreference2 != null) {
                _contentreference2.IconCompatParcelizer();
            }
            this.IconCompatParcelizer = _contentreference;
        }

        public final void AudioAttributesCompatParcelizer() {
            if (!this.read.write()) {
                this.read.IconCompatParcelizer();
            } else {
                RemoteActionCompatParcelizer(null);
            }
        }

        public final void AudioAttributesCompatParcelizer(write p0) {
            _contentReference _contentreferenceRemoteActionCompatParcelizer;
            if (this.read.write()) {
                try {
                    _contentreferenceRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer(new AnonymousClass4());
                } catch (CancellationException unused) {
                    this.read.RemoteActionCompatParcelizer();
                    _contentreferenceRemoteActionCompatParcelizer = null;
                }
                RemoteActionCompatParcelizer(_contentreferenceRemoteActionCompatParcelizer);
            }
        }

        /* JADX INFO: renamed from: o.using$IconCompatParcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                IconCompatParcelizer();
                return getShowPopup.INSTANCE;
            }

            public final void IconCompatParcelizer() {
                IconCompatParcelizer.this.read.RemoteActionCompatParcelizer();
            }

            AnonymousClass4() {
                super(0);
            }
        }

        public final void write() {
            RemoteActionCompatParcelizer(null);
            this.read.AudioAttributesCompatParcelizer();
        }

        public final void IconCompatParcelizer() {
            this.write = false;
        }
    }
}
