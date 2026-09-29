package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin._checkBooleanToStringCoercion;
import kotlin.anyIgnorals;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes.dex */
public class maybeGetTypeVariable extends MediaBrowserCompatMediaItem implements _checkBooleanToStringCoercion.AudioAttributesImplApi26Parcelizer {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final getSetterUnchecked mFragmentLifecycleRegistry;
    final NopAnnotationIntrospector mFragments;
    boolean mResumed;
    boolean mStopped;

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // o._checkBooleanToStringCoercion.AudioAttributesImplApi26Parcelizer
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public maybeGetTypeVariable() {
        this.mFragments = NopAnnotationIntrospector.IconCompatParcelizer(new write());
        this.mFragmentLifecycleRegistry = new getSetterUnchecked(this);
        this.mStopped = true;
        init();
    }

    public maybeGetTypeVariable(int i) {
        super(i);
        this.mFragments = NopAnnotationIntrospector.IconCompatParcelizer(new write());
        this.mFragmentLifecycleRegistry = new getSetterUnchecked(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().IconCompatParcelizer(LIFECYCLE_TAG, new setOnChartValueSelectedListener.AudioAttributesCompatParcelizer() { // from class: o.findByName
            @Override // o.setOnChartValueSelectedListener.AudioAttributesCompatParcelizer
            public final Bundle read() {
                return this.AudioAttributesCompatParcelizer.m382lambda$init$0$androidxfragmentappFragmentActivity();
            }
        });
        addOnConfigurationChangedListener(new wrapAsJsonMappingException() { // from class: o.narrowMethodTypeParameters
            @Override // kotlin.wrapAsJsonMappingException
            public final void AudioAttributesCompatParcelizer(Object obj) {
                this.RemoteActionCompatParcelizer.m383lambda$init$1$androidxfragmentappFragmentActivity((Configuration) obj);
            }
        });
        addOnNewIntentListener(new wrapAsJsonMappingException() { // from class: o.maybeGetParameterizedType
            @Override // kotlin.wrapAsJsonMappingException
            public final void AudioAttributesCompatParcelizer(Object obj) {
                this.IconCompatParcelizer.m384lambda$init$2$androidxfragmentappFragmentActivity((Intent) obj);
            }
        });
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.pessimisticallyValidateBound
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                this.AudioAttributesCompatParcelizer.m385lambda$init$3$androidxfragmentappFragmentActivity(context);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$init$0$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ Bundle m382lambda$init$0$androidxfragmentappFragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.RemoteActionCompatParcelizer(anyIgnorals.read.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: renamed from: lambda$init$1$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m383lambda$init$1$androidxfragmentappFragmentActivity(Configuration configuration) {
        this.mFragments.RatingCompat();
    }

    /* JADX INFO: renamed from: lambda$init$2$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m384lambda$init$2$androidxfragmentappFragmentActivity(Intent intent) {
        this.mFragments.RatingCompat();
    }

    /* JADX INFO: renamed from: lambda$init$3$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m385lambda$init$3$androidxfragmentappFragmentActivity(Context context) {
        this.mFragments.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.RatingCompat();
        super.onActivityResult(i, i2, intent);
    }

    public void supportFinishAfterTransition() {
        _checkBooleanToStringCoercion.write(this);
    }

    public void setEnterSharedElementCallback(_intOverflow _intoverflow) {
        _checkBooleanToStringCoercion.IconCompatParcelizer(this, _intoverflow);
    }

    public void setExitSharedElementCallback(_intOverflow _intoverflow) {
        _checkBooleanToStringCoercion.read(this, _intoverflow);
    }

    public void supportPostponeEnterTransition() {
        _checkBooleanToStringCoercion.read(this);
    }

    public void supportStartPostponedEnterTransition() {
        _checkBooleanToStringCoercion.AudioAttributesCompatParcelizer(this);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.RemoteActionCompatParcelizer(anyIgnorals.read.ON_CREATE);
        this.mFragments.read();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.IconCompatParcelizer(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.IconCompatParcelizer();
        this.mFragmentLifecycleRegistry.RemoteActionCompatParcelizer(anyIgnorals.read.ON_DESTROY);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.write(menuItem);
        }
        return false;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.RemoteActionCompatParcelizer();
        this.mFragmentLifecycleRegistry.RemoteActionCompatParcelizer(anyIgnorals.read.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.RatingCompat();
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        this.mFragments.RatingCompat();
        super.onResume();
        this.mResumed = true;
        this.mFragments.MediaBrowserCompatItemReceiver();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.RemoteActionCompatParcelizer(anyIgnorals.read.ON_RESUME);
        this.mFragments.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        this.mFragments.RatingCompat();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.write();
        }
        this.mFragments.MediaBrowserCompatItemReceiver();
        this.mFragmentLifecycleRegistry.RemoteActionCompatParcelizer(anyIgnorals.read.ON_START);
        this.mFragments.AudioAttributesImplApi26Parcelizer();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.AudioAttributesImplBaseParcelizer();
        this.mFragmentLifecycleRegistry.RemoteActionCompatParcelizer(anyIgnorals.read.ON_STOP);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            String string = sb.toString();
            printWriter.print(string);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                JsonAnyFormatVisitor.RemoteActionCompatParcelizer(this).write(string, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.AudioAttributesImplApi21Parcelizer().write(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.AudioAttributesImplApi21Parcelizer();
    }

    @Deprecated
    public JsonAnyFormatVisitor getSupportLoaderManager() {
        return JsonAnyFormatVisitor.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.RatingCompat();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            _checkBooleanToStringCoercion.read(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            _checkBooleanToStringCoercion.IconCompatParcelizer(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    class write extends pessimisticallyValidateBounds<maybeGetTypeVariable> implements _isPosInf, _isTrue, _findCoercionFromBlankString, _findCoercionFromEmptyArray, TypeResolutionContext, onSetShuffleMode, _init_lambda3, PieChart, _addInjectables, UntypedObjectDeserializerNR {
        public write() {
            super(maybeGetTypeVariable.this);
        }

        @Override // kotlin.hasGetter
        public final anyIgnorals getLifecycle() {
            return maybeGetTypeVariable.this.mFragmentLifecycleRegistry;
        }

        @Override // kotlin.TypeResolutionContext
        public final hasMixIns getViewModelStore() {
            return maybeGetTypeVariable.this.getViewModelStore();
        }

        @Override // kotlin.onSetShuffleMode
        /* JADX INFO: renamed from: getOnBackPressedDispatcher */
        public final onSetRating getIconCompatParcelizer() {
            return maybeGetTypeVariable.this.getIconCompatParcelizer();
        }

        @Override // kotlin.pessimisticallyValidateBounds
        public final void write(String str, PrintWriter printWriter, String[] strArr) {
            maybeGetTypeVariable.this.dump(str, null, printWriter, strArr);
        }

        @Override // kotlin.pessimisticallyValidateBounds
        public final LayoutInflater RemoteActionCompatParcelizer() {
            return maybeGetTypeVariable.this.getLayoutInflater().cloneInContext(maybeGetTypeVariable.this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.pessimisticallyValidateBounds
        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
        public maybeGetTypeVariable write() {
            return maybeGetTypeVariable.this;
        }

        @Override // kotlin.pessimisticallyValidateBounds
        public final void read() {
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.pessimisticallyValidateBounds
        public final boolean write(String str) {
            return _checkBooleanToStringCoercion.write(maybeGetTypeVariable.this, str);
        }

        @Override // kotlin._addInjectables
        public final void read(Fragment fragment) {
            maybeGetTypeVariable.this.onAttachFragment(fragment);
        }

        @Override // kotlin.pessimisticallyValidateBounds, kotlin.getAlwaysAsId
        public final View read(int i) {
            return maybeGetTypeVariable.this.findViewById(i);
        }

        @Override // kotlin.pessimisticallyValidateBounds, kotlin.getAlwaysAsId
        public final boolean AudioAttributesCompatParcelizer() {
            Window window = maybeGetTypeVariable.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // kotlin._init_lambda3
        public final r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 getActivityResultRegistry() {
            return maybeGetTypeVariable.this.getActivityResultRegistry();
        }

        @Override // kotlin.PieChart
        public final setOnChartValueSelectedListener getSavedStateRegistry() {
            return maybeGetTypeVariable.this.getSavedStateRegistry();
        }

        @Override // kotlin._isPosInf
        public final void addOnConfigurationChangedListener(wrapAsJsonMappingException<Configuration> wrapasjsonmappingexception) {
            maybeGetTypeVariable.this.addOnConfigurationChangedListener(wrapasjsonmappingexception);
        }

        @Override // kotlin._isPosInf
        public final void removeOnConfigurationChangedListener(wrapAsJsonMappingException<Configuration> wrapasjsonmappingexception) {
            maybeGetTypeVariable.this.removeOnConfigurationChangedListener(wrapasjsonmappingexception);
        }

        @Override // kotlin._isTrue
        public final void addOnTrimMemoryListener(wrapAsJsonMappingException<Integer> wrapasjsonmappingexception) {
            maybeGetTypeVariable.this.addOnTrimMemoryListener(wrapasjsonmappingexception);
        }

        @Override // kotlin._isTrue
        public final void removeOnTrimMemoryListener(wrapAsJsonMappingException<Integer> wrapasjsonmappingexception) {
            maybeGetTypeVariable.this.removeOnTrimMemoryListener(wrapasjsonmappingexception);
        }

        @Override // kotlin._findCoercionFromBlankString
        public final void addOnMultiWindowModeChangedListener(wrapAsJsonMappingException<_checkTextualNull> wrapasjsonmappingexception) {
            maybeGetTypeVariable.this.addOnMultiWindowModeChangedListener(wrapasjsonmappingexception);
        }

        @Override // kotlin._findCoercionFromBlankString
        public final void removeOnMultiWindowModeChangedListener(wrapAsJsonMappingException<_checkTextualNull> wrapasjsonmappingexception) {
            maybeGetTypeVariable.this.removeOnMultiWindowModeChangedListener(wrapasjsonmappingexception);
        }

        @Override // kotlin._findCoercionFromEmptyArray
        public final void addOnPictureInPictureModeChangedListener(wrapAsJsonMappingException<_isIntNumber> wrapasjsonmappingexception) {
            maybeGetTypeVariable.this.addOnPictureInPictureModeChangedListener(wrapasjsonmappingexception);
        }

        @Override // kotlin._findCoercionFromEmptyArray
        public final void removeOnPictureInPictureModeChangedListener(wrapAsJsonMappingException<_isIntNumber> wrapasjsonmappingexception) {
            maybeGetTypeVariable.this.removeOnPictureInPictureModeChangedListener(wrapasjsonmappingexception);
        }

        @Override // kotlin.UntypedObjectDeserializerNR
        public final void addMenuProvider(UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope) {
            maybeGetTypeVariable.this.addMenuProvider(untypedObjectDeserializerNRScope);
        }

        @Override // kotlin.UntypedObjectDeserializerNR
        public final void removeMenuProvider(UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope) {
            maybeGetTypeVariable.this.removeMenuProvider(untypedObjectDeserializerNRScope);
        }

        private void AudioAttributesImplApi26Parcelizer() {
            maybeGetTypeVariable.this.invalidateMenu();
        }
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), anyIgnorals.write.read)) {
        }
    }

    private static boolean markState(FragmentManager fragmentManager, anyIgnorals.write writeVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.handleMediaPlayPauseIfPendingOnHandler()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), writeVar);
                }
                if (fragment.mViewLifecycleOwner != null && fragment.mViewLifecycleOwner.getLifecycle().getAudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(anyIgnorals.write.RemoteActionCompatParcelizer)) {
                    fragment.mViewLifecycleOwner.write(writeVar);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.getAudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(anyIgnorals.write.RemoteActionCompatParcelizer)) {
                    fragment.mLifecycleRegistry.RemoteActionCompatParcelizer(writeVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
