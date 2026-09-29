package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;
import kotlin._int;
import kotlin.constructSet;

/* JADX INFO: loaded from: classes2.dex */
public final class _getToStringLookup {
    public static boolean IconCompatParcelizer = false;
    private static long MediaBrowserCompatCustomActionResultReceiver;
    private IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private IconCompatParcelizer onCustomAction;
    final useDefaultValueForUnknownEnum read;
    private int RatingCompat = 1000;
    public boolean write = false;
    private int onAddQueueItem = 0;
    private HashMap<String, constructSet> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
    private int onCommand = 32;
    private int AudioAttributesImplBaseParcelizer = 32;
    public boolean AudioAttributesCompatParcelizer = false;
    public boolean AudioAttributesImplApi26Parcelizer = false;
    private boolean[] AudioAttributesImplApi21Parcelizer = new boolean[32];
    private int MediaDescriptionCompat = 1;
    private int MediaBrowserCompatSearchResultReceiver = 0;
    private int MediaMetadataCompat = 32;
    private constructSet[] MediaBrowserCompatMediaItem = new constructSet[1000];
    private int handleMediaPlayPauseIfPendingOnHandler = 0;
    _fromString[] RemoteActionCompatParcelizer = new _fromString[32];

    interface IconCompatParcelizer {
        void AudioAttributesCompatParcelizer(constructSet constructset);

        constructSet IconCompatParcelizer(boolean[] zArr);

        boolean IconCompatParcelizer();

        void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer);

        constructSet read();

