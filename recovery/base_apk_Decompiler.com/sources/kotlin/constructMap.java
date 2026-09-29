package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Comparator;
import kotlin._fromString;

/* JADX INFO: loaded from: classes2.dex */
public final class constructMap extends _fromString {
    private int AudioAttributesImplApi21Parcelizer;
    private constructSet[] AudioAttributesImplApi26Parcelizer;
    private constructSet[] AudioAttributesImplBaseParcelizer;
    private useDefaultValueForUnknownEnum MediaBrowserCompatCustomActionResultReceiver;
    private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatSearchResultReceiver;

    class AudioAttributesCompatParcelizer {
        private constructSet AudioAttributesCompatParcelizer;
        private constructMap write;

        AudioAttributesCompatParcelizer(constructMap constructmap) {
            this.write = constructmap;
        }

        public final void RemoteActionCompatParcelizer(constructSet constructset) {
            this.AudioAttributesCompatParcelizer = constructset;
        }

        public final boolean IconCompatParcelizer(constructSet constructset, float f) {
            boolean z = true;
            if (!this.AudioAttributesCompatParcelizer.IconCompatParcelizer) {
                for (int i = 0; i < 9; i++) {
                    float f2 = constructset.AudioAttributesImplBaseParcelizer[i];
                    if (f2 != BitmapDescriptorFactory.HUE_RED) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer[i] = f3;
                    } else {
                        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
                fArr[i2] = fArr[i2] + (constructset.AudioAttributesImplBaseParcelizer[i2] * f);
                if (Math.abs(this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer[i2]) < 1.0E-4f) {
                    this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                constructMap.this.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
            }
            return false;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            for (int i = 8; i >= 0; i--) {
                float f = this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer[i];
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
            return false;
        }

        public final boolean AudioAttributesCompatParcelizer(constructSet constructset) {
            for (int i = 8; i >= 0; i--) {
                float f = constructset.AudioAttributesImplBaseParcelizer[i];
                float f2 = this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer[i];
                if (f2 != f) {
                    return f2 < f;
                }
            }
            return false;
        }

        public final void IconCompatParcelizer() {
            Arrays.fill(this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, BitmapDescriptorFactory.HUE_RED);
        }

        public final String toString() {
            String string = "[ ";
            if (this.AudioAttributesCompatParcelizer != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer[i]);
                    sb.append(" ");
                    string = sb.toString();
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("] ");
            sb2.append(this.AudioAttributesCompatParcelizer);
            return sb2.toString();
        }
    }

    @Override // kotlin._fromString, o._getToStringLookup.IconCompatParcelizer
    public final void write() {
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public constructMap(useDefaultValueForUnknownEnum usedefaultvalueforunknownenum) {
        super(usedefaultvalueforunknownenum);
        this.MediaBrowserCompatSearchResultReceiver = 128;
        this.AudioAttributesImplBaseParcelizer = new constructSet[128];
        this.AudioAttributesImplApi26Parcelizer = new constructSet[128];
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatItemReceiver = new AudioAttributesCompatParcelizer(this);
        this.MediaBrowserCompatCustomActionResultReceiver = usedefaultvalueforunknownenum;
    }

    @Override // kotlin._fromString, o._getToStringLookup.IconCompatParcelizer
    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // kotlin._fromString, o._getToStringLookup.IconCompatParcelizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.constructSet IconCompatParcelizer(boolean[] r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -1
            r2 = r1
        L3:
            int r3 = r5.AudioAttributesImplApi21Parcelizer
            if (r0 >= r3) goto L32
            o.constructSet[] r3 = r5.AudioAttributesImplBaseParcelizer
            r3 = r3[r0]
            int r4 = r3.AudioAttributesCompatParcelizer
            boolean r4 = r6[r4]
            if (r4 == 0) goto L12
            goto L2f
        L12:
            o.constructMap$AudioAttributesCompatParcelizer r4 = r5.MediaBrowserCompatItemReceiver
            r4.RemoteActionCompatParcelizer(r3)
            if (r2 != r1) goto L22
            o.constructMap$AudioAttributesCompatParcelizer r3 = r5.MediaBrowserCompatItemReceiver
            boolean r3 = r3.AudioAttributesCompatParcelizer()
            if (r3 == 0) goto L2f
            goto L2e
        L22:
            o.constructMap$AudioAttributesCompatParcelizer r3 = r5.MediaBrowserCompatItemReceiver
            o.constructSet[] r4 = r5.AudioAttributesImplBaseParcelizer
            r4 = r4[r2]
            boolean r3 = r3.AudioAttributesCompatParcelizer(r4)
            if (r3 == 0) goto L2f
        L2e:
            r2 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r2 != r1) goto L36
            r5 = 0
            return r5
        L36:
            o.constructSet[] r5 = r5.AudioAttributesImplBaseParcelizer
            r5 = r5[r2]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.constructMap.IconCompatParcelizer(boolean[]):o.constructSet");
    }

    @Override // kotlin._fromString, o._getToStringLookup.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(constructSet constructset) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(constructset);
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        constructset.AudioAttributesImplBaseParcelizer[constructset.MediaBrowserCompatCustomActionResultReceiver] = 1.0f;
        write(constructset);
    }

