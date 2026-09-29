package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin._getToStringLookup;
import kotlin.constructSet;

/* JADX INFO: loaded from: classes2.dex */
public class _fromString implements _getToStringLookup.IconCompatParcelizer {
    public RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    constructSet read = null;
    float RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    boolean IconCompatParcelizer = false;
    private ArrayList<constructSet> AudioAttributesImplApi26Parcelizer = new ArrayList<>();
    boolean write = false;

    public interface RemoteActionCompatParcelizer {
        float AudioAttributesCompatParcelizer(_fromString _fromstring, boolean z);

        float AudioAttributesCompatParcelizer(constructSet constructset, boolean z);

        void AudioAttributesCompatParcelizer();

        float IconCompatParcelizer(constructSet constructset);

        float RemoteActionCompatParcelizer(int i);

        int RemoteActionCompatParcelizer();

        void RemoteActionCompatParcelizer(float f);

        void read(constructSet constructset, float f);

        constructSet write(int i);

        void write();

        void write(constructSet constructset, float f, boolean z);

        boolean write(constructSet constructset);
    }

    public _fromString() {
    }

    public _fromString(useDefaultValueForUnknownEnum usedefaultvalueforunknownenum) {
        this.AudioAttributesCompatParcelizer = new _resolveCurrentLookup(this, usedefaultvalueforunknownenum);
    }

    final boolean AudioAttributesCompatParcelizer() {
        constructSet constructset = this.read;
        if (constructset != null) {
            return constructset.AudioAttributesImplApi26Parcelizer == constructSet.RemoteActionCompatParcelizer.UNRESTRICTED || this.RemoteActionCompatParcelizer >= BitmapDescriptorFactory.HUE_RED;
        }
        return false;
    }

    public String toString() {
        return MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String MediaBrowserCompatCustomActionResultReceiver() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._fromString.MediaBrowserCompatCustomActionResultReceiver():java.lang.String");
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.read = null;
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.write = false;
    }

    final boolean IconCompatParcelizer(constructSet constructset) {
        return this.AudioAttributesCompatParcelizer.write(constructset);
    }

    final _fromString write(constructSet constructset, int i) {
        this.read = constructset;
        float f = i;
        constructset.RemoteActionCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f;
        this.write = true;
        return this;
    }

    public final _fromString read(constructSet constructset, int i) {
        if (i < 0) {
            this.RemoteActionCompatParcelizer = -i;
            this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
            return this;
        }
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer.read(constructset, -1.0f);
        return this;
    }

