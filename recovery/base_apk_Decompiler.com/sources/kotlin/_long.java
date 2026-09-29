package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.JdkDeserializers;
import kotlin._readAndBind;

/* JADX INFO: loaded from: classes2.dex */
public final class _long extends _isStdKeyDeser {
    int MediaSessionCompatToken;
    int PlaybackStateCompat;
    private int _init_lambda4;
    private int _init_lambda5;
    private int accessensureViewModelStore;
    public useNullForUnknownEnum onSkipToPrevious;
    private _readAndBind ResultReceiver = new _readAndBind(this);
    private setIgnorableProperties r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new setIgnorableProperties(this);
    private _readAndBind.write r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = null;
    private boolean _init_lambda3 = false;
    private _getToStringLookup addObserverForBackInvoker = new _getToStringLookup();
    public int onSkipToQueueItem = 0;
    public int ParcelableVolumeInfo = 0;
    JsonLocationInstantiator[] MediaSessionCompatResultReceiverWrapper = new JsonLocationInstantiator[4];
    JsonLocationInstantiator[] onStop = new JsonLocationInstantiator[4];
    private boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = false;
    private boolean r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = false;
    private boolean createFullyDrawnExecutor = false;
    private int getSavedStateRegistryControllerannotations = 0;
    private int addMenuProvider = 0;
    private int accessaddObserverForBackInvoker = 257;
    private boolean accessgetReportFullyDrawnExecutorp = false;
    private boolean getOnBackPressedDispatcherannotations = false;
    private boolean PlaybackStateCompatCustomAction = false;
    private int r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = 0;
    private WeakReference<_int> addObserverForBackInvokerlambda7 = null;
    private WeakReference<_int> _init_lambda2 = null;
    private WeakReference<_int> ensureViewModelStore = null;
    private WeakReference<_int> r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
    private HashSet<JdkDeserializers> accessonBackPresseds1027565324 = new HashSet<>();
    public _readAndBind.IconCompatParcelizer setSessionImpl = new _readAndBind.IconCompatParcelizer();

    public final void AudioAttributesImplApi26Parcelizer() {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer();
    }

    public final void AudioAttributesImplBaseParcelizer() {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer();
    }

    public final boolean RemoteActionCompatParcelizer(boolean z) {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(z);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write();
    }

    public final boolean write(boolean z, int i) {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer(z, i);
    }

    public final long read(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.MediaSessionCompatToken = i6;
        this.PlaybackStateCompat = i7;
        return this.ResultReceiver.RemoteActionCompatParcelizer(this, i, i2, i3, i4, i5);
    }

    public final void accessaddObserverForBackInvoker() {
        this.ResultReceiver.RemoteActionCompatParcelizer(this);
    }

    public final void write(_readAndBind.write writeVar) {
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = writeVar;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(writeVar);
    }

    public final _readAndBind.write IconCompatParcelizer() {
        return this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    }

    public final void read(int i) {
        this.accessaddObserverForBackInvoker = i;
        _getToStringLookup.IconCompatParcelizer = AudioAttributesCompatParcelizer(512);
    }

    public final int write() {
        return this.accessaddObserverForBackInvoker;
    }

    public final boolean AudioAttributesCompatParcelizer(int i) {
        return (this.accessaddObserverForBackInvoker & i) == i;
    }

    @Override // kotlin._isStdKeyDeser, kotlin.JdkDeserializers
    public final void ResultReceiver() {
        this.addObserverForBackInvoker.IconCompatParcelizer();
        this.MediaSessionCompatToken = 0;
        this._init_lambda5 = 0;
        this.PlaybackStateCompat = 0;
        this.accessensureViewModelStore = 0;
        this.accessgetReportFullyDrawnExecutorp = false;
        super.ResultReceiver();
    }

    public final boolean accessensureViewModelStore() {
        return this.getOnBackPressedDispatcherannotations;
    }

