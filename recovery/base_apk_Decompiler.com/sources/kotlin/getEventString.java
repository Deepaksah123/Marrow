package kotlin;

import com.marrow.data.models.test.TestGroupLSModel;
import com.marrow.data.models.test.TestIndex;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface getEventString {
    Object AudioAttributesCompatParcelizer(String str);

    Object AudioAttributesCompatParcelizer(String str, long j, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(List<TestGroupLSModel> list);

    Object AudioAttributesCompatParcelizer(GlTextureInfo glTextureInfo);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super TestIndex> sampleVideos);

    Object AudioAttributesCompatParcelizer(boolean z, String str);

    Object AudioAttributesCompatParcelizer(boolean z, String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesImplBaseParcelizer(String str);

    Object IconCompatParcelizer(String str);

    Object IconCompatParcelizer(String str, long j, SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super List<? extends TestIndex>> sampleVideos);

    Object RemoteActionCompatParcelizer(long j, long j2, SampleVideos<? super List<FileTypesType>> sampleVideos);

    Object RemoteActionCompatParcelizer(String str);

    Object RemoteActionCompatParcelizer(String str, String str2, SampleVideos<? super getShowPopup> sampleVideos);

    Object read();

    Object read(String str);

    Object write();

    Object write(TestIndex testIndex);

    Object write(String str);

    Object write(FlagSet flagSet);
}
