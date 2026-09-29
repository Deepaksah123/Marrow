package kotlin;

import com.marrow.data.models.common.ImageUpload;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class SlidingPercentileExternalSyntheticLambda0 implements SlidingPercentile1 {
    private final onUtcTimestampResolved read;

    @setSdkPayload
    public SlidingPercentileExternalSyntheticLambda0(onUtcTimestampResolved onutctimestampresolved) {
        toMagicModuleMetaRepoModel.write(onutctimestampresolved, "");
        this.read = onutctimestampresolved;
    }

    @Override // kotlin.SlidingPercentile1
    public final Object AudioAttributesCompatParcelizer(int i) {
        ArrayList arrayList;
        ImageUpload[] imageUploadArrIconCompatParcelizer = this.read.IconCompatParcelizer(i);
        if (imageUploadArrIconCompatParcelizer != null) {
            ArrayList arrayList2 = new ArrayList(imageUploadArrIconCompatParcelizer.length);
            for (ImageUpload imageUpload : imageUploadArrIconCompatParcelizer) {
                arrayList2.add(SlidingPercentileExternalSyntheticLambda1.IconCompatParcelizer(imageUpload));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : arrayList;
    }

    @Override // kotlin.SlidingPercentile1
    public final Object read(addSample addsample) {
        this.read.write2(SlidingPercentileExternalSyntheticLambda1.write(addsample));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.SlidingPercentile1
    public final Object IconCompatParcelizer(int i, int i2) {
        this.read.RemoteActionCompatParcelizer(i, i2);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.SlidingPercentile1
    public final Object AudioAttributesCompatParcelizer(String str) {
        return this.read.MediaBrowserCompatCustomActionResultReceiver(str);
    }
}
