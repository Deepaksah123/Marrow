package kotlin;

import com.marrow2.data.kyc.remote.model.KycUploadResponseBody;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0007\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\nH¦@¢\u0006\u0004\b\u0007\u0010\u000eJ\u0010\u0010\r\u001a\u00020\u0012H¦@¢\u0006\u0004\b\r\u0010\u0013À\u0006\u0003"}, d2 = {"Lo/skipShortTermReferencePictureSets;", "", "", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "", "", "Lo/unescapeStream;", "write", "(ILo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "(Lo/unescapeStream;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/GoogleMapOnMyLocationButtonClickListener;", "(Lo/GoogleMapOnMyLocationButtonClickListener;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/data/kyc/remote/model/KycUploadResponseBody;", "Lo/ExperimentalBandwidthMeterExternalSyntheticLambda0;", "(Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface skipShortTermReferencePictureSets {
    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(GoogleMapOnMyLocationButtonClickListener googleMapOnMyLocationButtonClickListener, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(unescapeStream unescapestream, SampleVideos<? super KycUploadResponseBody> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super ExperimentalBandwidthMeterExternalSyntheticLambda0> sampleVideos);

    Object IconCompatParcelizer(unescapeStream unescapestream, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(int i, SampleVideos<? super List<unescapeStream>> sampleVideos);
}
