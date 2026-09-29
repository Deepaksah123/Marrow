package kotlin;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.marrow.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nJ$\u0010\f\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0012\u0010\u0017\u001a\u00020\r2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0015J2\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 Je\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u00072\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2%\b\u0002\u0010%\u001a\u001f\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\r\u0018\u00010&2\b\b\u0002\u0010+\u001a\u00020\u001dH\u0002J\u0006\u0010,\u001a\u00020\rJ\u0018\u0010,\u001a\u00020\r2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nJ\b\u0010.\u001a\u00020\rH\u0002J\u0012\u0010/\u001a\u00020\u001d2\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u0019J\u0018\u00101\u001a\u00020\u001d2\u0010\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190 J\u0006\u00103\u001a\u00020\u001dJ\u0010\u00104\u001a\u00020\r2\u0006\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/marrow2/ui/main/navigation/HomeNavigation;", "", "<init>", "()V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fullScreenContainerChildCount", "", "upperContainerChildCount", "getUpperContainerChildCount", "Lkotlin/Function0;", "getFullScreenContainerChildCount", "onBackStackChange", "", "init", "mFragmentManager", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "onEntryToFullScreenMode", "onExitFromFullScreenMode", "getBelowTopFragmentFromStack", "Landroidx/fragment/app/Fragment;", "getTopFragmentFromStack", "openTabFragment", "fragment", "Ljava/lang/Class;", "openFragmentInFullScreen", "openFragmentInUpperScreen", "addToBackStack", "", "addAnimation", "sharedElement", "", "Landroid/view/View;", "pushFragment", "newFragment", "containerId", "setCustomAnimations", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ParameterName;", "name", "ft", "shouldAddCustomAnimations", "clearBackStack", "backStackClearedListener", "dismissActiveDialog", "isTopFragmentInstanceOf", "classname", "isFragmentsExistInStack", "listOfClasses", "hasSomeUpperItem", "logI", "message", "", "onDestroy", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class copyToBuffer {
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private FragmentManager AudioAttributesCompatParcelizer;
    private final FragmentManager.read AudioAttributesImplApi26Parcelizer = new FragmentManager.read() { // from class: o.DataBufferObserverSet
        @Override // androidx.fragment.app.FragmentManager.read
        public final void write() {
            copyToBuffer.read(this.read);
        }
    };
    private int MediaBrowserCompatCustomActionResultReceiver;
    private getCreatedOnDateMs<getShowPopup> MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private getCreatedOnDateMs<Integer> read;
    private getCreatedOnDateMs<Integer> write;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/copyToBuffer$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void RemoteActionCompatParcelizer(FragmentManager fragmentManager, getCreatedOnDateMs<Integer> getcreatedondatems, getCreatedOnDateMs<Integer> getcreatedondatems2, getCreatedOnDateMs<getShowPopup> getcreatedondatems3) {
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        write("HomeNavigation initiated");
        this.AudioAttributesCompatParcelizer = fragmentManager;
        this.RemoteActionCompatParcelizer = getcreatedondatems2.invoke().intValue();
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems.invoke().intValue();
        this.write = getcreatedondatems;
        this.read = getcreatedondatems2;
        this.MediaBrowserCompatItemReceiver = getcreatedondatems3;
        FragmentManager fragmentManager2 = this.AudioAttributesCompatParcelizer;
        if (fragmentManager2 != null) {
            fragmentManager2.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(copyToBuffer copytobuffer) {
        getCreatedOnDateMs<getShowPopup> getcreatedondatems = copytobuffer.MediaBrowserCompatItemReceiver;
        getCreatedOnDateMs<Integer> getcreatedondatems2 = null;
        if (getcreatedondatems == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getcreatedondatems = null;
        }
        getcreatedondatems.invoke();
        getCreatedOnDateMs<Integer> getcreatedondatems3 = copytobuffer.write;
        if (getcreatedondatems3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getcreatedondatems3 = null;
        }
        getCreatedOnDateMs<Integer> getcreatedondatems4 = copytobuffer.read;
        if (getcreatedondatems4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getcreatedondatems2 = getcreatedondatems4;
        }
        copytobuffer.read(getcreatedondatems3, getcreatedondatems2);
    }

    private final void read(getCreatedOnDateMs<Integer> getcreatedondatems, getCreatedOnDateMs<Integer> getcreatedondatems2) {
        FragmentManager fragmentManager = this.AudioAttributesCompatParcelizer;
        Integer numValueOf = fragmentManager != null ? Integer.valueOf(fragmentManager.onCustomAction()) : null;
        Integer numInvoke = getcreatedondatems2.invoke();
        Integer numInvoke2 = getcreatedondatems.invoke();
        Fragment fragmentIconCompatParcelizer = IconCompatParcelizer();
        StringBuilder sb = new StringBuilder("backStackCount =  ");
        sb.append(numValueOf);
        sb.append("  fullContainer child Count = ");
        sb.append(numInvoke);
        sb.append(" upperContainer child Count = ");
        sb.append(numInvoke2);
        sb.append("  Top Fragment  ");
        sb.append(fragmentIconCompatParcelizer);
        write(sb.toString());
        if (this.RemoteActionCompatParcelizer == 0 && getcreatedondatems2.invoke().intValue() > 0) {
            RemoteActionCompatParcelizer(getcreatedondatems);
        } else if (this.RemoteActionCompatParcelizer > 0 && getcreatedondatems2.invoke().intValue() == 0) {
            AudioAttributesCompatParcelizer(getcreatedondatems);
        } else if (this.MediaBrowserCompatCustomActionResultReceiver == 0 && getcreatedondatems.invoke().intValue() > 0) {
            write("Notify Home View Pager Hidden");
        } else if (this.MediaBrowserCompatCustomActionResultReceiver > 0 && getcreatedondatems.invoke().intValue() == 0) {
            write("Notify Home View Pager Visibility");
        }
        this.RemoteActionCompatParcelizer = getcreatedondatems2.invoke().intValue();
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems.invoke().intValue();
    }

    private final void RemoteActionCompatParcelizer(getCreatedOnDateMs<Integer> getcreatedondatems) {
        if (getcreatedondatems.invoke().intValue() > 0) {
            write("Notify upper containers top fragment Hidden");
            Fragment fragmentAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (fragmentAudioAttributesCompatParcelizer != null) {
                fragmentAudioAttributesCompatParcelizer.onPause();
                return;
            }
            return;
        }
        write("Notify Home View Pager Hidden");
    }

    private final void AudioAttributesCompatParcelizer(getCreatedOnDateMs<Integer> getcreatedondatems) {
        if (getcreatedondatems.invoke().intValue() == 0) {
            write("Notify Home View Pager Visibility");
            return;
        }
        write("Notify upper containers top fragment Visibility");
        Fragment fragmentIconCompatParcelizer = IconCompatParcelizer();
        if (fragmentIconCompatParcelizer != null) {
            fragmentIconCompatParcelizer.onResume();
        }
    }

    private final Fragment AudioAttributesCompatParcelizer() {
        FragmentManager fragmentManager = this.AudioAttributesCompatParcelizer;
        if (fragmentManager == null) {
            return null;
        }
        int size = fragmentManager.handleMediaPlayPauseIfPendingOnHandler().size();
        if (fragmentManager.handleMediaPlayPauseIfPendingOnHandler().isEmpty() || size == 1) {
            return null;
        }
        return fragmentManager.handleMediaPlayPauseIfPendingOnHandler().get(size - 2);
    }

    private Fragment IconCompatParcelizer() {
        FragmentManager fragmentManager = this.AudioAttributesCompatParcelizer;
        if (fragmentManager == null) {
            return null;
        }
        write("back count size: ".concat(String.valueOf(fragmentManager.onCustomAction())));
        write("size: ".concat(String.valueOf(fragmentManager.handleMediaPlayPauseIfPendingOnHandler().size())));
        write(fragmentManager.handleMediaPlayPauseIfPendingOnHandler().toString());
        if (fragmentManager.handleMediaPlayPauseIfPendingOnHandler().isEmpty()) {
            return null;
        }
        List<Fragment> listHandleMediaPlayPauseIfPendingOnHandler = fragmentManager.handleMediaPlayPauseIfPendingOnHandler();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listHandleMediaPlayPauseIfPendingOnHandler, "");
        return (Fragment) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) listHandleMediaPlayPauseIfPendingOnHandler);
    }

    public final void write(Class<?> cls) throws IllegalAccessException, InstantiationException {
        toMagicModuleMetaRepoModel.write(cls, "");
        String strConcat = "Home_".concat(String.valueOf(cls.getName()));
        FragmentManager fragmentManager = this.AudioAttributesCompatParcelizer;
        if (fragmentManager != null) {
            _doAddInjectable _doaddinjectableIconCompatParcelizer = fragmentManager.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer, "");
            List<Fragment> listHandleMediaPlayPauseIfPendingOnHandler = fragmentManager.handleMediaPlayPauseIfPendingOnHandler();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listHandleMediaPlayPauseIfPendingOnHandler, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listHandleMediaPlayPauseIfPendingOnHandler) {
                String tag = ((Fragment) obj).getTag();
                if (tag != null && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(tag, "Home_")) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                _doaddinjectableIconCompatParcelizer.AudioAttributesCompatParcelizer((Fragment) it.next());
            }
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(strConcat);
            if (fragmentFindFragmentByTag == null) {
                Object objNewInstance = cls.newInstance();
                toMagicModuleMetaRepoModel.read(objNewInstance, "");
                _doaddinjectableIconCompatParcelizer.read(R.id.upperContainer, (Fragment) objNewInstance, strConcat);
            } else {
                _doaddinjectableIconCompatParcelizer.IconCompatParcelizer(fragmentFindFragmentByTag);
            }
            _doaddinjectableIconCompatParcelizer.write();
        }
    }

    public final void IconCompatParcelizer(Fragment fragment) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        AudioAttributesCompatParcelizer(fragment, true, R.id.fullContainer, null, null, true);
    }

    public final void RemoteActionCompatParcelizer(Fragment fragment, boolean z, boolean z2, List<? extends View> list) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        AudioAttributesCompatParcelizer(fragment, z, R.id.upperContainer, list, new getAnswerMap() { // from class: o.DataBufferObserverObservable
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return copyToBuffer.read((_doAddInjectable) obj);
            }
        }, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_doAddInjectable _doaddinjectable) {
        toMagicModuleMetaRepoModel.write(_doaddinjectable, "");
        _doaddinjectable.RemoteActionCompatParcelizer(android.R.anim.fade_in, android.R.anim.fade_out, android.R.anim.fade_in, android.R.anim.fade_out);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(Fragment fragment, boolean z, int i, List<? extends View> list, getAnswerMap<? super _doAddInjectable, getShowPopup> getanswermap, boolean z2) {
        FragmentManager fragmentManager;
        Class<?> cls = fragment.getClass();
        Fragment fragmentIconCompatParcelizer = IconCompatParcelizer();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, fragmentIconCompatParcelizer != null ? fragmentIconCompatParcelizer.getClass() : null) || (fragmentManager = this.AudioAttributesCompatParcelizer) == null) {
            return;
        }
        _doAddInjectable _doaddinjectableIconCompatParcelizer = fragmentManager.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer, "");
        if (z2) {
            if (getanswermap != null) {
                getanswermap.invoke(_doaddinjectableIconCompatParcelizer);
            } else {
                toMagicModuleMetaRepoModel.write(_doaddinjectableIconCompatParcelizer.RemoteActionCompatParcelizer(R.anim.trans_left_in, R.anim.trans_left_out, R.anim.trans_right_in, R.anim.trans_right_out));
            }
        }
        if (list != null) {
            for (View view : list) {
                _doaddinjectableIconCompatParcelizer.RemoteActionCompatParcelizer(view, view.getTransitionName());
            }
        }
        _doaddinjectableIconCompatParcelizer.write(i, fragment, fragment.getClass().getName());
        if (z) {
            _doaddinjectableIconCompatParcelizer.read(fragment.getClass().getName());
        } else {
            _doaddinjectableIconCompatParcelizer.read((String) null);
        }
        _doaddinjectableIconCompatParcelizer.write();
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer > 0;
    }

    private static void write(String str) {
        buildResolutionString.IconCompatParcelizer("HomeNavigation", str);
    }

    public final void write() {
        FragmentManager fragmentManager = this.AudioAttributesCompatParcelizer;
        if (fragmentManager != null) {
            fragmentManager.write(this.AudioAttributesImplApi26Parcelizer);
        }
        this.AudioAttributesCompatParcelizer = null;
    }
}
