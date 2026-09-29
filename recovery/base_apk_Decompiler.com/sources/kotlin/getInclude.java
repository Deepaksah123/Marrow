package kotlin;

import android.view.View;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, d2 = {"Lo/getInclude;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Lo/_truncate;", "IconCompatParcelizer", "(Landroid/view/View;)Lo/_truncate;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/CoercionConfigs1;", "Ljava/util/concurrent/atomic/AtomicReference;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getInclude {
    public static final getInclude INSTANCE = new getInclude();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final AtomicReference<CoercionConfigs1> write = new AtomicReference<>(CoercionConfigs1.INSTANCE.RemoteActionCompatParcelizer());
    public static final int AudioAttributesCompatParcelizer = 8;

    private getInclude() {
    }

    public final _truncate IconCompatParcelizer(View p0) {
        _truncate _truncateVarAudioAttributesCompatParcelizer = write.get().AudioAttributesCompatParcelizer(p0);
        ConfigOverride.read(p0, _truncateVarAudioAttributesCompatParcelizer);
        p0.addOnAttachStateChangeListener(new read(C0201setMcqCount.IconCompatParcelizer(getInstitute.INSTANCE, getDisplayAddress.write(p0.getHandler(), "windowRecomposer cleanup").RemoteActionCompatParcelizer(), null, new RemoteActionCompatParcelizer(_truncateVarAudioAttributesCompatParcelizer, p0, null), 2)));
        return _truncateVarAudioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ _truncate RemoteActionCompatParcelizer;
        final /* synthetic */ View write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            View view;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesCompatParcelizer = 1;
                    if (this.RemoteActionCompatParcelizer.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                if (ConfigOverride.IconCompatParcelizer(view) == this.RemoteActionCompatParcelizer) {
                    ConfigOverride.read(this.write, null);
                }
                return getShowPopup.INSTANCE;
            } finally {
                if (ConfigOverride.IconCompatParcelizer(this.write) == this.RemoteActionCompatParcelizer) {
                    ConfigOverride.read(this.write, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(_truncate _truncateVar, View view, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = _truncateVar;
            this.write = view;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/getInclude$read;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "p0", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements View.OnAttachStateChangeListener {
        final /* synthetic */ setPassingYear RemoteActionCompatParcelizer;

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View p0) {
        }

        read(setPassingYear setpassingyear) {
            this.RemoteActionCompatParcelizer = setpassingyear;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View p0) {
            p0.removeOnAttachStateChangeListener(this);
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((CancellationException) null);
        }
    }
}