    public final _fromString read(constructSet constructset, constructSet constructset2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.RemoteActionCompatParcelizer = i;
            if (z) {
                this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
                this.AudioAttributesCompatParcelizer.read(constructset2, -1.0f);
                return this;
            }
        }
        this.AudioAttributesCompatParcelizer.read(constructset, -1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset2, 1.0f);
        return this;
    }

    final _fromString RemoteActionCompatParcelizer(constructSet constructset, int i) {
        this.AudioAttributesCompatParcelizer.read(constructset, i);
        return this;
    }

    public final _fromString write(constructSet constructset, constructSet constructset2, constructSet constructset3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.RemoteActionCompatParcelizer = i;
            if (z) {
                this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
                this.AudioAttributesCompatParcelizer.read(constructset2, -1.0f);
                this.AudioAttributesCompatParcelizer.read(constructset3, -1.0f);
                return this;
            }
        }
        this.AudioAttributesCompatParcelizer.read(constructset, -1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset2, 1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset3, 1.0f);
        return this;
    }

    public final _fromString RemoteActionCompatParcelizer(constructSet constructset, constructSet constructset2, constructSet constructset3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.RemoteActionCompatParcelizer = i;
            if (z) {
                this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
                this.AudioAttributesCompatParcelizer.read(constructset2, -1.0f);
                this.AudioAttributesCompatParcelizer.read(constructset3, 1.0f);
                return this;
            }
        }
        this.AudioAttributesCompatParcelizer.read(constructset, -1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset2, 1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset3, -1.0f);
        return this;
    }

    public final _fromString read(float f, float f2, float f3, constructSet constructset, constructSet constructset2, constructSet constructset3, constructSet constructset4) {
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        if (f2 == BitmapDescriptorFactory.HUE_RED || f == f3) {
            this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset2, -1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset4, 1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset3, -1.0f);
            return this;
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset2, -1.0f);
            return this;
        }
        if (f3 == BitmapDescriptorFactory.HUE_RED) {
            this.AudioAttributesCompatParcelizer.read(constructset3, 1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset4, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset2, -1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset4, f4);
        this.AudioAttributesCompatParcelizer.read(constructset3, -f4);
        return this;
    }

    final _fromString write(constructSet constructset, constructSet constructset2, int i, float f, constructSet constructset3, constructSet constructset4, int i2) {
        if (constructset2 == constructset3) {
            this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset4, 1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.AudioAttributesCompatParcelizer.read(constructset, 1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset2, -1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset3, -1.0f);
            this.AudioAttributesCompatParcelizer.read(constructset4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.RemoteActionCompatParcelizer = (-i) + i2;
                return this;
            }
        } else {
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                this.AudioAttributesCompatParcelizer.read(constructset, -1.0f);
                this.AudioAttributesCompatParcelizer.read(constructset2, 1.0f);
                this.RemoteActionCompatParcelizer = i;
                return this;
            }
            if (f >= 1.0f) {
                this.AudioAttributesCompatParcelizer.read(constructset4, -1.0f);
                this.AudioAttributesCompatParcelizer.read(constructset3, 1.0f);
                this.RemoteActionCompatParcelizer = -i2;
                return this;
            }
            float f2 = 1.0f - f;
            this.AudioAttributesCompatParcelizer.read(constructset, f2);
            this.AudioAttributesCompatParcelizer.read(constructset2, -f2);
            this.AudioAttributesCompatParcelizer.read(constructset3, (-1.0f) * f);
            this.AudioAttributesCompatParcelizer.read(constructset4, f);
            if (i > 0 || i2 > 0) {
                this.RemoteActionCompatParcelizer = ((-i) * f2) + (i2 * f);
                return this;
            }
        }
        return this;
    }

    public final _fromString IconCompatParcelizer(_getToStringLookup _gettostringlookup, int i) {
        this.AudioAttributesCompatParcelizer.read(_gettostringlookup.write(i, "ep"), 1.0f);
        this.AudioAttributesCompatParcelizer.read(_gettostringlookup.write(i, "em"), -1.0f);
        return this;
    }

    final _fromString write(constructSet constructset, constructSet constructset2, float f) {
        this.AudioAttributesCompatParcelizer.read(constructset, -1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset2, f);
        return this;
    }

    public final _fromString write(constructSet constructset, constructSet constructset2, constructSet constructset3, constructSet constructset4, float f) {
        this.AudioAttributesCompatParcelizer.read(constructset, -1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset2, 1.0f);
        this.AudioAttributesCompatParcelizer.read(constructset3, f);
        this.AudioAttributesCompatParcelizer.read(constructset4, -f);
        return this;
    }

    public final _fromString IconCompatParcelizer(constructSet constructset, constructSet constructset2, constructSet constructset3, constructSet constructset4, float f) {
        this.AudioAttributesCompatParcelizer.read(constructset3, 0.5f);
        this.AudioAttributesCompatParcelizer.read(constructset4, 0.5f);
        this.AudioAttributesCompatParcelizer.read(constructset, -0.5f);
        this.AudioAttributesCompatParcelizer.read(constructset2, -0.5f);
        this.RemoteActionCompatParcelizer = -f;
        return this;
    }

    final void RemoteActionCompatParcelizer() {
        float f = this.RemoteActionCompatParcelizer;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            this.RemoteActionCompatParcelizer = -f;
            this.AudioAttributesCompatParcelizer.write();
        }
    }

    final boolean IconCompatParcelizer(_getToStringLookup _gettostringlookup) {
        boolean z;
        constructSet constructsetAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (constructsetAudioAttributesImplApi26Parcelizer == null) {
            z = true;
        } else {
            RemoteActionCompatParcelizer(constructsetAudioAttributesImplApi26Parcelizer);
            z = false;
        }
        if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() == 0) {
            this.write = true;
        }
        return z;
    }

    private constructSet AudioAttributesImplApi26Parcelizer() {
        int iRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        constructSet constructset = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        constructSet constructset2 = null;
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            float fRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
            constructSet constructsetWrite = this.AudioAttributesCompatParcelizer.write(i);
            if (constructsetWrite.AudioAttributesImplApi26Parcelizer == constructSet.RemoteActionCompatParcelizer.UNRESTRICTED) {
                if (constructset == null || f > fRemoteActionCompatParcelizer) {
                    boolean zWrite = write(constructsetWrite);
                    z = zWrite;
                    f = fRemoteActionCompatParcelizer;
                    constructset = constructsetWrite;
                } else if (!z && write(constructsetWrite)) {
                    f = fRemoteActionCompatParcelizer;
                    constructset = constructsetWrite;
                    z = true;
                }
            } else if (constructset == null && fRemoteActionCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                if (constructset2 == null || f2 > fRemoteActionCompatParcelizer) {
                    boolean zWrite2 = write(constructsetWrite);
                    z2 = zWrite2;
                    f2 = fRemoteActionCompatParcelizer;
                    constructset2 = constructsetWrite;
                } else if (!z2 && write(constructsetWrite)) {
                    f2 = fRemoteActionCompatParcelizer;
                    constructset2 = constructsetWrite;
                    z2 = true;
                }
            }
        }
        return constructset != null ? constructset : constructset2;
    }

    private static boolean write(constructSet constructset) {
        return constructset.MediaMetadataCompat <= 1;
    }

    final void RemoteActionCompatParcelizer(constructSet constructset) {
        constructSet constructset2 = this.read;
        if (constructset2 != null) {
            this.AudioAttributesCompatParcelizer.read(constructset2, -1.0f);
            this.read.read = -1;
            this.read = null;
        }
        float f = -this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(constructset, true);
        this.read = constructset;
        if (f == 1.0f) {
            return;
        }
        this.RemoteActionCompatParcelizer /= f;
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(f);
    }

    @Override // o._getToStringLookup.IconCompatParcelizer
    public boolean IconCompatParcelizer() {
        return this.read == null && this.RemoteActionCompatParcelizer == BitmapDescriptorFactory.HUE_RED && this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() == 0;
    }

    public void write(_getToStringLookup _gettostringlookup, _fromString _fromstring, boolean z) {
        this.RemoteActionCompatParcelizer += _fromstring.RemoteActionCompatParcelizer * this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_fromstring, z);
        if (z) {
            _fromstring.read.AudioAttributesCompatParcelizer(this);
        }
        if (this.read == null || this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() != 0) {
            return;
        }
        this.write = true;
        _gettostringlookup.write = true;
    }

    public final void RemoteActionCompatParcelizer(_getToStringLookup _gettostringlookup, constructSet constructset, boolean z) {
        if (constructset == null || !constructset.write) {
            return;
        }
        this.RemoteActionCompatParcelizer += constructset.RemoteActionCompatParcelizer * this.AudioAttributesCompatParcelizer.IconCompatParcelizer(constructset);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(constructset, z);
        if (z) {
            constructset.AudioAttributesCompatParcelizer(this);
        }
        if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() == 0) {
            this.write = true;
            _gettostringlookup.write = true;
        }
    }

    private constructSet write(boolean[] zArr, constructSet constructset) {
        int iRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        constructSet constructset2 = null;
        float f = 0.0f;
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            float fRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
            if (fRemoteActionCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                constructSet constructsetWrite = this.AudioAttributesCompatParcelizer.write(i);
                if ((zArr == null || !zArr[constructsetWrite.AudioAttributesCompatParcelizer]) && constructsetWrite != constructset && ((constructsetWrite.AudioAttributesImplApi26Parcelizer == constructSet.RemoteActionCompatParcelizer.SLACK || constructsetWrite.AudioAttributesImplApi26Parcelizer == constructSet.RemoteActionCompatParcelizer.ERROR) && fRemoteActionCompatParcelizer < f)) {
                    f = fRemoteActionCompatParcelizer;
                    constructset2 = constructsetWrite;
                }
            }
        }
        return constructset2;
    }

    public final constructSet read(constructSet constructset) {
        return write((boolean[]) null, constructset);
    }

    @Override // o._getToStringLookup.IconCompatParcelizer
    public constructSet IconCompatParcelizer(boolean[] zArr) {
        return write(zArr, (constructSet) null);
    }

    @Override // o._getToStringLookup.IconCompatParcelizer
    public void write() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        this.read = null;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // o._getToStringLookup.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(_getToStringLookup.IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer instanceof _fromString) {
            _fromString _fromstring = (_fromString) iconCompatParcelizer;
            this.read = null;
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            for (int i = 0; i < _fromstring.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(); i++) {
                this.AudioAttributesCompatParcelizer.write(_fromstring.AudioAttributesCompatParcelizer.write(i), _fromstring.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i), true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    @Override // o._getToStringLookup.IconCompatParcelizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AudioAttributesCompatParcelizer(kotlin.constructSet r3) {
        /*
            r2 = this;
            int r0 = r3.MediaBrowserCompatCustomActionResultReceiver
            r1 = 1
            if (r0 == r1) goto L28
            int r0 = r3.MediaBrowserCompatCustomActionResultReceiver
            r1 = 2
            if (r0 != r1) goto Ld
            r0 = 1148846080(0x447a0000, float:1000.0)
            goto L2a
        Ld:
            int r0 = r3.MediaBrowserCompatCustomActionResultReceiver
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 1232348160(0x49742400, float:1000000.0)
            goto L2a
        L16:
            int r0 = r3.MediaBrowserCompatCustomActionResultReceiver
            r1 = 4
            if (r0 != r1) goto L1f
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L2a
        L1f:
            int r0 = r3.MediaBrowserCompatCustomActionResultReceiver
            r1 = 5
            if (r0 != r1) goto L28
            r0 = 1399379109(0x5368d4a5, float:1.0E12)
            goto L2a
        L28:
            r0 = 1065353216(0x3f800000, float:1.0)
        L2a:
            o._fromString$RemoteActionCompatParcelizer r2 = r2.AudioAttributesCompatParcelizer
            r2.read(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._fromString.AudioAttributesCompatParcelizer(o.constructSet):void");
    }

    @Override // o._getToStringLookup.IconCompatParcelizer
    public final constructSet read() {
        return this.read;
    }

    public final void read(_getToStringLookup _gettostringlookup) {
        if (_gettostringlookup.RemoteActionCompatParcelizer.length != 0) {
            boolean z = false;
            while (!z) {
                int iRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
                    constructSet constructsetWrite = this.AudioAttributesCompatParcelizer.write(i);
                    if (constructsetWrite.read != -1 || constructsetWrite.write) {
                        this.AudioAttributesImplApi26Parcelizer.add(constructsetWrite);
                    } else {
                        boolean z2 = constructsetWrite.MediaBrowserCompatItemReceiver;
                    }
                }
                int size = this.AudioAttributesImplApi26Parcelizer.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        constructSet constructset = this.AudioAttributesImplApi26Parcelizer.get(i2);
                        if (constructset.write) {
                            RemoteActionCompatParcelizer(_gettostringlookup, constructset, true);
                        } else {
                            boolean z3 = constructset.MediaBrowserCompatItemReceiver;
                            write(_gettostringlookup, _gettostringlookup.RemoteActionCompatParcelizer[constructset.read], true);
                        }
                    }
                    this.AudioAttributesImplApi26Parcelizer.clear();
                } else {
                    z = true;
                }
            }
            if (this.read == null || this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() != 0) {
                return;
            }
            this.write = true;
            _gettostringlookup.write = true;
        }
    }
}