    private void write(constructSet constructset) {
        int i;
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        constructSet[] constructsetArr = this.AudioAttributesImplBaseParcelizer;
        if (i2 + 1 > constructsetArr.length) {
            constructSet[] constructsetArr2 = (constructSet[]) Arrays.copyOf(constructsetArr, constructsetArr.length << 1);
            this.AudioAttributesImplBaseParcelizer = constructsetArr2;
            this.AudioAttributesImplApi26Parcelizer = (constructSet[]) Arrays.copyOf(constructsetArr2, constructsetArr2.length << 1);
        }
        constructSet[] constructsetArr3 = this.AudioAttributesImplBaseParcelizer;
        int i3 = this.AudioAttributesImplApi21Parcelizer;
        constructsetArr3[i3] = constructset;
        int i4 = i3 + 1;
        this.AudioAttributesImplApi21Parcelizer = i4;
        if (i4 > 1 && constructset.AudioAttributesCompatParcelizer > constructset.AudioAttributesCompatParcelizer) {
            int i5 = 0;
            while (true) {
                i = this.AudioAttributesImplApi21Parcelizer;
                if (i5 >= i) {
                    break;
                }
                this.AudioAttributesImplApi26Parcelizer[i5] = this.AudioAttributesImplBaseParcelizer[i5];
                i5++;
            }
            Arrays.sort(this.AudioAttributesImplApi26Parcelizer, 0, i, new Comparator<constructSet>() { // from class: o.constructMap.3
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(constructSet constructset2, constructSet constructset3) {
                    return read(constructset2, constructset3);
                }

                private static int read(constructSet constructset2, constructSet constructset3) {
                    return constructset2.AudioAttributesCompatParcelizer - constructset3.AudioAttributesCompatParcelizer;
                }
            });
            for (int i6 = 0; i6 < this.AudioAttributesImplApi21Parcelizer; i6++) {
                this.AudioAttributesImplBaseParcelizer[i6] = this.AudioAttributesImplApi26Parcelizer[i6];
            }
        }
        constructset.IconCompatParcelizer = true;
        constructset.read(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi21Parcelizer(constructSet constructset) {
        int i = 0;
        while (i < this.AudioAttributesImplApi21Parcelizer) {
            if (this.AudioAttributesImplBaseParcelizer[i] == constructset) {
                while (true) {
                    int i2 = this.AudioAttributesImplApi21Parcelizer - 1;
                    if (i < i2) {
                        constructSet[] constructsetArr = this.AudioAttributesImplBaseParcelizer;
                        int i3 = i + 1;
                        constructsetArr[i] = constructsetArr[i3];
                        i = i3;
                    } else {
                        this.AudioAttributesImplApi21Parcelizer = i2;
                        constructset.IconCompatParcelizer = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // kotlin._fromString
    public final void write(_getToStringLookup _gettostringlookup, _fromString _fromstring, boolean z) {
        constructSet constructset = _fromstring.read;
        if (constructset == null) {
            return;
        }
        _fromString.RemoteActionCompatParcelizer remoteActionCompatParcelizer = _fromstring.AudioAttributesCompatParcelizer;
        int iRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            constructSet constructsetWrite = remoteActionCompatParcelizer.write(i);
            float fRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(constructsetWrite);
            if (this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(constructset, fRemoteActionCompatParcelizer)) {
                write(constructsetWrite);
            }
            this.RemoteActionCompatParcelizer += _fromstring.RemoteActionCompatParcelizer * fRemoteActionCompatParcelizer;
        }
        AudioAttributesImplApi21Parcelizer(constructset);
    }

    @Override // kotlin._fromString
    public final String toString() {
        StringBuilder sb = new StringBuilder(" goal -> (");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(") : ");
        String string = sb.toString();
        for (int i = 0; i < this.AudioAttributesImplApi21Parcelizer; i++) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer[i]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(this.MediaBrowserCompatItemReceiver);
            sb2.append(" ");
            string = sb2.toString();
        }
        return string;
    }
}