    public final boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        return this.PlaybackStateCompatCustomAction;
    }

    final void AudioAttributesCompatParcelizer(_int _intVar) {
        WeakReference<_int> weakReference = this.addObserverForBackInvokerlambda7;
        if (weakReference == null || weakReference.get() == null || _intVar.read() > this.addObserverForBackInvokerlambda7.get().read()) {
            this.addObserverForBackInvokerlambda7 = new WeakReference<>(_intVar);
        }
    }

    public final void RemoteActionCompatParcelizer(_int _intVar) {
        WeakReference<_int> weakReference = this._init_lambda2;
        if (weakReference == null || weakReference.get() == null || _intVar.read() > this._init_lambda2.get().read()) {
            this._init_lambda2 = new WeakReference<>(_intVar);
        }
    }

    final void read(_int _intVar) {
        WeakReference<_int> weakReference = this.ensureViewModelStore;
        if (weakReference == null || weakReference.get() == null || _intVar.read() > this.ensureViewModelStore.get().read()) {
            this.ensureViewModelStore = new WeakReference<>(_intVar);
        }
    }

    public final void IconCompatParcelizer(_int _intVar) {
        WeakReference<_int> weakReference = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (weakReference == null || weakReference.get() == null || _intVar.read() > this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.get().read()) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new WeakReference<>(_intVar);
        }
    }

    private void IconCompatParcelizer(_int _intVar, constructSet constructset) {
        this.addObserverForBackInvoker.IconCompatParcelizer(this.addObserverForBackInvoker.RemoteActionCompatParcelizer(_intVar), constructset, 0, 5);
    }

    private void AudioAttributesCompatParcelizer(_int _intVar, constructSet constructset) {
        this.addObserverForBackInvoker.IconCompatParcelizer(constructset, this.addObserverForBackInvoker.RemoteActionCompatParcelizer(_intVar), 0, 5);
    }

    private boolean IconCompatParcelizer(_getToStringLookup _gettostringlookup) {
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(64);
        IconCompatParcelizer(_gettostringlookup, zAudioAttributesCompatParcelizer);
        int size = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            JdkDeserializers jdkDeserializers = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.get(i);
            jdkDeserializers.AudioAttributesCompatParcelizer(0, false);
            jdkDeserializers.AudioAttributesCompatParcelizer(1, false);
            if (jdkDeserializers instanceof _deSerializeBCP47Locale) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                JdkDeserializers jdkDeserializers2 = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.get(i2);
                if (jdkDeserializers2 instanceof _deSerializeBCP47Locale) {
                    ((_deSerializeBCP47Locale) jdkDeserializers2).AudioAttributesImplBaseParcelizer();
                }
            }
        }
        this.accessonBackPresseds1027565324.clear();
        for (int i3 = 0; i3 < size; i3++) {
            JdkDeserializers jdkDeserializers3 = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.get(i3);
            if (jdkDeserializers3.w_()) {
                if (jdkDeserializers3 instanceof _readAndBindStringKeyMap) {
                    this.accessonBackPresseds1027565324.add(jdkDeserializers3);
                } else {
                    jdkDeserializers3.IconCompatParcelizer(_gettostringlookup, zAudioAttributesCompatParcelizer);
                }
            }
        }
        while (this.accessonBackPresseds1027565324.size() > 0) {
            int size2 = this.accessonBackPresseds1027565324.size();
            Iterator<JdkDeserializers> it = this.accessonBackPresseds1027565324.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                _readAndBindStringKeyMap _readandbindstringkeymap = (_readAndBindStringKeyMap) it.next();
                if (_readandbindstringkeymap.AudioAttributesCompatParcelizer(this.accessonBackPresseds1027565324)) {
                    _readandbindstringkeymap.IconCompatParcelizer(_gettostringlookup, zAudioAttributesCompatParcelizer);
                    this.accessonBackPresseds1027565324.remove(_readandbindstringkeymap);
                    break;
                }
            }
            if (size2 == this.accessonBackPresseds1027565324.size()) {
                Iterator<JdkDeserializers> it2 = this.accessonBackPresseds1027565324.iterator();
                while (it2.hasNext()) {
                    it2.next().IconCompatParcelizer(_gettostringlookup, zAudioAttributesCompatParcelizer);
                }
                this.accessonBackPresseds1027565324.clear();
            }
        }
        if (_getToStringLookup.IconCompatParcelizer) {
            HashSet<JdkDeserializers> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                JdkDeserializers jdkDeserializers4 = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.get(i4);
                if (!jdkDeserializers4.w_()) {
                    hashSet.add(jdkDeserializers4);
                }
            }
            read(this, _gettostringlookup, hashSet, onPlayFromMediaId() == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT ? 0 : 1, false);
            for (JdkDeserializers jdkDeserializers5 : hashSet) {
                MapDeserializer.IconCompatParcelizer(this, _gettostringlookup, jdkDeserializers5);
                jdkDeserializers5.IconCompatParcelizer(_gettostringlookup, zAudioAttributesCompatParcelizer);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                JdkDeserializers jdkDeserializers6 = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.get(i5);
                if (jdkDeserializers6 instanceof _long) {
                    JdkDeserializers.IconCompatParcelizer iconCompatParcelizer = jdkDeserializers6.MediaBrowserCompatSearchResultReceiver[0];
                    JdkDeserializers.IconCompatParcelizer iconCompatParcelizer2 = jdkDeserializers6.MediaBrowserCompatSearchResultReceiver[1];
                    if (iconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                        jdkDeserializers6.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.FIXED);
                    }
                    if (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                        jdkDeserializers6.write(JdkDeserializers.IconCompatParcelizer.FIXED);
                    }
                    jdkDeserializers6.IconCompatParcelizer(_gettostringlookup, zAudioAttributesCompatParcelizer);
                    if (iconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                        jdkDeserializers6.AudioAttributesCompatParcelizer(iconCompatParcelizer);
                    }
                    if (iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT) {
                        jdkDeserializers6.write(iconCompatParcelizer2);
                    }
                } else {
                    MapDeserializer.IconCompatParcelizer(this, _gettostringlookup, jdkDeserializers6);
                    if (!jdkDeserializers6.w_()) {
                        jdkDeserializers6.IconCompatParcelizer(_gettostringlookup, zAudioAttributesCompatParcelizer);
                    }
                }
            }
        }
        if (this.onSkipToQueueItem > 0) {
            creatorProp.IconCompatParcelizer(this, _gettostringlookup, null, 0);
        }
        if (this.ParcelableVolumeInfo > 0) {
            creatorProp.IconCompatParcelizer(this, _gettostringlookup, null, 1);
        }
        return true;
    }

    private boolean write(_getToStringLookup _gettostringlookup, boolean[] zArr) {
        zArr[2] = false;
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(64);
        AudioAttributesCompatParcelizer(zAudioAttributesCompatParcelizer);
        int size = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            JdkDeserializers jdkDeserializers = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.get(i);
            jdkDeserializers.AudioAttributesCompatParcelizer(zAudioAttributesCompatParcelizer);
            if (jdkDeserializers.onSetPlaybackSpeed()) {
                z = true;
            }
        }
        return z;
    }

    @Override // kotlin.JdkDeserializers
    public final void read(boolean z, boolean z2) {
        super.read(z, z2);
        int size = ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            ((_isStdKeyDeser) this).MediaSessionCompatQueueItem.get(i).read(z, z2);
        }
    }

    public final void write(boolean z) {
        this._init_lambda3 = z;
    }

    public final boolean _init_lambda5() {
        return this._init_lambda3;
    }

    public static boolean IconCompatParcelizer(JdkDeserializers jdkDeserializers, _readAndBind.write writeVar, _readAndBind.IconCompatParcelizer iconCompatParcelizer, int i) {
        int i2;
        int i3;
        if (writeVar == null) {
            return false;
        }
        if (jdkDeserializers.onRewind() == 8 || (jdkDeserializers instanceof _deserializeUsingCreator) || (jdkDeserializers instanceof _deSerializeBCP47Locale)) {
            iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = 0;
            iconCompatParcelizer.AudioAttributesImplApi21Parcelizer = 0;
            return false;
        }
        iconCompatParcelizer.read = jdkDeserializers.onPlayFromMediaId();
        iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = jdkDeserializers.onSeekTo();
        iconCompatParcelizer.write = jdkDeserializers.onSetShuffleMode();
        iconCompatParcelizer.AudioAttributesImplBaseParcelizer = jdkDeserializers.onAddQueueItem();
        iconCompatParcelizer.MediaBrowserCompatItemReceiver = false;
        iconCompatParcelizer.AudioAttributesCompatParcelizer = 0;
        boolean z = iconCompatParcelizer.read == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT;
        boolean z2 = iconCompatParcelizer.AudioAttributesImplApi26Parcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT;
        boolean z3 = z && jdkDeserializers.AudioAttributesImplApi21Parcelizer > BitmapDescriptorFactory.HUE_RED;
        boolean z4 = z2 && jdkDeserializers.AudioAttributesImplApi21Parcelizer > BitmapDescriptorFactory.HUE_RED;
        if (z && jdkDeserializers.MediaBrowserCompatItemReceiver(0) && jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 && !z3) {
            iconCompatParcelizer.read = JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
            if (z2 && jdkDeserializers.onAddQueueItem == 0) {
                iconCompatParcelizer.read = JdkDeserializers.IconCompatParcelizer.FIXED;
            }
            z = false;
        }
        if (z2 && jdkDeserializers.MediaBrowserCompatItemReceiver(1) && jdkDeserializers.onAddQueueItem == 0 && !z4) {
            iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
            if (z && jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
                iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = JdkDeserializers.IconCompatParcelizer.FIXED;
            }
            z2 = false;
        }
        if (jdkDeserializers.AudioAttributesImplApi21Parcelizer()) {
            iconCompatParcelizer.read = JdkDeserializers.IconCompatParcelizer.FIXED;
            z = false;
        }
        if (jdkDeserializers.MediaBrowserCompatCustomActionResultReceiver()) {
            iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = JdkDeserializers.IconCompatParcelizer.FIXED;
            z2 = false;
        }
        if (z3) {
            if (jdkDeserializers.onPrepareFromSearch[0] == 4) {
                iconCompatParcelizer.read = JdkDeserializers.IconCompatParcelizer.FIXED;
            } else if (!z2) {
                if (iconCompatParcelizer.AudioAttributesImplApi26Parcelizer == JdkDeserializers.IconCompatParcelizer.FIXED) {
                    i3 = iconCompatParcelizer.AudioAttributesImplBaseParcelizer;
                } else {
                    iconCompatParcelizer.read = JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
                    writeVar.RemoteActionCompatParcelizer(jdkDeserializers, iconCompatParcelizer);
                    i3 = iconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
                }
                iconCompatParcelizer.read = JdkDeserializers.IconCompatParcelizer.FIXED;
                iconCompatParcelizer.write = (int) (jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler() * i3);
            }
        }
        if (z4) {
            if (jdkDeserializers.onPrepareFromSearch[1] == 4) {
                iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = JdkDeserializers.IconCompatParcelizer.FIXED;
            } else if (!z) {
                if (iconCompatParcelizer.read == JdkDeserializers.IconCompatParcelizer.FIXED) {
                    i2 = iconCompatParcelizer.write;
                } else {
                    iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
                    writeVar.RemoteActionCompatParcelizer(jdkDeserializers, iconCompatParcelizer);
                    i2 = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                }
                iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = JdkDeserializers.IconCompatParcelizer.FIXED;
                if (jdkDeserializers.onCommand() == -1) {
                    iconCompatParcelizer.AudioAttributesImplBaseParcelizer = (int) (i2 / jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler());
                } else {
                    iconCompatParcelizer.AudioAttributesImplBaseParcelizer = (int) (jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler() * i2);
                }
            }
        }
        writeVar.RemoteActionCompatParcelizer(jdkDeserializers, iconCompatParcelizer);
        jdkDeserializers.onFastForward(iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver);
        jdkDeserializers.MediaMetadataCompat(iconCompatParcelizer.AudioAttributesImplApi21Parcelizer);
        jdkDeserializers.read(iconCompatParcelizer.IconCompatParcelizer);
        jdkDeserializers.MediaBrowserCompatSearchResultReceiver(iconCompatParcelizer.RemoteActionCompatParcelizer);
        iconCompatParcelizer.AudioAttributesCompatParcelizer = 0;
        return iconCompatParcelizer.MediaBrowserCompatItemReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030e A[PHI: r13 r16
      0x030e: PHI (r13v8 ??) = (r13v7 ??), (r13v10 ??), (r13v10 ??), (r13v10 ??) binds: [B:143:0x02cd, B:151:0x02f4, B:152:0x02f6, B:154:0x02fc] A[DONT_GENERATE, DONT_INLINE]
      0x030e: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:143:0x02cd, B:151:0x02f4, B:152:0x02f6, B:154:0x02fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0316  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // kotlin._isStdKeyDeser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void _init_lambda4() {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._long._init_lambda4():void");
    }

    public final _getToStringLookup RemoteActionCompatParcelizer() {
        return this.addObserverForBackInvoker;
    }

    private void addObserverForBackInvokerlambda7() {
        this.onSkipToQueueItem = 0;
        this.ParcelableVolumeInfo = 0;
    }

    final void IconCompatParcelizer(JdkDeserializers jdkDeserializers, int i) {
        if (i == 0) {
            IconCompatParcelizer(jdkDeserializers);
        } else if (i == 1) {
            AudioAttributesCompatParcelizer(jdkDeserializers);
        }
    }

    private void IconCompatParcelizer(JdkDeserializers jdkDeserializers) {
        int i = this.onSkipToQueueItem;
        JsonLocationInstantiator[] jsonLocationInstantiatorArr = this.onStop;
        if (i + 1 >= jsonLocationInstantiatorArr.length) {
            this.onStop = (JsonLocationInstantiator[]) Arrays.copyOf(jsonLocationInstantiatorArr, jsonLocationInstantiatorArr.length << 1);
        }
        this.onStop[this.onSkipToQueueItem] = new JsonLocationInstantiator(jdkDeserializers, 0, _init_lambda5());
        this.onSkipToQueueItem++;
    }

    private void AudioAttributesCompatParcelizer(JdkDeserializers jdkDeserializers) {
        int i = this.ParcelableVolumeInfo;
        JsonLocationInstantiator[] jsonLocationInstantiatorArr = this.MediaSessionCompatResultReceiverWrapper;
        if (i + 1 >= jsonLocationInstantiatorArr.length) {
            this.MediaSessionCompatResultReceiverWrapper = (JsonLocationInstantiator[]) Arrays.copyOf(jsonLocationInstantiatorArr, jsonLocationInstantiatorArr.length << 1);
        }
        this.MediaSessionCompatResultReceiverWrapper[this.ParcelableVolumeInfo] = new JsonLocationInstantiator(jdkDeserializers, 1, _init_lambda5());
        this.ParcelableVolumeInfo++;
    }

    public final void onPause(int i) {
        this._init_lambda4 = i;
    }
}
