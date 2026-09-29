package kotlin;

import android.graphics.drawable.Drawable;
import android.view.animation.PathInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getAnnotated {
    private _verifyEndArrayForSingle AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private _verifyEndArrayForSingle IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private final IconCompatParcelizer RemoteActionCompatParcelizer;
    private Object read;
    private final int write;

    static boolean IconCompatParcelizer() {
        return false;
    }

    private static int RemoteActionCompatParcelizer(int i) {
        return i;
    }

    static {
        new PathInterpolator(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        new PathInterpolator(0.6f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        new PathInterpolator(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
        new PathInterpolator(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
    }

    public final int write() {
        return this.write;
    }

    public final IconCompatParcelizer RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    final _verifyEndArrayForSingle read(_verifyEndArrayForSingle _verifyendarrayforsingle, _verifyEndArrayForSingle _verifyendarrayforsingle2, _verifyEndArrayForSingle _verifyendarrayforsingle3) {
        this.IconCompatParcelizer = _verifyendarrayforsingle;
        this.AudioAttributesCompatParcelizer = _verifyendarrayforsingle2;
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(_verifyendarrayforsingle3);
        return MediaBrowserCompatCustomActionResultReceiver();
    }

    private _verifyEndArrayForSingle MediaBrowserCompatCustomActionResultReceiver() {
        int i;
        _verifyEndArrayForSingle _verifyendarrayforsingle = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        int i2 = this.write;
        if (i2 == 1) {
            i = this.IconCompatParcelizer.read;
            this.RemoteActionCompatParcelizer.write(RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.read));
        } else if (i2 == 2) {
            i = this.IconCompatParcelizer.write;
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.write));
        } else if (i2 == 4) {
            i = this.IconCompatParcelizer.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer.write(RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer));
        } else if (i2 != 8) {
            i = 0;
        } else {
            i = this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer));
        }
        IconCompatParcelizer(i > 0);
        read(i > 0 ? 1.0f : 0.0f);
        write(i <= 0 ? 0.0f : 1.0f);
        return _verifyendarrayforsingle;
    }

    final Object AudioAttributesCompatParcelizer() {
        return this.read;
    }

    final void AudioAttributesCompatParcelizer(Object obj) {
        this.read = obj;
    }

    final void IconCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.write(z);
    }

    final void read(float f) {
        this.AudioAttributesImplApi26Parcelizer = f;
        read();
    }

    private void read() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer * this.AudioAttributesImplApi21Parcelizer);
    }

    final void write(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        float f = this.AudioAttributesImplBaseParcelizer * this.MediaBrowserCompatCustomActionResultReceiver;
        int i = this.write;
        if (i == 1) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((-(1.0f - f)) * r4.MediaBrowserCompatItemReceiver);
            return;
        }
        if (i == 2) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer((-(1.0f - f)) * r4.read);
        } else if (i == 4) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((1.0f - f) * r4.MediaBrowserCompatItemReceiver);
        } else {
            if (i != 8) {
                return;
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer((1.0f - f) * r4.read);
        }
    }

    public static class IconCompatParcelizer {
        private read AudioAttributesCompatParcelizer;
        private int MediaBrowserCompatItemReceiver = -1;
        private int read = -1;
        private _verifyEndArrayForSingle write = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        private boolean AudioAttributesImplApi26Parcelizer = false;
        private Drawable RemoteActionCompatParcelizer = null;
        private float MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        private float AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        private float IconCompatParcelizer = 1.0f;

        public interface read {
            default void AudioAttributesCompatParcelizer(float f) {
            }

            default void IconCompatParcelizer(int i) {
            }

            default void RemoteActionCompatParcelizer(int i) {
            }

            default void RemoteActionCompatParcelizer(boolean z) {
            }

            default void read(float f) {
            }

            default void read(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            }

            default void write(float f) {
            }
        }

        IconCompatParcelizer() {
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final int read() {
            return this.read;
        }

        public final _verifyEndArrayForSingle RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final boolean AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final Drawable write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final float IconCompatParcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final float MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final float AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(int i) {
            if (this.MediaBrowserCompatItemReceiver != i) {
                this.MediaBrowserCompatItemReceiver = i;
                read readVar = this.AudioAttributesCompatParcelizer;
                if (readVar != null) {
                    readVar.IconCompatParcelizer(i);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IconCompatParcelizer(int i) {
            if (this.read != i) {
                this.read = i;
                read readVar = this.AudioAttributesCompatParcelizer;
                if (readVar != null) {
                    readVar.RemoteActionCompatParcelizer(i);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void RemoteActionCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            if (this.write.equals(_verifyendarrayforsingle)) {
                return;
            }
            this.write = _verifyendarrayforsingle;
            read readVar = this.AudioAttributesCompatParcelizer;
            if (readVar != null) {
                readVar.read(_verifyendarrayforsingle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(boolean z) {
            if (this.AudioAttributesImplApi26Parcelizer != z) {
                this.AudioAttributesImplApi26Parcelizer = z;
                read readVar = this.AudioAttributesCompatParcelizer;
                if (readVar != null) {
                    readVar.RemoteActionCompatParcelizer(z);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void RemoteActionCompatParcelizer(float f) {
            if (this.MediaBrowserCompatCustomActionResultReceiver != f) {
                this.MediaBrowserCompatCustomActionResultReceiver = f;
                read readVar = this.AudioAttributesCompatParcelizer;
                if (readVar != null) {
                    readVar.write(f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IconCompatParcelizer(float f) {
            if (this.AudioAttributesImplBaseParcelizer != f) {
                this.AudioAttributesImplBaseParcelizer = f;
                read readVar = this.AudioAttributesCompatParcelizer;
                if (readVar != null) {
                    readVar.AudioAttributesCompatParcelizer(f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(float f) {
            if (this.IconCompatParcelizer != f) {
                this.IconCompatParcelizer = f;
                read readVar = this.AudioAttributesCompatParcelizer;
                if (readVar != null) {
                    readVar.read(f);
                }
            }
        }

        public final void read(read readVar) {
            if (this.AudioAttributesCompatParcelizer != null && readVar != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.AudioAttributesCompatParcelizer = readVar;
        }
    }
}
