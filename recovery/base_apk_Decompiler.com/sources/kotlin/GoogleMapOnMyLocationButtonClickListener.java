package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\u000b"}, d2 = {"Lo/GoogleMapOnMyLocationButtonClickListener;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "write", "I", "IconCompatParcelizer", "()I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoogleMapOnMyLocationButtonClickListener {
    private static final /* synthetic */ GoogleMapOnMyLocationButtonClickListener[] AudioAttributesCompatParcelizer;
    public static final GoogleMapOnMyLocationButtonClickListener IconCompatParcelizer = new GoogleMapOnMyLocationButtonClickListener("FRONT_IMAGE", 0, 1);
    public static final GoogleMapOnMyLocationButtonClickListener RemoteActionCompatParcelizer = new GoogleMapOnMyLocationButtonClickListener("BACK_IMAGE", 1, 2);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    private GoogleMapOnMyLocationButtonClickListener(String str, int i, int i2) {
        this.AudioAttributesCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    static {
        GoogleMapOnMyLocationButtonClickListener[] googleMapOnMyLocationButtonClickListenerArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer = googleMapOnMyLocationButtonClickListenerArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(googleMapOnMyLocationButtonClickListenerArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ GoogleMapOnMyLocationButtonClickListener[] RemoteActionCompatParcelizer() {
        return new GoogleMapOnMyLocationButtonClickListener[]{IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static GoogleMapOnMyLocationButtonClickListener valueOf(String str) {
        return (GoogleMapOnMyLocationButtonClickListener) Enum.valueOf(GoogleMapOnMyLocationButtonClickListener.class, str);
    }

    public static GoogleMapOnMyLocationButtonClickListener[] values() {
        return (GoogleMapOnMyLocationButtonClickListener[]) AudioAttributesCompatParcelizer.clone();
    }
}
