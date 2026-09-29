package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {"Lo/LinearLayoutCompat;", "Lo/assignParameter;", "p0", "Lo/isRound;", "p1", "p2", "", "IconCompatParcelizer", "(Lo/LinearLayoutCompat;FLo/isRound;Lo/isRound;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/setOnQueryTextFocusChangeListener;", "RemoteActionCompatParcelizer", "Lo/setOnQueryTextFocusChangeListener;", "write", "Lo/safeSizeOf;", "AudioAttributesCompatParcelizer", "Lo/safeSizeOf;", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeObjectFieldValueSeparator {
    private static final safeSizeOf<assignParameter> AudioAttributesCompatParcelizer;
    private static final setOnQueryTextFocusChangeListener RemoteActionCompatParcelizer;
    private static final safeSizeOf<assignParameter> read;
    private static final safeSizeOf<assignParameter> write;

    public static final Object IconCompatParcelizer(LinearLayoutCompat<assignParameter, ?> linearLayoutCompat, float f, isRound isround, isRound isround2, SampleVideos<? super getShowPopup> sampleVideos) {
        setOrientation<assignParameter> setorientationWrite;
        if (isround2 != null) {
            setorientationWrite = PrettyPrinter.INSTANCE.write(isround2);
        } else {
            setorientationWrite = isround != null ? PrettyPrinter.INSTANCE.read(isround) : null;
        }
        setOrientation<assignParameter> setorientation = setorientationWrite;
        if (setorientation != null) {
            Object objAudioAttributesCompatParcelizer$default = LinearLayoutCompat.AudioAttributesCompatParcelizer$default(linearLayoutCompat, assignParameter.read(f), setorientation, null, null, sampleVideos, 12, null);
            return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
        }
        Object obj = linearLayoutCompat.read(assignParameter.read(f), sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    static {
        setMaxWidth setmaxwidth = new setMaxWidth(0.4f, BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f);
        RemoteActionCompatParcelizer = setmaxwidth;
        AudioAttributesCompatParcelizer = new safeSizeOf<>(120, 0, setShowText.AudioAttributesCompatParcelizer(), 2, null);
        write = new safeSizeOf<>(150, 0, setmaxwidth, 2, null);
        read = new safeSizeOf<>(120, 0, setmaxwidth, 2, null);
    }
}