        void write();
    }

    public _getToStringLookup() {
        AudioAttributesImplBaseParcelizer();
        useDefaultValueForUnknownEnum usedefaultvalueforunknownenum = new useDefaultValueForUnknownEnum();
        this.read = usedefaultvalueforunknownenum;
        this.MediaBrowserCompatItemReceiver = new constructMap(usedefaultvalueforunknownenum);
        this.onCustomAction = new _fromString(usedefaultvalueforunknownenum);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = this.onCommand << 1;
        this.onCommand = i;
        this.RemoteActionCompatParcelizer = (_fromString[]) Arrays.copyOf(this.RemoteActionCompatParcelizer, i);
        useDefaultValueForUnknownEnum usedefaultvalueforunknownenum = this.read;
        usedefaultvalueforunknownenum.read = (constructSet[]) Arrays.copyOf(usedefaultvalueforunknownenum.read, this.onCommand);
        int i2 = this.onCommand;
        this.AudioAttributesImplApi21Parcelizer = new boolean[i2];
        this.AudioAttributesImplBaseParcelizer = i2;
        this.MediaMetadataCompat = i2;
    }

    private void AudioAttributesImplBaseParcelizer() {
        for (int i = 0; i < this.MediaBrowserCompatSearchResultReceiver; i++) {
            _fromString _fromstring = this.RemoteActionCompatParcelizer[i];
            if (_fromstring != null) {
                this.read.write.write(_fromstring);
            }
            this.RemoteActionCompatParcelizer[i] = null;
        }
    }

    public final void IconCompatParcelizer() {
        for (int i = 0; i < this.read.read.length; i++) {
            constructSet constructset = this.read.read[i];
            if (constructset != null) {
                constructset.IconCompatParcelizer();
            }
        }
        this.read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, this.handleMediaPlayPauseIfPendingOnHandler);
        this.handleMediaPlayPauseIfPendingOnHandler = 0;
        Arrays.fill(this.read.read, (Object) null);
        this.onAddQueueItem = 0;
        this.MediaBrowserCompatItemReceiver.write();
        this.MediaDescriptionCompat = 1;
        for (int i2 = 0; i2 < this.MediaBrowserCompatSearchResultReceiver; i2++) {
            _fromString _fromstring = this.RemoteActionCompatParcelizer[i2];
            if (_fromstring != null) {
                _fromstring.IconCompatParcelizer = false;
            }
        }
        AudioAttributesImplBaseParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.onCustomAction = new _fromString(this.read);
    }

    public final constructSet RemoteActionCompatParcelizer(Object obj) {
        constructSet constructsetAudioAttributesImplApi26Parcelizer = null;
        if (obj == null) {
            return null;
        }
        if (this.MediaDescriptionCompat + 1 >= this.AudioAttributesImplBaseParcelizer) {
            MediaBrowserCompatCustomActionResultReceiver();
        }
        if (obj instanceof _int) {
            _int _intVar = (_int) obj;
            constructsetAudioAttributesImplApi26Parcelizer = _intVar.AudioAttributesImplApi26Parcelizer();
            if (constructsetAudioAttributesImplApi26Parcelizer == null) {
                _intVar.RatingCompat();
                constructsetAudioAttributesImplApi26Parcelizer = _intVar.AudioAttributesImplApi26Parcelizer();
            }
            if (constructsetAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer != -1 && constructsetAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer <= this.onAddQueueItem && this.read.read[constructsetAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer] != null) {
                return constructsetAudioAttributesImplApi26Parcelizer;
            }
            if (constructsetAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer != -1) {
                constructsetAudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            }
            int i = this.onAddQueueItem + 1;
            this.onAddQueueItem = i;
            this.MediaDescriptionCompat++;
            constructsetAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = i;
            constructsetAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer = constructSet.RemoteActionCompatParcelizer.UNRESTRICTED;
            this.read.read[this.onAddQueueItem] = constructsetAudioAttributesImplApi26Parcelizer;
        }
        return constructsetAudioAttributesImplApi26Parcelizer;
    }

    public final _fromString write() {
        _fromString _fromstringAudioAttributesCompatParcelizer = this.read.write.AudioAttributesCompatParcelizer();
        if (_fromstringAudioAttributesCompatParcelizer == null) {
            _fromstringAudioAttributesCompatParcelizer = new _fromString(this.read);
            MediaBrowserCompatCustomActionResultReceiver++;
        } else {
            _fromstringAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
        constructSet.write();
        return _fromstringAudioAttributesCompatParcelizer;
    }

    private constructSet AudioAttributesImplApi26Parcelizer() {
        if (this.MediaDescriptionCompat + 1 >= this.AudioAttributesImplBaseParcelizer) {
            MediaBrowserCompatCustomActionResultReceiver();
        }
        constructSet constructsetWrite = write(constructSet.RemoteActionCompatParcelizer.SLACK);
        int i = this.onAddQueueItem + 1;
        this.onAddQueueItem = i;
        this.MediaDescriptionCompat++;
        constructsetWrite.AudioAttributesCompatParcelizer = i;
        this.read.read[this.onAddQueueItem] = constructsetWrite;
        return constructsetWrite;
    }

    private constructSet MediaBrowserCompatItemReceiver() {
        if (this.MediaDescriptionCompat + 1 >= this.AudioAttributesImplBaseParcelizer) {
            MediaBrowserCompatCustomActionResultReceiver();
        }
        constructSet constructsetWrite = write(constructSet.RemoteActionCompatParcelizer.SLACK);
        int i = this.onAddQueueItem + 1;
        this.onAddQueueItem = i;
        this.MediaDescriptionCompat++;
        constructsetWrite.AudioAttributesCompatParcelizer = i;
        this.read.read[this.onAddQueueItem] = constructsetWrite;
        return constructsetWrite;
    }

    private void IconCompatParcelizer(_fromString _fromstring, int i, int i2) {
        _fromstring.RemoteActionCompatParcelizer(write(i2, null), i);
    }

    public final constructSet write(int i, String str) {
        if (this.MediaDescriptionCompat + 1 >= this.AudioAttributesImplBaseParcelizer) {
            MediaBrowserCompatCustomActionResultReceiver();
        }
        constructSet constructsetWrite = write(constructSet.RemoteActionCompatParcelizer.ERROR);
        int i2 = this.onAddQueueItem + 1;
        this.onAddQueueItem = i2;
        this.MediaDescriptionCompat++;
        constructsetWrite.AudioAttributesCompatParcelizer = i2;
        constructsetWrite.MediaBrowserCompatCustomActionResultReceiver = i;
        this.read.read[this.onAddQueueItem] = constructsetWrite;
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(constructsetWrite);
        return constructsetWrite;
    }

    private constructSet write(constructSet.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        constructSet constructsetAudioAttributesCompatParcelizer = this.read.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (constructsetAudioAttributesCompatParcelizer == null) {
            constructsetAudioAttributesCompatParcelizer = new constructSet(remoteActionCompatParcelizer);
            constructsetAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        } else {
            constructsetAudioAttributesCompatParcelizer.IconCompatParcelizer();
            constructsetAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        }
        int i = this.handleMediaPlayPauseIfPendingOnHandler;
        int i2 = this.RatingCompat;
        if (i >= i2) {
            int i3 = i2 << 1;
            this.RatingCompat = i3;
            this.MediaBrowserCompatMediaItem = (constructSet[]) Arrays.copyOf(this.MediaBrowserCompatMediaItem, i3);
        }
        constructSet[] constructsetArr = this.MediaBrowserCompatMediaItem;
        int i4 = this.handleMediaPlayPauseIfPendingOnHandler;
        this.handleMediaPlayPauseIfPendingOnHandler = i4 + 1;
        constructsetArr[i4] = constructsetAudioAttributesCompatParcelizer;
        return constructsetAudioAttributesCompatParcelizer;
    }

    public static int AudioAttributesCompatParcelizer(Object obj) {
        constructSet constructsetAudioAttributesImplApi26Parcelizer = ((_int) obj).AudioAttributesImplApi26Parcelizer();
        if (constructsetAudioAttributesImplApi26Parcelizer != null) {
            return (int) (constructsetAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer + 0.5f);
        }
        return 0;
    }

    public final void AudioAttributesCompatParcelizer() throws Exception {
        if (this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
            RemoteActionCompatParcelizer();
            return;
        }
        if (this.AudioAttributesImplApi26Parcelizer) {
            for (int i = 0; i < this.MediaBrowserCompatSearchResultReceiver; i++) {
                if (!this.RemoteActionCompatParcelizer[i].write) {
                    write(this.MediaBrowserCompatItemReceiver);
                    return;
                }
            }
            RemoteActionCompatParcelizer();
            return;
        }
        write(this.MediaBrowserCompatItemReceiver);
    }

    private void write(IconCompatParcelizer iconCompatParcelizer) throws Exception {
        AudioAttributesImplApi21Parcelizer();
        read(iconCompatParcelizer);
        RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(kotlin._fromString r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L78
            int r0 = r4.MediaBrowserCompatSearchResultReceiver
            r1 = 1
            int r0 = r0 + r1
            int r2 = r4.MediaMetadataCompat
            if (r0 >= r2) goto L11
            int r0 = r4.MediaDescriptionCompat
            int r0 = r0 + r1
            int r2 = r4.AudioAttributesImplBaseParcelizer
            if (r0 < r2) goto L14
        L11:
            r4.MediaBrowserCompatCustomActionResultReceiver()
        L14:
            boolean r0 = r5.write
            if (r0 != 0) goto L75
            r5.read(r4)
            boolean r0 = r5.IconCompatParcelizer()
            if (r0 != 0) goto L78
            r5.RemoteActionCompatParcelizer()
            boolean r0 = r5.IconCompatParcelizer(r4)
            if (r0 == 0) goto L6c
            o.constructSet r0 = r4.MediaBrowserCompatItemReceiver()
            r5.read = r0
            int r2 = r4.MediaBrowserCompatSearchResultReceiver
            r4.write(r5)
            int r3 = r4.MediaBrowserCompatSearchResultReceiver
            int r2 = r2 + r1
            if (r3 != r2) goto L6c
            o._getToStringLookup$IconCompatParcelizer r2 = r4.onCustomAction
            r2.RemoteActionCompatParcelizer(r5)
            o._getToStringLookup$IconCompatParcelizer r2 = r4.onCustomAction
            r4.read(r2)
            int r2 = r0.read
            r3 = -1
            if (r2 != r3) goto L6d
            o.constructSet r2 = r5.read
            if (r2 != r0) goto L56
            o.constructSet r0 = r5.read(r0)
            if (r0 == 0) goto L56
            r5.RemoteActionCompatParcelizer(r0)
        L56:
            boolean r0 = r5.write
            if (r0 != 0) goto L5f
            o.constructSet r0 = r5.read
            r0.IconCompatParcelizer(r4, r5)
        L5f:
            o.useDefaultValueForUnknownEnum r0 = r4.read
            o.EnumDeserializer1$AudioAttributesCompatParcelizer<o._fromString> r0 = r0.write
            r0.write(r5)
            int r0 = r4.MediaBrowserCompatSearchResultReceiver
            int r0 = r0 - r1
            r4.MediaBrowserCompatSearchResultReceiver = r0
            goto L6d
        L6c:
            r1 = 0
        L6d:
            boolean r0 = r5.AudioAttributesCompatParcelizer()
            if (r0 == 0) goto L78
            if (r1 != 0) goto L78
        L75:
            r4.write(r5)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._getToStringLookup.RemoteActionCompatParcelizer(o._fromString):void");
    }

    private void write(_fromString _fromstring) {
        int i;
        if (_fromstring.write) {
            _fromstring.read.RemoteActionCompatParcelizer(this, _fromstring.RemoteActionCompatParcelizer);
        } else {
            this.RemoteActionCompatParcelizer[this.MediaBrowserCompatSearchResultReceiver] = _fromstring;
            _fromstring.read.read = this.MediaBrowserCompatSearchResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver++;
            _fromstring.read.IconCompatParcelizer(this, _fromstring);
        }
        if (this.write) {
            int i2 = 0;
            while (i2 < this.MediaBrowserCompatSearchResultReceiver) {
                if (this.RemoteActionCompatParcelizer[i2] == null) {
                    System.out.println("WTF");
                }
                _fromString _fromstring2 = this.RemoteActionCompatParcelizer[i2];
                if (_fromstring2 != null && _fromstring2.write) {
                    _fromString _fromstring3 = this.RemoteActionCompatParcelizer[i2];
                    _fromstring3.read.RemoteActionCompatParcelizer(this, _fromstring3.RemoteActionCompatParcelizer);
                    this.read.write.write(_fromstring3);
                    this.RemoteActionCompatParcelizer[i2] = null;
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (true) {
                        i = this.MediaBrowserCompatSearchResultReceiver;
                        if (i3 >= i) {
                            break;
                        }
                        _fromString[] _fromstringArr = this.RemoteActionCompatParcelizer;
                        int i5 = i3 - 1;
                        _fromString _fromstring4 = _fromstringArr[i3];
                        _fromstringArr[i5] = _fromstring4;
                        if (_fromstring4.read.read == i3) {
                            this.RemoteActionCompatParcelizer[i5].read.read = i5;
                        }
                        i4 = i3;
                        i3++;
                    }
                    if (i4 < i) {
                        this.RemoteActionCompatParcelizer[i4] = null;
                    }
                    this.MediaBrowserCompatSearchResultReceiver = i - 1;
                    i2--;
                }
                i2++;
            }
            this.write = false;
        }
    }

    private int read(IconCompatParcelizer iconCompatParcelizer) {
        for (int i = 0; i < this.MediaDescriptionCompat; i++) {
            this.AudioAttributesImplApi21Parcelizer[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= (this.MediaDescriptionCompat << 1)) {
                break;
            }
            if (iconCompatParcelizer.read() != null) {
                this.AudioAttributesImplApi21Parcelizer[iconCompatParcelizer.read().AudioAttributesCompatParcelizer] = true;
            }
            constructSet constructsetIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            if (constructsetIconCompatParcelizer != null) {
                if (this.AudioAttributesImplApi21Parcelizer[constructsetIconCompatParcelizer.AudioAttributesCompatParcelizer]) {
                    break;
                }
                this.AudioAttributesImplApi21Parcelizer[constructsetIconCompatParcelizer.AudioAttributesCompatParcelizer] = true;
            }
            if (constructsetIconCompatParcelizer != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.MediaBrowserCompatSearchResultReceiver; i4++) {
                    _fromString _fromstring = this.RemoteActionCompatParcelizer[i4];
                    if (_fromstring.read.AudioAttributesImplApi26Parcelizer != constructSet.RemoteActionCompatParcelizer.UNRESTRICTED && !_fromstring.write && _fromstring.IconCompatParcelizer(constructsetIconCompatParcelizer)) {
                        float fIconCompatParcelizer = _fromstring.AudioAttributesCompatParcelizer.IconCompatParcelizer(constructsetIconCompatParcelizer);
                        if (fIconCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                            float f2 = (-_fromstring.RemoteActionCompatParcelizer) / fIconCompatParcelizer;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    _fromString _fromstring2 = this.RemoteActionCompatParcelizer[i3];
                    _fromstring2.read.read = -1;
                    _fromstring2.RemoteActionCompatParcelizer(constructsetIconCompatParcelizer);
                    _fromstring2.read.read = i3;
                    _fromstring2.read.IconCompatParcelizer(this, _fromstring2);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    private int AudioAttributesImplApi21Parcelizer() throws Exception {
        for (int i = 0; i < this.MediaBrowserCompatSearchResultReceiver; i++) {
            if (this.RemoteActionCompatParcelizer[i].read.AudioAttributesImplApi26Parcelizer != constructSet.RemoteActionCompatParcelizer.UNRESTRICTED) {
                float f = this.RemoteActionCompatParcelizer[i].RemoteActionCompatParcelizer;
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.MediaBrowserCompatSearchResultReceiver) {
                            _fromString _fromstring = this.RemoteActionCompatParcelizer[i5];
                            if (_fromstring.read.AudioAttributesImplApi26Parcelizer != constructSet.RemoteActionCompatParcelizer.UNRESTRICTED && !_fromstring.write && _fromstring.RemoteActionCompatParcelizer < f2) {
                                int iRemoteActionCompatParcelizer = _fromstring.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                                int i7 = 0;
                                while (i7 < iRemoteActionCompatParcelizer) {
                                    constructSet constructsetWrite = _fromstring.AudioAttributesCompatParcelizer.write(i7);
                                    float fIconCompatParcelizer = _fromstring.AudioAttributesCompatParcelizer.IconCompatParcelizer(constructsetWrite);
                                    if (fIconCompatParcelizer > f2) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = constructsetWrite.AudioAttributesImplApi21Parcelizer[i8] / fIconCompatParcelizer;
                                            if ((f4 < f3 && i8 == i6) || i8 > i6) {
                                                i4 = constructsetWrite.AudioAttributesCompatParcelizer;
                                                f3 = f4;
                                                i6 = i8;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i7++;
                                    f2 = BitmapDescriptorFactory.HUE_RED;
                                }
                            }
                            i5++;
                            f2 = BitmapDescriptorFactory.HUE_RED;
                        }
                        if (i3 != -1) {
                            _fromString _fromstring2 = this.RemoteActionCompatParcelizer[i3];
                            _fromstring2.read.read = -1;
                            _fromstring2.RemoteActionCompatParcelizer(this.read.read[i4]);
                            _fromstring2.read.read = i3;
                            _fromstring2.read.IconCompatParcelizer(this, _fromstring2);
                        } else {
                            z = true;
                        }
                        if (i2 > this.MediaDescriptionCompat / 2) {
                            z = true;
                        }
                        f2 = BitmapDescriptorFactory.HUE_RED;
                    }
                    return i2;
                }
            }
        }
        return 0;
    }

    private void RemoteActionCompatParcelizer() {
        for (int i = 0; i < this.MediaBrowserCompatSearchResultReceiver; i++) {
            _fromString _fromstring = this.RemoteActionCompatParcelizer[i];
            _fromstring.read.RemoteActionCompatParcelizer = _fromstring.RemoteActionCompatParcelizer;
        }
    }

    public final useDefaultValueForUnknownEnum read() {
        return this.read;
    }

    public final void IconCompatParcelizer(constructSet constructset, constructSet constructset2, int i, int i2) {
        _fromString _fromstringWrite = write();
        constructSet constructsetAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        constructsetAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver = 0;
        _fromstringWrite.write(constructset, constructset2, constructsetAudioAttributesImplApi26Parcelizer, i);
        if (i2 != 8) {
            IconCompatParcelizer(_fromstringWrite, (int) (-_fromstringWrite.AudioAttributesCompatParcelizer.IconCompatParcelizer(constructsetAudioAttributesImplApi26Parcelizer)), i2);
        }
        RemoteActionCompatParcelizer(_fromstringWrite);
    }

    public final void read(constructSet constructset, constructSet constructset2, int i) {
        _fromString _fromstringWrite = write();
        constructSet constructsetAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        constructsetAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver = 0;
        _fromstringWrite.write(constructset, constructset2, constructsetAudioAttributesImplApi26Parcelizer, i);
        RemoteActionCompatParcelizer(_fromstringWrite);
    }

    public final void RemoteActionCompatParcelizer(constructSet constructset, constructSet constructset2, int i, int i2) {
        _fromString _fromstringWrite = write();
        constructSet constructsetAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        constructsetAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver = 0;
        _fromstringWrite.RemoteActionCompatParcelizer(constructset, constructset2, constructsetAudioAttributesImplApi26Parcelizer, i);
        if (i2 != 8) {
            IconCompatParcelizer(_fromstringWrite, (int) (-_fromstringWrite.AudioAttributesCompatParcelizer.IconCompatParcelizer(constructsetAudioAttributesImplApi26Parcelizer)), i2);
        }
        RemoteActionCompatParcelizer(_fromstringWrite);
    }

    public final void RemoteActionCompatParcelizer(constructSet constructset, constructSet constructset2, int i) {
        _fromString _fromstringWrite = write();
        constructSet constructsetAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        constructsetAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver = 0;
        _fromstringWrite.RemoteActionCompatParcelizer(constructset, constructset2, constructsetAudioAttributesImplApi26Parcelizer, i);
        RemoteActionCompatParcelizer(_fromstringWrite);
    }

    public final void RemoteActionCompatParcelizer(constructSet constructset, constructSet constructset2, int i, float f, constructSet constructset3, constructSet constructset4, int i2, int i3) {
        _fromString _fromstringWrite = write();
        _fromstringWrite.write(constructset, constructset2, i, f, constructset3, constructset4, i2);
        if (i3 != 8) {
            _fromstringWrite.IconCompatParcelizer(this, i3);
        }
        RemoteActionCompatParcelizer(_fromstringWrite);
    }

    public final void AudioAttributesCompatParcelizer(constructSet constructset, constructSet constructset2, constructSet constructset3, constructSet constructset4, float f) {
        _fromString _fromstringWrite = write();
        _fromstringWrite.write(constructset, constructset2, constructset3, constructset4, f);
        RemoteActionCompatParcelizer(_fromstringWrite);
    }

    public final _fromString read(constructSet constructset, constructSet constructset2, int i, int i2) {
        if (i2 == 8 && constructset2.write && constructset.read == -1) {
            constructset.RemoteActionCompatParcelizer(this, constructset2.RemoteActionCompatParcelizer + i);
            return null;
        }
        _fromString _fromstringWrite = write();
        _fromstringWrite.read(constructset, constructset2, i);
        if (i2 != 8) {
            _fromstringWrite.IconCompatParcelizer(this, i2);
        }
        RemoteActionCompatParcelizer(_fromstringWrite);
        return _fromstringWrite;
    }

    public final void read(constructSet constructset, int i) {
        if (constructset.read == -1) {
            constructset.RemoteActionCompatParcelizer(this, i);
            for (int i2 = 0; i2 < this.onAddQueueItem + 1; i2++) {
                constructSet constructset2 = this.read.read[i2];
                if (constructset2 != null) {
                    boolean z = constructset2.MediaBrowserCompatItemReceiver;
                }
            }
            return;
        }
        int i3 = constructset.read;
        if (constructset.read != -1) {
            _fromString _fromstring = this.RemoteActionCompatParcelizer[i3];
            if (_fromstring.write) {
                _fromstring.RemoteActionCompatParcelizer = i;
                return;
            }
            if (_fromstring.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() == 0) {
                _fromstring.write = true;
                _fromstring.RemoteActionCompatParcelizer = i;
                return;
            } else {
                _fromString _fromstringWrite = write();
                _fromstringWrite.read(constructset, i);
                RemoteActionCompatParcelizer(_fromstringWrite);
                return;
            }
        }
        _fromString _fromstringWrite2 = write();
        _fromstringWrite2.write(constructset, i);
        RemoteActionCompatParcelizer(_fromstringWrite2);
    }

    public static _fromString write(_getToStringLookup _gettostringlookup, constructSet constructset, constructSet constructset2, float f) {
        return _gettostringlookup.write().write(constructset, constructset2, f);
    }

    public final void read(JdkDeserializers jdkDeserializers, JdkDeserializers jdkDeserializers2, float f, int i) {
        constructSet constructsetRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jdkDeserializers.write(_int.read.LEFT));
        constructSet constructsetRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jdkDeserializers.write(_int.read.TOP));
        constructSet constructsetRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(jdkDeserializers.write(_int.read.RIGHT));
        constructSet constructsetRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(jdkDeserializers.write(_int.read.BOTTOM));
        constructSet constructsetRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(jdkDeserializers2.write(_int.read.LEFT));
        constructSet constructsetRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(jdkDeserializers2.write(_int.read.TOP));
        constructSet constructsetRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer(jdkDeserializers2.write(_int.read.RIGHT));
        constructSet constructsetRemoteActionCompatParcelizer8 = RemoteActionCompatParcelizer(jdkDeserializers2.write(_int.read.BOTTOM));
        _fromString _fromstringWrite = write();
        double d = f;
        double d2 = i;
        _fromstringWrite.IconCompatParcelizer(constructsetRemoteActionCompatParcelizer2, constructsetRemoteActionCompatParcelizer4, constructsetRemoteActionCompatParcelizer6, constructsetRemoteActionCompatParcelizer8, (float) (Math.sin(d) * d2));
        RemoteActionCompatParcelizer(_fromstringWrite);
        _fromString _fromstringWrite2 = write();
        _fromstringWrite2.IconCompatParcelizer(constructsetRemoteActionCompatParcelizer, constructsetRemoteActionCompatParcelizer3, constructsetRemoteActionCompatParcelizer5, constructsetRemoteActionCompatParcelizer7, (float) (Math.cos(d) * d2));
        RemoteActionCompatParcelizer(_fromstringWrite2);
    }
}
