package kotlin;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManagerFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class setResultCallback {
    public static void AudioAttributesCompatParcelizer(final Activity activity, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super Exception, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        final isCodecSupported iscodecsupportedCreate = ReviewManagerFactory.create(activity);
        toMagicModuleMetaRepoModel.write(iscodecsupportedCreate);
        try {
            Task<ReviewInfo> taskAudioAttributesCompatParcelizer = iscodecsupportedCreate.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taskAudioAttributesCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(taskAudioAttributesCompatParcelizer.addOnCompleteListener(new OnCompleteListener() { // from class: o.PendingResultStatusListener
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    setResultCallback.read(iscodecsupportedCreate, activity, getanswermap, getcreatedondatems, task);
                }
            }));
        } catch (Exception e) {
            getanswermap.invoke(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(isCodecSupported iscodecsupported, Activity activity, final getAnswerMap getanswermap, final getCreatedOnDateMs getcreatedondatems, final Task task) {
        toMagicModuleMetaRepoModel.write(task, "");
        if (task.isSuccessful()) {
            Task<Void> taskRemoteActionCompatParcelizer = iscodecsupported.RemoteActionCompatParcelizer(activity, (ReviewInfo) task.getResult());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taskRemoteActionCompatParcelizer, "");
            taskRemoteActionCompatParcelizer.addOnCompleteListener(new OnCompleteListener() { // from class: o.await
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    setResultCallback.write(getcreatedondatems, getanswermap, task, task2);
                }
            });
            return;
        }
        getanswermap.invoke(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, Task task, Task task2) {
        toMagicModuleMetaRepoModel.write(task2, "");
        if (task2.isSuccessful()) {
            getcreatedondatems.invoke();
        } else {
            getanswermap.invoke(task.getException());
        }
    }
}
