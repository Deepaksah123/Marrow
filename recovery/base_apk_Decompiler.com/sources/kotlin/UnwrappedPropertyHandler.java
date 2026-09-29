package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u0016J-\u0010\u0011\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0018J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\u0002¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d"}, d2 = {"Lo/UnwrappedPropertyHandler;", "", "<init>", "()V", "", "p0", "", "RemoteActionCompatParcelizer", "(F)Z", "Lo/TypeWrappedDeserializer;", "IconCompatParcelizer", "(F)Lo/TypeWrappedDeserializer;", "p1", "p2", "AudioAttributesCompatParcelizer", "(Lo/TypeWrappedDeserializer;Lo/TypeWrappedDeserializer;F)Lo/TypeWrappedDeserializer;", "", "read", "(F)I", "write", "(I)F", "", "(FLo/TypeWrappedDeserializer;)V", "Lo/setSupportButtonTintList;", "(Lo/setSupportButtonTintList;FLo/TypeWrappedDeserializer;)V", "", "[F", "Lo/setSupportButtonTintList;", "", "[Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnwrappedPropertyHandler {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final Object[] RemoteActionCompatParcelizer;
    public static final UnwrappedPropertyHandler INSTANCE;
    private static final float[] IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static volatile setSupportButtonTintList<TypeWrappedDeserializer> write;
    public static final int write;

    private final int read(float p0) {
        return (int) (p0 * 100.0f);
    }

    private final float write(int p0) {
        return p0 / 100.0f;
    }

    public final boolean RemoteActionCompatParcelizer(float p0) {
        return p0 >= 1.03f;
    }

    private UnwrappedPropertyHandler() {
    }

    static {
        UnwrappedPropertyHandler unwrappedPropertyHandler = new UnwrappedPropertyHandler();
        INSTANCE = unwrappedPropertyHandler;
        IconCompatParcelizer = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        write = new setSupportButtonTintList<>(0, 1, null);
        Object[] objArr = new Object[0];
        RemoteActionCompatParcelizer = objArr;
        synchronized (objArr) {
            unwrappedPropertyHandler.read(write, 1.15f, new withResolved(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            unwrappedPropertyHandler.read(write, 1.3f, new withResolved(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            unwrappedPropertyHandler.read(write, 1.5f, new withResolved(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            unwrappedPropertyHandler.read(write, 1.8f, new withResolved(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            unwrappedPropertyHandler.read(write, 2.0f, new withResolved(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        if (unwrappedPropertyHandler.write(write.AudioAttributesCompatParcelizer(0)) - 0.01f <= 1.03f) {
            readIdProperty.RemoteActionCompatParcelizer("You should only apply non-linear scaling to font scales > 1");
        }
        write = 8;
    }

    public final TypeWrappedDeserializer IconCompatParcelizer(float p0) {
        TypeWrappedDeserializer typeWrappedDeserializerMediaBrowserCompatCustomActionResultReceiver;
        if (!RemoteActionCompatParcelizer(p0)) {
            return null;
        }
        TypeWrappedDeserializer typeWrappedDeserializerAudioAttributesCompatParcelizer = INSTANCE.AudioAttributesCompatParcelizer(p0);
        if (typeWrappedDeserializerAudioAttributesCompatParcelizer != null) {
            return typeWrappedDeserializerAudioAttributesCompatParcelizer;
        }
        int iRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(read(p0));
        if (iRemoteActionCompatParcelizer >= 0) {
            return write.MediaBrowserCompatCustomActionResultReceiver(iRemoteActionCompatParcelizer);
        }
        int i = -(iRemoteActionCompatParcelizer + 1);
        int i2 = i - 1;
        float fWrite = 1.0f;
        if (i >= write.read()) {
            withResolved withresolved = new withResolved(new float[]{1.0f}, new float[]{p0});
            RemoteActionCompatParcelizer(p0, withresolved);
            return withresolved;
        }
        if (i2 < 0) {
            float[] fArr = IconCompatParcelizer;
            typeWrappedDeserializerMediaBrowserCompatCustomActionResultReceiver = new withResolved(fArr, fArr);
        } else {
            fWrite = write(write.AudioAttributesCompatParcelizer(i2));
            typeWrappedDeserializerMediaBrowserCompatCustomActionResultReceiver = write.MediaBrowserCompatCustomActionResultReceiver(i2);
        }
        TypeWrappedDeserializer typeWrappedDeserializerAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(typeWrappedDeserializerMediaBrowserCompatCustomActionResultReceiver, write.MediaBrowserCompatCustomActionResultReceiver(i), inject.INSTANCE.read(BitmapDescriptorFactory.HUE_RED, 1.0f, fWrite, write(write.AudioAttributesCompatParcelizer(i)), p0));
        RemoteActionCompatParcelizer(p0, typeWrappedDeserializerAudioAttributesCompatParcelizer2);
        return typeWrappedDeserializerAudioAttributesCompatParcelizer2;
    }

    private final TypeWrappedDeserializer AudioAttributesCompatParcelizer(TypeWrappedDeserializer p0, TypeWrappedDeserializer p1, float p2) {
        float[] fArr = IconCompatParcelizer;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = IconCompatParcelizer[i];
            fArr2[i] = inject.INSTANCE.AudioAttributesCompatParcelizer(p0.RemoteActionCompatParcelizer(f), p1.RemoteActionCompatParcelizer(f), p2);
        }
        return new withResolved(IconCompatParcelizer, fArr2);
    }

    private final void RemoteActionCompatParcelizer(float p0, TypeWrappedDeserializer p1) {
        synchronized (RemoteActionCompatParcelizer) {
            UnwrappedPropertyHandler unwrappedPropertyHandler = INSTANCE;
            setSupportButtonTintList<TypeWrappedDeserializer> setsupportbuttontintlistClone = write.clone();
            unwrappedPropertyHandler.read(setsupportbuttontintlistClone, p0, p1);
            write = setsupportbuttontintlistClone;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    private final void read(setSupportButtonTintList<TypeWrappedDeserializer> p0, float p1, TypeWrappedDeserializer p2) {
        p0.AudioAttributesCompatParcelizer(read(p1), p2);
    }

    private final TypeWrappedDeserializer AudioAttributesCompatParcelizer(float p0) {
        return write.IconCompatParcelizer(read(p0));
    }
}
