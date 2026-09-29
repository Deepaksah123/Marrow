package kotlin;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.exoplayer2.PlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class FlacStreamMetadata {
    private final read RemoteActionCompatParcelizer;
    private final View read;
    private final readStreamInfoBlock write;

    interface read {
        void RemoteActionCompatParcelizer(readStreamInfoBlock readstreaminfoblock, View view, boolean z);

        void write(View view);
    }

    public <T extends View & readStreamInfoBlock> FlacStreamMetadata(T t) {
        this(t, t);
    }

    public FlacStreamMetadata(readStreamInfoBlock readstreaminfoblock, View view) {
        this.RemoteActionCompatParcelizer = write();
        this.write = readstreaminfoblock;
        this.read = view;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer != null;
    }

    public final void read() {
        IconCompatParcelizer(true);
    }

    public final void RemoteActionCompatParcelizer() {
        IconCompatParcelizer(false);
    }

    private void IconCompatParcelizer(boolean z) {
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            readVar.RemoteActionCompatParcelizer(this.write, this.read, z);
        }
    }

    public final void IconCompatParcelizer() {
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            readVar.write(this.read);
        }
    }

    private static read write() {
        byte b = 0;
        if (Build.VERSION.SDK_INT >= 34) {
            return new IconCompatParcelizer(b);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return new AudioAttributesCompatParcelizer(b);
        }
        return null;
    }

    static class IconCompatParcelizer extends AudioAttributesCompatParcelizer {
        private IconCompatParcelizer() {
            super((byte) 0);
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        @Override // o.FlacStreamMetadata.AudioAttributesCompatParcelizer
        final OnBackInvokedCallback cM_(final readStreamInfoBlock readstreaminfoblock) {
            return new OnBackAnimationCallback() { // from class: o.FlacStreamMetadata.IconCompatParcelizer.4
                @Override // android.window.OnBackAnimationCallback
                public final void onBackStarted(BackEvent backEvent) {
                    if (IconCompatParcelizer.this.read()) {
                        readstreaminfoblock.RemoteActionCompatParcelizer(new AudioAttributesImplApi26Parcelizer(backEvent));
                    }
                }

                @Override // android.window.OnBackAnimationCallback
                public final void onBackProgressed(BackEvent backEvent) {
                    if (IconCompatParcelizer.this.read()) {
                        readstreaminfoblock.write(new AudioAttributesImplApi26Parcelizer(backEvent));
                    }
                }

                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    readstreaminfoblock.AudioAttributesImplApi21Parcelizer();
                }

                @Override // android.window.OnBackAnimationCallback
                public final void onBackCancelled() {
                    if (IconCompatParcelizer.this.read()) {
                        readstreaminfoblock.read();
                    }
                }
            };
        }
    }

    static class AudioAttributesCompatParcelizer implements read {
        private OnBackInvokedCallback IconCompatParcelizer;

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        final boolean read() {
            return this.IconCompatParcelizer != null;
        }

        @Override // o.FlacStreamMetadata.read
        public final void RemoteActionCompatParcelizer(readStreamInfoBlock readstreaminfoblock, View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.IconCompatParcelizer != null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            OnBackInvokedCallback onBackInvokedCallbackCM_ = cM_(readstreaminfoblock);
            this.IconCompatParcelizer = onBackInvokedCallbackCM_;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? PlaybackException.CUSTOM_ERROR_CODE_BASE : 0, onBackInvokedCallbackCM_);
        }

        @Override // o.FlacStreamMetadata.read
        public final void write(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.IconCompatParcelizer);
            this.IconCompatParcelizer = null;
        }

        OnBackInvokedCallback cM_(final readStreamInfoBlock readstreaminfoblock) {
            Objects.requireNonNull(readstreaminfoblock);
            return new OnBackInvokedCallback() { // from class: o.getSeekPoint
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    readstreaminfoblock.AudioAttributesImplApi21Parcelizer();
                }
            };
        }
    }
}
