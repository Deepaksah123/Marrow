package kotlin;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/TopUserCompanion;", "Landroid/os/CancellationSignal;", "p0", "Lkotlin/Function2;", "Lo/SampleVideos;", "", "", "p1", "Lo/setPassingYear;", "write", "(Lo/TopUserCompanion;Landroid/os/CancellationSignal;Lo/MagicModuleSubmissionRequestBody;)Lo/setPassingYear;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class nonSharedInstance {

    /* JADX INFO: renamed from: o.nonSharedInstance$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ CancellationSignal $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            AudioAttributesCompatParcelizer(th);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(Throwable th) {
            if (th != null) {
                this.$read.cancel();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CancellationSignal cancellationSignal) {
            super(1);
            this.$read = cancellationSignal;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setPassingYear write(TopUserCompanion topUserCompanion, CancellationSignal cancellationSignal, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        final setPassingYear setpassingyearIconCompatParcelizer = C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, magicModuleSubmissionRequestBody, 3);
        setpassingyearIconCompatParcelizer.RemoteActionCompatParcelizer(new AnonymousClass2(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: o.DatatypeFeature
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                nonSharedInstance.AudioAttributesCompatParcelizer(setpassingyearIconCompatParcelizer);
            }
        });
        return setpassingyearIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setPassingYear setpassingyear) {
        setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
    }
}
