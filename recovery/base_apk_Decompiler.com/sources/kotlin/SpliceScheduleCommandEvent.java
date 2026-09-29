package kotlin;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class SpliceScheduleCommandEvent {
    private final SpliceInsertCommandComponentSplice AudioAttributesCompatParcelizer;
    private final ensureInitialized AudioAttributesImplApi26Parcelizer;
    private final SpliceNullCommand1 IconCompatParcelizer;
    private final DefaultDownloadIndex MediaBrowserCompatCustomActionResultReceiver;
    private long RemoteActionCompatParcelizer;
    private final CurrentQuery read;
    private final Application.ActivityLifecycleCallbacks write;

    public SpliceScheduleCommandEvent(DefaultDownloadIndex defaultDownloadIndex, CurrentQuery currentQuery, SpliceNullCommand1 spliceNullCommand1, ensureInitialized ensureinitialized, SpliceInsertCommandComponentSplice spliceInsertCommandComponentSplice) {
        toMagicModuleMetaRepoModel.write(defaultDownloadIndex, "");
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        toMagicModuleMetaRepoModel.write(spliceNullCommand1, "");
        toMagicModuleMetaRepoModel.write(ensureinitialized, "");
        toMagicModuleMetaRepoModel.write(spliceInsertCommandComponentSplice, "");
        this.MediaBrowserCompatCustomActionResultReceiver = defaultDownloadIndex;
        this.read = currentQuery;
        this.IconCompatParcelizer = spliceNullCommand1;
        this.AudioAttributesImplApi26Parcelizer = ensureinitialized;
        this.AudioAttributesCompatParcelizer = spliceInsertCommandComponentSplice;
        this.RemoteActionCompatParcelizer = defaultDownloadIndex.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer();
        this.write = new AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
    }

    public final void write() {
        if (getTestPattern.read(getTestPattern.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(), this.RemoteActionCompatParcelizer), this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer()) > 0) {
            AudioAttributesCompatParcelizer();
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        C0201setMcqCount.IconCompatParcelizer(College.AudioAttributesCompatParcelizer(this.read), null, null, new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), null), 3);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ SpliceInsertCommand1 IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (SpliceScheduleCommandEvent.this.IconCompatParcelizer.write(this.IconCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(SpliceInsertCommand1 spliceInsertCommand1, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = spliceInsertCommand1;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return SpliceScheduleCommandEvent.this.new RemoteActionCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class AudioAttributesCompatParcelizer implements Application.ActivityLifecycleCallbacks {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            SpliceScheduleCommandEvent.this.write();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            SpliceScheduleCommandEvent.this.IconCompatParcelizer();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(activity, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
        }
    }

    public final Application.ActivityLifecycleCallbacks RemoteActionCompatParcelizer() {
        return this.write;
    }
}
