package kotlin;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0003\u0012\u0014\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/withNext;", "Landroid/app/Fragment;", "<init>", "()V", "Lo/withNext$IconCompatParcelizer;", "p0", "", "read", "(Lo/withNext$IconCompatParcelizer;)V", "RemoteActionCompatParcelizer", "Landroid/os/Bundle;", "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "IconCompatParcelizer", "Lo/withNext$IconCompatParcelizer;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class withNext extends Fragment {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private IconCompatParcelizer read;

    /* JADX INFO: loaded from: classes2.dex */
    public interface IconCompatParcelizer {
        void AudioAttributesCompatParcelizer();

        void read();
    }

    private static void read(IconCompatParcelizer p0) {
        if (p0 != null) {
            p0.read();
        }
    }

    private static void RemoteActionCompatParcelizer(IconCompatParcelizer p0) {
        if (p0 != null) {
            p0.AudioAttributesCompatParcelizer();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle p0) {
        super.onActivityCreated(p0);
        anyIgnorals.read readVar = anyIgnorals.read.ON_CREATE;
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        read(this.read);
        anyIgnorals.read readVar = anyIgnorals.read.ON_START;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        RemoteActionCompatParcelizer(this.read);
        anyIgnorals.read readVar = anyIgnorals.read.ON_RESUME;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        anyIgnorals.read readVar = anyIgnorals.read.ON_PAUSE;
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        anyIgnorals.read readVar = anyIgnorals.read.ON_STOP;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        anyIgnorals.read readVar = anyIgnorals.read.ON_DESTROY;
        this.read = null;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\r"}, d2 = {"Lo/withNext$write;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/os/Bundle;", "p1", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityPostCreated", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostCreated(Activity p0, Bundle p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Companion companion = withNext.INSTANCE;
            Companion.IconCompatParcelizer(p0, anyIgnorals.read.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostStarted(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Companion companion = withNext.INSTANCE;
            Companion.IconCompatParcelizer(p0, anyIgnorals.read.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostResumed(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Companion companion = withNext.INSTANCE;
            Companion.IconCompatParcelizer(p0, anyIgnorals.read.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPrePaused(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Companion companion = withNext.INSTANCE;
            Companion.IconCompatParcelizer(p0, anyIgnorals.read.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreStopped(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Companion companion = withNext.INSTANCE;
            Companion.IconCompatParcelizer(p0, anyIgnorals.read.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreDestroyed(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Companion companion = withNext.INSTANCE;
            Companion.IconCompatParcelizer(p0, anyIgnorals.read.ON_DESTROY);
        }

        @getMagicModuleMeta
        public static final void registerIn(Activity activity) {
            Companion.AudioAttributesCompatParcelizer(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity p0, Bundle p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/withNext$write$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/app/Activity;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @getMagicModuleMeta
            public static void AudioAttributesCompatParcelizer(Activity p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                p0.registerActivityLifecycleCallbacks(new write());
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity p0, Bundle p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
        }
    }

    /* JADX INFO: renamed from: o.withNext$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/withNext$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/app/Activity;)V", "Lo/anyIgnorals$read;", "p1", "IconCompatParcelizer", "(Landroid/app/Activity;Lo/anyIgnorals$read;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            write.Companion companion = write.INSTANCE;
            write.Companion.AudioAttributesCompatParcelizer(p0);
            FragmentManager fragmentManager = p0.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new withNext(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @getMagicModuleMeta
        public static void IconCompatParcelizer(Activity p0, anyIgnorals.read p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (p0 instanceof getPrimaryMemberUnchecked) {
                ((getPrimaryMemberUnchecked) p0).getLifecycle().RemoteActionCompatParcelizer(p1);
            } else if (p0 instanceof hasGetter) {
                anyIgnorals lifecycle = ((hasGetter) p0).getLifecycle();
                if (lifecycle instanceof getSetterUnchecked) {
                    ((getSetterUnchecked) lifecycle).RemoteActionCompatParcelizer(p1);
                }
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
