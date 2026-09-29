package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u0010J\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001f"}, d2 = {"Lo/GservicesValue;", "Lo/commitSampleToOutput;", "Lkotlin/Function0;", "", "p0", "p1", "p2", "p3", "<init>", "(Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "Landroid/content/Context;", "IconCompatParcelizer", "(Landroid/content/Context;)V", "Lo/FlvExtractorExternalSyntheticLambda0;", "RemoteActionCompatParcelizer", "(Lo/FlvExtractorExternalSyntheticLambda0;)V", "()V", "Lo/assertInCues;", "AudioAttributesCompatParcelizer", "(Lo/assertInCues;)V", "write", "AudioAttributesImplApi26Parcelizer", "Lo/getCreatedOnDateMs;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "read", "Lo/readTagData;", "Lo/readTagData;", "Landroid/content/Context;", "AudioAttributesImplBaseParcelizer", "", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GservicesValue implements commitSampleToOutput {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private readTagData IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Context AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    public GservicesValue(getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getCreatedOnDateMs<getShowPopup> getcreatedondatems3, getCreatedOnDateMs<getShowPopup> getcreatedondatems4) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
        this.write = getcreatedondatems2;
        this.RemoteActionCompatParcelizer = getcreatedondatems3;
        this.read = getcreatedondatems4;
    }

    public final void IconCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesImplBaseParcelizer = p0;
        readTagData readtagdataWrite = skipToTagHeader.write(p0);
        this.IconCompatParcelizer = readtagdataWrite;
        if (readtagdataWrite != null) {
            readtagdataWrite.read(this);
        }
        readTagData readtagdata = this.IconCompatParcelizer;
        Task<FlvExtractorExternalSyntheticLambda0> task = readtagdata != null ? readtagdata.read() : null;
        if (task != null) {
            final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.AbstractDataBuffer
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return GservicesValue.read(this.read, (FlvExtractorExternalSyntheticLambda0) obj);
                }
            };
            task.addOnSuccessListener(new OnSuccessListener() { // from class: o.override
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    GservicesValue.IconCompatParcelizer(getanswermap, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(GservicesValue gservicesValue, FlvExtractorExternalSyntheticLambda0 flvExtractorExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(flvExtractorExternalSyntheticLambda0, "");
        if (flvExtractorExternalSyntheticLambda0.write() == 2) {
            gservicesValue.RemoteActionCompatParcelizer(flvExtractorExternalSyntheticLambda0);
        } else {
            buildResolutionString.IconCompatParcelizer("Update *** ->", "No Update available");
        }
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(FlvExtractorExternalSyntheticLambda0 p0) {
        try {
            buildResolutionString.IconCompatParcelizer("Update *** ->", "Starting update");
            readTagData readtagdata = this.IconCompatParcelizer;
            if (readtagdata != null) {
                Context context = this.AudioAttributesImplBaseParcelizer;
                if (context == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    context = null;
                }
                readtagdata.write(p0, (Activity) context);
            }
        } catch (IntentSender.SendIntentException e) {
            buildResolutionString.IconCompatParcelizer("Update *** ->", String.valueOf(e.getMessage()));
        }
    }

    public final void RemoteActionCompatParcelizer() {
        readTagData readtagdata = this.IconCompatParcelizer;
        if (readtagdata == null) {
            return;
        }
        toMagicModuleMetaRepoModel.write(readtagdata);
        Task<FlvExtractorExternalSyntheticLambda0> task = readtagdata.read();
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.resetOverride
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return GservicesValue.write(this.RemoteActionCompatParcelizer, (FlvExtractorExternalSyntheticLambda0) obj);
            }
        };
        task.addOnSuccessListener(new OnSuccessListener() { // from class: o.getBinderSafe
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                GservicesValue.AudioAttributesCompatParcelizer(getanswermap, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(GservicesValue gservicesValue, FlvExtractorExternalSyntheticLambda0 flvExtractorExternalSyntheticLambda0) {
        if (flvExtractorExternalSyntheticLambda0.IconCompatParcelizer() == 11) {
            gservicesValue.write.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer() {
        readTagData readtagdata = this.IconCompatParcelizer;
        if (readtagdata != null) {
            readtagdata.IconCompatParcelizer(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.finishWriteSampleData
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(assertInCues p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = p0.read();
        if (i == 2) {
            if (this.MediaBrowserCompatItemReceiver) {
                return;
            }
            this.MediaBrowserCompatItemReceiver = true;
            this.AudioAttributesCompatParcelizer.invoke();
            return;
        }
        if (i == 11) {
            this.write.invoke();
            return;
        }
        if (i == 4) {
            this.RemoteActionCompatParcelizer.invoke();
        } else if (i == 5 || i == 6) {
            this.read.invoke();
            this.MediaBrowserCompatItemReceiver = false;
        }
    }

    public final void write() {
        readTagData readtagdata = this.IconCompatParcelizer;
        if (readtagdata != null) {
            readtagdata.write();
        }
    }
}
