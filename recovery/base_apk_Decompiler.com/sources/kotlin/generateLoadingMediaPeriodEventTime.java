package kotlin;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManagerFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class generateLoadingMediaPeriodEventTime {
    private final RenewEligible AudioAttributesCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getEventTime
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return generateLoadingMediaPeriodEventTime.read();
        }
    });

    private final Class<?> write() {
        return (Class) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class read() {
        try {
            return Class.forName("com.google.android.play.core.review.ReviewManagerFactory");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return write() != null;
    }

    public final void RemoteActionCompatParcelizer(Context context, final RendererWakeupListener rendererWakeupListener, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super Exception, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if (!AudioAttributesCompatParcelizer()) {
            RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
            getanswermap.invoke(null);
            return;
        }
        final isCodecSupported iscodecsupportedCreate = ReviewManagerFactory.create(context);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iscodecsupportedCreate, "");
        Task<ReviewInfo> taskAudioAttributesCompatParcelizer = iscodecsupportedCreate.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taskAudioAttributesCompatParcelizer, "");
        taskAudioAttributesCompatParcelizer.addOnCompleteListener(new OnCompleteListener() { // from class: o.r8lambdap5Le72Gb0piBzsmkmTOSikY6UE0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                generateLoadingMediaPeriodEventTime.RemoteActionCompatParcelizer(iscodecsupportedCreate, rendererWakeupListener, getanswermap, getcreatedondatems, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(isCodecSupported iscodecsupported, RendererWakeupListener rendererWakeupListener, getAnswerMap getanswermap, final getCreatedOnDateMs getcreatedondatems, Task task) {
        toMagicModuleMetaRepoModel.write(iscodecsupported, "");
        toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(task, "");
        if (task.isSuccessful()) {
            ReviewInfo reviewInfo = (ReviewInfo) task.getResult();
            Activity activityIconCompatParcelizer = copyWithPlaceholderTimeline.IconCompatParcelizer();
            if (activityIconCompatParcelizer != null) {
                Task<Void> taskRemoteActionCompatParcelizer = iscodecsupported.RemoteActionCompatParcelizer(activityIconCompatParcelizer, reviewInfo);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taskRemoteActionCompatParcelizer, "");
                taskRemoteActionCompatParcelizer.addOnCompleteListener(new OnCompleteListener() { // from class: o.DefaultAnalyticsCollector
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        generateLoadingMediaPeriodEventTime.RemoteActionCompatParcelizer(getcreatedondatems, task2);
                    }
                });
                return;
            } else {
                RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
                getanswermap.invoke(null);
                return;
            }
        }
        task.getException();
        RendererWakeupListener.onCustomAction();
        getanswermap.invoke(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems, Task task) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(task, "");
        getcreatedondatems.invoke();
    }
}
