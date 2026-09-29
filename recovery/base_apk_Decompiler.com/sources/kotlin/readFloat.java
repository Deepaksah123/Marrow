package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
final class readFloat implements readTagData {
    private final parseInternal AudioAttributesCompatParcelizer;
    private final Handler IconCompatParcelizer = new Handler(Looper.getMainLooper());
    private final floatElement RemoteActionCompatParcelizer;
    private final Context write;

    readFloat(floatElement floatelement, parseInternal parseinternal, Context context) {
        this.RemoteActionCompatParcelizer = floatelement;
        this.AudioAttributesCompatParcelizer = parseinternal;
        this.write = context;
    }

    @Override // kotlin.readTagData
    public final void IconCompatParcelizer(commitSampleToOutput commitsampletooutput) {
        synchronized (this) {
            this.AudioAttributesCompatParcelizer.write((finishWriteSampleData) commitsampletooutput);
        }
    }

    @Override // kotlin.readTagData
    public final Task<FlvExtractorExternalSyntheticLambda0> read() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.getPackageName());
    }

    @Override // kotlin.readTagData
    public final void read(commitSampleToOutput commitsampletooutput) {
        synchronized (this) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(commitsampletooutput);
        }
    }

    @Override // kotlin.readTagData
    public final Task<Void> write() {
        return this.RemoteActionCompatParcelizer.read(this.write.getPackageName());
    }

    @Override // kotlin.readTagData
    public final boolean write(FlvExtractorExternalSyntheticLambda0 flvExtractorExternalSyntheticLambda0, Activity activity) throws IntentSender.SendIntentException {
        readFlvHeader readflvheaderIconCompatParcelizer = readFlvHeader.IconCompatParcelizer(0);
        if (activity == null) {
            return false;
        }
        return AudioAttributesCompatParcelizer(flvExtractorExternalSyntheticLambda0, new parseMotionPhotoV1Directory(activity), readflvheaderIconCompatParcelizer, 1234);
    }

    private static boolean AudioAttributesCompatParcelizer(FlvExtractorExternalSyntheticLambda0 flvExtractorExternalSyntheticLambda0, stringElement stringelement, readFlvHeader readflvheader, int i) throws IntentSender.SendIntentException {
        if (flvExtractorExternalSyntheticLambda0 == null || readflvheader == null || !flvExtractorExternalSyntheticLambda0.AudioAttributesCompatParcelizer(readflvheader) || flvExtractorExternalSyntheticLambda0.AudioAttributesCompatParcelizer()) {
            return false;
        }
        flvExtractorExternalSyntheticLambda0.read();
        stringelement.RemoteActionCompatParcelizer(flvExtractorExternalSyntheticLambda0.write(readflvheader).getIntentSender(), 1234);
        return true;
    }
}
