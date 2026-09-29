package kotlin;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.of;

/* JADX INFO: loaded from: classes4.dex */
public final class getRawType implements of.write {
    private final of AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final ArrayList<getAnnotated> MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
    private _verifyEndArrayForSingle write = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
    private _verifyEndArrayForSingle read = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;

    public getRawType(of ofVar, List<getAnnotated> list) {
        read(list, false);
        read(list, true);
        ofVar.AudioAttributesCompatParcelizer(this);
        this.AudioAttributesCompatParcelizer = ofVar;
    }

    private void read(List<getAnnotated> list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            getAnnotated getannotated = list.get(i);
            if (getAnnotated.IconCompatParcelizer() == z) {
                Object objAudioAttributesCompatParcelizer = getannotated.AudioAttributesCompatParcelizer();
                if (objAudioAttributesCompatParcelizer == null) {
                    getannotated.AudioAttributesCompatParcelizer(this);
                    this.MediaBrowserCompatCustomActionResultReceiver.add(getannotated);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getannotated);
                    sb.append(" is already controlled by ");
                    sb.append(objAudioAttributesCompatParcelizer);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        _verifyEndArrayForSingle _verifyendarrayforsingleRemoteActionCompatParcelizer = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        for (int size = this.MediaBrowserCompatCustomActionResultReceiver.size() - 1; size >= 0; size--) {
            _verifyendarrayforsingleRemoteActionCompatParcelizer = _verifyEndArrayForSingle.RemoteActionCompatParcelizer(_verifyendarrayforsingleRemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver.get(size).read(this.write, this.read, _verifyendarrayforsingleRemoteActionCompatParcelizer));
        }
    }

    @Override // o.of.write
    public final void AudioAttributesCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle, _verifyEndArrayForSingle _verifyendarrayforsingle2) {
        this.write = _verifyendarrayforsingle;
        this.read = _verifyendarrayforsingle2;
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // o.of.write
    public final void read() {
        for (int size = this.MediaBrowserCompatCustomActionResultReceiver.size() - 1; size >= 0; size--) {
            this.MediaBrowserCompatCustomActionResultReceiver.get(size);
        }
    }

    @Override // o.of.write
    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer++;
    }

    @Override // o.of.write
    public final void write(int i, _verifyEndArrayForSingle _verifyendarrayforsingle, RectF rectF) {
        _verifyEndArrayForSingle _verifyendarrayforsingle2 = this.read;
        for (int size = this.MediaBrowserCompatCustomActionResultReceiver.size() - 1; size >= 0; size--) {
            getAnnotated getannotated = this.MediaBrowserCompatCustomActionResultReceiver.get(size);
            int iWrite = getannotated.write();
            if ((iWrite & i) != 0) {
                getannotated.IconCompatParcelizer(true);
                if (iWrite == 1) {
                    if (_verifyendarrayforsingle2.read > 0) {
                        getannotated.write(_verifyendarrayforsingle.read / _verifyendarrayforsingle2.read);
                    }
                    getannotated.read(rectF.left);
                } else if (iWrite == 2) {
                    if (_verifyendarrayforsingle2.write > 0) {
                        getannotated.write(_verifyendarrayforsingle.write / _verifyendarrayforsingle2.write);
                    }
                    getannotated.read(rectF.top);
                } else if (iWrite == 4) {
                    if (_verifyendarrayforsingle2.IconCompatParcelizer > 0) {
                        getannotated.write(_verifyendarrayforsingle.IconCompatParcelizer / _verifyendarrayforsingle2.IconCompatParcelizer);
                    }
                    getannotated.read(rectF.right);
                } else if (iWrite == 8) {
                    if (_verifyendarrayforsingle2.AudioAttributesCompatParcelizer > 0) {
                        getannotated.write(_verifyendarrayforsingle.AudioAttributesCompatParcelizer / _verifyendarrayforsingle2.AudioAttributesCompatParcelizer);
                    }
                    getannotated.read(rectF.bottom);
                }
            }
        }
    }

    @Override // o.of.write
    public final void AudioAttributesCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        boolean z = i > 0;
        int i2 = i - 1;
        this.IconCompatParcelizer = i2;
        if (z && i2 == 0) {
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.size();
    }

    public final getAnnotated write(int i) {
        return this.MediaBrowserCompatCustomActionResultReceiver.get(i);
    }

    public final void write() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
        for (int size = this.MediaBrowserCompatCustomActionResultReceiver.size() - 1; size >= 0; size--) {
            this.MediaBrowserCompatCustomActionResultReceiver.get(size).AudioAttributesCompatParcelizer(null);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.clear();
    }
}
