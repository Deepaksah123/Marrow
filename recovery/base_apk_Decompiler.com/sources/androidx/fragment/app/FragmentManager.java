package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NopAnnotationIntrospector1;
import kotlin.PieChart;
import kotlin.TypeResolutionContext;
import kotlin.UntypedObjectDeserializerNR;
import kotlin.UntypedObjectDeserializerNRScope;
import kotlin._addFields;
import kotlin._addInjectables;
import kotlin._addMethods;
import kotlin._addSetterMethod;
import kotlin._checkTextualNull;
import kotlin._constructStdTypeResolverBuilder;
import kotlin._doAddInjectable;
import kotlin._findCoercionFromBlankString;
import kotlin._findCoercionFromEmptyArray;
import kotlin._init_lambda3;
import kotlin._init_lambda4;
import kotlin._isIntNumber;
import kotlin._isPosInf;
import kotlin._isTrue;
import kotlin._property;
import kotlin._refinePropertyInclusion;
import kotlin._renameUsing;
import kotlin._replaceCreatorProperty;
import kotlin.accessaddObserverForBackInvoker;
import kotlin.anyIgnorals;
import kotlin.findAccess;
import kotlin.findSubtypesCheckRepeatedNames;
import kotlin.getAlwaysAsId;
import kotlin.getAnySetterField;
import kotlin.getGeneratorType;
import kotlin.getJsonValueAccessor;
import kotlin.getResolverType;
import kotlin.hasGetter;
import kotlin.hasMixIns;
import kotlin.onRemoveQueueItemAt;
import kotlin.onSetRating;
import kotlin.onSetShuffleMode;
import kotlin.pessimisticallyValidateBounds;
import kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
import kotlin.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
import kotlin.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
import kotlin.setOnChartValueSelectedListener;
import kotlin.wrapAsJsonMappingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    static boolean write = true;
    Fragment AudioAttributesCompatParcelizer;
    private ArrayList<Fragment> AudioAttributesImplBaseParcelizer;
    private getAlwaysAsId MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaDescriptionCompat;
    private ArrayList<_refinePropertyInclusion> MediaSessionCompatResultReceiverWrapper;
    private ArrayList<Boolean> PlaybackStateCompat;
    private boolean RatingCompat;
    private pessimisticallyValidateBounds<?> handleMediaPlayPauseIfPendingOnHandler;
    private boolean onCustomAction;
    private boolean onPlay;
    private onSetRating onPrepareFromMediaId;
    private _addMethods onPrepareFromSearch;
    private Fragment onSeekTo;
    private r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> onSetCaptioningEnabled;
    private r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String[]> onSetRating;
    private r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<IntentSenderRequest> onSkipToNext;
    private getJsonValueAccessor.write onSkipToPrevious;
    private boolean onSkipToQueueItem;
    private ArrayList<Fragment> onStop;
    private boolean setSessionImpl;
    private final ArrayList<write> onRewind = new ArrayList<>();
    private final _property onCommand = new _property();
    private ArrayList<_refinePropertyInclusion> MediaBrowserCompatItemReceiver = new ArrayList<>();
    private final getResolverType onFastForward = new getResolverType(this);
    _refinePropertyInclusion read = null;
    private boolean onAddQueueItem = false;
    private final onRemoveQueueItemAt onPlayFromUri = new onRemoveQueueItemAt() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackStarted(kotlin.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            if (FragmentManager.write(3)) {
                boolean z = FragmentManager.write;
                Objects.toString(FragmentManager.this);
            }
            boolean z2 = FragmentManager.write;
            FragmentManager.this.onSkipToNext();
            FragmentManager.this.onRewind();
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackProgressed(kotlin.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            if (FragmentManager.write(2)) {
                boolean z = FragmentManager.write;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.this.read != null) {
                FragmentManager fragmentManager = FragmentManager.this;
                Iterator<_renameUsing> it = fragmentManager.AudioAttributesCompatParcelizer(new ArrayList<>(Collections.singletonList(fragmentManager.read)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().IconCompatParcelizer(audioAttributesImplApi26Parcelizer);
                }
                for (read readVar : FragmentManager.this.IconCompatParcelizer) {
                }
            }
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            if (FragmentManager.write(3)) {
                boolean z = FragmentManager.write;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager.this.onPlayFromUri();
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackCancelled() {
            if (FragmentManager.write(3)) {
                boolean z = FragmentManager.write;
                Objects.toString(FragmentManager.this);
            }
            boolean z2 = FragmentManager.write;
            FragmentManager.this.RemoteActionCompatParcelizer();
        }
    };
    private final AtomicInteger AudioAttributesImplApi21Parcelizer = new AtomicInteger();
    private final Map<String, BackStackState> AudioAttributesImplApi26Parcelizer = Collections.synchronizedMap(new HashMap());
    private final Map<String, Bundle> onSetPlaybackSpeed = Collections.synchronizedMap(new HashMap());
    private final Map<String, AudioAttributesCompatParcelizer> onSetShuffleMode = Collections.synchronizedMap(new HashMap());
    ArrayList<read> IconCompatParcelizer = new ArrayList<>();
    private final getGeneratorType onPlayFromMediaId = new getGeneratorType(this);
    private final CopyOnWriteArrayList<_addInjectables> onPrepare = new CopyOnWriteArrayList<>();
    private final wrapAsJsonMappingException<Configuration> onPlayFromSearch = new wrapAsJsonMappingException() { // from class: o.POJOPropertiesCollector
        @Override // kotlin.wrapAsJsonMappingException
        public final void AudioAttributesCompatParcelizer(Object obj) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((Configuration) obj);
        }
    };
    private final wrapAsJsonMappingException<Integer> onPrepareFromUri = new wrapAsJsonMappingException() { // from class: o._addCreatorParam
        @Override // kotlin.wrapAsJsonMappingException
        public final void AudioAttributesCompatParcelizer(Object obj) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((Integer) obj);
        }
    };
    private final wrapAsJsonMappingException<_checkTextualNull> onRemoveQueueItemAt = new wrapAsJsonMappingException() { // from class: o._propNameFromSimple
        @Override // kotlin.wrapAsJsonMappingException
        public final void AudioAttributesCompatParcelizer(Object obj) {
            this.read.AudioAttributesCompatParcelizer((_checkTextualNull) obj);
        }
    };
    private final wrapAsJsonMappingException<_isIntNumber> onRemoveQueueItem = new wrapAsJsonMappingException() { // from class: o._anyIndexed
        @Override // kotlin.wrapAsJsonMappingException
        public final void AudioAttributesCompatParcelizer(Object obj) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((_isIntNumber) obj);
        }
    };
    private final UntypedObjectDeserializerNRScope onPause = new UntypedObjectDeserializerNRScope() { // from class: androidx.fragment.app.FragmentManager.4
        @Override // kotlin.UntypedObjectDeserializerNRScope
        public final void AudioAttributesCompatParcelizer(Menu menu) {
            FragmentManager.this.AudioAttributesCompatParcelizer(menu);
        }

        @Override // kotlin.UntypedObjectDeserializerNRScope
        public final void RemoteActionCompatParcelizer(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.AudioAttributesCompatParcelizer(menu, menuInflater);
        }

        @Override // kotlin.UntypedObjectDeserializerNRScope
        public final boolean RemoteActionCompatParcelizer(MenuItem menuItem) {
            return FragmentManager.this.AudioAttributesCompatParcelizer(menuItem);
        }

        @Override // kotlin.UntypedObjectDeserializerNRScope
        public final void read(Menu menu) {
            FragmentManager.this.write(menu);
        }
    };
    private int MediaBrowserCompatMediaItem = -1;
    private NopAnnotationIntrospector1 MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
    private NopAnnotationIntrospector1 onMediaButtonEvent = new NopAnnotationIntrospector1() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // kotlin.NopAnnotationIntrospector1
        public final Fragment read(ClassLoader classLoader, String str) {
            FragmentManager.this.onPlay();
            return pessimisticallyValidateBounds.write(FragmentManager.this.onPlay().getRead(), str);
        }
    };
    private getAnySetterField onSetRepeatMode = null;
    private getAnySetterField MediaMetadataCompat = new getAnySetterField() { // from class: androidx.fragment.app.FragmentManager.1
        @Override // kotlin.getAnySetterField
        public final _renameUsing RemoteActionCompatParcelizer(ViewGroup viewGroup) {
            return new _constructStdTypeResolverBuilder(viewGroup);
        }
    };
    ArrayDeque<LaunchedFragmentInfo> RemoteActionCompatParcelizer = new ArrayDeque<>();
    private Runnable MediaBrowserCompatSearchResultReceiver = new Runnable() { // from class: androidx.fragment.app.FragmentManager.8
        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.RemoteActionCompatParcelizer(true);
        }
    };

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class IconCompatParcelizer {
        public void AudioAttributesCompatParcelizer(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void IconCompatParcelizer(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void read(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void write(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface read {
        void write();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface write {
        boolean read(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2);
    }

    public static int IconCompatParcelizer(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i == 8194) {
            return 4097;
        }
        if (i == 8197) {
            return 4100;
        }
        if (i != 4099) {
            return i != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static boolean write(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesCompatParcelizer implements _addFields {
        private final anyIgnorals AudioAttributesCompatParcelizer;
        private final findAccess read;
        private final _addFields write;

        AudioAttributesCompatParcelizer(anyIgnorals anyignorals, _addFields _addfields, findAccess findaccess) {
            this.AudioAttributesCompatParcelizer = anyignorals;
            this.write = _addfields;
            this.read = findaccess;
        }

        public final boolean write(anyIgnorals.write writeVar) {
            return this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(writeVar);
        }

        @Override // kotlin._addFields
        public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
            this.write.AudioAttributesCompatParcelizer(str, bundle);
        }

        public final void read() {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.read);
        }
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(Configuration configuration) {
        if (onStop()) {
            write(configuration, false);
        }
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(Integer num) {
        if (onStop() && num.intValue() == 80) {
            read(false);
        }
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(_checkTextualNull _checktextualnull) {
        if (onStop()) {
            IconCompatParcelizer(_checktextualnull.write(), false);
        }
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(_isIntNumber _isintnumber) {
        if (onStop()) {
            AudioAttributesCompatParcelizer(_isintnumber.IconCompatParcelizer(), false);
        }
    }

    private void IconCompatParcelizer(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new _replaceCreatorProperty("FragmentManager"));
        pessimisticallyValidateBounds<?> pessimisticallyvalidatebounds = this.handleMediaPlayPauseIfPendingOnHandler;
        try {
            if (pessimisticallyvalidatebounds != null) {
                pessimisticallyvalidatebounds.write("  ", printWriter, new String[0]);
            } else {
                write("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final _doAddInjectable IconCompatParcelizer() {
        return new _refinePropertyInclusion(this);
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(true);
        onSkipToQueueItem();
        return zRemoteActionCompatParcelizer;
    }

    private void MediaSessionCompatQueueItem() {
        synchronized (this.onRewind) {
            if (!this.onRewind.isEmpty()) {
                this.onPlayFromUri.setEnabled(true);
                if (write(3)) {
                    toString();
                }
            } else {
                boolean z = onCustomAction() > 0 && MediaBrowserCompatMediaItem(this.onSeekTo);
                if (write(3)) {
                    toString();
                }
                this.onPlayFromUri.setEnabled(z);
            }
        }
    }

    final boolean MediaBrowserCompatMediaItem(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.MediaSessionCompatToken()) && MediaBrowserCompatMediaItem(fragmentManager.onSeekTo);
    }

    final boolean RatingCompat(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    final boolean AudioAttributesImplApi26Parcelizer(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    final void onPlayFromUri() {
        this.onAddQueueItem = true;
        RemoteActionCompatParcelizer(true);
        this.onAddQueueItem = false;
        if (this.read != null) {
            if (!this.IconCompatParcelizer.isEmpty()) {
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet(IconCompatParcelizer(this.read));
                for (read readVar : this.IconCompatParcelizer) {
                    for (Fragment fragment : linkedHashSet) {
                    }
                }
            }
            Iterator<_doAddInjectable.write> it = this.read.MediaDescriptionCompat.iterator();
            while (it.hasNext()) {
                Fragment fragment2 = it.next().IconCompatParcelizer;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            Iterator<_renameUsing> it2 = AudioAttributesCompatParcelizer(new ArrayList<>(Collections.singletonList(this.read)), 0, 1).iterator();
            while (it2.hasNext()) {
                it2.next().write();
            }
            Iterator<_doAddInjectable.write> it3 = this.read.MediaDescriptionCompat.iterator();
            while (it3.hasNext()) {
                Fragment fragment3 = it3.next().IconCompatParcelizer;
                if (fragment3 != null && fragment3.mContainer == null) {
                    read(fragment3).RemoteActionCompatParcelizer();
                }
            }
            this.read = null;
            MediaSessionCompatQueueItem();
            if (write(3)) {
                this.onPlayFromUri.getIsEnabled();
                toString();
                return;
            }
            return;
        }
        if (this.onPlayFromUri.getIsEnabled()) {
            write(3);
            onRemoveQueueItemAt();
        } else {
            write(3);
            this.onPrepareFromMediaId.RemoteActionCompatParcelizer();
        }
    }

    public final void onPrepareFromUri() {
        AudioAttributesCompatParcelizer((write) new AudioAttributesImplApi26Parcelizer(null, -1, 0), false);
    }

    public final boolean onRemoveQueueItemAt() {
        return IconCompatParcelizer(-1, 0);
    }

    public final void write(String str) {
        AudioAttributesCompatParcelizer((write) new AudioAttributesImplApi26Parcelizer(str, -1, 1), false);
    }

    public final void AudioAttributesCompatParcelizer(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: ".concat(String.valueOf(i)));
        }
        AudioAttributesCompatParcelizer(new AudioAttributesImplApi26Parcelizer(null, i, 1), z);
    }

    final void onRewind() {
        AudioAttributesCompatParcelizer((write) new MediaBrowserCompatItemReceiver(), false);
    }

    final void RemoteActionCompatParcelizer() {
        if (write(3)) {
            Objects.toString(this.read);
        }
        _refinePropertyInclusion _refinepropertyinclusion = this.read;
        if (_refinepropertyinclusion != null) {
            _refinepropertyinclusion.read = false;
            this.read.AudioAttributesCompatParcelizer();
            this.read.read(new Runnable() { // from class: o._addCreators
                @Override // java.lang.Runnable
                public final void run() {
                    this.IconCompatParcelizer.onRemoveQueueItem();
                }
            });
            this.read.write();
            this.onAddQueueItem = true;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            this.onAddQueueItem = false;
            this.read = null;
        }
    }

    public final /* synthetic */ void onRemoveQueueItem() {
        for (read readVar : this.IconCompatParcelizer) {
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: ".concat(String.valueOf(i)));
        }
        return IconCompatParcelizer(i, 1);
    }

    private boolean IconCompatParcelizer(int i, int i2) {
        RemoteActionCompatParcelizer(false);
        IconCompatParcelizer(true);
        Fragment fragment = this.AudioAttributesCompatParcelizer;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().onRemoveQueueItemAt()) {
            return true;
        }
        boolean zIconCompatParcelizer = IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat, null, i, i2);
        if (zIconCompatParcelizer) {
            this.MediaDescriptionCompat = true;
            try {
                write(this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat);
            } finally {
                onSetPlaybackSpeed();
            }
        }
        MediaSessionCompatQueueItem();
        setSessionImpl();
        this.onCommand.IconCompatParcelizer();
        return zIconCompatParcelizer;
    }

    public final int onCustomAction() {
        return this.MediaBrowserCompatItemReceiver.size() + (this.read != null ? 1 : 0);
    }

    public final void IconCompatParcelizer(read readVar) {
        this.IconCompatParcelizer.add(readVar);
    }

    public final void write(read readVar) {
        this.IconCompatParcelizer.remove(readVar);
    }

    public final void read(String str, Bundle bundle) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onSetShuffleMode.get(str);
        if (audioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.write(anyIgnorals.write.RemoteActionCompatParcelizer)) {
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str, bundle);
        } else {
            this.onSetPlaybackSpeed.put(str, bundle);
        }
        if (write(2)) {
            Objects.toString(bundle);
        }
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        this.onSetPlaybackSpeed.remove(str);
        write(2);
    }

    public final void IconCompatParcelizer(final String str, hasGetter hasgetter, final _addFields _addfields) {
        final anyIgnorals lifecycle = hasgetter.getLifecycle();
        if (lifecycle.getAudioAttributesImplApi26Parcelizer() == anyIgnorals.write.AudioAttributesCompatParcelizer) {
            return;
        }
        findAccess findaccess = new findAccess() { // from class: androidx.fragment.app.FragmentManager.9
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter2, anyIgnorals.read readVar) {
                Bundle bundle;
                if (readVar == anyIgnorals.read.ON_START && (bundle = (Bundle) FragmentManager.this.onSetPlaybackSpeed.get(str)) != null) {
                    _addfields.AudioAttributesCompatParcelizer(str, bundle);
                    FragmentManager.this.AudioAttributesCompatParcelizer(str);
                }
                if (readVar == anyIgnorals.read.ON_DESTROY) {
                    lifecycle.AudioAttributesCompatParcelizer(this);
                    FragmentManager.this.onSetShuffleMode.remove(str);
                }
            }
        };
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerPut = this.onSetShuffleMode.put(str, new AudioAttributesCompatParcelizer(lifecycle, _addfields, findaccess));
        if (audioAttributesCompatParcelizerPut != null) {
            audioAttributesCompatParcelizerPut.read();
        }
        if (write(2)) {
            Objects.toString(lifecycle);
            Objects.toString(_addfields);
        }
        lifecycle.IconCompatParcelizer(findaccess);
    }

    public final void IconCompatParcelizer(String str) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemove = this.onSetShuffleMode.remove(str);
        if (audioAttributesCompatParcelizerRemove != null) {
            audioAttributesCompatParcelizerRemove.read();
        }
        write(2);
    }

    public final void IconCompatParcelizer(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            IconCompatParcelizer(new IllegalStateException(sb.toString()));
        }
        bundle.putString(str, fragment.mWho);
    }

    public final Fragment IconCompatParcelizer(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(string);
        if (fragmentRemoteActionCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            IconCompatParcelizer(new IllegalStateException(sb.toString()));
        }
        return fragmentRemoteActionCompatParcelizer;
    }

    public static Fragment AudioAttributesCompatParcelizer(View view) {
        while (view != null) {
            Fragment fragmentWrite = write(view);
            if (fragmentWrite != null) {
                return fragmentWrite;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static Fragment write(View view) {
        Object tag = view.getTag(findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public final void AudioAttributesCompatParcelizer(FragmentContainerView fragmentContainerView) {
        for (_addSetterMethod _addsettermethod : this.onCommand.write()) {
            Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
            if (fragmentIconCompatParcelizer.mContainerId == fragmentContainerView.getId() && fragmentIconCompatParcelizer.mView != null && fragmentIconCompatParcelizer.mView.getParent() == null) {
                fragmentIconCompatParcelizer.mContainer = fragmentContainerView;
                _addsettermethod.write();
                _addsettermethod.RemoteActionCompatParcelizer();
            }
        }
    }

    public final List<Fragment> handleMediaPlayPauseIfPendingOnHandler() {
        return this.onCommand.read();
    }

    final hasMixIns MediaBrowserCompatItemReceiver(Fragment fragment) {
        return this.onPrepareFromSearch.RemoteActionCompatParcelizer(fragment);
    }

    private _addMethods handleMediaPlayPauseIfPendingOnHandler(Fragment fragment) {
        return this.onPrepareFromSearch.AudioAttributesCompatParcelizer(fragment);
    }

    final void RemoteActionCompatParcelizer(Fragment fragment) {
        this.onPrepareFromSearch.read(fragment);
    }

    final void MediaDescriptionCompat(Fragment fragment) {
        this.onPrepareFromSearch.write(fragment);
    }

    public final Fragment.SavedState MediaMetadataCompat(Fragment fragment) {
        _addSetterMethod _addsettermethodIconCompatParcelizer = this.onCommand.IconCompatParcelizer(fragment.mWho);
        if (_addsettermethodIconCompatParcelizer == null || !_addsettermethodIconCompatParcelizer.IconCompatParcelizer().equals(fragment)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            IconCompatParcelizer(new IllegalStateException(sb.toString()));
        }
        return _addsettermethodIconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onSetRepeatMode() {
        /*
            r5 = this;
            o.pessimisticallyValidateBounds<?> r0 = r5.handleMediaPlayPauseIfPendingOnHandler
            boolean r1 = r0 instanceof kotlin.TypeResolutionContext
            if (r1 == 0) goto L11
            o._property r0 = r5.onCommand
            o._addMethods r0 = r0.MediaBrowserCompatItemReceiver()
            boolean r0 = r0.read()
            goto L27
        L11:
            android.content.Context r0 = r0.getRead()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L29
            o.pessimisticallyValidateBounds<?> r0 = r5.handleMediaPlayPauseIfPendingOnHandler
            android.content.Context r0 = r0.getRead()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            r0 = r0 ^ 1
        L27:
            if (r0 == 0) goto L5c
        L29:
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r0 = r5.AudioAttributesImplApi26Parcelizer
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.BackStackState r1 = (androidx.fragment.app.BackStackState) r1
            java.util.List<java.lang.String> r1 = r1.AudioAttributesCompatParcelizer
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            o._property r3 = r5.onCommand
            o._addMethods r3 = r3.MediaBrowserCompatItemReceiver()
            r4 = 0
            r3.IconCompatParcelizer(r2, r4)
            goto L45
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.onSetRepeatMode():void");
    }

    public final boolean onPrepare() {
        return this.RatingCompat;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.onSeekTo;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.onSeekTo)));
            sb.append("}");
        } else {
            pessimisticallyValidateBounds<?> pessimisticallyvalidatebounds = this.handleMediaPlayPauseIfPendingOnHandler;
            if (pessimisticallyvalidatebounds != null) {
                sb.append(pessimisticallyvalidatebounds.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.handleMediaPlayPauseIfPendingOnHandler)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void write(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String string = sb.toString();
        this.onCommand.RemoteActionCompatParcelizer(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.AudioAttributesImplBaseParcelizer;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.AudioAttributesImplBaseParcelizer.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.MediaBrowserCompatItemReceiver.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size2; i2++) {
                _refinePropertyInclusion _refinepropertyinclusion = this.MediaBrowserCompatItemReceiver.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(_refinepropertyinclusion.toString());
                _refinepropertyinclusion.IconCompatParcelizer(string, printWriter);
            }
        }
        printWriter.print(str);
        StringBuilder sb2 = new StringBuilder("Back Stack Index: ");
        sb2.append(this.AudioAttributesImplApi21Parcelizer.get());
        printWriter.println(sb2.toString());
        synchronized (this.onRewind) {
            int size3 = this.onRewind.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    write writeVar = this.onRewind.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(writeVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.handleMediaPlayPauseIfPendingOnHandler);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.MediaBrowserCompatCustomActionResultReceiver);
        if (this.onSeekTo != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.onSeekTo);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.MediaBrowserCompatMediaItem);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.setSessionImpl);
        printWriter.print(" mStopped=");
        printWriter.print(this.onSkipToQueueItem);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.RatingCompat);
        if (this.onPlay) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.onPlay);
        }
    }

    final void read(_addSetterMethod _addsettermethod) {
        Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
        if (fragmentIconCompatParcelizer.mDeferStart) {
            if (this.MediaDescriptionCompat) {
                this.onCustomAction = true;
            } else {
                fragmentIconCompatParcelizer.mDeferStart = false;
                _addsettermethod.RemoteActionCompatParcelizer();
            }
        }
    }

    final boolean AudioAttributesCompatParcelizer(int i) {
        return this.MediaBrowserCompatMediaItem > 0;
    }

    public final void RemoteActionCompatParcelizer(Fragment fragment, boolean z) {
        ViewGroup viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(fragment);
        if (viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null || !(viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).setDrawDisappearingViewsLast(!z);
    }

    private void read(int i, boolean z) {
        pessimisticallyValidateBounds<?> pessimisticallyvalidatebounds;
        if (this.handleMediaPlayPauseIfPendingOnHandler == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = i;
            this.onCommand.AudioAttributesImplApi21Parcelizer();
            ParcelableVolumeInfo();
            if (this.onPlay && (pessimisticallyvalidatebounds = this.handleMediaPlayPauseIfPendingOnHandler) != null && this.MediaBrowserCompatMediaItem == 7) {
                pessimisticallyvalidatebounds.read();
                this.onPlay = false;
            }
        }
    }

    private void ParcelableVolumeInfo() {
        Iterator<_addSetterMethod> it = this.onCommand.write().iterator();
        while (it.hasNext()) {
            read(it.next());
        }
    }

    public final _addSetterMethod read(Fragment fragment) {
        _addSetterMethod _addsettermethodIconCompatParcelizer = this.onCommand.IconCompatParcelizer(fragment.mWho);
        if (_addsettermethodIconCompatParcelizer != null) {
            return _addsettermethodIconCompatParcelizer;
        }
        _addSetterMethod _addsettermethod = new _addSetterMethod(this.onPlayFromMediaId, this.onCommand, fragment);
        _addsettermethod.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getRead().getClassLoader());
        _addsettermethod.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        return _addsettermethod;
    }

    public final _addSetterMethod write(Fragment fragment) {
        if (fragment.mPreviousWho != null) {
            getJsonValueAccessor.RemoteActionCompatParcelizer(fragment, fragment.mPreviousWho);
        }
        if (write(2)) {
            Objects.toString(fragment);
        }
        _addSetterMethod _addsettermethod = read(fragment);
        fragment.mFragmentManager = this;
        this.onCommand.IconCompatParcelizer(_addsettermethod);
        if (!fragment.mDetached) {
            this.onCommand.IconCompatParcelizer(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (onFastForward(fragment)) {
                this.onPlay = true;
            }
        }
        return _addsettermethod;
    }

    public final void MediaBrowserCompatSearchResultReceiver(Fragment fragment) {
        if (write(2)) {
            Objects.toString(fragment);
            int i = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.onCommand.write(fragment);
        if (onFastForward(fragment)) {
            this.onPlay = true;
        }
        fragment.mRemoving = true;
        onPlay(fragment);
    }

    public final void AudioAttributesImplBaseParcelizer(Fragment fragment) {
        if (write(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        onPlay(fragment);
    }

    public static void onAddQueueItem(Fragment fragment) {
        if (write(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void AudioAttributesCompatParcelizer(Fragment fragment) {
        if (write(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (write(2)) {
                Objects.toString(fragment);
            }
            this.onCommand.write(fragment);
            if (onFastForward(fragment)) {
                this.onPlay = true;
            }
            onPlay(fragment);
        }
    }

    public final void IconCompatParcelizer(Fragment fragment) {
        if (write(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.onCommand.IconCompatParcelizer(fragment);
            if (write(2)) {
                Objects.toString(fragment);
            }
            if (onFastForward(fragment)) {
                this.onPlay = true;
            }
        }
    }

    public Fragment findFragmentById(int i) {
        return this.onCommand.RemoteActionCompatParcelizer(i);
    }

    public Fragment findFragmentByTag(String str) {
        return this.onCommand.read(str);
    }

    final Fragment read(String str) {
        return this.onCommand.RemoteActionCompatParcelizer(str);
    }

    final Fragment RemoteActionCompatParcelizer(String str) {
        return this.onCommand.write(str);
    }

    private void onSetShuffleMode() {
        if (onPrepareFromSearch()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean onPrepareFromSearch() {
        return this.setSessionImpl || this.onSkipToQueueItem;
    }

    public final void AudioAttributesCompatParcelizer(write writeVar, boolean z) {
        if (!z) {
            if (this.handleMediaPlayPauseIfPendingOnHandler == null) {
                if (this.RatingCompat) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            onSetShuffleMode();
        }
        synchronized (this.onRewind) {
            if (this.handleMediaPlayPauseIfPendingOnHandler == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.onRewind.add(writeVar);
                MediaSessionCompatResultReceiverWrapper();
            }
        }
    }

    private void MediaSessionCompatResultReceiverWrapper() {
        synchronized (this.onRewind) {
            if (this.onRewind.size() == 1) {
                this.handleMediaPlayPauseIfPendingOnHandler.getWrite().removeCallbacks(this.MediaBrowserCompatSearchResultReceiver);
                this.handleMediaPlayPauseIfPendingOnHandler.getWrite().post(this.MediaBrowserCompatSearchResultReceiver);
                MediaSessionCompatQueueItem();
            }
        }
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.getAndIncrement();
    }

    private void IconCompatParcelizer(boolean z) {
        if (this.MediaDescriptionCompat) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler == null) {
            if (this.RatingCompat) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (Looper.myLooper() != this.handleMediaPlayPauseIfPendingOnHandler.getWrite().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            onSetShuffleMode();
        }
        if (this.MediaSessionCompatResultReceiverWrapper == null) {
            this.MediaSessionCompatResultReceiverWrapper = new ArrayList<>();
            this.PlaybackStateCompat = new ArrayList<>();
        }
    }

    public final void read(write writeVar, boolean z) {
        if (z && (this.handleMediaPlayPauseIfPendingOnHandler == null || this.RatingCompat)) {
            return;
        }
        IconCompatParcelizer(z);
        _refinePropertyInclusion _refinepropertyinclusion = this.read;
        boolean z2 = false;
        if (_refinepropertyinclusion != null) {
            _refinepropertyinclusion.read = false;
            this.read.AudioAttributesCompatParcelizer();
            if (write(3)) {
                Objects.toString(this.read);
                Objects.toString(writeVar);
            }
            this.read.AudioAttributesCompatParcelizer(false, false);
            boolean z3 = this.read.read(this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat);
            for (_doAddInjectable.write writeVar2 : this.read.MediaDescriptionCompat) {
                if (writeVar2.IconCompatParcelizer != null) {
                    writeVar2.IconCompatParcelizer.mTransitioning = false;
                }
            }
            this.read = null;
            z2 = z3;
        }
        boolean z4 = writeVar.read(this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat);
        if (z2 || z4) {
            this.MediaDescriptionCompat = true;
            try {
                write(this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat);
            } finally {
                onSetPlaybackSpeed();
            }
        }
        MediaSessionCompatQueueItem();
        setSessionImpl();
        this.onCommand.IconCompatParcelizer();
    }

    private void onSetPlaybackSpeed() {
        this.MediaDescriptionCompat = false;
        this.PlaybackStateCompat.clear();
        this.MediaSessionCompatResultReceiverWrapper.clear();
    }

    public final boolean RemoteActionCompatParcelizer(boolean z) {
        _refinePropertyInclusion _refinepropertyinclusion;
        IconCompatParcelizer(z);
        boolean z2 = false;
        if (!this.onAddQueueItem && (_refinepropertyinclusion = this.read) != null) {
            _refinepropertyinclusion.read = false;
            this.read.AudioAttributesCompatParcelizer();
            if (write(3)) {
                Objects.toString(this.read);
                Objects.toString(this.onRewind);
            }
            this.read.AudioAttributesCompatParcelizer(false, false);
            this.onRewind.add(0, this.read);
            for (_doAddInjectable.write writeVar : this.read.MediaDescriptionCompat) {
                if (writeVar.IconCompatParcelizer != null) {
                    writeVar.IconCompatParcelizer.mTransitioning = false;
                }
            }
            this.read = null;
        }
        while (AudioAttributesCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat)) {
            z2 = true;
            this.MediaDescriptionCompat = true;
            try {
                write(this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat);
            } finally {
                onSetPlaybackSpeed();
            }
        }
        MediaSessionCompatQueueItem();
        setSessionImpl();
        this.onCommand.IconCompatParcelizer();
        return z2;
    }

    private void write(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).handleMediaPlayPauseIfPendingOnHandler) {
                if (i2 != i) {
                    RemoteActionCompatParcelizer(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).handleMediaPlayPauseIfPendingOnHandler) {
                        i2++;
                    }
                }
                RemoteActionCompatParcelizer(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            RemoteActionCompatParcelizer(arrayList, arrayList2, i2, size);
        }
    }

    private void RemoteActionCompatParcelizer(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        boolean z = arrayList.get(i).handleMediaPlayPauseIfPendingOnHandler;
        ArrayList<Fragment> arrayList3 = this.onStop;
        if (arrayList3 == null) {
            this.onStop = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.onStop.addAll(this.onCommand.read());
        Fragment fragmentMediaSessionCompatToken = MediaSessionCompatToken();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            _refinePropertyInclusion _refinepropertyinclusion = arrayList.get(i3);
            if (!arrayList2.get(i3).booleanValue()) {
                fragmentMediaSessionCompatToken = _refinepropertyinclusion.read(this.onStop, fragmentMediaSessionCompatToken);
            } else {
                fragmentMediaSessionCompatToken = _refinepropertyinclusion.IconCompatParcelizer(this.onStop, fragmentMediaSessionCompatToken);
            }
            z2 = z2 || _refinepropertyinclusion.RemoteActionCompatParcelizer;
        }
        this.onStop.clear();
        if (!z && this.MediaBrowserCompatMediaItem > 0) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<_doAddInjectable.write> it = arrayList.get(i4).MediaDescriptionCompat.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().IconCompatParcelizer;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.onCommand.IconCompatParcelizer(read(fragment));
                    }
                }
            }
        }
        IconCompatParcelizer(arrayList, arrayList2, i, i2);
        boolean zBooleanValue = arrayList2.get(i2 - 1).booleanValue();
        if (z2 && !this.IconCompatParcelizer.isEmpty()) {
            LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
            Iterator<_refinePropertyInclusion> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(IconCompatParcelizer(it2.next()));
            }
            if (this.read == null) {
                for (read readVar : this.IconCompatParcelizer) {
                    for (Fragment fragment2 : linkedHashSet) {
                    }
                }
                for (read readVar2 : this.IconCompatParcelizer) {
                    for (Fragment fragment3 : linkedHashSet) {
                    }
                }
            }
        }
        for (int i5 = i; i5 < i2; i5++) {
            _refinePropertyInclusion _refinepropertyinclusion2 = arrayList.get(i5);
            if (zBooleanValue) {
                for (int size = _refinepropertyinclusion2.MediaDescriptionCompat.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = _refinepropertyinclusion2.MediaDescriptionCompat.get(size).IconCompatParcelizer;
                    if (fragment4 != null) {
                        read(fragment4).RemoteActionCompatParcelizer();
                    }
                }
            } else {
                Iterator<_doAddInjectable.write> it3 = _refinepropertyinclusion2.MediaDescriptionCompat.iterator();
                while (it3.hasNext()) {
                    Fragment fragment5 = it3.next().IconCompatParcelizer;
                    if (fragment5 != null) {
                        read(fragment5).RemoteActionCompatParcelizer();
                    }
                }
            }
        }
        read(this.MediaBrowserCompatMediaItem, true);
        for (_renameUsing _renameusing : AudioAttributesCompatParcelizer(arrayList, i, i2)) {
            _renameusing.RemoteActionCompatParcelizer(zBooleanValue);
            _renameusing.AudioAttributesImplApi26Parcelizer();
            _renameusing.read();
        }
        while (i < i2) {
            _refinePropertyInclusion _refinepropertyinclusion3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && _refinepropertyinclusion3.write >= 0) {
                _refinepropertyinclusion3.write = -1;
            }
            _refinepropertyinclusion3.MediaBrowserCompatCustomActionResultReceiver();
            i++;
        }
        if (z2) {
            onSkipToPrevious();
        }
    }

    final Set<_renameUsing> AudioAttributesCompatParcelizer(ArrayList<_refinePropertyInclusion> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<_doAddInjectable.write> it = arrayList.get(i).MediaDescriptionCompat.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().IconCompatParcelizer;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(_renameUsing.read(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    private static void IconCompatParcelizer(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            _refinePropertyInclusion _refinepropertyinclusion = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                _refinepropertyinclusion.write(-1);
                _refinepropertyinclusion.AudioAttributesImplBaseParcelizer();
            } else {
                _refinepropertyinclusion.write(1);
                _refinepropertyinclusion.AudioAttributesImplApi26Parcelizer();
            }
            i++;
        }
    }

    private void onPlay(Fragment fragment) {
        ViewGroup viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(fragment);
        if (viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getTag(findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.visible_removing_fragment_view_tag) == null) {
            viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setTag(findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.visible_removing_fragment_view_tag, fragment);
        }
        ((Fragment) viewGroupMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getTag(findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    private ViewGroup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Fragment fragment) {
        if (fragment.mContainer != null) {
            return fragment.mContainer;
        }
        if (fragment.mContainerId > 0 && this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer()) {
            View view = this.MediaBrowserCompatCustomActionResultReceiver.read(fragment.mContainerId);
            if (view instanceof ViewGroup) {
                return (ViewGroup) view;
            }
        }
        return null;
    }

    private void onSkipToQueueItem() {
        Iterator<_renameUsing> it = onSetRating().iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSkipToNext() {
        Iterator<_renameUsing> it = onSetRating().iterator();
        while (it.hasNext()) {
            it.next().IconCompatParcelizer();
        }
    }

    private Set<_renameUsing> onSetRating() {
        HashSet hashSet = new HashSet();
        Iterator<_addSetterMethod> it = this.onCommand.write().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().IconCompatParcelizer().mContainer;
            if (viewGroup != null) {
                hashSet.add(_renameUsing.IconCompatParcelizer(viewGroup, onPause()));
            }
        }
        return hashSet;
    }

    private boolean AudioAttributesCompatParcelizer(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.onRewind) {
            if (this.onRewind.isEmpty()) {
                return false;
            }
            try {
                int size = this.onRewind.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.onRewind.get(i).read(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.onRewind.clear();
                this.handleMediaPlayPauseIfPendingOnHandler.getWrite().removeCallbacks(this.MediaBrowserCompatSearchResultReceiver);
            }
        }
    }

    private void setSessionImpl() {
        if (this.onCustomAction) {
            this.onCustomAction = false;
            ParcelableVolumeInfo();
        }
    }

    private void onSkipToPrevious() {
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            this.IconCompatParcelizer.get(i).write();
        }
    }

    static Set<Fragment> IconCompatParcelizer(_refinePropertyInclusion _refinepropertyinclusion) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < _refinepropertyinclusion.MediaDescriptionCompat.size(); i++) {
            Fragment fragment = _refinepropertyinclusion.MediaDescriptionCompat.get(i).IconCompatParcelizer;
            if (fragment != null && _refinepropertyinclusion.RemoteActionCompatParcelizer) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public final void AudioAttributesCompatParcelizer(_refinePropertyInclusion _refinepropertyinclusion) {
        this.MediaBrowserCompatItemReceiver.add(_refinepropertyinclusion);
    }

    final boolean IconCompatParcelizer(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str, i, (i2 & 1) != 0);
        if (iAudioAttributesCompatParcelizer < 0) {
            return false;
        }
        for (int size = this.MediaBrowserCompatItemReceiver.size() - 1; size >= iAudioAttributesCompatParcelizer; size--) {
            arrayList.add(this.MediaBrowserCompatItemReceiver.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    final boolean read(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2) {
        if (write(2)) {
            Objects.toString(this.onRewind);
        }
        if (this.MediaBrowserCompatItemReceiver.isEmpty()) {
            return false;
        }
        ArrayList<_refinePropertyInclusion> arrayList3 = this.MediaBrowserCompatItemReceiver;
        _refinePropertyInclusion _refinepropertyinclusion = arrayList3.get(arrayList3.size() - 1);
        this.read = _refinepropertyinclusion;
        for (_doAddInjectable.write writeVar : _refinepropertyinclusion.MediaDescriptionCompat) {
            if (writeVar.IconCompatParcelizer != null) {
                writeVar.IconCompatParcelizer.mTransitioning = true;
            }
        }
        return IconCompatParcelizer(arrayList, arrayList2, null, -1, 0);
    }

    private int AudioAttributesCompatParcelizer(String str, int i, boolean z) {
        if (this.MediaBrowserCompatItemReceiver.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.MediaBrowserCompatItemReceiver.size() - 1;
        }
        int size = this.MediaBrowserCompatItemReceiver.size() - 1;
        while (size >= 0) {
            _refinePropertyInclusion _refinepropertyinclusion = this.MediaBrowserCompatItemReceiver.get(size);
            if ((str != null && str.equals(_refinepropertyinclusion.MediaBrowserCompatItemReceiver())) || (i >= 0 && i == _refinepropertyinclusion.write)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.MediaBrowserCompatItemReceiver.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            _refinePropertyInclusion _refinepropertyinclusion2 = this.MediaBrowserCompatItemReceiver.get(size - 1);
            if ((str == null || !str.equals(_refinepropertyinclusion2.MediaBrowserCompatItemReceiver())) && (i < 0 || i != _refinepropertyinclusion2.write)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: merged with bridge method [inline-methods] */
    public final Bundle onPrepareFromMediaId() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        onSkipToQueueItem();
        onSkipToNext();
        RemoteActionCompatParcelizer(true);
        this.setSessionImpl = true;
        this.onPrepareFromSearch.read(true);
        ArrayList<String> arrayListAudioAttributesImplBaseParcelizer = this.onCommand.AudioAttributesImplBaseParcelizer();
        HashMap<String, Bundle> mapRemoteActionCompatParcelizer = this.onCommand.RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer.isEmpty()) {
            write(2);
            return bundle;
        }
        ArrayList<String> arrayListMediaBrowserCompatCustomActionResultReceiver = this.onCommand.MediaBrowserCompatCustomActionResultReceiver();
        int size = this.MediaBrowserCompatItemReceiver.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i = 0; i < size; i++) {
                backStackRecordStateArr[i] = new BackStackRecordState(this.MediaBrowserCompatItemReceiver.get(i));
                if (write(2)) {
                    Objects.toString(this.MediaBrowserCompatItemReceiver.get(i));
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.RemoteActionCompatParcelizer = arrayListAudioAttributesImplBaseParcelizer;
        fragmentManagerState.AudioAttributesCompatParcelizer = arrayListMediaBrowserCompatCustomActionResultReceiver;
        fragmentManagerState.read = backStackRecordStateArr;
        fragmentManagerState.write = this.AudioAttributesImplApi21Parcelizer.get();
        Fragment fragment = this.AudioAttributesCompatParcelizer;
        if (fragment != null) {
            fragmentManagerState.AudioAttributesImplApi26Parcelizer = fragment.mWho;
        }
        fragmentManagerState.IconCompatParcelizer.addAll(this.AudioAttributesImplApi26Parcelizer.keySet());
        fragmentManagerState.MediaBrowserCompatCustomActionResultReceiver.addAll(this.AudioAttributesImplApi26Parcelizer.values());
        fragmentManagerState.AudioAttributesImplApi21Parcelizer = new ArrayList<>(this.RemoteActionCompatParcelizer);
        bundle.putParcelable(NotesDispatchAddressRequestKt.KEY_STATE, fragmentManagerState);
        for (String str : this.onSetPlaybackSpeed.keySet()) {
            bundle.putBundle("result_".concat(String.valueOf(str)), this.onSetPlaybackSpeed.get(str));
        }
        for (String str2 : mapRemoteActionCompatParcelizer.keySet()) {
            bundle.putBundle("fragment_".concat(String.valueOf(str2)), mapRemoteActionCompatParcelizer.get(str2));
        }
        return bundle;
    }

    final void read(Parcelable parcelable) {
        _addSetterMethod _addsettermethod;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String str : bundle3.keySet()) {
                if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                    bundle2.setClassLoader(this.handleMediaPlayPauseIfPendingOnHandler.getRead().getClassLoader());
                    this.onSetPlaybackSpeed.put(str.substring(7), bundle2);
                }
            }
            HashMap<String, Bundle> map = new HashMap<>();
            for (String str2 : bundle3.keySet()) {
                if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                    bundle.setClassLoader(this.handleMediaPlayPauseIfPendingOnHandler.getRead().getClassLoader());
                    map.put(str2.substring(9), bundle);
                }
            }
            this.onCommand.AudioAttributesCompatParcelizer(map);
            FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(NotesDispatchAddressRequestKt.KEY_STATE);
            if (fragmentManagerState == null) {
                return;
            }
            this.onCommand.AudioAttributesImplApi26Parcelizer();
            Iterator<String> it = fragmentManagerState.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                Bundle bundleIconCompatParcelizer = this.onCommand.IconCompatParcelizer(it.next(), null);
                if (bundleIconCompatParcelizer != null) {
                    Fragment fragmentWrite = this.onPrepareFromSearch.write(((FragmentState) bundleIconCompatParcelizer.getParcelable(NotesDispatchAddressRequestKt.KEY_STATE)).MediaDescriptionCompat);
                    if (fragmentWrite != null) {
                        if (write(2)) {
                            Objects.toString(fragmentWrite);
                        }
                        _addsettermethod = new _addSetterMethod(this.onPlayFromMediaId, this.onCommand, fragmentWrite, bundleIconCompatParcelizer);
                    } else {
                        _addsettermethod = new _addSetterMethod(this.onPlayFromMediaId, this.onCommand, this.handleMediaPlayPauseIfPendingOnHandler.getRead().getClassLoader(), onCommand(), bundleIconCompatParcelizer);
                    }
                    Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
                    fragmentIconCompatParcelizer.mSavedFragmentState = bundleIconCompatParcelizer;
                    fragmentIconCompatParcelizer.mFragmentManager = this;
                    if (write(2)) {
                        String str3 = fragmentIconCompatParcelizer.mWho;
                        Objects.toString(fragmentIconCompatParcelizer);
                    }
                    _addsettermethod.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getRead().getClassLoader());
                    this.onCommand.IconCompatParcelizer(_addsettermethod);
                    _addsettermethod.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                }
            }
            for (Fragment fragment : this.onPrepareFromSearch.IconCompatParcelizer()) {
                if (!this.onCommand.AudioAttributesCompatParcelizer(fragment.mWho)) {
                    if (write(2)) {
                        Objects.toString(fragment);
                        Objects.toString(fragmentManagerState.RemoteActionCompatParcelizer);
                    }
                    this.onPrepareFromSearch.write(fragment);
                    fragment.mFragmentManager = this;
                    _addSetterMethod _addsettermethod2 = new _addSetterMethod(this.onPlayFromMediaId, this.onCommand, fragment);
                    _addsettermethod2.IconCompatParcelizer(1);
                    _addsettermethod2.RemoteActionCompatParcelizer();
                    fragment.mRemoving = true;
                    _addsettermethod2.RemoteActionCompatParcelizer();
                }
            }
            this.onCommand.write(fragmentManagerState.AudioAttributesCompatParcelizer);
            if (fragmentManagerState.read != null) {
                this.MediaBrowserCompatItemReceiver = new ArrayList<>(fragmentManagerState.read.length);
                for (int i = 0; i < fragmentManagerState.read.length; i++) {
                    _refinePropertyInclusion _refinepropertyinclusionIconCompatParcelizer = fragmentManagerState.read[i].IconCompatParcelizer(this);
                    if (write(2)) {
                        int i2 = _refinepropertyinclusionIconCompatParcelizer.write;
                        Objects.toString(_refinepropertyinclusionIconCompatParcelizer);
                        PrintWriter printWriter = new PrintWriter(new _replaceCreatorProperty("FragmentManager"));
                        _refinepropertyinclusionIconCompatParcelizer.AudioAttributesCompatParcelizer("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.MediaBrowserCompatItemReceiver.add(_refinepropertyinclusionIconCompatParcelizer);
                }
            } else {
                this.MediaBrowserCompatItemReceiver = new ArrayList<>();
            }
            this.AudioAttributesImplApi21Parcelizer.set(fragmentManagerState.write);
            if (fragmentManagerState.AudioAttributesImplApi26Parcelizer != null) {
                Fragment fragmentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fragmentManagerState.AudioAttributesImplApi26Parcelizer);
                this.AudioAttributesCompatParcelizer = fragmentRemoteActionCompatParcelizer;
                onCommand(fragmentRemoteActionCompatParcelizer);
            }
            ArrayList<String> arrayList = fragmentManagerState.IconCompatParcelizer;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    this.AudioAttributesImplApi26Parcelizer.put(arrayList.get(i3), fragmentManagerState.MediaBrowserCompatCustomActionResultReceiver.get(i3));
                }
            }
            this.RemoteActionCompatParcelizer = new ArrayDeque<>(fragmentManagerState.AudioAttributesImplApi21Parcelizer);
        }
    }

    public final pessimisticallyValidateBounds<?> onPlay() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final Fragment onFastForward() {
        return this.onSeekTo;
    }

    public final getAlwaysAsId onAddQueueItem() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void AudioAttributesCompatParcelizer(pessimisticallyValidateBounds<?> pessimisticallyvalidatebounds, getAlwaysAsId getalwaysasid, final Fragment fragment) {
        String string;
        if (this.handleMediaPlayPauseIfPendingOnHandler != null) {
            throw new IllegalStateException("Already attached");
        }
        this.handleMediaPlayPauseIfPendingOnHandler = pessimisticallyvalidatebounds;
        this.MediaBrowserCompatCustomActionResultReceiver = getalwaysasid;
        this.onSeekTo = fragment;
        if (fragment != null) {
            AudioAttributesCompatParcelizer(new _addInjectables() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // kotlin._addInjectables
                public final void read(Fragment fragment2) {
                    fragment.onAttachFragment(fragment2);
                }
            });
        } else if (pessimisticallyvalidatebounds instanceof _addInjectables) {
            AudioAttributesCompatParcelizer((_addInjectables) pessimisticallyvalidatebounds);
        }
        if (this.onSeekTo != null) {
            MediaSessionCompatQueueItem();
        }
        if (pessimisticallyvalidatebounds instanceof onSetShuffleMode) {
            onSetShuffleMode onsetshufflemode = (onSetShuffleMode) pessimisticallyvalidatebounds;
            onSetRating onBackPressedDispatcher = onsetshufflemode.getIconCompatParcelizer();
            this.onPrepareFromMediaId = onBackPressedDispatcher;
            hasGetter hasgetter = onsetshufflemode;
            if (fragment != null) {
                hasgetter = fragment;
            }
            onBackPressedDispatcher.AudioAttributesCompatParcelizer(hasgetter, this.onPlayFromUri);
        }
        if (fragment != null) {
            this.onPrepareFromSearch = fragment.mFragmentManager.handleMediaPlayPauseIfPendingOnHandler(fragment);
        } else if (pessimisticallyvalidatebounds instanceof TypeResolutionContext) {
            this.onPrepareFromSearch = _addMethods.AudioAttributesCompatParcelizer(((TypeResolutionContext) pessimisticallyvalidatebounds).getViewModelStore());
        } else {
            this.onPrepareFromSearch = new _addMethods(false);
        }
        this.onPrepareFromSearch.read(onPrepareFromSearch());
        this.onCommand.IconCompatParcelizer(this.onPrepareFromSearch);
        Object obj = this.handleMediaPlayPauseIfPendingOnHandler;
        if ((obj instanceof PieChart) && fragment == null) {
            setOnChartValueSelectedListener savedStateRegistry = ((PieChart) obj).getSavedStateRegistry();
            savedStateRegistry.IconCompatParcelizer("android:support:fragments", new setOnChartValueSelectedListener.AudioAttributesCompatParcelizer() { // from class: o._findNamingStrategy
                @Override // o.setOnChartValueSelectedListener.AudioAttributesCompatParcelizer
                public final Bundle read() {
                    return this.IconCompatParcelizer.onPrepareFromMediaId();
                }
            });
            Bundle bundleRemoteActionCompatParcelizer = savedStateRegistry.RemoteActionCompatParcelizer("android:support:fragments");
            if (bundleRemoteActionCompatParcelizer != null) {
                read(bundleRemoteActionCompatParcelizer);
            }
        }
        Object obj2 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj2 instanceof _init_lambda3) {
            r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 activityResultRegistry = ((_init_lambda3) obj2).getActivityResultRegistry();
            if (fragment != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(fragment.mWho);
                sb.append(":");
                string = sb.toString();
            } else {
                string = "";
            }
            String strConcat = "FragmentManager:".concat(String.valueOf(string));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strConcat);
            sb2.append("StartActivityForResult");
            this.onSetCaptioningEnabled = activityResultRegistry.read(sb2.toString(), new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.7
                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public void IconCompatParcelizer(ActivityResult activityResult) {
                    LaunchedFragmentInfo launchedFragmentInfoPollLast = FragmentManager.this.RemoteActionCompatParcelizer.pollLast();
                    if (launchedFragmentInfoPollLast == null) {
                        toString();
                        return;
                    }
                    String str = launchedFragmentInfoPollLast.read;
                    int i = launchedFragmentInfoPollLast.AudioAttributesCompatParcelizer;
                    Fragment fragmentRemoteActionCompatParcelizer = FragmentManager.this.onCommand.RemoteActionCompatParcelizer(str);
                    if (fragmentRemoteActionCompatParcelizer == null) {
                        return;
                    }
                    fragmentRemoteActionCompatParcelizer.onActivityResult(i, activityResult.getRemoteActionCompatParcelizer(), activityResult.getRead());
                }
            });
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strConcat);
            sb3.append("StartIntentSenderForResult");
            this.onSkipToNext = activityResultRegistry.read(sb3.toString(), new RemoteActionCompatParcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.6
                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
                public void IconCompatParcelizer(ActivityResult activityResult) {
                    LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.RemoteActionCompatParcelizer.pollFirst();
                    if (launchedFragmentInfoPollFirst == null) {
                        toString();
                        return;
                    }
                    String str = launchedFragmentInfoPollFirst.read;
                    int i = launchedFragmentInfoPollFirst.AudioAttributesCompatParcelizer;
                    Fragment fragmentRemoteActionCompatParcelizer = FragmentManager.this.onCommand.RemoteActionCompatParcelizer(str);
                    if (fragmentRemoteActionCompatParcelizer == null) {
                        return;
                    }
                    fragmentRemoteActionCompatParcelizer.onActivityResult(i, activityResult.getRemoteActionCompatParcelizer(), activityResult.getRead());
                }
            });
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strConcat);
            sb4.append("RequestPermissions");
            this.onSetRating = activityResultRegistry.read(sb4.toString(), new _init_lambda4.RemoteActionCompatParcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.3
                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public void IconCompatParcelizer(Map<String, Boolean> map) {
                    String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                    }
                    LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.RemoteActionCompatParcelizer.pollFirst();
                    if (launchedFragmentInfoPollFirst == null) {
                        toString();
                        return;
                    }
                    String str = launchedFragmentInfoPollFirst.read;
                    int i2 = launchedFragmentInfoPollFirst.AudioAttributesCompatParcelizer;
                    Fragment fragmentRemoteActionCompatParcelizer = FragmentManager.this.onCommand.RemoteActionCompatParcelizer(str);
                    if (fragmentRemoteActionCompatParcelizer == null) {
                        return;
                    }
                    fragmentRemoteActionCompatParcelizer.onRequestPermissionsResult(i2, strArr, iArr);
                }
            });
        }
        Object obj3 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj3 instanceof _isPosInf) {
            ((_isPosInf) obj3).addOnConfigurationChangedListener(this.onPlayFromSearch);
        }
        Object obj4 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj4 instanceof _isTrue) {
            ((_isTrue) obj4).addOnTrimMemoryListener(this.onPrepareFromUri);
        }
        Object obj5 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj5 instanceof _findCoercionFromBlankString) {
            ((_findCoercionFromBlankString) obj5).addOnMultiWindowModeChangedListener(this.onRemoveQueueItemAt);
        }
        Object obj6 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj6 instanceof _findCoercionFromEmptyArray) {
            ((_findCoercionFromEmptyArray) obj6).addOnPictureInPictureModeChangedListener(this.onRemoveQueueItem);
        }
        Object obj7 = this.handleMediaPlayPauseIfPendingOnHandler;
        if ((obj7 instanceof UntypedObjectDeserializerNR) && fragment == null) {
            ((UntypedObjectDeserializerNR) obj7).addMenuProvider(this.onPause);
        }
    }

    public final void onSeekTo() {
        if (this.handleMediaPlayPauseIfPendingOnHandler != null) {
            this.setSessionImpl = false;
            this.onSkipToQueueItem = false;
            this.onPrepareFromSearch.read(false);
            for (Fragment fragment : this.onCommand.read()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    final void AudioAttributesCompatParcelizer(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.onSetCaptioningEnabled != null) {
            this.RemoteActionCompatParcelizer.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.onSetCaptioningEnabled.read(intent);
            return;
        }
        this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(fragment, intent, i, bundle);
    }

    final void write(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.onSkipToNext != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (write(2)) {
                    Objects.toString(bundle);
                    Objects.toString(intent2);
                    Objects.toString(fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest intentSenderRequestRemoteActionCompatParcelizer = new IntentSenderRequest.RemoteActionCompatParcelizer(intentSender).IconCompatParcelizer(intent2).IconCompatParcelizer(i3, i2).RemoteActionCompatParcelizer();
            this.RemoteActionCompatParcelizer.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (write(2)) {
                Objects.toString(fragment);
            }
            this.onSkipToNext.read(intentSenderRequestRemoteActionCompatParcelizer);
            return;
        }
        this.handleMediaPlayPauseIfPendingOnHandler.read(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    final void write(Fragment fragment, String[] strArr, int i) {
        if (this.onSetRating != null) {
            this.RemoteActionCompatParcelizer.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.onSetRating.read(strArr);
            return;
        }
        pessimisticallyValidateBounds.read(fragment, strArr);
    }

    final void write() {
        this.setSessionImpl = false;
        this.onSkipToQueueItem = false;
        this.onPrepareFromSearch.read(false);
        read(0);
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.setSessionImpl = false;
        this.onSkipToQueueItem = false;
        this.onPrepareFromSearch.read(false);
        read(1);
    }

    final void MediaBrowserCompatMediaItem() {
        read(2);
    }

    public final void read() {
        this.setSessionImpl = false;
        this.onSkipToQueueItem = false;
        this.onPrepareFromSearch.read(false);
        read(4);
    }

    public final void MediaMetadataCompat() {
        this.setSessionImpl = false;
        this.onSkipToQueueItem = false;
        this.onPrepareFromSearch.read(false);
        read(5);
    }

    public final void MediaDescriptionCompat() {
        this.setSessionImpl = false;
        this.onSkipToQueueItem = false;
        this.onPrepareFromSearch.read(false);
        read(7);
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        read(5);
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        this.onSkipToQueueItem = true;
        this.onPrepareFromSearch.read(true);
        read(4);
    }

    final void AudioAttributesImplApi26Parcelizer() {
        read(1);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.RatingCompat = true;
        RemoteActionCompatParcelizer(true);
        onSkipToNext();
        onSetRepeatMode();
        read(-1);
        Object obj = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj instanceof _isTrue) {
            ((_isTrue) obj).removeOnTrimMemoryListener(this.onPrepareFromUri);
        }
        Object obj2 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj2 instanceof _isPosInf) {
            ((_isPosInf) obj2).removeOnConfigurationChangedListener(this.onPlayFromSearch);
        }
        Object obj3 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj3 instanceof _findCoercionFromBlankString) {
            ((_findCoercionFromBlankString) obj3).removeOnMultiWindowModeChangedListener(this.onRemoveQueueItemAt);
        }
        Object obj4 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (obj4 instanceof _findCoercionFromEmptyArray) {
            ((_findCoercionFromEmptyArray) obj4).removeOnPictureInPictureModeChangedListener(this.onRemoveQueueItem);
        }
        Object obj5 = this.handleMediaPlayPauseIfPendingOnHandler;
        if ((obj5 instanceof UntypedObjectDeserializerNR) && this.onSeekTo == null) {
            ((UntypedObjectDeserializerNR) obj5).removeMenuProvider(this.onPause);
        }
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.onSeekTo = null;
        if (this.onPrepareFromMediaId != null) {
            this.onPlayFromUri.remove();
            this.onPrepareFromMediaId = null;
        }
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.onSetCaptioningEnabled;
        if (r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 != null) {
            r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.RemoteActionCompatParcelizer();
            this.onSkipToNext.RemoteActionCompatParcelizer();
            this.onSetRating.RemoteActionCompatParcelizer();
        }
    }

    private void read(int i) {
        try {
            this.MediaDescriptionCompat = true;
            this.onCommand.write(i);
            read(i, false);
            Iterator<_renameUsing> it = onSetRating().iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer();
            }
            this.MediaDescriptionCompat = false;
            RemoteActionCompatParcelizer(true);
        } catch (Throwable th) {
            this.MediaDescriptionCompat = false;
            throw th;
        }
    }

    private void IconCompatParcelizer(boolean z, boolean z2) {
        if (z2 && (this.handleMediaPlayPauseIfPendingOnHandler instanceof _findCoercionFromBlankString)) {
            IconCompatParcelizer(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.IconCompatParcelizer(z, true);
                }
            }
        }
    }

    private void AudioAttributesCompatParcelizer(boolean z, boolean z2) {
        if (z2 && (this.handleMediaPlayPauseIfPendingOnHandler instanceof _findCoercionFromEmptyArray)) {
            IconCompatParcelizer(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.AudioAttributesCompatParcelizer(z, true);
                }
            }
        }
    }

    private void write(Configuration configuration, boolean z) {
        if (z && (this.handleMediaPlayPauseIfPendingOnHandler instanceof _isPosInf)) {
            IconCompatParcelizer(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.write(configuration, true);
                }
            }
        }
    }

    private void read(boolean z) {
        if (z && (this.handleMediaPlayPauseIfPendingOnHandler instanceof _isTrue)) {
            IconCompatParcelizer(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.read(true);
                }
            }
        }
    }

    final boolean AudioAttributesCompatParcelizer(Menu menu, MenuInflater menuInflater) {
        if (this.MediaBrowserCompatMediaItem <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null && RatingCompat(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.AudioAttributesImplBaseParcelizer != null) {
            for (int i = 0; i < this.AudioAttributesImplBaseParcelizer.size(); i++) {
                Fragment fragment2 = this.AudioAttributesImplBaseParcelizer.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.AudioAttributesImplBaseParcelizer = arrayList;
        return z;
    }

    final boolean AudioAttributesCompatParcelizer(Menu menu) {
        boolean z = false;
        if (this.MediaBrowserCompatMediaItem <= 0) {
            return false;
        }
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null && RatingCompat(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    final boolean AudioAttributesCompatParcelizer(MenuItem menuItem) {
        if (this.MediaBrowserCompatMediaItem <= 0) {
            return false;
        }
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean IconCompatParcelizer(MenuItem menuItem) {
        if (this.MediaBrowserCompatMediaItem <= 0) {
            return false;
        }
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final void write(Menu menu) {
        if (this.MediaBrowserCompatMediaItem <= 0) {
            return;
        }
        for (Fragment fragment : this.onCommand.read()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void onCustomAction(Fragment fragment) {
        if (fragment != null && (!fragment.equals(RemoteActionCompatParcelizer(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        Fragment fragment2 = this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = fragment;
        onCommand(fragment2);
        onCommand(this.AudioAttributesCompatParcelizer);
    }

    private void onCommand(Fragment fragment) {
        if (fragment == null || !fragment.equals(RemoteActionCompatParcelizer(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    final void RatingCompat() {
        MediaSessionCompatQueueItem();
        onCommand(this.AudioAttributesCompatParcelizer);
    }

    private Fragment MediaSessionCompatToken() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(Fragment fragment, anyIgnorals.write writeVar) {
        if (!fragment.equals(RemoteActionCompatParcelizer(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        fragment.mMaxState = writeVar;
    }

    public final NopAnnotationIntrospector1 onCommand() {
        Fragment fragment = this.onSeekTo;
        if (fragment != null) {
            return fragment.mFragmentManager.onCommand();
        }
        return this.onMediaButtonEvent;
    }

    public final getAnySetterField onPause() {
        Fragment fragment = this.onSeekTo;
        if (fragment != null) {
            return fragment.mFragmentManager.onPause();
        }
        return this.MediaMetadataCompat;
    }

    public final getGeneratorType onPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    public final void write(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        this.onPlayFromMediaId.read(iconCompatParcelizer, z);
    }

    public final void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        this.onPlayFromMediaId.write(iconCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer(_addInjectables _addinjectables) {
        this.onPrepare.add(_addinjectables);
    }

    final void MediaBrowserCompatCustomActionResultReceiver(Fragment fragment) {
        Iterator<_addInjectables> it = this.onPrepare.iterator();
        while (it.hasNext()) {
            it.next().read(fragment);
        }
    }

    public final void AudioAttributesImplBaseParcelizer() {
        for (Fragment fragment : this.onCommand.AudioAttributesCompatParcelizer()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.AudioAttributesImplBaseParcelizer();
            }
        }
    }

    private boolean PlaybackStateCompat() {
        boolean zOnFastForward = false;
        for (Fragment fragment : this.onCommand.AudioAttributesCompatParcelizer()) {
            if (fragment != null) {
                zOnFastForward = onFastForward(fragment);
            }
            if (zOnFastForward) {
                return true;
            }
        }
        return false;
    }

    private static boolean onFastForward(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.PlaybackStateCompat();
    }

    public final void AudioAttributesImplApi21Parcelizer(Fragment fragment) {
        if (fragment.mAdded && onFastForward(fragment)) {
            this.onPlay = true;
        }
    }

    private boolean onStop() {
        Fragment fragment = this.onSeekTo;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.onSeekTo.getParentFragmentManager().onStop();
    }

    public final LayoutInflater.Factory2 onMediaButtonEvent() {
        return this.onFastForward;
    }

    public final getJsonValueAccessor.write onPlayFromSearch() {
        return this.onSkipToPrevious;
    }

    /* JADX INFO: loaded from: classes2.dex */
    class AudioAttributesImplApi26Parcelizer implements write {
        final String AudioAttributesCompatParcelizer;
        final int RemoteActionCompatParcelizer;
        final int write;

        AudioAttributesImplApi26Parcelizer(String str, int i, int i2) {
            this.AudioAttributesCompatParcelizer = str;
            this.write = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.write
        public final boolean read(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2) {
            if (FragmentManager.this.AudioAttributesCompatParcelizer == null || this.write >= 0 || this.AudioAttributesCompatParcelizer != null || !FragmentManager.this.AudioAttributesCompatParcelizer.getChildFragmentManager().onRemoveQueueItemAt()) {
                return FragmentManager.this.IconCompatParcelizer(arrayList, arrayList2, this.AudioAttributesCompatParcelizer, this.write, this.RemoteActionCompatParcelizer);
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class MediaBrowserCompatItemReceiver implements write {
        MediaBrowserCompatItemReceiver() {
        }

        @Override // androidx.fragment.app.FragmentManager.write
        public final boolean read(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2) {
            boolean z = FragmentManager.this.read(arrayList, arrayList2);
            if (!FragmentManager.this.IconCompatParcelizer.isEmpty() && arrayList.size() > 0) {
                arrayList2.get(arrayList.size() - 1);
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                Iterator<_refinePropertyInclusion> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.IconCompatParcelizer(it.next()));
                }
                for (read readVar : FragmentManager.this.IconCompatParcelizer) {
                    for (Fragment fragment : linkedHashSet) {
                    }
                }
            }
            return z;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LaunchedFragmentInfo[] newArray(int i) {
                return IconCompatParcelizer(i);
            }

            private static LaunchedFragmentInfo IconCompatParcelizer(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            private static LaunchedFragmentInfo[] IconCompatParcelizer(int i) {
                return new LaunchedFragmentInfo[i];
            }
        };
        int AudioAttributesCompatParcelizer;
        String read;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        LaunchedFragmentInfo(String str, int i) {
            this.read = str;
            this.AudioAttributesCompatParcelizer = i;
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.read = parcel.readString();
            this.AudioAttributesCompatParcelizer = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.read);
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class RemoteActionCompatParcelizer extends accessaddObserverForBackInvoker<IntentSenderRequest, ActivityResult> {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ ActivityResult AudioAttributesCompatParcelizer(int i, Intent intent) {
            return write(i, intent);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Intent write(Context context, IntentSenderRequest intentSenderRequest) {
            return RemoteActionCompatParcelizer(intentSenderRequest);
        }

        private static Intent RemoteActionCompatParcelizer(IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent write = intentSenderRequest.getWrite();
            if (write != null && (bundleExtra = write.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                write.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (write.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.RemoteActionCompatParcelizer(intentSenderRequest.getRead()).IconCompatParcelizer(null).IconCompatParcelizer(intentSenderRequest.getIconCompatParcelizer(), intentSenderRequest.getAudioAttributesCompatParcelizer()).RemoteActionCompatParcelizer();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.write(2)) {
                intent.toString();
            }
            return intent;
        }

        private static ActivityResult write(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }
}
