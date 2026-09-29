package in.juspay.hypersdk.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J-\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u001d\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010)"}, d2 = {"Lin/juspay/hypersdk/lifecycle/HyperFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "p0", "p1", "Landroid/content/Intent;", "p2", "", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/Context;", "onAttach", "(Landroid/content/Context;)V", "onDestroy", "onPause", "", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onResume", "Landroid/os/Bundle;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onStop", "Lin/juspay/hypersdk/lifecycle/FragmentEvent;", "Lin/juspay/hypersdk/lifecycle/EventListener;", "registerForEvent", "(Lin/juspay/hypersdk/lifecycle/FragmentEvent;Lin/juspay/hypersdk/lifecycle/EventListener;)V", "Lin/juspay/hypersdk/lifecycle/ActivityResultHolder;", "registerOnActivityResult", "(Lin/juspay/hypersdk/lifecycle/ActivityResultHolder;)V", "Lin/juspay/hypersdk/lifecycle/RequestPermissionResult;", "registerOnRequestPermissionResult", "(Lin/juspay/hypersdk/lifecycle/RequestPermissionResult;)V", "unRegisterForEvent", "(Lin/juspay/hypersdk/lifecycle/FragmentEvent;)V", "Ljava/util/LinkedList;", "onActivityResultListeners", "Ljava/util/LinkedList;", "onAttachListeners", "onDestroyListeners", "onPauseListeners", "onRequestPermissionsResultListeners", "onResumeListeners", "onSaveInstanceListeners", "onStopListeners"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HyperFragment extends Fragment {
    private final LinkedList<EventListener> onPauseListeners = new LinkedList<>();
    private final LinkedList<EventListener> onStopListeners = new LinkedList<>();
    private final LinkedList<EventListener> onResumeListeners = new LinkedList<>();
    private final LinkedList<EventListener> onDestroyListeners = new LinkedList<>();
    private final LinkedList<EventListener> onSaveInstanceListeners = new LinkedList<>();
    private final LinkedList<EventListener> onAttachListeners = new LinkedList<>();
    private final LinkedList<ActivityResultHolder> onActivityResultListeners = new LinkedList<>();
    private final LinkedList<RequestPermissionResult> onRequestPermissionsResultListeners = new LinkedList<>();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FragmentEvent.values().length];
            try {
                iArr[FragmentEvent.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FragmentEvent.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FragmentEvent.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FragmentEvent.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FragmentEvent.ON_SAVED_STATE_INSTANCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FragmentEvent.ON_ATTACH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FragmentEvent.ON_ACTIVITY_RESULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FragmentEvent.ON_REQUEST_PERMISSION_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void unRegisterForEvent(FragmentEvent p0) {
        switch (WhenMappings.$EnumSwitchMapping$0[p0.ordinal()]) {
            case 1:
                this.onPauseListeners.clear();
                break;
            case 2:
                this.onResumeListeners.clear();
                break;
            case 3:
                this.onStopListeners.clear();
                break;
            case 4:
                this.onDestroyListeners.clear();
                break;
            case 5:
                this.onSaveInstanceListeners.clear();
                break;
            case 6:
                this.onAttachListeners.clear();
                break;
            case 7:
                this.onActivityResultListeners.clear();
                break;
            case 8:
                this.onRequestPermissionsResultListeners.clear();
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) {
        super.onActivityResult(p0, p1, p2);
        Iterator<ActivityResultHolder> it = this.onActivityResultListeners.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(p0, p1, p2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onAttach(p0);
        Iterator<EventListener> it = this.onAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}", this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<EventListener> it = this.onDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}", this);
        }
        for (FragmentEvent fragmentEvent : FragmentEvent.values()) {
            unRegisterForEvent(fragmentEvent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Iterator<EventListener> it = this.onPauseListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}", this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        super.onRequestPermissionsResult(p0, p1, p2);
        Iterator<RequestPermissionResult> it = this.onRequestPermissionsResultListeners.iterator();
        while (it.hasNext()) {
            it.next().onRequestPermissionsResult(p0, p1, p2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Iterator<EventListener> it = this.onResumeListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}", this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onSaveInstanceState(p0);
        Iterator<EventListener> it = this.onSaveInstanceListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}", this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Iterator<EventListener> it = this.onStopListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent("{}", this);
        }
    }

    public final void registerForEvent(FragmentEvent p0, EventListener p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        switch (WhenMappings.$EnumSwitchMapping$0[p0.ordinal()]) {
            case 1:
                this.onPauseListeners.add(p1);
                break;
            case 2:
                this.onResumeListeners.add(p1);
                break;
            case 3:
                this.onStopListeners.add(p1);
                break;
            case 4:
                this.onDestroyListeners.add(p1);
                break;
            case 5:
                this.onSaveInstanceListeners.add(p1);
                break;
            case 6:
                this.onAttachListeners.add(p1);
                break;
        }
    }

    public final void registerOnActivityResult(ActivityResultHolder p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onActivityResultListeners.add(p0);
    }

    public final void registerOnRequestPermissionResult(RequestPermissionResult p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onRequestPermissionsResultListeners.add(p0);
    }
}
